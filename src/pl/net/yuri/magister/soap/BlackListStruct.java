/**
 * BlackListStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pl.net.yuri.magister.soap;

public class BlackListStruct implements java.io.Serializable {
    private long userId;

    private java.lang.String userLogin;

    private int userRating;

    private int userCountry;

    public BlackListStruct() {
    }

    public BlackListStruct(
            long userId,
            java.lang.String userLogin,
            int userRating,
            int userCountry) {
        this.userId = userId;
        this.userLogin = userLogin;
        this.userRating = userRating;
        this.userCountry = userCountry;
    }


    /**
     * Gets the userId value for this BlackListStruct.
     *
     * @return userId
     */
    public long getUserId() {
        return userId;
    }


    /**
     * Sets the userId value for this BlackListStruct.
     *
     * @param userId
     */
    public void setUserId(long userId) {
        this.userId = userId;
    }


    /**
     * Gets the userLogin value for this BlackListStruct.
     *
     * @return userLogin
     */
    public java.lang.String getUserLogin() {
        return userLogin;
    }


    /**
     * Sets the userLogin value for this BlackListStruct.
     *
     * @param userLogin
     */
    public void setUserLogin(java.lang.String userLogin) {
        this.userLogin = userLogin;
    }


    /**
     * Gets the userRating value for this BlackListStruct.
     *
     * @return userRating
     */
    public int getUserRating() {
        return userRating;
    }


    /**
     * Sets the userRating value for this BlackListStruct.
     *
     * @param userRating
     */
    public void setUserRating(int userRating) {
        this.userRating = userRating;
    }


    /**
     * Gets the userCountry value for this BlackListStruct.
     *
     * @return userCountry
     */
    public int getUserCountry() {
        return userCountry;
    }


    /**
     * Sets the userCountry value for this BlackListStruct.
     *
     * @param userCountry
     */
    public void setUserCountry(int userCountry) {
        this.userCountry = userCountry;
    }

    private java.lang.Object __equalsCalc = null;

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BlackListStruct)) return false;
        BlackListStruct other = (BlackListStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                this.userId == other.getUserId() &&
                ((this.userLogin == null && other.getUserLogin() == null) ||
                        (this.userLogin != null &&
                                this.userLogin.equals(other.getUserLogin()))) &&
                this.userRating == other.getUserRating() &&
                this.userCountry == other.getUserCountry();
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
        _hashCode += new Long(getUserId()).hashCode();
        if (getUserLogin() != null) {
            _hashCode += getUserLogin().hashCode();
        }
        _hashCode += getUserRating();
        _hashCode += getUserCountry();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(BlackListStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:AllegroWebApi", "BlackListStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "user-id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userLogin");
        elemField.setXmlName(new javax.xml.namespace.QName("", "user-login"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userRating");
        elemField.setXmlName(new javax.xml.namespace.QName("", "user-rating"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userCountry");
        elemField.setXmlName(new javax.xml.namespace.QName("", "user-country"));
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
