<?xml version="1.0" encoding="UTF-8"?><definitions name="AllegroWebApi"
 xmlns:SOAP-ENV="http://schemas.xmlsoap.org/soap/envelope/"
 xmlns:SOAP-ENC="http://schemas.xmlsoap.org/soap/encoding/"
 xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
 xmlns:xsd="http://www.w3.org/2001/XMLSchema"
 xmlns:typens="urn:AllegroWebApi"
 xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/"
 xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/"
 xmlns="http://schemas.xmlsoap.org/wsdl/"
 targetNamespace="urn:AllegroWebApi">
<types>
<xsd:schema xmlns="http://www.w3.org/2001/XMLSchema" targetNamespace="urn:AllegroWebApi"><import namespace="http://schemas.xmlsoap.org/soap/encoding/"/><xsd:complexType name="CatInfoType"><xsd:all><xsd:element name="cat-id" type="xsd:int"/>
<xsd:element name="cat-name" type="xsd:string"/>
<xsd:element name="cat-parent" type="xsd:int"/>
<xsd:element name="cat-position" type="xsd:int"/>
</xsd:all>
</xsd:complexType>
<xsd:complexType name="ArrayOfCats"><xsd:complexContent><xsd:restriction base="SOAP-ENC:Array"><xsd:attribute ref="SOAP-ENC:arrayType" wsdl:arrayType="typens:CatInfoType[]"/>
</xsd:restriction>
</xsd:complexContent>
</xsd:complexType>
<xsd:complexType name="BillingDataType"><xsd:all><xsd:element name="billing-id" type="xsd:int"/>
<xsd:element name="billing-type" type="xsd:string"/>
<xsd:element name="billing-fixperc" type="xsd:string"/>
<xsd:element name="billing-name" type="xsd:string"/>
<xsd:element name="billing-range-from" type="xsd:string"/>
<xsd:element name="billing-range-to" type="xsd:string"/>
<xsd:element name="billing-cat" type="xsd:string"/>
<xsd:element name="billing-rate" type="xsd:string"/>
<xsd:element name="billing-auction-type" type="xsd:int"/>
</xsd:all>
</xsd:complexType>
<xsd:complexType name="ArrayOfBilling"><xsd:complexContent><xsd:restriction base="SOAP-ENC:Array"><xsd:attribute ref="SOAP-ENC:arrayType" wsdl:arrayType="typens:BillingDataType[]"/>
</xsd:restriction>
</xsd:complexContent>
</xsd:complexType>
<xsd:complexType name="FieldsValue"><xsd:all><xsd:element name="fid" type="xsd:int"/>
<xsd:element name="fvalue-string" type="xsd:string"/>
<xsd:element name="fvalue-int" type="xsd:int"/>
<xsd:element name="fvalue-float" type="xsd:float"/>
<xsd:element name="fvalue-image" type="xsd:base64Binary"/>
<xsd:element name="fvalue-datetime" type="xsd:float"/>
<xsd:element name="fvalue-date" type="xsd:string"/>
<xsd:element name="fvalue-range-int" type="typens:RangeIntValueStruct"/>
<xsd:element name="fvalue-range-float" type="typens:RangeFloatValueStruct"/>
<xsd:element name="fvalue-range-date" type="typens:RangeDateValueStruct"/>
</xsd:all>
</xsd:complexType>
<xsd:complexType name="ArrayOfFieldsValue"><xsd:complexContent><xsd:restriction base="SOAP-ENC:Array"><xsd:attribute ref="SOAP-ENC:arrayType" wsdl:arrayType="typens:FieldsValue[]"/>
</xsd:restriction>
</xsd:complexContent>
</xsd:complexType>
<xsd:complexType name="StructSellAgain"><xsd:all><xsd:element name="sell-item-id" type="xsd:long"/>
<xsd:element name="sell-item-info" type="xsd:string"/>
</xsd:all>
</xsd:complexType>
<xsd:complexType name="ArrayOfStructSellAgain"><xsd:complexContent><xsd:restriction base="SOAP-ENC:Array"><xsd:attribute ref="SOAP-ENC:arrayType" wsdl:arrayType="typens:StructSellAgain[]"/>
</xsd:restriction>
</xsd:complexContent>
</xsd:complexType>
<xsd:complexType name="StructSellFailed"><xsd:all><xsd:element name="sell-item-id" type="xsd:long"/>
<xsd:element name="sell-fault-code" type="xsd:string"/>
<xsd:element name="sell-fault-string" type="xsd:string"/>
</xsd:all>
</xsd:complexType>
<xsd:complexType name="ArrayOfStructSellFailed"><xsd:complexContent><xsd:restriction base="SOAP-ENC:Array"><xsd:attribute ref="SOAP-ENC:arrayType" wsdl:arrayType="typens:StructSellFailed[]"/>
</xsd:restriction>
</xsd:complexContent>
</xsd:complexType>
<xsd:complexType name="MyAccountList2"><xsd:complexContent><xsd:restriction base="SOAP-ENC:Array"><xsd:attribute ref="SOAP-ENC:arrayType" wsdl:arrayType="xsd:string[]"/>
</xsd:restriction>
</xsd:complexContent>
</xsd:complexType>
<xsd:complexType name="BidList2"><xsd:complexContent><xsd:restriction base="SOAP-ENC:Array"><xsd:attribute ref="SOAP-ENC:arrayType" wsdl:arrayType="xsd:string[]"/>
</xsd:restriction>
</xsd:complexContent>
</xsd:complexType>
<xsd:complexType name="ItemInfo"><xsd:all><xsd:element name="it-id" type="xsd:long"/>
<xsd:element name="it-country" type="xsd:int"/>
<xsd:element name="it-name" type="xsd:string"/>
<xsd:element name="it-price" type="xsd:float"/>
<xsd:element name="it-bid-count" type="xsd:int"/>
<xsd:element name="it-ending-time" type="xsd:long"/>
<xsd:element name="it-seller-id" type="xsd:long"/>
<xsd:element name="it-seller-login" type="xsd:string"/>
<xsd:element name="it-seller-rating" type="xsd:int"/>
<xsd:element name="it-starting-time" type="xsd:long"/>
<xsd:element name="it-starting-price" type="xsd:float"/>
<xsd:element name="it-quantity" type="xsd:int"/>
<xsd:element name="it-foto-count" type="xsd:int"/>
<xsd:element name="it-reserve-price" type="xsd:float"/>
<xsd:element name="it-location" type="xsd:string"/>
<xsd:element name="it-buy-now-price" type="xsd:float"/>
<xsd:element name="it-buy-now-active" type="xsd:int"/>
<xsd:element name="it-high-bidder" type="xsd:int"/>
<xsd:element name="it-high-bidder-login" type="xsd:string"/>
<xsd:element name="it-description" type="xsd:string"/>
<xsd:element name="it-options" type="xsd:int"/>
<xsd:element name="it-state" type="xsd:int"/>
<xsd:element name="it-is-eco" type="xsd:int"/>
<xsd:element name="it-hit-count" type="xsd:long"/>
<xsd:element name="it-postcode" type="xsd:string"/>
<xsd:element name="it-vat-invoice" type="xsd:int"/>
<xsd:element name="it-bank-account1" type="xsd:string"/>
<xsd:element name="it-bank-account2" type="xsd:string"/>
<xsd:element name="it-starting-quantity" type="xsd:int"/>
<xsd:element name="it-is-for-guests" type="xsd:int"/>
<xsd:element name="it-has-product" type="xsd:int"/>
<xsd:element name="it-order-fulfillment-time" type="xsd:int"/>
</xsd:all>
</xsd:complexType>
<xsd:complexType name="ItemCatList"><xsd:all><xsd:element name="cat-level" type="xsd:int"/>
<xsd:element name="cat-id" type="xsd:long"/>
<xsd:element name="cat-name" type="xsd:string"/>
</xsd:all>
</xsd:complexType>
<xsd:complexType name="MyAccountStruct2"><xsd:all><xsd:element name="my-account-array" type="typens:MyAccountList2"/>
</xsd:all>
</xsd:complexType>
<xsd:complexType name="ArrayOfMyAccountList2"><xsd:complexContent><xsd:restriction base="SOAP-ENC:Array"><xsd:attribute ref="SOAP-ENC:arrayType" wsdl:arrayType="typens:MyAccountStruct2[]"/>
</xsd:restriction>
</xsd:complexContent>
</xsd:complexType>
<xsd:complexType name="BidListStruct2"><xsd:all><xsd:element name="bids-array" type="typens:BidList2"/>
</xsd:all>
</xsd:complexType>
<xsd:complexType name="ArrayOfBidList2"><xsd:complexContent><xsd:restriction base="SOAP-ENC:Array"><xsd:attribute ref="SOAP-ENC:arrayType" wsdl:arrayType="typens:BidListStruct2[]"/>
</xsd:restriction>
</xsd:complexContent>
</xsd:complexType>
<xsd:complexType name="ArrayOfCancelBidsID"><xsd:complexContent><xsd:restriction base="SOAP-ENC:Array"><xsd:attribute ref="SOAP-ENC:arrayType" wsdl:arrayType="xsd:int[]"/>
</xsd:restriction>
</xsd:complexContent>
</xsd:complexType>
<xsd:complexType name="ArrayOfItemCatList"><xsd:complexContent><xsd:restriction base="SOAP-ENC:Array"><xsd:attribute ref="SOAP-ENC:arrayType" wsdl:arrayType="typens:ItemCatList[]"/>
</xsd:restriction>
</xsd:complexContent>
</xsd:complexType>
<xsd:complexType name="ItemImageList"><xsd:all><xsd:element name="image-type" type="xsd:int"/>
<xsd:element name="image-url" type="xsd:string"/>
</xsd:all>
</xsd:complexType>
<xsd:complexType name="ArrayOfItemImageList"><xsd:complexContent><xsd:restriction base="SOAP-ENC:Array"><xsd:attribute ref="SOAP-ENC:arrayType" wsdl:arrayType="typens:ItemImageList[]"/>
</xsd:restriction>
</xsd:complexContent>
</xsd:complexType>
<xsd:complexType name="MyContactList"><xsd:all><xsd:element name="contact-user-id" type="xsd:int"/>
<xsd:element name="contact-nick" type="xsd:string"/>
<xsd:element name="contact-first-name" type="xsd:string"/>
<xsd:element name="contact-last-name" type="xsd:string"/>
<xsd:element name="contact-company" type="xsd:string"/>
<xsd:element name="contact-email" type="xsd:string"/>
<xsd:element name="contact-street" type="xsd:string"/>
<xsd:element name="contact-postcode" type="xsd:string"/>
<xsd:element name="contact-city" type="xsd:string"/>
<xsd:element name="contact-country" type="xsd:string"/>
<xsd:element name="contact-phone" type="xsd:string"/>
<xsd:element name="contact-phone2" type="xsd:string"/>
<xsd:element name="contact-rating" type="xsd:string"/>
<xsd:element name="contact-blocked" type="xsd:string"/>
</xsd:all>
</xsd:complexType>
<xsd:complexType name="ArrayOfMyContactList"><xsd:complexContent><xsd:restriction base="SOAP-ENC:Array"><xsd:attribute ref="SOAP-ENC:arrayType" wsdl:arrayType="typens:MyContactList[]"/>
</xsd:restriction>
</xsd:complexContent>
</xsd:complexType>
<xsd:complexType name="ArrayOfItemsID"><xsd:complexContent><xsd:restriction base="SOAP-ENC:Array"><xsd:attribute ref="SOAP-ENC:arrayType" wsdl:arrayType="xsd:long[]"/>
</xsd:restriction>
</xsd:complexContent>
</xsd:complexType>
<xsd:complexType name="ItemInfoStruct"><xsd:all><xsd:element name="item-info" type="typens:ItemInfo"/>
<xsd:element name="item-cats" type="typens:ArrayOfItemCatList"/>
<xsd:element name="item-images" type="typens:ArrayOfItemImageList"/>
<xsd:element name="item-attribs" type="typens:ArrayOfAttribStruct"/>
<xsd:element name="item-postage-options" type="typens:ArrayOfPostageStruct"/>
<xsd:element name="item-payment-options" type="typens:ItemPaymentOptions"/>
<xsd:element name="item-company-info" type="typens:CompanyInfoStruct"/>
</xsd:all>
</xsd:complexType>
<xsd:complexType name="ArrayOfStructItemInfoList"><xsd:complexContent><xsd:restriction base="SOAP-ENC:Array"><xsd:attribute ref="SOAP-ENC:arrayType" wsdl:arrayType="typens:ItemInfoStruct[]"/>
</xsd:restriction>
</xsd:complexContent>
</xsd:complexType>
<xsd:complexType name="MyFeedbackList2"><xsd:complexContent><xsd:restriction base="SOAP-ENC:Array"><xsd:attribute ref="SOAP-ENC:arrayType" wsdl:arrayType="xsd:string[]"/>
</xsd:restriction>
</xsd:complexContent>
</xsd:complexType>
<xsd:complexType name="MyFeedbackListStruct2"><xsd:all><xsd:element name="feedback-array" type="typens:MyFeedbackList2"/>
</xsd:all>
</xsd:complexType>
<xsd:complexType name="ArrayOfMyFeedbackList2"><xsd:complexContent><xsd:restriction base="SOAP-ENC:Array"><xsd:attribute ref="SOAP-ENC:arrayType" wsdl:arrayType="typens:MyFeedbackListStruct2[]"/>
</xsd:restriction>
</xsd:complexContent>
</xsd:complexType>
<xsd:complexType name="FeedbackList"><xsd:all><xsd:element name="f-id" type="xsd:int"/>
<xsd:element name="f-item-id" type="xsd:int"/>
<xsd:element name="f-from-id" type="xsd:int"/>
<xsd:element name="f-to-id" type="xsd:int"/>
<xsd:element name="f-date" type="xsd:long"/>
<xsd:element name="f-type" type="xsd:string"/>
<xsd:element name="f-desc" type="xsd:string"/>
<xsd:element name="f-correct-date" type="xsd:long"/>
<xsd:element name="f-correct-text" type="xsd:string"/>
<xsd:element name="f-receiver-type" type="xsd:string"/>
<xsd:element name="f-user-login" type="xsd:string"/>
<xsd:element name="f-user-rating" type="xsd:string"/>
<xsd:element name="f-user-country" type="xsd:string"/>
<xsd:element name="f-user-blocked" type="xsd:int"/>
<xsd:element name="f-user-sseller" type="xsd:int"/>
</xsd:all>
</xsd:complexType>
<xsd:complexType name="ArrayOfFeedbackList"><xsd:complexContent><xsd:restriction base="SOAP-ENC:Array"><xsd:attribute ref="SOAP-ENC:arrayType" wsdl:arrayType="typens:FeedbackList[]"/>
</xsd:restriction>
</xsd:complexContent>
</xsd:complexType>
<xsd:complexType name="ArrayOfAuctionID"><xsd:complexContent><xsd:restriction base="SOAP-ENC:Array"><xsd:attribute ref="SOAP-ENC:arrayType" wsdl:arrayType="xsd:int[]"/>
</xsd:restriction>
</xsd:complexContent>
</xsd:complexType>
<xsd:complexType name="SearchOptType"><xsd:all><xsd:element name="search-string" type="xsd:string"/>
<xsd:element name="search-options" type="xsd:int"/>
<xsd:element name="search-order" type="xsd:int"/>
<xsd:element name="search-order-type" type="xsd:int"/>
<xsd:element name="search-country" type="xsd:int"/>
<xsd:element name="search-category" type="xsd:int"/>
<xsd:element name="search-offset" type="xsd:int"/>
<xsd:element name="search-city" type="xsd:string"/>
<xsd:element name="search-state" type="xsd:int"/>
<xsd:element name="search-price-from" type="xsd:float"/>
<xsd:element name="search-price-to" type="xsd:float"/>
<xsd:element name="search-limit" type="xsd:int"/>
<xsd:element name="search-order-fulfillment-time" type="xsd:int"/>
</xsd:all>
</xsd:complexType>
<xsd:complexType name="SearchResponseType"><xsd:all><xsd:element name="s-it-id" type="xsd:long"/>
<xsd:element name="s-it-name" type="xsd:string"/>
<xsd:element name="s-it-price" type="xsd:float"/>
<xsd:element name="s-it-starting-price" type="xsd:float"/>
<xsd:element name="s-it-is-buy-now" type="xsd:int"/>
<xsd:element name="s-it-buy-now-price" type="xsd:float"/>
<xsd:element name="s-it-bid-count" type="xsd:int"/>
<xsd:element name="s-it-foto-count" type="xsd:int"/>
<xsd:element name="s-it-starting-time" type="xsd:long"/>
<xsd:element name="s-it-ending-time" type="xsd:long"/>
<xsd:element name="s-it-time-left" type="xsd:long"/>
<xsd:element name="s-it-city" type="xsd:string"/>
<xsd:element name="s-it-state" type="xsd:int"/>
<xsd:element name="s-it-country" type="xsd:int"/>
<xsd:element name="s-it-category-id" type="xsd:int"/>
<xsd:element name="s-it-featured" type="xsd:int"/>
<xsd:element name="s-it-thumb-url" type="xsd:string"/>
<xsd:element name="s-it-thumb" type="xsd:int"/>
<xsd:element name="s-it-postage" type="xsd:float"/>
<xsd:element name="s-it-is-for-guests" type="xsd:int"/>
<xsd:element name="s-it-is-tablica-advert" type="xsd:int"/>
</xsd:all>
</xsd:complexType>
<xsd:complexType name="ArrayOfSearchResponse"><xsd:complexContent><xsd:restriction base="SOAP-ENC:Array"><xsd:attribute ref="SOAP-ENC:arrayType" wsdl:arrayType="typens:SearchResponseType[]"/>
</xsd:restriction>
</xsd:complexContent>
</xsd:complexType>
<xsd:complexType name="InfoCatList"><xsd:all><xsd:element name="cat-id" type="xsd:long"/>
<xsd:element name="cat-name" type="xsd:string"/>
<xsd:element name="cat-items-count" type="xsd:long"/>
</xsd:all>
</xsd:complexType>
<xsd:complexType name="ArrayOfCatInfoStruct"><xsd:complexContent><xsd:restriction base="SOAP-ENC:Array"><xsd:attribute ref="SOAP-ENC:arrayType" wsdl:arrayType="typens:InfoCatList[]"/>
</xsd:restriction>
</xsd:complexContent>
</xsd:complexType>
<xsd:complexType name="DurationTimeInfo"><xsd:all><xsd:element name="duration-option" type="xsd:int"/>
<xsd:element name="duration-value" type="xsd:int"/>
</xsd:all>
</xsd:complexType>
<xsd:complexType name="PriceCatInfo"><xsd:all><xsd:element name="price-min" type="xsd:float"/>
<xsd:element name="price-max" type="xsd:float"/>
</xsd:all>
</xsd:complexType>
<xsd:complexType name="SellFormType"><xsd:all><xsd:element name="sell-form-id" type="xsd:int"/>
<xsd:element name="sell-form-title" type="xsd:string"/>
<xsd:element name="sell-form-cat" type="xsd:int"/>
<xsd:element name="sell-form-type" type="xsd:int"/>
<xsd:element name="sell-form-res-type" type="xsd:int"/>
<xsd:element name="sell-form-def-value" type="xsd:int"/>
<xsd:element name="sell-form-opt" type="xsd:int"/>
<xsd:element name="sell-form-pos" type="xsd:int"/>
<xsd:element name="sell-form-length" type="xsd:int"/>
<xsd:element name="sell-min-value" type="xsd:string"/>
<xsd:element name="sell-max-value" type="xsd:string"/>
<xsd:element name="sell-form-desc" type="xsd:string"/>
<xsd:element name="sell-form-opts-values" type="xsd:string"/>
<xsd:element name="sell-form-field-desc" type="xsd:string"/>
<xsd:element name="sell-form-param-id" type="xsd:int"/>
<xsd:element name="sell-form-param-values" type="xsd:string"/>
<xsd:element name="sell-form-parent-id" type="xsd:int"/>
<xsd:element name="sell-form-parent-value" type="xsd:string"/>
<xsd:element name="sell-form-unit" type="xsd:string"/>
<xsd:element name="sell-form-options" type="xsd:int"/>
</xsd:all>
</xsd:complexType>
<xsd:complexType name="ArrayOfSellForms"><xsd:complexContent><xsd:restriction base="SOAP-ENC:Array"><xsd:attribute ref="SOAP-ENC:arrayType" wsdl:arrayType="typens:SellFormType[]"/>
</xsd:restriction>
</xsd:complexContent>
</xsd:complexType>
<xsd:complexType name="SiteInfoType"><xsd:all><xsd:element name="site-name" type="xsd:string"/>
<xsd:element name="site-url" type="xsd:string"/>
<xsd:element name="site-country-code" type="xsd:int"/>
<xsd:element name="site-code-page" type="xsd:string"/>
<xsd:element name="site-logo-gif" type="xsd:base64Binary"/>
</xsd:all>
</xsd:complexType>
<xsd:complexType name="ArrayOfSitesInfo"><xsd:complexContent><xsd:restriction base="SOAP-ENC:Array"><xsd:attribute ref="SOAP-ENC:arrayType" wsdl:arrayType="typens:SiteInfoType[]"/>
</xsd:restriction>
</xsd:complexContent>
</xsd:complexType>
<xsd:complexType name="ItemBilling"><xsd:all><xsd:element name="bi-name" type="xsd:string"/>
<xsd:element name="bi-value" type="xsd:string"/>
</xsd:all>
</xsd:complexType>
<xsd:complexType name="ItemBillingList"><xsd:complexContent><xsd:restriction base="SOAP-ENC:Array"><xsd:attribute ref="SOAP-ENC:arrayType" wsdl:arrayType="typens:ItemBilling[]"/>
</xsd:restriction>
</xsd:complexContent>
</xsd:complexType>
<xsd:complexType name="ShowUserFeedbacks"><xsd:all><xsd:element name="user-f-last-week" type="xsd:int"/>
<xsd:element name="user-f-last-month" type="xsd:int"/>
<xsd:element name="user-f-all" type="xsd:int"/>
<xsd:element name="user-f-sold-items" type="xsd:int"/>
<xsd:element name="user-f-buy-items" type="xsd:int"/>
</xsd:all>
</xsd:complexType>
<xsd:complexType name="SiteJournal"><xsd:all><xsd:element name="row-id" type="xsd:long"/>
<xsd:element name="item-id" type="xsd:long"/>
<xsd:element name="change-type" type="xsd:string"/>
<xsd:element name="change-date" type="xsd:long"/>
<xsd:element name="current-price" type="xsd:float"/>
<xsd:element name="item-seller-id" type="xsd:long"/>
</xsd:all>
</xsd:complexType>
<xsd:complexType name="SiteJournalArray"><xsd:complexContent><xsd:restriction base="SOAP-ENC:Array"><xsd:attribute ref="SOAP-ENC:arrayType" wsdl:arrayType="typens:SiteJournal[]"/>
</xsd:restriction>
</xsd:complexContent>
</xsd:complexType>
<xsd:complexType name="SiteJournalInfo"><xsd:all><xsd:element name="items-number" type="xsd:int"/>
<xsd:element name="last-item-date" type="xsd:long"/>
</xsd:all>
</xsd:complexType>
<xsd:complexType name="UserItemList"><xsd:all><xsd:element name="it-id" type="xsd:long"/>
<xsd:element name="it-name" type="xsd:string"/>
<xsd:element name="it-price" type="xsd:float"/>
<xsd:element name="it-buy-now-price" type="xsd:float"/>
<xsd:element name="it-bid-count" type="xsd:int"/>
<xsd:element name="it-time-left" type="xsd:long"/>
<xsd:element name="it-foto-count" type="xsd:int"/>
<xsd:element name="it-is-listing-thumb" type="xsd:int"/>
<xsd:element name="it-is-bold-title" type="xsd:int"/>
<xsd:element name="it-is-buy-now" type="xsd:int"/>
<xsd:element name="it-country" type="xsd:int"/>
<xsd:element name="it-is-escrow" type="xsd:int"/>
<xsd:element name="it-starting-time" type="xsd:long"/>
<xsd:element name="it-is-reserved-price" type="xsd:int"/>
<xsd:element name="it-thumb-url" type="xsd:string"/>
</xsd:all>
</xsd:complexType>
<xsd:complexType name="ArrayOfUserItemList"><xsd:complexContent><xsd:restriction base="SOAP-ENC:Array"><xsd:attribute ref="SOAP-ENC:arrayType" wsdl:arrayType="typens:UserItemList[]"/>
</xsd:restriction>
</xsd:complexContent>
</xsd:complexType>
<xsd:complexType name="SysStatusType"><xsd:all><xsd:element name="country-id" type="xsd:int"/>
<xsd:element name="program-version" type="xsd:string"/>
<xsd:element name="cats-version" type="xsd:string"/>
<xsd:element name="api-version" type="xsd:string"/>
<xsd:element name="attrib-version" type="xsd:string"/>
<xsd:element name="form-sell-version" type="xsd:string"/>
<xsd:element name="site-version" type="xsd:string"/>
<xsd:element name="ver-key" type="xsd:long"/>
</xsd:all>
</xsd:complexType>
<xsd:complexType name="ArrayOfSysStatus"><xsd:complexContent><xsd:restriction base="SOAP-ENC:Array"><xsd:attribute ref="SOAP-ENC:arrayType" wsdl:arrayType="typens:SysStatusType[]"/>
</xsd:restriction>
</xsd:complexContent>
</xsd:complexType>
<xsd:complexType name="CountryInfoType"><xsd:all><xsd:element name="country-id" type="xsd:int"/>
<xsd:element name="country-name" type="xsd:string"/>
</xsd:all>
</xsd:complexType>
<xsd:complexType name="ArrayOfCountries"><xsd:complexContent><xsd:restriction base="SOAP-ENC:Array"><xsd:attribute ref="SOAP-ENC:arrayType" wsdl:arrayType="typens:CountryInfoType[]"/>
</xsd:restriction>
</xsd:complexContent>
</xsd:complexType>
<xsd:complexType name="SiteFlagInfoType"><xsd:all><xsd:element name="site-name" type="xsd:string"/>
<xsd:element name="site-url" type="xsd:string"/>
<xsd:element name="site-country-code" type="xsd:int"/>
<xsd:element name="site-code-page" type="xsd:string"/>
<xsd:element name="site-logo-gif" type="xsd:base64Binary"/>
<xsd:element name="site-flag-gif" type="xsd:base64Binary"/>
</xsd:all>
</xsd:complexType>
<xsd:complexType name="ArrayOfSitesFlagInfo"><xsd:complexContent><xsd:restriction base="SOAP-ENC:Array"><xsd:attribute ref="SOAP-ENC:arrayType" wsdl:arrayType="typens:SiteFlagInfoType[]"/>
</xsd:restriction>
</xsd:complexContent>
</xsd:complexType>
<xsd:complexType name="TemplateInfoType"><xsd:all><xsd:element name="template-id" type="xsd:int"/>
<xsd:element name="template-name" type="xsd:string"/>
<xsd:element name="template-thumb" type="xsd:base64Binary"/>
<xsd:element name="template-desc-images" type="xsd:base64Binary"/>
</xsd:all>
</xsd:complexType>
<xsd:complexType name="ArrayOfTemplates"><xsd:complexContent><xsd:restriction base="SOAP-ENC:Array"><xsd:attribute ref="SOAP-ENC:arrayType" wsdl:arrayType="typens:TemplateInfoType[]"/>
</xsd:restriction>
</xsd:complexContent>
</xsd:complexType>
<xsd:complexType name="FeedbackManyStruct"><xsd:all><xsd:element name="fe-item-id" type="xsd:int"/>
<xsd:element name="fe-from-user-id" type="xsd:int"/>
<xsd:element name="fe-to-user-id" type="xsd:int"/>
<xsd:element name="fe-comment" type="xsd:string"/>
<xsd:element name="fe-comment-type" type="xsd:string"/>
<xsd:element name="fe-op" type="xsd:int"/>
<xsd:element name="fe-rating" type="typens:ArrayOfSellRatingEstimationStruct"/>
</xsd:all>
</xsd:complexType>
<xsd:complexType name="ArrayOfFeedbackManyStruct"><xsd:complexContent><xsd:restriction base="SOAP-ENC:Array"><xsd:attribute ref="SOAP-ENC:arrayType" wsdl:arrayType="typens:FeedbackManyStruct[]"/>
</xsd:restriction>
</xsd:complexContent>
</xsd:complexType>
<xsd:complexType name="FeedbackResultStruct"><xsd:all><xsd:element name="fe-item-id" type="xsd:int"/>
<xsd:element name="fe-id" type="xsd:int"/>
<xsd:element name="fe-fault-code" type="xsd:string"/>
<xsd:element name="fe-fault-desc" type="xsd:string"/>
</xsd:all>
</xsd:complexType>
<xsd:complexType name="ArrayOfFeedbacksResult"><xsd:complexContent><xsd:restriction base="SOAP-ENC:Array"><xsd:attribute ref="SOAP-ENC:arrayType" wsdl:arrayType="typens:FeedbackResultStruct[]"/>
</xsd:restriction>
</xsd:complexContent>
</xsd:complexType>
<xsd:complexType name="ItemInfoExt"><xsd:all><xsd:element name="it-id" type="xsd:long"/>
<xsd:element name="it-country" type="xsd:int"/>
<xsd:element name="it-name" type="xsd:string"/>
<xsd:element name="it-price" type="xsd:float"/>
<xsd:element name="it-bid-count" type="xsd:int"/>
<xsd:element name="it-ending-time" type="xsd:long"/>
<xsd:element name="it-seller-id" type="xsd:long"/>
<xsd:element name="it-seller-login" type="xsd:string"/>
<xsd:element name="it-seller-rating" type="xsd:int"/>
<xsd:element name="it-starting-time" type="xsd:long"/>
<xsd:element name="it-starting-price" type="xsd:float"/>
<xsd:element name="it-quantity" type="xsd:int"/>
<xsd:element name="it-foto-count" type="xsd:int"/>
<xsd:element name="it-reserve-price" type="xsd:float"/>
<xsd:element name="it-location" type="xsd:string"/>
<xsd:element name="it-buy-now-price" type="xsd:float"/>
<xsd:element name="it-buy-now-active" type="xsd:int"/>
<xsd:element name="it-high-bidder" type="xsd:int"/>
<xsd:element name="it-high-bidder-login" type="xsd:string"/>
<xsd:element name="it-description" type="xsd:string"/>
<xsd:element name="it-options" type="xsd:int"/>
<xsd:element name="it-state" type="xsd:int"/>
<xsd:element name="it-wire-transfer" type="xsd:float"/>
<xsd:element name="it-post-delivery" type="xsd:float"/>
<xsd:element name="it-post-info" type="xsd:string"/>
<xsd:element name="it-quantity-type" type="xsd:int"/>
<xsd:element name="it-is-eco" type="xsd:int"/>
<xsd:element name="it-hit-count" type="xsd:long"/>
<xsd:element name="it-postcode" type="xsd:string"/>
<xsd:element name="it-vat-invoice" type="xsd:int"/>
<xsd:element name="it-bank-account1" type="xsd:string"/>
<xsd:element name="it-bank-account2" type="xsd:string"/>
<xsd:element name="it-starting-quantity" type="xsd:int"/>
<xsd:element name="it-is-for-guests" type="xsd:int"/>
<xsd:element name="it-has-product" type="xsd:int"/>
<xsd:element name="it-order-fulfillment-time" type="xsd:int"/>
</xsd:all>
</xsd:complexType>
<xsd:complexType name="WaitFeedbackStruct"><xsd:all><xsd:element name="fe-item-id" type="xsd:int"/>
<xsd:element name="fe-item-name" type="xsd:string"/>
<xsd:element name="fe-to-user-id" type="xsd:int"/>
<xsd:element name="fe-op" type="xsd:int"/>
<xsd:element name="fe-ans-comment-type" type="xsd:string"/>
</xsd:all>
</xsd:complexType>
<xsd:complexType name="ArrayOfWaitFeedbackStruct"><xsd:complexContent><xsd:restriction base="SOAP-ENC:Array"><xsd:attribute ref="SOAP-ENC:arrayType" wsdl:arrayType="typens:WaitFeedbackStruct[]"/>
</xsd:restriction>
</xsd:complexContent>
</xsd:complexType>
<xsd:complexType name="ServiceInfoCatStruct"><xsd:all><xsd:element name="an-cat-id" type="xsd:int"/>
<xsd:element name="an-cat-name" type="xsd:string"/>
</xsd:all>
</xsd:complexType>
<xsd:complexType name="ServiceInfoStruct"><xsd:all><xsd:element name="an-it-id" type="xsd:int"/>
<xsd:element name="an-cat-id" type="xsd:int"/>
<xsd:element name="an-it-title" type="xsd:string"/>
<xsd:element name="an-it-body" type="xsd:base64Binary"/>
<xsd:element name="country-id" type="xsd:int"/>
<xsd:element name="an-it-date" type="xsd:long"/>
</xsd:all>
</xsd:complexType>
<xsd:complexType name="BlackListStruct"><xsd:all><xsd:element name="user-id" type="xsd:long"/>
<xsd:element name="user-login" type="xsd:string"/>
<xsd:element name="user-rating" type="xsd:int"/>
<xsd:element name="user-country" type="xsd:int"/>
</xsd:all>
</xsd:complexType>
<xsd:complexType name="BlackListResStruct"><xsd:all><xsd:element name="user-id" type="xsd:long"/>
<xsd:element name="result" type="xsd:int"/>
</xsd:all>
</xsd:complexType>
<xsd:complexType name="ArrayOfUsersID"><xsd:complexContent><xsd:restriction base="SOAP-ENC:Array"><xsd:attribute ref="SOAP-ENC:arrayType" wsdl:arrayType="xsd:long[]"/>
</xsd:restriction>
</xsd:complexContent>
</xsd:complexType>
<xsd:complexType name="ArrayOfBlackListResStruct"><xsd:complexContent><xsd:restriction base="SOAP-ENC:Array"><xsd:attribute ref="SOAP-ENC:arrayType" wsdl:arrayType="typens:BlackListResStruct[]"/>
</xsd:restriction>
</xsd:complexContent>
</xsd:complexType>
<xsd:complexType name="ArrayOfBlackListStruct"><xsd:complexContent><xsd:restriction base="SOAP-ENC:Array"><xsd:attribute ref="SOAP-ENC:arrayType" wsdl:arrayType="typens:BlackListStruct[]"/>
</xsd:restriction>
</xsd:complexContent>
</xsd:complexType>
<xsd:complexType name="ArrayOfServiceInfoCatStruct"><xsd:complexContent><xsd:restriction base="SOAP-ENC:Array"><xsd:attribute ref="SOAP-ENC:arrayType" wsdl:arrayType="typens:ServiceInfoCatStruct[]"/>
</xsd:restriction>
</xsd:complexContent>
</xsd:complexType>
<xsd:complexType name="ArrayOfServiceInfoStruct"><xsd:complexContent><xsd:restriction base="SOAP-ENC:Array"><xsd:attribute ref="SOAP-ENC:arrayType" wsdl:arrayType="typens:ServiceInfoStruct[]"/>
</xsd:restriction>
</xsd:complexContent>
</xsd:complexType>
<xsd:complexType name="StateInfoStruct"><xsd:all><xsd:element name="state-id" type="xsd:int"/>
<xsd:element name="state-name" type="xsd:string"/>
</xsd:all>
</xsd:complexType>
<xsd:complexType name="ArrayOfStateInfoStruct"><xsd:complexContent><xsd:restriction base="SOAP-ENC:Array"><xsd:attribute ref="SOAP-ENC:arrayType" wsdl:arrayType="typens:StateInfoStruct[]"/>
</xsd:restriction>
</xsd:complexContent>
</xsd:complexType>
<xsd:complexType name="UserDataStruct"><xsd:all><xsd:element name="user-id" type="xsd:long"/>
<xsd:element name="user-login" type="xsd:string"/>
<xsd:element name="user-rating" type="xsd:int"/>
<xsd:element name="user-first-name" type="xsd:string"/>
<xsd:element name="user-last-name" type="xsd:string"/>
<xsd:element name="user-maiden-name" type="xsd:string"/>
<xsd:element name="user-company" type="xsd:string"/>
<xsd:element name="user-country-id" type="xsd:int"/>
<xsd:element name="user-state-id" type="xsd:int"/>
<xsd:element name="user-postcode" type="xsd:string"/>
<xsd:element name="user-city" type="xsd:string"/>
<xsd:element name="user-address" type="xsd:string"/>
<xsd:element name="user-email" type="xsd:string"/>
<xsd:element name="user-phone" type="xsd:string"/>
<xsd:element name="user-phone2" type="xsd:string"/>
<xsd:element name="user-ss-status" type="xsd:int"/>
<xsd:element name="site-country-id" type="xsd:int"/>
<xsd:element name="user-junior-status" type="xsd:int"/>
<xsd:element name="user-birth-date" type="xsd:long"/>
<xsd:element name="user-has-shop" type="xsd:int"/>
<xsd:element name="user-company-icon" type="xsd:int"/>
<xsd:element name="user-is-allegro-standard" type="xsd:int"/>
</xsd:all>
</xsd:complexType>
<xsd:complexType name="ItemGetImage"><xsd:all><xsd:element name="it-id" type="xsd:long"/>
<xsd:element name="it-seller-id" type="xsd:long"/>
<xsd:element name="it-foto-count" type="xsd:int"/>
</xsd:all>
</xsd:complexType>
<xsd:complexType name="ArrayOfItemGetImage"><xsd:complexContent><xsd:restriction base="SOAP-ENC:Array"><xsd:attribute ref="SOAP-ENC:arrayType" wsdl:arrayType="typens:ItemGetImage[]"/>
</xsd:restriction>
</xsd:complexContent>
</xsd:complexType>
<xsd:complexType name="ItemImagesStruct"><xsd:all><xsd:element name="item-id" type="xsd:long"/>
<xsd:element name="item-images" type="typens:ArrayOfItemImageList"/>
</xsd:all>
</xsd:complexType>
<xsd:complexType name="ArrayOfItemImagesStruct"><xsd:complexContent><xsd:restriction base="SOAP-ENC:Array"><xsd:attribute ref="SOAP-ENC:arrayType" wsdl:arrayType="typens:ItemImagesStruct[]"/>
</xsd:restriction>
</xsd:complexContent>
</xsd:complexType>
<xsd:complexType name="InvoiceDataStruct"><xsd:all><xsd:element name="company-name" type="xsd:string"/>
<xsd:element name="company-nip" type="xsd:string"/>
</xsd:all>
</xsd:complexType>
<xsd:complexType name="ArrayOfAttribValues"><xsd:complexContent><xsd:restriction base="SOAP-ENC:Array"><xsd:attribute ref="SOAP-ENC:arrayType" wsdl:arrayType="xsd:string[]"/>
</xsd:restriction>
</xsd:complexContent>
</xsd:complexType>
<xsd:complexType name="AttribStruct"><xsd:all><xsd:element name="attrib-name" type="xsd:string"/>
<xsd:element name="attrib-values" type="typens:ArrayOfAttribValues"/>
</xsd:all>
</xsd:complexType>
<xsd:complexType name="ArrayOfAttribStruct"><xsd:complexContent><xsd:restriction base="SOAP-ENC:Array"><xsd:attribute ref="SOAP-ENC:arrayType" wsdl:arrayType="typens:AttribStruct[]"/>
</xsd:restriction>
</xsd:complexContent>
</xsd:complexType>
<xsd:complexType name="FavouritesSellersStruct"><xsd:all><xsd:element name="s-fav-user-id" type="xsd:int"/>
<xsd:element name="s-subscription-status" type="xsd:int"/>
<xsd:element name="s-position" type="xsd:int"/>
<xsd:element name="s-buy-now-only" type="xsd:int"/>
</xsd:all>
</xsd:complexType>
<xsd:complexType name="ArrayOfFavouritesSellers"><xsd:complexContent><xsd:restriction base="SOAP-ENC:Array"><xsd:attribute ref="SOAP-ENC:arrayType" wsdl:arrayType="typens:FavouritesSellersStruct[]"/>
</xsd:restriction>
</xsd:complexContent>
</xsd:complexType>
<xsd:complexType name="FavouritesCategoriesStruct"><xsd:all><xsd:element name="s-category-id" type="xsd:int"/>
<xsd:element name="s-subscription-status" type="xsd:int"/>
<xsd:element name="s-position" type="xsd:int"/>
<xsd:element name="s-buy-now-only" type="xsd:int"/>
</xsd:all>
</xsd:complexType>
<xsd:complexType name="ArrayOfFavouritesCategories"><xsd:complexContent><xsd:restriction base="SOAP-ENC:Array"><xsd:attribute ref="SOAP-ENC:arrayType" wsdl:arrayType="typens:FavouritesCategoriesStruct[]"/>
</xsd:restriction>
</xsd:complexContent>
</xsd:complexType>
<xsd:complexType name="SpecialAuctionStruct"><xsd:all><xsd:element name="it-id" type="xsd:long"/>
<xsd:element name="it-name" type="xsd:string"/>
<xsd:element name="it-price" type="xsd:float"/>
<xsd:element name="it-is-buy-now" type="xsd:int"/>
<xsd:element name="it-buy-now-price" type="xsd:float"/>
<xsd:element name="it-bid-count" type="xsd:int"/>
<xsd:element name="it-foto-count" type="xsd:int"/>
<xsd:element name="it-time-left" type="xsd:long"/>
<xsd:element name="it-ending-time" type="xsd:long"/>
<xsd:element name="it-country" type="xsd:int"/>
<xsd:element name="it-is-listing-thumb" type="xsd:int"/>
<xsd:element name="it-is-escrow" type="xsd:int"/>
<xsd:element name="it-seller-id" type="xsd:long"/>
<xsd:element name="it-send-cost-price" type="xsd:float"/>
<xsd:element name="it-is-bold-title" type="xsd:int"/>
<xsd:element name="it-starting-time" type="xsd:long"/>
</xsd:all>
</xsd:complexType>
<xsd:complexType name="ArrayOfSpecialAuction"><xsd:complexContent><xsd:restriction base="SOAP-ENC:Array"><xsd:attribute ref="SOAP-ENC:arrayType" wsdl:arrayType="typens:SpecialAuctionStruct[]"/>
</xsd:restriction>
</xsd:complexContent>
</xsd:complexType>
<xsd:complexType name="UserSentToDataStruct"><xsd:all><xsd:element name="user-id" type="xsd:long"/>
<xsd:element name="user-first-name" type="xsd:string"/>
<xsd:element name="user-last-name" type="xsd:string"/>
<xsd:element name="user-company" type="xsd:string"/>
<xsd:element name="user-country-id" type="xsd:int"/>
<xsd:element name="user-postcode" type="xsd:string"/>
<xsd:element name="user-city" type="xsd:string"/>
<xsd:element name="user-address" type="xsd:string"/>
</xsd:all>
</xsd:complexType>
<xsd:complexType name="ArrayOfBankAccounts"><xsd:complexContent><xsd:restriction base="SOAP-ENC:Array"><xsd:attribute ref="SOAP-ENC:arrayType" wsdl:arrayType="xsd:string[]"/>
</xsd:restriction>
</xsd:complexContent>
</xsd:complexType>
<xsd:complexType name="UserPostBuyDataStruct"><xsd:all><xsd:element name="user-data" type="typens:UserDataStruct"/>
<xsd:element name="user-sent-to-data" type="typens:UserSentToDataStruct"/>
<xsd:element name="user-bank-accounts" type="typens:ArrayOfBankAccounts"/>
<xsd:element name="company-second-address" type="typens:CompanySecondAddressStruct"/>
</xsd:all>
</xsd:complexType>
<xsd:complexType name="ArrayOfUsersPostBuyData"><xsd:complexContent><xsd:restriction base="SOAP-ENC:Array"><xsd:attribute ref="SOAP-ENC:arrayType" wsdl:arrayType="typens:UserPostBuyDataStruct[]"/>
</xsd:restriction>
</xsd:complexContent>
</xsd:complexType>
<xsd:complexType name="ArrayOfItemsPostBuyData"><xsd:complexContent><xsd:restriction base="SOAP-ENC:Array"><xsd:attribute ref="SOAP-ENC:arrayType" wsdl:arrayType="typens:ItemPostBuyDataStruct[]"/>
</xsd:restriction>
</xsd:complexContent>
</xsd:complexType>
<xsd:complexType name="ItemPostBuyDataStruct"><xsd:all><xsd:element name="item-id" type="xsd:long"/>
<xsd:element name="users-post-buy-data" type="typens:ArrayOfUsersPostBuyData"/>
</xsd:all>
</xsd:complexType>
<xsd:complexType name="PostageStruct"><xsd:all><xsd:element name="postage-amount" type="xsd:float"/>
<xsd:element name="postage-amount-add" type="xsd:float"/>
<xsd:element name="postage-pack-size" type="xsd:int"/>
<xsd:element name="postage-id" type="xsd:int"/>
</xsd:all>
</xsd:complexType>
<xsd:complexType name="ArrayOfPostageStruct"><xsd:complexContent><xsd:restriction base="SOAP-ENC:Array"><xsd:attribute ref="SOAP-ENC:arrayType" wsdl:arrayType="typens:PostageStruct[]"/>
</xsd:restriction>
</xsd:complexContent>
</xsd:complexType>
<xsd:complexType name="ArrayOfAdditionalData"><xsd:complexContent><xsd:restriction base="SOAP-ENC:Array"><xsd:attribute ref="SOAP-ENC:arrayType" wsdl:arrayType="xsd:string[]"/>
</xsd:restriction>
</xsd:complexContent>
</xsd:complexType>
<xsd:complexType name="ArrayOfExcludedWords"><xsd:complexContent><xsd:restriction base="SOAP-ENC:Array"><xsd:attribute ref="SOAP-ENC:arrayType" wsdl:arrayType="xsd:string[]"/>
</xsd:restriction>
</xsd:complexContent>
</xsd:complexType>
<xsd:complexType name="ItemRemoveWatchStruct"><xsd:all><xsd:element name="item-id" type="xsd:long"/>
<xsd:element name="result" type="xsd:int"/>
</xsd:all>
</xsd:complexType>
<xsd:complexType name="ArrayOfItemRemoveWatchStruct"><xsd:complexContent><xsd:restriction base="SOAP-ENC:Array"><xsd:attribute ref="SOAP-ENC:arrayType" wsdl:arrayType="typens:ItemRemoveWatchStruct[]"/>
</xsd:restriction>
</xsd:complexContent>
</xsd:complexType>
<xsd:complexType name="UserBlackListStruct"><xsd:all><xsd:element name="user-id" type="xsd:int"/>
<xsd:element name="user-black-list-note" type="xsd:string"/>
</xsd:all>
</xsd:complexType>
<xsd:complexType name="ArrayOfUserBlackListStruct"><xsd:complexContent><xsd:restriction base="SOAP-ENC:Array"><xsd:attribute ref="SOAP-ENC:arrayType" wsdl:arrayType="typens:UserBlackListStruct[]"/>
</xsd:restriction>
</xsd:complexContent>
</xsd:complexType>
<xsd:complexType name="UserBlackListAddResultStruct"><xsd:all><xsd:element name="user-id" type="xsd:int"/>
<xsd:element name="add-to-black-list-result" type="xsd:int"/>
<xsd:element name="add-to-black-list-err-code" type="xsd:string"/>
<xsd:element name="add-to-black-list-err-msg" type="xsd:string"/>
</xsd:all>
</xsd:complexType>
<xsd:complexType name="ArrayOfUserBlackListAddResultStruct"><xsd:complexContent><xsd:restriction base="SOAP-ENC:Array"><xsd:attribute ref="SOAP-ENC:arrayType" wsdl:arrayType="typens:UserBlackListAddResultStruct[]"/>
</xsd:restriction>
</xsd:complexContent>
</xsd:complexType>
<xsd:complexType name="CancelRefundDataStruct"><xsd:all><xsd:element name="item-id" type="xsd:long"/>
<xsd:element name="buyer-id" type="xsd:int"/>
</xsd:all>
</xsd:complexType>
<xsd:complexType name="ArrayOfCancelRefundDataStruct"><xsd:complexContent><xsd:restriction base="SOAP-ENC:Array"><xsd:attribute ref="SOAP-ENC:arrayType" wsdl:arrayType="typens:CancelRefundDataStruct[]"/>
</xsd:restriction>
</xsd:complexContent>
</xsd:complexType>
<xsd:complexType name="CancelRefundFormResultStruct"><xsd:all><xsd:element name="item-id" type="xsd:long"/>
<xsd:element name="buyer-id" type="xsd:int"/>
<xsd:element name="cancel-refund-result" type="xsd:int"/>
<xsd:element name="cancel-refund-err-code" type="xsd:string"/>
<xsd:element name="cancel-refund-err-msg" type="xsd:string"/>
</xsd:all>
</xsd:complexType>
<xsd:complexType name="ArrayOfCancelRefundFormResultStruct"><xsd:complexContent><xsd:restriction base="SOAP-ENC:Array"><xsd:attribute ref="SOAP-ENC:arrayType" wsdl:arrayType="typens:CancelRefundFormResultStruct[]"/>
</xsd:restriction>
</xsd:complexContent>
</xsd:complexType>
<xsd:complexType name="CancelRefundWarningStruct"><xsd:all><xsd:element name="item-id" type="xsd:long"/>
<xsd:element name="buyer-id" type="xsd:int"/>
</xsd:all>
</xsd:complexType>
<xsd:complexType name="ArrayOfCancelRefundWarningStruct"><xsd:complexContent><xsd:restriction base="SOAP-ENC:Array"><xsd:attribute ref="SOAP-ENC:arrayType" wsdl:arrayType="typens:CancelRefundWarningStruct[]"/>
</xsd:restriction>
</xsd:complexContent>
</xsd:complexType>
<xsd:complexType name="CancelRefundWarningResultStruct"><xsd:all><xsd:element name="item-id" type="xsd:long"/>
<xsd:element name="buyer-id" type="xsd:int"/>
<xsd:element name="cancel-warning-result" type="xsd:int"/>
<xsd:element name="cancel-warning-err-code" type="xsd:string"/>
<xsd:element name="cancel-warning-err-msg" type="xsd:string"/>
</xsd:all>
</xsd:complexType>
<xsd:complexType name="ArrayOfCancelRefundWarningResultStruct"><xsd:complexContent><xsd:restriction base="SOAP-ENC:Array"><xsd:attribute ref="SOAP-ENC:arrayType" wsdl:arrayType="typens:CancelRefundWarningResultStruct[]"/>
</xsd:restriction>
</xsd:complexContent>
</xsd:complexType>
<xsd:complexType name="RefundFormDataStruct"><xsd:all><xsd:element name="ref-form-it-id" type="xsd:long"/>
<xsd:element name="ref-form-it-name" type="xsd:string"/>
<xsd:element name="ref-form-it-ending-time" type="xsd:long"/>
<xsd:element name="ref-form-buyer-id" type="xsd:int"/>
<xsd:element name="ref-form-buyer-login" type="xsd:string"/>
<xsd:element name="ref-form-buyer-email" type="xsd:string"/>
<xsd:element name="ref-form-buy-date" type="xsd:long"/>
<xsd:element name="ref-form-reason-id" type="xsd:int"/>
<xsd:element name="ref-form-it-quantity-sold" type="xsd:int"/>
<xsd:element name="ref-form-reminder-sent" type="xsd:int"/>
</xsd:all>
</xsd:complexType>
<xsd:complexType name="ArrayOfRefundFormDataStruct"><xsd:complexContent><xsd:restriction base="SOAP-ENC:Array"><xsd:attribute ref="SOAP-ENC:arrayType" wsdl:arrayType="typens:RefundFormDataStruct[]"/>
</xsd:restriction>
</xsd:complexContent>
</xsd:complexType>
<xsd:complexType name="SendReminderMessageStruct"><xsd:all><xsd:element name="item-id" type="xsd:long"/>
<xsd:element name="buyer-id" type="xsd:int"/>
<xsd:element name="message-body" type="xsd:string"/>
<xsd:element name="include-my-data" type="xsd:int"/>
<xsd:element name="send-cc-to-me" type="xsd:int"/>
</xsd:all>
</xsd:complexType>
<xsd:complexType name="ArrayOfSendReminderMessageStruct"><xsd:complexContent><xsd:restriction base="SOAP-ENC:Array"><xsd:attribute ref="SOAP-ENC:arrayType" wsdl:arrayType="typens:SendReminderMessageStruct[]"/>
</xsd:restriction>
</xsd:complexContent>
</xsd:complexType>
<xsd:complexType name="SendReminderMessageResultStruct"><xsd:all><xsd:element name="item-id" type="xsd:long"/>
<xsd:element name="buyer-id" type="xsd:int"/>
<xsd:element name="reminder-msg-result" type="xsd:int"/>
<xsd:element name="reminder-msg-err-code" type="xsd:string"/>
<xsd:element name="reminder-msg-err-msg" type="xsd:string"/>
</xsd:all>
</xsd:complexType>
<xsd:complexType name="ArrayOfSendReminderMessageResultStruct"><xsd:complexContent><xsd:restriction base="SOAP-ENC:Array"><xsd:attribute ref="SOAP-ENC:arrayType" wsdl:arrayType="typens:SendReminderMessageResultStruct[]"/>
</xsd:restriction>
</xsd:complexContent>
</xsd:complexType>
<xsd:complexType name="ItemPaymentOptions"><xsd:all><xsd:element name="pay-option-transfer" type="xsd:int"/>
<xsd:element name="pay-option-on-delivery" type="xsd:int"/>
<xsd:element name="pay-option-allegro-pay" type="xsd:int"/>
<xsd:element name="pay-option-see-desc" type="xsd:int"/>
<xsd:element name="pay-option-payu" type="xsd:int"/>
<xsd:element name="pay-option-escrow" type="xsd:int"/>
<xsd:element name="pay-option-qiwi" type="xsd:int"/>
</xsd:all>
</xsd:complexType>
<xsd:complexType name="SendRefundFormStruct"><xsd:all><xsd:element name="item-id" type="xsd:long"/>
<xsd:element name="buyer-id" type="xsd:int"/>
<xsd:element name="refund-reason" type="xsd:int"/>
<xsd:element name="item-quantity-sold" type="xsd:int"/>
</xsd:all>
</xsd:complexType>
<xsd:complexType name="ArrayOfSendRefundFormStruct"><xsd:complexContent><xsd:restriction base="SOAP-ENC:Array"><xsd:attribute ref="SOAP-ENC:arrayType" wsdl:arrayType="typens:SendRefundFormStruct[]"/>
</xsd:restriction>
</xsd:complexContent>
</xsd:complexType>
<xsd:complexType name="SendRefundFormResultStruct"><xsd:all><xsd:element name="item-id" type="xsd:long"/>
<xsd:element name="buyer-id" type="xsd:int"/>
<xsd:element name="send-refund-result" type="xsd:int"/>
<xsd:element name="send-refund-err-code" type="xsd:string"/>
<xsd:element name="send-refund-err-msg" type="xsd:string"/>
</xsd:all>
</xsd:complexType>
<xsd:complexType name="ArrayOfSendRefundFormResultStruct"><xsd:complexContent><xsd:restriction base="SOAP-ENC:Array"><xsd:attribute ref="SOAP-ENC:arrayType" wsdl:arrayType="typens:SendRefundFormResultStruct[]"/>
</xsd:restriction>
</xsd:complexContent>
</xsd:complexType>
<xsd:complexType name="RefundFormStatusStruct"><xsd:all><xsd:element name="item-id" type="xsd:long"/>
<xsd:element name="buyer-id" type="xsd:int"/>
</xsd:all>
</xsd:complexType>
<xsd:complexType name="ArrayOfRefundFormStatusStruct"><xsd:complexContent><xsd:restriction base="SOAP-ENC:Array"><xsd:attribute ref="SOAP-ENC:arrayType" wsdl:arrayType="typens:RefundFormStatusStruct[]"/>
</xsd:restriction>
</xsd:complexContent>
</xsd:complexType>
<xsd:complexType name="RefundFormStatusResultStruct"><xsd:all><xsd:element name="item-id" type="xsd:long"/>
<xsd:element name="buyer-id" type="xsd:int"/>
<xsd:element name="refund-form-status" type="xsd:int"/>
</xsd:all>
</xsd:complexType>
<xsd:complexType name="ArrayOfRefundFormStatusResultStruct"><xsd:complexContent><xsd:restriction base="SOAP-ENC:Array"><xsd:attribute ref="SOAP-ENC:arrayType" wsdl:arrayType="typens:RefundFormStatusResultStruct[]"/>
</xsd:restriction>
</xsd:complexContent>
</xsd:complexType>
<xsd:complexType name="RefundReasonStruct"><xsd:all><xsd:element name="refund-reason-id" type="xsd:int"/>
<xsd:element name="refund-reason-name" type="xsd:string"/>
</xsd:all>
</xsd:complexType>
<xsd:complexType name="ArrayOfRefundReasonStruct"><xsd:complexContent><xsd:restriction base="SOAP-ENC:Array"><xsd:attribute ref="SOAP-ENC:arrayType" wsdl:arrayType="typens:RefundReasonStruct[]"/>
</xsd:restriction>
</xsd:complexContent>
</xsd:complexType>
<xsd:complexType name="UserPayoutStruct"><xsd:all><xsd:element name="pay-trans-id" type="xsd:long"/>
<xsd:element name="pay-trans-status" type="xsd:string"/>
<xsd:element name="pay-trans-amount" type="xsd:float"/>
<xsd:element name="pay-trans-create-date" type="xsd:long"/>
<xsd:element name="pay-trans-recv-date" type="xsd:long"/>
<xsd:element name="pay-trans-cancel-date" type="xsd:long"/>
<xsd:element name="pay-trans-report" type="xsd:string"/>
</xsd:all>
</xsd:complexType>
<xsd:complexType name="UserPaymentStruct"><xsd:all><xsd:element name="pay-trans-id" type="xsd:long"/>
<xsd:element name="pay-trans-it-id" type="xsd:long"/>
<xsd:element name="pay-trans-seller-id" type="xsd:int"/>
<xsd:element name="pay-trans-type" type="xsd:string"/>
<xsd:element name="pay-trans-status" type="xsd:string"/>
<xsd:element name="pay-trans-amount" type="xsd:float"/>
<xsd:element name="pay-trans-create-date" type="xsd:long"/>
<xsd:element name="pay-trans-price" type="xsd:float"/>
<xsd:element name="pay-trans-count" type="xsd:int"/>
<xsd:element name="pay-trans-postage-amount" type="xsd:float"/>
<xsd:element name="pay-trans-details" type="typens:ArrayOfPaymentDetailsStruct"/>
<xsd:element name="pay-trans-incomplete" type="xsd:int"/>
</xsd:all>
</xsd:complexType>
<xsd:complexType name="UserIncomingPaymentStruct"><xsd:all><xsd:element name="pay-trans-id" type="xsd:long"/>
<xsd:element name="pay-trans-it-id" type="xsd:long"/>
<xsd:element name="pay-trans-buyer-id" type="xsd:int"/>
<xsd:element name="pay-trans-type" type="xsd:string"/>
<xsd:element name="pay-trans-status" type="xsd:string"/>
<xsd:element name="pay-trans-amount" type="xsd:float"/>
<xsd:element name="pay-trans-create-date" type="xsd:long"/>
<xsd:element name="pay-trans-recv-date" type="xsd:long"/>
<xsd:element name="pay-trans-price" type="xsd:float"/>
<xsd:element name="pay-trans-count" type="xsd:int"/>
<xsd:element name="pay-trans-postage-amount" type="xsd:float"/>
<xsd:element name="pay-trans-details" type="typens:ArrayOfPaymentDetailsStruct"/>
<xsd:element name="pay-trans-incomplete" type="xsd:int"/>
</xsd:all>
</xsd:complexType>
<xsd:complexType name="ArrayOfUserIncomingPaymentStruct"><xsd:complexContent><xsd:restriction base="SOAP-ENC:Array"><xsd:attribute ref="SOAP-ENC:arrayType" wsdl:arrayType="typens:UserIncomingPaymentStruct[]"/>
</xsd:restriction>
</xsd:complexContent>
</xsd:complexType>
<xsd:complexType name="ArrayOfUserPaymentStruct"><xsd:complexContent><xsd:restriction base="SOAP-ENC:Array"><xsd:attribute ref="SOAP-ENC:arrayType" wsdl:arrayType="typens:UserPaymentStruct[]"/>
</xsd:restriction>
</xsd:complexContent>
</xsd:complexType>
<xsd:complexType name="ArrayOfUserPayoutStruct"><xsd:complexContent><xsd:restriction base="SOAP-ENC:Array"><xsd:attribute ref="SOAP-ENC:arrayType" wsdl:arrayType="typens:UserPayoutStruct[]"/>
</xsd:restriction>
</xsd:complexContent>
</xsd:complexType>
<xsd:complexType name="CompanySecondAddressStruct"><xsd:all><xsd:element name="company-worker-first-name" type="xsd:string"/>
<xsd:element name="company-worker-last-name" type="xsd:string"/>
<xsd:element name="company-address" type="xsd:string"/>
<xsd:element name="company-postcode" type="xsd:string"/>
<xsd:element name="company-city" type="xsd:string"/>
<xsd:element name="company-country-id" type="xsd:int"/>
<xsd:element name="company-state-id" type="xsd:int"/>
</xsd:all>
</xsd:complexType>
<xsd:complexType name="CompanyExtraDataStruct"><xsd:all><xsd:element name="company-type" type="xsd:string"/>
<xsd:element name="company-nip" type="xsd:string"/>
<xsd:element name="company-regon" type="xsd:string"/>
<xsd:element name="company-krs" type="xsd:string"/>
<xsd:element name="company-activity-sort" type="xsd:string"/>
</xsd:all>
</xsd:complexType>
<xsd:complexType name="CompanyInfoStruct"><xsd:all><xsd:element name="company-first-name" type="xsd:string"/>
<xsd:element name="company-last-name" type="xsd:string"/>
<xsd:element name="company-name" type="xsd:string"/>
<xsd:element name="company-address" type="xsd:string"/>
<xsd:element name="company-postcode" type="xsd:string"/>
<xsd:element name="company-city" type="xsd:string"/>
<xsd:element name="company-nip" type="xsd:string"/>
</xsd:all>
</xsd:complexType>
<xsd:complexType name="PaymentDetailsStruct"><xsd:all><xsd:element name="pay-trans-details-it-id" type="xsd:long"/>
<xsd:element name="pay-trans-details-price" type="xsd:float"/>
<xsd:element name="pay-trans-details-count" type="xsd:int"/>
</xsd:all>
</xsd:complexType>
<xsd:complexType name="ArrayOfPaymentDetailsStruct"><xsd:complexContent><xsd:restriction base="SOAP-ENC:Array"><xsd:attribute ref="SOAP-ENC:arrayType" wsdl:arrayType="typens:PaymentDetailsStruct[]"/>
</xsd:restriction>
</xsd:complexContent>
</xsd:complexType>
<xsd:complexType name="ArrayOfTransactionsID"><xsd:complexContent><xsd:restriction base="SOAP-ENC:Array"><xsd:attribute ref="SOAP-ENC:arrayType" wsdl:arrayType="xsd:long[]"/>
</xsd:restriction>
</xsd:complexContent>
</xsd:complexType>
<xsd:complexType name="PostBuyFormItemStruct"><xsd:all><xsd:element name="post-buy-form-it-quantity" type="xsd:int"/>
<xsd:element name="post-buy-form-it-amount" type="xsd:float"/>
<xsd:element name="post-buy-form-it-id" type="xsd:long"/>
<xsd:element name="post-buy-form-it-title" type="xsd:string"/>
<xsd:element name="post-buy-form-it-country" type="xsd:int"/>
<xsd:element name="post-buy-form-it-price" type="xsd:float"/>
</xsd:all>
</xsd:complexType>
<xsd:complexType name="ArrayOfPostBuyFormItemStruct"><xsd:complexContent><xsd:restriction base="SOAP-ENC:Array"><xsd:attribute ref="SOAP-ENC:arrayType" wsdl:arrayType="typens:PostBuyFormItemStruct[]"/>
</xsd:restriction>
</xsd:complexContent>
</xsd:complexType>
<xsd:complexType name="PostBuyFormDataStruct"><xsd:all><xsd:element name="post-buy-form-id" type="xsd:long"/>
<xsd:element name="post-buy-form-items" type="typens:ArrayOfPostBuyFormItemStruct"/>
<xsd:element name="post-buy-form-buyer-id" type="xsd:long"/>
<xsd:element name="post-buy-form-amount" type="xsd:float"/>
<xsd:element name="post-buy-form-postage-amount" type="xsd:float"/>
<xsd:element name="post-buy-form-invoice-option" type="xsd:int"/>
<xsd:element name="post-buy-form-msg-to-seller" type="xsd:string"/>
<xsd:element name="post-buy-form-invoice-data" type="typens:PostBuyFormAddressStruct"/>
<xsd:element name="post-buy-form-shipment-address" type="typens:PostBuyFormAddressStruct"/>
<xsd:element name="post-buy-form-pay-type" type="xsd:string"/>
<xsd:element name="post-buy-form-pay-id" type="xsd:long"/>
<xsd:element name="post-buy-form-pay-status" type="xsd:string"/>
<xsd:element name="post-buy-form-date-init" type="xsd:string"/>
<xsd:element name="post-buy-form-date-recv" type="xsd:string"/>
<xsd:element name="post-buy-form-date-cancel" type="xsd:string"/>
<xsd:element name="post-buy-form-shipment-id" type="xsd:int"/>
<xsd:element name="post-buy-form-gd-address" type="typens:PostBuyFormAddressStruct"/>
<xsd:element name="post-buy-form-shipment-tracking" type="typens:ArrayOfPostBuyFormShipmentTrackingStruct"/>
<xsd:element name="post-buy-form-surcharges-list" type="typens:ArrayOfPostBuyFormSurcharges"/>
<xsd:element name="post-buy-form-gd-additional-info" type="xsd:string"/>
</xsd:all>
</xsd:complexType>
<xsd:complexType name="ArrayOfPostBuyFormDataStruct"><xsd:complexContent><xsd:restriction base="SOAP-ENC:Array"><xsd:attribute ref="SOAP-ENC:arrayType" wsdl:arrayType="typens:PostBuyFormDataStruct[]"/>
</xsd:restriction>
</xsd:complexContent>
</xsd:complexType>
<xsd:complexType name="UserIncomingPaymentRefundsStruct"><xsd:all><xsd:element name="pay-refund-trans-id" type="xsd:long"/>
<xsd:element name="pay-refund-it-id" type="xsd:long"/>
<xsd:element name="pay-refund-buyer-id" type="xsd:int"/>
<xsd:element name="pay-refund-value" type="xsd:float"/>
<xsd:element name="pay-refund-reason" type="xsd:string"/>
<xsd:element name="pay-refund-date" type="xsd:long"/>
</xsd:all>
</xsd:complexType>
<xsd:complexType name="UserPaymentRefundsStruct"><xsd:all><xsd:element name="pay-refund-trans-id" type="xsd:long"/>
<xsd:element name="pay-refund-it-id" type="xsd:long"/>
<xsd:element name="pay-refund-seller-id" type="xsd:int"/>
<xsd:element name="pay-refund-value" type="xsd:float"/>
<xsd:element name="pay-refund-reason" type="xsd:string"/>
<xsd:element name="pay-refund-date" type="xsd:long"/>
</xsd:all>
</xsd:complexType>
<xsd:complexType name="ArrayOfUserIncomingPaymentRefundsStruct"><xsd:complexContent><xsd:restriction base="SOAP-ENC:Array"><xsd:attribute ref="SOAP-ENC:arrayType" wsdl:arrayType="typens:UserIncomingPaymentRefundsStruct[]"/>
</xsd:restriction>
</xsd:complexContent>
</xsd:complexType>
<xsd:complexType name="ArrayOfUserPaymentRefundsStruct"><xsd:complexContent><xsd:restriction base="SOAP-ENC:Array"><xsd:attribute ref="SOAP-ENC:arrayType" wsdl:arrayType="typens:UserPaymentRefundsStruct[]"/>
</xsd:restriction>
</xsd:complexContent>
</xsd:complexType>
<xsd:complexType name="SellRatingAverageStruct"><xsd:all><xsd:element name="sell-rating-group-title" type="xsd:string"/>
<xsd:element name="sell-rating-group-average" type="xsd:float"/>
</xsd:all>
</xsd:complexType>
<xsd:complexType name="ArrayOfSellRatingAverageStruct"><xsd:complexContent><xsd:restriction base="SOAP-ENC:Array"><xsd:attribute ref="SOAP-ENC:arrayType" wsdl:arrayType="typens:SellRatingAverageStruct[]"/>
</xsd:restriction>
</xsd:complexContent>
</xsd:complexType>
<xsd:complexType name="SellRatingReasonSumStruct"><xsd:all><xsd:element name="sell-rating-reason-title" type="xsd:string"/>
<xsd:element name="sell-rating-reason-count" type="xsd:int"/>
</xsd:all>
</xsd:complexType>
<xsd:complexType name="ArrayOfSellRatingReasonSumStruct"><xsd:complexContent><xsd:restriction base="SOAP-ENC:Array"><xsd:attribute ref="SOAP-ENC:arrayType" wsdl:arrayType="typens:SellRatingReasonSumStruct[]"/>
</xsd:restriction>
</xsd:complexContent>
</xsd:complexType>
<xsd:complexType name="SellRatingDetailStruct"><xsd:all><xsd:element name="sell-rating-group-title" type="xsd:string"/>
<xsd:element name="sell-rating-reasons-summary" type="typens:ArrayOfSellRatingReasonSumStruct"/>
</xsd:all>
</xsd:complexType>
<xsd:complexType name="SellRatingAveragePerMonthStruct"><xsd:all><xsd:element name="sell-rating-month" type="xsd:string"/>
<xsd:element name="sell-rating-average-values" type="typens:ArrayOfSellRatingStatsStruct"/>
</xsd:all>
</xsd:complexType>
<xsd:complexType name="ArrayOfSellRatingDetailStruct"><xsd:complexContent><xsd:restriction base="SOAP-ENC:Array"><xsd:attribute ref="SOAP-ENC:arrayType" wsdl:arrayType="typens:SellRatingDetailStruct[]"/>
</xsd:restriction>
</xsd:complexContent>
</xsd:complexType>
<xsd:complexType name="ArrayOfSellRatingAveragePerMonth"><xsd:complexContent><xsd:restriction base="SOAP-ENC:Array"><xsd:attribute ref="SOAP-ENC:arrayType" wsdl:arrayType="typens:SellRatingAveragePerMonthStruct[]"/>
</xsd:restriction>
</xsd:complexContent>
</xsd:complexType>
<xsd:complexType name="SellRatingStatsStruct"><xsd:all><xsd:element name="sell-rating-group-title" type="xsd:string"/>
<xsd:element name="sell-rating-group-stats" type="xsd:string"/>
</xsd:all>
</xsd:complexType>
<xsd:complexType name="ArrayOfSellRatingStatsStruct"><xsd:complexContent><xsd:restriction base="SOAP-ENC:Array"><xsd:attribute ref="SOAP-ENC:arrayType" wsdl:arrayType="typens:SellRatingStatsStruct[]"/>
</xsd:restriction>
</xsd:complexContent>
</xsd:complexType>
<xsd:complexType name="SellRatingReasonStruct"><xsd:all><xsd:element name="sell-rating-reason-id" type="xsd:int"/>
<xsd:element name="sell-rating-reason-title" type="xsd:string"/>
</xsd:all>
</xsd:complexType>
<xsd:complexType name="ArrayOfSellRatingReasonStruct"><xsd:complexContent><xsd:restriction base="SOAP-ENC:Array"><xsd:attribute ref="SOAP-ENC:arrayType" wsdl:arrayType="typens:SellRatingReasonStruct[]"/>
</xsd:restriction>
</xsd:complexContent>
</xsd:complexType>
<xsd:complexType name="SellRatingInfoStruct"><xsd:all><xsd:element name="sell-rating-group-id" type="xsd:int"/>
<xsd:element name="sell-rating-group-title" type="xsd:string"/>
<xsd:element name="sell-rating-reasons" type="typens:ArrayOfSellRatingReasonStruct"/>
</xsd:all>
</xsd:complexType>
<xsd:complexType name="ArrayOfSellRatingInfoStruct"><xsd:complexContent><xsd:restriction base="SOAP-ENC:Array"><xsd:attribute ref="SOAP-ENC:arrayType" wsdl:arrayType="typens:SellRatingInfoStruct[]"/>
</xsd:restriction>
</xsd:complexContent>
</xsd:complexType>
<xsd:complexType name="SellRatingEstimationStruct"><xsd:all><xsd:element name="sell-rating-group-id" type="xsd:int"/>
<xsd:element name="sell-rating-group-estimation" type="xsd:int"/>
<xsd:element name="sell-rating-reason-id" type="xsd:int"/>
</xsd:all>
</xsd:complexType>
<xsd:complexType name="ArrayOfSellRatingEstimationStruct"><xsd:complexContent><xsd:restriction base="SOAP-ENC:Array"><xsd:attribute ref="SOAP-ENC:arrayType" wsdl:arrayType="typens:SellRatingEstimationStruct[]"/>
</xsd:restriction>
</xsd:complexContent>
</xsd:complexType>
<xsd:complexType name="DealsStruct"><xsd:all><xsd:element name="deal-id" type="xsd:long"/>
<xsd:element name="deal-date" type="xsd:long"/>
<xsd:element name="deal-quantity" type="xsd:int"/>
<xsd:element name="deal-amount-original" type="xsd:float"/>
<xsd:element name="deal-amount-discounted" type="xsd:float"/>
</xsd:all>
</xsd:complexType>
<xsd:complexType name="ArrayOfDealsStruct"><xsd:complexContent><xsd:restriction base="SOAP-ENC:Array"><xsd:attribute ref="SOAP-ENC:arrayType" wsdl:arrayType="typens:DealsStruct[]"/>
</xsd:restriction>
</xsd:complexContent>
</xsd:complexType>
<xsd:complexType name="ItemImageOptionsStruct"><xsd:all><xsd:element name="item-image-field-id" type="xsd:int"/>
<xsd:element name="item-image-action-type" type="xsd:int"/>
</xsd:all>
</xsd:complexType>
<xsd:complexType name="FinishItemsStruct"><xsd:all><xsd:element name="finish-item-id" type="xsd:long"/>
<xsd:element name="finish-cancel-all-bids" type="xsd:int"/>
<xsd:element name="finish-cancel-reason" type="xsd:string"/>
</xsd:all>
</xsd:complexType>
<xsd:complexType name="ArrayOfFinishItemsStruct"><xsd:complexContent><xsd:restriction base="SOAP-ENC:Array"><xsd:attribute ref="SOAP-ENC:arrayType" wsdl:arrayType="typens:FinishItemsStruct[]"/>
</xsd:restriction>
</xsd:complexContent>
</xsd:complexType>
<xsd:complexType name="FinishFailureStruct"><xsd:all><xsd:element name="finish-item-id" type="xsd:long"/>
<xsd:element name="finish-error-code" type="xsd:string"/>
<xsd:element name="finish-error-message" type="xsd:string"/>
</xsd:all>
</xsd:complexType>
<xsd:complexType name="ArrayOfFinishFailureStruct"><xsd:complexContent><xsd:restriction base="SOAP-ENC:Array"><xsd:attribute ref="SOAP-ENC:arrayType" wsdl:arrayType="typens:FinishFailureStruct[]"/>
</xsd:restriction>
</xsd:complexContent>
</xsd:complexType>
<xsd:complexType name="ArrayOfFinishSuccessStruct"><xsd:complexContent><xsd:restriction base="SOAP-ENC:Array"><xsd:attribute ref="SOAP-ENC:arrayType" wsdl:arrayType="xsd:long[]"/>
</xsd:restriction>
</xsd:complexContent>
</xsd:complexType>
<xsd:complexType name="ShipmentDataStruct"><xsd:all><xsd:element name="shipment-id" type="xsd:int"/>
<xsd:element name="shipment-name" type="xsd:string"/>
<xsd:element name="shipment-type" type="xsd:int"/>
</xsd:all>
</xsd:complexType>
<xsd:complexType name="ArrayOfShipmentDataStruct"><xsd:complexContent><xsd:restriction base="SOAP-ENC:Array"><xsd:attribute ref="SOAP-ENC:arrayType" wsdl:arrayType="typens:ShipmentDataStruct[]"/>
</xsd:restriction>
</xsd:complexContent>
</xsd:complexType>
<xsd:complexType name="PharmacyDataStruct"><xsd:all><xsd:element name="pharmacy-opening-date" type="xsd:string"/>
<xsd:element name="pharmacy-expiration-date" type="xsd:string"/>
<xsd:element name="pharmacy-name" type="xsd:string"/>
<xsd:element name="pharmacy-pharmacist-full-name" type="xsd:string"/>
<xsd:element name="pharmacy-address" type="xsd:string"/>
<xsd:element name="pharmacy-postcode" type="xsd:string"/>
<xsd:element name="pharmacy-city" type="xsd:string"/>
<xsd:element name="pharmacy-commune" type="xsd:string"/>
<xsd:element name="pharmacy-country-id" type="xsd:int"/>
<xsd:element name="pharmacy-state-id" type="xsd:int"/>
<xsd:element name="pharmacy-permit-number" type="xsd:string"/>
<xsd:element name="pharmacy-permit-info" type="xsd:string"/>
</xsd:all>
</xsd:complexType>
<xsd:complexType name="ArrayOfItemImageOptionsStruct"><xsd:complexContent><xsd:restriction base="SOAP-ENC:Array"><xsd:attribute ref="SOAP-ENC:arrayType" wsdl:arrayType="typens:ItemImageOptionsStruct[]"/>
</xsd:restriction>
</xsd:complexContent>
</xsd:complexType>
<xsd:complexType name="ArrayOfProductImagesList"><xsd:complexContent><xsd:restriction base="SOAP-ENC:Array"><xsd:attribute ref="SOAP-ENC:arrayType" wsdl:arrayType="xsd:string[]"/>
</xsd:restriction>
</xsd:complexContent>
</xsd:complexType>
<xsd:complexType name="ArrayOfProductItemsIds"><xsd:complexContent><xsd:restriction base="SOAP-ENC:Array"><xsd:attribute ref="SOAP-ENC:arrayType" wsdl:arrayType="xsd:long[]"/>
</xsd:restriction>
</xsd:complexContent>
</xsd:complexType>
<xsd:complexType name="ProductStruct"><xsd:all><xsd:element name="product-id" type="xsd:long"/>
<xsd:element name="product-name" type="xsd:string"/>
<xsd:element name="product-description" type="xsd:string"/>
<xsd:element name="product-images-list" type="typens:ArrayOfProductImagesList"/>
<xsd:element name="product-parameters-list" type="typens:ArrayOfProductParametersStruct"/>
</xsd:all>
</xsd:complexType>
<xsd:complexType name="ArrayOfProductStruct"><xsd:complexContent><xsd:restriction base="SOAP-ENC:Array"><xsd:attribute ref="SOAP-ENC:arrayType" wsdl:arrayType="typens:ProductStruct[]"/>
</xsd:restriction>
</xsd:complexContent>
</xsd:complexType>
<xsd:complexType name="ArrayOfProductParameterValues"><xsd:complexContent><xsd:restriction base="SOAP-ENC:Array"><xsd:attribute ref="SOAP-ENC:arrayType" wsdl:arrayType="xsd:string[]"/>
</xsd:restriction>
</xsd:complexContent>
</xsd:complexType>
<xsd:complexType name="ProductParametersStruct"><xsd:all><xsd:element name="product-parameter-name" type="xsd:string"/>
<xsd:element name="product-parameter-values" type="typens:ArrayOfProductParameterValues"/>
</xsd:all>
</xsd:complexType>
<xsd:complexType name="ArrayOfProductParametersStruct"><xsd:complexContent><xsd:restriction base="SOAP-ENC:Array"><xsd:attribute ref="SOAP-ENC:arrayType" wsdl:arrayType="typens:ProductParametersStruct[]"/>
</xsd:restriction>
</xsd:complexContent>
</xsd:complexType>
<xsd:complexType name="PostBuyFormShipmentTrackingStruct"><xsd:all><xsd:element name="post-buy-form-operator-id" type="xsd:int"/>
<xsd:element name="post-buy-form-package-id" type="xsd:string"/>
</xsd:all>
</xsd:complexType>
<xsd:complexType name="PostBuyFormAddressStruct"><xsd:all><xsd:element name="post-buy-form-adr-country" type="xsd:int"/>
<xsd:element name="post-buy-form-adr-street" type="xsd:string"/>
<xsd:element name="post-buy-form-adr-postcode" type="xsd:string"/>
<xsd:element name="post-buy-form-adr-city" type="xsd:string"/>
<xsd:element name="post-buy-form-adr-full-name" type="xsd:string"/>
<xsd:element name="post-buy-form-adr-company" type="xsd:string"/>
<xsd:element name="post-buy-form-adr-phone" type="xsd:string"/>
<xsd:element name="post-buy-form-adr-nip" type="xsd:string"/>
<xsd:element name="post-buy-form-created-date" type="xsd:string"/>
</xsd:all>
</xsd:complexType>
<xsd:complexType name="ArrayOfPostBuyFormShipmentTrackingStruct"><xsd:complexContent><xsd:restriction base="SOAP-ENC:Array"><xsd:attribute ref="SOAP-ENC:arrayType" wsdl:arrayType="typens:PostBuyFormShipmentTrackingStruct[]"/>
</xsd:restriction>
</xsd:complexContent>
</xsd:complexType>
<xsd:complexType name="ArrayOfPostBuyFormSurcharges"><xsd:complexContent><xsd:restriction base="SOAP-ENC:Array"><xsd:attribute ref="SOAP-ENC:arrayType" wsdl:arrayType="xsd:long[]"/>
</xsd:restriction>
</xsd:complexContent>
</xsd:complexType>
<xsd:complexType name="AlcoholDataStruct"><xsd:all><xsd:element name="alcohol-opening-date" type="xsd:string"/>
<xsd:element name="alcohol-expiration-date" type="xsd:string"/>
<xsd:element name="alcohol-shop-name" type="xsd:string"/>
<xsd:element name="alcohol-shop-address" type="xsd:string"/>
<xsd:element name="alcohol-shop-postcode" type="xsd:string"/>
<xsd:element name="alcohol-shop-city" type="xsd:string"/>
<xsd:element name="alcohol-shop-commune" type="xsd:string"/>
<xsd:element name="alcohol-shop-country-id" type="xsd:int"/>
<xsd:element name="alcohol-shop-state-id" type="xsd:int"/>
<xsd:element name="alcohol-permit-number" type="xsd:string"/>
<xsd:element name="alcohol-permit-authority" type="xsd:string"/>
<xsd:element name="alcohol-permit-info" type="xsd:string"/>
</xsd:all>
</xsd:complexType>
<xsd:complexType name="RangeIntValueStruct"><xsd:all><xsd:element name="fvalue-range-int-min" type="xsd:int"/>
<xsd:element name="fvalue-range-int-max" type="xsd:int"/>
</xsd:all>
</xsd:complexType>
<xsd:complexType name="RangeFloatValueStruct"><xsd:all><xsd:element name="fvalue-range-float-min" type="xsd:float"/>
<xsd:element name="fvalue-range-float-max" type="xsd:float"/>
</xsd:all>
</xsd:complexType>
<xsd:complexType name="RangeDateValueStruct"><xsd:all><xsd:element name="fvalue-range-date-min" type="xsd:string"/>
<xsd:element name="fvalue-range-date-max" type="xsd:string"/>
</xsd:all>
</xsd:complexType>
</xsd:schema>

</types>
<message name="doGetCatsDataRequest">
<part name="country-id" type="xsd:int" />
<part name="local-version" type="xsd:long" />
<part name="webapi-key" type="xsd:string" />
</message>
<message name="doGetCatsDataResponse">
<part name="cats-list" type="typens:ArrayOfCats" />
<part name="ver-key" type="xsd:long" />
<part name="ver-str" type="xsd:string" />
</message>
<message name="doLoginRequest">
<part name="user-login" type="xsd:string" />
<part name="user-password" type="xsd:string" />
<part name="country-code" type="xsd:int" />
<part name="webapi-key" type="xsd:string" />
<part name="local-version" type="xsd:long" />
</message>
<message name="doLoginResponse">
<part name="session-handle-part" type="xsd:string" />
<part name="user-id" type="xsd:long" />
<part name="server-time" type="xsd:long" />
</message>
<message name="doLoginEncRequest">
<part name="user-login" type="xsd:string" />
<part name="user-hash-password" type="xsd:string" />
<part name="country-code" type="xsd:int" />
<part name="webapi-key" type="xsd:string" />
<part name="local-version" type="xsd:long" />
</message>
<message name="doLoginEncResponse">
<part name="session-handle-part" type="xsd:string" />
<part name="user-id" type="xsd:long" />
<part name="server-time" type="xsd:long" />
</message>
<message name="doNewAuctionRequest">
<part name="session-handle" type="xsd:string" />
<part name="fields" type="typens:ArrayOfFieldsValue" />
<part name="private" type="xsd:int" />
<part name="local-id" type="xsd:int" />
</message>
<message name="doNewAuctionResponse">
<part name="item-id" type="xsd:long" />
<part name="item-info" type="xsd:string" />
</message>
<message name="doNewAuctionExtRequest">
<part name="session-handle" type="xsd:string" />
<part name="fields" type="typens:ArrayOfFieldsValue" />
<part name="private" type="xsd:int" />
<part name="local-id" type="xsd:int" />
</message>
<message name="doNewAuctionExtResponse">
<part name="item-id" type="xsd:long" />
<part name="item-info" type="xsd:string" />
</message>
<message name="doSellSomeAgainRequest">
<part name="session-handle" type="xsd:string" />
<part name="sell-items-array" type="typens:ArrayOfItemsID" />
<part name="sell-starting-time" type="xsd:long" />
<part name="sell-auction-duration" type="xsd:int" />
<part name="sell-options" type="xsd:int" />
</message>
<message name="doSellSomeAgainResponse">
<part name="items-sell-again" type="typens:ArrayOfStructSellAgain" />
<part name="items-sell-failed" type="typens:ArrayOfStructSellFailed" />
<part name="items-sell-not-found" type="typens:ArrayOfItemsID" />
</message>
<message name="doCheckNewAuctionRequest">
<part name="session-handle" type="xsd:string" />
<part name="fields" type="typens:ArrayOfFieldsValue" />
</message>
<message name="doCheckNewAuctionResponse">
<part name="item-price" type="xsd:string" />
<part name="item-price-desc" type="xsd:string" />
</message>
<message name="doCheckNewAuctionExtRequest">
<part name="session-handle" type="xsd:string" />
<part name="fields" type="typens:ArrayOfFieldsValue" />
</message>
<message name="doCheckNewAuctionExtResponse">
<part name="item-price" type="xsd:string" />
<part name="item-price-desc" type="xsd:string" />
</message>
<message name="doAddDescToItemsRequest">
<part name="session-handle" type="xsd:string" />
<part name="items-id-array" type="typens:ArrayOfItemsID" />
<part name="it-description" type="xsd:string" />
</message>
<message name="doAddDescToItemsResponse">
<part name="array-items-add-id" type="typens:ArrayOfItemsID" />
<part name="array-items-desc-to-long" type="typens:ArrayOfItemsID" />
<part name="array-items-not-found" type="typens:ArrayOfItemsID" />
</message>
<message name="doCheckItemIdByFutureItemIdRequest">
<part name="webapi-key" type="xsd:string" />
<part name="country-id" type="xsd:int" />
<part name="future-item-id" type="xsd:long" />
</message>
<message name="doCheckItemIdByFutureItemIdResponse">
<part name="item-id" type="xsd:long" />
</message>
<message name="doGetCatsDataLimitRequest">
<part name="country-id" type="xsd:int" />
<part name="local-version" type="xsd:long" />
<part name="webapi-key" type="xsd:string" />
<part name="offset" type="xsd:int" />
<part name="package-element" type="xsd:int" />
</message>
<message name="doGetCatsDataLimitResponse">
<part name="cats-list" type="typens:ArrayOfCats" />
<part name="ver-key" type="xsd:long" />
<part name="ver-str" type="xsd:string" />
</message>
<message name="doGetItemsInfoRequest">
<part name="session-handle" type="xsd:string" />
<part name="items-id-array" type="typens:ArrayOfItemsID" />
<part name="get-desc" type="xsd:int" />
<part name="get-image-url" type="xsd:int" />
<part name="get-attribs" type="xsd:int" />
<part name="get-postage-options" type="xsd:int" />
<part name="get-company-info" type="xsd:int" />
</message>
<message name="doGetItemsInfoResponse">
<part name="array-item-list-info" type="typens:ArrayOfStructItemInfoList" />
<part name="array-items-not-found" type="typens:ArrayOfItemsID" />
<part name="array-items-admin-killed" type="typens:ArrayOfItemsID" />
</message>
<message name="doGetPaymentDataRequest">
<part name="country-id" type="xsd:int" />
<part name="webapi-key" type="xsd:string" />
</message>
<message name="doGetPaymentDataResponse">
<part name="payment-list" type="typens:ArrayOfBilling" />
</message>
<message name="doGetSellFormFieldsRequest">
<part name="country-code" type="xsd:int" />
<part name="local-version" type="xsd:long" />
<part name="webapi-key" type="xsd:string" />
</message>
<message name="doGetSellFormFieldsResponse">
<part name="sell-form-fields" type="typens:ArrayOfSellForms" />
<part name="ver-key" type="xsd:long" />
<part name="ver-str" type="xsd:string" />
</message>
<message name="doGetSellFormFieldsExtRequest">
<part name="country-code" type="xsd:int" />
<part name="local-version" type="xsd:long" />
<part name="webapi-key" type="xsd:string" />
</message>
<message name="doGetSellFormFieldsExtResponse">
<part name="sell-form-fields" type="typens:ArrayOfSellForms" />
<part name="ver-key" type="xsd:long" />
<part name="ver-str" type="xsd:string" />
</message>
<message name="doGetSitesFlagInfoRequest">
<part name="country-code" type="xsd:int" />
<part name="webapi-key" type="xsd:string" />
</message>
<message name="doGetSitesFlagInfoResponse">
<part name="sites-info-list" type="typens:ArrayOfSitesFlagInfo" />
<part name="ver-key" type="xsd:long" />
<part name="ver-str" type="xsd:string" />
</message>
<message name="doGetSitesInfoRequest">
<part name="country-code" type="xsd:int" />
<part name="webapi-key" type="xsd:string" />
</message>
<message name="doGetSitesInfoResponse">
<part name="sites-info-list" type="typens:ArrayOfSitesInfo" />
<part name="ver-key" type="xsd:long" />
<part name="ver-str" type="xsd:string" />
</message>
<message name="doGetSystemTimeRequest">
<part name="country-id" type="xsd:int" />
<part name="webapi-key" type="xsd:string" />
</message>
<message name="doGetSystemTimeResponse">
<part name="server-time" type="xsd:long" />
</message>
<message name="doGetUserIDRequest">
<part name="country-id" type="xsd:int" />
<part name="user-login" type="xsd:string" />
<part name="user-email" type="xsd:string" />
<part name="webapi-key" type="xsd:string" />
</message>
<message name="doGetUserIDResponse">
<part name="user-id" type="xsd:int" />
</message>
<message name="doGetUserItemsRequest">
<part name="user-id" type="xsd:int" />
<part name="webapi-key" type="xsd:string" />
<part name="country-id" type="xsd:int" />
<part name="offset" type="xsd:int" />
<part name="limit" type="xsd:int" />
</message>
<message name="doGetUserItemsResponse">
<part name="user-item-list" type="typens:ArrayOfUserItemList" />
<part name="user-item-count" type="xsd:int" />
</message>
<message name="doGetUserLoginRequest">
<part name="country-id" type="xsd:int" />
<part name="user-id" type="xsd:int" />
<part name="webapi-key" type="xsd:string" />
</message>
<message name="doGetUserLoginResponse">
<part name="user-login" type="xsd:string" />
</message>
<message name="doQueryAllSysStatusRequest">
<part name="country-id" type="xsd:int" />
<part name="webapi-key" type="xsd:string" />
</message>
<message name="doQueryAllSysStatusResponse">
<part name="sys-country-status" type="typens:ArrayOfSysStatus" />
</message>
<message name="doGetSellFormFieldsExtLimitRequest">
<part name="country-code" type="xsd:int" />
<part name="local-version" type="xsd:long" />
<part name="webapi-key" type="xsd:string" />
<part name="offset" type="xsd:int" />
<part name="package-element" type="xsd:int" />
</message>
<message name="doGetSellFormFieldsExtLimitResponse">
<part name="sell-form-fields" type="typens:ArrayOfSellForms" />
<part name="ver-key" type="xsd:long" />
<part name="ver-str" type="xsd:string" />
<part name="form-fields-count" type="xsd:int" />
</message>
<message name="doGetSellFormFieldsLimitRequest">
<part name="country-code" type="xsd:int" />
<part name="local-version" type="xsd:long" />
<part name="webapi-key" type="xsd:string" />
<part name="offset" type="xsd:int" />
<part name="package-element" type="xsd:int" />
</message>
<message name="doGetSellFormFieldsLimitResponse">
<part name="sell-form-fields" type="typens:ArrayOfSellForms" />
<part name="ver-key" type="xsd:long" />
<part name="ver-str" type="xsd:string" />
<part name="form-fields-count" type="xsd:int" />
</message>
<message name="doQuerySysStatusRequest">
<part name="sysvar" type="xsd:int" />
<part name="country-id" type="xsd:int" />
<part name="webapi-key" type="xsd:string" />
</message>
<message name="doQuerySysStatusResponse">
<part name="info" type="xsd:string" />
<part name="ver-key" type="xsd:long" />
</message>
<message name="doShowCatRequest">
<part name="session-handle" type="xsd:string" />
<part name="cat-id" type="xsd:int" />
<part name="cat-item-state" type="xsd:int" />
<part name="cat-item-option" type="xsd:int" />
<part name="cat-item-duration-option" type="typens:DurationTimeInfo" />
<part name="cat-attrib-fields" type="typens:ArrayOfFieldsValue" />
<part name="cat-sort-options" type="xsd:int" />
<part name="cat-items-price" type="typens:PriceCatInfo" />
<part name="cat-items-offset" type="xsd:int" />
<part name="cat-items-limit" type="xsd:int" />
<part name="cat-order-fulfillment-time" type="xsd:int" />
</message>
<message name="doShowCatResponse">
<part name="cat-parent-array" type="typens:ArrayOfCatInfoStruct" />
<part name="cat-child-array" type="typens:ArrayOfCatInfoStruct" />
<part name="cat-sister-array" type="typens:ArrayOfCatInfoStruct" />
<part name="cat-items-count" type="xsd:int" />
<part name="cat-items-count-featured" type="xsd:int" />
<part name="cat-items-array" type="typens:ArrayOfSearchResponse" />
</message>
<message name="doShowItemInfoRequest">
<part name="session-handle" type="xsd:string" />
<part name="item-id" type="xsd:long" />
<part name="get-desc" type="xsd:int" />
<part name="get-image-url" type="xsd:int" />
<part name="get-attribs" type="xsd:int" />
<part name="get-postage-options" type="xsd:int" />
<part name="get-company-info" type="xsd:int" />
</message>
<message name="doShowItemInfoResponse">
<part name="item-list-info" type="typens:ItemInfo" />
<part name="item-cat-path" type="typens:ArrayOfItemCatList" />
<part name="item-img-list" type="typens:ArrayOfItemImageList" />
<part name="item-attrib-list" type="typens:ArrayOfAttribStruct" />
<part name="item-postage-options" type="typens:ArrayOfPostageStruct" />
<part name="item-payment-options" type="typens:ItemPaymentOptions" />
<part name="item-company-info" type="typens:CompanyInfoStruct" />
</message>
<message name="doShowUserRequest">
<part name="webapi-key" type="xsd:string" />
<part name="country-id" type="xsd:int" />
<part name="user-id" type="xsd:long" />
<part name="user-login" type="xsd:string" />
</message>
<message name="doShowUserResponse">
<part name="user-id" type="xsd:long" />
<part name="user-login" type="xsd:string" />
<part name="user-country" type="xsd:int" />
<part name="user-create-date" type="xsd:long" />
<part name="user-login-date" type="xsd:long" />
<part name="user-rating" type="xsd:int" />
<part name="user-is-new-user" type="xsd:int" />
<part name="user-not-activated" type="xsd:int" />
<part name="user-closed" type="xsd:int" />
<part name="user-blocked" type="xsd:int" />
<part name="user-terminated" type="xsd:int" />
<part name="user-has-page" type="xsd:int" />
<part name="user-is-sseller" type="xsd:int" />
<part name="user-is-eco" type="xsd:int" />
<part name="user-positive-feedback" type="typens:ShowUserFeedbacks" />
<part name="user-negative-feedback" type="typens:ShowUserFeedbacks" />
<part name="user-neutral-feedback" type="typens:ShowUserFeedbacks" />
<part name="user-junior-status" type="xsd:int" />
<part name="user-has-shop" type="xsd:int" />
<part name="user-company-icon" type="xsd:int" />
<part name="user-sell-rating-count" type="xsd:int" />
<part name="user-sell-rating-average" type="typens:ArrayOfSellRatingAverageStruct" />
<part name="user-is-allegro-standard" type="xsd:int" />
</message>
<message name="doVerifyItemRequest">
<part name="session-handle" type="xsd:string" />
<part name="local-id" type="xsd:int" />
</message>
<message name="doVerifyItemResponse">
<part name="item-id" type="xsd:long" />
<part name="item-listed" type="xsd:int" />
</message>
<message name="doAddWatchListRequest">
<part name="session-handle" type="xsd:string" />
<part name="items-id-array" type="typens:ArrayOfItemsID" />
</message>
<message name="doAddWatchListResponse">
<part name="array-items-add-id" type="typens:ArrayOfItemsID" />
<part name="array-items-not-found" type="typens:ArrayOfItemsID" />
<part name="array-items-admin-killed" type="typens:ArrayOfItemsID" />
</message>
<message name="doFeedbackRequest">
<part name="session-handle" type="xsd:string" />
<part name="fe-item-id" type="xsd:int" />
<part name="fe-from-user-id" type="xsd:int" />
<part name="fe-to-user-id" type="xsd:int" />
<part name="fe-comment" type="xsd:string" />
<part name="fe-comment-type" type="xsd:string" />
<part name="fe-op" type="xsd:int" />
<part name="fe-rating" type="typens:ArrayOfSellRatingEstimationStruct" />
</message>
<message name="doFeedbackResponse">
<part name="feedback-id" type="xsd:int" />
</message>
<message name="doGetBidItem2Request">
<part name="session-handle" type="xsd:string" />
<part name="item-id" type="xsd:long" />
</message>
<message name="doGetBidItem2Response">
<part name="biditem-list" type="typens:ArrayOfBidList2" />
</message>
<message name="doGetFeedbackRequest">
<part name="session-handle" type="xsd:string" />
<part name="feedback-from" type="xsd:int" />
<part name="feedback-to" type="xsd:int" />
<part name="feedback-offset" type="xsd:int" />
<part name="feedback-kind-list" type="xsd:string" />
</message>
<message name="doGetFeedbackResponse">
<part name="feedback-list" type="typens:ArrayOfFeedbackList" />
<part name="feedback-count" type="xsd:int" />
</message>
<message name="doGetSiteJournalRequest">
<part name="session-handle" type="xsd:string" />
<part name="starting-point" type="xsd:long" />
<part name="info-type" type="xsd:int" />
</message>
<message name="doGetSiteJournalResponse">
<part name="site-journal-array" type="typens:SiteJournalArray" />
</message>
<message name="doGetSiteJournalInfoRequest">
<part name="session-handle" type="xsd:string" />
<part name="starting-point" type="xsd:long" />
<part name="info-type" type="xsd:int" />
</message>
<message name="doGetSiteJournalInfoResponse">
<part name="site-journal-info" type="typens:SiteJournalInfo" />
</message>
<message name="doMyAccount2Request">
<part name="session-handle" type="xsd:string" />
<part name="account-type" type="xsd:string" />
<part name="offset" type="xsd:int" />
<part name="items-array" type="typens:ArrayOfAuctionID" />
<part name="limit" type="xsd:int" />
</message>
<message name="doMyAccount2Response">
<part name="myaccount-list" type="typens:ArrayOfMyAccountList2" />
</message>
<message name="doMyAccountItemsCountRequest">
<part name="session-handle" type="xsd:string" />
<part name="account-type" type="xsd:string" />
<part name="items-array" type="typens:ArrayOfAuctionID" />
</message>
<message name="doMyAccountItemsCountResponse">
<part name="myaccount-items-count" type="xsd:int" />
</message>
<message name="doMyBillingRequest">
<part name="session-handle" type="xsd:string" />
</message>
<message name="doMyBillingResponse">
<part name="my-billing" type="xsd:string" />
</message>
<message name="doMyContactRequest">
<part name="session-handle" type="xsd:string" />
<part name="auction-id-list" type="typens:ArrayOfAuctionID" />
<part name="offset" type="xsd:int" />
<part name="desc" type="xsd:int" />
</message>
<message name="doMyContactResponse">
<part name="mycontact-list" type="typens:ArrayOfMyContactList" />
</message>
<message name="doMyFeedback2Request">
<part name="session-handle" type="xsd:string" />
<part name="feedback-type" type="xsd:string" />
<part name="offset" type="xsd:int" />
<part name="desc" type="xsd:int" />
<part name="items-array" type="typens:ArrayOfAuctionID" />
</message>
<message name="doMyFeedback2Response">
<part name="myfeedback-list" type="typens:ArrayOfMyFeedbackList2" />
</message>
<message name="doSearchRequest">
<part name="session-handle" type="xsd:string" />
<part name="search-query" type="typens:SearchOptType" />
</message>
<message name="doSearchResponse">
<part name="search-count" type="xsd:int" />
<part name="search-count-featured" type="xsd:int" />
<part name="search-array" type="typens:ArrayOfSearchResponse" />
<part name="search-excluded-words" type="typens:ArrayOfExcludedWords" />
</message>
<message name="doGetAdminUserLicenceDateRequest">
<part name="admin-session-handle" type="xsd:string" />
<part name="user-lic-login" type="xsd:string" />
</message>
<message name="doGetAdminUserLicenceDateResponse">
<part name="get-date-value" type="xsd:float" />
</message>
<message name="doGetUserLicenceDateRequest">
<part name="session-handle" type="xsd:string" />
</message>
<message name="doGetUserLicenceDateResponse">
<part name="get-date-value" type="xsd:float" />
</message>
<message name="doMyBillingItemRequest">
<part name="session-handle" type="xsd:string" />
<part name="item-id" type="xsd:int" />
<part name="option" type="xsd:string" />
</message>
<message name="doMyBillingItemResponse">
<part name="entry-fees" type="typens:ItemBillingList" />
<part name="ending-fees" type="typens:ItemBillingList" />
</message>
<message name="doSetUserLicenceDateRequest">
<part name="admin-session-handle" type="xsd:string" />
<part name="user-lic-login" type="xsd:string" />
<part name="user-lic-country" type="xsd:int" />
<part name="user-lic-date" type="xsd:float" />
</message>
<message name="doSetUserLicenceDateResponse">
<part name="set-date-value" type="xsd:int" />
</message>
<message name="doBidItemRequest">
<part name="session-handle" type="xsd:string" />
<part name="bid-it-id" type="xsd:long" />
<part name="bid-user-price" type="xsd:float" />
<part name="bid-quantity" type="xsd:long" />
<part name="bid-buy-now" type="xsd:long" />
</message>
<message name="doBidItemResponse">
<part name="bid-price" type="xsd:string" />
</message>
<message name="doCancelBidItemRequest">
<part name="session-handle" type="xsd:string" />
<part name="cancel-item-id" type="xsd:long" />
<part name="cancel-bids-array" type="typens:ArrayOfCancelBidsID" />
<part name="cancel-bids-reason" type="xsd:string" />
<part name="cancel-add-to-black-list" type="xsd:long" />
</message>
<message name="doCancelBidItemResponse">
<part name="cancel-bid-value" type="xsd:int" />
<part name="cancelled-bids" type="typens:ArrayOfCancelBidsID" />
<part name="not-cancelled-bids" type="typens:ArrayOfCancelBidsID" />
</message>
<message name="doChangePriceItemRequest">
<part name="session-handle" type="xsd:string" />
<part name="item-id" type="xsd:long" />
<part name="new-starting-price" type="xsd:float" />
<part name="new-reserve-price" type="xsd:float" />
<part name="new-buy-now-price" type="xsd:float" />
</message>
<message name="doChangePriceItemResponse">
<part name="item-info" type="xsd:string" />
<part name="item-id" type="xsd:long" />
</message>
<message name="doFinishItemRequest">
<part name="session-handle" type="xsd:string" />
<part name="finish-item-id" type="xsd:long" />
<part name="finish-cancel-all-bids" type="xsd:int" />
<part name="finish-cancel-reason" type="xsd:string" />
</message>
<message name="doFinishItemResponse">
<part name="finish-value" type="xsd:int" />
</message>
<message name="doRequestCancelBidRequest">
<part name="session-handle" type="xsd:string" />
<part name="request-item-id" type="xsd:long" />
<part name="request-cancel-reason" type="xsd:string" />
</message>
<message name="doRequestCancelBidResponse">
<part name="request-value" type="xsd:int" />
</message>
<message name="doGetCatsDataCountRequest">
<part name="country-id" type="xsd:int" />
<part name="local-version" type="xsd:long" />
<part name="webapi-key" type="xsd:string" />
</message>
<message name="doGetCatsDataCountResponse">
<part name="cats-count" type="xsd:int" />
<part name="ver-key" type="xsd:long" />
<part name="ver-str" type="xsd:string" />
</message>
<message name="doMyFeedback2LimitRequest">
<part name="session-handle" type="xsd:string" />
<part name="feedback-type" type="xsd:string" />
<part name="offset" type="xsd:int" />
<part name="desc" type="xsd:int" />
<part name="items-array" type="typens:ArrayOfAuctionID" />
<part name="package-element" type="xsd:int" />
</message>
<message name="doMyFeedback2LimitResponse">
<part name="myfeedback-list" type="typens:ArrayOfMyFeedbackList2" />
</message>
<message name="doGetCountriesRequest">
<part name="country-code" type="xsd:int" />
<part name="webapi-key" type="xsd:string" />
</message>
<message name="doGetCountriesResponse">
<part name="country-array" type="typens:ArrayOfCountries" />
</message>
<message name="doGetServiceTemplatesRequest">
<part name="country-code" type="xsd:int" />
<part name="webapi-key" type="xsd:string" />
</message>
<message name="doGetServiceTemplatesResponse">
<part name="templates-array" type="typens:ArrayOfTemplates" />
</message>
<message name="doGetSellFormAttribsRequest">
<part name="country-id" type="xsd:int" />
<part name="webapi-key" type="xsd:string" />
<part name="local-version" type="xsd:long" />
<part name="cat-id" type="xsd:int" />
</message>
<message name="doGetSellFormAttribsResponse">
<part name="sell-form-fields" type="typens:ArrayOfSellForms" />
<part name="ver-key" type="xsd:long" />
<part name="ver-str" type="xsd:string" />
</message>
<message name="doFeedbackManyRequest">
<part name="session-handle" type="xsd:string" />
<part name="feedbacks-list" type="typens:ArrayOfFeedbackManyStruct" />
</message>
<message name="doFeedbackManyResponse">
<part name="fe-results" type="typens:ArrayOfFeedbacksResult" />
</message>
<message name="doShowItemInfoExtRequest">
<part name="session-handle" type="xsd:string" />
<part name="item-id" type="xsd:long" />
<part name="get-desc" type="xsd:int" />
<part name="get-image-url" type="xsd:int" />
<part name="get-attribs" type="xsd:int" />
<part name="get-postage-options" type="xsd:int" />
<part name="get-company-info" type="xsd:int" />
</message>
<message name="doShowItemInfoExtResponse">
<part name="item-list-info-ext" type="typens:ItemInfoExt" />
<part name="item-cat-path" type="typens:ArrayOfItemCatList" />
<part name="item-img-list" type="typens:ArrayOfItemImageList" />
<part name="item-attrib-list" type="typens:ArrayOfAttribStruct" />
<part name="item-postage-options" type="typens:ArrayOfPostageStruct" />
<part name="item-payment-options" type="typens:ItemPaymentOptions" />
<part name="item-company-info" type="typens:CompanyInfoStruct" />
</message>
<message name="doGetWaitingFeedbacksCountRequest">
<part name="session-handle" type="xsd:string" />
</message>
<message name="doGetWaitingFeedbacksCountResponse">
<part name="feedback-count" type="xsd:int" />
</message>
<message name="doGetWaitingFeedbacksRequest">
<part name="session-handle" type="xsd:string" />
<part name="offset" type="xsd:int" />
<part name="package-size" type="xsd:int" />
</message>
<message name="doGetWaitingFeedbacksResponse">
<part name="fe-wait-list" type="typens:ArrayOfWaitFeedbackStruct" />
</message>
<message name="doGetBlackListUsersRequest">
<part name="session-handle" type="xsd:string" />
</message>
<message name="doGetBlackListUsersResponse">
<part name="black-list-users" type="typens:ArrayOfBlackListStruct" />
</message>
<message name="doRemoveFromBlackListRequest">
<part name="session-handle" type="xsd:string" />
<part name="users-id-array" type="typens:ArrayOfUsersID" />
</message>
<message name="doRemoveFromBlackListResponse">
<part name="black-list-result" type="typens:ArrayOfBlackListResStruct" />
</message>
<message name="doGetServiceInfoCategoriesRequest">
<part name="country-code" type="xsd:int" />
<part name="webapi-key" type="xsd:string" />
</message>
<message name="doGetServiceInfoCategoriesResponse">
<part name="service-info-cats-list" type="typens:ArrayOfServiceInfoCatStruct" />
</message>
<message name="doGetServiceInfoRequest">
<part name="country-code" type="xsd:int" />
<part name="an-cat-id" type="xsd:int" />
<part name="an-it-date" type="xsd:long" />
<part name="an-it-id" type="xsd:int" />
<part name="webapi-key" type="xsd:string" />
</message>
<message name="doGetServiceInfoResponse">
<part name="service-info-items-list" type="typens:ArrayOfServiceInfoStruct" />
</message>
<message name="doGetStatesInfoRequest">
<part name="country-code" type="xsd:int" />
<part name="webapi-key" type="xsd:string" />
</message>
<message name="doGetStatesInfoResponse">
<part name="states-info-array" type="typens:ArrayOfStateInfoStruct" />
</message>
<message name="doGetShopCatsDataRequest">
<part name="session-handle" type="xsd:string" />
</message>
<message name="doGetShopCatsDataResponse">
<part name="shop-cats-list" type="typens:ArrayOfCats" />
</message>
<message name="doCheckExternalKeyRequest">
<part name="webapi-key" type="xsd:string" />
<part name="user-id" type="xsd:long" />
<part name="item-id" type="xsd:long" />
<part name="hash-key" type="xsd:string" />
</message>
<message name="doCheckExternalKeyResponse">
<part name="result" type="xsd:int" />
</message>
<message name="doSellSomeAgainInShopRequest">
<part name="session-handle" type="xsd:string" />
<part name="sell-items-array" type="typens:ArrayOfItemsID" />
<part name="sell-starting-time" type="xsd:long" />
<part name="sell-shop-duration" type="xsd:int" />
<part name="sell-shop-options" type="xsd:int" />
<part name="sell-prolong-options" type="xsd:int" />
<part name="sell-shop-category" type="xsd:long" />
</message>
<message name="doSellSomeAgainInShopResponse">
<part name="items-sell-again" type="typens:ArrayOfStructSellAgain" />
<part name="items-sell-failed" type="typens:ArrayOfStructSellFailed" />
<part name="items-sell-not-found" type="typens:ArrayOfItemsID" />
</message>
<message name="doGetSuperSellerStatusRequest">
<part name="webapi-key" type="xsd:string" />
<part name="user-id" type="xsd:long" />
</message>
<message name="doGetSuperSellerStatusResponse">
<part name="user-ss-status" type="xsd:int" />
</message>
<message name="doGetMyDataRequest">
<part name="session-handle" type="xsd:string" />
</message>
<message name="doGetMyDataResponse">
<part name="user-data" type="typens:UserDataStruct" />
<part name="invoice-data" type="typens:InvoiceDataStruct" />
<part name="company-extra-data" type="typens:CompanyExtraDataStruct" />
<part name="company-second-address" type="typens:CompanySecondAddressStruct" />
<part name="pharmacy-data" type="typens:PharmacyDataStruct" />
<part name="alcohol-data" type="typens:AlcoholDataStruct" />
</message>
<message name="doInternalIStoreChangeRequest">
<part name="webapi-key" type="xsd:string" />
<part name="user-id" type="xsd:long" />
<part name="istore-id" type="xsd:long" />
<part name="action-type" type="xsd:string" />
<part name="action-date" type="xsd:long" />
<part name="valid-date" type="xsd:long" />
</message>
<message name="doInternalIStoreChangeResponse">
<part name="result" type="xsd:int" />
</message>
<message name="doGetFavouriteSellersRequest">
<part name="session-handle" type="xsd:string" />
</message>
<message name="doGetFavouriteSellersResponse">
<part name="s-favourite-sellers-list" type="typens:ArrayOfFavouritesSellers" />
</message>
<message name="doGetFavouriteCategoriesRequest">
<part name="session-handle" type="xsd:string" />
</message>
<message name="doGetFavouriteCategoriesResponse">
<part name="s-favourite-categories-list" type="typens:ArrayOfFavouritesCategories" />
</message>
<message name="doGetItemsImagesRequest">
<part name="session-handle" type="xsd:string" />
<part name="items-array" type="typens:ArrayOfItemGetImage" />
<part name="image-type" type="xsd:int" />
</message>
<message name="doGetItemsImagesResponse">
<part name="get_items_images_result" type="typens:ArrayOfItemImagesStruct" />
</message>
<message name="doGetSpecialItemsRequest">
<part name="session-handle" type="xsd:string" />
<part name="special-type" type="xsd:int" />
<part name="special-group" type="xsd:int" />
<part name="offset" type="xsd:int" />
<part name="order-fulfillment-time" type="xsd:int" />
</message>
<message name="doGetSpecialItemsResponse">
<part name="s-special-list" type="typens:ArrayOfSpecialAuction" />
</message>
<message name="doAddToBlackListRequest">
<part name="session-handle" type="xsd:string" />
<part name="users-black-list-array" type="typens:ArrayOfUserBlackListStruct" />
</message>
<message name="doAddToBlackListResponse">
<part name="user-black-list-results-arr" type="typens:ArrayOfUserBlackListAddResultStruct" />
</message>
<message name="doGetPostBuyDataRequest">
<part name="session-handle" type="xsd:string" />
<part name="items-array" type="typens:ArrayOfAuctionID" />
</message>
<message name="doGetPostBuyDataResponse">
<part name="items-post-buy-data" type="typens:ArrayOfItemsPostBuyData" />
</message>
<message name="doCancelRefundFormsRequest">
<part name="session-handle" type="xsd:string" />
<part name="refund-cancel-data-arr" type="typens:ArrayOfCancelRefundDataStruct" />
</message>
<message name="doCancelRefundFormsResponse">
<part name="cancel-refund-forms-results-arr" type="typens:ArrayOfCancelRefundFormResultStruct" />
</message>
<message name="doGetSessionHandleForWidgetRequest">
<part name="webapi-key" type="xsd:string" />
<part name="country-code" type="xsd:int" />
</message>
<message name="doGetSessionHandleForWidgetResponse">
<part name="session-handle" type="xsd:string" />
<part name="server-time" type="xsd:long" />
</message>
<message name="doCancelRefundWarningsRequest">
<part name="session-handle" type="xsd:string" />
<part name="cancel-refund-warnings-data-arr" type="typens:ArrayOfCancelRefundWarningStruct" />
</message>
<message name="doCancelRefundWarningsResponse">
<part name="cancel-refund-warnings-results-arr" type="typens:ArrayOfCancelRefundWarningResultStruct" />
</message>
<message name="doInternalSendMessageRequest">
<part name="session-handle" type="xsd:string" />
<part name="user-id" type="xsd:int" />
<part name="mail_template_id" type="xsd:int" />
<part name="array-of-additional-data" type="typens:ArrayOfAdditionalData" />
</message>
<message name="doInternalSendMessageResponse">
<part name="result" type="xsd:int" />
</message>
<message name="doGetRefundTransactionsRequest">
<part name="session-handle" type="xsd:string" />
<part name="offset" type="xsd:int" />
<part name="limit" type="xsd:int" />
</message>
<message name="doGetRefundTransactionsResponse">
<part name="refund-forms-count" type="xsd:int" />
<part name="refund-forms-list" type="typens:ArrayOfRefundFormDataStruct" />
</message>
<message name="doSendReminderMessagesRequest">
<part name="session-handle" type="xsd:string" />
<part name="send-reminder-messages-data-arr" type="typens:ArrayOfSendReminderMessageStruct" />
</message>
<message name="doSendReminderMessagesResponse">
<part name="send-reminder-messages-results-arr" type="typens:ArrayOfSendReminderMessageResultStruct" />
</message>
<message name="doRemoveFromWatchListRequest">
<part name="session-handle" type="xsd:string" />
<part name="items-id-array" type="typens:ArrayOfItemsID" />
</message>
<message name="doRemoveFromWatchListResponse">
<part name="watch-list-result" type="typens:ArrayOfItemRemoveWatchStruct" />
</message>
<message name="doSendRefundFormsRequest">
<part name="session-handle" type="xsd:string" />
<part name="send-refund-forms-data-arr" type="typens:ArrayOfSendRefundFormStruct" />
</message>
<message name="doSendRefundFormsResponse">
<part name="send-refund-forms-results-arr" type="typens:ArrayOfSendRefundFormResultStruct" />
</message>
<message name="doGetRefundFormsStatusesRequest">
<part name="session-handle" type="xsd:string" />
<part name="refund-forms-statuses-data-arr" type="typens:ArrayOfRefundFormStatusStruct" />
</message>
<message name="doGetRefundFormsStatusesResponse">
<part name="refund-forms-statuses-results-arr" type="typens:ArrayOfRefundFormStatusResultStruct" />
</message>
<message name="doGetRefundReasonsRequest">
<part name="webapi-key" type="xsd:string" />
<part name="country-code" type="xsd:int" />
</message>
<message name="doGetRefundReasonsResponse">
<part name="refund-reasons-arr" type="typens:ArrayOfRefundReasonStruct" />
</message>
<message name="doGetMyIncomingPaymentsRequest">
<part name="session-handle" type="xsd:string" />
<part name="buyer-id" type="xsd:int" />
<part name="item-id" type="xsd:long" />
<part name="trans-recv-date-from" type="xsd:long" />
<part name="trans-recv-date-to" type="xsd:long" />
<part name="trans-page-limit" type="xsd:int" />
<part name="trans-offset" type="xsd:int" />
</message>
<message name="doGetMyIncomingPaymentsResponse">
<part name="pay-trans-income" type="typens:ArrayOfUserIncomingPaymentStruct" />
</message>
<message name="doGetMyPaymentsRequest">
<part name="session-handle" type="xsd:string" />
<part name="seller-id" type="xsd:int" />
<part name="item-id" type="xsd:long" />
<part name="trans-create-date-from" type="xsd:long" />
<part name="trans-create-date-to" type="xsd:long" />
<part name="trans-page-limit" type="xsd:int" />
<part name="trans-offset" type="xsd:int" />
</message>
<message name="doGetMyPaymentsResponse">
<part name="pay-trans-payment" type="typens:ArrayOfUserPaymentStruct" />
</message>
<message name="doGetMyPayoutsRequest">
<part name="session-handle" type="xsd:string" />
<part name="trans-create-date-from" type="xsd:long" />
<part name="trans-create-date-to" type="xsd:long" />
<part name="trans-page-limit" type="xsd:int" />
<part name="trans-offset" type="xsd:int" />
</message>
<message name="doGetMyPayoutsResponse">
<part name="pay-trans-payout" type="typens:ArrayOfUserPayoutStruct" />
</message>
<message name="doChangeQuantityItemRequest">
<part name="session-handle" type="xsd:string" />
<part name="item-id" type="xsd:long" />
<part name="new-item-quantity" type="xsd:int" />
</message>
<message name="doChangeQuantityItemResponse">
<part name="item-id" type="xsd:long" />
<part name="item-info" type="xsd:string" />
<part name="item-quantity-left" type="xsd:int" />
<part name="item-quantity-sold" type="xsd:int" />
</message>
<message name="doShowUserPageRequest">
<part name="webapi-key" type="xsd:string" />
<part name="country-id" type="xsd:int" />
<part name="user-id" type="xsd:long" />
</message>
<message name="doShowUserPageResponse">
<part name="user-page-content" type="xsd:string" />
<part name="user-page-pharmacy-permit" type="xsd:string" />
<part name="user-page-alcohol-permit" type="xsd:string" />
</message>
<message name="doSendEmailToUserRequest">
<part name="session-handle" type="xsd:string" />
<part name="mail-to-user-item-id" type="xsd:long" />
<part name="mail-to-user-receiver-id" type="xsd:long" />
<part name="mail-to-user-subject-id" type="xsd:int" />
<part name="mail-to-user-option" type="xsd:int" />
<part name="mail-to-user-message" type="xsd:string" />
</message>
<message name="doSendEmailToUserResponse">
<part name="mail-to-user-receiver-id" type="xsd:long" />
<part name="mail-to-user-result" type="xsd:string" />
</message>
<message name="doGetTransactionsIDsRequest">
<part name="session-handle" type="xsd:string" />
<part name="items-id-array" type="typens:ArrayOfItemsID" />
<part name="user-role" type="xsd:string" />
</message>
<message name="doGetTransactionsIDsResponse">
<part name="transactions-ids-array" type="typens:ArrayOfTransactionsID" />
</message>
<message name="doGetPostBuyFormsDataRequest">
<part name="session-handle" type="xsd:string" />
<part name="transactions-ids-array" type="typens:ArrayOfTransactionsID" />
</message>
<message name="doGetPostBuyFormsDataResponse">
<part name="post-buy-form-data" type="typens:ArrayOfPostBuyFormDataStruct" />
</message>
<message name="doGetMyIncomingPaymentsRefundsRequest">
<part name="session-handle" type="xsd:string" />
<part name="buyer-id" type="xsd:int" />
<part name="item-id" type="xsd:long" />
<part name="limit" type="xsd:int" />
<part name="offset" type="xsd:int" />
</message>
<message name="doGetMyIncomingPaymentsRefundsResponse">
<part name="pay-trans-income-refunds" type="typens:ArrayOfUserIncomingPaymentRefundsStruct" />
</message>
<message name="doGetMyPaymentsRefundsRequest">
<part name="session-handle" type="xsd:string" />
<part name="seller-id" type="xsd:int" />
<part name="item-id" type="xsd:long" />
<part name="limit" type="xsd:int" />
<part name="offset" type="xsd:int" />
</message>
<message name="doGetMyPaymentsRefundsResponse">
<part name="pay-trans-payment-refunds" type="typens:ArrayOfUserPaymentRefundsStruct" />
</message>
<message name="doGetMySellRatingRequest">
<part name="session-handle" type="xsd:string" />
</message>
<message name="doGetMySellRatingResponse">
<part name="sell-rating-total-count" type="xsd:int" />
<part name="sell-rating-average" type="typens:ArrayOfSellRatingAverageStruct" />
<part name="sell-rating-details" type="typens:ArrayOfSellRatingDetailStruct" />
<part name="sell-rating-stats-per-month" type="typens:ArrayOfSellRatingAveragePerMonth" />
</message>
<message name="doGetSellRatingReasonsRequest">
<part name="webapi-key" type="xsd:string" />
<part name="country-code" type="xsd:int" />
</message>
<message name="doGetSellRatingReasonsResponse">
<part name="sell-rating-info" type="typens:ArrayOfSellRatingInfoStruct" />
</message>
<message name="doGetDealsRequest">
<part name="session-handle" type="xsd:string" />
<part name="item-id" type="xsd:long" />
<part name="buyer-id" type="xsd:int" />
</message>
<message name="doGetDealsResponse">
<part name="deals-list" type="typens:ArrayOfDealsStruct" />
</message>
<message name="doMakeDiscountRequest">
<part name="session-handle" type="xsd:string" />
<part name="deal-id" type="xsd:long" />
<part name="discount-amount" type="xsd:float" />
<part name="discount-percentage" type="xsd:float" />
</message>
<message name="doMakeDiscountResponse">
<part name="deal-amount-discounted" type="xsd:float" />
</message>
<message name="doChangeItemRequest">
<part name="session-handle" type="xsd:string" />
<part name="item-id" type="xsd:long" />
<part name="item-fields" type="typens:ArrayOfFieldsValue" />
<part name="item-images-options" type="typens:ArrayOfItemImageOptionsStruct" />
</message>
<message name="doChangeItemResponse">
<part name="item-id" type="xsd:long" />
<part name="item-country-surcharge-value" type="xsd:float" />
<part name="item-country-surcharge-currency" type="xsd:string" />
<part name="seller-country-surcharge-value" type="xsd:float" />
<part name="seller-country-surcharge-currency" type="xsd:string" />
</message>
<message name="doFinishItemsRequest">
<part name="session-handle" type="xsd:string" />
<part name="finish-items-list" type="typens:ArrayOfFinishItemsStruct" />
</message>
<message name="doFinishItemsResponse">
<part name="finish-items-succeed" type="typens:ArrayOfFinishSuccessStruct" />
<part name="finish-items-failed" type="typens:ArrayOfFinishFailureStruct" />
</message>
<message name="doGetShipmentDataRequest">
<part name="country-id" type="xsd:int" />
<part name="webapi-key" type="xsd:string" />
</message>
<message name="doGetShipmentDataResponse">
<part name="shipment-data-list" type="typens:ArrayOfShipmentDataStruct" />
<part name="local-version" type="xsd:long" />
</message>
<message name="doGetItemFieldsRequest">
<part name="session-handle" type="xsd:string" />
<part name="item-id" type="xsd:long" />
</message>
<message name="doGetItemFieldsResponse">
<part name="item-fields" type="typens:ArrayOfFieldsValue" />
</message>
<message name="doFindProductByNameRequest">
<part name="session-handle" type="xsd:string" />
<part name="product-name" type="xsd:string" />
<part name="category-id" type="xsd:long" />
</message>
<message name="doFindProductByNameResponse">
<part name="products-info" type="typens:ArrayOfProductStruct" />
</message>
<message name="doGetProductItemsRequest">
<part name="session-handle" type="xsd:string" />
<part name="product-id" type="xsd:long" />
<part name="category-id" type="xsd:int" />
<part name="page-size" type="xsd:int" />
<part name="page-number" type="xsd:int" />
</message>
<message name="doGetProductItemsResponse">
<part name="product-items-count" type="xsd:int" />
<part name="product-items-ids" type="typens:ArrayOfProductItemsIds" />
</message>
<message name="doFindProductByCodeRequest">
<part name="session-handle" type="xsd:string" />
<part name="product-code" type="xsd:string" />
</message>
<message name="doFindProductByCodeResponse">
<part name="product-info" type="typens:ProductStruct" />
</message>
<message name="doRequestSurchargeRequest">
<part name="session-handle" type="xsd:string" />
<part name="transaction-id" type="xsd:long" />
<part name="surcharge-value" type="xsd:float" />
<part name="surcharge-message-to-buyer" type="xsd:string" />
</message>
<message name="doRequestSurchargeResponse">
<part name="surcharge-result" type="xsd:int" />
</message>
<portType name="AllegroWebApiPortType">
<operation name="doGetCatsData">
<input message="typens:doGetCatsDataRequest"/>
<output message="typens:doGetCatsDataResponse"/>
</operation>
<operation name="doLogin">
<input message="typens:doLoginRequest"/>
<output message="typens:doLoginResponse"/>
</operation>
<operation name="doLoginEnc">
<input message="typens:doLoginEncRequest"/>
<output message="typens:doLoginEncResponse"/>
</operation>
<operation name="doNewAuction">
<input message="typens:doNewAuctionRequest"/>
<output message="typens:doNewAuctionResponse"/>
</operation>
<operation name="doNewAuctionExt">
<input message="typens:doNewAuctionExtRequest"/>
<output message="typens:doNewAuctionExtResponse"/>
</operation>
<operation name="doSellSomeAgain">
<input message="typens:doSellSomeAgainRequest"/>
<output message="typens:doSellSomeAgainResponse"/>
</operation>
<operation name="doCheckNewAuction">
<input message="typens:doCheckNewAuctionRequest"/>
<output message="typens:doCheckNewAuctionResponse"/>
</operation>
<operation name="doCheckNewAuctionExt">
<input message="typens:doCheckNewAuctionExtRequest"/>
<output message="typens:doCheckNewAuctionExtResponse"/>
</operation>
<operation name="doAddDescToItems">
<input message="typens:doAddDescToItemsRequest"/>
<output message="typens:doAddDescToItemsResponse"/>
</operation>
<operation name="doCheckItemIdByFutureItemId">
<input message="typens:doCheckItemIdByFutureItemIdRequest"/>
<output message="typens:doCheckItemIdByFutureItemIdResponse"/>
</operation>
<operation name="doGetCatsDataLimit">
<input message="typens:doGetCatsDataLimitRequest"/>
<output message="typens:doGetCatsDataLimitResponse"/>
</operation>
<operation name="doGetItemsInfo">
<input message="typens:doGetItemsInfoRequest"/>
<output message="typens:doGetItemsInfoResponse"/>
</operation>
<operation name="doGetPaymentData">
<input message="typens:doGetPaymentDataRequest"/>
<output message="typens:doGetPaymentDataResponse"/>
</operation>
<operation name="doGetSellFormFields">
<input message="typens:doGetSellFormFieldsRequest"/>
<output message="typens:doGetSellFormFieldsResponse"/>
</operation>
<operation name="doGetSellFormFieldsExt">
<input message="typens:doGetSellFormFieldsExtRequest"/>
<output message="typens:doGetSellFormFieldsExtResponse"/>
</operation>
<operation name="doGetSitesFlagInfo">
<input message="typens:doGetSitesFlagInfoRequest"/>
<output message="typens:doGetSitesFlagInfoResponse"/>
</operation>
<operation name="doGetSitesInfo">
<input message="typens:doGetSitesInfoRequest"/>
<output message="typens:doGetSitesInfoResponse"/>
</operation>
<operation name="doGetSystemTime">
<input message="typens:doGetSystemTimeRequest"/>
<output message="typens:doGetSystemTimeResponse"/>
</operation>
<operation name="doGetUserID">
<input message="typens:doGetUserIDRequest"/>
<output message="typens:doGetUserIDResponse"/>
</operation>
<operation name="doGetUserItems">
<input message="typens:doGetUserItemsRequest"/>
<output message="typens:doGetUserItemsResponse"/>
</operation>
<operation name="doGetUserLogin">
<input message="typens:doGetUserLoginRequest"/>
<output message="typens:doGetUserLoginResponse"/>
</operation>
<operation name="doQueryAllSysStatus">
<input message="typens:doQueryAllSysStatusRequest"/>
<output message="typens:doQueryAllSysStatusResponse"/>
</operation>
<operation name="doGetSellFormFieldsExtLimit">
<input message="typens:doGetSellFormFieldsExtLimitRequest"/>
<output message="typens:doGetSellFormFieldsExtLimitResponse"/>
</operation>
<operation name="doGetSellFormFieldsLimit">
<input message="typens:doGetSellFormFieldsLimitRequest"/>
<output message="typens:doGetSellFormFieldsLimitResponse"/>
</operation>
<operation name="doQuerySysStatus">
<input message="typens:doQuerySysStatusRequest"/>
<output message="typens:doQuerySysStatusResponse"/>
</operation>
<operation name="doShowCat">
<input message="typens:doShowCatRequest"/>
<output message="typens:doShowCatResponse"/>
</operation>
<operation name="doShowItemInfo">
<input message="typens:doShowItemInfoRequest"/>
<output message="typens:doShowItemInfoResponse"/>
</operation>
<operation name="doShowUser">
<input message="typens:doShowUserRequest"/>
<output message="typens:doShowUserResponse"/>
</operation>
<operation name="doVerifyItem">
<input message="typens:doVerifyItemRequest"/>
<output message="typens:doVerifyItemResponse"/>
</operation>
<operation name="doAddWatchList">
<input message="typens:doAddWatchListRequest"/>
<output message="typens:doAddWatchListResponse"/>
</operation>
<operation name="doFeedback">
<input message="typens:doFeedbackRequest"/>
<output message="typens:doFeedbackResponse"/>
</operation>
<operation name="doGetBidItem2">
<input message="typens:doGetBidItem2Request"/>
<output message="typens:doGetBidItem2Response"/>
</operation>
<operation name="doGetFeedback">
<input message="typens:doGetFeedbackRequest"/>
<output message="typens:doGetFeedbackResponse"/>
</operation>
<operation name="doGetSiteJournal">
<input message="typens:doGetSiteJournalRequest"/>
<output message="typens:doGetSiteJournalResponse"/>
</operation>
<operation name="doGetSiteJournalInfo">
<input message="typens:doGetSiteJournalInfoRequest"/>
<output message="typens:doGetSiteJournalInfoResponse"/>
</operation>
<operation name="doMyAccount2">
<input message="typens:doMyAccount2Request"/>
<output message="typens:doMyAccount2Response"/>
</operation>
<operation name="doMyAccountItemsCount">
<input message="typens:doMyAccountItemsCountRequest"/>
<output message="typens:doMyAccountItemsCountResponse"/>
</operation>
<operation name="doMyBilling">
<input message="typens:doMyBillingRequest"/>
<output message="typens:doMyBillingResponse"/>
</operation>
<operation name="doMyContact">
<input message="typens:doMyContactRequest"/>
<output message="typens:doMyContactResponse"/>
</operation>
<operation name="doMyFeedback2">
<input message="typens:doMyFeedback2Request"/>
<output message="typens:doMyFeedback2Response"/>
</operation>
<operation name="doSearch">
<input message="typens:doSearchRequest"/>
<output message="typens:doSearchResponse"/>
</operation>
<operation name="doGetAdminUserLicenceDate">
<input message="typens:doGetAdminUserLicenceDateRequest"/>
<output message="typens:doGetAdminUserLicenceDateResponse"/>
</operation>
<operation name="doGetUserLicenceDate">
<input message="typens:doGetUserLicenceDateRequest"/>
<output message="typens:doGetUserLicenceDateResponse"/>
</operation>
<operation name="doMyBillingItem">
<input message="typens:doMyBillingItemRequest"/>
<output message="typens:doMyBillingItemResponse"/>
</operation>
<operation name="doSetUserLicenceDate">
<input message="typens:doSetUserLicenceDateRequest"/>
<output message="typens:doSetUserLicenceDateResponse"/>
</operation>
<operation name="doBidItem">
<input message="typens:doBidItemRequest"/>
<output message="typens:doBidItemResponse"/>
</operation>
<operation name="doCancelBidItem">
<input message="typens:doCancelBidItemRequest"/>
<output message="typens:doCancelBidItemResponse"/>
</operation>
<operation name="doChangePriceItem">
<input message="typens:doChangePriceItemRequest"/>
<output message="typens:doChangePriceItemResponse"/>
</operation>
<operation name="doFinishItem">
<input message="typens:doFinishItemRequest"/>
<output message="typens:doFinishItemResponse"/>
</operation>
<operation name="doRequestCancelBid">
<input message="typens:doRequestCancelBidRequest"/>
<output message="typens:doRequestCancelBidResponse"/>
</operation>
<operation name="doGetCatsDataCount">
<input message="typens:doGetCatsDataCountRequest"/>
<output message="typens:doGetCatsDataCountResponse"/>
</operation>
<operation name="doMyFeedback2Limit">
<input message="typens:doMyFeedback2LimitRequest"/>
<output message="typens:doMyFeedback2LimitResponse"/>
</operation>
<operation name="doGetCountries">
<input message="typens:doGetCountriesRequest"/>
<output message="typens:doGetCountriesResponse"/>
</operation>
<operation name="doGetServiceTemplates">
<input message="typens:doGetServiceTemplatesRequest"/>
<output message="typens:doGetServiceTemplatesResponse"/>
</operation>
<operation name="doGetSellFormAttribs">
<input message="typens:doGetSellFormAttribsRequest"/>
<output message="typens:doGetSellFormAttribsResponse"/>
</operation>
<operation name="doFeedbackMany">
<input message="typens:doFeedbackManyRequest"/>
<output message="typens:doFeedbackManyResponse"/>
</operation>
<operation name="doShowItemInfoExt">
<input message="typens:doShowItemInfoExtRequest"/>
<output message="typens:doShowItemInfoExtResponse"/>
</operation>
<operation name="doGetWaitingFeedbacksCount">
<input message="typens:doGetWaitingFeedbacksCountRequest"/>
<output message="typens:doGetWaitingFeedbacksCountResponse"/>
</operation>
<operation name="doGetWaitingFeedbacks">
<input message="typens:doGetWaitingFeedbacksRequest"/>
<output message="typens:doGetWaitingFeedbacksResponse"/>
</operation>
<operation name="doGetBlackListUsers">
<input message="typens:doGetBlackListUsersRequest"/>
<output message="typens:doGetBlackListUsersResponse"/>
</operation>
<operation name="doRemoveFromBlackList">
<input message="typens:doRemoveFromBlackListRequest"/>
<output message="typens:doRemoveFromBlackListResponse"/>
</operation>
<operation name="doGetServiceInfoCategories">
<input message="typens:doGetServiceInfoCategoriesRequest"/>
<output message="typens:doGetServiceInfoCategoriesResponse"/>
</operation>
<operation name="doGetServiceInfo">
<input message="typens:doGetServiceInfoRequest"/>
<output message="typens:doGetServiceInfoResponse"/>
</operation>
<operation name="doGetStatesInfo">
<input message="typens:doGetStatesInfoRequest"/>
<output message="typens:doGetStatesInfoResponse"/>
</operation>
<operation name="doGetShopCatsData">
<input message="typens:doGetShopCatsDataRequest"/>
<output message="typens:doGetShopCatsDataResponse"/>
</operation>
<operation name="doCheckExternalKey">
<input message="typens:doCheckExternalKeyRequest"/>
<output message="typens:doCheckExternalKeyResponse"/>
</operation>
<operation name="doSellSomeAgainInShop">
<input message="typens:doSellSomeAgainInShopRequest"/>
<output message="typens:doSellSomeAgainInShopResponse"/>
</operation>
<operation name="doGetSuperSellerStatus">
<input message="typens:doGetSuperSellerStatusRequest"/>
<output message="typens:doGetSuperSellerStatusResponse"/>
</operation>
<operation name="doGetMyData">
<input message="typens:doGetMyDataRequest"/>
<output message="typens:doGetMyDataResponse"/>
</operation>
<operation name="doInternalIStoreChange">
<input message="typens:doInternalIStoreChangeRequest"/>
<output message="typens:doInternalIStoreChangeResponse"/>
</operation>
<operation name="doGetFavouriteSellers">
<input message="typens:doGetFavouriteSellersRequest"/>
<output message="typens:doGetFavouriteSellersResponse"/>
</operation>
<operation name="doGetFavouriteCategories">
<input message="typens:doGetFavouriteCategoriesRequest"/>
<output message="typens:doGetFavouriteCategoriesResponse"/>
</operation>
<operation name="doGetItemsImages">
<input message="typens:doGetItemsImagesRequest"/>
<output message="typens:doGetItemsImagesResponse"/>
</operation>
<operation name="doGetSpecialItems">
<input message="typens:doGetSpecialItemsRequest"/>
<output message="typens:doGetSpecialItemsResponse"/>
</operation>
<operation name="doAddToBlackList">
<input message="typens:doAddToBlackListRequest"/>
<output message="typens:doAddToBlackListResponse"/>
</operation>
<operation name="doGetPostBuyData">
<input message="typens:doGetPostBuyDataRequest"/>
<output message="typens:doGetPostBuyDataResponse"/>
</operation>
<operation name="doCancelRefundForms">
<input message="typens:doCancelRefundFormsRequest"/>
<output message="typens:doCancelRefundFormsResponse"/>
</operation>
<operation name="doGetSessionHandleForWidget">
<input message="typens:doGetSessionHandleForWidgetRequest"/>
<output message="typens:doGetSessionHandleForWidgetResponse"/>
</operation>
<operation name="doCancelRefundWarnings">
<input message="typens:doCancelRefundWarningsRequest"/>
<output message="typens:doCancelRefundWarningsResponse"/>
</operation>
<operation name="doInternalSendMessage">
<input message="typens:doInternalSendMessageRequest"/>
<output message="typens:doInternalSendMessageResponse"/>
</operation>
<operation name="doGetRefundTransactions">
<input message="typens:doGetRefundTransactionsRequest"/>
<output message="typens:doGetRefundTransactionsResponse"/>
</operation>
<operation name="doSendReminderMessages">
<input message="typens:doSendReminderMessagesRequest"/>
<output message="typens:doSendReminderMessagesResponse"/>
</operation>
<operation name="doRemoveFromWatchList">
<input message="typens:doRemoveFromWatchListRequest"/>
<output message="typens:doRemoveFromWatchListResponse"/>
</operation>
<operation name="doSendRefundForms">
<input message="typens:doSendRefundFormsRequest"/>
<output message="typens:doSendRefundFormsResponse"/>
</operation>
<operation name="doGetRefundFormsStatuses">
<input message="typens:doGetRefundFormsStatusesRequest"/>
<output message="typens:doGetRefundFormsStatusesResponse"/>
</operation>
<operation name="doGetRefundReasons">
<input message="typens:doGetRefundReasonsRequest"/>
<output message="typens:doGetRefundReasonsResponse"/>
</operation>
<operation name="doGetMyIncomingPayments">
<input message="typens:doGetMyIncomingPaymentsRequest"/>
<output message="typens:doGetMyIncomingPaymentsResponse"/>
</operation>
<operation name="doGetMyPayments">
<input message="typens:doGetMyPaymentsRequest"/>
<output message="typens:doGetMyPaymentsResponse"/>
</operation>
<operation name="doGetMyPayouts">
<input message="typens:doGetMyPayoutsRequest"/>
<output message="typens:doGetMyPayoutsResponse"/>
</operation>
<operation name="doChangeQuantityItem">
<input message="typens:doChangeQuantityItemRequest"/>
<output message="typens:doChangeQuantityItemResponse"/>
</operation>
<operation name="doShowUserPage">
<input message="typens:doShowUserPageRequest"/>
<output message="typens:doShowUserPageResponse"/>
</operation>
<operation name="doSendEmailToUser">
<input message="typens:doSendEmailToUserRequest"/>
<output message="typens:doSendEmailToUserResponse"/>
</operation>
<operation name="doGetTransactionsIDs">
<input message="typens:doGetTransactionsIDsRequest"/>
<output message="typens:doGetTransactionsIDsResponse"/>
</operation>
<operation name="doGetPostBuyFormsData">
<input message="typens:doGetPostBuyFormsDataRequest"/>
<output message="typens:doGetPostBuyFormsDataResponse"/>
</operation>
<operation name="doGetMyIncomingPaymentsRefunds">
<input message="typens:doGetMyIncomingPaymentsRefundsRequest"/>
<output message="typens:doGetMyIncomingPaymentsRefundsResponse"/>
</operation>
<operation name="doGetMyPaymentsRefunds">
<input message="typens:doGetMyPaymentsRefundsRequest"/>
<output message="typens:doGetMyPaymentsRefundsResponse"/>
</operation>
<operation name="doGetMySellRating">
<input message="typens:doGetMySellRatingRequest"/>
<output message="typens:doGetMySellRatingResponse"/>
</operation>
<operation name="doGetSellRatingReasons">
<input message="typens:doGetSellRatingReasonsRequest"/>
<output message="typens:doGetSellRatingReasonsResponse"/>
</operation>
<operation name="doGetDeals">
<input message="typens:doGetDealsRequest"/>
<output message="typens:doGetDealsResponse"/>
</operation>
<operation name="doMakeDiscount">
<input message="typens:doMakeDiscountRequest"/>
<output message="typens:doMakeDiscountResponse"/>
</operation>
<operation name="doChangeItem">
<input message="typens:doChangeItemRequest"/>
<output message="typens:doChangeItemResponse"/>
</operation>
<operation name="doFinishItems">
<input message="typens:doFinishItemsRequest"/>
<output message="typens:doFinishItemsResponse"/>
</operation>
<operation name="doGetShipmentData">
<input message="typens:doGetShipmentDataRequest"/>
<output message="typens:doGetShipmentDataResponse"/>
</operation>
<operation name="doGetItemFields">
<input message="typens:doGetItemFieldsRequest"/>
<output message="typens:doGetItemFieldsResponse"/>
</operation>
<operation name="doFindProductByName">
<input message="typens:doFindProductByNameRequest"/>
<output message="typens:doFindProductByNameResponse"/>
</operation>
<operation name="doGetProductItems">
<input message="typens:doGetProductItemsRequest"/>
<output message="typens:doGetProductItemsResponse"/>
</operation>
<operation name="doFindProductByCode">
<input message="typens:doFindProductByCodeRequest"/>
<output message="typens:doFindProductByCodeResponse"/>
</operation>
<operation name="doRequestSurcharge">
<input message="typens:doRequestSurchargeRequest"/>
<output message="typens:doRequestSurchargeResponse"/>
</operation>
</portType>
<binding name="AllegroWebApiBinding" type="typens:AllegroWebApiPortType">
<soap:binding style="rpc" transport="http://schemas.xmlsoap.org/soap/http"/>
<operation name="doGetCatsData">
<soap:operation soapAction="#catsdata"/>
<input><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></input>
<output><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></output>
</operation>
<operation name="doLogin">
<soap:operation soapAction="#login"/>
<input><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></input>
<output><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></output>
</operation>
<operation name="doLoginEnc">
<soap:operation soapAction="#loginenc"/>
<input><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></input>
<output><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></output>
</operation>
<operation name="doNewAuction">
<soap:operation soapAction="#newauction"/>
<input><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></input>
<output><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></output>
</operation>
<operation name="doNewAuctionExt">
<soap:operation soapAction="#newauctionext"/>
<input><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></input>
<output><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></output>
</operation>
<operation name="doSellSomeAgain">
<soap:operation soapAction="#sellsomeagain"/>
<input><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></input>
<output><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></output>
</operation>
<operation name="doCheckNewAuction">
<soap:operation soapAction="#checkauction"/>
<input><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></input>
<output><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></output>
</operation>
<operation name="doCheckNewAuctionExt">
<soap:operation soapAction="#checkauctionext"/>
<input><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></input>
<output><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></output>
</operation>
<operation name="doAddDescToItems">
<soap:operation soapAction="#adddesc"/>
<input><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></input>
<output><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></output>
</operation>
<operation name="doCheckItemIdByFutureItemId">
<soap:operation soapAction="#checkitemidbyfuture"/>
<input><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></input>
<output><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></output>
</operation>
<operation name="doGetCatsDataLimit">
<soap:operation soapAction="#catsdatalimit"/>
<input><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></input>
<output><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></output>
</operation>
<operation name="doGetItemsInfo">
<soap:operation soapAction="#getitemsinfo"/>
<input><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></input>
<output><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></output>
</operation>
<operation name="doGetPaymentData">
<soap:operation soapAction="#paymentdata"/>
<input><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></input>
<output><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></output>
</operation>
<operation name="doGetSellFormFields">
<soap:operation soapAction="#sellformfields"/>
<input><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></input>
<output><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></output>
</operation>
<operation name="doGetSellFormFieldsExt">
<soap:operation soapAction="#sellformfieldsext"/>
<input><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></input>
<output><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></output>
</operation>
<operation name="doGetSitesFlagInfo">
<soap:operation soapAction="#sitesflaginfo"/>
<input><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></input>
<output><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></output>
</operation>
<operation name="doGetSitesInfo">
<soap:operation soapAction="#sitesinfo"/>
<input><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></input>
<output><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></output>
</operation>
<operation name="doGetSystemTime">
<soap:operation soapAction="#dogetsystemtime"/>
<input><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></input>
<output><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></output>
</operation>
<operation name="doGetUserID">
<soap:operation soapAction="#getuserid"/>
<input><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></input>
<output><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></output>
</operation>
<operation name="doGetUserItems">
<soap:operation soapAction="#getuseritems"/>
<input><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></input>
<output><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></output>
</operation>
<operation name="doGetUserLogin">
<soap:operation soapAction="#getuserlogin"/>
<input><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></input>
<output><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></output>
</operation>
<operation name="doQueryAllSysStatus">
<soap:operation soapAction="#queryallstatus"/>
<input><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></input>
<output><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></output>
</operation>
<operation name="doGetSellFormFieldsExtLimit">
<soap:operation soapAction="#sellformfieldsextlimit"/>
<input><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></input>
<output><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></output>
</operation>
<operation name="doGetSellFormFieldsLimit">
<soap:operation soapAction="#sellformfieldslimit"/>
<input><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></input>
<output><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></output>
</operation>
<operation name="doQuerySysStatus">
<soap:operation soapAction="#querystatus"/>
<input><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></input>
<output><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></output>
</operation>
<operation name="doShowCat">
<soap:operation soapAction="#showcat"/>
<input><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></input>
<output><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></output>
</operation>
<operation name="doShowItemInfo">
<soap:operation soapAction="#showiteminfo"/>
<input><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></input>
<output><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></output>
</operation>
<operation name="doShowUser">
<soap:operation soapAction="#showuser"/>
<input><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></input>
<output><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></output>
</operation>
<operation name="doVerifyItem">
<soap:operation soapAction="#verifyitem"/>
<input><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></input>
<output><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></output>
</operation>
<operation name="doAddWatchList">
<soap:operation soapAction="#addwatch"/>
<input><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></input>
<output><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></output>
</operation>
<operation name="doFeedback">
<soap:operation soapAction="#feedback"/>
<input><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></input>
<output><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></output>
</operation>
<operation name="doGetBidItem2">
<soap:operation soapAction="#getbiditem"/>
<input><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></input>
<output><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></output>
</operation>
<operation name="doGetFeedback">
<soap:operation soapAction="#getfeedback"/>
<input><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></input>
<output><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></output>
</operation>
<operation name="doGetSiteJournal">
<soap:operation soapAction="#getsitejournal"/>
<input><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></input>
<output><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></output>
</operation>
<operation name="doGetSiteJournalInfo">
<soap:operation soapAction="#getsitejournalinfo"/>
<input><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></input>
<output><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></output>
</operation>
<operation name="doMyAccount2">
<soap:operation soapAction="#myaccount"/>
<input><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></input>
<output><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></output>
</operation>
<operation name="doMyAccountItemsCount">
<soap:operation soapAction="#myaccountitemscount"/>
<input><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></input>
<output><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></output>
</operation>
<operation name="doMyBilling">
<soap:operation soapAction="#mybilling"/>
<input><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></input>
<output><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></output>
</operation>
<operation name="doMyContact">
<soap:operation soapAction="#mycontacts"/>
<input><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></input>
<output><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></output>
</operation>
<operation name="doMyFeedback2">
<soap:operation soapAction="#myfeedback"/>
<input><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></input>
<output><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></output>
</operation>
<operation name="doSearch">
<soap:operation soapAction="#search"/>
<input><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></input>
<output><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></output>
</operation>
<operation name="doGetAdminUserLicenceDate">
<soap:operation soapAction="#getadminuserlicdate"/>
<input><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></input>
<output><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></output>
</operation>
<operation name="doGetUserLicenceDate">
<soap:operation soapAction="#getuserlicdate"/>
<input><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></input>
<output><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></output>
</operation>
<operation name="doMyBillingItem">
<soap:operation soapAction="#billingitem"/>
<input><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></input>
<output><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></output>
</operation>
<operation name="doSetUserLicenceDate">
<soap:operation soapAction="#setuserlicdate"/>
<input><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></input>
<output><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></output>
</operation>
<operation name="doBidItem">
<soap:operation soapAction="#biditem"/>
<input><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></input>
<output><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></output>
</operation>
<operation name="doCancelBidItem">
<soap:operation soapAction="#cancelbiditem"/>
<input><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></input>
<output><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></output>
</operation>
<operation name="doChangePriceItem">
<soap:operation soapAction="#changeprice"/>
<input><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></input>
<output><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></output>
</operation>
<operation name="doFinishItem">
<soap:operation soapAction="#finishauction"/>
<input><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></input>
<output><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></output>
</operation>
<operation name="doRequestCancelBid">
<soap:operation soapAction="#requestcancelbid"/>
<input><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></input>
<output><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></output>
</operation>
<operation name="doGetCatsDataCount">
<soap:operation soapAction="#catsdatacount"/>
<input><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></input>
<output><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></output>
</operation>
<operation name="doMyFeedback2Limit">
<soap:operation soapAction="#myfeedbacklimit"/>
<input><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></input>
<output><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></output>
</operation>
<operation name="doGetCountries">
<soap:operation soapAction="#getcountry"/>
<input><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></input>
<output><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></output>
</operation>
<operation name="doGetServiceTemplates">
<soap:operation soapAction="#gettemplates"/>
<input><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></input>
<output><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></output>
</operation>
<operation name="doGetSellFormAttribs">
<soap:operation soapAction="#sellformattribs"/>
<input><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></input>
<output><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></output>
</operation>
<operation name="doFeedbackMany">
<soap:operation soapAction="#feedbackmany"/>
<input><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></input>
<output><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></output>
</operation>
<operation name="doShowItemInfoExt">
<soap:operation soapAction="#showiteminfoext"/>
<input><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></input>
<output><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></output>
</operation>
<operation name="doGetWaitingFeedbacksCount">
<soap:operation soapAction="#waitfeedcount"/>
<input><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></input>
<output><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></output>
</operation>
<operation name="doGetWaitingFeedbacks">
<soap:operation soapAction="#waitfeed"/>
<input><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></input>
<output><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></output>
</operation>
<operation name="doGetBlackListUsers">
<soap:operation soapAction="#getblacklist"/>
<input><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></input>
<output><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></output>
</operation>
<operation name="doRemoveFromBlackList">
<soap:operation soapAction="#removefromblacklist"/>
<input><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></input>
<output><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></output>
</operation>
<operation name="doGetServiceInfoCategories">
<soap:operation soapAction="#getannouncementcats"/>
<input><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></input>
<output><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></output>
</operation>
<operation name="doGetServiceInfo">
<soap:operation soapAction="#getannouncementitems"/>
<input><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></input>
<output><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></output>
</operation>
<operation name="doGetStatesInfo">
<soap:operation soapAction="#getstatesinfo"/>
<input><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></input>
<output><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></output>
</operation>
<operation name="doGetShopCatsData">
<soap:operation soapAction="#shopcatsdata"/>
<input><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></input>
<output><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></output>
</operation>
<operation name="doCheckExternalKey">
<soap:operation soapAction="#checkexternalkey"/>
<input><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></input>
<output><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></output>
</operation>
<operation name="doSellSomeAgainInShop">
<soap:operation soapAction="#sellshopagain"/>
<input><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></input>
<output><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></output>
</operation>
<operation name="doGetSuperSellerStatus">
<soap:operation soapAction="#getsupersellerstatus"/>
<input><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></input>
<output><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></output>
</operation>
<operation name="doGetMyData">
<soap:operation soapAction="#getmydata"/>
<input><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></input>
<output><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></output>
</operation>
<operation name="doInternalIStoreChange">
<soap:operation soapAction="#internalistorechange"/>
<input><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></input>
<output><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></output>
</operation>
<operation name="doGetFavouriteSellers">
<soap:operation soapAction="#dogetfavouritesellers"/>
<input><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></input>
<output><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></output>
</operation>
<operation name="doGetFavouriteCategories">
<soap:operation soapAction="#dogetfavouritecategories"/>
<input><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></input>
<output><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></output>
</operation>
<operation name="doGetItemsImages">
<soap:operation soapAction="#dogetitemsimages"/>
<input><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></input>
<output><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></output>
</operation>
<operation name="doGetSpecialItems">
<soap:operation soapAction="#dogetspecialitems"/>
<input><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></input>
<output><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></output>
</operation>
<operation name="doAddToBlackList">
<soap:operation soapAction="#doAddToBlackList"/>
<input><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></input>
<output><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></output>
</operation>
<operation name="doGetPostBuyData">
<soap:operation soapAction="#getpostbuydata"/>
<input><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></input>
<output><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></output>
</operation>
<operation name="doCancelRefundForms">
<soap:operation soapAction="#doCancelRefundForms"/>
<input><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></input>
<output><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></output>
</operation>
<operation name="doGetSessionHandleForWidget">
<soap:operation soapAction="#getsessionhandleforwidget"/>
<input><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></input>
<output><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></output>
</operation>
<operation name="doCancelRefundWarnings">
<soap:operation soapAction="#doCancelRefundWarnings"/>
<input><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></input>
<output><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></output>
</operation>
<operation name="doInternalSendMessage">
<soap:operation soapAction="#doInternalSendMessage"/>
<input><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></input>
<output><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></output>
</operation>
<operation name="doGetRefundTransactions">
<soap:operation soapAction="#doGetRefundTransactions"/>
<input><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></input>
<output><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></output>
</operation>
<operation name="doSendReminderMessages">
<soap:operation soapAction="#doSendReminderMessages"/>
<input><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></input>
<output><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></output>
</operation>
<operation name="doRemoveFromWatchList">
<soap:operation soapAction="#doRemoveFromWatchList"/>
<input><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></input>
<output><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></output>
</operation>
<operation name="doSendRefundForms">
<soap:operation soapAction="#doSendRefundForms"/>
<input><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></input>
<output><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></output>
</operation>
<operation name="doGetRefundFormsStatuses">
<soap:operation soapAction="#doGetRefundFormsStatuses"/>
<input><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></input>
<output><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></output>
</operation>
<operation name="doGetRefundReasons">
<soap:operation soapAction="#doGetRefundReasons"/>
<input><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></input>
<output><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></output>
</operation>
<operation name="doGetMyIncomingPayments">
<soap:operation soapAction="#getmyinpayments"/>
<input><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></input>
<output><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></output>
</operation>
<operation name="doGetMyPayments">
<soap:operation soapAction="#getmypayments"/>
<input><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></input>
<output><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></output>
</operation>
<operation name="doGetMyPayouts">
<soap:operation soapAction="#getmypayouts"/>
<input><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></input>
<output><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></output>
</operation>
<operation name="doChangeQuantityItem">
<soap:operation soapAction="#doChangeQuantityItem"/>
<input><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></input>
<output><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></output>
</operation>
<operation name="doShowUserPage">
<soap:operation soapAction="#showuserpage"/>
<input><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></input>
<output><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></output>
</operation>
<operation name="doSendEmailToUser">
<soap:operation soapAction="#sendemailtouser"/>
<input><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></input>
<output><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></output>
</operation>
<operation name="doGetTransactionsIDs">
<soap:operation soapAction="#gettransids"/>
<input><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></input>
<output><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></output>
</operation>
<operation name="doGetPostBuyFormsData">
<soap:operation soapAction="#getpostbuyforms"/>
<input><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></input>
<output><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></output>
</operation>
<operation name="doGetMyIncomingPaymentsRefunds">
<soap:operation soapAction="#getmyinpaymentsrefunds"/>
<input><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></input>
<output><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></output>
</operation>
<operation name="doGetMyPaymentsRefunds">
<soap:operation soapAction="#getmypaymentsrafunds"/>
<input><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></input>
<output><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></output>
</operation>
<operation name="doGetMySellRating">
<soap:operation soapAction="#getmysellrating"/>
<input><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></input>
<output><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></output>
</operation>
<operation name="doGetSellRatingReasons">
<soap:operation soapAction="#getsellratingreasons"/>
<input><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></input>
<output><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></output>
</operation>
<operation name="doGetDeals">
<soap:operation soapAction="#getdeals"/>
<input><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></input>
<output><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></output>
</operation>
<operation name="doMakeDiscount">
<soap:operation soapAction="#makediscount"/>
<input><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></input>
<output><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></output>
</operation>
<operation name="doChangeItem">
<soap:operation soapAction="#changeitem"/>
<input><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></input>
<output><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></output>
</operation>
<operation name="doFinishItems">
<soap:operation soapAction="#finishitems"/>
<input><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></input>
<output><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></output>
</operation>
<operation name="doGetShipmentData">
<soap:operation soapAction="#getshipmentdata"/>
<input><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></input>
<output><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></output>
</operation>
<operation name="doGetItemFields">
<soap:operation soapAction="#getitemfields"/>
<input><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></input>
<output><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></output>
</operation>
<operation name="doFindProductByName">
<soap:operation soapAction="#findproductbyname"/>
<input><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></input>
<output><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></output>
</operation>
<operation name="doGetProductItems">
<soap:operation soapAction="#getproductitems"/>
<input><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></input>
<output><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></output>
</operation>
<operation name="doFindProductByCode">
<soap:operation soapAction="#findproductbycode"/>
<input><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></input>
<output><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></output>
</operation>
<operation name="doRequestSurcharge">
<soap:operation soapAction="#requestsurcharge"/>
<input><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></input>
<output><soap:body use="encoded" namespace="urn:AllegroWebApi" encodingStyle="http://schemas.xmlsoap.org/soap/encoding/"/></output>
</operation>
</binding>
<service name="AllegroWebApiService">
<port name="AllegroWebApiPort" binding="typens:AllegroWebApiBinding">
<soap:address location="http://webapi.allegro.pl/uploader.php"/>
</port>
</service>
</definitions>
