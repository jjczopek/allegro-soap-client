/**
 * RangeDateValueStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pl.net.yuri.magister.soap;

public class RangeDateValueStruct implements java.io.Serializable {
    private java.lang.String fvalueRangeDateMin;

    private java.lang.String fvalueRangeDateMax;

    public RangeDateValueStruct() {
    }

    public RangeDateValueStruct(
            java.lang.String fvalueRangeDateMin,
            java.lang.String fvalueRangeDateMax) {
        this.fvalueRangeDateMin = fvalueRangeDateMin;
        this.fvalueRangeDateMax = fvalueRangeDateMax;
    }


    /**
     * Gets the fvalueRangeDateMin value for this RangeDateValueStruct.
     *
     * @return fvalueRangeDateMin
     */
    public java.lang.String getFvalueRangeDateMin() {
        return fvalueRangeDateMin;
    }


    /**
     * Sets the fvalueRangeDateMin value for this RangeDateValueStruct.
     *
     * @param fvalueRangeDateMin
     */
    public void setFvalueRangeDateMin(java.lang.String fvalueRangeDateMin) {
        this.fvalueRangeDateMin = fvalueRangeDateMin;
    }


    /**
     * Gets the fvalueRangeDateMax value for this RangeDateValueStruct.
     *
     * @return fvalueRangeDateMax
     */
    public java.lang.String getFvalueRangeDateMax() {
        return fvalueRangeDateMax;
    }


    /**
     * Sets the fvalueRangeDateMax value for this RangeDateValueStruct.
     *
     * @param fvalueRangeDateMax
     */
    public void setFvalueRangeDateMax(java.lang.String fvalueRangeDateMax) {
        this.fvalueRangeDateMax = fvalueRangeDateMax;
    }

    private java.lang.Object __equalsCalc = null;

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RangeDateValueStruct)) return false;
        RangeDateValueStruct other = (RangeDateValueStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.fvalueRangeDateMin == null && other.getFvalueRangeDateMin() == null) ||
                        (this.fvalueRangeDateMin != null &&
                                this.fvalueRangeDateMin.equals(other.getFvalueRangeDateMin()))) &&
                ((this.fvalueRangeDateMax == null && other.getFvalueRangeDateMax() == null) ||
                        (this.fvalueRangeDateMax != null &&
                                this.fvalueRangeDateMax.equals(other.getFvalueRangeDateMax())));
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
        if (getFvalueRangeDateMin() != null) {
            _hashCode += getFvalueRangeDateMin().hashCode();
        }
        if (getFvalueRangeDateMax() != null) {
            _hashCode += getFvalueRangeDateMax().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(RangeDateValueStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:AllegroWebApi", "RangeDateValueStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fvalueRangeDateMin");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fvalue-range-date-min"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fvalueRangeDateMax");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fvalue-range-date-max"));
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
