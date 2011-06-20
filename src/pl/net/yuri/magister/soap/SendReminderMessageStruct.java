/**
 * SendReminderMessageStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pl.net.yuri.magister.soap;

public class SendReminderMessageStruct implements java.io.Serializable {
    private long itemId;

    private int buyerId;

    private java.lang.String messageBody;

    private int includeMyData;

    private int sendCcToMe;

    public SendReminderMessageStruct() {
    }

    public SendReminderMessageStruct(
            long itemId,
            int buyerId,
            java.lang.String messageBody,
            int includeMyData,
            int sendCcToMe) {
        this.itemId = itemId;
        this.buyerId = buyerId;
        this.messageBody = messageBody;
        this.includeMyData = includeMyData;
        this.sendCcToMe = sendCcToMe;
    }


    /**
     * Gets the itemId value for this SendReminderMessageStruct.
     *
     * @return itemId
     */
    public long getItemId() {
        return itemId;
    }


    /**
     * Sets the itemId value for this SendReminderMessageStruct.
     *
     * @param itemId
     */
    public void setItemId(long itemId) {
        this.itemId = itemId;
    }


    /**
     * Gets the buyerId value for this SendReminderMessageStruct.
     *
     * @return buyerId
     */
    public int getBuyerId() {
        return buyerId;
    }


    /**
     * Sets the buyerId value for this SendReminderMessageStruct.
     *
     * @param buyerId
     */
    public void setBuyerId(int buyerId) {
        this.buyerId = buyerId;
    }


    /**
     * Gets the messageBody value for this SendReminderMessageStruct.
     *
     * @return messageBody
     */
    public java.lang.String getMessageBody() {
        return messageBody;
    }


    /**
     * Sets the messageBody value for this SendReminderMessageStruct.
     *
     * @param messageBody
     */
    public void setMessageBody(java.lang.String messageBody) {
        this.messageBody = messageBody;
    }


    /**
     * Gets the includeMyData value for this SendReminderMessageStruct.
     *
     * @return includeMyData
     */
    public int getIncludeMyData() {
        return includeMyData;
    }


    /**
     * Sets the includeMyData value for this SendReminderMessageStruct.
     *
     * @param includeMyData
     */
    public void setIncludeMyData(int includeMyData) {
        this.includeMyData = includeMyData;
    }


    /**
     * Gets the sendCcToMe value for this SendReminderMessageStruct.
     *
     * @return sendCcToMe
     */
    public int getSendCcToMe() {
        return sendCcToMe;
    }


    /**
     * Sets the sendCcToMe value for this SendReminderMessageStruct.
     *
     * @param sendCcToMe
     */
    public void setSendCcToMe(int sendCcToMe) {
        this.sendCcToMe = sendCcToMe;
    }

    private java.lang.Object __equalsCalc = null;

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SendReminderMessageStruct)) return false;
        SendReminderMessageStruct other = (SendReminderMessageStruct) obj;
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
                ((this.messageBody == null && other.getMessageBody() == null) ||
                        (this.messageBody != null &&
                                this.messageBody.equals(other.getMessageBody()))) &&
                this.includeMyData == other.getIncludeMyData() &&
                this.sendCcToMe == other.getSendCcToMe();
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
        if (getMessageBody() != null) {
            _hashCode += getMessageBody().hashCode();
        }
        _hashCode += getIncludeMyData();
        _hashCode += getSendCcToMe();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(SendReminderMessageStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:AllegroWebApi", "SendReminderMessageStruct"));
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
        elemField.setFieldName("messageBody");
        elemField.setXmlName(new javax.xml.namespace.QName("", "message-body"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("includeMyData");
        elemField.setXmlName(new javax.xml.namespace.QName("", "include-my-data"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sendCcToMe");
        elemField.setXmlName(new javax.xml.namespace.QName("", "send-cc-to-me"));
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
