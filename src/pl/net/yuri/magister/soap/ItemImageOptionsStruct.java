/**
 * ItemImageOptionsStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pl.net.yuri.magister.soap;

public class ItemImageOptionsStruct implements java.io.Serializable {
    private int itemImageFieldId;

    private int itemImageActionType;

    public ItemImageOptionsStruct() {
    }

    public ItemImageOptionsStruct(
            int itemImageFieldId,
            int itemImageActionType) {
        this.itemImageFieldId = itemImageFieldId;
        this.itemImageActionType = itemImageActionType;
    }


    /**
     * Gets the itemImageFieldId value for this ItemImageOptionsStruct.
     *
     * @return itemImageFieldId
     */
    public int getItemImageFieldId() {
        return itemImageFieldId;
    }


    /**
     * Sets the itemImageFieldId value for this ItemImageOptionsStruct.
     *
     * @param itemImageFieldId
     */
    public void setItemImageFieldId(int itemImageFieldId) {
        this.itemImageFieldId = itemImageFieldId;
    }


    /**
     * Gets the itemImageActionType value for this ItemImageOptionsStruct.
     *
     * @return itemImageActionType
     */
    public int getItemImageActionType() {
        return itemImageActionType;
    }


    /**
     * Sets the itemImageActionType value for this ItemImageOptionsStruct.
     *
     * @param itemImageActionType
     */
    public void setItemImageActionType(int itemImageActionType) {
        this.itemImageActionType = itemImageActionType;
    }

    private java.lang.Object __equalsCalc = null;

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ItemImageOptionsStruct)) return false;
        ItemImageOptionsStruct other = (ItemImageOptionsStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                this.itemImageFieldId == other.getItemImageFieldId() &&
                this.itemImageActionType == other.getItemImageActionType();
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
        _hashCode += getItemImageFieldId();
        _hashCode += getItemImageActionType();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(ItemImageOptionsStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:AllegroWebApi", "ItemImageOptionsStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemImageFieldId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "item-image-field-id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemImageActionType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "item-image-action-type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
