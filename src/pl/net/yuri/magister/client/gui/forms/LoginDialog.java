package pl.net.yuri.magister.client.gui.forms;

import pl.net.yuri.magister.client.enums.Actions;
import pl.net.yuri.magister.client.enums.CountryCode;

import javax.swing.*;
import java.awt.event.*;

public class LoginDialog extends JDialog implements ActionListener {
    private JPanel contentPane;
    private JButton buttonLogin;
    private JButton buttonCancel;
    protected JTextField loginField;
    protected JPasswordField passwordField;
    protected JComboBox serviceComboBox;

    private ActionListener listener;

    public void setListener(ActionListener listener) {
        this.listener = listener;
    }

    public LoginDialog() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonLogin);

        buttonLogin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onOK();
            }
        });

        buttonCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //
                onCancel();
            }
        });

// call onCancel() when cross is clicked
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                onCancel();
            }
        });

// call onCancel() on ESCAPE
        contentPane.registerKeyboardAction(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        }, KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);

        serviceComboBox.setModel(new DefaultComboBoxModel(CountryCode.values()));

        pack();
    }

    private void onOK() {
// add your code here
        this.listener.actionPerformed(new ActionEvent(this, 0, Actions.DO_LOGIN.name()));
    }

    private void onCancel() {
// add your code here if necessary
        this.listener.actionPerformed(new ActionEvent(this, 0, Actions.CANCEL_LOGIN.name()));
    }

    public void actionPerformed(ActionEvent e) {
        Actions action = Actions.valueOf(e.getActionCommand());
        switch (action) {
            case LOCK_LOGIN_FORM:
                lockLoginForm(false);
                break;
            case UNLOCK_LOGIN_FORM:
                lockLoginForm(true);
                break;
        }
    }

    private void lockLoginForm(boolean lock) {
        this.buttonCancel.setEnabled(lock);
        this.buttonLogin.setEnabled(lock);
    }
}
