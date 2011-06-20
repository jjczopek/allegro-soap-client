/**
 * SiteFlagInfoType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pl.net.yuri.magister.soap;

public class SiteFlagInfoType implements java.io.Serializable {
    private java.lang.String siteName;

    private java.lang.String siteUrl;

    private int siteCountryCode;

    private java.lang.String siteCodePage;

    private byte[] siteLogoGif;

    private byte[] siteFlagGif;

    public SiteFlagInfoType() {
    }

    public SiteFlagInfoType(
            java.lang.String siteName,
            java.lang.String siteUrl,
            int siteCountryCode,
            java.lang.String siteCodePage,
            byte[] siteLogoGif,
            byte[] siteFlagGif) {
        this.siteName = siteName;
        this.siteUrl = siteUrl;
        this.siteCountryCode = siteCountryCode;
        this.siteCodePage = siteCodePage;
        this.siteLogoGif = siteLogoGif;
        this.siteFlagGif = siteFlagGif;
    }


    /**
     * Gets the siteName value for this SiteFlagInfoType.
     *
     * @return siteName
     */
    public java.lang.String getSiteName() {
        return siteName;
    }


    /**
     * Sets the siteName value for this SiteFlagInfoType.
     *
     * @param siteName
     */
    public void setSiteName(java.lang.String siteName) {
        this.siteName = siteName;
    }


    /**
     * Gets the siteUrl value for this SiteFlagInfoType.
     *
     * @return siteUrl
     */
    public java.lang.String getSiteUrl() {
        return siteUrl;
    }


    /**
     * Sets the siteUrl value for this SiteFlagInfoType.
     *
     * @param siteUrl
     */
    public void setSiteUrl(java.lang.String siteUrl) {
        this.siteUrl = siteUrl;
    }


    /**
     * Gets the siteCountryCode value for this SiteFlagInfoType.
     *
     * @return siteCountryCode
     */
    public int getSiteCountryCode() {
        return siteCountryCode;
    }


    /**
     * Sets the siteCountryCode value for this SiteFlagInfoType.
     *
     * @param siteCountryCode
     */
    public void setSiteCountryCode(int siteCountryCode) {
        this.siteCountryCode = siteCountryCode;
    }


    /**
     * Gets the siteCodePage value for this SiteFlagInfoType.
     *
     * @return siteCodePage
     */
    public java.lang.String getSiteCodePage() {
        return siteCodePage;
    }


    /**
     * Sets the siteCodePage value for this SiteFlagInfoType.
     *
     * @param siteCodePage
     */
    public void setSiteCodePage(java.lang.String siteCodePage) {
        this.siteCodePage = siteCodePage;
    }


    /**
     * Gets the siteLogoGif value for this SiteFlagInfoType.
     *
     * @return siteLogoGif
     */
    public byte[] getSiteLogoGif() {
        return siteLogoGif;
    }


    /**
     * Sets the siteLogoGif value for this SiteFlagInfoType.
     *
     * @param siteLogoGif
     */
    public void setSiteLogoGif(byte[] siteLogoGif) {
        this.siteLogoGif = siteLogoGif;
    }


    /**
     * Gets the siteFlagGif value for this SiteFlagInfoType.
     *
     * @return siteFlagGif
     */
    public byte[] getSiteFlagGif() {
        return siteFlagGif;
    }


    /**
     * Sets the siteFlagGif value for this SiteFlagInfoType.
     *
     * @param siteFlagGif
     */
    public void setSiteFlagGif(byte[] siteFlagGif) {
        this.siteFlagGif = siteFlagGif;
    }

    private java.lang.Object __equalsCalc = null;

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SiteFlagInfoType)) return false;
        SiteFlagInfoType other = (SiteFlagInfoType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.siteName == null && other.getSiteName() == null) ||
                        (this.siteName != null &&
                                this.siteName.equals(other.getSiteName()))) &&
                ((this.siteUrl == null && other.getSiteUrl() == null) ||
                        (this.siteUrl != null &&
                                this.siteUrl.equals(other.getSiteUrl()))) &&
                this.siteCountryCode == other.getSiteCountryCode() &&
                ((this.siteCodePage == null && other.getSiteCodePage() == null) ||
                        (this.siteCodePage != null &&
                                this.siteCodePage.equals(other.getSiteCodePage()))) &&
                ((this.siteLogoGif == null && other.getSiteLogoGif() == null) ||
                        (this.siteLogoGif != null &&
                                java.util.Arrays.equals(this.siteLogoGif, other.getSiteLogoGif()))) &&
                ((this.siteFlagGif == null && other.getSiteFlagGif() == null) ||
                        (this.siteFlagGif != null &&
                                java.util.Arrays.equals(this.siteFlagGif, other.getSiteFlagGif())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;

    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getSiteName() != null) {
            _hashCode += getSiteName().hashCode();
        }
        if (getSiteUrl() != null) {
            _hashCode += getSiteUrl().hashCode();
        }
        _hashCode += getSiteCountryCode();
        if (getSiteCodePage() != null) {
            _hashCode += getSiteCodePage().hashCode();
        }
        if (getSiteLogoGif() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getSiteLogoGif());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSiteLogoGif(), i);
                if (obj != null &&
                        !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSiteFlagGif() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getSiteFlagGif());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSiteFlagGif(), i);
                if (obj != null &&
                        !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(SiteFlagInfoType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:AllegroWebApi", "SiteFlagInfoType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("siteName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "site-name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("siteUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("", "site-url"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("siteCountryCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "site-country-code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("siteCodePage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "site-code-page"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("siteLogoGif");
        elemField.setXmlName(new javax.xml.namespace.QName("", "site-logo-gif"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("siteFlagGif");
        elemField.setXmlName(new javax.xml.namespace.QName("", "site-flag-gif"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
            java.lang.String mechType,
            java.lang.Class _javaType,
            javax.xml.namespace.QName _xmlType) {
        return
                new org.apache.axis.encoding.ser.BeanSerializer(
                        _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
            java.lang.String mechType,
            java.lang.Class _javaType,
            javax.xml.namespace.QName _xmlType) {
        return
                new org.apache.axis.encoding.ser.BeanDeserializer(
                        _javaType, _xmlType, typeDesc);
    }

}
