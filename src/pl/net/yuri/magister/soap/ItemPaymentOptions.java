/**
 * ItemPaymentOptions.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pl.net.yuri.magister.soap;

public class ItemPaymentOptions implements java.io.Serializable {
    private int payOptionTransfer;

    private int payOptionOnDelivery;

    private int payOptionAllegroPay;

    private int payOptionSeeDesc;

    private int payOptionPayu;

    private int payOptionEscrow;

    private int payOptionQiwi;

    public ItemPaymentOptions() {
    }

    public ItemPaymentOptions(
            int payOptionTransfer,
            int payOptionOnDelivery,
            int payOptionAllegroPay,
            int payOptionSeeDesc,
            int payOptionPayu,
            int payOptionEscrow,
            int payOptionQiwi) {
        this.payOptionTransfer = payOptionTransfer;
        this.payOptionOnDelivery = payOptionOnDelivery;
        this.payOptionAllegroPay = payOptionAllegroPay;
        this.payOptionSeeDesc = payOptionSeeDesc;
        this.payOptionPayu = payOptionPayu;
        this.payOptionEscrow = payOptionEscrow;
        this.payOptionQiwi = payOptionQiwi;
    }


    /**
     * Gets the payOptionTransfer value for this ItemPaymentOptions.
     *
     * @return payOptionTransfer
     */
    public int getPayOptionTransfer() {
        return payOptionTransfer;
    }


    /**
     * Sets the payOptionTransfer value for this ItemPaymentOptions.
     *
     * @param payOptionTransfer
     */
    public void setPayOptionTransfer(int payOptionTransfer) {
        this.payOptionTransfer = payOptionTransfer;
    }


    /**
     * Gets the payOptionOnDelivery value for this ItemPaymentOptions.
     *
     * @return payOptionOnDelivery
     */
    public int getPayOptionOnDelivery() {
        return payOptionOnDelivery;
    }


    /**
     * Sets the payOptionOnDelivery value for this ItemPaymentOptions.
     *
     * @param payOptionOnDelivery
     */
    public void setPayOptionOnDelivery(int payOptionOnDelivery) {
        this.payOptionOnDelivery = payOptionOnDelivery;
    }


    /**
     * Gets the payOptionAllegroPay value for this ItemPaymentOptions.
     *
     * @return payOptionAllegroPay
     */
    public int getPayOptionAllegroPay() {
        return payOptionAllegroPay;
    }


    /**
     * Sets the payOptionAllegroPay value for this ItemPaymentOptions.
     *
     * @param payOptionAllegroPay
     */
    public void setPayOptionAllegroPay(int payOptionAllegroPay) {
        this.payOptionAllegroPay = payOptionAllegroPay;
    }


    /**
     * Gets the payOptionSeeDesc value for this ItemPaymentOptions.
     *
     * @return payOptionSeeDesc
     */
    public int getPayOptionSeeDesc() {
        return payOptionSeeDesc;
    }


    /**
     * Sets the payOptionSeeDesc value for this ItemPaymentOptions.
     *
     * @param payOptionSeeDesc
     */
    public void setPayOptionSeeDesc(int payOptionSeeDesc) {
        this.payOptionSeeDesc = payOptionSeeDesc;
    }


    /**
     * Gets the payOptionPayu value for this ItemPaymentOptions.
     *
     * @return payOptionPayu
     */
    public int getPayOptionPayu() {
        return payOptionPayu;
    }


    /**
     * Sets the payOptionPayu value for this ItemPaymentOptions.
     *
     * @param payOptionPayu
     */
    public void setPayOptionPayu(int payOptionPayu) {
        this.payOptionPayu = payOptionPayu;
    }


    /**
     * Gets the payOptionEscrow value for this ItemPaymentOptions.
     *
     * @return payOptionEscrow
     */
    public int getPayOptionEscrow() {
        return payOptionEscrow;
    }


    /**
     * Sets the payOptionEscrow value for this ItemPaymentOptions.
     *
     * @param payOptionEscrow
     */
    public void setPayOptionEscrow(int payOptionEscrow) {
        this.payOptionEscrow = payOptionEscrow;
    }


    /**
     * Gets the payOptionQiwi value for this ItemPaymentOptions.
     *
     * @return payOptionQiwi
     */
    public int getPayOptionQiwi() {
        return payOptionQiwi;
    }


    /**
     * Sets the payOptionQiwi value for this ItemPaymentOptions.
     *
     * @param payOptionQiwi
     */
    public void setPayOptionQiwi(int payOptionQiwi) {
        this.payOptionQiwi = payOptionQiwi;
    }

    private java.lang.Object __equalsCalc = null;

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ItemPaymentOptions)) return false;
        ItemPaymentOptions other = (ItemPaymentOptions) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                this.payOptionTransfer == other.getPayOptionTransfer() &&
                this.payOptionOnDelivery == other.getPayOptionOnDelivery() &&
                this.payOptionAllegroPay == other.getPayOptionAllegroPay() &&
                this.payOptionSeeDesc == other.getPayOptionSeeDesc() &&
                this.payOptionPayu == other.getPayOptionPayu() &&
                this.payOptionEscrow == other.getPayOptionEscrow() &&
                this.payOptionQiwi == other.getPayOptionQiwi();
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
        _hashCode += getPayOptionTransfer();
        _hashCode += getPayOptionOnDelivery();
        _hashCode += getPayOptionAllegroPay();
        _hashCode += getPayOptionSeeDesc();
        _hashCode += getPayOptionPayu();
        _hashCode += getPayOptionEscrow();
        _hashCode += getPayOptionQiwi();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(ItemPaymentOptions.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:AllegroWebApi", "ItemPaymentOptions"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payOptionTransfer");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pay-option-transfer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payOptionOnDelivery");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pay-option-on-delivery"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payOptionAllegroPay");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pay-option-allegro-pay"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payOptionSeeDesc");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pay-option-see-desc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payOptionPayu");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pay-option-payu"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payOptionEscrow");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pay-option-escrow"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payOptionQiwi");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pay-option-qiwi"));
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
