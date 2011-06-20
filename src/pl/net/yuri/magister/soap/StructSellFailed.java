/**
 * StructSellFailed.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pl.net.yuri.magister.soap;

public class StructSellFailed implements java.io.Serializable {
    private long sellItemId;

    private java.lang.String sellFaultCode;

    private java.lang.String sellFaultString;

    public StructSellFailed() {
    }

    public StructSellFailed(
            long sellItemId,
            java.lang.String sellFaultCode,
            java.lang.String sellFaultString) {
        this.sellItemId = sellItemId;
        this.sellFaultCode = sellFaultCode;
        this.sellFaultString = sellFaultString;
    }


    /**
     * Gets the sellItemId value for this StructSellFailed.
     *
     * @return sellItemId
     */
    public long getSellItemId() {
        return sellItemId;
    }


    /**
     * Sets the sellItemId value for this StructSellFailed.
     *
     * @param sellItemId
     */
    public void setSellItemId(long sellItemId) {
        this.sellItemId = sellItemId;
    }


    /**
     * Gets the sellFaultCode value for this StructSellFailed.
     *
     * @return sellFaultCode
     */
    public java.lang.String getSellFaultCode() {
        return sellFaultCode;
    }


    /**
     * Sets the sellFaultCode value for this StructSellFailed.
     *
     * @param sellFaultCode
     */
    public void setSellFaultCode(java.lang.String sellFaultCode) {
        this.sellFaultCode = sellFaultCode;
    }


    /**
     * Gets the sellFaultString value for this StructSellFailed.
     *
     * @return sellFaultString
     */
    public java.lang.String getSellFaultString() {
        return sellFaultString;
    }


    /**
     * Sets the sellFaultString value for this StructSellFailed.
     *
     * @param sellFaultString
     */
    public void setSellFaultString(java.lang.String sellFaultString) {
        this.sellFaultString = sellFaultString;
    }

    private java.lang.Object __equalsCalc = null;

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof StructSellFailed)) return false;
        StructSellFailed other = (StructSellFailed) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                this.sellItemId == other.getSellItemId() &&
                ((this.sellFaultCode == null && other.getSellFaultCode() == null) ||
                        (this.sellFaultCode != null &&
                                this.sellFaultCode.equals(other.getSellFaultCode()))) &&
                ((this.sellFaultString == null && other.getSellFaultString() == null) ||
                        (this.sellFaultString != null &&
                                this.sellFaultString.equals(other.getSellFaultString())));
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
        if (getSellFaultCode() != null) {
            _hashCode += getSellFaultCode().hashCode();
        }
        if (getSellFaultString() != null) {
            _hashCode += getSellFaultString().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(StructSellFailed.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:AllegroWebApi", "StructSellFailed"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sellItemId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sell-item-id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sellFaultCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sell-fault-code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sellFaultString");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sell-fault-string"));
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
