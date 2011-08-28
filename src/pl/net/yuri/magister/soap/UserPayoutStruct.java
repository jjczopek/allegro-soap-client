/**
 * UserPayoutStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pl.net.yuri.magister.soap;

public class UserPayoutStruct implements java.io.Serializable {
    private long payTransId;

    private java.lang.String payTransStatus;

    private float payTransAmount;

    private long payTransCreateDate;

    private long payTransRecvDate;

    private long payTransCancelDate;

    private java.lang.String payTransReport;

    public UserPayoutStruct() {
    }

    public UserPayoutStruct(
            long payTransId,
            java.lang.String payTransStatus,
            float payTransAmount,
            long payTransCreateDate,
            long payTransRecvDate,
            long payTransCancelDate,
            java.lang.String payTransReport) {
        this.payTransId = payTransId;
        this.payTransStatus = payTransStatus;
        this.payTransAmount = payTransAmount;
        this.payTransCreateDate = payTransCreateDate;
        this.payTransRecvDate = payTransRecvDate;
        this.payTransCancelDate = payTransCancelDate;
        this.payTransReport = payTransReport;
    }


    /**
     * Gets the payTransId value for this UserPayoutStruct.
     *
     * @return payTransId
     */
    public long getPayTransId() {
        return payTransId;
    }


    /**
     * Sets the payTransId value for this UserPayoutStruct.
     *
     * @param payTransId
     */
    public void setPayTransId(long payTransId) {
        this.payTransId = payTransId;
    }


    /**
     * Gets the payTransStatus value for this UserPayoutStruct.
     *
     * @return payTransStatus
     */
    public java.lang.String getPayTransStatus() {
        return payTransStatus;
    }


    /**
     * Sets the payTransStatus value for this UserPayoutStruct.
     *
     * @param payTransStatus
     */
    public void setPayTransStatus(java.lang.String payTransStatus) {
        this.payTransStatus = payTransStatus;
    }


    /**
     * Gets the payTransAmount value for this UserPayoutStruct.
     *
     * @return payTransAmount
     */
    public float getPayTransAmount() {
        return payTransAmount;
    }


    /**
     * Sets the payTransAmount value for this UserPayoutStruct.
     *
     * @param payTransAmount
     */
    public void setPayTransAmount(float payTransAmount) {
        this.payTransAmount = payTransAmount;
    }


    /**
     * Gets the payTransCreateDate value for this UserPayoutStruct.
     *
     * @return payTransCreateDate
     */
    public long getPayTransCreateDate() {
        return payTransCreateDate;
    }


    /**
     * Sets the payTransCreateDate value for this UserPayoutStruct.
     *
     * @param payTransCreateDate
     */
    public void setPayTransCreateDate(long payTransCreateDate) {
        this.payTransCreateDate = payTransCreateDate;
    }


    /**
     * Gets the payTransRecvDate value for this UserPayoutStruct.
     *
     * @return payTransRecvDate
     */
    public long getPayTransRecvDate() {
        return payTransRecvDate;
    }


    /**
     * Sets the payTransRecvDate value for this UserPayoutStruct.
     *
     * @param payTransRecvDate
     */
    public void setPayTransRecvDate(long payTransRecvDate) {
        this.payTransRecvDate = payTransRecvDate;
    }


    /**
     * Gets the payTransCancelDate value for this UserPayoutStruct.
     *
     * @return payTransCancelDate
     */
    public long getPayTransCancelDate() {
        return payTransCancelDate;
    }


    /**
     * Sets the payTransCancelDate value for this UserPayoutStruct.
     *
     * @param payTransCancelDate
     */
    public void setPayTransCancelDate(long payTransCancelDate) {
        this.payTransCancelDate = payTransCancelDate;
    }


    /**
     * Gets the payTransReport value for this UserPayoutStruct.
     *
     * @return payTransReport
     */
    public java.lang.String getPayTransReport() {
        return payTransReport;
    }


    /**
     * Sets the payTransReport value for this UserPayoutStruct.
     *
     * @param payTransReport
     */
    public void setPayTransReport(java.lang.String payTransReport) {
        this.payTransReport = payTransReport;
    }

    private java.lang.Object __equalsCalc = null;

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UserPayoutStruct)) return false;
        UserPayoutStruct other = (UserPayoutStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                this.payTransId == other.getPayTransId() &&
                ((this.payTransStatus == null && other.getPayTransStatus() == null) ||
                        (this.payTransStatus != null &&
                                this.payTransStatus.equals(other.getPayTransStatus()))) &&
                this.payTransAmount == other.getPayTransAmount() &&
                this.payTransCreateDate == other.getPayTransCreateDate() &&
                this.payTransRecvDate == other.getPayTransRecvDate() &&
                this.payTransCancelDate == other.getPayTransCancelDate() &&
                ((this.payTransReport == null && other.getPayTransReport() == null) ||
                        (this.payTransReport != null &&
                                this.payTransReport.equals(other.getPayTransReport())));
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
        _hashCode += new Long(getPayTransId()).hashCode();
        if (getPayTransStatus() != null) {
            _hashCode += getPayTransStatus().hashCode();
        }
        _hashCode += new Float(getPayTransAmount()).hashCode();
        _hashCode += new Long(getPayTransCreateDate()).hashCode();
        _hashCode += new Long(getPayTransRecvDate()).hashCode();
        _hashCode += new Long(getPayTransCancelDate()).hashCode();
        if (getPayTransReport() != null) {
            _hashCode += getPayTransReport().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(UserPayoutStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:AllegroWebApi", "UserPayoutStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payTransId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pay-trans-id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payTransStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pay-trans-status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payTransAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pay-trans-amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payTransCreateDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pay-trans-create-date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payTransRecvDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pay-trans-recv-date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payTransCancelDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pay-trans-cancel-date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payTransReport");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pay-trans-report"));
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
