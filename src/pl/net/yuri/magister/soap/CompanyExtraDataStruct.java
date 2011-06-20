/**
 * CompanyExtraDataStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pl.net.yuri.magister.soap;

public class CompanyExtraDataStruct implements java.io.Serializable {
    private java.lang.String companyType;

    private java.lang.String companyNip;

    private java.lang.String companyRegon;

    private java.lang.String companyKrs;

    private java.lang.String companyActivitySort;

    public CompanyExtraDataStruct() {
    }

    public CompanyExtraDataStruct(
            java.lang.String companyType,
            java.lang.String companyNip,
            java.lang.String companyRegon,
            java.lang.String companyKrs,
            java.lang.String companyActivitySort) {
        this.companyType = companyType;
        this.companyNip = companyNip;
        this.companyRegon = companyRegon;
        this.companyKrs = companyKrs;
        this.companyActivitySort = companyActivitySort;
    }


    /**
     * Gets the companyType value for this CompanyExtraDataStruct.
     *
     * @return companyType
     */
    public java.lang.String getCompanyType() {
        return companyType;
    }


    /**
     * Sets the companyType value for this CompanyExtraDataStruct.
     *
     * @param companyType
     */
    public void setCompanyType(java.lang.String companyType) {
        this.companyType = companyType;
    }


    /**
     * Gets the companyNip value for this CompanyExtraDataStruct.
     *
     * @return companyNip
     */
    public java.lang.String getCompanyNip() {
        return companyNip;
    }


    /**
     * Sets the companyNip value for this CompanyExtraDataStruct.
     *
     * @param companyNip
     */
    public void setCompanyNip(java.lang.String companyNip) {
        this.companyNip = companyNip;
    }


    /**
     * Gets the companyRegon value for this CompanyExtraDataStruct.
     *
     * @return companyRegon
     */
    public java.lang.String getCompanyRegon() {
        return companyRegon;
    }


    /**
     * Sets the companyRegon value for this CompanyExtraDataStruct.
     *
     * @param companyRegon
     */
    public void setCompanyRegon(java.lang.String companyRegon) {
        this.companyRegon = companyRegon;
    }


    /**
     * Gets the companyKrs value for this CompanyExtraDataStruct.
     *
     * @return companyKrs
     */
    public java.lang.String getCompanyKrs() {
        return companyKrs;
    }


    /**
     * Sets the companyKrs value for this CompanyExtraDataStruct.
     *
     * @param companyKrs
     */
    public void setCompanyKrs(java.lang.String companyKrs) {
        this.companyKrs = companyKrs;
    }


    /**
     * Gets the companyActivitySort value for this CompanyExtraDataStruct.
     *
     * @return companyActivitySort
     */
    public java.lang.String getCompanyActivitySort() {
        return companyActivitySort;
    }


    /**
     * Sets the companyActivitySort value for this CompanyExtraDataStruct.
     *
     * @param companyActivitySort
     */
    public void setCompanyActivitySort(java.lang.String companyActivitySort) {
        this.companyActivitySort = companyActivitySort;
    }

    private java.lang.Object __equalsCalc = null;

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CompanyExtraDataStruct)) return false;
        CompanyExtraDataStruct other = (CompanyExtraDataStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.companyType == null && other.getCompanyType() == null) ||
                        (this.companyType != null &&
                                this.companyType.equals(other.getCompanyType()))) &&
                ((this.companyNip == null && other.getCompanyNip() == null) ||
                        (this.companyNip != null &&
                                this.companyNip.equals(other.getCompanyNip()))) &&
                ((this.companyRegon == null && other.getCompanyRegon() == null) ||
                        (this.companyRegon != null &&
                                this.companyRegon.equals(other.getCompanyRegon()))) &&
                ((this.companyKrs == null && other.getCompanyKrs() == null) ||
                        (this.companyKrs != null &&
                                this.companyKrs.equals(other.getCompanyKrs()))) &&
                ((this.companyActivitySort == null && other.getCompanyActivitySort() == null) ||
                        (this.companyActivitySort != null &&
                                this.companyActivitySort.equals(other.getCompanyActivitySort())));
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
        if (getCompanyType() != null) {
            _hashCode += getCompanyType().hashCode();
        }
        if (getCompanyNip() != null) {
            _hashCode += getCompanyNip().hashCode();
        }
        if (getCompanyRegon() != null) {
            _hashCode += getCompanyRegon().hashCode();
        }
        if (getCompanyKrs() != null) {
            _hashCode += getCompanyKrs().hashCode();
        }
        if (getCompanyActivitySort() != null) {
            _hashCode += getCompanyActivitySort().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(CompanyExtraDataStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:AllegroWebApi", "CompanyExtraDataStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("companyType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "company-type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("companyNip");
        elemField.setXmlName(new javax.xml.namespace.QName("", "company-nip"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("companyRegon");
        elemField.setXmlName(new javax.xml.namespace.QName("", "company-regon"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("companyKrs");
        elemField.setXmlName(new javax.xml.namespace.QName("", "company-krs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("companyActivitySort");
        elemField.setXmlName(new javax.xml.namespace.QName("", "company-activity-sort"));
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
