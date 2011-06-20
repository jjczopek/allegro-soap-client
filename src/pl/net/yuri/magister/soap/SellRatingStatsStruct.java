/**
 * SellRatingStatsStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pl.net.yuri.magister.soap;

public class SellRatingStatsStruct implements java.io.Serializable {
    private java.lang.String sellRatingGroupTitle;

    private java.lang.String sellRatingGroupStats;

    public SellRatingStatsStruct() {
    }

    public SellRatingStatsStruct(
            java.lang.String sellRatingGroupTitle,
            java.lang.String sellRatingGroupStats) {
        this.sellRatingGroupTitle = sellRatingGroupTitle;
        this.sellRatingGroupStats = sellRatingGroupStats;
    }


    /**
     * Gets the sellRatingGroupTitle value for this SellRatingStatsStruct.
     *
     * @return sellRatingGroupTitle
     */
    public java.lang.String getSellRatingGroupTitle() {
        return sellRatingGroupTitle;
    }


    /**
     * Sets the sellRatingGroupTitle value for this SellRatingStatsStruct.
     *
     * @param sellRatingGroupTitle
     */
    public void setSellRatingGroupTitle(java.lang.String sellRatingGroupTitle) {
        this.sellRatingGroupTitle = sellRatingGroupTitle;
    }


    /**
     * Gets the sellRatingGroupStats value for this SellRatingStatsStruct.
     *
     * @return sellRatingGroupStats
     */
    public java.lang.String getSellRatingGroupStats() {
        return sellRatingGroupStats;
    }


    /**
     * Sets the sellRatingGroupStats value for this SellRatingStatsStruct.
     *
     * @param sellRatingGroupStats
     */
    public void setSellRatingGroupStats(java.lang.String sellRatingGroupStats) {
        this.sellRatingGroupStats = sellRatingGroupStats;
    }

    private java.lang.Object __equalsCalc = null;

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SellRatingStatsStruct)) return false;
        SellRatingStatsStruct other = (SellRatingStatsStruct) obj;
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
                ((this.sellRatingGroupStats == null && other.getSellRatingGroupStats() == null) ||
                        (this.sellRatingGroupStats != null &&
                                this.sellRatingGroupStats.equals(other.getSellRatingGroupStats())));
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
        if (getSellRatingGroupStats() != null) {
            _hashCode += getSellRatingGroupStats().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(SellRatingStatsStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:AllegroWebApi", "SellRatingStatsStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sellRatingGroupTitle");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sell-rating-group-title"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sellRatingGroupStats");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sell-rating-group-stats"));
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
