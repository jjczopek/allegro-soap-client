/**
 * ServiceInfoCatStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pl.net.yuri.magister.soap;

public class ServiceInfoCatStruct implements java.io.Serializable {
    private int anCatId;

    private java.lang.String anCatName;

    public ServiceInfoCatStruct() {
    }

    public ServiceInfoCatStruct(
            int anCatId,
            java.lang.String anCatName) {
        this.anCatId = anCatId;
        this.anCatName = anCatName;
    }


    /**
     * Gets the anCatId value for this ServiceInfoCatStruct.
     *
     * @return anCatId
     */
    public int getAnCatId() {
        return anCatId;
    }


    /**
     * Sets the anCatId value for this ServiceInfoCatStruct.
     *
     * @param anCatId
     */
    public void setAnCatId(int anCatId) {
        this.anCatId = anCatId;
    }


    /**
     * Gets the anCatName value for this ServiceInfoCatStruct.
     *
     * @return anCatName
     */
    public java.lang.String getAnCatName() {
        return anCatName;
    }


    /**
     * Sets the anCatName value for this ServiceInfoCatStruct.
     *
     * @param anCatName
     */
    public void setAnCatName(java.lang.String anCatName) {
        this.anCatName = anCatName;
    }

    private java.lang.Object __equalsCalc = null;

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ServiceInfoCatStruct)) return false;
        ServiceInfoCatStruct other = (ServiceInfoCatStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                this.anCatId == other.getAnCatId() &&
                ((this.anCatName == null && other.getAnCatName() == null) ||
                        (this.anCatName != null &&
                                this.anCatName.equals(other.getAnCatName())));
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
        _hashCode += getAnCatId();
        if (getAnCatName() != null) {
            _hashCode += getAnCatName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(ServiceInfoCatStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:AllegroWebApi", "ServiceInfoCatStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("anCatId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "an-cat-id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("anCatName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "an-cat-name"));
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
