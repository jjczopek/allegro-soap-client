/**
 * SellRatingDetailStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pl.net.yuri.magister.soap;

public class SellRatingDetailStruct implements java.io.Serializable {
    private java.lang.String sellRatingGroupTitle;

    private pl.net.yuri.magister.soap.SellRatingReasonSumStruct[] sellRatingReasonsSummary;

    public SellRatingDetailStruct() {
    }

    public SellRatingDetailStruct(
            java.lang.String sellRatingGroupTitle,
            pl.net.yuri.magister.soap.SellRatingReasonSumStruct[] sellRatingReasonsSummary) {
        this.sellRatingGroupTitle = sellRatingGroupTitle;
        this.sellRatingReasonsSummary = sellRatingReasonsSummary;
    }


    /**
     * Gets the sellRatingGroupTitle value for this SellRatingDetailStruct.
     *
     * @return sellRatingGroupTitle
     */
    public java.lang.String getSellRatingGroupTitle() {
        return sellRatingGroupTitle;
    }


    /**
     * Sets the sellRatingGroupTitle value for this SellRatingDetailStruct.
     *
     * @param sellRatingGroupTitle
     */
    public void setSellRatingGroupTitle(java.lang.String sellRatingGroupTitle) {
        this.sellRatingGroupTitle = sellRatingGroupTitle;
    }


    /**
     * Gets the sellRatingReasonsSummary value for this SellRatingDetailStruct.
     *
     * @return sellRatingReasonsSummary
     */
    public pl.net.yuri.magister.soap.SellRatingReasonSumStruct[] getSellRatingReasonsSummary() {
        return sellRatingReasonsSummary;
    }


    /**
     * Sets the sellRatingReasonsSummary value for this SellRatingDetailStruct.
     *
     * @param sellRatingReasonsSummary
     */
    public void setSellRatingReasonsSummary(pl.net.yuri.magister.soap.SellRatingReasonSumStruct[] sellRatingReasonsSummary) {
        this.sellRatingReasonsSummary = sellRatingReasonsSummary;
    }

    private java.lang.Object __equalsCalc = null;

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SellRatingDetailStruct)) return false;
        SellRatingDetailStruct other = (SellRatingDetailStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.sellRatingGroupTitle == null && other.getSellRatingGroupTitle() == null) ||
                        (this.sellRatingGroupTitle != null &&
                                this.sellRatingGroupTitle.equals(other.getSellRatingGroupTitle()))) &&
                ((this.sellRatingReasonsSummary == null && other.getSellRatingReasonsSummary() == null) ||
                        (this.sellRatingReasonsSummary != null &&
                                java.util.Arrays.equals(this.sellRatingReasonsSummary, other.getSellRatingReasonsSummary())));
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
        if (getSellRatingGroupTitle() != null) {
            _hashCode += getSellRatingGroupTitle().hashCode();
        }
        if (getSellRatingReasonsSummary() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getSellRatingReasonsSummary());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSellRatingReasonsSummary(), i);
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
            new org.apache.axis.description.TypeDesc(SellRatingDetailStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:AllegroWebApi", "SellRatingDetailStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sellRatingGroupTitle");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sell-rating-group-title"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sellRatingReasonsSummary");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sell-rating-reasons-summary"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:AllegroWebApi", "SellRatingReasonSumStruct"));
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
