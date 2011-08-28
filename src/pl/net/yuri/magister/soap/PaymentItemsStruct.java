/**
 * PaymentItemsStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pl.net.yuri.magister.soap;

public class PaymentItemsStruct implements java.io.Serializable {
    private long payTransItId;

    private java.lang.String payTransItName;

    private int payTransItCount;

    private float payTransItPrice;

    public PaymentItemsStruct() {
    }

    public PaymentItemsStruct(
            long payTransItId,
            java.lang.String payTransItName,
            int payTransItCount,
            float payTransItPrice) {
        this.payTransItId = payTransItId;
        this.payTransItName = payTransItName;
        this.payTransItCount = payTransItCount;
        this.payTransItPrice = payTransItPrice;
    }


    /**
     * Gets the payTransItId value for this PaymentItemsStruct.
     *
     * @return payTransItId
     */
    public long getPayTransItId() {
        return payTransItId;
    }


    /**
     * Sets the payTransItId value for this PaymentItemsStruct.
     *
     * @param payTransItId
     */
    public void setPayTransItId(long payTransItId) {
        this.payTransItId = payTransItId;
    }


    /**
     * Gets the payTransItName value for this PaymentItemsStruct.
     *
     * @return payTransItName
     */
    public java.lang.String getPayTransItName() {
        return payTransItName;
    }


    /**
     * Sets the payTransItName value for this PaymentItemsStruct.
     *
     * @param payTransItName
     */
    public void setPayTransItName(java.lang.String payTransItName) {
        this.payTransItName = payTransItName;
    }


    /**
     * Gets the payTransItCount value for this PaymentItemsStruct.
     *
     * @return payTransItCount
     */
    public int getPayTransItCount() {
        return payTransItCount;
    }


    /**
     * Sets the payTransItCount value for this PaymentItemsStruct.
     *
     * @param payTransItCount
     */
    public void setPayTransItCount(int payTransItCount) {
        this.payTransItCount = payTransItCount;
    }


    /**
     * Gets the payTransItPrice value for this PaymentItemsStruct.
     *
     * @return payTransItPrice
     */
    public float getPayTransItPrice() {
        return payTransItPrice;
    }


    /**
     * Sets the payTransItPrice value for this PaymentItemsStruct.
     *
     * @param payTransItPrice
     */
    public void setPayTransItPrice(float payTransItPrice) {
        this.payTransItPrice = payTransItPrice;
    }

    private java.lang.Object __equalsCalc = null;

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PaymentItemsStruct)) return false;
        PaymentItemsStruct other = (PaymentItemsStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                this.payTransItId == other.getPayTransItId() &&
                ((this.payTransItName == null && other.getPayTransItName() == null) ||
                        (this.payTransItName != null &&
                                this.payTransItName.equals(other.getPayTransItName()))) &&
                this.payTransItCount == other.getPayTransItCount() &&
                this.payTransItPrice == other.getPayTransItPrice();
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
        _hashCode += new Long(getPayTransItId()).hashCode();
        if (getPayTransItName() != null) {
            _hashCode += getPayTransItName().hashCode();
        }
        _hashCode += getPayTransItCount();
        _hashCode += new Float(getPayTransItPrice()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(PaymentItemsStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:AllegroWebApi", "PaymentItemsStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payTransItId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pay-trans-it-id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payTransItName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pay-trans-it-name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payTransItCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pay-trans-it-count"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payTransItPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pay-trans-it-price"));
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
