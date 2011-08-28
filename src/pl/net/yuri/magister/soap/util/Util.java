package pl.net.yuri.magister.soap.util;

import org.apache.axis.encoding.Base64;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.OptionBuilder;
import org.apache.commons.cli.Options;
import pl.net.yuri.magister.soap.SysStatusType;

import javax.swing.*;
import javax.swing.table.TableColumn;
import javax.xml.rpc.holders.LongHolder;
import javax.xml.rpc.holders.StringHolder;
import java.awt.*;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;

/**
 * Utility class used for caching information needed during application runtime, like:
 * <ul>
 * <li>Allegro Web API session identifier</li>
 * <li>Allegro Web API server time</li>
 * <li>Allegro Web API user identifier</li>
 * <li>Allegro Web API country code</li>
 * <li>Allegro Web API component versions</li>
 * <li>Allegro Web API key</li>
 * </ul>
 * Contains also utility methods for various tasks, like:
 * <ul>
 * <li>Encoding password for Allegro Web API</li>
 * <li>Resizing table columns</li>
 * <li>Getting information on command line parameters</li>
 * <li>Centering frames and dialogs on screen</li>
 * </ul>
 *
 * @author Jerzy Czopek
 * @version 1.0
 */
public class Util {

    private static StringHolder sessionHolder = new StringHolder();
    private static LongHolder serverTime = new LongHolder();
    private static LongHolder userId = new LongHolder();
    private static int countryCode = 228;
    private static HashMap<Integer, SysStatusType> statuses = new HashMap<Integer, SysStatusType>();
    private static String webApiKey = "";

    /**
     * Gets Allegro Web API key
     *
     * @return web api key
     */
    public static String getWebApiKey() {
        return webApiKey;
    }

    /**
     * Sets Allegro Web API key for later usage
     *
     * @param webApiKey web api key
     */
    public static void setWebApiKey(String webApiKey) {
        Util.webApiKey = webApiKey;
    }

    /**
     * Puts given status for given country into cache for later use.
     *
     * @param countryCode country code which status is added to cache
     * @param status      status object with all component version for given country
     */
    public static void addStatusTypeForCountry(int countryCode, SysStatusType status) {
        statuses.put(countryCode, status);
    }

    /**
     * Returns SysStatusType from cache for given country. Returned object contains component versions
     * of Allegro Web API for given country.
     *
     * @param countryCode country code
     * @return proper SysStatusType if country present in cache, null otherwise
     */
    public static SysStatusType getStatusTypeForCountry(int countryCode) {
        return statuses.get(countryCode);
    }

    /**
     * Returns session identifier
     *
     * @return holder with session identifier
     */
    public static StringHolder getSessionHolder() {
        return sessionHolder;
    }

    /**
     * Returns server time
     *
     * @return holder with session identifier
     */
    public static LongHolder getServerTime() {
        return serverTime;
    }

    /**
     * Returns user id
     *
     * @return holder with user id
     */
    public static LongHolder getUserId() {
        return userId;
    }

    /**
     * Encodes user password into form accepted by Allegro WebAPI
     *
     * @param passwordToEncode user password to be encoded
     * @return encoded password; null if password could not be encoded
     */
    public static String encodePassword(String passwordToEncode) {
        if (passwordToEncode == null) return null;

        String result = null;

        try {
            MessageDigest shaInstance = MessageDigest.getInstance("SHA-256");
            byte[] shaPassword = shaInstance.digest(passwordToEncode.getBytes("UTF-8"));
            result = Base64.encode(shaPassword);
        } catch (NoSuchAlgorithmException e) {
            System.err.println("No SHA-256 algorithm available in your environment");
        } catch (UnsupportedEncodingException e) {
            System.err.println("No UTF-8 encoding available in your environment");
        }

        return result;
    }

    /**
     * Gets country code
     *
     * @return stored country code
     */
    public static int getCountryCode() {
        return countryCode;
    }

    /**
     * Sets country code
     *
     * @param countryCode country code to store
     */
    public static void setCountryCode(int countryCode) {
        Util.countryCode = countryCode;
    }

    /**
     * Resize columns of given table. New column widths are passed in array od doubles, which represent
     * new column width in percentages, where 0.0 is 0% and 1.0 is 100% of total table width.
     *
     * @param table       which table columns resize
     * @param percentages new widths of columns in percentages
     * @throws Error if table column count is different than element count in percentages array
     */
    public static void setPreferredTableColumnWidths(JTable table, double[] percentages) {
        if (table.getColumnModel().getColumnCount() != percentages.length)
            throw new Error("Column count is different than percentages array length");

        Dimension tableDimension = table.getSize();

        double total = 0;
        for (double percent : percentages) {
            total += percent;
        }

        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);

        for (int columnIndex = 0; columnIndex < table.getColumnModel().getColumnCount(); columnIndex++) {
            TableColumn column = table.getColumnModel().getColumn(columnIndex);
            int columnWidth = (int) (tableDimension.width * (percentages[columnIndex] / total));
            column.setPreferredWidth(columnWidth);
            column.setMinWidth(columnWidth);
        }
    }

    /**
     * Returns options available as command line arguments. They are used to parse command line arguments
     * and display help.
     *
     * @return command line options arguments
     */
    public static Options getCommandLineParameters() {
        Options options = new Options();

        Option webApiKeyOption = OptionBuilder.withArgName("key").hasArg().withDescription("Allegro Web API key").create("webapikey");
        Option aboutOption = new Option("about", "About this application");

        options.addOption(webApiKeyOption);
        options.addOption(aboutOption);

        return options;
    }

    /**
     * Centers given frame on the screen
     *
     * @param frame frame to center
     */
    public static void centerFrame(JFrame frame) {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension size = frame.getSize();
        screenSize.height = screenSize.height / 2;
        screenSize.width = screenSize.width / 2;
        size.height = size.height / 2;
        size.width = size.width / 2;
        int y = screenSize.height - size.height;
        int x = screenSize.width - size.width;
        frame.setLocation(x, y);
    }

    /**
     * Centers given dialog on the screen
     *
     * @param dialog dialog to center
     */
    public static void centerDialog(JDialog dialog) {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension size = dialog.getSize();
        screenSize.height = screenSize.height / 2;
        screenSize.width = screenSize.width / 2;
        size.height = size.height / 2;
        size.width = size.width / 2;
        int y = screenSize.height - size.height;
        int x = screenSize.width - size.width;
        dialog.setLocation(x, y);
    }

    private Util() {
        // utility class - prevent from instantiation
    }
}
