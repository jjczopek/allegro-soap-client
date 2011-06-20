/**
 * DurationTimeInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pl.net.yuri.magister.soap;

public class DurationTimeInfo implements java.io.Serializable {
    private int durationOption;

    private int durationValue;

    public DurationTimeInfo() {
    }

    public DurationTimeInfo(
            int durationOption,
            int durationValue) {
        this.durationOption = durationOption;
        this.durationValue = durationValue;
    }


    /**
     * Gets the durationOption value for this DurationTimeInfo.
     *
     * @return durationOption
     */
    public int getDurationOption() {
        return durationOption;
    }


    /**
     * Sets the durationOption value for this DurationTimeInfo.
     *
     * @param durationOption
     */
    public void setDurationOption(int durationOption) {
        this.durationOption = durationOption;
    }


    /**
     * Gets the durationValue value for this DurationTimeInfo.
     *
     * @return durationValue
     */
    public int getDurationValue() {
        return durationValue;
    }


    /**
     * Sets the durationValue value for this DurationTimeInfo.
     *
     * @param durationValue
     */
    public void setDurationValue(int durationValue) {
        this.durationValue = durationValue;
    }

    private java.lang.Object __equalsCalc = null;

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DurationTimeInfo)) return false;
        DurationTimeInfo other = (DurationTimeInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                this.durationOption == other.getDurationOption() &&
                this.durationValue == other.getDurationValue();
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
        _hashCode += getDurationOption();
        _hashCode += getDurationValue();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(DurationTimeInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:AllegroWebApi", "DurationTimeInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("durationOption");
        elemField.setXmlName(new javax.xml.namespace.QName("", "duration-option"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("durationValue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "duration-value"));
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
