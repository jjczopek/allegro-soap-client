/**
 * RefundFormDataStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pl.net.yuri.magister.soap;

public class RefundFormDataStruct implements java.io.Serializable {
    private long refFormItId;

    private java.lang.String refFormItName;

    private long refFormItEndingTime;

    private int refFormBuyerId;

    private java.lang.String refFormBuyerLogin;

    private java.lang.String refFormBuyerEmail;

    private long refFormBuyDate;

    private int refFormReasonId;

    private int refFormItQuantitySold;

    private int refFormReminderSent;

    public RefundFormDataStruct() {
    }

    public RefundFormDataStruct(
            long refFormItId,
            java.lang.String refFormItName,
            long refFormItEndingTime,
            int refFormBuyerId,
            java.lang.String refFormBuyerLogin,
            java.lang.String refFormBuyerEmail,
            long refFormBuyDate,
            int refFormReasonId,
            int refFormItQuantitySold,
            int refFormReminderSent) {
        this.refFormItId = refFormItId;
        this.refFormItName = refFormItName;
        this.refFormItEndingTime = refFormItEndingTime;
        this.refFormBuyerId = refFormBuyerId;
        this.refFormBuyerLogin = refFormBuyerLogin;
        this.refFormBuyerEmail = refFormBuyerEmail;
        this.refFormBuyDate = refFormBuyDate;
        this.refFormReasonId = refFormReasonId;
        this.refFormItQuantitySold = refFormItQuantitySold;
        this.refFormReminderSent = refFormReminderSent;
    }


    /**
     * Gets the refFormItId value for this RefundFormDataStruct.
     *
     * @return refFormItId
     */
    public long getRefFormItId() {
        return refFormItId;
    }


    /**
     * Sets the refFormItId value for this RefundFormDataStruct.
     *
     * @param refFormItId
     */
    public void setRefFormItId(long refFormItId) {
        this.refFormItId = refFormItId;
    }


    /**
     * Gets the refFormItName value for this RefundFormDataStruct.
     *
     * @return refFormItName
     */
    public java.lang.String getRefFormItName() {
        return refFormItName;
    }


    /**
     * Sets the refFormItName value for this RefundFormDataStruct.
     *
     * @param refFormItName
     */
    public void setRefFormItName(java.lang.String refFormItName) {
        this.refFormItName = refFormItName;
    }


    /**
     * Gets the refFormItEndingTime value for this RefundFormDataStruct.
     *
     * @return refFormItEndingTime
     */
    public long getRefFormItEndingTime() {
        return refFormItEndingTime;
    }


    /**
     * Sets the refFormItEndingTime value for this RefundFormDataStruct.
     *
     * @param refFormItEndingTime
     */
    public void setRefFormItEndingTime(long refFormItEndingTime) {
        this.refFormItEndingTime = refFormItEndingTime;
    }


    /**
     * Gets the refFormBuyerId value for this RefundFormDataStruct.
     *
     * @return refFormBuyerId
     */
    public int getRefFormBuyerId() {
        return refFormBuyerId;
    }


    /**
     * Sets the refFormBuyerId value for this RefundFormDataStruct.
     *
     * @param refFormBuyerId
     */
    public void setRefFormBuyerId(int refFormBuyerId) {
        this.refFormBuyerId = refFormBuyerId;
    }


    /**
     * Gets the refFormBuyerLogin value for this RefundFormDataStruct.
     *
     * @return refFormBuyerLogin
     */
    public java.lang.String getRefFormBuyerLogin() {
        return refFormBuyerLogin;
    }


    /**
     * Sets the refFormBuyerLogin value for this RefundFormDataStruct.
     *
     * @param refFormBuyerLogin
     */
    public void setRefFormBuyerLogin(java.lang.String refFormBuyerLogin) {
        this.refFormBuyerLogin = refFormBuyerLogin;
    }


    /**
     * Gets the refFormBuyerEmail value for this RefundFormDataStruct.
     *
     * @return refFormBuyerEmail
     */
    public java.lang.String getRefFormBuyerEmail() {
        return refFormBuyerEmail;
    }


    /**
     * Sets the refFormBuyerEmail value for this RefundFormDataStruct.
     *
     * @param refFormBuyerEmail
     */
    public void setRefFormBuyerEmail(java.lang.String refFormBuyerEmail) {
        this.refFormBuyerEmail = refFormBuyerEmail;
    }


    /**
     * Gets the refFormBuyDate value for this RefundFormDataStruct.
     *
     * @return refFormBuyDate
     */
    public long getRefFormBuyDate() {
        return refFormBuyDate;
    }


    /**
     * Sets the refFormBuyDate value for this RefundFormDataStruct.
     *
     * @param refFormBuyDate
     */
    public void setRefFormBuyDate(long refFormBuyDate) {
        this.refFormBuyDate = refFormBuyDate;
    }


    /**
     * Gets the refFormReasonId value for this RefundFormDataStruct.
     *
     * @return refFormReasonId
     */
    public int getRefFormReasonId() {
        return refFormReasonId;
    }


    /**
     * Sets the refFormReasonId value for this RefundFormDataStruct.
     *
     * @param refFormReasonId
     */
    public void setRefFormReasonId(int refFormReasonId) {
        this.refFormReasonId = refFormReasonId;
    }


    /**
     * Gets the refFormItQuantitySold value for this RefundFormDataStruct.
     *
     * @return refFormItQuantitySold
     */
    public int getRefFormItQuantitySold() {
        return refFormItQuantitySold;
    }


    /**
     * Sets the refFormItQuantitySold value for this RefundFormDataStruct.
     *
     * @param refFormItQuantitySold
     */
    public void setRefFormItQuantitySold(int refFormItQuantitySold) {
        this.refFormItQuantitySold = refFormItQuantitySold;
    }


    /**
     * Gets the refFormReminderSent value for this RefundFormDataStruct.
     *
     * @return refFormReminderSent
     */
    public int getRefFormReminderSent() {
        return refFormReminderSent;
    }


    /**
     * Sets the refFormReminderSent value for this RefundFormDataStruct.
     *
     * @param refFormReminderSent
     */
    public void setRefFormReminderSent(int refFormReminderSent) {
        this.refFormReminderSent = refFormReminderSent;
    }

    private java.lang.Object __equalsCalc = null;

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RefundFormDataStruct)) return false;
        RefundFormDataStruct other = (RefundFormDataStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                this.refFormItId == other.getRefFormItId() &&
                ((this.refFormItName == null && other.getRefFormItName() == null) ||
                        (this.refFormItName != null &&
                                this.refFormItName.equals(other.getRefFormItName()))) &&
                this.refFormItEndingTime == other.getRefFormItEndingTime() &&
                this.refFormBuyerId == other.getRefFormBuyerId() &&
                ((this.refFormBuyerLogin == null && other.getRefFormBuyerLogin() == null) ||
                        (this.refFormBuyerLogin != null &&
                                this.refFormBuyerLogin.equals(other.getRefFormBuyerLogin()))) &&
                ((this.refFormBuyerEmail == null && other.getRefFormBuyerEmail() == null) ||
                        (this.refFormBuyerEmail != null &&
                                this.refFormBuyerEmail.equals(other.getRefFormBuyerEmail()))) &&
                this.refFormBuyDate == other.getRefFormBuyDate() &&
                this.refFormReasonId == other.getRefFormReasonId() &&
                this.refFormItQuantitySold == other.getRefFormItQuantitySold() &&
                this.refFormReminderSent == other.getRefFormReminderSent();
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
        _hashCode += new Long(getRefFormItId()).hashCode();
        if (getRefFormItName() != null) {
            _hashCode += getRefFormItName().hashCode();
        }
        _hashCode += new Long(getRefFormItEndingTime()).hashCode();
        _hashCode += getRefFormBuyerId();
        if (getRefFormBuyerLogin() != null) {
            _hashCode += getRefFormBuyerLogin().hashCode();
        }
        if (getRefFormBuyerEmail() != null) {
            _hashCode += getRefFormBuyerEmail().hashCode();
        }
        _hashCode += new Long(getRefFormBuyDate()).hashCode();
        _hashCode += getRefFormReasonId();
        _hashCode += getRefFormItQuantitySold();
        _hashCode += getRefFormReminderSent();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(RefundFormDataStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:AllegroWebApi", "RefundFormDataStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("refFormItId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ref-form-it-id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("refFormItName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ref-form-it-name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("refFormItEndingTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ref-form-it-ending-time"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("refFormBuyerId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ref-form-buyer-id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("refFormBuyerLogin");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ref-form-buyer-login"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("refFormBuyerEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ref-form-buyer-email"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("refFormBuyDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ref-form-buy-date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("refFormReasonId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ref-form-reason-id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("refFormItQuantitySold");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ref-form-it-quantity-sold"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("refFormReminderSent");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ref-form-reminder-sent"));
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
