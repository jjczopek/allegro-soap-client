/**
 * CancelRefundWarningResultStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pl.net.yuri.magister.soap;

public class CancelRefundWarningResultStruct implements java.io.Serializable {
    private long itemId;

    private int buyerId;

    private int cancelWarningResult;

    private java.lang.String cancelWarningErrCode;

    private java.lang.String cancelWarningErrMsg;

    public CancelRefundWarningResultStruct() {
    }

    public CancelRefundWarningResultStruct(
            long itemId,
            int buyerId,
            int cancelWarningResult,
            java.lang.String cancelWarningErrCode,
            java.lang.String cancelWarningErrMsg) {
        this.itemId = itemId;
        this.buyerId = buyerId;
        this.cancelWarningResult = cancelWarningResult;
        this.cancelWarningErrCode = cancelWarningErrCode;
        this.cancelWarningErrMsg = cancelWarningErrMsg;
    }


    /**
     * Gets the itemId value for this CancelRefundWarningResultStruct.
     *
     * @return itemId
     */
    public long getItemId() {
        return itemId;
    }


    /**
     * Sets the itemId value for this CancelRefundWarningResultStruct.
     *
     * @param itemId
     */
    public void setItemId(long itemId) {
        this.itemId = itemId;
    }


    /**
     * Gets the buyerId value for this CancelRefundWarningResultStruct.
     *
     * @return buyerId
     */
    public int getBuyerId() {
        return buyerId;
    }


    /**
     * Sets the buyerId value for this CancelRefundWarningResultStruct.
     *
     * @param buyerId
     */
    public void setBuyerId(int buyerId) {
        this.buyerId = buyerId;
    }


    /**
     * Gets the cancelWarningResult value for this CancelRefundWarningResultStruct.
     *
     * @return cancelWarningResult
     */
    public int getCancelWarningResult() {
        return cancelWarningResult;
    }


    /**
     * Sets the cancelWarningResult value for this CancelRefundWarningResultStruct.
     *
     * @param cancelWarningResult
     */
    public void setCancelWarningResult(int cancelWarningResult) {
        this.cancelWarningResult = cancelWarningResult;
    }


    /**
     * Gets the cancelWarningErrCode value for this CancelRefundWarningResultStruct.
     *
     * @return cancelWarningErrCode
     */
    public java.lang.String getCancelWarningErrCode() {
        return cancelWarningErrCode;
    }


    /**
     * Sets the cancelWarningErrCode value for this CancelRefundWarningResultStruct.
     *
     * @param cancelWarningErrCode
     */
    public void setCancelWarningErrCode(java.lang.String cancelWarningErrCode) {
        this.cancelWarningErrCode = cancelWarningErrCode;
    }


    /**
     * Gets the cancelWarningErrMsg value for this CancelRefundWarningResultStruct.
     *
     * @return cancelWarningErrMsg
     */
    public java.lang.String getCancelWarningErrMsg() {
        return cancelWarningErrMsg;
    }


    /**
     * Sets the cancelWarningErrMsg value for this CancelRefundWarningResultStruct.
     *
     * @param cancelWarningErrMsg
     */
    public void setCancelWarningErrMsg(java.lang.String cancelWarningErrMsg) {
        this.cancelWarningErrMsg = cancelWarningErrMsg;
    }

    private java.lang.Object __equalsCalc = null;

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CancelRefundWarningResultStruct)) return false;
        CancelRefundWarningResultStruct other = (CancelRefundWarningResultStruct) obj;
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
                this.cancelWarningResult == other.getCancelWarningResult() &&
                ((this.cancelWarningErrCode == null && other.getCancelWarningErrCode() == null) ||
                        (this.cancelWarningErrCode != null &&
                                this.cancelWarningErrCode.equals(other.getCancelWarningErrCode()))) &&
                ((this.cancelWarningErrMsg == null && other.getCancelWarningErrMsg() == null) ||
                        (this.cancelWarningErrMsg != null &&
                                this.cancelWarningErrMsg.equals(other.getCancelWarningErrMsg())));
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
        _hashCode += getCancelWarningResult();
        if (getCancelWarningErrCode() != null) {
            _hashCode += getCancelWarningErrCode().hashCode();
        }
        if (getCancelWarningErrMsg() != null) {
            _hashCode += getCancelWarningErrMsg().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(CancelRefundWarningResultStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:AllegroWebApi", "CancelRefundWarningResultStruct"));
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
        elemField.setFieldName("cancelWarningResult");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cancel-warning-result"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cancelWarningErrCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cancel-warning-err-code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cancelWarningErrMsg");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cancel-warning-err-msg"));
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
