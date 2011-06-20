/**
 * FeedbackList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pl.net.yuri.magister.soap;

public class FeedbackList implements java.io.Serializable {
    private int fId;

    private int fItemId;

    private int fFromId;

    private int fToId;

    private long fDate;

    private java.lang.String fType;

    private java.lang.String fDesc;

    private long fCorrectDate;

    private java.lang.String fCorrectText;

    private java.lang.String fReceiverType;

    private java.lang.String fUserLogin;

    private java.lang.String fUserRating;

    private java.lang.String fUserCountry;

    private int fUserBlocked;

    private int fUserSseller;

    public FeedbackList() {
    }

    public FeedbackList(
            int fId,
            int fItemId,
            int fFromId,
            int fToId,
            long fDate,
            java.lang.String fType,
            java.lang.String fDesc,
            long fCorrectDate,
            java.lang.String fCorrectText,
            java.lang.String fReceiverType,
            java.lang.String fUserLogin,
            java.lang.String fUserRating,
            java.lang.String fUserCountry,
            int fUserBlocked,
            int fUserSseller) {
        this.fId = fId;
        this.fItemId = fItemId;
        this.fFromId = fFromId;
        this.fToId = fToId;
        this.fDate = fDate;
        this.fType = fType;
        this.fDesc = fDesc;
        this.fCorrectDate = fCorrectDate;
        this.fCorrectText = fCorrectText;
        this.fReceiverType = fReceiverType;
        this.fUserLogin = fUserLogin;
        this.fUserRating = fUserRating;
        this.fUserCountry = fUserCountry;
        this.fUserBlocked = fUserBlocked;
        this.fUserSseller = fUserSseller;
    }


    /**
     * Gets the fId value for this FeedbackList.
     *
     * @return fId
     */
    public int getFId() {
        return fId;
    }


    /**
     * Sets the fId value for this FeedbackList.
     *
     * @param fId
     */
    public void setFId(int fId) {
        this.fId = fId;
    }


    /**
     * Gets the fItemId value for this FeedbackList.
     *
     * @return fItemId
     */
    public int getFItemId() {
        return fItemId;
    }


    /**
     * Sets the fItemId value for this FeedbackList.
     *
     * @param fItemId
     */
    public void setFItemId(int fItemId) {
        this.fItemId = fItemId;
    }


    /**
     * Gets the fFromId value for this FeedbackList.
     *
     * @return fFromId
     */
    public int getFFromId() {
        return fFromId;
    }


    /**
     * Sets the fFromId value for this FeedbackList.
     *
     * @param fFromId
     */
    public void setFFromId(int fFromId) {
        this.fFromId = fFromId;
    }


    /**
     * Gets the fToId value for this FeedbackList.
     *
     * @return fToId
     */
    public int getFToId() {
        return fToId;
    }


    /**
     * Sets the fToId value for this FeedbackList.
     *
     * @param fToId
     */
    public void setFToId(int fToId) {
        this.fToId = fToId;
    }


    /**
     * Gets the fDate value for this FeedbackList.
     *
     * @return fDate
     */
    public long getFDate() {
        return fDate;
    }


    /**
     * Sets the fDate value for this FeedbackList.
     *
     * @param fDate
     */
    public void setFDate(long fDate) {
        this.fDate = fDate;
    }


    /**
     * Gets the fType value for this FeedbackList.
     *
     * @return fType
     */
    public java.lang.String getFType() {
        return fType;
    }


    /**
     * Sets the fType value for this FeedbackList.
     *
     * @param fType
     */
    public void setFType(java.lang.String fType) {
        this.fType = fType;
    }


    /**
     * Gets the fDesc value for this FeedbackList.
     *
     * @return fDesc
     */
    public java.lang.String getFDesc() {
        return fDesc;
    }


    /**
     * Sets the fDesc value for this FeedbackList.
     *
     * @param fDesc
     */
    public void setFDesc(java.lang.String fDesc) {
        this.fDesc = fDesc;
    }


    /**
     * Gets the fCorrectDate value for this FeedbackList.
     *
     * @return fCorrectDate
     */
    public long getFCorrectDate() {
        return fCorrectDate;
    }


    /**
     * Sets the fCorrectDate value for this FeedbackList.
     *
     * @param fCorrectDate
     */
    public void setFCorrectDate(long fCorrectDate) {
        this.fCorrectDate = fCorrectDate;
    }


    /**
     * Gets the fCorrectText value for this FeedbackList.
     *
     * @return fCorrectText
     */
    public java.lang.String getFCorrectText() {
        return fCorrectText;
    }


    /**
     * Sets the fCorrectText value for this FeedbackList.
     *
     * @param fCorrectText
     */
    public void setFCorrectText(java.lang.String fCorrectText) {
        this.fCorrectText = fCorrectText;
    }


    /**
     * Gets the fReceiverType value for this FeedbackList.
     *
     * @return fReceiverType
     */
    public java.lang.String getFReceiverType() {
        return fReceiverType;
    }


    /**
     * Sets the fReceiverType value for this FeedbackList.
     *
     * @param fReceiverType
     */
    public void setFReceiverType(java.lang.String fReceiverType) {
        this.fReceiverType = fReceiverType;
    }


    /**
     * Gets the fUserLogin value for this FeedbackList.
     *
     * @return fUserLogin
     */
    public java.lang.String getFUserLogin() {
        return fUserLogin;
    }


    /**
     * Sets the fUserLogin value for this FeedbackList.
     *
     * @param fUserLogin
     */
    public void setFUserLogin(java.lang.String fUserLogin) {
        this.fUserLogin = fUserLogin;
    }


    /**
     * Gets the fUserRating value for this FeedbackList.
     *
     * @return fUserRating
     */
    public java.lang.String getFUserRating() {
        return fUserRating;
    }


    /**
     * Sets the fUserRating value for this FeedbackList.
     *
     * @param fUserRating
     */
    public void setFUserRating(java.lang.String fUserRating) {
        this.fUserRating = fUserRating;
    }


    /**
     * Gets the fUserCountry value for this FeedbackList.
     *
     * @return fUserCountry
     */
    public java.lang.String getFUserCountry() {
        return fUserCountry;
    }


    /**
     * Sets the fUserCountry value for this FeedbackList.
     *
     * @param fUserCountry
     */
    public void setFUserCountry(java.lang.String fUserCountry) {
        this.fUserCountry = fUserCountry;
    }


    /**
     * Gets the fUserBlocked value for this FeedbackList.
     *
     * @return fUserBlocked
     */
    public int getFUserBlocked() {
        return fUserBlocked;
    }


    /**
     * Sets the fUserBlocked value for this FeedbackList.
     *
     * @param fUserBlocked
     */
    public void setFUserBlocked(int fUserBlocked) {
        this.fUserBlocked = fUserBlocked;
    }


    /**
     * Gets the fUserSseller value for this FeedbackList.
     *
     * @return fUserSseller
     */
    public int getFUserSseller() {
        return fUserSseller;
    }


    /**
     * Sets the fUserSseller value for this FeedbackList.
     *
     * @param fUserSseller
     */
    public void setFUserSseller(int fUserSseller) {
        this.fUserSseller = fUserSseller;
    }

    private java.lang.Object __equalsCalc = null;

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FeedbackList)) return false;
        FeedbackList other = (FeedbackList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                this.fId == other.getFId() &&
                this.fItemId == other.getFItemId() &&
                this.fFromId == other.getFFromId() &&
                this.fToId == other.getFToId() &&
                this.fDate == other.getFDate() &&
                ((this.fType == null && other.getFType() == null) ||
                        (this.fType != null &&
                                this.fType.equals(other.getFType()))) &&
                ((this.fDesc == null && other.getFDesc() == null) ||
                        (this.fDesc != null &&
                                this.fDesc.equals(other.getFDesc()))) &&
                this.fCorrectDate == other.getFCorrectDate() &&
                ((this.fCorrectText == null && other.getFCorrectText() == null) ||
                        (this.fCorrectText != null &&
                                this.fCorrectText.equals(other.getFCorrectText()))) &&
                ((this.fReceiverType == null && other.getFReceiverType() == null) ||
                        (this.fReceiverType != null &&
                                this.fReceiverType.equals(other.getFReceiverType()))) &&
                ((this.fUserLogin == null && other.getFUserLogin() == null) ||
                        (this.fUserLogin != null &&
                                this.fUserLogin.equals(other.getFUserLogin()))) &&
                ((this.fUserRating == null && other.getFUserRating() == null) ||
                        (this.fUserRating != null &&
                                this.fUserRating.equals(other.getFUserRating()))) &&
                ((this.fUserCountry == null && other.getFUserCountry() == null) ||
                        (this.fUserCountry != null &&
                                this.fUserCountry.equals(other.getFUserCountry()))) &&
                this.fUserBlocked == other.getFUserBlocked() &&
                this.fUserSseller == other.getFUserSseller();
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
        _hashCode += getFId();
        _hashCode += getFItemId();
        _hashCode += getFFromId();
        _hashCode += getFToId();
        _hashCode += new Long(getFDate()).hashCode();
        if (getFType() != null) {
            _hashCode += getFType().hashCode();
        }
        if (getFDesc() != null) {
            _hashCode += getFDesc().hashCode();
        }
        _hashCode += new Long(getFCorrectDate()).hashCode();
        if (getFCorrectText() != null) {
            _hashCode += getFCorrectText().hashCode();
        }
        if (getFReceiverType() != null) {
            _hashCode += getFReceiverType().hashCode();
        }
        if (getFUserLogin() != null) {
            _hashCode += getFUserLogin().hashCode();
        }
        if (getFUserRating() != null) {
            _hashCode += getFUserRating().hashCode();
        }
        if (getFUserCountry() != null) {
            _hashCode += getFUserCountry().hashCode();
        }
        _hashCode += getFUserBlocked();
        _hashCode += getFUserSseller();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(FeedbackList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:AllegroWebApi", "FeedbackList"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "f-id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FItemId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "f-item-id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FFromId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "f-from-id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FToId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "f-to-id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "f-date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "f-type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FDesc");
        elemField.setXmlName(new javax.xml.namespace.QName("", "f-desc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FCorrectDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "f-correct-date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FCorrectText");
        elemField.setXmlName(new javax.xml.namespace.QName("", "f-correct-text"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FReceiverType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "f-receiver-type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FUserLogin");
        elemField.setXmlName(new javax.xml.namespace.QName("", "f-user-login"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FUserRating");
        elemField.setXmlName(new javax.xml.namespace.QName("", "f-user-rating"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FUserCountry");
        elemField.setXmlName(new javax.xml.namespace.QName("", "f-user-country"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FUserBlocked");
        elemField.setXmlName(new javax.xml.namespace.QName("", "f-user-blocked"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FUserSseller");
        elemField.setXmlName(new javax.xml.namespace.QName("", "f-user-sseller"));
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
