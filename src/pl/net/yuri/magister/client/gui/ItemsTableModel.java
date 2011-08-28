package pl.net.yuri.magister.client.gui;

import pl.net.yuri.magister.soap.SearchResponseType;

import javax.swing.table.AbstractTableModel;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Table model for items read from Allegro Web API
 *
 * @author Jerzy Czopek
 * @version 1.0
 */
public class ItemsTableModel extends AbstractTableModel {
    private static final String[] COLUMN_NAMES = {"ID", "Tytuł", "Cena", "Kup Teraz?", "Cena Kup Teraz", "Koniec"};
    private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");

    /**
     * Array of preferred column widths for items table.
     * Each index contains width of corresponding column in % of total table width
     * 0 is 0% and 1.0 is 100% of table width
     */
    public static final double[] PREFERRED_COLUMN_WIDTHS = {.1, .5, .1, .05, .1, .15};

    private List<SearchResponseType> dataList;

    /**
     * Creates new instance of ItemsTableModel with empty array list
     */
    public ItemsTableModel() {
        super();
        this.dataList = new ArrayList<SearchResponseType>();
    }

    /**
     * Creates new instance of ItemsTableModel with initial data passed as argument
     *
     * @param dataList initial data
     * @throws NullPointerException when list passed as argument is null
     */
    public ItemsTableModel(List<SearchResponseType> dataList) {
        if (dataList == null) throw new NullPointerException("Data list can not be null.");
        this.dataList = dataList;
    }

    /**
     * Sets new data for table model and notfies table about the change
     * so it can redraw.
     *
     * @param dataList data list to be set.
     * @throws NullPointerException when list passed as argument is null
     */
    public void setDataList(List<SearchResponseType> dataList) {
        if (dataList == null) throw new NullPointerException("Data list can not be null.");
        this.dataList = dataList;
        fireTableDataChanged();
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        switch (columnIndex) {
            case 0:
                return Long.class;
            case 1:
            case 5:
                return String.class;
            case 2:
            case 4:
                return Float.class;
            case 3:
                return Boolean.class;
            default:
                return Object.class;
        }
    }

    public int getRowCount() {
        return this.dataList.size();
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        /*

        columnIndex     fieldName                   fieldType
        =======================================================
            0           s-it-id                     long
            1           s-it-name                   String
            2           s-it-price                  float
            3           s-it-is-buy-now             boolean
            4           s-it-buy-now-price          float
            5           s-it-ending-time            String

         */

        SearchResponseType rowValue = this.dataList.get(rowIndex);

        switch (columnIndex) {
            case 0:
                return rowValue.getSItId();
            case 1:
                return rowValue.getSItName();
            case 2:
                return rowValue.getSItPrice();
            case 3:
                return rowValue.getSItIsBuyNow() == 1;
            case 4:
                return rowValue.getSItBuyNowPrice();
            case 5:
                /*
                Server time is UNIX-timestamp (seconds), Date() needs timestamp in milliseconds
                 */
                return ItemsTableModel.DATE_FORMAT.format(new Date(rowValue.getSItEndingTime() * 1000l));
        }

        return null;
    }

    public int getColumnCount() {
        return ItemsTableModel.COLUMN_NAMES.length;
    }

    @Override
    public String getColumnName(int column) {
        return ItemsTableModel.COLUMN_NAMES[column];
    }
}
