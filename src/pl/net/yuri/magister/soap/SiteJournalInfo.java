/**
 * SiteJournalInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pl.net.yuri.magister.soap;

public class SiteJournalInfo implements java.io.Serializable {
    private int itemsNumber;

    private long lastItemDate;

    public SiteJournalInfo() {
    }

    public SiteJournalInfo(
            int itemsNumber,
            long lastItemDate) {
        this.itemsNumber = itemsNumber;
        this.lastItemDate = lastItemDate;
    }


    /**
     * Gets the itemsNumber value for this SiteJournalInfo.
     *
     * @return itemsNumber
     */
    public int getItemsNumber() {
        return itemsNumber;
    }


    /**
     * Sets the itemsNumber value for this SiteJournalInfo.
     *
     * @param itemsNumber
     */
    public void setItemsNumber(int itemsNumber) {
        this.itemsNumber = itemsNumber;
    }


    /**
     * Gets the lastItemDate value for this SiteJournalInfo.
     *
     * @return lastItemDate
     */
    public long getLastItemDate() {
        return lastItemDate;
    }


    /**
     * Sets the lastItemDate value for this SiteJournalInfo.
     *
     * @param lastItemDate
     */
    public void setLastItemDate(long lastItemDate) {
        this.lastItemDate = lastItemDate;
    }

    private java.lang.Object __equalsCalc = null;

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SiteJournalInfo)) return false;
        SiteJournalInfo other = (SiteJournalInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                this.itemsNumber == other.getItemsNumber() &&
                this.lastItemDate == other.getLastItemDate();
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
        _hashCode += getItemsNumber();
        _hashCode += new Long(getLastItemDate()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(SiteJournalInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:AllegroWebApi", "SiteJournalInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemsNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "items-number"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastItemDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "last-item-date"));
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
