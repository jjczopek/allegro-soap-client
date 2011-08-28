/**
 * ItemsNotAddedStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pl.net.yuri.magister.soap;

public class ItemsNotAddedStruct implements java.io.Serializable {
    private long itemId;

    private java.lang.String itemErrorCode;

    private java.lang.String itemErrorDescription;

    public ItemsNotAddedStruct() {
    }

    public ItemsNotAddedStruct(
            long itemId,
            java.lang.String itemErrorCode,
            java.lang.String itemErrorDescription) {
        this.itemId = itemId;
        this.itemErrorCode = itemErrorCode;
        this.itemErrorDescription = itemErrorDescription;
    }


    /**
     * Gets the itemId value for this ItemsNotAddedStruct.
     *
     * @return itemId
     */
    public long getItemId() {
        return itemId;
    }


    /**
     * Sets the itemId value for this ItemsNotAddedStruct.
     *
     * @param itemId
     */
    public void setItemId(long itemId) {
        this.itemId = itemId;
    }


    /**
     * Gets the itemErrorCode value for this ItemsNotAddedStruct.
     *
     * @return itemErrorCode
     */
    public java.lang.String getItemErrorCode() {
        return itemErrorCode;
    }


    /**
     * Sets the itemErrorCode value for this ItemsNotAddedStruct.
     *
     * @param itemErrorCode
     */
    public void setItemErrorCode(java.lang.String itemErrorCode) {
        this.itemErrorCode = itemErrorCode;
    }


    /**
     * Gets the itemErrorDescription value for this ItemsNotAddedStruct.
     *
     * @return itemErrorDescription
     */
    public java.lang.String getItemErrorDescription() {
        return itemErrorDescription;
    }


    /**
     * Sets the itemErrorDescription value for this ItemsNotAddedStruct.
     *
     * @param itemErrorDescription
     */
    public void setItemErrorDescription(java.lang.String itemErrorDescription) {
        this.itemErrorDescription = itemErrorDescription;
    }

    private java.lang.Object __equalsCalc = null;

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ItemsNotAddedStruct)) return false;
        ItemsNotAddedStruct other = (ItemsNotAddedStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                this.itemId == other.getItemId() &&
                ((this.itemErrorCode == null && other.getItemErrorCode() == null) ||
                        (this.itemErrorCode != null &&
                                this.itemErrorCode.equals(other.getItemErrorCode()))) &&
                ((this.itemErrorDescription == null && other.getItemErrorDescription() == null) ||
                        (this.itemErrorDescription != null &&
                                this.itemErrorDescription.equals(other.getItemErrorDescription())));
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
        _hashCode += new Long(getItemId()).hashCode();
        if (getItemErrorCode() != null) {
            _hashCode += getItemErrorCode().hashCode();
        }
        if (getItemErrorDescription() != null) {
            _hashCode += getItemErrorDescription().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(ItemsNotAddedStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:AllegroWebApi", "ItemsNotAddedStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "item-id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemErrorCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "item-error-code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemErrorDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("", "item-error-description"));
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
