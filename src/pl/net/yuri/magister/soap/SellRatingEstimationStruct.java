/**
 * SellRatingEstimationStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pl.net.yuri.magister.soap;

public class SellRatingEstimationStruct implements java.io.Serializable {
    private int sellRatingGroupId;

    private int sellRatingGroupEstimation;

    private int sellRatingReasonId;

    public SellRatingEstimationStruct() {
    }

    public SellRatingEstimationStruct(
            int sellRatingGroupId,
            int sellRatingGroupEstimation,
            int sellRatingReasonId) {
        this.sellRatingGroupId = sellRatingGroupId;
        this.sellRatingGroupEstimation = sellRatingGroupEstimation;
        this.sellRatingReasonId = sellRatingReasonId;
    }


    /**
     * Gets the sellRatingGroupId value for this SellRatingEstimationStruct.
     *
     * @return sellRatingGroupId
     */
    public int getSellRatingGroupId() {
        return sellRatingGroupId;
    }


    /**
     * Sets the sellRatingGroupId value for this SellRatingEstimationStruct.
     *
     * @param sellRatingGroupId
     */
    public void setSellRatingGroupId(int sellRatingGroupId) {
        this.sellRatingGroupId = sellRatingGroupId;
    }


    /**
     * Gets the sellRatingGroupEstimation value for this SellRatingEstimationStruct.
     *
     * @return sellRatingGroupEstimation
     */
    public int getSellRatingGroupEstimation() {
        return sellRatingGroupEstimation;
    }


    /**
     * Sets the sellRatingGroupEstimation value for this SellRatingEstimationStruct.
     *
     * @param sellRatingGroupEstimation
     */
    public void setSellRatingGroupEstimation(int sellRatingGroupEstimation) {
        this.sellRatingGroupEstimation = sellRatingGroupEstimation;
    }


    /**
     * Gets the sellRatingReasonId value for this SellRatingEstimationStruct.
     *
     * @return sellRatingReasonId
     */
    public int getSellRatingReasonId() {
        return sellRatingReasonId;
    }


    /**
     * Sets the sellRatingReasonId value for this SellRatingEstimationStruct.
     *
     * @param sellRatingReasonId
     */
    public void setSellRatingReasonId(int sellRatingReasonId) {
        this.sellRatingReasonId = sellRatingReasonId;
    }

    private java.lang.Object __equalsCalc = null;

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SellRatingEstimationStruct)) return false;
        SellRatingEstimationStruct other = (SellRatingEstimationStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                this.sellRatingGroupId == other.getSellRatingGroupId() &&
                this.sellRatingGroupEstimation == other.getSellRatingGroupEstimation() &&
                this.sellRatingReasonId == other.getSellRatingReasonId();
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
        _hashCode += getSellRatingGroupId();
        _hashCode += getSellRatingGroupEstimation();
        _hashCode += getSellRatingReasonId();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(SellRatingEstimationStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:AllegroWebApi", "SellRatingEstimationStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sellRatingGroupId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sell-rating-group-id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sellRatingGroupEstimation");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sell-rating-group-estimation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sellRatingReasonId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sell-rating-reason-id"));
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
