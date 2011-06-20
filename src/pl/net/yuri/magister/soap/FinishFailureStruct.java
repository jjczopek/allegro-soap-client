/**
 * FinishFailureStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pl.net.yuri.magister.soap;

public class FinishFailureStruct implements java.io.Serializable {
    private long finishItemId;

    private java.lang.String finishErrorCode;

    private java.lang.String finishErrorMessage;

    public FinishFailureStruct() {
    }

    public FinishFailureStruct(
            long finishItemId,
            java.lang.String finishErrorCode,
            java.lang.String finishErrorMessage) {
        this.finishItemId = finishItemId;
        this.finishErrorCode = finishErrorCode;
        this.finishErrorMessage = finishErrorMessage;
    }


    /**
     * Gets the finishItemId value for this FinishFailureStruct.
     *
     * @return finishItemId
     */
    public long getFinishItemId() {
        return finishItemId;
    }


    /**
     * Sets the finishItemId value for this FinishFailureStruct.
     *
     * @param finishItemId
     */
    public void setFinishItemId(long finishItemId) {
        this.finishItemId = finishItemId;
    }


    /**
     * Gets the finishErrorCode value for this FinishFailureStruct.
     *
     * @return finishErrorCode
     */
    public java.lang.String getFinishErrorCode() {
        return finishErrorCode;
    }


    /**
     * Sets the finishErrorCode value for this FinishFailureStruct.
     *
     * @param finishErrorCode
     */
    public void setFinishErrorCode(java.lang.String finishErrorCode) {
        this.finishErrorCode = finishErrorCode;
    }


    /**
     * Gets the finishErrorMessage value for this FinishFailureStruct.
     *
     * @return finishErrorMessage
     */
    public java.lang.String getFinishErrorMessage() {
        return finishErrorMessage;
    }


    /**
     * Sets the finishErrorMessage value for this FinishFailureStruct.
     *
     * @param finishErrorMessage
     */
    public void setFinishErrorMessage(java.lang.String finishErrorMessage) {
        this.finishErrorMessage = finishErrorMessage;
    }

    private java.lang.Object __equalsCalc = null;

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FinishFailureStruct)) return false;
        FinishFailureStruct other = (FinishFailureStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                this.finishItemId == other.getFinishItemId() &&
                ((this.finishErrorCode == null && other.getFinishErrorCode() == null) ||
                        (this.finishErrorCode != null &&
                                this.finishErrorCode.equals(other.getFinishErrorCode()))) &&
                ((this.finishErrorMessage == null && other.getFinishErrorMessage() == null) ||
                        (this.finishErrorMessage != null &&
                                this.finishErrorMessage.equals(other.getFinishErrorMessage())));
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
        _hashCode += new Long(getFinishItemId()).hashCode();
        if (getFinishErrorCode() != null) {
            _hashCode += getFinishErrorCode().hashCode();
        }
        if (getFinishErrorMessage() != null) {
            _hashCode += getFinishErrorMessage().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(FinishFailureStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:AllegroWebApi", "FinishFailureStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("finishItemId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "finish-item-id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("finishErrorCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "finish-error-code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("finishErrorMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "finish-error-message"));
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
