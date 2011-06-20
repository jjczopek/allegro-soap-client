/**
 * PaymentDetailsStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pl.net.yuri.magister.soap;

public class PaymentDetailsStruct implements java.io.Serializable {
    private long payTransDetailsItId;

    private float payTransDetailsPrice;

    private int payTransDetailsCount;

    public PaymentDetailsStruct() {
    }

    public PaymentDetailsStruct(
            long payTransDetailsItId,
            float payTransDetailsPrice,
            int payTransDetailsCount) {
        this.payTransDetailsItId = payTransDetailsItId;
        this.payTransDetailsPrice = payTransDetailsPrice;
        this.payTransDetailsCount = payTransDetailsCount;
    }


    /**
     * Gets the payTransDetailsItId value for this PaymentDetailsStruct.
     *
     * @return payTransDetailsItId
     */
    public long getPayTransDetailsItId() {
        return payTransDetailsItId;
    }


    /**
     * Sets the payTransDetailsItId value for this PaymentDetailsStruct.
     *
     * @param payTransDetailsItId
     */
    public void setPayTransDetailsItId(long payTransDetailsItId) {
        this.payTransDetailsItId = payTransDetailsItId;
    }


    /**
     * Gets the payTransDetailsPrice value for this PaymentDetailsStruct.
     *
     * @return payTransDetailsPrice
     */
    public float getPayTransDetailsPrice() {
        return payTransDetailsPrice;
    }


    /**
     * Sets the payTransDetailsPrice value for this PaymentDetailsStruct.
     *
     * @param payTransDetailsPrice
     */
    public void setPayTransDetailsPrice(float payTransDetailsPrice) {
        this.payTransDetailsPrice = payTransDetailsPrice;
    }


    /**
     * Gets the payTransDetailsCount value for this PaymentDetailsStruct.
     *
     * @return payTransDetailsCount
     */
    public int getPayTransDetailsCount() {
        return payTransDetailsCount;
    }


    /**
     * Sets the payTransDetailsCount value for this PaymentDetailsStruct.
     *
     * @param payTransDetailsCount
     */
    public void setPayTransDetailsCount(int payTransDetailsCount) {
        this.payTransDetailsCount = payTransDetailsCount;
    }

    private java.lang.Object __equalsCalc = null;

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PaymentDetailsStruct)) return false;
        PaymentDetailsStruct other = (PaymentDetailsStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                this.payTransDetailsItId == other.getPayTransDetailsItId() &&
                this.payTransDetailsPrice == other.getPayTransDetailsPrice() &&
                this.payTransDetailsCount == other.getPayTransDetailsCount();
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
        _hashCode += new Long(getPayTransDetailsItId()).hashCode();
        _hashCode += new Float(getPayTransDetailsPrice()).hashCode();
        _hashCode += getPayTransDetailsCount();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(PaymentDetailsStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:AllegroWebApi", "PaymentDetailsStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payTransDetailsItId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pay-trans-details-it-id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payTransDetailsPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pay-trans-details-price"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payTransDetailsCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pay-trans-details-count"));
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
