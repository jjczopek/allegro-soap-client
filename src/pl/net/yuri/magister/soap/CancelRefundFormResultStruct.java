/**
 * CancelRefundFormResultStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pl.net.yuri.magister.soap;

public class CancelRefundFormResultStruct implements java.io.Serializable {
    private long itemId;

    private int buyerId;

    private int cancelRefundResult;

    private java.lang.String cancelRefundErrCode;

    private java.lang.String cancelRefundErrMsg;

    public CancelRefundFormResultStruct() {
    }

    public CancelRefundFormResultStruct(
            long itemId,
            int buyerId,
            int cancelRefundResult,
            java.lang.String cancelRefundErrCode,
            java.lang.String cancelRefundErrMsg) {
        this.itemId = itemId;
        this.buyerId = buyerId;
        this.cancelRefundResult = cancelRefundResult;
        this.cancelRefundErrCode = cancelRefundErrCode;
        this.cancelRefundErrMsg = cancelRefundErrMsg;
    }


    /**
     * Gets the itemId value for this CancelRefundFormResultStruct.
     *
     * @return itemId
     */
    public long getItemId() {
        return itemId;
    }


    /**
     * Sets the itemId value for this CancelRefundFormResultStruct.
     *
     * @param itemId
     */
    public void setItemId(long itemId) {
        this.itemId = itemId;
    }


    /**
     * Gets the buyerId value for this CancelRefundFormResultStruct.
     *
     * @return buyerId
     */
    public int getBuyerId() {
        return buyerId;
    }


    /**
     * Sets the buyerId value for this CancelRefundFormResultStruct.
     *
     * @param buyerId
     */
    public void setBuyerId(int buyerId) {
        this.buyerId = buyerId;
    }


    /**
     * Gets the cancelRefundResult value for this CancelRefundFormResultStruct.
     *
     * @return cancelRefundResult
     */
    public int getCancelRefundResult() {
        return cancelRefundResult;
    }


    /**
     * Sets the cancelRefundResult value for this CancelRefundFormResultStruct.
     *
     * @param cancelRefundResult
     */
    public void setCancelRefundResult(int cancelRefundResult) {
        this.cancelRefundResult = cancelRefundResult;
    }


    /**
     * Gets the cancelRefundErrCode value for this CancelRefundFormResultStruct.
     *
     * @return cancelRefundErrCode
     */
    public java.lang.String getCancelRefundErrCode() {
        return cancelRefundErrCode;
    }


    /**
     * Sets the cancelRefundErrCode value for this CancelRefundFormResultStruct.
     *
     * @param cancelRefundErrCode
     */
    public void setCancelRefundErrCode(java.lang.String cancelRefundErrCode) {
        this.cancelRefundErrCode = cancelRefundErrCode;
    }


    /**
     * Gets the cancelRefundErrMsg value for this CancelRefundFormResultStruct.
     *
     * @return cancelRefundErrMsg
     */
    public java.lang.String getCancelRefundErrMsg() {
        return cancelRefundErrMsg;
    }


    /**
     * Sets the cancelRefundErrMsg value for this CancelRefundFormResultStruct.
     *
     * @param cancelRefundErrMsg
     */
    public void setCancelRefundErrMsg(java.lang.String cancelRefundErrMsg) {
        this.cancelRefundErrMsg = cancelRefundErrMsg;
    }

    private java.lang.Object __equalsCalc = null;

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CancelRefundFormResultStruct)) return false;
        CancelRefundFormResultStruct other = (CancelRefundFormResultStruct) obj;
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
                this.cancelRefundResult == other.getCancelRefundResult() &&
                ((this.cancelRefundErrCode == null && other.getCancelRefundErrCode() == null) ||
                        (this.cancelRefundErrCode != null &&
                                this.cancelRefundErrCode.equals(other.getCancelRefundErrCode()))) &&
                ((this.cancelRefundErrMsg == null && other.getCancelRefundErrMsg() == null) ||
                        (this.cancelRefundErrMsg != null &&
                                this.cancelRefundErrMsg.equals(other.getCancelRefundErrMsg())));
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
        _hashCode += getCancelRefundResult();
        if (getCancelRefundErrCode() != null) {
            _hashCode += getCancelRefundErrCode().hashCode();
        }
        if (getCancelRefundErrMsg() != null) {
            _hashCode += getCancelRefundErrMsg().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(CancelRefundFormResultStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:AllegroWebApi", "CancelRefundFormResultStruct"));
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
        elemField.setFieldName("cancelRefundResult");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cancel-refund-result"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cancelRefundErrCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cancel-refund-err-code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cancelRefundErrMsg");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cancel-refund-err-msg"));
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
