package pl.net.yuri.magister.client.gui.forms;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.GnuParser;
import org.apache.commons.cli.ParseException;
import org.apache.log4j.Logger;
import pl.net.yuri.magister.client.enums.Actions;
import pl.net.yuri.magister.client.enums.CountryCode;
import pl.net.yuri.magister.client.gui.ItemsTableModel;
import pl.net.yuri.magister.client.gui.log.TextAreaAppender;
import pl.net.yuri.magister.client.gui.task.CategoryInfoTypeHolder;
import pl.net.yuri.magister.client.gui.task.ListCategoryItemsTask;
import pl.net.yuri.magister.client.gui.task.LoadCategoriesTreeTask;
import pl.net.yuri.magister.client.gui.task.LoginTask;
import pl.net.yuri.magister.soap.SearchResponseType;
import pl.net.yuri.magister.soap.util.Util;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeModel;
import javax.swing.tree.TreeSelectionModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.List;

/**
 * Main application form with whole GUI logic.
 *
 * @author Jerzy Czopek
 * @version 1.0
 */
public class MainForm {

    private final Logger LOG = Logger.getLogger(MainForm.class);

    protected JPanel mainPanel;
    protected JTextArea logTextArea;
    protected JTree categoriesTree;
    protected JTable itemsTable;
    protected JProgressBar progressBar;
    protected JButton loginButton;
    protected JButton loadCategoriesButton;
    protected JButton getItemsButton;

    /**
     * Creates new instance of of MainForm.
     * All GUI logic is configured here. The most important is configurationof text area where application log events.
     * It is required that log4j library is configured with an appender which is an instance of
     * <code>pl.net.yuri.magister.client.gui.log.TextAreaAppender</code> and it's name is <code>TEXTAREA</code>.
     */
    public MainForm() {

        TextAreaAppender textAreaAppender = (TextAreaAppender) Logger.getRootLogger().getAppender("TEXTAREA");
        textAreaAppender.setTextArea(logTextArea);
        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                displayLoginForm();
            }
        });
        loadCategoriesButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                loadCategories();
            }
        });

        itemsTable.setModel(new ItemsTableModel());
        categoriesTree.setRootVisible(false);
        categoriesTree.setModel(new DefaultTreeModel(new DefaultMutableTreeNode()));
        categoriesTree.getSelectionModel().setSelectionMode(TreeSelectionModel.SINGLE_TREE_SELECTION);


        getItemsButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                getSelectedCategoryItems();
            }
        });
    }

    /**
     * Helper method for retrieval items from category selected in categories tree.
     * Items are retrieved by background task which is an instance of <code>pl.net.yuri.magister.client.gui.task.ListCategoryItemsTask</code>.
     * Method registers <code>PropertyChangeListener</code> for <code>ListCategoryItemsTask</code> listening for state change of this task.
     * When task is finished, retrieved items are put into table.
     */
    private void getSelectedCategoryItems() {
        DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) categoriesTree.getLastSelectedPathComponent();

        if (selectedNode != null) {

            /*
            20.06.2011 - changed CatInfoType to wrapper type of CategoryInfoHolder (actual user object type in tree nodes)
             */
            //CatInfoType selectedCategory = (CatInfoType) selectedNode.getUserObject();
            CategoryInfoTypeHolder selectedCategory = (CategoryInfoTypeHolder) selectedNode.getUserObject();
            /*
            Create instance ListCategoryItemsTask and register PropertyChangeListener to listen for
            task's State property change.
             */
            final ListCategoryItemsTask listCategoryItemsTask = new ListCategoryItemsTask(selectedCategory.getCategoryId());
            listCategoryItemsTask.addPropertyChangeListener(new PropertyChangeListener() {
                public void propertyChange(PropertyChangeEvent evt) {

                    if ("state".equalsIgnoreCase(evt.getPropertyName())) {
                        SwingWorker.StateValue newState = (SwingWorker.StateValue) evt.getNewValue();
                        if (newState == SwingWorker.StateValue.DONE) {
                            List<SearchResponseType> items = null;
                            try {
                                items = listCategoryItemsTask.get();

                                ItemsTableModel itm = (ItemsTableModel) itemsTable.getModel();
                                itm.setDataList(items);

                            } catch (Exception e) {
                                LOG.error("Nie udało się pobrać przedmiotów.", e);
                            } finally {
                                getItemsButton.setEnabled(true);
                            }

                        }
                    }
                }
            });
            listCategoryItemsTask.execute();

        } else {
            getItemsButton.setEnabled(true);
        }
    }

    /**
     * Helper method for loading categories tree from Allegro.
     * Categories are retrieved in background by instance of <code>pl.net.yuri.magister.client.gui.task.LoadCategoriesTreeTask</code>.
     * PropertyChangeListener is registered with task instance, which updates progress bar and populates categories tree when
     * loading is complete.
     */
    private void loadCategories() {
        final LoadCategoriesTreeTask loadCategoriesTreeTask = new LoadCategoriesTreeTask();
        loadCategoriesTreeTask.addPropertyChangeListener(new PropertyChangeListener() {
            public void propertyChange(PropertyChangeEvent evt) {
                /*
                Update progress bar when task progress changes
                 */
                if ("progress".equalsIgnoreCase(evt.getPropertyName())) {
                    int progress = (Integer) evt.getNewValue();
                    progressBar.setValue(progress);
                }
                /*
                If task is finished, try to populate categories tree model
                 */
                if ("state".equalsIgnoreCase(evt.getPropertyName())) {
                    SwingWorker.StateValue newState = (SwingWorker.StateValue) evt.getNewValue();
                    if (newState == SwingWorker.StateValue.DONE) {
                        TreeModel model = null;
                        try {
                            model = loadCategoriesTreeTask.get();
                            populateCategoriesTreeModel(model);
                        } catch (Exception e) {
                            LOG.error(e.getMessage());
                        }

                    }
                }
            }
        });
        loadCategoriesTreeTask.execute();
    }

    /**
     * Helper method which populates tree model created by categories loading task.
     * If there is no model model is not set. If model is present - it is set as new categories tree model,
     * login form is hidden and categories tree is made visible.
     *
     * @param model TreeModel with categories to populate
     */
    private void populateCategoriesTreeModel(TreeModel model) {
        if (model != null) {
            categoriesTree.setModel(model);
            Util.setPreferredTableColumnWidths(itemsTable, ItemsTableModel.PREFERRED_COLUMN_WIDTHS);
        } else {
            LOG.error("Categories tree is not valid");
        }
    }

    /**
     * Helper method for displaying login form. ActionListener is registered with login dialog.
     * It listens for actions of login dialog, especially clicking login button.
     * When login button is clicked, instance of <code>pl.net.yuri.magister.client.gui.task.LoginTask</code>
     * tries to perform login to Allegro Web API with supplied arguments. If login is successful,
     * login dialog is disposed and user can interact with whole application. If login is unsuccessful,
     * error is logged to log area and login dialog is not disposed, allowing for further login attempts.
     */
    private void displayLoginForm() {
        final LoginDialog loginDialog = new LoginDialog();
        loginDialog.setTitle("Logowanie");
        loginDialog.setListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Actions action = Actions.valueOf(e.getActionCommand());
                switch (action) {
                    /*
                    Login button clicked
                     */
                    case DO_LOGIN:
                        final LoginTask loginTask = new LoginTask(
                                loginDialog.loginField.getText(),
                                new String(loginDialog.passwordField.getPassword()),
                                (CountryCode) loginDialog.serviceComboBox.getSelectedItem()
                        );

                        /*
                        PropertyChangeListener listening for state change.
                         */
                        loginTask.addPropertyChangeListener(new PropertyChangeListener() {
                            public void propertyChange(PropertyChangeEvent evt) {
                                if ("state".equalsIgnoreCase(evt.getPropertyName())) {
                                    SwingWorker.StateValue newState = (SwingWorker.StateValue) evt.getNewValue();
                                    if (newState == SwingWorker.StateValue.DONE) {
                                        boolean isLoginSuccessful = false;
                                        try {
                                            isLoginSuccessful = loginTask.get();
                                        } catch (Exception e) {
                                            LOG.error(e.getMessage());
                                        }

                                        if (isLoginSuccessful) {
                                            loginDialog.dispose();
                                            loadCategoriesButton.setEnabled(true);
                                        } else {
                                            /*
                                            Don't dispose login dialog
                                             */
                                            loginDialog.actionPerformed(new ActionEvent(
                                                    this, 0, Actions.UNLOCK_LOGIN_FORM.name()
                                            ));
                                        }
                                    }
                                }
                            }
                        });
                        /*
                        Lock login dialog
                         */
                        loginDialog.actionPerformed(new ActionEvent(
                                this, 0, Actions.LOCK_LOGIN_FORM.name()
                        ));
                        loginTask.execute();
                        break;

                    case CANCEL_LOGIN:
                        LOG.info("Login canceled.");
                        loginDialog.dispose();
                        break;
                }
            }
        });
        Util.centerDialog(loginDialog);
        loginDialog.setVisible(true);
    }

    public static void main(String[] args) {

        /*
        Parse command line arguments
         */
        CommandLineParser cliParser = new GnuParser();
        try {
            CommandLine cli = cliParser.parse(Util.getCommandLineParameters(), args);
            if (cli.hasOption("about")) {
                // display about dialog
                AboutDialog dialog = new AboutDialog();
                dialog.setTitle("O programie");
                dialog.pack();
                Util.centerDialog(dialog);
                dialog.setVisible(true);
                System.exit(0);
            } else {
                Util.setWebApiKey(cli.getOptionValue("webapikey", "f16cc31872"));
                JFrame frame = new JFrame("Allegro Web Client 1.0");
                frame.setContentPane(new MainForm().mainPanel);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack();
                Util.centerFrame(frame);
                frame.setVisible(true);
            }

        } catch (ParseException e) {
            System.err.println("Error: " + e.getMessage());
        }


    }


}
