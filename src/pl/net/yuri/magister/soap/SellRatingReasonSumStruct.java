/**
 * SellRatingReasonSumStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pl.net.yuri.magister.soap;

public class SellRatingReasonSumStruct implements java.io.Serializable {
    private java.lang.String sellRatingReasonTitle;

    private int sellRatingReasonCount;

    public SellRatingReasonSumStruct() {
    }

    public SellRatingReasonSumStruct(
            java.lang.String sellRatingReasonTitle,
            int sellRatingReasonCount) {
        this.sellRatingReasonTitle = sellRatingReasonTitle;
        this.sellRatingReasonCount = sellRatingReasonCount;
    }


    /**
     * Gets the sellRatingReasonTitle value for this SellRatingReasonSumStruct.
     *
     * @return sellRatingReasonTitle
     */
    public java.lang.String getSellRatingReasonTitle() {
        return sellRatingReasonTitle;
    }


    /**
     * Sets the sellRatingReasonTitle value for this SellRatingReasonSumStruct.
     *
     * @param sellRatingReasonTitle
     */
    public void setSellRatingReasonTitle(java.lang.String sellRatingReasonTitle) {
        this.sellRatingReasonTitle = sellRatingReasonTitle;
    }


    /**
     * Gets the sellRatingReasonCount value for this SellRatingReasonSumStruct.
     *
     * @return sellRatingReasonCount
     */
    public int getSellRatingReasonCount() {
        return sellRatingReasonCount;
    }


    /**
     * Sets the sellRatingReasonCount value for this SellRatingReasonSumStruct.
     *
     * @param sellRatingReasonCount
     */
    public void setSellRatingReasonCount(int sellRatingReasonCount) {
        this.sellRatingReasonCount = sellRatingReasonCount;
    }

    private java.lang.Object __equalsCalc = null;

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SellRatingReasonSumStruct)) return false;
        SellRatingReasonSumStruct other = (SellRatingReasonSumStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.sellRatingReasonTitle == null && other.getSellRatingReasonTitle() == null) ||
                        (this.sellRatingReasonTitle != null &&
                                this.sellRatingReasonTitle.equals(other.getSellRatingReasonTitle()))) &&
                this.sellRatingReasonCount == other.getSellRatingReasonCount();
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
        if (getSellRatingReasonTitle() != null) {
            _hashCode += getSellRatingReasonTitle().hashCode();
        }
        _hashCode += getSellRatingReasonCount();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(SellRatingReasonSumStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:AllegroWebApi", "SellRatingReasonSumStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sellRatingReasonTitle");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sell-rating-reason-title"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sellRatingReasonCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sell-rating-reason-count"));
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
