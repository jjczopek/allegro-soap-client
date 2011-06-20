/**
 * ServiceInfoStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pl.net.yuri.magister.soap;

public class ServiceInfoStruct implements java.io.Serializable {
    private int anItId;

    private int anCatId;

    private java.lang.String anItTitle;

    private byte[] anItBody;

    private int countryId;

    private long anItDate;

    public ServiceInfoStruct() {
    }

    public ServiceInfoStruct(
            int anItId,
            int anCatId,
            java.lang.String anItTitle,
            byte[] anItBody,
            int countryId,
            long anItDate) {
        this.anItId = anItId;
        this.anCatId = anCatId;
        this.anItTitle = anItTitle;
        this.anItBody = anItBody;
        this.countryId = countryId;
        this.anItDate = anItDate;
    }


    /**
     * Gets the anItId value for this ServiceInfoStruct.
     *
     * @return anItId
     */
    public int getAnItId() {
        return anItId;
    }


    /**
     * Sets the anItId value for this ServiceInfoStruct.
     *
     * @param anItId
     */
    public void setAnItId(int anItId) {
        this.anItId = anItId;
    }


    /**
     * Gets the anCatId value for this ServiceInfoStruct.
     *
     * @return anCatId
     */
    public int getAnCatId() {
        return anCatId;
    }


    /**
     * Sets the anCatId value for this ServiceInfoStruct.
     *
     * @param anCatId
     */
    public void setAnCatId(int anCatId) {
        this.anCatId = anCatId;
    }


    /**
     * Gets the anItTitle value for this ServiceInfoStruct.
     *
     * @return anItTitle
     */
    public java.lang.String getAnItTitle() {
        return anItTitle;
    }


    /**
     * Sets the anItTitle value for this ServiceInfoStruct.
     *
     * @param anItTitle
     */
    public void setAnItTitle(java.lang.String anItTitle) {
        this.anItTitle = anItTitle;
    }


    /**
     * Gets the anItBody value for this ServiceInfoStruct.
     *
     * @return anItBody
     */
    public byte[] getAnItBody() {
        return anItBody;
    }


    /**
     * Sets the anItBody value for this ServiceInfoStruct.
     *
     * @param anItBody
     */
    public void setAnItBody(byte[] anItBody) {
        this.anItBody = anItBody;
    }


    /**
     * Gets the countryId value for this ServiceInfoStruct.
     *
     * @return countryId
     */
    public int getCountryId() {
        return countryId;
    }


    /**
     * Sets the countryId value for this ServiceInfoStruct.
     *
     * @param countryId
     */
    public void setCountryId(int countryId) {
        this.countryId = countryId;
    }


    /**
     * Gets the anItDate value for this ServiceInfoStruct.
     *
     * @return anItDate
     */
    public long getAnItDate() {
        return anItDate;
    }


    /**
     * Sets the anItDate value for this ServiceInfoStruct.
     *
     * @param anItDate
     */
    public void setAnItDate(long anItDate) {
        this.anItDate = anItDate;
    }

    private java.lang.Object __equalsCalc = null;

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ServiceInfoStruct)) return false;
        ServiceInfoStruct other = (ServiceInfoStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                this.anItId == other.getAnItId() &&
                this.anCatId == other.getAnCatId() &&
                ((this.anItTitle == null && other.getAnItTitle() == null) ||
                        (this.anItTitle != null &&
                                this.anItTitle.equals(other.getAnItTitle()))) &&
                ((this.anItBody == null && other.getAnItBody() == null) ||
                        (this.anItBody != null &&
                                java.util.Arrays.equals(this.anItBody, other.getAnItBody()))) &&
                this.countryId == other.getCountryId() &&
                this.anItDate == other.getAnItDate();
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
        _hashCode += getAnItId();
        _hashCode += getAnCatId();
        if (getAnItTitle() != null) {
            _hashCode += getAnItTitle().hashCode();
        }
        if (getAnItBody() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getAnItBody());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAnItBody(), i);
                if (obj != null &&
                        !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += getCountryId();
        _hashCode += new Long(getAnItDate()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(ServiceInfoStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:AllegroWebApi", "ServiceInfoStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("anItId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "an-it-id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("anCatId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "an-cat-id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("anItTitle");
        elemField.setXmlName(new javax.xml.namespace.QName("", "an-it-title"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("anItBody");
        elemField.setXmlName(new javax.xml.namespace.QName("", "an-it-body"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countryId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "country-id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("anItDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "an-it-date"));
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
