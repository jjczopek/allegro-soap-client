/**
 * SendRefundFormResultStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pl.net.yuri.magister.soap;

public class SendRefundFormResultStruct implements java.io.Serializable {
    private long itemId;

    private int buyerId;

    private int sendRefundResult;

    private java.lang.String sendRefundErrCode;

    private java.lang.String sendRefundErrMsg;

    public SendRefundFormResultStruct() {
    }

    public SendRefundFormResultStruct(
            long itemId,
            int buyerId,
            int sendRefundResult,
            java.lang.String sendRefundErrCode,
            java.lang.String sendRefundErrMsg) {
        this.itemId = itemId;
        this.buyerId = buyerId;
        this.sendRefundResult = sendRefundResult;
        this.sendRefundErrCode = sendRefundErrCode;
        this.sendRefundErrMsg = sendRefundErrMsg;
    }


    /**
     * Gets the itemId value for this SendRefundFormResultStruct.
     *
     * @return itemId
     */
    public long getItemId() {
        return itemId;
    }


    /**
     * Sets the itemId value for this SendRefundFormResultStruct.
     *
     * @param itemId
     */
    public void setItemId(long itemId) {
        this.itemId = itemId;
    }


    /**
     * Gets the buyerId value for this SendRefundFormResultStruct.
     *
     * @return buyerId
     */
    public int getBuyerId() {
        return buyerId;
    }


    /**
     * Sets the buyerId value for this SendRefundFormResultStruct.
     *
     * @param buyerId
     */
    public void setBuyerId(int buyerId) {
        this.buyerId = buyerId;
    }


    /**
     * Gets the sendRefundResult value for this SendRefundFormResultStruct.
     *
     * @return sendRefundResult
     */
    public int getSendRefundResult() {
        return sendRefundResult;
    }


    /**
     * Sets the sendRefundResult value for this SendRefundFormResultStruct.
     *
     * @param sendRefundResult
     */
    public void setSendRefundResult(int sendRefundResult) {
        this.sendRefundResult = sendRefundResult;
    }


    /**
     * Gets the sendRefundErrCode value for this SendRefundFormResultStruct.
     *
     * @return sendRefundErrCode
     */
    public java.lang.String getSendRefundErrCode() {
        return sendRefundErrCode;
    }


    /**
     * Sets the sendRefundErrCode value for this SendRefundFormResultStruct.
     *
     * @param sendRefundErrCode
     */
    public void setSendRefundErrCode(java.lang.String sendRefundErrCode) {
        this.sendRefundErrCode = sendRefundErrCode;
    }


    /**
     * Gets the sendRefundErrMsg value for this SendRefundFormResultStruct.
     *
     * @return sendRefundErrMsg
     */
    public java.lang.String getSendRefundErrMsg() {
        return sendRefundErrMsg;
    }


    /**
     * Sets the sendRefundErrMsg value for this SendRefundFormResultStruct.
     *
     * @param sendRefundErrMsg
     */
    public void setSendRefundErrMsg(java.lang.String sendRefundErrMsg) {
        this.sendRefundErrMsg = sendRefundErrMsg;
    }

    private java.lang.Object __equalsCalc = null;

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SendRefundFormResultStruct)) return false;
        SendRefundFormResultStruct other = (SendRefundFormResultStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                this.itemId == other.getItemId() &&
                this.buyerId == other.getBuyerId() &&
                this.sendRefundResult == other.getSendRefundResult() &&
                ((this.sendRefundErrCode == null && other.getSendRefundErrCode() == null) ||
                        (this.sendRefundErrCode != null &&
                                this.sendRefundErrCode.equals(other.getSendRefundErrCode()))) &&
                ((this.sendRefundErrMsg == null && other.getSendRefundErrMsg() == null) ||
                        (this.sendRefundErrMsg != null &&
                                this.sendRefundErrMsg.equals(other.getSendRefundErrMsg())));
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
        _hashCode += new Long(getItemId()).hashCode();
        _hashCode += getBuyerId();
        _hashCode += getSendRefundResult();
        if (getSendRefundErrCode() != null) {
            _hashCode += getSendRefundErrCode().hashCode();
        }
        if (getSendRefundErrMsg() != null) {
            _hashCode += getSendRefundErrMsg().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(SendRefundFormResultStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:AllegroWebApi", "SendRefundFormResultStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "item-id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("buyerId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "buyer-id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sendRefundResult");
        elemField.setXmlName(new javax.xml.namespace.QName("", "send-refund-result"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sendRefundErrCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "send-refund-err-code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sendRefundErrMsg");
        elemField.setXmlName(new javax.xml.namespace.QName("", "send-refund-err-msg"));
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
