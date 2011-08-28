/**
 * SellRatingReasonStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pl.net.yuri.magister.soap;

public class SellRatingReasonStruct implements java.io.Serializable {
    private int sellRatingReasonId;

    private java.lang.String sellRatingReasonTitle;

    public SellRatingReasonStruct() {
    }

    public SellRatingReasonStruct(
            int sellRatingReasonId,
            java.lang.String sellRatingReasonTitle) {
        this.sellRatingReasonId = sellRatingReasonId;
        this.sellRatingReasonTitle = sellRatingReasonTitle;
    }


    /**
     * Gets the sellRatingReasonId value for this SellRatingReasonStruct.
     *
     * @return sellRatingReasonId
     */
    public int getSellRatingReasonId() {
        return sellRatingReasonId;
    }


    /**
     * Sets the sellRatingReasonId value for this SellRatingReasonStruct.
     *
     * @param sellRatingReasonId
     */
    public void setSellRatingReasonId(int sellRatingReasonId) {
        this.sellRatingReasonId = sellRatingReasonId;
    }


    /**
     * Gets the sellRatingReasonTitle value for this SellRatingReasonStruct.
     *
     * @return sellRatingReasonTitle
     */
    public java.lang.String getSellRatingReasonTitle() {
        return sellRatingReasonTitle;
    }


    /**
     * Sets the sellRatingReasonTitle value for this SellRatingReasonStruct.
     *
     * @param sellRatingReasonTitle
     */
    public void setSellRatingReasonTitle(java.lang.String sellRatingReasonTitle) {
        this.sellRatingReasonTitle = sellRatingReasonTitle;
    }

    private java.lang.Object __equalsCalc = null;

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SellRatingReasonStruct)) return false;
        SellRatingReasonStruct other = (SellRatingReasonStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                this.sellRatingReasonId == other.getSellRatingReasonId() &&
                ((this.sellRatingReasonTitle == null && other.getSellRatingReasonTitle() == null) ||
                        (this.sellRatingReasonTitle != null &&
                                this.sellRatingReasonTitle.equals(other.getSellRatingReasonTitle())));
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
        _hashCode += getSellRatingReasonId();
        if (getSellRatingReasonTitle() != null) {
            _hashCode += getSellRatingReasonTitle().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(SellRatingReasonStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:AllegroWebApi", "SellRatingReasonStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sellRatingReasonId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sell-rating-reason-id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sellRatingReasonTitle");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sell-rating-reason-title"));
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
