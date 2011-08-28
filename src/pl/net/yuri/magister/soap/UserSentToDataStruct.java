/**
 * UserSentToDataStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pl.net.yuri.magister.soap;

public class UserSentToDataStruct implements java.io.Serializable {
    private long userId;

    private java.lang.String userFirstName;

    private java.lang.String userLastName;

    private java.lang.String userCompany;

    private int userCountryId;

    private java.lang.String userPostcode;

    private java.lang.String userCity;

    private java.lang.String userAddress;

    public UserSentToDataStruct() {
    }

    public UserSentToDataStruct(
            long userId,
            java.lang.String userFirstName,
            java.lang.String userLastName,
            java.lang.String userCompany,
            int userCountryId,
            java.lang.String userPostcode,
            java.lang.String userCity,
            java.lang.String userAddress) {
        this.userId = userId;
        this.userFirstName = userFirstName;
        this.userLastName = userLastName;
        this.userCompany = userCompany;
        this.userCountryId = userCountryId;
        this.userPostcode = userPostcode;
        this.userCity = userCity;
        this.userAddress = userAddress;
    }


    /**
     * Gets the userId value for this UserSentToDataStruct.
     *
     * @return userId
     */
    public long getUserId() {
        return userId;
    }


    /**
     * Sets the userId value for this UserSentToDataStruct.
     *
     * @param userId
     */
    public void setUserId(long userId) {
        this.userId = userId;
    }


    /**
     * Gets the userFirstName value for this UserSentToDataStruct.
     *
     * @return userFirstName
     */
    public java.lang.String getUserFirstName() {
        return userFirstName;
    }


    /**
     * Sets the userFirstName value for this UserSentToDataStruct.
     *
     * @param userFirstName
     */
    public void setUserFirstName(java.lang.String userFirstName) {
        this.userFirstName = userFirstName;
    }


    /**
     * Gets the userLastName value for this UserSentToDataStruct.
     *
     * @return userLastName
     */
    public java.lang.String getUserLastName() {
        return userLastName;
    }


    /**
     * Sets the userLastName value for this UserSentToDataStruct.
     *
     * @param userLastName
     */
    public void setUserLastName(java.lang.String userLastName) {
        this.userLastName = userLastName;
    }


    /**
     * Gets the userCompany value for this UserSentToDataStruct.
     *
     * @return userCompany
     */
    public java.lang.String getUserCompany() {
        return userCompany;
    }


    /**
     * Sets the userCompany value for this UserSentToDataStruct.
     *
     * @param userCompany
     */
    public void setUserCompany(java.lang.String userCompany) {
        this.userCompany = userCompany;
    }


    /**
     * Gets the userCountryId value for this UserSentToDataStruct.
     *
     * @return userCountryId
     */
    public int getUserCountryId() {
        return userCountryId;
    }


    /**
     * Sets the userCountryId value for this UserSentToDataStruct.
     *
     * @param userCountryId
     */
    public void setUserCountryId(int userCountryId) {
        this.userCountryId = userCountryId;
    }


    /**
     * Gets the userPostcode value for this UserSentToDataStruct.
     *
     * @return userPostcode
     */
    public java.lang.String getUserPostcode() {
        return userPostcode;
    }


    /**
     * Sets the userPostcode value for this UserSentToDataStruct.
     *
     * @param userPostcode
     */
    public void setUserPostcode(java.lang.String userPostcode) {
        this.userPostcode = userPostcode;
    }


    /**
     * Gets the userCity value for this UserSentToDataStruct.
     *
     * @return userCity
     */
    public java.lang.String getUserCity() {
        return userCity;
    }


    /**
     * Sets the userCity value for this UserSentToDataStruct.
     *
     * @param userCity
     */
    public void setUserCity(java.lang.String userCity) {
        this.userCity = userCity;
    }


    /**
     * Gets the userAddress value for this UserSentToDataStruct.
     *
     * @return userAddress
     */
    public java.lang.String getUserAddress() {
        return userAddress;
    }


    /**
     * Sets the userAddress value for this UserSentToDataStruct.
     *
     * @param userAddress
     */
    public void setUserAddress(java.lang.String userAddress) {
        this.userAddress = userAddress;
    }

    private java.lang.Object __equalsCalc = null;

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UserSentToDataStruct)) return false;
        UserSentToDataStruct other = (UserSentToDataStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                this.userId == other.getUserId() &&
                ((this.userFirstName == null && other.getUserFirstName() == null) ||
                        (this.userFirstName != null &&
                                this.userFirstName.equals(other.getUserFirstName()))) &&
                ((this.userLastName == null && other.getUserLastName() == null) ||
                        (this.userLastName != null &&
                                this.userLastName.equals(other.getUserLastName()))) &&
                ((this.userCompany == null && other.getUserCompany() == null) ||
                        (this.userCompany != null &&
                                this.userCompany.equals(other.getUserCompany()))) &&
                this.userCountryId == other.getUserCountryId() &&
                ((this.userPostcode == null && other.getUserPostcode() == null) ||
                        (this.userPostcode != null &&
                                this.userPostcode.equals(other.getUserPostcode()))) &&
                ((this.userCity == null && other.getUserCity() == null) ||
                        (this.userCity != null &&
                                this.userCity.equals(other.getUserCity()))) &&
                ((this.userAddress == null && other.getUserAddress() == null) ||
                        (this.userAddress != null &&
                                this.userAddress.equals(other.getUserAddress())));
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
        if (getUserFirstName() != null) {
            _hashCode += getUserFirstName().hashCode();
        }
        if (getUserLastName() != null) {
            _hashCode += getUserLastName().hashCode();
        }
        if (getUserCompany() != null) {
            _hashCode += getUserCompany().hashCode();
        }
        _hashCode += getUserCountryId();
        if (getUserPostcode() != null) {
            _hashCode += getUserPostcode().hashCode();
        }
        if (getUserCity() != null) {
            _hashCode += getUserCity().hashCode();
        }
        if (getUserAddress() != null) {
            _hashCode += getUserAddress().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(UserSentToDataStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:AllegroWebApi", "UserSentToDataStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "user-id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userFirstName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "user-first-name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userLastName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "user-last-name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userCompany");
        elemField.setXmlName(new javax.xml.namespace.QName("", "user-company"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userCountryId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "user-country-id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userPostcode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "user-postcode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userCity");
        elemField.setXmlName(new javax.xml.namespace.QName("", "user-city"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("", "user-address"));
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
