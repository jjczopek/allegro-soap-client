/**
 * InfoCatList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pl.net.yuri.magister.soap;

public class InfoCatList implements java.io.Serializable {
    private long catId;

    private java.lang.String catName;

    private long catItemsCount;

    public InfoCatList() {
    }

    public InfoCatList(
            long catId,
            java.lang.String catName,
            long catItemsCount) {
        this.catId = catId;
        this.catName = catName;
        this.catItemsCount = catItemsCount;
    }


    /**
     * Gets the catId value for this InfoCatList.
     *
     * @return catId
     */
    public long getCatId() {
        return catId;
    }


    /**
     * Sets the catId value for this InfoCatList.
     *
     * @param catId
     */
    public void setCatId(long catId) {
        this.catId = catId;
    }


    /**
     * Gets the catName value for this InfoCatList.
     *
     * @return catName
     */
    public java.lang.String getCatName() {
        return catName;
    }


    /**
     * Sets the catName value for this InfoCatList.
     *
     * @param catName
     */
    public void setCatName(java.lang.String catName) {
        this.catName = catName;
    }


    /**
     * Gets the catItemsCount value for this InfoCatList.
     *
     * @return catItemsCount
     */
    public long getCatItemsCount() {
        return catItemsCount;
    }


    /**
     * Sets the catItemsCount value for this InfoCatList.
     *
     * @param catItemsCount
     */
    public void setCatItemsCount(long catItemsCount) {
        this.catItemsCount = catItemsCount;
    }

    private java.lang.Object __equalsCalc = null;

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InfoCatList)) return false;
        InfoCatList other = (InfoCatList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                this.catId == other.getCatId() &&
                ((this.catName == null && other.getCatName() == null) ||
                        (this.catName != null &&
                                this.catName.equals(other.getCatName()))) &&
                this.catItemsCount == other.getCatItemsCount();
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
        _hashCode += new Long(getCatId()).hashCode();
        if (getCatName() != null) {
            _hashCode += getCatName().hashCode();
        }
        _hashCode += new Long(getCatItemsCount()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(InfoCatList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:AllegroWebApi", "InfoCatList"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("catItemsCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cat-items-count"));
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
