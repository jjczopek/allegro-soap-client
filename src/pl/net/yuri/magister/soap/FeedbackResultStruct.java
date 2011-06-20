/**
 * FeedbackResultStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pl.net.yuri.magister.soap;

public class FeedbackResultStruct implements java.io.Serializable {
    private int feItemId;

    private int feId;

    private java.lang.String feFaultCode;

    private java.lang.String feFaultDesc;

    public FeedbackResultStruct() {
    }

    public FeedbackResultStruct(
            int feItemId,
            int feId,
            java.lang.String feFaultCode,
            java.lang.String feFaultDesc) {
        this.feItemId = feItemId;
        this.feId = feId;
        this.feFaultCode = feFaultCode;
        this.feFaultDesc = feFaultDesc;
    }


    /**
     * Gets the feItemId value for this FeedbackResultStruct.
     *
     * @return feItemId
     */
    public int getFeItemId() {
        return feItemId;
    }


    /**
     * Sets the feItemId value for this FeedbackResultStruct.
     *
     * @param feItemId
     */
    public void setFeItemId(int feItemId) {
        this.feItemId = feItemId;
    }


    /**
     * Gets the feId value for this FeedbackResultStruct.
     *
     * @return feId
     */
    public int getFeId() {
        return feId;
    }


    /**
     * Sets the feId value for this FeedbackResultStruct.
     *
     * @param feId
     */
    public void setFeId(int feId) {
        this.feId = feId;
    }


    /**
     * Gets the feFaultCode value for this FeedbackResultStruct.
     *
     * @return feFaultCode
     */
    public java.lang.String getFeFaultCode() {
        return feFaultCode;
    }


    /**
     * Sets the feFaultCode value for this FeedbackResultStruct.
     *
     * @param feFaultCode
     */
    public void setFeFaultCode(java.lang.String feFaultCode) {
        this.feFaultCode = feFaultCode;
    }


    /**
     * Gets the feFaultDesc value for this FeedbackResultStruct.
     *
     * @return feFaultDesc
     */
    public java.lang.String getFeFaultDesc() {
        return feFaultDesc;
    }


    /**
     * Sets the feFaultDesc value for this FeedbackResultStruct.
     *
     * @param feFaultDesc
     */
    public void setFeFaultDesc(java.lang.String feFaultDesc) {
        this.feFaultDesc = feFaultDesc;
    }

    private java.lang.Object __equalsCalc = null;

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FeedbackResultStruct)) return false;
        FeedbackResultStruct other = (FeedbackResultStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                this.feItemId == other.getFeItemId() &&
                this.feId == other.getFeId() &&
                ((this.feFaultCode == null && other.getFeFaultCode() == null) ||
                        (this.feFaultCode != null &&
                                this.feFaultCode.equals(other.getFeFaultCode()))) &&
                ((this.feFaultDesc == null && other.getFeFaultDesc() == null) ||
                        (this.feFaultDesc != null &&
                                this.feFaultDesc.equals(other.getFeFaultDesc())));
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
        _hashCode += getFeItemId();
        _hashCode += getFeId();
        if (getFeFaultCode() != null) {
            _hashCode += getFeFaultCode().hashCode();
        }
        if (getFeFaultDesc() != null) {
            _hashCode += getFeFaultDesc().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(FeedbackResultStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:AllegroWebApi", "FeedbackResultStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feItemId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fe-item-id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fe-id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feFaultCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fe-fault-code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feFaultDesc");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fe-fault-desc"));
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
