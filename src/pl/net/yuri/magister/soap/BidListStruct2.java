/**
 * BidListStruct2.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pl.net.yuri.magister.soap;

public class BidListStruct2 implements java.io.Serializable {
    private java.lang.String[] bidsArray;

    public BidListStruct2() {
    }

    public BidListStruct2(
            java.lang.String[] bidsArray) {
        this.bidsArray = bidsArray;
    }


    /**
     * Gets the bidsArray value for this BidListStruct2.
     *
     * @return bidsArray
     */
    public java.lang.String[] getBidsArray() {
        return bidsArray;
    }


    /**
     * Sets the bidsArray value for this BidListStruct2.
     *
     * @param bidsArray
     */
    public void setBidsArray(java.lang.String[] bidsArray) {
        this.bidsArray = bidsArray;
    }

    private java.lang.Object __equalsCalc = null;

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BidListStruct2)) return false;
        BidListStruct2 other = (BidListStruct2) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.bidsArray == null && other.getBidsArray() == null) ||
                        (this.bidsArray != null &&
                                java.util.Arrays.equals(this.bidsArray, other.getBidsArray())));
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
        if (getBidsArray() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getBidsArray());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBidsArray(), i);
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
            new org.apache.axis.description.TypeDesc(BidListStruct2.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:AllegroWebApi", "BidListStruct2"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bidsArray");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bids-array"));
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
