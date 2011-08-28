/**
 * FeedbackManyStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pl.net.yuri.magister.soap;

public class FeedbackManyStruct implements java.io.Serializable {
    private int feItemId;

    private int feFromUserId;

    private int feToUserId;

    private java.lang.String feComment;

    private java.lang.String feCommentType;

    private int feOp;

    private pl.net.yuri.magister.soap.SellRatingEstimationStruct[] feRating;

    public FeedbackManyStruct() {
    }

    public FeedbackManyStruct(
            int feItemId,
            int feFromUserId,
            int feToUserId,
            java.lang.String feComment,
            java.lang.String feCommentType,
            int feOp,
            pl.net.yuri.magister.soap.SellRatingEstimationStruct[] feRating) {
        this.feItemId = feItemId;
        this.feFromUserId = feFromUserId;
        this.feToUserId = feToUserId;
        this.feComment = feComment;
        this.feCommentType = feCommentType;
        this.feOp = feOp;
        this.feRating = feRating;
    }


    /**
     * Gets the feItemId value for this FeedbackManyStruct.
     *
     * @return feItemId
     */
    public int getFeItemId() {
        return feItemId;
    }


    /**
     * Sets the feItemId value for this FeedbackManyStruct.
     *
     * @param feItemId
     */
    public void setFeItemId(int feItemId) {
        this.feItemId = feItemId;
    }


    /**
     * Gets the feFromUserId value for this FeedbackManyStruct.
     *
     * @return feFromUserId
     */
    public int getFeFromUserId() {
        return feFromUserId;
    }


    /**
     * Sets the feFromUserId value for this FeedbackManyStruct.
     *
     * @param feFromUserId
     */
    public void setFeFromUserId(int feFromUserId) {
        this.feFromUserId = feFromUserId;
    }


    /**
     * Gets the feToUserId value for this FeedbackManyStruct.
     *
     * @return feToUserId
     */
    public int getFeToUserId() {
        return feToUserId;
    }


    /**
     * Sets the feToUserId value for this FeedbackManyStruct.
     *
     * @param feToUserId
     */
    public void setFeToUserId(int feToUserId) {
        this.feToUserId = feToUserId;
    }


    /**
     * Gets the feComment value for this FeedbackManyStruct.
     *
     * @return feComment
     */
    public java.lang.String getFeComment() {
        return feComment;
    }


    /**
     * Sets the feComment value for this FeedbackManyStruct.
     *
     * @param feComment
     */
    public void setFeComment(java.lang.String feComment) {
        this.feComment = feComment;
    }


    /**
     * Gets the feCommentType value for this FeedbackManyStruct.
     *
     * @return feCommentType
     */
    public java.lang.String getFeCommentType() {
        return feCommentType;
    }


    /**
     * Sets the feCommentType value for this FeedbackManyStruct.
     *
     * @param feCommentType
     */
    public void setFeCommentType(java.lang.String feCommentType) {
        this.feCommentType = feCommentType;
    }


    /**
     * Gets the feOp value for this FeedbackManyStruct.
     *
     * @return feOp
     */
    public int getFeOp() {
        return feOp;
    }


    /**
     * Sets the feOp value for this FeedbackManyStruct.
     *
     * @param feOp
     */
    public void setFeOp(int feOp) {
        this.feOp = feOp;
    }


    /**
     * Gets the feRating value for this FeedbackManyStruct.
     *
     * @return feRating
     */
    public pl.net.yuri.magister.soap.SellRatingEstimationStruct[] getFeRating() {
        return feRating;
    }


    /**
     * Sets the feRating value for this FeedbackManyStruct.
     *
     * @param feRating
     */
    public void setFeRating(pl.net.yuri.magister.soap.SellRatingEstimationStruct[] feRating) {
        this.feRating = feRating;
    }

    private java.lang.Object __equalsCalc = null;

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FeedbackManyStruct)) return false;
        FeedbackManyStruct other = (FeedbackManyStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                this.feItemId == other.getFeItemId() &&
                this.feFromUserId == other.getFeFromUserId() &&
                this.feToUserId == other.getFeToUserId() &&
                ((this.feComment == null && other.getFeComment() == null) ||
                        (this.feComment != null &&
                                this.feComment.equals(other.getFeComment()))) &&
                ((this.feCommentType == null && other.getFeCommentType() == null) ||
                        (this.feCommentType != null &&
                                this.feCommentType.equals(other.getFeCommentType()))) &&
                this.feOp == other.getFeOp() &&
                ((this.feRating == null && other.getFeRating() == null) ||
                        (this.feRating != null &&
                                java.util.Arrays.equals(this.feRating, other.getFeRating())));
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
        _hashCode += getFeFromUserId();
        _hashCode += getFeToUserId();
        if (getFeComment() != null) {
            _hashCode += getFeComment().hashCode();
        }
        if (getFeCommentType() != null) {
            _hashCode += getFeCommentType().hashCode();
        }
        _hashCode += getFeOp();
        if (getFeRating() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getFeRating());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFeRating(), i);
                if (obj != null &&
                        !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(FeedbackManyStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:AllegroWebApi", "FeedbackManyStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feItemId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fe-item-id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feFromUserId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fe-from-user-id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feToUserId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fe-to-user-id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feComment");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fe-comment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feCommentType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fe-comment-type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feOp");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fe-op"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feRating");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fe-rating"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:AllegroWebApi", "SellRatingEstimationStruct"));
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
