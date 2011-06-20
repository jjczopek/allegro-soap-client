/**
 * SiteInfoType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pl.net.yuri.magister.soap;

public class SiteInfoType implements java.io.Serializable {
    private java.lang.String siteName;

    private java.lang.String siteUrl;

    private int siteCountryCode;

    private java.lang.String siteCodePage;

    private byte[] siteLogoGif;

    public SiteInfoType() {
    }

    public SiteInfoType(
            java.lang.String siteName,
            java.lang.String siteUrl,
            int siteCountryCode,
            java.lang.String siteCodePage,
            byte[] siteLogoGif) {
        this.siteName = siteName;
        this.siteUrl = siteUrl;
        this.siteCountryCode = siteCountryCode;
        this.siteCodePage = siteCodePage;
        this.siteLogoGif = siteLogoGif;
    }


    /**
     * Gets the siteName value for this SiteInfoType.
     *
     * @return siteName
     */
    public java.lang.String getSiteName() {
        return siteName;
    }


    /**
     * Sets the siteName value for this SiteInfoType.
     *
     * @param siteName
     */
    public void setSiteName(java.lang.String siteName) {
        this.siteName = siteName;
    }


    /**
     * Gets the siteUrl value for this SiteInfoType.
     *
     * @return siteUrl
     */
    public java.lang.String getSiteUrl() {
        return siteUrl;
    }


    /**
     * Sets the siteUrl value for this SiteInfoType.
     *
     * @param siteUrl
     */
    public void setSiteUrl(java.lang.String siteUrl) {
        this.siteUrl = siteUrl;
    }


    /**
     * Gets the siteCountryCode value for this SiteInfoType.
     *
     * @return siteCountryCode
     */
    public int getSiteCountryCode() {
        return siteCountryCode;
    }


    /**
     * Sets the siteCountryCode value for this SiteInfoType.
     *
     * @param siteCountryCode
     */
    public void setSiteCountryCode(int siteCountryCode) {
        this.siteCountryCode = siteCountryCode;
    }


    /**
     * Gets the siteCodePage value for this SiteInfoType.
     *
     * @return siteCodePage
     */
    public java.lang.String getSiteCodePage() {
        return siteCodePage;
    }


    /**
     * Sets the siteCodePage value for this SiteInfoType.
     *
     * @param siteCodePage
     */
    public void setSiteCodePage(java.lang.String siteCodePage) {
        this.siteCodePage = siteCodePage;
    }


    /**
     * Gets the siteLogoGif value for this SiteInfoType.
     *
     * @return siteLogoGif
     */
    public byte[] getSiteLogoGif() {
        return siteLogoGif;
    }


    /**
     * Sets the siteLogoGif value for this SiteInfoType.
     *
     * @param siteLogoGif
     */
    public void setSiteLogoGif(byte[] siteLogoGif) {
        this.siteLogoGif = siteLogoGif;
    }

    private java.lang.Object __equalsCalc = null;

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SiteInfoType)) return false;
        SiteInfoType other = (SiteInfoType) obj;
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
                                java.util.Arrays.equals(this.siteLogoGif, other.getSiteLogoGif())));
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(SiteInfoType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:AllegroWebApi", "SiteInfoType"));
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
