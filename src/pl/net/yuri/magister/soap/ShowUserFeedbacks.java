/**
 * ShowUserFeedbacks.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pl.net.yuri.magister.soap;

public class ShowUserFeedbacks implements java.io.Serializable {
    private int userFLastWeek;

    private int userFLastMonth;

    private int userFAll;

    private int userFSoldItems;

    private int userFBuyItems;

    public ShowUserFeedbacks() {
    }

    public ShowUserFeedbacks(
            int userFLastWeek,
            int userFLastMonth,
            int userFAll,
            int userFSoldItems,
            int userFBuyItems) {
        this.userFLastWeek = userFLastWeek;
        this.userFLastMonth = userFLastMonth;
        this.userFAll = userFAll;
        this.userFSoldItems = userFSoldItems;
        this.userFBuyItems = userFBuyItems;
    }


    /**
     * Gets the userFLastWeek value for this ShowUserFeedbacks.
     *
     * @return userFLastWeek
     */
    public int getUserFLastWeek() {
        return userFLastWeek;
    }


    /**
     * Sets the userFLastWeek value for this ShowUserFeedbacks.
     *
     * @param userFLastWeek
     */
    public void setUserFLastWeek(int userFLastWeek) {
        this.userFLastWeek = userFLastWeek;
    }


    /**
     * Gets the userFLastMonth value for this ShowUserFeedbacks.
     *
     * @return userFLastMonth
     */
    public int getUserFLastMonth() {
        return userFLastMonth;
    }


    /**
     * Sets the userFLastMonth value for this ShowUserFeedbacks.
     *
     * @param userFLastMonth
     */
    public void setUserFLastMonth(int userFLastMonth) {
        this.userFLastMonth = userFLastMonth;
    }


    /**
     * Gets the userFAll value for this ShowUserFeedbacks.
     *
     * @return userFAll
     */
    public int getUserFAll() {
        return userFAll;
    }


    /**
     * Sets the userFAll value for this ShowUserFeedbacks.
     *
     * @param userFAll
     */
    public void setUserFAll(int userFAll) {
        this.userFAll = userFAll;
    }


    /**
     * Gets the userFSoldItems value for this ShowUserFeedbacks.
     *
     * @return userFSoldItems
     */
    public int getUserFSoldItems() {
        return userFSoldItems;
    }


    /**
     * Sets the userFSoldItems value for this ShowUserFeedbacks.
     *
     * @param userFSoldItems
     */
    public void setUserFSoldItems(int userFSoldItems) {
        this.userFSoldItems = userFSoldItems;
    }


    /**
     * Gets the userFBuyItems value for this ShowUserFeedbacks.
     *
     * @return userFBuyItems
     */
    public int getUserFBuyItems() {
        return userFBuyItems;
    }


    /**
     * Sets the userFBuyItems value for this ShowUserFeedbacks.
     *
     * @param userFBuyItems
     */
    public void setUserFBuyItems(int userFBuyItems) {
        this.userFBuyItems = userFBuyItems;
    }

    private java.lang.Object __equalsCalc = null;

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ShowUserFeedbacks)) return false;
        ShowUserFeedbacks other = (ShowUserFeedbacks) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                this.userFLastWeek == other.getUserFLastWeek() &&
                this.userFLastMonth == other.getUserFLastMonth() &&
                this.userFAll == other.getUserFAll() &&
                this.userFSoldItems == other.getUserFSoldItems() &&
                this.userFBuyItems == other.getUserFBuyItems();
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
        _hashCode += getUserFLastWeek();
        _hashCode += getUserFLastMonth();
        _hashCode += getUserFAll();
        _hashCode += getUserFSoldItems();
        _hashCode += getUserFBuyItems();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(ShowUserFeedbacks.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:AllegroWebApi", "ShowUserFeedbacks"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userFLastWeek");
        elemField.setXmlName(new javax.xml.namespace.QName("", "user-f-last-week"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userFLastMonth");
        elemField.setXmlName(new javax.xml.namespace.QName("", "user-f-last-month"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userFAll");
        elemField.setXmlName(new javax.xml.namespace.QName("", "user-f-all"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userFSoldItems");
        elemField.setXmlName(new javax.xml.namespace.QName("", "user-f-sold-items"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userFBuyItems");
        elemField.setXmlName(new javax.xml.namespace.QName("", "user-f-buy-items"));
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
