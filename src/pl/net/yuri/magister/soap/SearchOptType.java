/**
 * SearchOptType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pl.net.yuri.magister.soap;

public class SearchOptType implements java.io.Serializable {
    private java.lang.String searchString;

    private int searchOptions;

    private int searchOrder;

    private int searchOrderType;

    private int searchCountry;

    private int searchCategory;

    private int searchOffset;

    private java.lang.String searchCity;

    private int searchState;

    private float searchPriceFrom;

    private float searchPriceTo;

    private int searchLimit;

    private int searchOrderFulfillmentTime;

    public SearchOptType() {
    }

    public SearchOptType(
            java.lang.String searchString,
            int searchOptions,
            int searchOrder,
            int searchOrderType,
            int searchCountry,
            int searchCategory,
            int searchOffset,
            java.lang.String searchCity,
            int searchState,
            float searchPriceFrom,
            float searchPriceTo,
            int searchLimit,
            int searchOrderFulfillmentTime) {
        this.searchString = searchString;
        this.searchOptions = searchOptions;
        this.searchOrder = searchOrder;
        this.searchOrderType = searchOrderType;
        this.searchCountry = searchCountry;
        this.searchCategory = searchCategory;
        this.searchOffset = searchOffset;
        this.searchCity = searchCity;
        this.searchState = searchState;
        this.searchPriceFrom = searchPriceFrom;
        this.searchPriceTo = searchPriceTo;
        this.searchLimit = searchLimit;
        this.searchOrderFulfillmentTime = searchOrderFulfillmentTime;
    }


    /**
     * Gets the searchString value for this SearchOptType.
     *
     * @return searchString
     */
    public java.lang.String getSearchString() {
        return searchString;
    }


    /**
     * Sets the searchString value for this SearchOptType.
     *
     * @param searchString
     */
    public void setSearchString(java.lang.String searchString) {
        this.searchString = searchString;
    }


    /**
     * Gets the searchOptions value for this SearchOptType.
     *
     * @return searchOptions
     */
    public int getSearchOptions() {
        return searchOptions;
    }


    /**
     * Sets the searchOptions value for this SearchOptType.
     *
     * @param searchOptions
     */
    public void setSearchOptions(int searchOptions) {
        this.searchOptions = searchOptions;
    }


    /**
     * Gets the searchOrder value for this SearchOptType.
     *
     * @return searchOrder
     */
    public int getSearchOrder() {
        return searchOrder;
    }


    /**
     * Sets the searchOrder value for this SearchOptType.
     *
     * @param searchOrder
     */
    public void setSearchOrder(int searchOrder) {
        this.searchOrder = searchOrder;
    }


    /**
     * Gets the searchOrderType value for this SearchOptType.
     *
     * @return searchOrderType
     */
    public int getSearchOrderType() {
        return searchOrderType;
    }


    /**
     * Sets the searchOrderType value for this SearchOptType.
     *
     * @param searchOrderType
     */
    public void setSearchOrderType(int searchOrderType) {
        this.searchOrderType = searchOrderType;
    }


    /**
     * Gets the searchCountry value for this SearchOptType.
     *
     * @return searchCountry
     */
    public int getSearchCountry() {
        return searchCountry;
    }


    /**
     * Sets the searchCountry value for this SearchOptType.
     *
     * @param searchCountry
     */
    public void setSearchCountry(int searchCountry) {
        this.searchCountry = searchCountry;
    }


    /**
     * Gets the searchCategory value for this SearchOptType.
     *
     * @return searchCategory
     */
    public int getSearchCategory() {
        return searchCategory;
    }


    /**
     * Sets the searchCategory value for this SearchOptType.
     *
     * @param searchCategory
     */
    public void setSearchCategory(int searchCategory) {
        this.searchCategory = searchCategory;
    }


    /**
     * Gets the searchOffset value for this SearchOptType.
     *
     * @return searchOffset
     */
    public int getSearchOffset() {
        return searchOffset;
    }


    /**
     * Sets the searchOffset value for this SearchOptType.
     *
     * @param searchOffset
     */
    public void setSearchOffset(int searchOffset) {
        this.searchOffset = searchOffset;
    }


    /**
     * Gets the searchCity value for this SearchOptType.
     *
     * @return searchCity
     */
    public java.lang.String getSearchCity() {
        return searchCity;
    }


    /**
     * Sets the searchCity value for this SearchOptType.
     *
     * @param searchCity
     */
    public void setSearchCity(java.lang.String searchCity) {
        this.searchCity = searchCity;
    }


    /**
     * Gets the searchState value for this SearchOptType.
     *
     * @return searchState
     */
    public int getSearchState() {
        return searchState;
    }


    /**
     * Sets the searchState value for this SearchOptType.
     *
     * @param searchState
     */
    public void setSearchState(int searchState) {
        this.searchState = searchState;
    }


    /**
     * Gets the searchPriceFrom value for this SearchOptType.
     *
     * @return searchPriceFrom
     */
    public float getSearchPriceFrom() {
        return searchPriceFrom;
    }


    /**
     * Sets the searchPriceFrom value for this SearchOptType.
     *
     * @param searchPriceFrom
     */
    public void setSearchPriceFrom(float searchPriceFrom) {
        this.searchPriceFrom = searchPriceFrom;
    }


    /**
     * Gets the searchPriceTo value for this SearchOptType.
     *
     * @return searchPriceTo
     */
    public float getSearchPriceTo() {
        return searchPriceTo;
    }


    /**
     * Sets the searchPriceTo value for this SearchOptType.
     *
     * @param searchPriceTo
     */
    public void setSearchPriceTo(float searchPriceTo) {
        this.searchPriceTo = searchPriceTo;
    }


    /**
     * Gets the searchLimit value for this SearchOptType.
     *
     * @return searchLimit
     */
    public int getSearchLimit() {
        return searchLimit;
    }


    /**
     * Sets the searchLimit value for this SearchOptType.
     *
     * @param searchLimit
     */
    public void setSearchLimit(int searchLimit) {
        this.searchLimit = searchLimit;
    }


    /**
     * Gets the searchOrderFulfillmentTime value for this SearchOptType.
     *
     * @return searchOrderFulfillmentTime
     */
    public int getSearchOrderFulfillmentTime() {
        return searchOrderFulfillmentTime;
    }


    /**
     * Sets the searchOrderFulfillmentTime value for this SearchOptType.
     *
     * @param searchOrderFulfillmentTime
     */
    public void setSearchOrderFulfillmentTime(int searchOrderFulfillmentTime) {
        this.searchOrderFulfillmentTime = searchOrderFulfillmentTime;
    }

    private java.lang.Object __equalsCalc = null;

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SearchOptType)) return false;
        SearchOptType other = (SearchOptType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.searchString == null && other.getSearchString() == null) ||
                        (this.searchString != null &&
                                this.searchString.equals(other.getSearchString()))) &&
                this.searchOptions == other.getSearchOptions() &&
                this.searchOrder == other.getSearchOrder() &&
                this.searchOrderType == other.getSearchOrderType() &&
                this.searchCountry == other.getSearchCountry() &&
                this.searchCategory == other.getSearchCategory() &&
                this.searchOffset == other.getSearchOffset() &&
                ((this.searchCity == null && other.getSearchCity() == null) ||
                        (this.searchCity != null &&
                                this.searchCity.equals(other.getSearchCity()))) &&
                this.searchState == other.getSearchState() &&
                this.searchPriceFrom == other.getSearchPriceFrom() &&
                this.searchPriceTo == other.getSearchPriceTo() &&
                this.searchLimit == other.getSearchLimit() &&
                this.searchOrderFulfillmentTime == other.getSearchOrderFulfillmentTime();
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
        if (getSearchString() != null) {
            _hashCode += getSearchString().hashCode();
        }
        _hashCode += getSearchOptions();
        _hashCode += getSearchOrder();
        _hashCode += getSearchOrderType();
        _hashCode += getSearchCountry();
        _hashCode += getSearchCategory();
        _hashCode += getSearchOffset();
        if (getSearchCity() != null) {
            _hashCode += getSearchCity().hashCode();
        }
        _hashCode += getSearchState();
        _hashCode += new Float(getSearchPriceFrom()).hashCode();
        _hashCode += new Float(getSearchPriceTo()).hashCode();
        _hashCode += getSearchLimit();
        _hashCode += getSearchOrderFulfillmentTime();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(SearchOptType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:AllegroWebApi", "SearchOptType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("searchString");
        elemField.setXmlName(new javax.xml.namespace.QName("", "search-string"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("searchOptions");
        elemField.setXmlName(new javax.xml.namespace.QName("", "search-options"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("searchOrder");
        elemField.setXmlName(new javax.xml.namespace.QName("", "search-order"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("searchOrderType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "search-order-type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("searchCountry");
        elemField.setXmlName(new javax.xml.namespace.QName("", "search-country"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("searchCategory");
        elemField.setXmlName(new javax.xml.namespace.QName("", "search-category"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("searchOffset");
        elemField.setXmlName(new javax.xml.namespace.QName("", "search-offset"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("searchCity");
        elemField.setXmlName(new javax.xml.namespace.QName("", "search-city"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("searchState");
        elemField.setXmlName(new javax.xml.namespace.QName("", "search-state"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("searchPriceFrom");
        elemField.setXmlName(new javax.xml.namespace.QName("", "search-price-from"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("searchPriceTo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "search-price-to"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("searchLimit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "search-limit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("searchOrderFulfillmentTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "search-order-fulfillment-time"));
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
