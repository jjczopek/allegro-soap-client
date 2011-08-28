/**
 * PostBuyFormPackageInfoStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pl.net.yuri.magister.soap;

public class PostBuyFormPackageInfoStruct implements java.io.Serializable {
    private java.lang.String[] packageIdsAdded;

    private java.lang.String[] packageIdsNotAddedIncorrectOperatorId;

    private java.lang.String[] packageIdsNotAddedIncorrectPackageId;

    public PostBuyFormPackageInfoStruct() {
    }

    public PostBuyFormPackageInfoStruct(
            java.lang.String[] packageIdsAdded,
            java.lang.String[] packageIdsNotAddedIncorrectOperatorId,
            java.lang.String[] packageIdsNotAddedIncorrectPackageId) {
        this.packageIdsAdded = packageIdsAdded;
        this.packageIdsNotAddedIncorrectOperatorId = packageIdsNotAddedIncorrectOperatorId;
        this.packageIdsNotAddedIncorrectPackageId = packageIdsNotAddedIncorrectPackageId;
    }


    /**
     * Gets the packageIdsAdded value for this PostBuyFormPackageInfoStruct.
     *
     * @return packageIdsAdded
     */
    public java.lang.String[] getPackageIdsAdded() {
        return packageIdsAdded;
    }


    /**
     * Sets the packageIdsAdded value for this PostBuyFormPackageInfoStruct.
     *
     * @param packageIdsAdded
     */
    public void setPackageIdsAdded(java.lang.String[] packageIdsAdded) {
        this.packageIdsAdded = packageIdsAdded;
    }


    /**
     * Gets the packageIdsNotAddedIncorrectOperatorId value for this PostBuyFormPackageInfoStruct.
     *
     * @return packageIdsNotAddedIncorrectOperatorId
     */
    public java.lang.String[] getPackageIdsNotAddedIncorrectOperatorId() {
        return packageIdsNotAddedIncorrectOperatorId;
    }


    /**
     * Sets the packageIdsNotAddedIncorrectOperatorId value for this PostBuyFormPackageInfoStruct.
     *
     * @param packageIdsNotAddedIncorrectOperatorId
     *
     */
    public void setPackageIdsNotAddedIncorrectOperatorId(java.lang.String[] packageIdsNotAddedIncorrectOperatorId) {
        this.packageIdsNotAddedIncorrectOperatorId = packageIdsNotAddedIncorrectOperatorId;
    }


    /**
     * Gets the packageIdsNotAddedIncorrectPackageId value for this PostBuyFormPackageInfoStruct.
     *
     * @return packageIdsNotAddedIncorrectPackageId
     */
    public java.lang.String[] getPackageIdsNotAddedIncorrectPackageId() {
        return packageIdsNotAddedIncorrectPackageId;
    }


    /**
     * Sets the packageIdsNotAddedIncorrectPackageId value for this PostBuyFormPackageInfoStruct.
     *
     * @param packageIdsNotAddedIncorrectPackageId
     *
     */
    public void setPackageIdsNotAddedIncorrectPackageId(java.lang.String[] packageIdsNotAddedIncorrectPackageId) {
        this.packageIdsNotAddedIncorrectPackageId = packageIdsNotAddedIncorrectPackageId;
    }

    private java.lang.Object __equalsCalc = null;

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PostBuyFormPackageInfoStruct)) return false;
        PostBuyFormPackageInfoStruct other = (PostBuyFormPackageInfoStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.packageIdsAdded == null && other.getPackageIdsAdded() == null) ||
                        (this.packageIdsAdded != null &&
                                java.util.Arrays.equals(this.packageIdsAdded, other.getPackageIdsAdded()))) &&
                ((this.packageIdsNotAddedIncorrectOperatorId == null && other.getPackageIdsNotAddedIncorrectOperatorId() == null) ||
                        (this.packageIdsNotAddedIncorrectOperatorId != null &&
                                java.util.Arrays.equals(this.packageIdsNotAddedIncorrectOperatorId, other.getPackageIdsNotAddedIncorrectOperatorId()))) &&
                ((this.packageIdsNotAddedIncorrectPackageId == null && other.getPackageIdsNotAddedIncorrectPackageId() == null) ||
                        (this.packageIdsNotAddedIncorrectPackageId != null &&
                                java.util.Arrays.equals(this.packageIdsNotAddedIncorrectPackageId, other.getPackageIdsNotAddedIncorrectPackageId())));
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
        if (getPackageIdsAdded() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getPackageIdsAdded());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPackageIdsAdded(), i);
                if (obj != null &&
                        !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPackageIdsNotAddedIncorrectOperatorId() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getPackageIdsNotAddedIncorrectOperatorId());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPackageIdsNotAddedIncorrectOperatorId(), i);
                if (obj != null &&
                        !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPackageIdsNotAddedIncorrectPackageId() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getPackageIdsNotAddedIncorrectPackageId());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPackageIdsNotAddedIncorrectPackageId(), i);
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
            new org.apache.axis.description.TypeDesc(PostBuyFormPackageInfoStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:AllegroWebApi", "PostBuyFormPackageInfoStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packageIdsAdded");
        elemField.setXmlName(new javax.xml.namespace.QName("", "package-ids-added"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packageIdsNotAddedIncorrectOperatorId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "package-ids-not-added-incorrect-operator-id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packageIdsNotAddedIncorrectPackageId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "package-ids-not-added-incorrect-package-id"));
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
