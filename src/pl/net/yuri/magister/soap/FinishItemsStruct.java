/**
 * FinishItemsStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pl.net.yuri.magister.soap;

public class FinishItemsStruct implements java.io.Serializable {
    private long finishItemId;

    private int finishCancelAllBids;

    private java.lang.String finishCancelReason;

    public FinishItemsStruct() {
    }

    public FinishItemsStruct(
            long finishItemId,
            int finishCancelAllBids,
            java.lang.String finishCancelReason) {
        this.finishItemId = finishItemId;
        this.finishCancelAllBids = finishCancelAllBids;
        this.finishCancelReason = finishCancelReason;
    }


    /**
     * Gets the finishItemId value for this FinishItemsStruct.
     *
     * @return finishItemId
     */
    public long getFinishItemId() {
        return finishItemId;
    }


    /**
     * Sets the finishItemId value for this FinishItemsStruct.
     *
     * @param finishItemId
     */
    public void setFinishItemId(long finishItemId) {
        this.finishItemId = finishItemId;
    }


    /**
     * Gets the finishCancelAllBids value for this FinishItemsStruct.
     *
     * @return finishCancelAllBids
     */
    public int getFinishCancelAllBids() {
        return finishCancelAllBids;
    }


    /**
     * Sets the finishCancelAllBids value for this FinishItemsStruct.
     *
     * @param finishCancelAllBids
     */
    public void setFinishCancelAllBids(int finishCancelAllBids) {
        this.finishCancelAllBids = finishCancelAllBids;
    }


    /**
     * Gets the finishCancelReason value for this FinishItemsStruct.
     *
     * @return finishCancelReason
     */
    public java.lang.String getFinishCancelReason() {
        return finishCancelReason;
    }


    /**
     * Sets the finishCancelReason value for this FinishItemsStruct.
     *
     * @param finishCancelReason
     */
    public void setFinishCancelReason(java.lang.String finishCancelReason) {
        this.finishCancelReason = finishCancelReason;
    }

    private java.lang.Object __equalsCalc = null;

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FinishItemsStruct)) return false;
        FinishItemsStruct other = (FinishItemsStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                this.finishItemId == other.getFinishItemId() &&
                this.finishCancelAllBids == other.getFinishCancelAllBids() &&
                ((this.finishCancelReason == null && other.getFinishCancelReason() == null) ||
                        (this.finishCancelReason != null &&
                                this.finishCancelReason.equals(other.getFinishCancelReason())));
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
        _hashCode += new Long(getFinishItemId()).hashCode();
        _hashCode += getFinishCancelAllBids();
        if (getFinishCancelReason() != null) {
            _hashCode += getFinishCancelReason().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(FinishItemsStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:AllegroWebApi", "FinishItemsStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("finishItemId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "finish-item-id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("finishCancelAllBids");
        elemField.setXmlName(new javax.xml.namespace.QName("", "finish-cancel-all-bids"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("finishCancelReason");
        elemField.setXmlName(new javax.xml.namespace.QName("", "finish-cancel-reason"));
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
