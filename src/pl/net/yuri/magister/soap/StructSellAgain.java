/**
 * StructSellAgain.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pl.net.yuri.magister.soap;

public class StructSellAgain implements java.io.Serializable {
    private long sellItemId;

    private java.lang.String sellItemInfo;

    private int sellItemLocalId;

    public StructSellAgain() {
    }

    public StructSellAgain(
            long sellItemId,
            java.lang.String sellItemInfo,
            int sellItemLocalId) {
        this.sellItemId = sellItemId;
        this.sellItemInfo = sellItemInfo;
        this.sellItemLocalId = sellItemLocalId;
    }


    /**
     * Gets the sellItemId value for this StructSellAgain.
     *
     * @return sellItemId
     */
    public long getSellItemId() {
        return sellItemId;
    }


    /**
     * Sets the sellItemId value for this StructSellAgain.
     *
     * @param sellItemId
     */
    public void setSellItemId(long sellItemId) {
        this.sellItemId = sellItemId;
    }


    /**
     * Gets the sellItemInfo value for this StructSellAgain.
     *
     * @return sellItemInfo
     */
    public java.lang.String getSellItemInfo() {
        return sellItemInfo;
    }


    /**
     * Sets the sellItemInfo value for this StructSellAgain.
     *
     * @param sellItemInfo
     */
    public void setSellItemInfo(java.lang.String sellItemInfo) {
        this.sellItemInfo = sellItemInfo;
    }


    /**
     * Gets the sellItemLocalId value for this StructSellAgain.
     *
     * @return sellItemLocalId
     */
    public int getSellItemLocalId() {
        return sellItemLocalId;
    }


    /**
     * Sets the sellItemLocalId value for this StructSellAgain.
     *
     * @param sellItemLocalId
     */
    public void setSellItemLocalId(int sellItemLocalId) {
        this.sellItemLocalId = sellItemLocalId;
    }

    private java.lang.Object __equalsCalc = null;

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof StructSellAgain)) return false;
        StructSellAgain other = (StructSellAgain) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                this.sellItemId == other.getSellItemId() &&
                ((this.sellItemInfo == null && other.getSellItemInfo() == null) ||
                        (this.sellItemInfo != null &&
                                this.sellItemInfo.equals(other.getSellItemInfo()))) &&
                this.sellItemLocalId == other.getSellItemLocalId();
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
        _hashCode += new Long(getSellItemId()).hashCode();
        if (getSellItemInfo() != null) {
            _hashCode += getSellItemInfo().hashCode();
        }
        _hashCode += getSellItemLocalId();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(StructSellAgain.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:AllegroWebApi", "StructSellAgain"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sellItemId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sell-item-id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sellItemInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sell-item-info"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sellItemLocalId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sell-item-local-id"));
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
