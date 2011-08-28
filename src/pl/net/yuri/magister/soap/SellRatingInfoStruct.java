/**
 * SellRatingInfoStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pl.net.yuri.magister.soap;

public class SellRatingInfoStruct implements java.io.Serializable {
    private int sellRatingGroupId;

    private java.lang.String sellRatingGroupTitle;

    private pl.net.yuri.magister.soap.SellRatingReasonStruct[] sellRatingReasons;

    public SellRatingInfoStruct() {
    }

    public SellRatingInfoStruct(
            int sellRatingGroupId,
            java.lang.String sellRatingGroupTitle,
            pl.net.yuri.magister.soap.SellRatingReasonStruct[] sellRatingReasons) {
        this.sellRatingGroupId = sellRatingGroupId;
        this.sellRatingGroupTitle = sellRatingGroupTitle;
        this.sellRatingReasons = sellRatingReasons;
    }


    /**
     * Gets the sellRatingGroupId value for this SellRatingInfoStruct.
     *
     * @return sellRatingGroupId
     */
    public int getSellRatingGroupId() {
        return sellRatingGroupId;
    }


    /**
     * Sets the sellRatingGroupId value for this SellRatingInfoStruct.
     *
     * @param sellRatingGroupId
     */
    public void setSellRatingGroupId(int sellRatingGroupId) {
        this.sellRatingGroupId = sellRatingGroupId;
    }


    /**
     * Gets the sellRatingGroupTitle value for this SellRatingInfoStruct.
     *
     * @return sellRatingGroupTitle
     */
    public java.lang.String getSellRatingGroupTitle() {
        return sellRatingGroupTitle;
    }


    /**
     * Sets the sellRatingGroupTitle value for this SellRatingInfoStruct.
     *
     * @param sellRatingGroupTitle
     */
    public void setSellRatingGroupTitle(java.lang.String sellRatingGroupTitle) {
        this.sellRatingGroupTitle = sellRatingGroupTitle;
    }


    /**
     * Gets the sellRatingReasons value for this SellRatingInfoStruct.
     *
     * @return sellRatingReasons
     */
    public pl.net.yuri.magister.soap.SellRatingReasonStruct[] getSellRatingReasons() {
        return sellRatingReasons;
    }


    /**
     * Sets the sellRatingReasons value for this SellRatingInfoStruct.
     *
     * @param sellRatingReasons
     */
    public void setSellRatingReasons(pl.net.yuri.magister.soap.SellRatingReasonStruct[] sellRatingReasons) {
        this.sellRatingReasons = sellRatingReasons;
    }

    private java.lang.Object __equalsCalc = null;

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SellRatingInfoStruct)) return false;
        SellRatingInfoStruct other = (SellRatingInfoStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                this.sellRatingGroupId == other.getSellRatingGroupId() &&
                ((this.sellRatingGroupTitle == null && other.getSellRatingGroupTitle() == null) ||
                        (this.sellRatingGroupTitle != null &&
                                this.sellRatingGroupTitle.equals(other.getSellRatingGroupTitle()))) &&
                ((this.sellRatingReasons == null && other.getSellRatingReasons() == null) ||
                        (this.sellRatingReasons != null &&
                                java.util.Arrays.equals(this.sellRatingReasons, other.getSellRatingReasons())));
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
        _hashCode += getSellRatingGroupId();
        if (getSellRatingGroupTitle() != null) {
            _hashCode += getSellRatingGroupTitle().hashCode();
        }
        if (getSellRatingReasons() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getSellRatingReasons());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSellRatingReasons(), i);
                if (obj != null &&
                        !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(SellRatingInfoStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:AllegroWebApi", "SellRatingInfoStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sellRatingGroupId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sell-rating-group-id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sellRatingGroupTitle");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sell-rating-group-title"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sellRatingReasons");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sell-rating-reasons"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:AllegroWebApi", "SellRatingReasonStruct"));
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
