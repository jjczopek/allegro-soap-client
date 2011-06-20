/**
 * TemplateInfoType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pl.net.yuri.magister.soap;

public class TemplateInfoType implements java.io.Serializable {
    private int templateId;

    private java.lang.String templateName;

    private byte[] templateThumb;

    private byte[] templateDescImages;

    public TemplateInfoType() {
    }

    public TemplateInfoType(
            int templateId,
            java.lang.String templateName,
            byte[] templateThumb,
            byte[] templateDescImages) {
        this.templateId = templateId;
        this.templateName = templateName;
        this.templateThumb = templateThumb;
        this.templateDescImages = templateDescImages;
    }


    /**
     * Gets the templateId value for this TemplateInfoType.
     *
     * @return templateId
     */
    public int getTemplateId() {
        return templateId;
    }


    /**
     * Sets the templateId value for this TemplateInfoType.
     *
     * @param templateId
     */
    public void setTemplateId(int templateId) {
        this.templateId = templateId;
    }


    /**
     * Gets the templateName value for this TemplateInfoType.
     *
     * @return templateName
     */
    public java.lang.String getTemplateName() {
        return templateName;
    }


    /**
     * Sets the templateName value for this TemplateInfoType.
     *
     * @param templateName
     */
    public void setTemplateName(java.lang.String templateName) {
        this.templateName = templateName;
    }


    /**
     * Gets the templateThumb value for this TemplateInfoType.
     *
     * @return templateThumb
     */
    public byte[] getTemplateThumb() {
        return templateThumb;
    }


    /**
     * Sets the templateThumb value for this TemplateInfoType.
     *
     * @param templateThumb
     */
    public void setTemplateThumb(byte[] templateThumb) {
        this.templateThumb = templateThumb;
    }


    /**
     * Gets the templateDescImages value for this TemplateInfoType.
     *
     * @return templateDescImages
     */
    public byte[] getTemplateDescImages() {
        return templateDescImages;
    }


    /**
     * Sets the templateDescImages value for this TemplateInfoType.
     *
     * @param templateDescImages
     */
    public void setTemplateDescImages(byte[] templateDescImages) {
        this.templateDescImages = templateDescImages;
    }

    private java.lang.Object __equalsCalc = null;

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TemplateInfoType)) return false;
        TemplateInfoType other = (TemplateInfoType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                this.templateId == other.getTemplateId() &&
                ((this.templateName == null && other.getTemplateName() == null) ||
                        (this.templateName != null &&
                                this.templateName.equals(other.getTemplateName()))) &&
                ((this.templateThumb == null && other.getTemplateThumb() == null) ||
                        (this.templateThumb != null &&
                                java.util.Arrays.equals(this.templateThumb, other.getTemplateThumb()))) &&
                ((this.templateDescImages == null && other.getTemplateDescImages() == null) ||
                        (this.templateDescImages != null &&
                                java.util.Arrays.equals(this.templateDescImages, other.getTemplateDescImages())));
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
        _hashCode += getTemplateId();
        if (getTemplateName() != null) {
            _hashCode += getTemplateName().hashCode();
        }
        if (getTemplateThumb() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getTemplateThumb());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTemplateThumb(), i);
                if (obj != null &&
                        !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTemplateDescImages() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getTemplateDescImages());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTemplateDescImages(), i);
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
            new org.apache.axis.description.TypeDesc(TemplateInfoType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:AllegroWebApi", "TemplateInfoType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("templateId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "template-id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("templateName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "template-name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("templateThumb");
        elemField.setXmlName(new javax.xml.namespace.QName("", "template-thumb"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("templateDescImages");
        elemField.setXmlName(new javax.xml.namespace.QName("", "template-desc-images"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
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
