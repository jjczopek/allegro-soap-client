/**
 * MyFeedbackListStruct2.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pl.net.yuri.magister.soap;

public class MyFeedbackListStruct2 implements java.io.Serializable {
    private java.lang.String[] feedbackArray;

    public MyFeedbackListStruct2() {
    }

    public MyFeedbackListStruct2(
            java.lang.String[] feedbackArray) {
        this.feedbackArray = feedbackArray;
    }


    /**
     * Gets the feedbackArray value for this MyFeedbackListStruct2.
     *
     * @return feedbackArray
     */
    public java.lang.String[] getFeedbackArray() {
        return feedbackArray;
    }


    /**
     * Sets the feedbackArray value for this MyFeedbackListStruct2.
     *
     * @param feedbackArray
     */
    public void setFeedbackArray(java.lang.String[] feedbackArray) {
        this.feedbackArray = feedbackArray;
    }

    private java.lang.Object __equalsCalc = null;

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MyFeedbackListStruct2)) return false;
        MyFeedbackListStruct2 other = (MyFeedbackListStruct2) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.feedbackArray == null && other.getFeedbackArray() == null) ||
                        (this.feedbackArray != null &&
                                java.util.Arrays.equals(this.feedbackArray, other.getFeedbackArray())));
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
        if (getFeedbackArray() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getFeedbackArray());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFeedbackArray(), i);
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
            new org.apache.axis.description.TypeDesc(MyFeedbackListStruct2.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:AllegroWebApi", "MyFeedbackListStruct2"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feedbackArray");
        elemField.setXmlName(new javax.xml.namespace.QName("", "feedback-array"));
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
