/**
 * UserBlackListAddResultStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pl.net.yuri.magister.soap;

public class UserBlackListAddResultStruct implements java.io.Serializable {
    private int userId;

    private int addToBlackListResult;

    private java.lang.String addToBlackListErrCode;

    private java.lang.String addToBlackListErrMsg;

    public UserBlackListAddResultStruct() {
    }

    public UserBlackListAddResultStruct(
            int userId,
            int addToBlackListResult,
            java.lang.String addToBlackListErrCode,
            java.lang.String addToBlackListErrMsg) {
        this.userId = userId;
        this.addToBlackListResult = addToBlackListResult;
        this.addToBlackListErrCode = addToBlackListErrCode;
        this.addToBlackListErrMsg = addToBlackListErrMsg;
    }


    /**
     * Gets the userId value for this UserBlackListAddResultStruct.
     *
     * @return userId
     */
    public int getUserId() {
        return userId;
    }


    /**
     * Sets the userId value for this UserBlackListAddResultStruct.
     *
     * @param userId
     */
    public void setUserId(int userId) {
        this.userId = userId;
    }


    /**
     * Gets the addToBlackListResult value for this UserBlackListAddResultStruct.
     *
     * @return addToBlackListResult
     */
    public int getAddToBlackListResult() {
        return addToBlackListResult;
    }


    /**
     * Sets the addToBlackListResult value for this UserBlackListAddResultStruct.
     *
     * @param addToBlackListResult
     */
    public void setAddToBlackListResult(int addToBlackListResult) {
        this.addToBlackListResult = addToBlackListResult;
    }


    /**
     * Gets the addToBlackListErrCode value for this UserBlackListAddResultStruct.
     *
     * @return addToBlackListErrCode
     */
    public java.lang.String getAddToBlackListErrCode() {
        return addToBlackListErrCode;
    }


    /**
     * Sets the addToBlackListErrCode value for this UserBlackListAddResultStruct.
     *
     * @param addToBlackListErrCode
     */
    public void setAddToBlackListErrCode(java.lang.String addToBlackListErrCode) {
        this.addToBlackListErrCode = addToBlackListErrCode;
    }


    /**
     * Gets the addToBlackListErrMsg value for this UserBlackListAddResultStruct.
     *
     * @return addToBlackListErrMsg
     */
    public java.lang.String getAddToBlackListErrMsg() {
        return addToBlackListErrMsg;
    }


    /**
     * Sets the addToBlackListErrMsg value for this UserBlackListAddResultStruct.
     *
     * @param addToBlackListErrMsg
     */
    public void setAddToBlackListErrMsg(java.lang.String addToBlackListErrMsg) {
        this.addToBlackListErrMsg = addToBlackListErrMsg;
    }

    private java.lang.Object __equalsCalc = null;

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UserBlackListAddResultStruct)) return false;
        UserBlackListAddResultStruct other = (UserBlackListAddResultStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                this.userId == other.getUserId() &&
                this.addToBlackListResult == other.getAddToBlackListResult() &&
                ((this.addToBlackListErrCode == null && other.getAddToBlackListErrCode() == null) ||
                        (this.addToBlackListErrCode != null &&
                                this.addToBlackListErrCode.equals(other.getAddToBlackListErrCode()))) &&
                ((this.addToBlackListErrMsg == null && other.getAddToBlackListErrMsg() == null) ||
                        (this.addToBlackListErrMsg != null &&
                                this.addToBlackListErrMsg.equals(other.getAddToBlackListErrMsg())));
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
        _hashCode += getUserId();
        _hashCode += getAddToBlackListResult();
        if (getAddToBlackListErrCode() != null) {
            _hashCode += getAddToBlackListErrCode().hashCode();
        }
        if (getAddToBlackListErrMsg() != null) {
            _hashCode += getAddToBlackListErrMsg().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(UserBlackListAddResultStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:AllegroWebApi", "UserBlackListAddResultStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "user-id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addToBlackListResult");
        elemField.setXmlName(new javax.xml.namespace.QName("", "add-to-black-list-result"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addToBlackListErrCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "add-to-black-list-err-code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addToBlackListErrMsg");
        elemField.setXmlName(new javax.xml.namespace.QName("", "add-to-black-list-err-msg"));
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
