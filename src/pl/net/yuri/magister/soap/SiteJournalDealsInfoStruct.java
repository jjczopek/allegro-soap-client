/**
 * SiteJournalDealsInfoStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pl.net.yuri.magister.soap;

public class SiteJournalDealsInfoStruct implements java.io.Serializable {
    private int dealEventsCount;

    private long dealLastEventTime;

    public SiteJournalDealsInfoStruct() {
    }

    public SiteJournalDealsInfoStruct(
            int dealEventsCount,
            long dealLastEventTime) {
        this.dealEventsCount = dealEventsCount;
        this.dealLastEventTime = dealLastEventTime;
    }


    /**
     * Gets the dealEventsCount value for this SiteJournalDealsInfoStruct.
     *
     * @return dealEventsCount
     */
    public int getDealEventsCount() {
        return dealEventsCount;
    }


    /**
     * Sets the dealEventsCount value for this SiteJournalDealsInfoStruct.
     *
     * @param dealEventsCount
     */
    public void setDealEventsCount(int dealEventsCount) {
        this.dealEventsCount = dealEventsCount;
    }


    /**
     * Gets the dealLastEventTime value for this SiteJournalDealsInfoStruct.
     *
     * @return dealLastEventTime
     */
    public long getDealLastEventTime() {
        return dealLastEventTime;
    }


    /**
     * Sets the dealLastEventTime value for this SiteJournalDealsInfoStruct.
     *
     * @param dealLastEventTime
     */
    public void setDealLastEventTime(long dealLastEventTime) {
        this.dealLastEventTime = dealLastEventTime;
    }

    private java.lang.Object __equalsCalc = null;

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SiteJournalDealsInfoStruct)) return false;
        SiteJournalDealsInfoStruct other = (SiteJournalDealsInfoStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                this.dealEventsCount == other.getDealEventsCount() &&
                this.dealLastEventTime == other.getDealLastEventTime();
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
        _hashCode += getDealEventsCount();
        _hashCode += new Long(getDealLastEventTime()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(SiteJournalDealsInfoStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:AllegroWebApi", "SiteJournalDealsInfoStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dealEventsCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deal-events-count"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dealLastEventTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deal-last-event-time"));
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
