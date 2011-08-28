/**
 * PharmacyRecipientDataStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pl.net.yuri.magister.soap;

public class PharmacyRecipientDataStruct implements java.io.Serializable {
    private java.lang.String recipientFirstName;

    private java.lang.String recipientLastName;

    private java.lang.String recipientAddress;

    private java.lang.String recipientPostcode;

    private java.lang.String recipientCity;

    public PharmacyRecipientDataStruct() {
    }

    public PharmacyRecipientDataStruct(
            java.lang.String recipientFirstName,
            java.lang.String recipientLastName,
            java.lang.String recipientAddress,
            java.lang.String recipientPostcode,
            java.lang.String recipientCity) {
        this.recipientFirstName = recipientFirstName;
        this.recipientLastName = recipientLastName;
        this.recipientAddress = recipientAddress;
        this.recipientPostcode = recipientPostcode;
        this.recipientCity = recipientCity;
    }


    /**
     * Gets the recipientFirstName value for this PharmacyRecipientDataStruct.
     *
     * @return recipientFirstName
     */
    public java.lang.String getRecipientFirstName() {
        return recipientFirstName;
    }


    /**
     * Sets the recipientFirstName value for this PharmacyRecipientDataStruct.
     *
     * @param recipientFirstName
     */
    public void setRecipientFirstName(java.lang.String recipientFirstName) {
        this.recipientFirstName = recipientFirstName;
    }


    /**
     * Gets the recipientLastName value for this PharmacyRecipientDataStruct.
     *
     * @return recipientLastName
     */
    public java.lang.String getRecipientLastName() {
        return recipientLastName;
    }


    /**
     * Sets the recipientLastName value for this PharmacyRecipientDataStruct.
     *
     * @param recipientLastName
     */
    public void setRecipientLastName(java.lang.String recipientLastName) {
        this.recipientLastName = recipientLastName;
    }


    /**
     * Gets the recipientAddress value for this PharmacyRecipientDataStruct.
     *
     * @return recipientAddress
     */
    public java.lang.String getRecipientAddress() {
        return recipientAddress;
    }


    /**
     * Sets the recipientAddress value for this PharmacyRecipientDataStruct.
     *
     * @param recipientAddress
     */
    public void setRecipientAddress(java.lang.String recipientAddress) {
        this.recipientAddress = recipientAddress;
    }


    /**
     * Gets the recipientPostcode value for this PharmacyRecipientDataStruct.
     *
     * @return recipientPostcode
     */
    public java.lang.String getRecipientPostcode() {
        return recipientPostcode;
    }


    /**
     * Sets the recipientPostcode value for this PharmacyRecipientDataStruct.
     *
     * @param recipientPostcode
     */
    public void setRecipientPostcode(java.lang.String recipientPostcode) {
        this.recipientPostcode = recipientPostcode;
    }


    /**
     * Gets the recipientCity value for this PharmacyRecipientDataStruct.
     *
     * @return recipientCity
     */
    public java.lang.String getRecipientCity() {
        return recipientCity;
    }


    /**
     * Sets the recipientCity value for this PharmacyRecipientDataStruct.
     *
     * @param recipientCity
     */
    public void setRecipientCity(java.lang.String recipientCity) {
        this.recipientCity = recipientCity;
    }

    private java.lang.Object __equalsCalc = null;

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PharmacyRecipientDataStruct)) return false;
        PharmacyRecipientDataStruct other = (PharmacyRecipientDataStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.recipientFirstName == null && other.getRecipientFirstName() == null) ||
                        (this.recipientFirstName != null &&
                                this.recipientFirstName.equals(other.getRecipientFirstName()))) &&
                ((this.recipientLastName == null && other.getRecipientLastName() == null) ||
                        (this.recipientLastName != null &&
                                this.recipientLastName.equals(other.getRecipientLastName()))) &&
                ((this.recipientAddress == null && other.getRecipientAddress() == null) ||
                        (this.recipientAddress != null &&
                                this.recipientAddress.equals(other.getRecipientAddress()))) &&
                ((this.recipientPostcode == null && other.getRecipientPostcode() == null) ||
                        (this.recipientPostcode != null &&
                                this.recipientPostcode.equals(other.getRecipientPostcode()))) &&
                ((this.recipientCity == null && other.getRecipientCity() == null) ||
                        (this.recipientCity != null &&
                                this.recipientCity.equals(other.getRecipientCity())));
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
        if (getRecipientFirstName() != null) {
            _hashCode += getRecipientFirstName().hashCode();
        }
        if (getRecipientLastName() != null) {
            _hashCode += getRecipientLastName().hashCode();
        }
        if (getRecipientAddress() != null) {
            _hashCode += getRecipientAddress().hashCode();
        }
        if (getRecipientPostcode() != null) {
            _hashCode += getRecipientPostcode().hashCode();
        }
        if (getRecipientCity() != null) {
            _hashCode += getRecipientCity().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(PharmacyRecipientDataStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:AllegroWebApi", "PharmacyRecipientDataStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recipientFirstName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "recipient-first-name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recipientLastName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "recipient-last-name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recipientAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("", "recipient-address"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recipientPostcode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "recipient-postcode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recipientCity");
        elemField.setXmlName(new javax.xml.namespace.QName("", "recipient-city"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
