/**
 * RangeIntValueStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pl.net.yuri.magister.soap;

public class RangeIntValueStruct implements java.io.Serializable {
    private int fvalueRangeIntMin;

    private int fvalueRangeIntMax;

    public RangeIntValueStruct() {
    }

    public RangeIntValueStruct(
            int fvalueRangeIntMin,
            int fvalueRangeIntMax) {
        this.fvalueRangeIntMin = fvalueRangeIntMin;
        this.fvalueRangeIntMax = fvalueRangeIntMax;
    }


    /**
     * Gets the fvalueRangeIntMin value for this RangeIntValueStruct.
     *
     * @return fvalueRangeIntMin
     */
    public int getFvalueRangeIntMin() {
        return fvalueRangeIntMin;
    }


    /**
     * Sets the fvalueRangeIntMin value for this RangeIntValueStruct.
     *
     * @param fvalueRangeIntMin
     */
    public void setFvalueRangeIntMin(int fvalueRangeIntMin) {
        this.fvalueRangeIntMin = fvalueRangeIntMin;
    }


    /**
     * Gets the fvalueRangeIntMax value for this RangeIntValueStruct.
     *
     * @return fvalueRangeIntMax
     */
    public int getFvalueRangeIntMax() {
        return fvalueRangeIntMax;
    }


    /**
     * Sets the fvalueRangeIntMax value for this RangeIntValueStruct.
     *
     * @param fvalueRangeIntMax
     */
    public void setFvalueRangeIntMax(int fvalueRangeIntMax) {
        this.fvalueRangeIntMax = fvalueRangeIntMax;
    }

    private java.lang.Object __equalsCalc = null;

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RangeIntValueStruct)) return false;
        RangeIntValueStruct other = (RangeIntValueStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                this.fvalueRangeIntMin == other.getFvalueRangeIntMin() &&
                this.fvalueRangeIntMax == other.getFvalueRangeIntMax();
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
        _hashCode += getFvalueRangeIntMin();
        _hashCode += getFvalueRangeIntMax();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(RangeIntValueStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:AllegroWebApi", "RangeIntValueStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fvalueRangeIntMin");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fvalue-range-int-min"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fvalueRangeIntMax");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fvalue-range-int-max"));
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
