/**
 * PriceCatInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pl.net.yuri.magister.soap;

public class PriceCatInfo implements java.io.Serializable {
    private float priceMin;

    private float priceMax;

    public PriceCatInfo() {
    }

    public PriceCatInfo(
            float priceMin,
            float priceMax) {
        this.priceMin = priceMin;
        this.priceMax = priceMax;
    }


    /**
     * Gets the priceMin value for this PriceCatInfo.
     *
     * @return priceMin
     */
    public float getPriceMin() {
        return priceMin;
    }


    /**
     * Sets the priceMin value for this PriceCatInfo.
     *
     * @param priceMin
     */
    public void setPriceMin(float priceMin) {
        this.priceMin = priceMin;
    }


    /**
     * Gets the priceMax value for this PriceCatInfo.
     *
     * @return priceMax
     */
    public float getPriceMax() {
        return priceMax;
    }


    /**
     * Sets the priceMax value for this PriceCatInfo.
     *
     * @param priceMax
     */
    public void setPriceMax(float priceMax) {
        this.priceMax = priceMax;
    }

    private java.lang.Object __equalsCalc = null;

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PriceCatInfo)) return false;
        PriceCatInfo other = (PriceCatInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                this.priceMin == other.getPriceMin() &&
                this.priceMax == other.getPriceMax();
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
        _hashCode += new Float(getPriceMin()).hashCode();
        _hashCode += new Float(getPriceMax()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(PriceCatInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:AllegroWebApi", "PriceCatInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priceMin");
        elemField.setXmlName(new javax.xml.namespace.QName("", "price-min"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priceMax");
        elemField.setXmlName(new javax.xml.namespace.QName("", "price-max"));
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
