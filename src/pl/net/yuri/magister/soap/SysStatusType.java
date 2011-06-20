/**
 * SysStatusType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pl.net.yuri.magister.soap;

public class SysStatusType implements java.io.Serializable {
    private int countryId;

    private java.lang.String programVersion;

    private java.lang.String catsVersion;

    private java.lang.String apiVersion;

    private java.lang.String attribVersion;

    private java.lang.String formSellVersion;

    private java.lang.String siteVersion;

    private long verKey;

    public SysStatusType() {
    }

    public SysStatusType(
            int countryId,
            java.lang.String programVersion,
            java.lang.String catsVersion,
            java.lang.String apiVersion,
            java.lang.String attribVersion,
            java.lang.String formSellVersion,
            java.lang.String siteVersion,
            long verKey) {
        this.countryId = countryId;
        this.programVersion = programVersion;
        this.catsVersion = catsVersion;
        this.apiVersion = apiVersion;
        this.attribVersion = attribVersion;
        this.formSellVersion = formSellVersion;
        this.siteVersion = siteVersion;
        this.verKey = verKey;
    }


    /**
     * Gets the countryId value for this SysStatusType.
     *
     * @return countryId
     */
    public int getCountryId() {
        return countryId;
    }


    /**
     * Sets the countryId value for this SysStatusType.
     *
     * @param countryId
     */
    public void setCountryId(int countryId) {
        this.countryId = countryId;
    }


    /**
     * Gets the programVersion value for this SysStatusType.
     *
     * @return programVersion
     */
    public java.lang.String getProgramVersion() {
        return programVersion;
    }


    /**
     * Sets the programVersion value for this SysStatusType.
     *
     * @param programVersion
     */
    public void setProgramVersion(java.lang.String programVersion) {
        this.programVersion = programVersion;
    }


    /**
     * Gets the catsVersion value for this SysStatusType.
     *
     * @return catsVersion
     */
    public java.lang.String getCatsVersion() {
        return catsVersion;
    }


    /**
     * Sets the catsVersion value for this SysStatusType.
     *
     * @param catsVersion
     */
    public void setCatsVersion(java.lang.String catsVersion) {
        this.catsVersion = catsVersion;
    }


    /**
     * Gets the apiVersion value for this SysStatusType.
     *
     * @return apiVersion
     */
    public java.lang.String getApiVersion() {
        return apiVersion;
    }


    /**
     * Sets the apiVersion value for this SysStatusType.
     *
     * @param apiVersion
     */
    public void setApiVersion(java.lang.String apiVersion) {
        this.apiVersion = apiVersion;
    }


    /**
     * Gets the attribVersion value for this SysStatusType.
     *
     * @return attribVersion
     */
    public java.lang.String getAttribVersion() {
        return attribVersion;
    }


    /**
     * Sets the attribVersion value for this SysStatusType.
     *
     * @param attribVersion
     */
    public void setAttribVersion(java.lang.String attribVersion) {
        this.attribVersion = attribVersion;
    }


    /**
     * Gets the formSellVersion value for this SysStatusType.
     *
     * @return formSellVersion
     */
    public java.lang.String getFormSellVersion() {
        return formSellVersion;
    }


    /**
     * Sets the formSellVersion value for this SysStatusType.
     *
     * @param formSellVersion
     */
    public void setFormSellVersion(java.lang.String formSellVersion) {
        this.formSellVersion = formSellVersion;
    }


    /**
     * Gets the siteVersion value for this SysStatusType.
     *
     * @return siteVersion
     */
    public java.lang.String getSiteVersion() {
        return siteVersion;
    }


    /**
     * Sets the siteVersion value for this SysStatusType.
     *
     * @param siteVersion
     */
    public void setSiteVersion(java.lang.String siteVersion) {
        this.siteVersion = siteVersion;
    }


    /**
     * Gets the verKey value for this SysStatusType.
     *
     * @return verKey
     */
    public long getVerKey() {
        return verKey;
    }


    /**
     * Sets the verKey value for this SysStatusType.
     *
     * @param verKey
     */
    public void setVerKey(long verKey) {
        this.verKey = verKey;
    }

    private java.lang.Object __equalsCalc = null;

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SysStatusType)) return false;
        SysStatusType other = (SysStatusType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                this.countryId == other.getCountryId() &&
                ((this.programVersion == null && other.getProgramVersion() == null) ||
                        (this.programVersion != null &&
                                this.programVersion.equals(other.getProgramVersion()))) &&
                ((this.catsVersion == null && other.getCatsVersion() == null) ||
                        (this.catsVersion != null &&
                                this.catsVersion.equals(other.getCatsVersion()))) &&
                ((this.apiVersion == null && other.getApiVersion() == null) ||
                        (this.apiVersion != null &&
                                this.apiVersion.equals(other.getApiVersion()))) &&
                ((this.attribVersion == null && other.getAttribVersion() == null) ||
                        (this.attribVersion != null &&
                                this.attribVersion.equals(other.getAttribVersion()))) &&
                ((this.formSellVersion == null && other.getFormSellVersion() == null) ||
                        (this.formSellVersion != null &&
                                this.formSellVersion.equals(other.getFormSellVersion()))) &&
                ((this.siteVersion == null && other.getSiteVersion() == null) ||
                        (this.siteVersion != null &&
                                this.siteVersion.equals(other.getSiteVersion()))) &&
                this.verKey == other.getVerKey();
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
        _hashCode += getCountryId();
        if (getProgramVersion() != null) {
            _hashCode += getProgramVersion().hashCode();
        }
        if (getCatsVersion() != null) {
            _hashCode += getCatsVersion().hashCode();
        }
        if (getApiVersion() != null) {
            _hashCode += getApiVersion().hashCode();
        }
        if (getAttribVersion() != null) {
            _hashCode += getAttribVersion().hashCode();
        }
        if (getFormSellVersion() != null) {
            _hashCode += getFormSellVersion().hashCode();
        }
        if (getSiteVersion() != null) {
            _hashCode += getSiteVersion().hashCode();
        }
        _hashCode += new Long(getVerKey()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(SysStatusType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:AllegroWebApi", "SysStatusType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countryId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "country-id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("programVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "program-version"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("catsVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cats-version"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("apiVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "api-version"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attribVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "attrib-version"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("formSellVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "form-sell-version"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("siteVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "site-version"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("verKey");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ver-key"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
