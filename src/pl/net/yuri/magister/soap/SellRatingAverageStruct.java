/**
 * SellRatingAverageStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pl.net.yuri.magister.soap;

public class SellRatingAverageStruct implements java.io.Serializable {
    private java.lang.String sellRatingGroupTitle;

    private float sellRatingGroupAverage;

    public SellRatingAverageStruct() {
    }

    public SellRatingAverageStruct(
            java.lang.String sellRatingGroupTitle,
            float sellRatingGroupAverage) {
        this.sellRatingGroupTitle = sellRatingGroupTitle;
        this.sellRatingGroupAverage = sellRatingGroupAverage;
    }


    /**
     * Gets the sellRatingGroupTitle value for this SellRatingAverageStruct.
     *
     * @return sellRatingGroupTitle
     */
    public java.lang.String getSellRatingGroupTitle() {
        return sellRatingGroupTitle;
    }


    /**
     * Sets the sellRatingGroupTitle value for this SellRatingAverageStruct.
     *
     * @param sellRatingGroupTitle
     */
    public void setSellRatingGroupTitle(java.lang.String sellRatingGroupTitle) {
        this.sellRatingGroupTitle = sellRatingGroupTitle;
    }


    /**
     * Gets the sellRatingGroupAverage value for this SellRatingAverageStruct.
     *
     * @return sellRatingGroupAverage
     */
    public float getSellRatingGroupAverage() {
        return sellRatingGroupAverage;
    }


    /**
     * Sets the sellRatingGroupAverage value for this SellRatingAverageStruct.
     *
     * @param sellRatingGroupAverage
     */
    public void setSellRatingGroupAverage(float sellRatingGroupAverage) {
        this.sellRatingGroupAverage = sellRatingGroupAverage;
    }

    private java.lang.Object __equalsCalc = null;

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SellRatingAverageStruct)) return false;
        SellRatingAverageStruct other = (SellRatingAverageStruct) obj;
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
                this.sellRatingGroupAverage == other.getSellRatingGroupAverage();
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
        _hashCode += new Float(getSellRatingGroupAverage()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(SellRatingAverageStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:AllegroWebApi", "SellRatingAverageStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sellRatingGroupTitle");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sell-rating-group-title"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sellRatingGroupAverage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sell-rating-group-average"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
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
