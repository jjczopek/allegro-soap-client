/**
 * PostageStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pl.net.yuri.magister.soap;

public class PostageStruct implements java.io.Serializable {
    private float postageAmount;

    private float postageAmountAdd;

    private int postagePackSize;

    private int postageId;

    public PostageStruct() {
    }

    public PostageStruct(
            float postageAmount,
            float postageAmountAdd,
            int postagePackSize,
            int postageId) {
        this.postageAmount = postageAmount;
        this.postageAmountAdd = postageAmountAdd;
        this.postagePackSize = postagePackSize;
        this.postageId = postageId;
    }


    /**
     * Gets the postageAmount value for this PostageStruct.
     *
     * @return postageAmount
     */
    public float getPostageAmount() {
        return postageAmount;
    }


    /**
     * Sets the postageAmount value for this PostageStruct.
     *
     * @param postageAmount
     */
    public void setPostageAmount(float postageAmount) {
        this.postageAmount = postageAmount;
    }


    /**
     * Gets the postageAmountAdd value for this PostageStruct.
     *
     * @return postageAmountAdd
     */
    public float getPostageAmountAdd() {
        return postageAmountAdd;
    }


    /**
     * Sets the postageAmountAdd value for this PostageStruct.
     *
     * @param postageAmountAdd
     */
    public void setPostageAmountAdd(float postageAmountAdd) {
        this.postageAmountAdd = postageAmountAdd;
    }


    /**
     * Gets the postagePackSize value for this PostageStruct.
     *
     * @return postagePackSize
     */
    public int getPostagePackSize() {
        return postagePackSize;
    }


    /**
     * Sets the postagePackSize value for this PostageStruct.
     *
     * @param postagePackSize
     */
    public void setPostagePackSize(int postagePackSize) {
        this.postagePackSize = postagePackSize;
    }


    /**
     * Gets the postageId value for this PostageStruct.
     *
     * @return postageId
     */
    public int getPostageId() {
        return postageId;
    }


    /**
     * Sets the postageId value for this PostageStruct.
     *
     * @param postageId
     */
    public void setPostageId(int postageId) {
        this.postageId = postageId;
    }

    private java.lang.Object __equalsCalc = null;

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PostageStruct)) return false;
        PostageStruct other = (PostageStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                this.postageAmount == other.getPostageAmount() &&
                this.postageAmountAdd == other.getPostageAmountAdd() &&
                this.postagePackSize == other.getPostagePackSize() &&
                this.postageId == other.getPostageId();
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
        _hashCode += new Float(getPostageAmount()).hashCode();
        _hashCode += new Float(getPostageAmountAdd()).hashCode();
        _hashCode += getPostagePackSize();
        _hashCode += getPostageId();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(PostageStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:AllegroWebApi", "PostageStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postageAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "postage-amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postageAmountAdd");
        elemField.setXmlName(new javax.xml.namespace.QName("", "postage-amount-add"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postagePackSize");
        elemField.setXmlName(new javax.xml.namespace.QName("", "postage-pack-size"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postageId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "postage-id"));
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
