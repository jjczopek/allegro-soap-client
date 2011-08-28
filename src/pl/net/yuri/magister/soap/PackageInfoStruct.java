/**
 * PackageInfoStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pl.net.yuri.magister.soap;

public class PackageInfoStruct implements java.io.Serializable {
    private int operatorId;

    private java.lang.String packageId;

    public PackageInfoStruct() {
    }

    public PackageInfoStruct(
            int operatorId,
            java.lang.String packageId) {
        this.operatorId = operatorId;
        this.packageId = packageId;
    }


    /**
     * Gets the operatorId value for this PackageInfoStruct.
     *
     * @return operatorId
     */
    public int getOperatorId() {
        return operatorId;
    }


    /**
     * Sets the operatorId value for this PackageInfoStruct.
     *
     * @param operatorId
     */
    public void setOperatorId(int operatorId) {
        this.operatorId = operatorId;
    }


    /**
     * Gets the packageId value for this PackageInfoStruct.
     *
     * @return packageId
     */
    public java.lang.String getPackageId() {
        return packageId;
    }


    /**
     * Sets the packageId value for this PackageInfoStruct.
     *
     * @param packageId
     */
    public void setPackageId(java.lang.String packageId) {
        this.packageId = packageId;
    }

    private java.lang.Object __equalsCalc = null;

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PackageInfoStruct)) return false;
        PackageInfoStruct other = (PackageInfoStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                this.operatorId == other.getOperatorId() &&
                ((this.packageId == null && other.getPackageId() == null) ||
                        (this.packageId != null &&
                                this.packageId.equals(other.getPackageId())));
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
        _hashCode += getOperatorId();
        if (getPackageId() != null) {
            _hashCode += getPackageId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(PackageInfoStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:AllegroWebApi", "PackageInfoStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operatorId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "operator-id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packageId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "package-id"));
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
