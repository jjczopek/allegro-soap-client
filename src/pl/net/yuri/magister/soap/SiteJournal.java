/**
 * SiteJournal.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pl.net.yuri.magister.soap;

public class SiteJournal implements java.io.Serializable {
    private long rowId;

    private long itemId;

    private java.lang.String changeType;

    private long changeDate;

    private float currentPrice;

    private long itemSellerId;

    public SiteJournal() {
    }

    public SiteJournal(
            long rowId,
            long itemId,
            java.lang.String changeType,
            long changeDate,
            float currentPrice,
            long itemSellerId) {
        this.rowId = rowId;
        this.itemId = itemId;
        this.changeType = changeType;
        this.changeDate = changeDate;
        this.currentPrice = currentPrice;
        this.itemSellerId = itemSellerId;
    }


    /**
     * Gets the rowId value for this SiteJournal.
     *
     * @return rowId
     */
    public long getRowId() {
        return rowId;
    }


    /**
     * Sets the rowId value for this SiteJournal.
     *
     * @param rowId
     */
    public void setRowId(long rowId) {
        this.rowId = rowId;
    }


    /**
     * Gets the itemId value for this SiteJournal.
     *
     * @return itemId
     */
    public long getItemId() {
        return itemId;
    }


    /**
     * Sets the itemId value for this SiteJournal.
     *
     * @param itemId
     */
    public void setItemId(long itemId) {
        this.itemId = itemId;
    }


    /**
     * Gets the changeType value for this SiteJournal.
     *
     * @return changeType
     */
    public java.lang.String getChangeType() {
        return changeType;
    }


    /**
     * Sets the changeType value for this SiteJournal.
     *
     * @param changeType
     */
    public void setChangeType(java.lang.String changeType) {
        this.changeType = changeType;
    }


    /**
     * Gets the changeDate value for this SiteJournal.
     *
     * @return changeDate
     */
    public long getChangeDate() {
        return changeDate;
    }


    /**
     * Sets the changeDate value for this SiteJournal.
     *
     * @param changeDate
     */
    public void setChangeDate(long changeDate) {
        this.changeDate = changeDate;
    }


    /**
     * Gets the currentPrice value for this SiteJournal.
     *
     * @return currentPrice
     */
    public float getCurrentPrice() {
        return currentPrice;
    }


    /**
     * Sets the currentPrice value for this SiteJournal.
     *
     * @param currentPrice
     */
    public void setCurrentPrice(float currentPrice) {
        this.currentPrice = currentPrice;
    }


    /**
     * Gets the itemSellerId value for this SiteJournal.
     *
     * @return itemSellerId
     */
    public long getItemSellerId() {
        return itemSellerId;
    }


    /**
     * Sets the itemSellerId value for this SiteJournal.
     *
     * @param itemSellerId
     */
    public void setItemSellerId(long itemSellerId) {
        this.itemSellerId = itemSellerId;
    }

    private java.lang.Object __equalsCalc = null;

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SiteJournal)) return false;
        SiteJournal other = (SiteJournal) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                this.rowId == other.getRowId() &&
                this.itemId == other.getItemId() &&
                ((this.changeType == null && other.getChangeType() == null) ||
                        (this.changeType != null &&
                                this.changeType.equals(other.getChangeType()))) &&
                this.changeDate == other.getChangeDate() &&
                this.currentPrice == other.getCurrentPrice() &&
                this.itemSellerId == other.getItemSellerId();
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
        _hashCode += new Long(getRowId()).hashCode();
        _hashCode += new Long(getItemId()).hashCode();
        if (getChangeType() != null) {
            _hashCode += getChangeType().hashCode();
        }
        _hashCode += new Long(getChangeDate()).hashCode();
        _hashCode += new Float(getCurrentPrice()).hashCode();
        _hashCode += new Long(getItemSellerId()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(SiteJournal.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:AllegroWebApi", "SiteJournal"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rowId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "row-id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "item-id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("changeType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "change-type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("changeDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "change-date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currentPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("", "current-price"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemSellerId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "item-seller-id"));
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
