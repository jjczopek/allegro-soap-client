/**
 * SendReminderMessageResultStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pl.net.yuri.magister.soap;

public class SendReminderMessageResultStruct implements java.io.Serializable {
    private long itemId;

    private int buyerId;

    private int reminderMsgResult;

    private java.lang.String reminderMsgErrCode;

    private java.lang.String reminderMsgErrMsg;

    public SendReminderMessageResultStruct() {
    }

    public SendReminderMessageResultStruct(
            long itemId,
            int buyerId,
            int reminderMsgResult,
            java.lang.String reminderMsgErrCode,
            java.lang.String reminderMsgErrMsg) {
        this.itemId = itemId;
        this.buyerId = buyerId;
        this.reminderMsgResult = reminderMsgResult;
        this.reminderMsgErrCode = reminderMsgErrCode;
        this.reminderMsgErrMsg = reminderMsgErrMsg;
    }


    /**
     * Gets the itemId value for this SendReminderMessageResultStruct.
     *
     * @return itemId
     */
    public long getItemId() {
        return itemId;
    }


    /**
     * Sets the itemId value for this SendReminderMessageResultStruct.
     *
     * @param itemId
     */
    public void setItemId(long itemId) {
        this.itemId = itemId;
    }


    /**
     * Gets the buyerId value for this SendReminderMessageResultStruct.
     *
     * @return buyerId
     */
    public int getBuyerId() {
        return buyerId;
    }


    /**
     * Sets the buyerId value for this SendReminderMessageResultStruct.
     *
     * @param buyerId
     */
    public void setBuyerId(int buyerId) {
        this.buyerId = buyerId;
    }


    /**
     * Gets the reminderMsgResult value for this SendReminderMessageResultStruct.
     *
     * @return reminderMsgResult
     */
    public int getReminderMsgResult() {
        return reminderMsgResult;
    }


    /**
     * Sets the reminderMsgResult value for this SendReminderMessageResultStruct.
     *
     * @param reminderMsgResult
     */
    public void setReminderMsgResult(int reminderMsgResult) {
        this.reminderMsgResult = reminderMsgResult;
    }


    /**
     * Gets the reminderMsgErrCode value for this SendReminderMessageResultStruct.
     *
     * @return reminderMsgErrCode
     */
    public java.lang.String getReminderMsgErrCode() {
        return reminderMsgErrCode;
    }


    /**
     * Sets the reminderMsgErrCode value for this SendReminderMessageResultStruct.
     *
     * @param reminderMsgErrCode
     */
    public void setReminderMsgErrCode(java.lang.String reminderMsgErrCode) {
        this.reminderMsgErrCode = reminderMsgErrCode;
    }


    /**
     * Gets the reminderMsgErrMsg value for this SendReminderMessageResultStruct.
     *
     * @return reminderMsgErrMsg
     */
    public java.lang.String getReminderMsgErrMsg() {
        return reminderMsgErrMsg;
    }


    /**
     * Sets the reminderMsgErrMsg value for this SendReminderMessageResultStruct.
     *
     * @param reminderMsgErrMsg
     */
    public void setReminderMsgErrMsg(java.lang.String reminderMsgErrMsg) {
        this.reminderMsgErrMsg = reminderMsgErrMsg;
    }

    private java.lang.Object __equalsCalc = null;

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SendReminderMessageResultStruct)) return false;
        SendReminderMessageResultStruct other = (SendReminderMessageResultStruct) obj;
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
                this.reminderMsgResult == other.getReminderMsgResult() &&
                ((this.reminderMsgErrCode == null && other.getReminderMsgErrCode() == null) ||
                        (this.reminderMsgErrCode != null &&
                                this.reminderMsgErrCode.equals(other.getReminderMsgErrCode()))) &&
                ((this.reminderMsgErrMsg == null && other.getReminderMsgErrMsg() == null) ||
                        (this.reminderMsgErrMsg != null &&
                                this.reminderMsgErrMsg.equals(other.getReminderMsgErrMsg())));
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
        _hashCode += getReminderMsgResult();
        if (getReminderMsgErrCode() != null) {
            _hashCode += getReminderMsgErrCode().hashCode();
        }
        if (getReminderMsgErrMsg() != null) {
            _hashCode += getReminderMsgErrMsg().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(SendReminderMessageResultStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:AllegroWebApi", "SendReminderMessageResultStruct"));
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
        elemField.setFieldName("reminderMsgResult");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reminder-msg-result"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reminderMsgErrCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reminder-msg-err-code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reminderMsgErrMsg");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reminder-msg-err-msg"));
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
