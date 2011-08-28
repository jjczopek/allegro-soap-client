/**
 * UserIncomingPaymentRefundsStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pl.net.yuri.magister.soap;

public class UserIncomingPaymentRefundsStruct implements java.io.Serializable {
    private long payRefundTransId;

    private long payRefundItId;

    private int payRefundBuyerId;

    private float payRefundValue;

    private java.lang.String payRefundReason;

    private long payRefundDate;

    public UserIncomingPaymentRefundsStruct() {
    }

    public UserIncomingPaymentRefundsStruct(
            long payRefundTransId,
            long payRefundItId,
            int payRefundBuyerId,
            float payRefundValue,
            java.lang.String payRefundReason,
            long payRefundDate) {
        this.payRefundTransId = payRefundTransId;
        this.payRefundItId = payRefundItId;
        this.payRefundBuyerId = payRefundBuyerId;
        this.payRefundValue = payRefundValue;
        this.payRefundReason = payRefundReason;
        this.payRefundDate = payRefundDate;
    }


    /**
     * Gets the payRefundTransId value for this UserIncomingPaymentRefundsStruct.
     *
     * @return payRefundTransId
     */
    public long getPayRefundTransId() {
        return payRefundTransId;
    }


    /**
     * Sets the payRefundTransId value for this UserIncomingPaymentRefundsStruct.
     *
     * @param payRefundTransId
     */
    public void setPayRefundTransId(long payRefundTransId) {
        this.payRefundTransId = payRefundTransId;
    }


    /**
     * Gets the payRefundItId value for this UserIncomingPaymentRefundsStruct.
     *
     * @return payRefundItId
     */
    public long getPayRefundItId() {
        return payRefundItId;
    }


    /**
     * Sets the payRefundItId value for this UserIncomingPaymentRefundsStruct.
     *
     * @param payRefundItId
     */
    public void setPayRefundItId(long payRefundItId) {
        this.payRefundItId = payRefundItId;
    }


    /**
     * Gets the payRefundBuyerId value for this UserIncomingPaymentRefundsStruct.
     *
     * @return payRefundBuyerId
     */
    public int getPayRefundBuyerId() {
        return payRefundBuyerId;
    }


    /**
     * Sets the payRefundBuyerId value for this UserIncomingPaymentRefundsStruct.
     *
     * @param payRefundBuyerId
     */
    public void setPayRefundBuyerId(int payRefundBuyerId) {
        this.payRefundBuyerId = payRefundBuyerId;
    }


    /**
     * Gets the payRefundValue value for this UserIncomingPaymentRefundsStruct.
     *
     * @return payRefundValue
     */
    public float getPayRefundValue() {
        return payRefundValue;
    }


    /**
     * Sets the payRefundValue value for this UserIncomingPaymentRefundsStruct.
     *
     * @param payRefundValue
     */
    public void setPayRefundValue(float payRefundValue) {
        this.payRefundValue = payRefundValue;
    }


    /**
     * Gets the payRefundReason value for this UserIncomingPaymentRefundsStruct.
     *
     * @return payRefundReason
     */
    public java.lang.String getPayRefundReason() {
        return payRefundReason;
    }


    /**
     * Sets the payRefundReason value for this UserIncomingPaymentRefundsStruct.
     *
     * @param payRefundReason
     */
    public void setPayRefundReason(java.lang.String payRefundReason) {
        this.payRefundReason = payRefundReason;
    }


    /**
     * Gets the payRefundDate value for this UserIncomingPaymentRefundsStruct.
     *
     * @return payRefundDate
     */
    public long getPayRefundDate() {
        return payRefundDate;
    }


    /**
     * Sets the payRefundDate value for this UserIncomingPaymentRefundsStruct.
     *
     * @param payRefundDate
     */
    public void setPayRefundDate(long payRefundDate) {
        this.payRefundDate = payRefundDate;
    }

    private java.lang.Object __equalsCalc = null;

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UserIncomingPaymentRefundsStruct)) return false;
        UserIncomingPaymentRefundsStruct other = (UserIncomingPaymentRefundsStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                this.payRefundTransId == other.getPayRefundTransId() &&
                this.payRefundItId == other.getPayRefundItId() &&
                this.payRefundBuyerId == other.getPayRefundBuyerId() &&
                this.payRefundValue == other.getPayRefundValue() &&
                ((this.payRefundReason == null && other.getPayRefundReason() == null) ||
                        (this.payRefundReason != null &&
                                this.payRefundReason.equals(other.getPayRefundReason()))) &&
                this.payRefundDate == other.getPayRefundDate();
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
        _hashCode += new Long(getPayRefundTransId()).hashCode();
        _hashCode += new Long(getPayRefundItId()).hashCode();
        _hashCode += getPayRefundBuyerId();
        _hashCode += new Float(getPayRefundValue()).hashCode();
        if (getPayRefundReason() != null) {
            _hashCode += getPayRefundReason().hashCode();
        }
        _hashCode += new Long(getPayRefundDate()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(UserIncomingPaymentRefundsStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:AllegroWebApi", "UserIncomingPaymentRefundsStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payRefundTransId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pay-refund-trans-id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payRefundItId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pay-refund-it-id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payRefundBuyerId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pay-refund-buyer-id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payRefundValue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pay-refund-value"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payRefundReason");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pay-refund-reason"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payRefundDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pay-refund-date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
