package pl.net.yuri.magister.soap.util;

import pl.net.yuri.magister.soap.AllegroWebApiPortType;
import pl.net.yuri.magister.soap.AllegroWebApiService;
import pl.net.yuri.magister.soap.AllegroWebApiServiceLocator;

import javax.xml.rpc.ServiceException;

/**
 * Utility class which holds an instance of AllegroWebApi service port.
 *
 * @author Jerzy Czopek
 * @version 1.0
 */
public class ServiceHolder {

    private static AllegroWebApiPortType portInstance;

    /**
     * Returns Allegro WebApi Port, or null if there is
     * no instance and connection to service could not be obtained.
     *
     * @return service port or null if service is unavailable
     */
    public static AllegroWebApiPortType getInstance() {
        if (portInstance == null) {
            AllegroWebApiService service = new AllegroWebApiServiceLocator();
            try {
                portInstance = service.getAllegroWebApiPort();
            } catch (ServiceException e) {
                e.printStackTrace();
            }
        }
        return portInstance;
    }

}
