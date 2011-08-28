/**
 * WatchListInfoStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pl.net.yuri.magister.soap;

public class WatchListInfoStruct implements java.io.Serializable {
    private long[] itemsAdded;

    private pl.net.yuri.magister.soap.ItemsNotAddedStruct[] itemsNotAdded;

    public WatchListInfoStruct() {
    }

    public WatchListInfoStruct(
            long[] itemsAdded,
            pl.net.yuri.magister.soap.ItemsNotAddedStruct[] itemsNotAdded) {
        this.itemsAdded = itemsAdded;
        this.itemsNotAdded = itemsNotAdded;
    }


    /**
     * Gets the itemsAdded value for this WatchListInfoStruct.
     *
     * @return itemsAdded
     */
    public long[] getItemsAdded() {
        return itemsAdded;
    }


    /**
     * Sets the itemsAdded value for this WatchListInfoStruct.
     *
     * @param itemsAdded
     */
    public void setItemsAdded(long[] itemsAdded) {
        this.itemsAdded = itemsAdded;
    }


    /**
     * Gets the itemsNotAdded value for this WatchListInfoStruct.
     *
     * @return itemsNotAdded
     */
    public pl.net.yuri.magister.soap.ItemsNotAddedStruct[] getItemsNotAdded() {
        return itemsNotAdded;
    }


    /**
     * Sets the itemsNotAdded value for this WatchListInfoStruct.
     *
     * @param itemsNotAdded
     */
    public void setItemsNotAdded(pl.net.yuri.magister.soap.ItemsNotAddedStruct[] itemsNotAdded) {
        this.itemsNotAdded = itemsNotAdded;
    }

    private java.lang.Object __equalsCalc = null;

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WatchListInfoStruct)) return false;
        WatchListInfoStruct other = (WatchListInfoStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.itemsAdded == null && other.getItemsAdded() == null) ||
                        (this.itemsAdded != null &&
                                java.util.Arrays.equals(this.itemsAdded, other.getItemsAdded()))) &&
                ((this.itemsNotAdded == null && other.getItemsNotAdded() == null) ||
                        (this.itemsNotAdded != null &&
                                java.util.Arrays.equals(this.itemsNotAdded, other.getItemsNotAdded())));
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
        if (getItemsAdded() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getItemsAdded());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getItemsAdded(), i);
                if (obj != null &&
                        !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getItemsNotAdded() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getItemsNotAdded());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getItemsNotAdded(), i);
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
            new org.apache.axis.description.TypeDesc(WatchListInfoStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:AllegroWebApi", "WatchListInfoStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemsAdded");
        elemField.setXmlName(new javax.xml.namespace.QName("", "items-added"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemsNotAdded");
        elemField.setXmlName(new javax.xml.namespace.QName("", "items-not-added"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:AllegroWebApi", "ItemsNotAddedStruct"));
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
