/**
 * DealsStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pl.net.yuri.magister.soap;

public class DealsStruct implements java.io.Serializable {
    private long dealId;

    private long dealDate;

    private int dealQuantity;

    private float dealAmountOriginal;

    private float dealAmountDiscounted;

    public DealsStruct() {
    }

    public DealsStruct(
            long dealId,
            long dealDate,
            int dealQuantity,
            float dealAmountOriginal,
            float dealAmountDiscounted) {
        this.dealId = dealId;
        this.dealDate = dealDate;
        this.dealQuantity = dealQuantity;
        this.dealAmountOriginal = dealAmountOriginal;
        this.dealAmountDiscounted = dealAmountDiscounted;
    }


    /**
     * Gets the dealId value for this DealsStruct.
     *
     * @return dealId
     */
    public long getDealId() {
        return dealId;
    }


    /**
     * Sets the dealId value for this DealsStruct.
     *
     * @param dealId
     */
    public void setDealId(long dealId) {
        this.dealId = dealId;
    }


    /**
     * Gets the dealDate value for this DealsStruct.
     *
     * @return dealDate
     */
    public long getDealDate() {
        return dealDate;
    }


    /**
     * Sets the dealDate value for this DealsStruct.
     *
     * @param dealDate
     */
    public void setDealDate(long dealDate) {
        this.dealDate = dealDate;
    }


    /**
     * Gets the dealQuantity value for this DealsStruct.
     *
     * @return dealQuantity
     */
    public int getDealQuantity() {
        return dealQuantity;
    }


    /**
     * Sets the dealQuantity value for this DealsStruct.
     *
     * @param dealQuantity
     */
    public void setDealQuantity(int dealQuantity) {
        this.dealQuantity = dealQuantity;
    }


    /**
     * Gets the dealAmountOriginal value for this DealsStruct.
     *
     * @return dealAmountOriginal
     */
    public float getDealAmountOriginal() {
        return dealAmountOriginal;
    }


    /**
     * Sets the dealAmountOriginal value for this DealsStruct.
     *
     * @param dealAmountOriginal
     */
    public void setDealAmountOriginal(float dealAmountOriginal) {
        this.dealAmountOriginal = dealAmountOriginal;
    }


    /**
     * Gets the dealAmountDiscounted value for this DealsStruct.
     *
     * @return dealAmountDiscounted
     */
    public float getDealAmountDiscounted() {
        return dealAmountDiscounted;
    }


    /**
     * Sets the dealAmountDiscounted value for this DealsStruct.
     *
     * @param dealAmountDiscounted
     */
    public void setDealAmountDiscounted(float dealAmountDiscounted) {
        this.dealAmountDiscounted = dealAmountDiscounted;
    }

    private java.lang.Object __equalsCalc = null;

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DealsStruct)) return false;
        DealsStruct other = (DealsStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                this.dealId == other.getDealId() &&
                this.dealDate == other.getDealDate() &&
                this.dealQuantity == other.getDealQuantity() &&
                this.dealAmountOriginal == other.getDealAmountOriginal() &&
                this.dealAmountDiscounted == other.getDealAmountDiscounted();
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
        _hashCode += new Long(getDealId()).hashCode();
        _hashCode += new Long(getDealDate()).hashCode();
        _hashCode += getDealQuantity();
        _hashCode += new Float(getDealAmountOriginal()).hashCode();
        _hashCode += new Float(getDealAmountDiscounted()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(DealsStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:AllegroWebApi", "DealsStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dealId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deal-id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dealDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deal-date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dealQuantity");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deal-quantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dealAmountOriginal");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deal-amount-original"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dealAmountDiscounted");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deal-amount-discounted"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
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
