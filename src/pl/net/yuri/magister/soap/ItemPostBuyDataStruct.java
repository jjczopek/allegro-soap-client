/**
 * ItemPostBuyDataStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pl.net.yuri.magister.soap;

public class ItemPostBuyDataStruct implements java.io.Serializable {
    private long itemId;

    private pl.net.yuri.magister.soap.UserPostBuyDataStruct[] usersPostBuyData;

    public ItemPostBuyDataStruct() {
    }

    public ItemPostBuyDataStruct(
            long itemId,
            pl.net.yuri.magister.soap.UserPostBuyDataStruct[] usersPostBuyData) {
        this.itemId = itemId;
        this.usersPostBuyData = usersPostBuyData;
    }


    /**
     * Gets the itemId value for this ItemPostBuyDataStruct.
     *
     * @return itemId
     */
    public long getItemId() {
        return itemId;
    }


    /**
     * Sets the itemId value for this ItemPostBuyDataStruct.
     *
     * @param itemId
     */
    public void setItemId(long itemId) {
        this.itemId = itemId;
    }


    /**
     * Gets the usersPostBuyData value for this ItemPostBuyDataStruct.
     *
     * @return usersPostBuyData
     */
    public pl.net.yuri.magister.soap.UserPostBuyDataStruct[] getUsersPostBuyData() {
        return usersPostBuyData;
    }


    /**
     * Sets the usersPostBuyData value for this ItemPostBuyDataStruct.
     *
     * @param usersPostBuyData
     */
    public void setUsersPostBuyData(pl.net.yuri.magister.soap.UserPostBuyDataStruct[] usersPostBuyData) {
        this.usersPostBuyData = usersPostBuyData;
    }

    private java.lang.Object __equalsCalc = null;

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ItemPostBuyDataStruct)) return false;
        ItemPostBuyDataStruct other = (ItemPostBuyDataStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                this.itemId == other.getItemId() &&
                ((this.usersPostBuyData == null && other.getUsersPostBuyData() == null) ||
                        (this.usersPostBuyData != null &&
                                java.util.Arrays.equals(this.usersPostBuyData, other.getUsersPostBuyData())));
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
        if (getUsersPostBuyData() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getUsersPostBuyData());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUsersPostBuyData(), i);
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
            new org.apache.axis.description.TypeDesc(ItemPostBuyDataStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:AllegroWebApi", "ItemPostBuyDataStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "item-id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usersPostBuyData");
        elemField.setXmlName(new javax.xml.namespace.QName("", "users-post-buy-data"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:AllegroWebApi", "UserPostBuyDataStruct"));
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
