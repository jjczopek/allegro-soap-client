/**
 * FavouritesCategoriesStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pl.net.yuri.magister.soap;

public class FavouritesCategoriesStruct implements java.io.Serializable {
    private int sCategoryId;

    private int sSubscriptionStatus;

    private int sPosition;

    private int sBuyNowOnly;

    public FavouritesCategoriesStruct() {
    }

    public FavouritesCategoriesStruct(
            int sCategoryId,
            int sSubscriptionStatus,
            int sPosition,
            int sBuyNowOnly) {
        this.sCategoryId = sCategoryId;
        this.sSubscriptionStatus = sSubscriptionStatus;
        this.sPosition = sPosition;
        this.sBuyNowOnly = sBuyNowOnly;
    }


    /**
     * Gets the sCategoryId value for this FavouritesCategoriesStruct.
     *
     * @return sCategoryId
     */
    public int getSCategoryId() {
        return sCategoryId;
    }


    /**
     * Sets the sCategoryId value for this FavouritesCategoriesStruct.
     *
     * @param sCategoryId
     */
    public void setSCategoryId(int sCategoryId) {
        this.sCategoryId = sCategoryId;
    }


    /**
     * Gets the sSubscriptionStatus value for this FavouritesCategoriesStruct.
     *
     * @return sSubscriptionStatus
     */
    public int getSSubscriptionStatus() {
        return sSubscriptionStatus;
    }


    /**
     * Sets the sSubscriptionStatus value for this FavouritesCategoriesStruct.
     *
     * @param sSubscriptionStatus
     */
    public void setSSubscriptionStatus(int sSubscriptionStatus) {
        this.sSubscriptionStatus = sSubscriptionStatus;
    }


    /**
     * Gets the sPosition value for this FavouritesCategoriesStruct.
     *
     * @return sPosition
     */
    public int getSPosition() {
        return sPosition;
    }


    /**
     * Sets the sPosition value for this FavouritesCategoriesStruct.
     *
     * @param sPosition
     */
    public void setSPosition(int sPosition) {
        this.sPosition = sPosition;
    }


    /**
     * Gets the sBuyNowOnly value for this FavouritesCategoriesStruct.
     *
     * @return sBuyNowOnly
     */
    public int getSBuyNowOnly() {
        return sBuyNowOnly;
    }


    /**
     * Sets the sBuyNowOnly value for this FavouritesCategoriesStruct.
     *
     * @param sBuyNowOnly
     */
    public void setSBuyNowOnly(int sBuyNowOnly) {
        this.sBuyNowOnly = sBuyNowOnly;
    }

    private java.lang.Object __equalsCalc = null;

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FavouritesCategoriesStruct)) return false;
        FavouritesCategoriesStruct other = (FavouritesCategoriesStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                this.sCategoryId == other.getSCategoryId() &&
                this.sSubscriptionStatus == other.getSSubscriptionStatus() &&
                this.sPosition == other.getSPosition() &&
                this.sBuyNowOnly == other.getSBuyNowOnly();
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
        _hashCode += getSCategoryId();
        _hashCode += getSSubscriptionStatus();
        _hashCode += getSPosition();
        _hashCode += getSBuyNowOnly();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(FavouritesCategoriesStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:AllegroWebApi", "FavouritesCategoriesStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SCategoryId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "s-category-id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SSubscriptionStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "s-subscription-status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SPosition");
        elemField.setXmlName(new javax.xml.namespace.QName("", "s-position"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SBuyNowOnly");
        elemField.setXmlName(new javax.xml.namespace.QName("", "s-buy-now-only"));
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
