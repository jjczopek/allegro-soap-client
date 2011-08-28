/**
 * ItemCatList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pl.net.yuri.magister.soap;

public class ItemCatList implements java.io.Serializable {
    private int catLevel;

    private long catId;

    private java.lang.String catName;

    public ItemCatList() {
    }

    public ItemCatList(
            int catLevel,
            long catId,
            java.lang.String catName) {
        this.catLevel = catLevel;
        this.catId = catId;
        this.catName = catName;
    }


    /**
     * Gets the catLevel value for this ItemCatList.
     *
     * @return catLevel
     */
    public int getCatLevel() {
        return catLevel;
    }


    /**
     * Sets the catLevel value for this ItemCatList.
     *
     * @param catLevel
     */
    public void setCatLevel(int catLevel) {
        this.catLevel = catLevel;
    }


    /**
     * Gets the catId value for this ItemCatList.
     *
     * @return catId
     */
    public long getCatId() {
        return catId;
    }


    /**
     * Sets the catId value for this ItemCatList.
     *
     * @param catId
     */
    public void setCatId(long catId) {
        this.catId = catId;
    }


    /**
     * Gets the catName value for this ItemCatList.
     *
     * @return catName
     */
    public java.lang.String getCatName() {
        return catName;
    }


    /**
     * Sets the catName value for this ItemCatList.
     *
     * @param catName
     */
    public void setCatName(java.lang.String catName) {
        this.catName = catName;
    }

    private java.lang.Object __equalsCalc = null;

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ItemCatList)) return false;
        ItemCatList other = (ItemCatList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                this.catLevel == other.getCatLevel() &&
                this.catId == other.getCatId() &&
                ((this.catName == null && other.getCatName() == null) ||
                        (this.catName != null &&
                                this.catName.equals(other.getCatName())));
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
        _hashCode += getCatLevel();
        _hashCode += new Long(getCatId()).hashCode();
        if (getCatName() != null) {
            _hashCode += getCatName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(ItemCatList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:AllegroWebApi", "ItemCatList"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("catLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cat-level"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("catId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cat-id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("catName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cat-name"));
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
