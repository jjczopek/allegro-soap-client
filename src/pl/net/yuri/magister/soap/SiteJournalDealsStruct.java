/**
 * SiteJournalDealsStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pl.net.yuri.magister.soap;

public class SiteJournalDealsStruct implements java.io.Serializable {
    private long dealEventId;

    private int dealEventType;

    private long dealEventTime;

    private long dealId;

    private long dealTransactionId;

    private int dealSellerId;

    private long dealItemId;

    public SiteJournalDealsStruct() {
    }

    public SiteJournalDealsStruct(
            long dealEventId,
            int dealEventType,
            long dealEventTime,
            long dealId,
            long dealTransactionId,
            int dealSellerId,
            long dealItemId) {
        this.dealEventId = dealEventId;
        this.dealEventType = dealEventType;
        this.dealEventTime = dealEventTime;
        this.dealId = dealId;
        this.dealTransactionId = dealTransactionId;
        this.dealSellerId = dealSellerId;
        this.dealItemId = dealItemId;
    }


    /**
     * Gets the dealEventId value for this SiteJournalDealsStruct.
     *
     * @return dealEventId
     */
    public long getDealEventId() {
        return dealEventId;
    }


    /**
     * Sets the dealEventId value for this SiteJournalDealsStruct.
     *
     * @param dealEventId
     */
    public void setDealEventId(long dealEventId) {
        this.dealEventId = dealEventId;
    }


    /**
     * Gets the dealEventType value for this SiteJournalDealsStruct.
     *
     * @return dealEventType
     */
    public int getDealEventType() {
        return dealEventType;
    }


    /**
     * Sets the dealEventType value for this SiteJournalDealsStruct.
     *
     * @param dealEventType
     */
    public void setDealEventType(int dealEventType) {
        this.dealEventType = dealEventType;
    }


    /**
     * Gets the dealEventTime value for this SiteJournalDealsStruct.
     *
     * @return dealEventTime
     */
    public long getDealEventTime() {
        return dealEventTime;
    }


    /**
     * Sets the dealEventTime value for this SiteJournalDealsStruct.
     *
     * @param dealEventTime
     */
    public void setDealEventTime(long dealEventTime) {
        this.dealEventTime = dealEventTime;
    }


    /**
     * Gets the dealId value for this SiteJournalDealsStruct.
     *
     * @return dealId
     */
    public long getDealId() {
        return dealId;
    }


    /**
     * Sets the dealId value for this SiteJournalDealsStruct.
     *
     * @param dealId
     */
    public void setDealId(long dealId) {
        this.dealId = dealId;
    }


    /**
     * Gets the dealTransactionId value for this SiteJournalDealsStruct.
     *
     * @return dealTransactionId
     */
    public long getDealTransactionId() {
        return dealTransactionId;
    }


    /**
     * Sets the dealTransactionId value for this SiteJournalDealsStruct.
     *
     * @param dealTransactionId
     */
    public void setDealTransactionId(long dealTransactionId) {
        this.dealTransactionId = dealTransactionId;
    }


    /**
     * Gets the dealSellerId value for this SiteJournalDealsStruct.
     *
     * @return dealSellerId
     */
    public int getDealSellerId() {
        return dealSellerId;
    }


    /**
     * Sets the dealSellerId value for this SiteJournalDealsStruct.
     *
     * @param dealSellerId
     */
    public void setDealSellerId(int dealSellerId) {
        this.dealSellerId = dealSellerId;
    }


    /**
     * Gets the dealItemId value for this SiteJournalDealsStruct.
     *
     * @return dealItemId
     */
    public long getDealItemId() {
        return dealItemId;
    }


    /**
     * Sets the dealItemId value for this SiteJournalDealsStruct.
     *
     * @param dealItemId
     */
    public void setDealItemId(long dealItemId) {
        this.dealItemId = dealItemId;
    }

    private java.lang.Object __equalsCalc = null;

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SiteJournalDealsStruct)) return false;
        SiteJournalDealsStruct other = (SiteJournalDealsStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                this.dealEventId == other.getDealEventId() &&
                this.dealEventType == other.getDealEventType() &&
                this.dealEventTime == other.getDealEventTime() &&
                this.dealId == other.getDealId() &&
                this.dealTransactionId == other.getDealTransactionId() &&
                this.dealSellerId == other.getDealSellerId() &&
                this.dealItemId == other.getDealItemId();
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
        _hashCode += new Long(getDealEventId()).hashCode();
        _hashCode += getDealEventType();
        _hashCode += new Long(getDealEventTime()).hashCode();
        _hashCode += new Long(getDealId()).hashCode();
        _hashCode += new Long(getDealTransactionId()).hashCode();
        _hashCode += getDealSellerId();
        _hashCode += new Long(getDealItemId()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(SiteJournalDealsStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:AllegroWebApi", "SiteJournalDealsStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dealEventId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deal-event-id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dealEventType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deal-event-type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dealEventTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deal-event-time"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dealId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deal-id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dealTransactionId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deal-transaction-id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dealSellerId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deal-seller-id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dealItemId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deal-item-id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
