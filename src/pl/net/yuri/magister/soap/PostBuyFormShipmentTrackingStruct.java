/**
 * PostBuyFormShipmentTrackingStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pl.net.yuri.magister.soap;

public class PostBuyFormShipmentTrackingStruct implements java.io.Serializable {
    private int postBuyFormOperatorId;

    private java.lang.String postBuyFormPackageId;

    private java.lang.String postBuyFormPackageStatus;

    public PostBuyFormShipmentTrackingStruct() {
    }

    public PostBuyFormShipmentTrackingStruct(
            int postBuyFormOperatorId,
            java.lang.String postBuyFormPackageId,
            java.lang.String postBuyFormPackageStatus) {
        this.postBuyFormOperatorId = postBuyFormOperatorId;
        this.postBuyFormPackageId = postBuyFormPackageId;
        this.postBuyFormPackageStatus = postBuyFormPackageStatus;
    }


    /**
     * Gets the postBuyFormOperatorId value for this PostBuyFormShipmentTrackingStruct.
     *
     * @return postBuyFormOperatorId
     */
    public int getPostBuyFormOperatorId() {
        return postBuyFormOperatorId;
    }


    /**
     * Sets the postBuyFormOperatorId value for this PostBuyFormShipmentTrackingStruct.
     *
     * @param postBuyFormOperatorId
     */
    public void setPostBuyFormOperatorId(int postBuyFormOperatorId) {
        this.postBuyFormOperatorId = postBuyFormOperatorId;
    }


    /**
     * Gets the postBuyFormPackageId value for this PostBuyFormShipmentTrackingStruct.
     *
     * @return postBuyFormPackageId
     */
    public java.lang.String getPostBuyFormPackageId() {
        return postBuyFormPackageId;
    }


    /**
     * Sets the postBuyFormPackageId value for this PostBuyFormShipmentTrackingStruct.
     *
     * @param postBuyFormPackageId
     */
    public void setPostBuyFormPackageId(java.lang.String postBuyFormPackageId) {
        this.postBuyFormPackageId = postBuyFormPackageId;
    }


    /**
     * Gets the postBuyFormPackageStatus value for this PostBuyFormShipmentTrackingStruct.
     *
     * @return postBuyFormPackageStatus
     */
    public java.lang.String getPostBuyFormPackageStatus() {
        return postBuyFormPackageStatus;
    }


    /**
     * Sets the postBuyFormPackageStatus value for this PostBuyFormShipmentTrackingStruct.
     *
     * @param postBuyFormPackageStatus
     */
    public void setPostBuyFormPackageStatus(java.lang.String postBuyFormPackageStatus) {
        this.postBuyFormPackageStatus = postBuyFormPackageStatus;
    }

    private java.lang.Object __equalsCalc = null;

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PostBuyFormShipmentTrackingStruct)) return false;
        PostBuyFormShipmentTrackingStruct other = (PostBuyFormShipmentTrackingStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                this.postBuyFormOperatorId == other.getPostBuyFormOperatorId() &&
                ((this.postBuyFormPackageId == null && other.getPostBuyFormPackageId() == null) ||
                        (this.postBuyFormPackageId != null &&
                                this.postBuyFormPackageId.equals(other.getPostBuyFormPackageId()))) &&
                ((this.postBuyFormPackageStatus == null && other.getPostBuyFormPackageStatus() == null) ||
                        (this.postBuyFormPackageStatus != null &&
                                this.postBuyFormPackageStatus.equals(other.getPostBuyFormPackageStatus())));
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
        _hashCode += getPostBuyFormOperatorId();
        if (getPostBuyFormPackageId() != null) {
            _hashCode += getPostBuyFormPackageId().hashCode();
        }
        if (getPostBuyFormPackageStatus() != null) {
            _hashCode += getPostBuyFormPackageStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(PostBuyFormShipmentTrackingStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:AllegroWebApi", "PostBuyFormShipmentTrackingStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postBuyFormOperatorId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "post-buy-form-operator-id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postBuyFormPackageId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "post-buy-form-package-id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postBuyFormPackageStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "post-buy-form-package-status"));
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
