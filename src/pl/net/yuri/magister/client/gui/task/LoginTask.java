package pl.net.yuri.magister.client.gui.task;

import org.apache.log4j.Logger;
import pl.net.yuri.magister.client.enums.CountryCode;
import pl.net.yuri.magister.soap.AllegroWebApiPortType;
import pl.net.yuri.magister.soap.SysStatusType;
import pl.net.yuri.magister.soap.util.ServiceHolder;
import pl.net.yuri.magister.soap.util.Util;

import javax.swing.*;


public class LoginTask extends SwingWorker<Boolean, Void> {

    private final Logger logger = Logger.getLogger(LoginTask.class.getName());

    private String login;
    private String password;
    private CountryCode countryCode;

    public LoginTask(String login, String password, CountryCode countryCode) {
        this.login = login;
        this.password = password;
        this.countryCode = countryCode;
    }

    @Override
    protected Boolean doInBackground() throws Exception {
        boolean success = false;
        AllegroWebApiPortType port = ServiceHolder.getInstance();
        if (port != null) {
            String encodedPass = Util.encodePassword(password);
            // set country code value for later reference
            Util.setCountryCode(countryCode.getCountryCode());

            // get and cache all components versions
            SysStatusType[] statusTypes = port.doQueryAllSysStatus(countryCode.getCountryCode(), Util.getWebApiKey());

            for (SysStatusType status : statusTypes) {
                Util.addStatusTypeForCountry(status.getCountryId(), status);
            }


            port.doLoginEnc(login, encodedPass, countryCode.getCountryCode(), Util.getWebApiKey(),
                    Util.getStatusTypeForCountry(countryCode.getCountryCode()).getVerKey(),
                    Util.getSessionHolder(), Util.getUserId(), Util.getServerTime());

            logger.info("Zalogowano! Identyfikator sesji: " + Util.getSessionHolder().value);

            success = true;
        } else {
            logger.error("Nie można uzyskać połączenia z WebApi.");
        }
        return success;
    }
}
