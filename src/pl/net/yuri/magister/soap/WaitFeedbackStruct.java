/**
 * WaitFeedbackStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pl.net.yuri.magister.soap;

public class WaitFeedbackStruct implements java.io.Serializable {
    private int feItemId;

    private java.lang.String feItemName;

    private int feToUserId;

    private int feOp;

    private java.lang.String feAnsCommentType;

    public WaitFeedbackStruct() {
    }

    public WaitFeedbackStruct(
            int feItemId,
            java.lang.String feItemName,
            int feToUserId,
            int feOp,
            java.lang.String feAnsCommentType) {
        this.feItemId = feItemId;
        this.feItemName = feItemName;
        this.feToUserId = feToUserId;
        this.feOp = feOp;
        this.feAnsCommentType = feAnsCommentType;
    }


    /**
     * Gets the feItemId value for this WaitFeedbackStruct.
     *
     * @return feItemId
     */
    public int getFeItemId() {
        return feItemId;
    }


    /**
     * Sets the feItemId value for this WaitFeedbackStruct.
     *
     * @param feItemId
     */
    public void setFeItemId(int feItemId) {
        this.feItemId = feItemId;
    }


    /**
     * Gets the feItemName value for this WaitFeedbackStruct.
     *
     * @return feItemName
     */
    public java.lang.String getFeItemName() {
        return feItemName;
    }


    /**
     * Sets the feItemName value for this WaitFeedbackStruct.
     *
     * @param feItemName
     */
    public void setFeItemName(java.lang.String feItemName) {
        this.feItemName = feItemName;
    }


    /**
     * Gets the feToUserId value for this WaitFeedbackStruct.
     *
     * @return feToUserId
     */
    public int getFeToUserId() {
        return feToUserId;
    }


    /**
     * Sets the feToUserId value for this WaitFeedbackStruct.
     *
     * @param feToUserId
     */
    public void setFeToUserId(int feToUserId) {
        this.feToUserId = feToUserId;
    }


    /**
     * Gets the feOp value for this WaitFeedbackStruct.
     *
     * @return feOp
     */
    public int getFeOp() {
        return feOp;
    }


    /**
     * Sets the feOp value for this WaitFeedbackStruct.
     *
     * @param feOp
     */
    public void setFeOp(int feOp) {
        this.feOp = feOp;
    }


    /**
     * Gets the feAnsCommentType value for this WaitFeedbackStruct.
     *
     * @return feAnsCommentType
     */
    public java.lang.String getFeAnsCommentType() {
        return feAnsCommentType;
    }


    /**
     * Sets the feAnsCommentType value for this WaitFeedbackStruct.
     *
     * @param feAnsCommentType
     */
    public void setFeAnsCommentType(java.lang.String feAnsCommentType) {
        this.feAnsCommentType = feAnsCommentType;
    }

    private java.lang.Object __equalsCalc = null;

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WaitFeedbackStruct)) return false;
        WaitFeedbackStruct other = (WaitFeedbackStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                this.feItemId == other.getFeItemId() &&
                ((this.feItemName == null && other.getFeItemName() == null) ||
                        (this.feItemName != null &&
                                this.feItemName.equals(other.getFeItemName()))) &&
                this.feToUserId == other.getFeToUserId() &&
                this.feOp == other.getFeOp() &&
                ((this.feAnsCommentType == null && other.getFeAnsCommentType() == null) ||
                        (this.feAnsCommentType != null &&
                                this.feAnsCommentType.equals(other.getFeAnsCommentType())));
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
        _hashCode += getFeItemId();
        if (getFeItemName() != null) {
            _hashCode += getFeItemName().hashCode();
        }
        _hashCode += getFeToUserId();
        _hashCode += getFeOp();
        if (getFeAnsCommentType() != null) {
            _hashCode += getFeAnsCommentType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(WaitFeedbackStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:AllegroWebApi", "WaitFeedbackStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feItemId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fe-item-id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feItemName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fe-item-name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feToUserId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fe-to-user-id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feOp");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fe-op"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feAnsCommentType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fe-ans-comment-type"));
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
