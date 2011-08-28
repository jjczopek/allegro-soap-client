/**
 * RefundFormStatusResultStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pl.net.yuri.magister.soap;

public class RefundFormStatusResultStruct implements java.io.Serializable {
    private long itemId;

    private int buyerId;

    private int refundFormStatus;

    public RefundFormStatusResultStruct() {
    }

    public RefundFormStatusResultStruct(
            long itemId,
            int buyerId,
            int refundFormStatus) {
        this.itemId = itemId;
        this.buyerId = buyerId;
        this.refundFormStatus = refundFormStatus;
    }


    /**
     * Gets the itemId value for this RefundFormStatusResultStruct.
     *
     * @return itemId
     */
    public long getItemId() {
        return itemId;
    }


    /**
     * Sets the itemId value for this RefundFormStatusResultStruct.
     *
     * @param itemId
     */
    public void setItemId(long itemId) {
        this.itemId = itemId;
    }


    /**
     * Gets the buyerId value for this RefundFormStatusResultStruct.
     *
     * @return buyerId
     */
    public int getBuyerId() {
        return buyerId;
    }


    /**
     * Sets the buyerId value for this RefundFormStatusResultStruct.
     *
     * @param buyerId
     */
    public void setBuyerId(int buyerId) {
        this.buyerId = buyerId;
    }


    /**
     * Gets the refundFormStatus value for this RefundFormStatusResultStruct.
     *
     * @return refundFormStatus
     */
    public int getRefundFormStatus() {
        return refundFormStatus;
    }


    /**
     * Sets the refundFormStatus value for this RefundFormStatusResultStruct.
     *
     * @param refundFormStatus
     */
    public void setRefundFormStatus(int refundFormStatus) {
        this.refundFormStatus = refundFormStatus;
    }

    private java.lang.Object __equalsCalc = null;

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RefundFormStatusResultStruct)) return false;
        RefundFormStatusResultStruct other = (RefundFormStatusResultStruct) obj;
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
                this.refundFormStatus == other.getRefundFormStatus();
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
        _hashCode += getRefundFormStatus();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(RefundFormStatusResultStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:AllegroWebApi", "RefundFormStatusResultStruct"));
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
        elemField.setFieldName("refundFormStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "refund-form-status"));
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
