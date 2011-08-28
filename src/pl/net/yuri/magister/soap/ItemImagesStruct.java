/**
 * ItemImagesStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pl.net.yuri.magister.soap;

public class ItemImagesStruct implements java.io.Serializable {
    private long itemId;

    private pl.net.yuri.magister.soap.ItemImageList[] itemImages;

    public ItemImagesStruct() {
    }

    public ItemImagesStruct(
            long itemId,
            pl.net.yuri.magister.soap.ItemImageList[] itemImages) {
        this.itemId = itemId;
        this.itemImages = itemImages;
    }


    /**
     * Gets the itemId value for this ItemImagesStruct.
     *
     * @return itemId
     */
    public long getItemId() {
        return itemId;
    }


    /**
     * Sets the itemId value for this ItemImagesStruct.
     *
     * @param itemId
     */
    public void setItemId(long itemId) {
        this.itemId = itemId;
    }


    /**
     * Gets the itemImages value for this ItemImagesStruct.
     *
     * @return itemImages
     */
    public pl.net.yuri.magister.soap.ItemImageList[] getItemImages() {
        return itemImages;
    }


    /**
     * Sets the itemImages value for this ItemImagesStruct.
     *
     * @param itemImages
     */
    public void setItemImages(pl.net.yuri.magister.soap.ItemImageList[] itemImages) {
        this.itemImages = itemImages;
    }

    private java.lang.Object __equalsCalc = null;

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ItemImagesStruct)) return false;
        ItemImagesStruct other = (ItemImagesStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                this.itemId == other.getItemId() &&
                ((this.itemImages == null && other.getItemImages() == null) ||
                        (this.itemImages != null &&
                                java.util.Arrays.equals(this.itemImages, other.getItemImages())));
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
        if (getItemImages() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getItemImages());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getItemImages(), i);
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
            new org.apache.axis.description.TypeDesc(ItemImagesStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:AllegroWebApi", "ItemImagesStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "item-id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemImages");
        elemField.setXmlName(new javax.xml.namespace.QName("", "item-images"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:AllegroWebApi", "ItemImageList"));
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
