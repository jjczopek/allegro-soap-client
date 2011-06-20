/**
 * ItemGetImage.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pl.net.yuri.magister.soap;

public class ItemGetImage implements java.io.Serializable {
    private long itId;

    private long itSellerId;

    private int itFotoCount;

    public ItemGetImage() {
    }

    public ItemGetImage(
            long itId,
            long itSellerId,
            int itFotoCount) {
        this.itId = itId;
        this.itSellerId = itSellerId;
        this.itFotoCount = itFotoCount;
    }


    /**
     * Gets the itId value for this ItemGetImage.
     *
     * @return itId
     */
    public long getItId() {
        return itId;
    }


    /**
     * Sets the itId value for this ItemGetImage.
     *
     * @param itId
     */
    public void setItId(long itId) {
        this.itId = itId;
    }


    /**
     * Gets the itSellerId value for this ItemGetImage.
     *
     * @return itSellerId
     */
    public long getItSellerId() {
        return itSellerId;
    }


    /**
     * Sets the itSellerId value for this ItemGetImage.
     *
     * @param itSellerId
     */
    public void setItSellerId(long itSellerId) {
        this.itSellerId = itSellerId;
    }


    /**
     * Gets the itFotoCount value for this ItemGetImage.
     *
     * @return itFotoCount
     */
    public int getItFotoCount() {
        return itFotoCount;
    }


    /**
     * Sets the itFotoCount value for this ItemGetImage.
     *
     * @param itFotoCount
     */
    public void setItFotoCount(int itFotoCount) {
        this.itFotoCount = itFotoCount;
    }

    private java.lang.Object __equalsCalc = null;

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ItemGetImage)) return false;
        ItemGetImage other = (ItemGetImage) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                this.itId == other.getItId() &&
                this.itSellerId == other.getItSellerId() &&
                this.itFotoCount == other.getItFotoCount();
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
        _hashCode += new Long(getItId()).hashCode();
        _hashCode += new Long(getItSellerId()).hashCode();
        _hashCode += getItFotoCount();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(ItemGetImage.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:AllegroWebApi", "ItemGetImage"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "it-id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itSellerId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "it-seller-id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itFotoCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "it-foto-count"));
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
