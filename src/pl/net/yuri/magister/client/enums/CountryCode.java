package pl.net.yuri.magister.client.enums;

/**
 * Enumeration containing all Allegro services.
 * Each element contains name of the service and country code.
 * Country codes are actual for the date of 8th of May 2011.
 *
 * @author Jerzy Czopek
 * @version 1.0
 */
public enum CountryCode {
    PL("Allegro.pl", 1),
    BY("Allegro.by", 22),
    BG("Aukro.bg", 34),
    CZ("Aukro.cz", 56),
    HU("TeszVesz.hu", 93),
    KZ("Allegro.kz", 107),
    RO("Aukro.ro", 167),
    RU("Aukro.ru", 168),
    SK("Aukro.sk", 181),
    UA("Aukro.ua", 209),
    RS("Allegro.rs", 222),
    WEBAPI("Testwebapi.pl", 228),
    UA2("Ua.Aukro.ua", 232);


    private int countryCode;
    private String serviceName;
    //private long version;

    CountryCode(String serviceName, int countryCode) {
        this.countryCode = countryCode;
        this.serviceName = serviceName;
    }

    /**
     * Returns country code
     *
     * @return country code
     */
    public int getCountryCode() {
        return countryCode;
    }

    /**
     * Returns service name
     *
     * @return service name
     */
    public String getServiceName() {
        return serviceName;
    }

    @Override
    public String toString() {
        return serviceName;
    }
}
