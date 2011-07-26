/**
 * AllegroWebApiBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pl.net.yuri.magister.soap;

public class AllegroWebApiBindingStub extends org.apache.axis.client.Stub implements pl.net.yuri.magister.soap.AllegroWebApiPortType {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc[] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[108];
        _initOperationDesc1();
        _initOperationDesc2();
        _initOperationDesc3();
        _initOperationDesc4();
        _initOperationDesc5();
        _initOperationDesc6();
        _initOperationDesc7();
        _initOperationDesc8();
        _initOperationDesc9();
        _initOperationDesc10();
        _initOperationDesc11();
    }

    private static void _initOperationDesc1() {
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetCatsData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "country-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "local-version"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "webapi-key"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "cats-list"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfCats"), pl.net.yuri.magister.soap.CatInfoType[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ver-key"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ver-str"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doLogin");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "user-login"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "user-password"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "country-code"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "webapi-key"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "local-version"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-handle-part"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "user-id"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "server-time"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doLoginEnc");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "user-login"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "user-hash-password"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "country-code"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "webapi-key"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "local-version"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-handle-part"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "user-id"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "server-time"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doNewAuction");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "fields"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfFieldsValue"), pl.net.yuri.magister.soap.FieldsValue[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "private"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "local-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "item-id"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "item-info"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doNewAuctionExt");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "fields"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfFieldsValue"), pl.net.yuri.magister.soap.FieldsValue[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "private"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "local-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "item-id"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "item-info"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doSellSomeAgain");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sell-items-array"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfItemsID"), long[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sell-starting-time"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sell-auction-duration"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sell-options"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "items-sell-again"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfStructSellAgain"), pl.net.yuri.magister.soap.StructSellAgain[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "items-sell-failed"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfStructSellFailed"), pl.net.yuri.magister.soap.StructSellFailed[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "items-sell-not-found"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfItemsID"), long[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doCheckNewAuction");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "fields"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfFieldsValue"), pl.net.yuri.magister.soap.FieldsValue[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "item-price"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "item-price-desc"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doCheckNewAuctionExt");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "fields"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfFieldsValue"), pl.net.yuri.magister.soap.FieldsValue[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "item-price"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "item-price-desc"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doAddDescToItems");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "items-id-array"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfItemsID"), long[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "it-description"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "array-items-add-id"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfItemsID"), long[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "array-items-desc-to-long"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfItemsID"), long[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "array-items-not-found"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfItemsID"), long[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doCheckItemIdByFutureItemId");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "webapi-key"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "country-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "future-item-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        oper.setReturnClass(long.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "item-id"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[9] = oper;

    }

    private static void _initOperationDesc2() {
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetCatsDataLimit");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "country-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "local-version"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "webapi-key"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "offset"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "package-element"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "cats-list"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfCats"), pl.net.yuri.magister.soap.CatInfoType[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ver-key"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ver-str"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetItemsInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "items-id-array"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfItemsID"), long[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "get-desc"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "get-image-url"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "get-attribs"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "get-postage-options"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "get-company-info"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "array-item-list-info"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfStructItemInfoList"), pl.net.yuri.magister.soap.ItemInfoStruct[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "array-items-not-found"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfItemsID"), long[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "array-items-admin-killed"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfItemsID"), long[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetPaymentData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "country-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "webapi-key"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfBilling"));
        oper.setReturnClass(pl.net.yuri.magister.soap.BillingDataType[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "payment-list"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetSellFormFields");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "country-code"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "local-version"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "webapi-key"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sell-form-fields"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfSellForms"), pl.net.yuri.magister.soap.SellFormType[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ver-key"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ver-str"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetSellFormFieldsExt");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "country-code"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "local-version"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "webapi-key"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sell-form-fields"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfSellForms"), pl.net.yuri.magister.soap.SellFormType[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ver-key"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ver-str"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetSitesFlagInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "country-code"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "webapi-key"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sites-info-list"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfSitesFlagInfo"), pl.net.yuri.magister.soap.SiteFlagInfoType[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ver-key"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ver-str"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetSitesInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "country-code"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "webapi-key"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sites-info-list"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfSitesInfo"), pl.net.yuri.magister.soap.SiteInfoType[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ver-key"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ver-str"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[16] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetSystemTime");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "country-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "webapi-key"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        oper.setReturnClass(long.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "server-time"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[17] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetUserID");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "country-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "user-login"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "user-email"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "webapi-key"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "user-id"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[18] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetUserItems");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "user-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "webapi-key"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "country-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "offset"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "limit"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "user-item-list"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfUserItemList"), pl.net.yuri.magister.soap.UserItemList[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "user-item-count"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[19] = oper;

    }

    private static void _initOperationDesc3() {
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetUserLogin");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "country-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "user-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "webapi-key"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "user-login"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[20] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doQueryAllSysStatus");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "country-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "webapi-key"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfSysStatus"));
        oper.setReturnClass(pl.net.yuri.magister.soap.SysStatusType[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "sys-country-status"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[21] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetSellFormFieldsExtLimit");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "country-code"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "local-version"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "webapi-key"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "offset"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "package-element"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sell-form-fields"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfSellForms"), pl.net.yuri.magister.soap.SellFormType[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ver-key"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ver-str"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "form-fields-count"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[22] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetSellFormFieldsLimit");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "country-code"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "local-version"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "webapi-key"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "offset"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "package-element"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sell-form-fields"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfSellForms"), pl.net.yuri.magister.soap.SellFormType[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ver-key"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ver-str"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "form-fields-count"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[23] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doQuerySysStatus");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sysvar"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "country-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "webapi-key"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "info"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ver-key"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[24] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doShowCat");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "cat-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "cat-item-state"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "cat-item-option"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "cat-item-duration-option"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:AllegroWebApi", "DurationTimeInfo"), pl.net.yuri.magister.soap.DurationTimeInfo.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "cat-attrib-fields"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfFieldsValue"), pl.net.yuri.magister.soap.FieldsValue[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "cat-sort-options"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "cat-items-price"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:AllegroWebApi", "PriceCatInfo"), pl.net.yuri.magister.soap.PriceCatInfo.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "cat-items-offset"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "cat-items-limit"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "cat-order-fulfillment-time"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "cat-parent-array"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfCatInfoStruct"), pl.net.yuri.magister.soap.InfoCatList[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "cat-child-array"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfCatInfoStruct"), pl.net.yuri.magister.soap.InfoCatList[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "cat-sister-array"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfCatInfoStruct"), pl.net.yuri.magister.soap.InfoCatList[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "cat-items-count"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "cat-items-count-featured"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "cat-items-array"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfSearchResponse"), pl.net.yuri.magister.soap.SearchResponseType[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[25] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doShowItemInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "item-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "get-desc"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "get-image-url"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "get-attribs"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "get-postage-options"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "get-company-info"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "item-list-info"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:AllegroWebApi", "ItemInfo"), pl.net.yuri.magister.soap.ItemInfo.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "item-cat-path"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfItemCatList"), pl.net.yuri.magister.soap.ItemCatList[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "item-img-list"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfItemImageList"), pl.net.yuri.magister.soap.ItemImageList[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "item-attrib-list"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfAttribStruct"), pl.net.yuri.magister.soap.AttribStruct[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "item-postage-options"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfPostageStruct"), pl.net.yuri.magister.soap.PostageStruct[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "item-payment-options"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:AllegroWebApi", "ItemPaymentOptions"), pl.net.yuri.magister.soap.ItemPaymentOptions.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "item-company-info"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:AllegroWebApi", "CompanyInfoStruct"), pl.net.yuri.magister.soap.CompanyInfoStruct.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[26] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doShowUser");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "webapi-key"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "country-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "user-id"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "user-login"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "user-country"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "user-create-date"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "user-login-date"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "user-rating"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "user-is-new-user"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "user-not-activated"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "user-closed"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "user-blocked"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "user-terminated"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "user-has-page"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "user-is-sseller"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "user-is-eco"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "user-positive-feedback"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:AllegroWebApi", "ShowUserFeedbacks"), pl.net.yuri.magister.soap.ShowUserFeedbacks.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "user-negative-feedback"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:AllegroWebApi", "ShowUserFeedbacks"), pl.net.yuri.magister.soap.ShowUserFeedbacks.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "user-neutral-feedback"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:AllegroWebApi", "ShowUserFeedbacks"), pl.net.yuri.magister.soap.ShowUserFeedbacks.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "user-junior-status"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "user-has-shop"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "user-company-icon"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "user-sell-rating-count"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "user-sell-rating-average"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfSellRatingAverageStruct"), pl.net.yuri.magister.soap.SellRatingAverageStruct[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "user-is-allegro-standard"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "user-is-b2c-seller"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[27] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doVerifyItem");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "local-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "item-id"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "item-listed"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[28] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doAddWatchList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "items-id-array"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfItemsID"), long[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "array-items-add-id"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfItemsID"), long[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "array-items-not-found"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfItemsID"), long[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "array-items-admin-killed"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfItemsID"), long[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[29] = oper;

    }

    private static void _initOperationDesc4() {
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doFeedback");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "fe-item-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "fe-from-user-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "fe-to-user-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "fe-comment"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "fe-comment-type"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "fe-op"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "fe-rating"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfSellRatingEstimationStruct"), pl.net.yuri.magister.soap.SellRatingEstimationStruct[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "feedback-id"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[30] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetBidItem2");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "item-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfBidList2"));
        oper.setReturnClass(pl.net.yuri.magister.soap.BidListStruct2[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "biditem-list"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[31] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetFeedback");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "feedback-from"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "feedback-to"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "feedback-offset"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "feedback-kind-list"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "feedback-list"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfFeedbackList"), pl.net.yuri.magister.soap.FeedbackList[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "feedback-count"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[32] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetSiteJournal");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "starting-point"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "info-type"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:AllegroWebApi", "SiteJournalArray"));
        oper.setReturnClass(pl.net.yuri.magister.soap.SiteJournal[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "site-journal-array"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[33] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetSiteJournalInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "starting-point"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "info-type"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:AllegroWebApi", "SiteJournalInfo"));
        oper.setReturnClass(pl.net.yuri.magister.soap.SiteJournalInfo.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "site-journal-info"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[34] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doMyAccount2");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "account-type"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "offset"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "items-array"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfAuctionID"), int[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "limit"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfMyAccountList2"));
        oper.setReturnClass(pl.net.yuri.magister.soap.MyAccountStruct2[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "myaccount-list"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[35] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doMyAccountItemsCount");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "account-type"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "items-array"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfAuctionID"), int[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "myaccount-items-count"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[36] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doMyBilling");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "my-billing"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[37] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doMyContact");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "auction-id-list"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfAuctionID"), int[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "offset"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "desc"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfMyContactList"));
        oper.setReturnClass(pl.net.yuri.magister.soap.MyContactList[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "mycontact-list"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[38] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doMyFeedback2");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "feedback-type"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "offset"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "desc"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "items-array"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfAuctionID"), int[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfMyFeedbackList2"));
        oper.setReturnClass(pl.net.yuri.magister.soap.MyFeedbackListStruct2[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "myfeedback-list"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[39] = oper;

    }

    private static void _initOperationDesc5() {
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doSearch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "search-query"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:AllegroWebApi", "SearchOptType"), pl.net.yuri.magister.soap.SearchOptType.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "search-count"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "search-count-featured"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "search-array"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfSearchResponse"), pl.net.yuri.magister.soap.SearchResponseType[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "search-excluded-words"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfExcludedWords"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[40] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetAdminUserLicenceDate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "admin-session-handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "user-lic-login"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        oper.setReturnClass(float.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "get-date-value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[41] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetUserLicenceDate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        oper.setReturnClass(float.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "get-date-value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[42] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doMyBillingItem");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "item-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "option"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "entry-fees"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:AllegroWebApi", "ItemBillingList"), pl.net.yuri.magister.soap.ItemBilling[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ending-fees"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:AllegroWebApi", "ItemBillingList"), pl.net.yuri.magister.soap.ItemBilling[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[43] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doSetUserLicenceDate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "admin-session-handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "user-lic-login"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "user-lic-country"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "user-lic-date"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"), float.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "set-date-value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[44] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doBidItem");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "bid-it-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "bid-user-price"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"), float.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "bid-quantity"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "bid-buy-now"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "bid-price"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[45] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doCancelBidItem");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "cancel-item-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "cancel-bids-array"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfCancelBidsID"), int[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "cancel-bids-reason"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "cancel-add-to-black-list"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "cancel-bid-value"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "cancelled-bids"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfCancelBidsID"), int[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "not-cancelled-bids"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfCancelBidsID"), int[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[46] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doChangePriceItem");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "item-id"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "new-starting-price"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"), float.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "new-reserve-price"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"), float.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "new-buy-now-price"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"), float.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "item-info"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[47] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doFinishItem");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "finish-item-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "finish-cancel-all-bids"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "finish-cancel-reason"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "finish-value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[48] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doRequestCancelBid");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "request-item-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "request-cancel-reason"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "request-value"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[49] = oper;

    }

    private static void _initOperationDesc6() {
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetCatsDataCount");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "country-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "local-version"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "webapi-key"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "cats-count"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ver-key"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ver-str"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[50] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doMyFeedback2Limit");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "feedback-type"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "offset"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "desc"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "items-array"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfAuctionID"), int[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "package-element"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfMyFeedbackList2"));
        oper.setReturnClass(pl.net.yuri.magister.soap.MyFeedbackListStruct2[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "myfeedback-list"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[51] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetCountries");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "country-code"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "webapi-key"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfCountries"));
        oper.setReturnClass(pl.net.yuri.magister.soap.CountryInfoType[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "country-array"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[52] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetServiceTemplates");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "country-code"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "webapi-key"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfTemplates"));
        oper.setReturnClass(pl.net.yuri.magister.soap.TemplateInfoType[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "templates-array"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[53] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetSellFormAttribs");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "country-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "webapi-key"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "local-version"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "cat-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sell-form-fields"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfSellForms"), pl.net.yuri.magister.soap.SellFormType[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ver-key"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ver-str"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[54] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doFeedbackMany");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "feedbacks-list"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfFeedbackManyStruct"), pl.net.yuri.magister.soap.FeedbackManyStruct[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfFeedbacksResult"));
        oper.setReturnClass(pl.net.yuri.magister.soap.FeedbackResultStruct[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "fe-results"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[55] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doShowItemInfoExt");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "item-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "get-desc"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "get-image-url"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "get-attribs"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "get-postage-options"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "get-company-info"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "item-list-info-ext"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:AllegroWebApi", "ItemInfoExt"), pl.net.yuri.magister.soap.ItemInfoExt.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "item-cat-path"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfItemCatList"), pl.net.yuri.magister.soap.ItemCatList[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "item-img-list"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfItemImageList"), pl.net.yuri.magister.soap.ItemImageList[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "item-attrib-list"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfAttribStruct"), pl.net.yuri.magister.soap.AttribStruct[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "item-postage-options"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfPostageStruct"), pl.net.yuri.magister.soap.PostageStruct[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "item-payment-options"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:AllegroWebApi", "ItemPaymentOptions"), pl.net.yuri.magister.soap.ItemPaymentOptions.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "item-company-info"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:AllegroWebApi", "CompanyInfoStruct"), pl.net.yuri.magister.soap.CompanyInfoStruct.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[56] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetWaitingFeedbacksCount");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "feedback-count"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[57] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetWaitingFeedbacks");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "offset"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "package-size"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfWaitFeedbackStruct"));
        oper.setReturnClass(pl.net.yuri.magister.soap.WaitFeedbackStruct[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "fe-wait-list"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[58] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetBlackListUsers");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfBlackListStruct"));
        oper.setReturnClass(pl.net.yuri.magister.soap.BlackListStruct[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "black-list-users"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[59] = oper;

    }

    private static void _initOperationDesc7() {
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doRemoveFromBlackList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "users-id-array"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfUsersID"), long[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfBlackListResStruct"));
        oper.setReturnClass(pl.net.yuri.magister.soap.BlackListResStruct[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "black-list-result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[60] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetServiceInfoCategories");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "country-code"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "webapi-key"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfServiceInfoCatStruct"));
        oper.setReturnClass(pl.net.yuri.magister.soap.ServiceInfoCatStruct[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "service-info-cats-list"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[61] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetServiceInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "country-code"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "an-cat-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "an-it-date"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "an-it-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "webapi-key"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfServiceInfoStruct"));
        oper.setReturnClass(pl.net.yuri.magister.soap.ServiceInfoStruct[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "service-info-items-list"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[62] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetStatesInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "country-code"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "webapi-key"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfStateInfoStruct"));
        oper.setReturnClass(pl.net.yuri.magister.soap.StateInfoStruct[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "states-info-array"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[63] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetShopCatsData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfCats"));
        oper.setReturnClass(pl.net.yuri.magister.soap.CatInfoType[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "shop-cats-list"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[64] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doCheckExternalKey");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "webapi-key"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "user-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "item-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "hash-key"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[65] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doSellSomeAgainInShop");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sell-items-array"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfItemsID"), long[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sell-starting-time"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sell-shop-duration"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sell-shop-options"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sell-prolong-options"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sell-shop-category"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "items-sell-again"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfStructSellAgain"), pl.net.yuri.magister.soap.StructSellAgain[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "items-sell-failed"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfStructSellFailed"), pl.net.yuri.magister.soap.StructSellFailed[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "items-sell-not-found"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfItemsID"), long[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[66] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetSuperSellerStatus");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "webapi-key"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "user-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "user-ss-status"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[67] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetMyData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "user-data"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:AllegroWebApi", "UserDataStruct"), pl.net.yuri.magister.soap.UserDataStruct.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "invoice-data"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:AllegroWebApi", "InvoiceDataStruct"), pl.net.yuri.magister.soap.InvoiceDataStruct.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "company-extra-data"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:AllegroWebApi", "CompanyExtraDataStruct"), pl.net.yuri.magister.soap.CompanyExtraDataStruct.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "company-second-address"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:AllegroWebApi", "CompanySecondAddressStruct"), pl.net.yuri.magister.soap.CompanySecondAddressStruct.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "pharmacy-data"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:AllegroWebApi", "PharmacyDataStruct"), pl.net.yuri.magister.soap.PharmacyDataStruct.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "alcohol-data"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:AllegroWebApi", "AlcoholDataStruct"), pl.net.yuri.magister.soap.AlcoholDataStruct.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[68] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doInternalIStoreChange");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "webapi-key"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "user-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "istore-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "action-type"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "action-date"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "valid-date"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[69] = oper;

    }

    private static void _initOperationDesc8() {
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetFavouriteSellers");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfFavouritesSellers"));
        oper.setReturnClass(pl.net.yuri.magister.soap.FavouritesSellersStruct[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "s-favourite-sellers-list"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[70] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetFavouriteCategories");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfFavouritesCategories"));
        oper.setReturnClass(pl.net.yuri.magister.soap.FavouritesCategoriesStruct[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "s-favourite-categories-list"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[71] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetItemsImages");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "items-array"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfItemGetImage"), pl.net.yuri.magister.soap.ItemGetImage[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "image-type"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfItemImagesStruct"));
        oper.setReturnClass(pl.net.yuri.magister.soap.ItemImagesStruct[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "get_items_images_result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[72] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetSpecialItems");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "special-type"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "special-group"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "offset"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "order-fulfillment-time"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfSpecialAuction"));
        oper.setReturnClass(pl.net.yuri.magister.soap.SpecialAuctionStruct[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "s-special-list"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[73] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doAddToBlackList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "users-black-list-array"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfUserBlackListStruct"), pl.net.yuri.magister.soap.UserBlackListStruct[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfUserBlackListAddResultStruct"));
        oper.setReturnClass(pl.net.yuri.magister.soap.UserBlackListAddResultStruct[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "user-black-list-results-arr"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[74] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetPostBuyData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "items-array"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfAuctionID"), int[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfItemsPostBuyData"));
        oper.setReturnClass(pl.net.yuri.magister.soap.ItemPostBuyDataStruct[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "items-post-buy-data"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[75] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doCancelRefundForms");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "refund-cancel-data-arr"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfCancelRefundDataStruct"), pl.net.yuri.magister.soap.CancelRefundDataStruct[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfCancelRefundFormResultStruct"));
        oper.setReturnClass(pl.net.yuri.magister.soap.CancelRefundFormResultStruct[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "cancel-refund-forms-results-arr"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[76] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetSessionHandleForWidget");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "webapi-key"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "country-code"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-handle"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "server-time"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[77] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doCancelRefundWarnings");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "cancel-refund-warnings-data-arr"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfCancelRefundWarningStruct"), pl.net.yuri.magister.soap.CancelRefundWarningStruct[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfCancelRefundWarningResultStruct"));
        oper.setReturnClass(pl.net.yuri.magister.soap.CancelRefundWarningResultStruct[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "cancel-refund-warnings-results-arr"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[78] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doInternalSendMessage");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "user-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "mail_template_id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "array-of-additional-data"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfAdditionalData"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[79] = oper;

    }

    private static void _initOperationDesc9() {
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetRefundTransactions");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "offset"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "limit"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "refund-forms-count"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "refund-forms-list"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfRefundFormDataStruct"), pl.net.yuri.magister.soap.RefundFormDataStruct[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[80] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doSendReminderMessages");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "send-reminder-messages-data-arr"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfSendReminderMessageStruct"), pl.net.yuri.magister.soap.SendReminderMessageStruct[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfSendReminderMessageResultStruct"));
        oper.setReturnClass(pl.net.yuri.magister.soap.SendReminderMessageResultStruct[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "send-reminder-messages-results-arr"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[81] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doRemoveFromWatchList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "items-id-array"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfItemsID"), long[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfItemRemoveWatchStruct"));
        oper.setReturnClass(pl.net.yuri.magister.soap.ItemRemoveWatchStruct[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "watch-list-result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[82] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doSendRefundForms");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "send-refund-forms-data-arr"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfSendRefundFormStruct"), pl.net.yuri.magister.soap.SendRefundFormStruct[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfSendRefundFormResultStruct"));
        oper.setReturnClass(pl.net.yuri.magister.soap.SendRefundFormResultStruct[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "send-refund-forms-results-arr"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[83] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetRefundFormsStatuses");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "refund-forms-statuses-data-arr"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfRefundFormStatusStruct"), pl.net.yuri.magister.soap.RefundFormStatusStruct[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfRefundFormStatusResultStruct"));
        oper.setReturnClass(pl.net.yuri.magister.soap.RefundFormStatusResultStruct[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "refund-forms-statuses-results-arr"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[84] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetRefundReasons");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "webapi-key"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "country-code"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfRefundReasonStruct"));
        oper.setReturnClass(pl.net.yuri.magister.soap.RefundReasonStruct[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "refund-reasons-arr"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[85] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetMyIncomingPayments");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "buyer-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "item-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "trans-recv-date-from"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "trans-recv-date-to"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "trans-page-limit"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "trans-offset"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfUserIncomingPaymentStruct"));
        oper.setReturnClass(pl.net.yuri.magister.soap.UserIncomingPaymentStruct[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "pay-trans-income"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[86] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetMyPayments");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "seller-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "item-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "trans-create-date-from"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "trans-create-date-to"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "trans-page-limit"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "trans-offset"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfUserPaymentStruct"));
        oper.setReturnClass(pl.net.yuri.magister.soap.UserPaymentStruct[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "pay-trans-payment"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[87] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetMyPayouts");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "trans-create-date-from"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "trans-create-date-to"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "trans-page-limit"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "trans-offset"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfUserPayoutStruct"));
        oper.setReturnClass(pl.net.yuri.magister.soap.UserPayoutStruct[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "pay-trans-payout"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[88] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doChangeQuantityItem");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "item-id"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "new-item-quantity"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "item-info"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "item-quantity-left"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "item-quantity-sold"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[89] = oper;

    }

    private static void _initOperationDesc10() {
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doShowUserPage");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "webapi-key"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "country-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "user-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "user-page-content"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "user-page-pharmacy-permit"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "user-page-alcohol-permit"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[90] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doSendEmailToUser");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "mail-to-user-item-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "mail-to-user-receiver-id"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "mail-to-user-subject-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "mail-to-user-option"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "mail-to-user-message"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "mail-to-user-result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[91] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetTransactionsIDs");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "items-id-array"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfItemsID"), long[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "user-role"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfTransactionsID"));
        oper.setReturnClass(long[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "transactions-ids-array"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[92] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetPostBuyFormsData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "transactions-ids-array"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfTransactionsID"), long[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfPostBuyFormDataStruct"));
        oper.setReturnClass(pl.net.yuri.magister.soap.PostBuyFormDataStruct[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "post-buy-form-data"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[93] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetMyIncomingPaymentsRefunds");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "buyer-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "item-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "limit"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "offset"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfUserIncomingPaymentRefundsStruct"));
        oper.setReturnClass(pl.net.yuri.magister.soap.UserIncomingPaymentRefundsStruct[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "pay-trans-income-refunds"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[94] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetMyPaymentsRefunds");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "seller-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "item-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "limit"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "offset"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfUserPaymentRefundsStruct"));
        oper.setReturnClass(pl.net.yuri.magister.soap.UserPaymentRefundsStruct[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "pay-trans-payment-refunds"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[95] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetMySellRating");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sell-rating-total-count"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sell-rating-average"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfSellRatingAverageStruct"), pl.net.yuri.magister.soap.SellRatingAverageStruct[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sell-rating-details"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfSellRatingDetailStruct"), pl.net.yuri.magister.soap.SellRatingDetailStruct[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sell-rating-stats-per-month"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfSellRatingAveragePerMonth"), pl.net.yuri.magister.soap.SellRatingAveragePerMonthStruct[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[96] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetSellRatingReasons");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "webapi-key"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "country-code"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfSellRatingInfoStruct"));
        oper.setReturnClass(pl.net.yuri.magister.soap.SellRatingInfoStruct[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "sell-rating-info"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[97] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetDeals");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "item-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "buyer-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfDealsStruct"));
        oper.setReturnClass(pl.net.yuri.magister.soap.DealsStruct[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "deals-list"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[98] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doMakeDiscount");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "deal-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "discount-amount"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"), float.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "discount-percentage"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"), float.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        oper.setReturnClass(float.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "deal-amount-discounted"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[99] = oper;

    }

    private static void _initOperationDesc11() {
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doChangeItem");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "item-id"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "item-fields"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfFieldsValue"), pl.net.yuri.magister.soap.FieldsValue[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "item-images-options"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfItemImageOptionsStruct"), pl.net.yuri.magister.soap.ItemImageOptionsStruct[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "item-country-surcharge-value"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"), float.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "item-country-surcharge-currency"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "seller-country-surcharge-value"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"), float.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "seller-country-surcharge-currency"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[100] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doFinishItems");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "finish-items-list"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfFinishItemsStruct"), pl.net.yuri.magister.soap.FinishItemsStruct[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "finish-items-succeed"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfFinishSuccessStruct"), long[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "finish-items-failed"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfFinishFailureStruct"), pl.net.yuri.magister.soap.FinishFailureStruct[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[101] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetShipmentData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "country-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "webapi-key"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "shipment-data-list"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfShipmentDataStruct"), pl.net.yuri.magister.soap.ShipmentDataStruct[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "local-version"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[102] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetItemFields");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "item-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfFieldsValue"));
        oper.setReturnClass(pl.net.yuri.magister.soap.FieldsValue[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "item-fields"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[103] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doFindProductByName");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "product-name"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "category-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfProductStruct"));
        oper.setReturnClass(pl.net.yuri.magister.soap.ProductStruct[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "products-info"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[104] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doGetProductItems");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "product-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "category-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "page-size"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "page-number"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "product-items-count"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "product-items-ids"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfProductItemsIds"), long[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[105] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doFindProductByCode");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "product-code"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:AllegroWebApi", "ProductStruct"));
        oper.setReturnClass(pl.net.yuri.magister.soap.ProductStruct.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "product-info"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[106] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doRequestSurcharge");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "session-handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "transaction-id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "surcharge-value"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"), float.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "surcharge-message-to-buyer"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "surcharge-result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[107] = oper;

    }

    public AllegroWebApiBindingStub() throws org.apache.axis.AxisFault {
        this(null);
    }

    public AllegroWebApiBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        this(service);
        super.cachedEndpoint = endpointURL;
    }

    public AllegroWebApiBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service) super.service).setTypeMappingVersion("1.1");
        java.lang.Class cls;
        javax.xml.namespace.QName qName;
        javax.xml.namespace.QName qName2;
        java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
        java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
        java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
        java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
        java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
        java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
        java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
        java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
        java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
        java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
        addBindings0();
        addBindings1();
    }

    private void addBindings0() {
        java.lang.Class cls;
        javax.xml.namespace.QName qName;
        javax.xml.namespace.QName qName2;
        java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
        java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
        java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
        java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
        java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
        java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
        java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
        java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
        java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
        java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "AlcoholDataStruct");
        cachedSerQNames.add(qName);
        cls = pl.net.yuri.magister.soap.AlcoholDataStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfAdditionalData");
        cachedSerQNames.add(qName);
        cls = java.lang.String[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfAttribStruct");
        cachedSerQNames.add(qName);
        cls = pl.net.yuri.magister.soap.AttribStruct[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "AttribStruct");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfAttribValues");
        cachedSerQNames.add(qName);
        cls = java.lang.String[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfAuctionID");
        cachedSerQNames.add(qName);
        cls = int[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfBankAccounts");
        cachedSerQNames.add(qName);
        cls = java.lang.String[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfBidList2");
        cachedSerQNames.add(qName);
        cls = pl.net.yuri.magister.soap.BidListStruct2[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "BidListStruct2");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfBilling");
        cachedSerQNames.add(qName);
        cls = pl.net.yuri.magister.soap.BillingDataType[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "BillingDataType");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfBlackListResStruct");
        cachedSerQNames.add(qName);
        cls = pl.net.yuri.magister.soap.BlackListResStruct[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "BlackListResStruct");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfBlackListStruct");
        cachedSerQNames.add(qName);
        cls = pl.net.yuri.magister.soap.BlackListStruct[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "BlackListStruct");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfCancelBidsID");
        cachedSerQNames.add(qName);
        cls = int[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfCancelRefundDataStruct");
        cachedSerQNames.add(qName);
        cls = pl.net.yuri.magister.soap.CancelRefundDataStruct[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "CancelRefundDataStruct");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfCancelRefundFormResultStruct");
        cachedSerQNames.add(qName);
        cls = pl.net.yuri.magister.soap.CancelRefundFormResultStruct[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "CancelRefundFormResultStruct");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfCancelRefundWarningResultStruct");
        cachedSerQNames.add(qName);
        cls = pl.net.yuri.magister.soap.CancelRefundWarningResultStruct[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "CancelRefundWarningResultStruct");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfCancelRefundWarningStruct");
        cachedSerQNames.add(qName);
        cls = pl.net.yuri.magister.soap.CancelRefundWarningStruct[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "CancelRefundWarningStruct");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfCatInfoStruct");
        cachedSerQNames.add(qName);
        cls = pl.net.yuri.magister.soap.InfoCatList[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "InfoCatList");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfCats");
        cachedSerQNames.add(qName);
        cls = pl.net.yuri.magister.soap.CatInfoType[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "CatInfoType");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfCountries");
        cachedSerQNames.add(qName);
        cls = pl.net.yuri.magister.soap.CountryInfoType[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "CountryInfoType");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfDealsStruct");
        cachedSerQNames.add(qName);
        cls = pl.net.yuri.magister.soap.DealsStruct[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "DealsStruct");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfExcludedWords");
        cachedSerQNames.add(qName);
        cls = java.lang.String[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfFavouritesCategories");
        cachedSerQNames.add(qName);
        cls = pl.net.yuri.magister.soap.FavouritesCategoriesStruct[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "FavouritesCategoriesStruct");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfFavouritesSellers");
        cachedSerQNames.add(qName);
        cls = pl.net.yuri.magister.soap.FavouritesSellersStruct[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "FavouritesSellersStruct");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfFeedbackList");
        cachedSerQNames.add(qName);
        cls = pl.net.yuri.magister.soap.FeedbackList[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "FeedbackList");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfFeedbackManyStruct");
        cachedSerQNames.add(qName);
        cls = pl.net.yuri.magister.soap.FeedbackManyStruct[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "FeedbackManyStruct");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfFeedbacksResult");
        cachedSerQNames.add(qName);
        cls = pl.net.yuri.magister.soap.FeedbackResultStruct[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "FeedbackResultStruct");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfFieldsValue");
        cachedSerQNames.add(qName);
        cls = pl.net.yuri.magister.soap.FieldsValue[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "FieldsValue");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfFinishFailureStruct");
        cachedSerQNames.add(qName);
        cls = pl.net.yuri.magister.soap.FinishFailureStruct[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "FinishFailureStruct");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfFinishItemsStruct");
        cachedSerQNames.add(qName);
        cls = pl.net.yuri.magister.soap.FinishItemsStruct[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "FinishItemsStruct");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfFinishSuccessStruct");
        cachedSerQNames.add(qName);
        cls = long[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfItemCatList");
        cachedSerQNames.add(qName);
        cls = pl.net.yuri.magister.soap.ItemCatList[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ItemCatList");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfItemGetImage");
        cachedSerQNames.add(qName);
        cls = pl.net.yuri.magister.soap.ItemGetImage[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ItemGetImage");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfItemImageList");
        cachedSerQNames.add(qName);
        cls = pl.net.yuri.magister.soap.ItemImageList[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ItemImageList");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfItemImageOptionsStruct");
        cachedSerQNames.add(qName);
        cls = pl.net.yuri.magister.soap.ItemImageOptionsStruct[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ItemImageOptionsStruct");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfItemImagesStruct");
        cachedSerQNames.add(qName);
        cls = pl.net.yuri.magister.soap.ItemImagesStruct[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ItemImagesStruct");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfItemRemoveWatchStruct");
        cachedSerQNames.add(qName);
        cls = pl.net.yuri.magister.soap.ItemRemoveWatchStruct[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ItemRemoveWatchStruct");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfItemsID");
        cachedSerQNames.add(qName);
        cls = long[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfItemsPostBuyData");
        cachedSerQNames.add(qName);
        cls = pl.net.yuri.magister.soap.ItemPostBuyDataStruct[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ItemPostBuyDataStruct");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfMyAccountList2");
        cachedSerQNames.add(qName);
        cls = pl.net.yuri.magister.soap.MyAccountStruct2[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "MyAccountStruct2");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfMyContactList");
        cachedSerQNames.add(qName);
        cls = pl.net.yuri.magister.soap.MyContactList[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "MyContactList");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfMyFeedbackList2");
        cachedSerQNames.add(qName);
        cls = pl.net.yuri.magister.soap.MyFeedbackListStruct2[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "MyFeedbackListStruct2");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfPaymentDetailsStruct");
        cachedSerQNames.add(qName);
        cls = pl.net.yuri.magister.soap.PaymentDetailsStruct[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "PaymentDetailsStruct");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfPostageStruct");
        cachedSerQNames.add(qName);
        cls = pl.net.yuri.magister.soap.PostageStruct[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "PostageStruct");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfPostBuyFormDataStruct");
        cachedSerQNames.add(qName);
        cls = pl.net.yuri.magister.soap.PostBuyFormDataStruct[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "PostBuyFormDataStruct");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfPostBuyFormItemStruct");
        cachedSerQNames.add(qName);
        cls = pl.net.yuri.magister.soap.PostBuyFormItemStruct[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "PostBuyFormItemStruct");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfPostBuyFormShipmentTrackingStruct");
        cachedSerQNames.add(qName);
        cls = pl.net.yuri.magister.soap.PostBuyFormShipmentTrackingStruct[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "PostBuyFormShipmentTrackingStruct");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfPostBuyFormSurcharges");
        cachedSerQNames.add(qName);
        cls = long[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfProductImagesList");
        cachedSerQNames.add(qName);
        cls = java.lang.String[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfProductItemsIds");
        cachedSerQNames.add(qName);
        cls = long[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfProductParametersStruct");
        cachedSerQNames.add(qName);
        cls = pl.net.yuri.magister.soap.ProductParametersStruct[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ProductParametersStruct");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfProductParameterValues");
        cachedSerQNames.add(qName);
        cls = java.lang.String[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfProductStruct");
        cachedSerQNames.add(qName);
        cls = pl.net.yuri.magister.soap.ProductStruct[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ProductStruct");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfRefundFormDataStruct");
        cachedSerQNames.add(qName);
        cls = pl.net.yuri.magister.soap.RefundFormDataStruct[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "RefundFormDataStruct");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfRefundFormStatusResultStruct");
        cachedSerQNames.add(qName);
        cls = pl.net.yuri.magister.soap.RefundFormStatusResultStruct[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "RefundFormStatusResultStruct");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfRefundFormStatusStruct");
        cachedSerQNames.add(qName);
        cls = pl.net.yuri.magister.soap.RefundFormStatusStruct[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "RefundFormStatusStruct");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfRefundReasonStruct");
        cachedSerQNames.add(qName);
        cls = pl.net.yuri.magister.soap.RefundReasonStruct[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "RefundReasonStruct");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfSearchResponse");
        cachedSerQNames.add(qName);
        cls = pl.net.yuri.magister.soap.SearchResponseType[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "SearchResponseType");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfSellForms");
        cachedSerQNames.add(qName);
        cls = pl.net.yuri.magister.soap.SellFormType[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "SellFormType");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfSellRatingAveragePerMonth");
        cachedSerQNames.add(qName);
        cls = pl.net.yuri.magister.soap.SellRatingAveragePerMonthStruct[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "SellRatingAveragePerMonthStruct");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfSellRatingAverageStruct");
        cachedSerQNames.add(qName);
        cls = pl.net.yuri.magister.soap.SellRatingAverageStruct[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "SellRatingAverageStruct");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfSellRatingDetailStruct");
        cachedSerQNames.add(qName);
        cls = pl.net.yuri.magister.soap.SellRatingDetailStruct[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "SellRatingDetailStruct");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfSellRatingEstimationStruct");
        cachedSerQNames.add(qName);
        cls = pl.net.yuri.magister.soap.SellRatingEstimationStruct[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "SellRatingEstimationStruct");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfSellRatingInfoStruct");
        cachedSerQNames.add(qName);
        cls = pl.net.yuri.magister.soap.SellRatingInfoStruct[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "SellRatingInfoStruct");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfSellRatingReasonStruct");
        cachedSerQNames.add(qName);
        cls = pl.net.yuri.magister.soap.SellRatingReasonStruct[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "SellRatingReasonStruct");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfSellRatingReasonSumStruct");
        cachedSerQNames.add(qName);
        cls = pl.net.yuri.magister.soap.SellRatingReasonSumStruct[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "SellRatingReasonSumStruct");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfSellRatingStatsStruct");
        cachedSerQNames.add(qName);
        cls = pl.net.yuri.magister.soap.SellRatingStatsStruct[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "SellRatingStatsStruct");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfSendRefundFormResultStruct");
        cachedSerQNames.add(qName);
        cls = pl.net.yuri.magister.soap.SendRefundFormResultStruct[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "SendRefundFormResultStruct");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfSendRefundFormStruct");
        cachedSerQNames.add(qName);
        cls = pl.net.yuri.magister.soap.SendRefundFormStruct[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "SendRefundFormStruct");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfSendReminderMessageResultStruct");
        cachedSerQNames.add(qName);
        cls = pl.net.yuri.magister.soap.SendReminderMessageResultStruct[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "SendReminderMessageResultStruct");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfSendReminderMessageStruct");
        cachedSerQNames.add(qName);
        cls = pl.net.yuri.magister.soap.SendReminderMessageStruct[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "SendReminderMessageStruct");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfServiceInfoCatStruct");
        cachedSerQNames.add(qName);
        cls = pl.net.yuri.magister.soap.ServiceInfoCatStruct[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ServiceInfoCatStruct");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfServiceInfoStruct");
        cachedSerQNames.add(qName);
        cls = pl.net.yuri.magister.soap.ServiceInfoStruct[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ServiceInfoStruct");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfShipmentDataStruct");
        cachedSerQNames.add(qName);
        cls = pl.net.yuri.magister.soap.ShipmentDataStruct[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ShipmentDataStruct");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfSitesFlagInfo");
        cachedSerQNames.add(qName);
        cls = pl.net.yuri.magister.soap.SiteFlagInfoType[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "SiteFlagInfoType");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfSitesInfo");
        cachedSerQNames.add(qName);
        cls = pl.net.yuri.magister.soap.SiteInfoType[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "SiteInfoType");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfSpecialAuction");
        cachedSerQNames.add(qName);
        cls = pl.net.yuri.magister.soap.SpecialAuctionStruct[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "SpecialAuctionStruct");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfStateInfoStruct");
        cachedSerQNames.add(qName);
        cls = pl.net.yuri.magister.soap.StateInfoStruct[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "StateInfoStruct");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfStructItemInfoList");
        cachedSerQNames.add(qName);
        cls = pl.net.yuri.magister.soap.ItemInfoStruct[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ItemInfoStruct");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfStructSellAgain");
        cachedSerQNames.add(qName);
        cls = pl.net.yuri.magister.soap.StructSellAgain[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "StructSellAgain");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfStructSellFailed");
        cachedSerQNames.add(qName);
        cls = pl.net.yuri.magister.soap.StructSellFailed[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "StructSellFailed");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfSysStatus");
        cachedSerQNames.add(qName);
        cls = pl.net.yuri.magister.soap.SysStatusType[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "SysStatusType");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfTemplates");
        cachedSerQNames.add(qName);
        cls = pl.net.yuri.magister.soap.TemplateInfoType[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "TemplateInfoType");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfTransactionsID");
        cachedSerQNames.add(qName);
        cls = long[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfUserBlackListAddResultStruct");
        cachedSerQNames.add(qName);
        cls = pl.net.yuri.magister.soap.UserBlackListAddResultStruct[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "UserBlackListAddResultStruct");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfUserBlackListStruct");
        cachedSerQNames.add(qName);
        cls = pl.net.yuri.magister.soap.UserBlackListStruct[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "UserBlackListStruct");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfUserIncomingPaymentRefundsStruct");
        cachedSerQNames.add(qName);
        cls = pl.net.yuri.magister.soap.UserIncomingPaymentRefundsStruct[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "UserIncomingPaymentRefundsStruct");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfUserIncomingPaymentStruct");
        cachedSerQNames.add(qName);
        cls = pl.net.yuri.magister.soap.UserIncomingPaymentStruct[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "UserIncomingPaymentStruct");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfUserItemList");
        cachedSerQNames.add(qName);
        cls = pl.net.yuri.magister.soap.UserItemList[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "UserItemList");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfUserPaymentRefundsStruct");
        cachedSerQNames.add(qName);
        cls = pl.net.yuri.magister.soap.UserPaymentRefundsStruct[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "UserPaymentRefundsStruct");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfUserPaymentStruct");
        cachedSerQNames.add(qName);
        cls = pl.net.yuri.magister.soap.UserPaymentStruct[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "UserPaymentStruct");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfUserPayoutStruct");
        cachedSerQNames.add(qName);
        cls = pl.net.yuri.magister.soap.UserPayoutStruct[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "UserPayoutStruct");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfUsersID");
        cachedSerQNames.add(qName);
        cls = long[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfUsersPostBuyData");
        cachedSerQNames.add(qName);
        cls = pl.net.yuri.magister.soap.UserPostBuyDataStruct[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "UserPostBuyDataStruct");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ArrayOfWaitFeedbackStruct");
        cachedSerQNames.add(qName);
        cls = pl.net.yuri.magister.soap.WaitFeedbackStruct[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "WaitFeedbackStruct");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "AttribStruct");
        cachedSerQNames.add(qName);
        cls = pl.net.yuri.magister.soap.AttribStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "BidList2");
        cachedSerQNames.add(qName);
        cls = java.lang.String[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "BidListStruct2");
        cachedSerQNames.add(qName);
        cls = pl.net.yuri.magister.soap.BidListStruct2.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "BillingDataType");
        cachedSerQNames.add(qName);
        cls = pl.net.yuri.magister.soap.BillingDataType.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "BlackListResStruct");
        cachedSerQNames.add(qName);
        cls = pl.net.yuri.magister.soap.BlackListResStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "BlackListStruct");
        cachedSerQNames.add(qName);
        cls = pl.net.yuri.magister.soap.BlackListStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "CancelRefundDataStruct");
        cachedSerQNames.add(qName);
        cls = pl.net.yuri.magister.soap.CancelRefundDataStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

    }

    private void addBindings1() {
        java.lang.Class cls;
        javax.xml.namespace.QName qName;
        javax.xml.namespace.QName qName2;
        java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
        java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
        java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
        java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
        java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
        java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
        java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
        java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
        java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
        java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "CancelRefundFormResultStruct");
        cachedSerQNames.add(qName);
        cls = pl.net.yuri.magister.soap.CancelRefundFormResultStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "CancelRefundWarningResultStruct");
        cachedSerQNames.add(qName);
        cls = pl.net.yuri.magister.soap.CancelRefundWarningResultStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "CancelRefundWarningStruct");
        cachedSerQNames.add(qName);
        cls = pl.net.yuri.magister.soap.CancelRefundWarningStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "CatInfoType");
        cachedSerQNames.add(qName);
        cls = pl.net.yuri.magister.soap.CatInfoType.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "CompanyExtraDataStruct");
        cachedSerQNames.add(qName);
        cls = pl.net.yuri.magister.soap.CompanyExtraDataStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "CompanyInfoStruct");
        cachedSerQNames.add(qName);
        cls = pl.net.yuri.magister.soap.CompanyInfoStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "CompanySecondAddressStruct");
        cachedSerQNames.add(qName);
        cls = pl.net.yuri.magister.soap.CompanySecondAddressStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "CountryInfoType");
        cachedSerQNames.add(qName);
        cls = pl.net.yuri.magister.soap.CountryInfoType.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "DealsStruct");
        cachedSerQNames.add(qName);
        cls = pl.net.yuri.magister.soap.DealsStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "DurationTimeInfo");
        cachedSerQNames.add(qName);
        cls = pl.net.yuri.magister.soap.DurationTimeInfo.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "FavouritesCategoriesStruct");
        cachedSerQNames.add(qName);
        cls = pl.net.yuri.magister.soap.FavouritesCategoriesStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "FavouritesSellersStruct");
        cachedSerQNames.add(qName);
        cls = pl.net.yuri.magister.soap.FavouritesSellersStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "FeedbackList");
        cachedSerQNames.add(qName);
        cls = pl.net.yuri.magister.soap.FeedbackList.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "FeedbackManyStruct");
        cachedSerQNames.add(qName);
        cls = pl.net.yuri.magister.soap.FeedbackManyStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "FeedbackResultStruct");
        cachedSerQNames.add(qName);
        cls = pl.net.yuri.magister.soap.FeedbackResultStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "FieldsValue");
        cachedSerQNames.add(qName);
        cls = pl.net.yuri.magister.soap.FieldsValue.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "FinishFailureStruct");
        cachedSerQNames.add(qName);
        cls = pl.net.yuri.magister.soap.FinishFailureStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "FinishItemsStruct");
        cachedSerQNames.add(qName);
        cls = pl.net.yuri.magister.soap.FinishItemsStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "InfoCatList");
        cachedSerQNames.add(qName);
        cls = pl.net.yuri.magister.soap.InfoCatList.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "InvoiceDataStruct");
        cachedSerQNames.add(qName);
        cls = pl.net.yuri.magister.soap.InvoiceDataStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ItemBilling");
        cachedSerQNames.add(qName);
        cls = pl.net.yuri.magister.soap.ItemBilling.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ItemBillingList");
        cachedSerQNames.add(qName);
        cls = pl.net.yuri.magister.soap.ItemBilling[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ItemBilling");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ItemCatList");
        cachedSerQNames.add(qName);
        cls = pl.net.yuri.magister.soap.ItemCatList.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ItemGetImage");
        cachedSerQNames.add(qName);
        cls = pl.net.yuri.magister.soap.ItemGetImage.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ItemImageList");
        cachedSerQNames.add(qName);
        cls = pl.net.yuri.magister.soap.ItemImageList.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ItemImageOptionsStruct");
        cachedSerQNames.add(qName);
        cls = pl.net.yuri.magister.soap.ItemImageOptionsStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ItemImagesStruct");
        cachedSerQNames.add(qName);
        cls = pl.net.yuri.magister.soap.ItemImagesStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ItemInfo");
        cachedSerQNames.add(qName);
        cls = pl.net.yuri.magister.soap.ItemInfo.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ItemInfoExt");
        cachedSerQNames.add(qName);
        cls = pl.net.yuri.magister.soap.ItemInfoExt.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ItemInfoStruct");
        cachedSerQNames.add(qName);
        cls = pl.net.yuri.magister.soap.ItemInfoStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ItemPaymentOptions");
        cachedSerQNames.add(qName);
        cls = pl.net.yuri.magister.soap.ItemPaymentOptions.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ItemPostBuyDataStruct");
        cachedSerQNames.add(qName);
        cls = pl.net.yuri.magister.soap.ItemPostBuyDataStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ItemRemoveWatchStruct");
        cachedSerQNames.add(qName);
        cls = pl.net.yuri.magister.soap.ItemRemoveWatchStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "MyAccountList2");
        cachedSerQNames.add(qName);
        cls = java.lang.String[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "MyAccountStruct2");
        cachedSerQNames.add(qName);
        cls = pl.net.yuri.magister.soap.MyAccountStruct2.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "MyContactList");
        cachedSerQNames.add(qName);
        cls = pl.net.yuri.magister.soap.MyContactList.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "MyFeedbackList2");
        cachedSerQNames.add(qName);
        cls = java.lang.String[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "MyFeedbackListStruct2");
        cachedSerQNames.add(qName);
        cls = pl.net.yuri.magister.soap.MyFeedbackListStruct2.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "PaymentDetailsStruct");
        cachedSerQNames.add(qName);
        cls = pl.net.yuri.magister.soap.PaymentDetailsStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "PharmacyDataStruct");
        cachedSerQNames.add(qName);
        cls = pl.net.yuri.magister.soap.PharmacyDataStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "PostageStruct");
        cachedSerQNames.add(qName);
        cls = pl.net.yuri.magister.soap.PostageStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "PostBuyFormAddressStruct");
        cachedSerQNames.add(qName);
        cls = pl.net.yuri.magister.soap.PostBuyFormAddressStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "PostBuyFormDataStruct");
        cachedSerQNames.add(qName);
        cls = pl.net.yuri.magister.soap.PostBuyFormDataStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "PostBuyFormItemStruct");
        cachedSerQNames.add(qName);
        cls = pl.net.yuri.magister.soap.PostBuyFormItemStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "PostBuyFormShipmentTrackingStruct");
        cachedSerQNames.add(qName);
        cls = pl.net.yuri.magister.soap.PostBuyFormShipmentTrackingStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "PriceCatInfo");
        cachedSerQNames.add(qName);
        cls = pl.net.yuri.magister.soap.PriceCatInfo.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ProductParametersStruct");
        cachedSerQNames.add(qName);
        cls = pl.net.yuri.magister.soap.ProductParametersStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ProductStruct");
        cachedSerQNames.add(qName);
        cls = pl.net.yuri.magister.soap.ProductStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "RangeDateValueStruct");
        cachedSerQNames.add(qName);
        cls = pl.net.yuri.magister.soap.RangeDateValueStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "RangeFloatValueStruct");
        cachedSerQNames.add(qName);
        cls = pl.net.yuri.magister.soap.RangeFloatValueStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "RangeIntValueStruct");
        cachedSerQNames.add(qName);
        cls = pl.net.yuri.magister.soap.RangeIntValueStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "RefundFormDataStruct");
        cachedSerQNames.add(qName);
        cls = pl.net.yuri.magister.soap.RefundFormDataStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "RefundFormStatusResultStruct");
        cachedSerQNames.add(qName);
        cls = pl.net.yuri.magister.soap.RefundFormStatusResultStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "RefundFormStatusStruct");
        cachedSerQNames.add(qName);
        cls = pl.net.yuri.magister.soap.RefundFormStatusStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "RefundReasonStruct");
        cachedSerQNames.add(qName);
        cls = pl.net.yuri.magister.soap.RefundReasonStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "SearchOptType");
        cachedSerQNames.add(qName);
        cls = pl.net.yuri.magister.soap.SearchOptType.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "SearchResponseType");
        cachedSerQNames.add(qName);
        cls = pl.net.yuri.magister.soap.SearchResponseType.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "SellFormType");
        cachedSerQNames.add(qName);
        cls = pl.net.yuri.magister.soap.SellFormType.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "SellRatingAveragePerMonthStruct");
        cachedSerQNames.add(qName);
        cls = pl.net.yuri.magister.soap.SellRatingAveragePerMonthStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "SellRatingAverageStruct");
        cachedSerQNames.add(qName);
        cls = pl.net.yuri.magister.soap.SellRatingAverageStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "SellRatingDetailStruct");
        cachedSerQNames.add(qName);
        cls = pl.net.yuri.magister.soap.SellRatingDetailStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "SellRatingEstimationStruct");
        cachedSerQNames.add(qName);
        cls = pl.net.yuri.magister.soap.SellRatingEstimationStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "SellRatingInfoStruct");
        cachedSerQNames.add(qName);
        cls = pl.net.yuri.magister.soap.SellRatingInfoStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "SellRatingReasonStruct");
        cachedSerQNames.add(qName);
        cls = pl.net.yuri.magister.soap.SellRatingReasonStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "SellRatingReasonSumStruct");
        cachedSerQNames.add(qName);
        cls = pl.net.yuri.magister.soap.SellRatingReasonSumStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "SellRatingStatsStruct");
        cachedSerQNames.add(qName);
        cls = pl.net.yuri.magister.soap.SellRatingStatsStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "SendRefundFormResultStruct");
        cachedSerQNames.add(qName);
        cls = pl.net.yuri.magister.soap.SendRefundFormResultStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "SendRefundFormStruct");
        cachedSerQNames.add(qName);
        cls = pl.net.yuri.magister.soap.SendRefundFormStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "SendReminderMessageResultStruct");
        cachedSerQNames.add(qName);
        cls = pl.net.yuri.magister.soap.SendReminderMessageResultStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "SendReminderMessageStruct");
        cachedSerQNames.add(qName);
        cls = pl.net.yuri.magister.soap.SendReminderMessageStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ServiceInfoCatStruct");
        cachedSerQNames.add(qName);
        cls = pl.net.yuri.magister.soap.ServiceInfoCatStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ServiceInfoStruct");
        cachedSerQNames.add(qName);
        cls = pl.net.yuri.magister.soap.ServiceInfoStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ShipmentDataStruct");
        cachedSerQNames.add(qName);
        cls = pl.net.yuri.magister.soap.ShipmentDataStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "ShowUserFeedbacks");
        cachedSerQNames.add(qName);
        cls = pl.net.yuri.magister.soap.ShowUserFeedbacks.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "SiteFlagInfoType");
        cachedSerQNames.add(qName);
        cls = pl.net.yuri.magister.soap.SiteFlagInfoType.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "SiteInfoType");
        cachedSerQNames.add(qName);
        cls = pl.net.yuri.magister.soap.SiteInfoType.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "SiteJournal");
        cachedSerQNames.add(qName);
        cls = pl.net.yuri.magister.soap.SiteJournal.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "SiteJournalArray");
        cachedSerQNames.add(qName);
        cls = pl.net.yuri.magister.soap.SiteJournal[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "SiteJournal");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "SiteJournalInfo");
        cachedSerQNames.add(qName);
        cls = pl.net.yuri.magister.soap.SiteJournalInfo.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "SpecialAuctionStruct");
        cachedSerQNames.add(qName);
        cls = pl.net.yuri.magister.soap.SpecialAuctionStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "StateInfoStruct");
        cachedSerQNames.add(qName);
        cls = pl.net.yuri.magister.soap.StateInfoStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "StructSellAgain");
        cachedSerQNames.add(qName);
        cls = pl.net.yuri.magister.soap.StructSellAgain.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "StructSellFailed");
        cachedSerQNames.add(qName);
        cls = pl.net.yuri.magister.soap.StructSellFailed.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "SysStatusType");
        cachedSerQNames.add(qName);
        cls = pl.net.yuri.magister.soap.SysStatusType.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "TemplateInfoType");
        cachedSerQNames.add(qName);
        cls = pl.net.yuri.magister.soap.TemplateInfoType.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "UserBlackListAddResultStruct");
        cachedSerQNames.add(qName);
        cls = pl.net.yuri.magister.soap.UserBlackListAddResultStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "UserBlackListStruct");
        cachedSerQNames.add(qName);
        cls = pl.net.yuri.magister.soap.UserBlackListStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "UserDataStruct");
        cachedSerQNames.add(qName);
        cls = pl.net.yuri.magister.soap.UserDataStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "UserIncomingPaymentRefundsStruct");
        cachedSerQNames.add(qName);
        cls = pl.net.yuri.magister.soap.UserIncomingPaymentRefundsStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "UserIncomingPaymentStruct");
        cachedSerQNames.add(qName);
        cls = pl.net.yuri.magister.soap.UserIncomingPaymentStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "UserItemList");
        cachedSerQNames.add(qName);
        cls = pl.net.yuri.magister.soap.UserItemList.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "UserPaymentRefundsStruct");
        cachedSerQNames.add(qName);
        cls = pl.net.yuri.magister.soap.UserPaymentRefundsStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "UserPaymentStruct");
        cachedSerQNames.add(qName);
        cls = pl.net.yuri.magister.soap.UserPaymentStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "UserPayoutStruct");
        cachedSerQNames.add(qName);
        cls = pl.net.yuri.magister.soap.UserPayoutStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "UserPostBuyDataStruct");
        cachedSerQNames.add(qName);
        cls = pl.net.yuri.magister.soap.UserPostBuyDataStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "UserSentToDataStruct");
        cachedSerQNames.add(qName);
        cls = pl.net.yuri.magister.soap.UserSentToDataStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("urn:AllegroWebApi", "WaitFeedbackStruct");
        cachedSerQNames.add(qName);
        cls = pl.net.yuri.magister.soap.WaitFeedbackStruct.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
                    _call.setEncodingStyle(org.apache.axis.Constants.URI_SOAP11_ENC);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                    cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                    cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        } else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                    cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                    cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        } catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public void doGetCatsData(int countryId, long localVersion, java.lang.String webapiKey, pl.net.yuri.magister.soap.holders.ArrayOfCatsHolder catsList, javax.xml.rpc.holders.LongHolder verKey, javax.xml.rpc.holders.StringHolder verStr) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#catsdata");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doGetCatsData"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{new java.lang.Integer(countryId), new java.lang.Long(localVersion), webapiKey});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                java.util.Map _output;
                _output = _call.getOutputParams();
                try {
                    catsList.value = (pl.net.yuri.magister.soap.CatInfoType[]) _output.get(new javax.xml.namespace.QName("", "cats-list"));
                } catch (java.lang.Exception _exception) {
                    catsList.value = (pl.net.yuri.magister.soap.CatInfoType[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "cats-list")), pl.net.yuri.magister.soap.CatInfoType[].class);
                }
                try {
                    verKey.value = ((java.lang.Long) _output.get(new javax.xml.namespace.QName("", "ver-key"))).longValue();
                } catch (java.lang.Exception _exception) {
                    verKey.value = ((java.lang.Long) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "ver-key")), long.class)).longValue();
                }
                try {
                    verStr.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("", "ver-str"));
                } catch (java.lang.Exception _exception) {
                    verStr.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "ver-str")), java.lang.String.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public void doLogin(java.lang.String userLogin, java.lang.String userPassword, int countryCode, java.lang.String webapiKey, long localVersion, javax.xml.rpc.holders.StringHolder sessionHandlePart, javax.xml.rpc.holders.LongHolder userId, javax.xml.rpc.holders.LongHolder serverTime) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#login");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doLogin"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{userLogin, userPassword, new java.lang.Integer(countryCode), webapiKey, new java.lang.Long(localVersion)});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                java.util.Map _output;
                _output = _call.getOutputParams();
                try {
                    sessionHandlePart.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("", "session-handle-part"));
                } catch (java.lang.Exception _exception) {
                    sessionHandlePart.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "session-handle-part")), java.lang.String.class);
                }
                try {
                    userId.value = ((java.lang.Long) _output.get(new javax.xml.namespace.QName("", "user-id"))).longValue();
                } catch (java.lang.Exception _exception) {
                    userId.value = ((java.lang.Long) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "user-id")), long.class)).longValue();
                }
                try {
                    serverTime.value = ((java.lang.Long) _output.get(new javax.xml.namespace.QName("", "server-time"))).longValue();
                } catch (java.lang.Exception _exception) {
                    serverTime.value = ((java.lang.Long) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "server-time")), long.class)).longValue();
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public void doLoginEnc(java.lang.String userLogin, java.lang.String userHashPassword, int countryCode, java.lang.String webapiKey, long localVersion, javax.xml.rpc.holders.StringHolder sessionHandlePart, javax.xml.rpc.holders.LongHolder userId, javax.xml.rpc.holders.LongHolder serverTime) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#loginenc");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doLoginEnc"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{userLogin, userHashPassword, new java.lang.Integer(countryCode), webapiKey, new java.lang.Long(localVersion)});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                java.util.Map _output;
                _output = _call.getOutputParams();
                try {
                    sessionHandlePart.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("", "session-handle-part"));
                } catch (java.lang.Exception _exception) {
                    sessionHandlePart.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "session-handle-part")), java.lang.String.class);
                }
                try {
                    userId.value = ((java.lang.Long) _output.get(new javax.xml.namespace.QName("", "user-id"))).longValue();
                } catch (java.lang.Exception _exception) {
                    userId.value = ((java.lang.Long) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "user-id")), long.class)).longValue();
                }
                try {
                    serverTime.value = ((java.lang.Long) _output.get(new javax.xml.namespace.QName("", "server-time"))).longValue();
                } catch (java.lang.Exception _exception) {
                    serverTime.value = ((java.lang.Long) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "server-time")), long.class)).longValue();
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public void doNewAuction(java.lang.String sessionHandle, pl.net.yuri.magister.soap.FieldsValue[] fields, int _private, int localId, javax.xml.rpc.holders.LongHolder itemId, javax.xml.rpc.holders.StringHolder itemInfo) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#newauction");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doNewAuction"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{sessionHandle, fields, new java.lang.Integer(_private), new java.lang.Integer(localId)});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                java.util.Map _output;
                _output = _call.getOutputParams();
                try {
                    itemId.value = ((java.lang.Long) _output.get(new javax.xml.namespace.QName("", "item-id"))).longValue();
                } catch (java.lang.Exception _exception) {
                    itemId.value = ((java.lang.Long) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "item-id")), long.class)).longValue();
                }
                try {
                    itemInfo.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("", "item-info"));
                } catch (java.lang.Exception _exception) {
                    itemInfo.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "item-info")), java.lang.String.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public void doNewAuctionExt(java.lang.String sessionHandle, pl.net.yuri.magister.soap.FieldsValue[] fields, int _private, int localId, javax.xml.rpc.holders.LongHolder itemId, javax.xml.rpc.holders.StringHolder itemInfo) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#newauctionext");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doNewAuctionExt"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{sessionHandle, fields, new java.lang.Integer(_private), new java.lang.Integer(localId)});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                java.util.Map _output;
                _output = _call.getOutputParams();
                try {
                    itemId.value = ((java.lang.Long) _output.get(new javax.xml.namespace.QName("", "item-id"))).longValue();
                } catch (java.lang.Exception _exception) {
                    itemId.value = ((java.lang.Long) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "item-id")), long.class)).longValue();
                }
                try {
                    itemInfo.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("", "item-info"));
                } catch (java.lang.Exception _exception) {
                    itemInfo.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "item-info")), java.lang.String.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public void doSellSomeAgain(java.lang.String sessionHandle, long[] sellItemsArray, long sellStartingTime, int sellAuctionDuration, int sellOptions, pl.net.yuri.magister.soap.holders.ArrayOfStructSellAgainHolder itemsSellAgain, pl.net.yuri.magister.soap.holders.ArrayOfStructSellFailedHolder itemsSellFailed, pl.net.yuri.magister.soap.holders.ArrayOfItemsIDHolder itemsSellNotFound) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#sellsomeagain");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doSellSomeAgain"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{sessionHandle, sellItemsArray, new java.lang.Long(sellStartingTime), new java.lang.Integer(sellAuctionDuration), new java.lang.Integer(sellOptions)});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                java.util.Map _output;
                _output = _call.getOutputParams();
                try {
                    itemsSellAgain.value = (pl.net.yuri.magister.soap.StructSellAgain[]) _output.get(new javax.xml.namespace.QName("", "items-sell-again"));
                } catch (java.lang.Exception _exception) {
                    itemsSellAgain.value = (pl.net.yuri.magister.soap.StructSellAgain[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "items-sell-again")), pl.net.yuri.magister.soap.StructSellAgain[].class);
                }
                try {
                    itemsSellFailed.value = (pl.net.yuri.magister.soap.StructSellFailed[]) _output.get(new javax.xml.namespace.QName("", "items-sell-failed"));
                } catch (java.lang.Exception _exception) {
                    itemsSellFailed.value = (pl.net.yuri.magister.soap.StructSellFailed[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "items-sell-failed")), pl.net.yuri.magister.soap.StructSellFailed[].class);
                }
                try {
                    itemsSellNotFound.value = (long[]) _output.get(new javax.xml.namespace.QName("", "items-sell-not-found"));
                } catch (java.lang.Exception _exception) {
                    itemsSellNotFound.value = (long[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "items-sell-not-found")), long[].class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public void doCheckNewAuction(java.lang.String sessionHandle, pl.net.yuri.magister.soap.FieldsValue[] fields, javax.xml.rpc.holders.StringHolder itemPrice, javax.xml.rpc.holders.StringHolder itemPriceDesc) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#checkauction");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doCheckNewAuction"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{sessionHandle, fields});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                java.util.Map _output;
                _output = _call.getOutputParams();
                try {
                    itemPrice.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("", "item-price"));
                } catch (java.lang.Exception _exception) {
                    itemPrice.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "item-price")), java.lang.String.class);
                }
                try {
                    itemPriceDesc.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("", "item-price-desc"));
                } catch (java.lang.Exception _exception) {
                    itemPriceDesc.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "item-price-desc")), java.lang.String.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public void doCheckNewAuctionExt(java.lang.String sessionHandle, pl.net.yuri.magister.soap.FieldsValue[] fields, javax.xml.rpc.holders.StringHolder itemPrice, javax.xml.rpc.holders.StringHolder itemPriceDesc) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#checkauctionext");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doCheckNewAuctionExt"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{sessionHandle, fields});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                java.util.Map _output;
                _output = _call.getOutputParams();
                try {
                    itemPrice.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("", "item-price"));
                } catch (java.lang.Exception _exception) {
                    itemPrice.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "item-price")), java.lang.String.class);
                }
                try {
                    itemPriceDesc.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("", "item-price-desc"));
                } catch (java.lang.Exception _exception) {
                    itemPriceDesc.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "item-price-desc")), java.lang.String.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public void doAddDescToItems(java.lang.String sessionHandle, long[] itemsIdArray, java.lang.String itDescription, pl.net.yuri.magister.soap.holders.ArrayOfItemsIDHolder arrayItemsAddId, pl.net.yuri.magister.soap.holders.ArrayOfItemsIDHolder arrayItemsDescToLong, pl.net.yuri.magister.soap.holders.ArrayOfItemsIDHolder arrayItemsNotFound) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#adddesc");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doAddDescToItems"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{sessionHandle, itemsIdArray, itDescription});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                java.util.Map _output;
                _output = _call.getOutputParams();
                try {
                    arrayItemsAddId.value = (long[]) _output.get(new javax.xml.namespace.QName("", "array-items-add-id"));
                } catch (java.lang.Exception _exception) {
                    arrayItemsAddId.value = (long[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "array-items-add-id")), long[].class);
                }
                try {
                    arrayItemsDescToLong.value = (long[]) _output.get(new javax.xml.namespace.QName("", "array-items-desc-to-long"));
                } catch (java.lang.Exception _exception) {
                    arrayItemsDescToLong.value = (long[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "array-items-desc-to-long")), long[].class);
                }
                try {
                    arrayItemsNotFound.value = (long[]) _output.get(new javax.xml.namespace.QName("", "array-items-not-found"));
                } catch (java.lang.Exception _exception) {
                    arrayItemsNotFound.value = (long[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "array-items-not-found")), long[].class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public long doCheckItemIdByFutureItemId(java.lang.String webapiKey, int countryId, long futureItemId) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#checkitemidbyfuture");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doCheckItemIdByFutureItemId"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{webapiKey, new java.lang.Integer(countryId), new java.lang.Long(futureItemId)});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return ((java.lang.Long) _resp).longValue();
                } catch (java.lang.Exception _exception) {
                    return ((java.lang.Long) org.apache.axis.utils.JavaUtils.convert(_resp, long.class)).longValue();
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public void doGetCatsDataLimit(int countryId, long localVersion, java.lang.String webapiKey, int offset, int packageElement, pl.net.yuri.magister.soap.holders.ArrayOfCatsHolder catsList, javax.xml.rpc.holders.LongHolder verKey, javax.xml.rpc.holders.StringHolder verStr) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#catsdatalimit");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doGetCatsDataLimit"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{new java.lang.Integer(countryId), new java.lang.Long(localVersion), webapiKey, new java.lang.Integer(offset), new java.lang.Integer(packageElement)});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                java.util.Map _output;
                _output = _call.getOutputParams();
                try {
                    catsList.value = (pl.net.yuri.magister.soap.CatInfoType[]) _output.get(new javax.xml.namespace.QName("", "cats-list"));
                } catch (java.lang.Exception _exception) {
                    catsList.value = (pl.net.yuri.magister.soap.CatInfoType[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "cats-list")), pl.net.yuri.magister.soap.CatInfoType[].class);
                }
                try {
                    verKey.value = ((java.lang.Long) _output.get(new javax.xml.namespace.QName("", "ver-key"))).longValue();
                } catch (java.lang.Exception _exception) {
                    verKey.value = ((java.lang.Long) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "ver-key")), long.class)).longValue();
                }
                try {
                    verStr.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("", "ver-str"));
                } catch (java.lang.Exception _exception) {
                    verStr.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "ver-str")), java.lang.String.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public void doGetItemsInfo(java.lang.String sessionHandle, long[] itemsIdArray, int getDesc, int getImageUrl, int getAttribs, int getPostageOptions, int getCompanyInfo, pl.net.yuri.magister.soap.holders.ArrayOfStructItemInfoListHolder arrayItemListInfo, pl.net.yuri.magister.soap.holders.ArrayOfItemsIDHolder arrayItemsNotFound, pl.net.yuri.magister.soap.holders.ArrayOfItemsIDHolder arrayItemsAdminKilled) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#getitemsinfo");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doGetItemsInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{sessionHandle, itemsIdArray, new java.lang.Integer(getDesc), new java.lang.Integer(getImageUrl), new java.lang.Integer(getAttribs), new java.lang.Integer(getPostageOptions), new java.lang.Integer(getCompanyInfo)});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                java.util.Map _output;
                _output = _call.getOutputParams();
                try {
                    arrayItemListInfo.value = (pl.net.yuri.magister.soap.ItemInfoStruct[]) _output.get(new javax.xml.namespace.QName("", "array-item-list-info"));
                } catch (java.lang.Exception _exception) {
                    arrayItemListInfo.value = (pl.net.yuri.magister.soap.ItemInfoStruct[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "array-item-list-info")), pl.net.yuri.magister.soap.ItemInfoStruct[].class);
                }
                try {
                    arrayItemsNotFound.value = (long[]) _output.get(new javax.xml.namespace.QName("", "array-items-not-found"));
                } catch (java.lang.Exception _exception) {
                    arrayItemsNotFound.value = (long[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "array-items-not-found")), long[].class);
                }
                try {
                    arrayItemsAdminKilled.value = (long[]) _output.get(new javax.xml.namespace.QName("", "array-items-admin-killed"));
                } catch (java.lang.Exception _exception) {
                    arrayItemsAdminKilled.value = (long[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "array-items-admin-killed")), long[].class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public pl.net.yuri.magister.soap.BillingDataType[] doGetPaymentData(int countryId, java.lang.String webapiKey) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#paymentdata");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doGetPaymentData"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{new java.lang.Integer(countryId), webapiKey});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (pl.net.yuri.magister.soap.BillingDataType[]) _resp;
                } catch (java.lang.Exception _exception) {
                    return (pl.net.yuri.magister.soap.BillingDataType[]) org.apache.axis.utils.JavaUtils.convert(_resp, pl.net.yuri.magister.soap.BillingDataType[].class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public void doGetSellFormFields(int countryCode, long localVersion, java.lang.String webapiKey, pl.net.yuri.magister.soap.holders.ArrayOfSellFormsHolder sellFormFields, javax.xml.rpc.holders.LongHolder verKey, javax.xml.rpc.holders.StringHolder verStr) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#sellformfields");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doGetSellFormFields"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{new java.lang.Integer(countryCode), new java.lang.Long(localVersion), webapiKey});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                java.util.Map _output;
                _output = _call.getOutputParams();
                try {
                    sellFormFields.value = (pl.net.yuri.magister.soap.SellFormType[]) _output.get(new javax.xml.namespace.QName("", "sell-form-fields"));
                } catch (java.lang.Exception _exception) {
                    sellFormFields.value = (pl.net.yuri.magister.soap.SellFormType[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "sell-form-fields")), pl.net.yuri.magister.soap.SellFormType[].class);
                }
                try {
                    verKey.value = ((java.lang.Long) _output.get(new javax.xml.namespace.QName("", "ver-key"))).longValue();
                } catch (java.lang.Exception _exception) {
                    verKey.value = ((java.lang.Long) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "ver-key")), long.class)).longValue();
                }
                try {
                    verStr.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("", "ver-str"));
                } catch (java.lang.Exception _exception) {
                    verStr.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "ver-str")), java.lang.String.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public void doGetSellFormFieldsExt(int countryCode, long localVersion, java.lang.String webapiKey, pl.net.yuri.magister.soap.holders.ArrayOfSellFormsHolder sellFormFields, javax.xml.rpc.holders.LongHolder verKey, javax.xml.rpc.holders.StringHolder verStr) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#sellformfieldsext");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doGetSellFormFieldsExt"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{new java.lang.Integer(countryCode), new java.lang.Long(localVersion), webapiKey});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                java.util.Map _output;
                _output = _call.getOutputParams();
                try {
                    sellFormFields.value = (pl.net.yuri.magister.soap.SellFormType[]) _output.get(new javax.xml.namespace.QName("", "sell-form-fields"));
                } catch (java.lang.Exception _exception) {
                    sellFormFields.value = (pl.net.yuri.magister.soap.SellFormType[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "sell-form-fields")), pl.net.yuri.magister.soap.SellFormType[].class);
                }
                try {
                    verKey.value = ((java.lang.Long) _output.get(new javax.xml.namespace.QName("", "ver-key"))).longValue();
                } catch (java.lang.Exception _exception) {
                    verKey.value = ((java.lang.Long) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "ver-key")), long.class)).longValue();
                }
                try {
                    verStr.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("", "ver-str"));
                } catch (java.lang.Exception _exception) {
                    verStr.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "ver-str")), java.lang.String.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public void doGetSitesFlagInfo(int countryCode, java.lang.String webapiKey, pl.net.yuri.magister.soap.holders.ArrayOfSitesFlagInfoHolder sitesInfoList, javax.xml.rpc.holders.LongHolder verKey, javax.xml.rpc.holders.StringHolder verStr) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#sitesflaginfo");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doGetSitesFlagInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{new java.lang.Integer(countryCode), webapiKey});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                java.util.Map _output;
                _output = _call.getOutputParams();
                try {
                    sitesInfoList.value = (pl.net.yuri.magister.soap.SiteFlagInfoType[]) _output.get(new javax.xml.namespace.QName("", "sites-info-list"));
                } catch (java.lang.Exception _exception) {
                    sitesInfoList.value = (pl.net.yuri.magister.soap.SiteFlagInfoType[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "sites-info-list")), pl.net.yuri.magister.soap.SiteFlagInfoType[].class);
                }
                try {
                    verKey.value = ((java.lang.Long) _output.get(new javax.xml.namespace.QName("", "ver-key"))).longValue();
                } catch (java.lang.Exception _exception) {
                    verKey.value = ((java.lang.Long) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "ver-key")), long.class)).longValue();
                }
                try {
                    verStr.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("", "ver-str"));
                } catch (java.lang.Exception _exception) {
                    verStr.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "ver-str")), java.lang.String.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public void doGetSitesInfo(int countryCode, java.lang.String webapiKey, pl.net.yuri.magister.soap.holders.ArrayOfSitesInfoHolder sitesInfoList, javax.xml.rpc.holders.LongHolder verKey, javax.xml.rpc.holders.StringHolder verStr) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[16]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#sitesinfo");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doGetSitesInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{new java.lang.Integer(countryCode), webapiKey});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                java.util.Map _output;
                _output = _call.getOutputParams();
                try {
                    sitesInfoList.value = (pl.net.yuri.magister.soap.SiteInfoType[]) _output.get(new javax.xml.namespace.QName("", "sites-info-list"));
                } catch (java.lang.Exception _exception) {
                    sitesInfoList.value = (pl.net.yuri.magister.soap.SiteInfoType[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "sites-info-list")), pl.net.yuri.magister.soap.SiteInfoType[].class);
                }
                try {
                    verKey.value = ((java.lang.Long) _output.get(new javax.xml.namespace.QName("", "ver-key"))).longValue();
                } catch (java.lang.Exception _exception) {
                    verKey.value = ((java.lang.Long) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "ver-key")), long.class)).longValue();
                }
                try {
                    verStr.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("", "ver-str"));
                } catch (java.lang.Exception _exception) {
                    verStr.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "ver-str")), java.lang.String.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public long doGetSystemTime(int countryId, java.lang.String webapiKey) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[17]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#dogetsystemtime");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doGetSystemTime"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{new java.lang.Integer(countryId), webapiKey});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return ((java.lang.Long) _resp).longValue();
                } catch (java.lang.Exception _exception) {
                    return ((java.lang.Long) org.apache.axis.utils.JavaUtils.convert(_resp, long.class)).longValue();
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public int doGetUserID(int countryId, java.lang.String userLogin, java.lang.String userEmail, java.lang.String webapiKey) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[18]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#getuserid");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doGetUserID"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{new java.lang.Integer(countryId), userLogin, userEmail, webapiKey});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return ((java.lang.Integer) _resp).intValue();
                } catch (java.lang.Exception _exception) {
                    return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public void doGetUserItems(int userId, java.lang.String webapiKey, int countryId, int offset, int limit, pl.net.yuri.magister.soap.holders.ArrayOfUserItemListHolder userItemList, javax.xml.rpc.holders.IntHolder userItemCount) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[19]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#getuseritems");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doGetUserItems"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{new java.lang.Integer(userId), webapiKey, new java.lang.Integer(countryId), new java.lang.Integer(offset), new java.lang.Integer(limit)});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                java.util.Map _output;
                _output = _call.getOutputParams();
                try {
                    userItemList.value = (pl.net.yuri.magister.soap.UserItemList[]) _output.get(new javax.xml.namespace.QName("", "user-item-list"));
                } catch (java.lang.Exception _exception) {
                    userItemList.value = (pl.net.yuri.magister.soap.UserItemList[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "user-item-list")), pl.net.yuri.magister.soap.UserItemList[].class);
                }
                try {
                    userItemCount.value = ((java.lang.Integer) _output.get(new javax.xml.namespace.QName("", "user-item-count"))).intValue();
                } catch (java.lang.Exception _exception) {
                    userItemCount.value = ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "user-item-count")), int.class)).intValue();
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public java.lang.String doGetUserLogin(int countryId, int userId, java.lang.String webapiKey) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[20]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#getuserlogin");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doGetUserLogin"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{new java.lang.Integer(countryId), new java.lang.Integer(userId), webapiKey});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (java.lang.String) _resp;
                } catch (java.lang.Exception _exception) {
                    return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public pl.net.yuri.magister.soap.SysStatusType[] doQueryAllSysStatus(int countryId, java.lang.String webapiKey) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[21]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#queryallstatus");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doQueryAllSysStatus"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{new java.lang.Integer(countryId), webapiKey});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (pl.net.yuri.magister.soap.SysStatusType[]) _resp;
                } catch (java.lang.Exception _exception) {
                    return (pl.net.yuri.magister.soap.SysStatusType[]) org.apache.axis.utils.JavaUtils.convert(_resp, pl.net.yuri.magister.soap.SysStatusType[].class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public void doGetSellFormFieldsExtLimit(int countryCode, long localVersion, java.lang.String webapiKey, int offset, int packageElement, pl.net.yuri.magister.soap.holders.ArrayOfSellFormsHolder sellFormFields, javax.xml.rpc.holders.LongHolder verKey, javax.xml.rpc.holders.StringHolder verStr, javax.xml.rpc.holders.IntHolder formFieldsCount) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[22]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#sellformfieldsextlimit");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doGetSellFormFieldsExtLimit"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{new java.lang.Integer(countryCode), new java.lang.Long(localVersion), webapiKey, new java.lang.Integer(offset), new java.lang.Integer(packageElement)});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                java.util.Map _output;
                _output = _call.getOutputParams();
                try {
                    sellFormFields.value = (pl.net.yuri.magister.soap.SellFormType[]) _output.get(new javax.xml.namespace.QName("", "sell-form-fields"));
                } catch (java.lang.Exception _exception) {
                    sellFormFields.value = (pl.net.yuri.magister.soap.SellFormType[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "sell-form-fields")), pl.net.yuri.magister.soap.SellFormType[].class);
                }
                try {
                    verKey.value = ((java.lang.Long) _output.get(new javax.xml.namespace.QName("", "ver-key"))).longValue();
                } catch (java.lang.Exception _exception) {
                    verKey.value = ((java.lang.Long) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "ver-key")), long.class)).longValue();
                }
                try {
                    verStr.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("", "ver-str"));
                } catch (java.lang.Exception _exception) {
                    verStr.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "ver-str")), java.lang.String.class);
                }
                try {
                    formFieldsCount.value = ((java.lang.Integer) _output.get(new javax.xml.namespace.QName("", "form-fields-count"))).intValue();
                } catch (java.lang.Exception _exception) {
                    formFieldsCount.value = ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "form-fields-count")), int.class)).intValue();
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public void doGetSellFormFieldsLimit(int countryCode, long localVersion, java.lang.String webapiKey, int offset, int packageElement, pl.net.yuri.magister.soap.holders.ArrayOfSellFormsHolder sellFormFields, javax.xml.rpc.holders.LongHolder verKey, javax.xml.rpc.holders.StringHolder verStr, javax.xml.rpc.holders.IntHolder formFieldsCount) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[23]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#sellformfieldslimit");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doGetSellFormFieldsLimit"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{new java.lang.Integer(countryCode), new java.lang.Long(localVersion), webapiKey, new java.lang.Integer(offset), new java.lang.Integer(packageElement)});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                java.util.Map _output;
                _output = _call.getOutputParams();
                try {
                    sellFormFields.value = (pl.net.yuri.magister.soap.SellFormType[]) _output.get(new javax.xml.namespace.QName("", "sell-form-fields"));
                } catch (java.lang.Exception _exception) {
                    sellFormFields.value = (pl.net.yuri.magister.soap.SellFormType[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "sell-form-fields")), pl.net.yuri.magister.soap.SellFormType[].class);
                }
                try {
                    verKey.value = ((java.lang.Long) _output.get(new javax.xml.namespace.QName("", "ver-key"))).longValue();
                } catch (java.lang.Exception _exception) {
                    verKey.value = ((java.lang.Long) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "ver-key")), long.class)).longValue();
                }
                try {
                    verStr.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("", "ver-str"));
                } catch (java.lang.Exception _exception) {
                    verStr.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "ver-str")), java.lang.String.class);
                }
                try {
                    formFieldsCount.value = ((java.lang.Integer) _output.get(new javax.xml.namespace.QName("", "form-fields-count"))).intValue();
                } catch (java.lang.Exception _exception) {
                    formFieldsCount.value = ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "form-fields-count")), int.class)).intValue();
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public void doQuerySysStatus(int sysvar, int countryId, java.lang.String webapiKey, javax.xml.rpc.holders.StringHolder info, javax.xml.rpc.holders.LongHolder verKey) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[24]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#querystatus");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doQuerySysStatus"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{new java.lang.Integer(sysvar), new java.lang.Integer(countryId), webapiKey});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                java.util.Map _output;
                _output = _call.getOutputParams();
                try {
                    info.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("", "info"));
                } catch (java.lang.Exception _exception) {
                    info.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "info")), java.lang.String.class);
                }
                try {
                    verKey.value = ((java.lang.Long) _output.get(new javax.xml.namespace.QName("", "ver-key"))).longValue();
                } catch (java.lang.Exception _exception) {
                    verKey.value = ((java.lang.Long) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "ver-key")), long.class)).longValue();
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public void doShowCat(java.lang.String sessionHandle, int catId, int catItemState, int catItemOption, pl.net.yuri.magister.soap.DurationTimeInfo catItemDurationOption, pl.net.yuri.magister.soap.FieldsValue[] catAttribFields, int catSortOptions, pl.net.yuri.magister.soap.PriceCatInfo catItemsPrice, int catItemsOffset, int catItemsLimit, int catOrderFulfillmentTime, pl.net.yuri.magister.soap.holders.ArrayOfCatInfoStructHolder catParentArray, pl.net.yuri.magister.soap.holders.ArrayOfCatInfoStructHolder catChildArray, pl.net.yuri.magister.soap.holders.ArrayOfCatInfoStructHolder catSisterArray, javax.xml.rpc.holders.IntHolder catItemsCount, javax.xml.rpc.holders.IntHolder catItemsCountFeatured, pl.net.yuri.magister.soap.holders.ArrayOfSearchResponseHolder catItemsArray) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[25]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#showcat");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doShowCat"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{sessionHandle, new java.lang.Integer(catId), new java.lang.Integer(catItemState), new java.lang.Integer(catItemOption), catItemDurationOption, catAttribFields, new java.lang.Integer(catSortOptions), catItemsPrice, new java.lang.Integer(catItemsOffset), new java.lang.Integer(catItemsLimit), new java.lang.Integer(catOrderFulfillmentTime)});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                java.util.Map _output;
                _output = _call.getOutputParams();
                try {
                    catParentArray.value = (pl.net.yuri.magister.soap.InfoCatList[]) _output.get(new javax.xml.namespace.QName("", "cat-parent-array"));
                } catch (java.lang.Exception _exception) {
                    catParentArray.value = (pl.net.yuri.magister.soap.InfoCatList[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "cat-parent-array")), pl.net.yuri.magister.soap.InfoCatList[].class);
                }
                try {
                    catChildArray.value = (pl.net.yuri.magister.soap.InfoCatList[]) _output.get(new javax.xml.namespace.QName("", "cat-child-array"));
                } catch (java.lang.Exception _exception) {
                    catChildArray.value = (pl.net.yuri.magister.soap.InfoCatList[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "cat-child-array")), pl.net.yuri.magister.soap.InfoCatList[].class);
                }
                try {
                    catSisterArray.value = (pl.net.yuri.magister.soap.InfoCatList[]) _output.get(new javax.xml.namespace.QName("", "cat-sister-array"));
                } catch (java.lang.Exception _exception) {
                    catSisterArray.value = (pl.net.yuri.magister.soap.InfoCatList[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "cat-sister-array")), pl.net.yuri.magister.soap.InfoCatList[].class);
                }
                try {
                    catItemsCount.value = ((java.lang.Integer) _output.get(new javax.xml.namespace.QName("", "cat-items-count"))).intValue();
                } catch (java.lang.Exception _exception) {
                    catItemsCount.value = ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "cat-items-count")), int.class)).intValue();
                }
                try {
                    catItemsCountFeatured.value = ((java.lang.Integer) _output.get(new javax.xml.namespace.QName("", "cat-items-count-featured"))).intValue();
                } catch (java.lang.Exception _exception) {
                    catItemsCountFeatured.value = ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "cat-items-count-featured")), int.class)).intValue();
                }
                try {
                    catItemsArray.value = (pl.net.yuri.magister.soap.SearchResponseType[]) _output.get(new javax.xml.namespace.QName("", "cat-items-array"));
                } catch (java.lang.Exception _exception) {
                    catItemsArray.value = (pl.net.yuri.magister.soap.SearchResponseType[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "cat-items-array")), pl.net.yuri.magister.soap.SearchResponseType[].class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public void doShowItemInfo(java.lang.String sessionHandle, long itemId, int getDesc, int getImageUrl, int getAttribs, int getPostageOptions, int getCompanyInfo, pl.net.yuri.magister.soap.holders.ItemInfoHolder itemListInfo, pl.net.yuri.magister.soap.holders.ArrayOfItemCatListHolder itemCatPath, pl.net.yuri.magister.soap.holders.ArrayOfItemImageListHolder itemImgList, pl.net.yuri.magister.soap.holders.ArrayOfAttribStructHolder itemAttribList, pl.net.yuri.magister.soap.holders.ArrayOfPostageStructHolder itemPostageOptions, pl.net.yuri.magister.soap.holders.ItemPaymentOptionsHolder itemPaymentOptions, pl.net.yuri.magister.soap.holders.CompanyInfoStructHolder itemCompanyInfo) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[26]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#showiteminfo");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doShowItemInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{sessionHandle, new java.lang.Long(itemId), new java.lang.Integer(getDesc), new java.lang.Integer(getImageUrl), new java.lang.Integer(getAttribs), new java.lang.Integer(getPostageOptions), new java.lang.Integer(getCompanyInfo)});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                java.util.Map _output;
                _output = _call.getOutputParams();
                try {
                    itemListInfo.value = (pl.net.yuri.magister.soap.ItemInfo) _output.get(new javax.xml.namespace.QName("", "item-list-info"));
                } catch (java.lang.Exception _exception) {
                    itemListInfo.value = (pl.net.yuri.magister.soap.ItemInfo) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "item-list-info")), pl.net.yuri.magister.soap.ItemInfo.class);
                }
                try {
                    itemCatPath.value = (pl.net.yuri.magister.soap.ItemCatList[]) _output.get(new javax.xml.namespace.QName("", "item-cat-path"));
                } catch (java.lang.Exception _exception) {
                    itemCatPath.value = (pl.net.yuri.magister.soap.ItemCatList[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "item-cat-path")), pl.net.yuri.magister.soap.ItemCatList[].class);
                }
                try {
                    itemImgList.value = (pl.net.yuri.magister.soap.ItemImageList[]) _output.get(new javax.xml.namespace.QName("", "item-img-list"));
                } catch (java.lang.Exception _exception) {
                    itemImgList.value = (pl.net.yuri.magister.soap.ItemImageList[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "item-img-list")), pl.net.yuri.magister.soap.ItemImageList[].class);
                }
                try {
                    itemAttribList.value = (pl.net.yuri.magister.soap.AttribStruct[]) _output.get(new javax.xml.namespace.QName("", "item-attrib-list"));
                } catch (java.lang.Exception _exception) {
                    itemAttribList.value = (pl.net.yuri.magister.soap.AttribStruct[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "item-attrib-list")), pl.net.yuri.magister.soap.AttribStruct[].class);
                }
                try {
                    itemPostageOptions.value = (pl.net.yuri.magister.soap.PostageStruct[]) _output.get(new javax.xml.namespace.QName("", "item-postage-options"));
                } catch (java.lang.Exception _exception) {
                    itemPostageOptions.value = (pl.net.yuri.magister.soap.PostageStruct[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "item-postage-options")), pl.net.yuri.magister.soap.PostageStruct[].class);
                }
                try {
                    itemPaymentOptions.value = (pl.net.yuri.magister.soap.ItemPaymentOptions) _output.get(new javax.xml.namespace.QName("", "item-payment-options"));
                } catch (java.lang.Exception _exception) {
                    itemPaymentOptions.value = (pl.net.yuri.magister.soap.ItemPaymentOptions) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "item-payment-options")), pl.net.yuri.magister.soap.ItemPaymentOptions.class);
                }
                try {
                    itemCompanyInfo.value = (pl.net.yuri.magister.soap.CompanyInfoStruct) _output.get(new javax.xml.namespace.QName("", "item-company-info"));
                } catch (java.lang.Exception _exception) {
                    itemCompanyInfo.value = (pl.net.yuri.magister.soap.CompanyInfoStruct) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "item-company-info")), pl.net.yuri.magister.soap.CompanyInfoStruct.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public void doShowUser(java.lang.String webapiKey, int countryId, javax.xml.rpc.holders.LongHolder userId, javax.xml.rpc.holders.StringHolder userLogin, javax.xml.rpc.holders.IntHolder userCountry, javax.xml.rpc.holders.LongHolder userCreateDate, javax.xml.rpc.holders.LongHolder userLoginDate, javax.xml.rpc.holders.IntHolder userRating, javax.xml.rpc.holders.IntHolder userIsNewUser, javax.xml.rpc.holders.IntHolder userNotActivated, javax.xml.rpc.holders.IntHolder userClosed, javax.xml.rpc.holders.IntHolder userBlocked, javax.xml.rpc.holders.IntHolder userTerminated, javax.xml.rpc.holders.IntHolder userHasPage, javax.xml.rpc.holders.IntHolder userIsSseller, javax.xml.rpc.holders.IntHolder userIsEco, pl.net.yuri.magister.soap.holders.ShowUserFeedbacksHolder userPositiveFeedback, pl.net.yuri.magister.soap.holders.ShowUserFeedbacksHolder userNegativeFeedback, pl.net.yuri.magister.soap.holders.ShowUserFeedbacksHolder userNeutralFeedback, javax.xml.rpc.holders.IntHolder userJuniorStatus, javax.xml.rpc.holders.IntHolder userHasShop, javax.xml.rpc.holders.IntHolder userCompanyIcon, javax.xml.rpc.holders.IntHolder userSellRatingCount, pl.net.yuri.magister.soap.holders.ArrayOfSellRatingAverageStructHolder userSellRatingAverage, javax.xml.rpc.holders.IntHolder userIsAllegroStandard, javax.xml.rpc.holders.IntHolder userIsB2CSeller) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[27]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#showuser");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doShowUser"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{webapiKey, new java.lang.Integer(countryId), new java.lang.Long(userId.value), userLogin.value});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                java.util.Map _output;
                _output = _call.getOutputParams();
                try {
                    userId.value = ((java.lang.Long) _output.get(new javax.xml.namespace.QName("", "user-id"))).longValue();
                } catch (java.lang.Exception _exception) {
                    userId.value = ((java.lang.Long) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "user-id")), long.class)).longValue();
                }
                try {
                    userLogin.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("", "user-login"));
                } catch (java.lang.Exception _exception) {
                    userLogin.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "user-login")), java.lang.String.class);
                }
                try {
                    userCountry.value = ((java.lang.Integer) _output.get(new javax.xml.namespace.QName("", "user-country"))).intValue();
                } catch (java.lang.Exception _exception) {
                    userCountry.value = ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "user-country")), int.class)).intValue();
                }
                try {
                    userCreateDate.value = ((java.lang.Long) _output.get(new javax.xml.namespace.QName("", "user-create-date"))).longValue();
                } catch (java.lang.Exception _exception) {
                    userCreateDate.value = ((java.lang.Long) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "user-create-date")), long.class)).longValue();
                }
                try {
                    userLoginDate.value = ((java.lang.Long) _output.get(new javax.xml.namespace.QName("", "user-login-date"))).longValue();
                } catch (java.lang.Exception _exception) {
                    userLoginDate.value = ((java.lang.Long) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "user-login-date")), long.class)).longValue();
                }
                try {
                    userRating.value = ((java.lang.Integer) _output.get(new javax.xml.namespace.QName("", "user-rating"))).intValue();
                } catch (java.lang.Exception _exception) {
                    userRating.value = ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "user-rating")), int.class)).intValue();
                }
                try {
                    userIsNewUser.value = ((java.lang.Integer) _output.get(new javax.xml.namespace.QName("", "user-is-new-user"))).intValue();
                } catch (java.lang.Exception _exception) {
                    userIsNewUser.value = ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "user-is-new-user")), int.class)).intValue();
                }
                try {
                    userNotActivated.value = ((java.lang.Integer) _output.get(new javax.xml.namespace.QName("", "user-not-activated"))).intValue();
                } catch (java.lang.Exception _exception) {
                    userNotActivated.value = ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "user-not-activated")), int.class)).intValue();
                }
                try {
                    userClosed.value = ((java.lang.Integer) _output.get(new javax.xml.namespace.QName("", "user-closed"))).intValue();
                } catch (java.lang.Exception _exception) {
                    userClosed.value = ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "user-closed")), int.class)).intValue();
                }
                try {
                    userBlocked.value = ((java.lang.Integer) _output.get(new javax.xml.namespace.QName("", "user-blocked"))).intValue();
                } catch (java.lang.Exception _exception) {
                    userBlocked.value = ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "user-blocked")), int.class)).intValue();
                }
                try {
                    userTerminated.value = ((java.lang.Integer) _output.get(new javax.xml.namespace.QName("", "user-terminated"))).intValue();
                } catch (java.lang.Exception _exception) {
                    userTerminated.value = ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "user-terminated")), int.class)).intValue();
                }
                try {
                    userHasPage.value = ((java.lang.Integer) _output.get(new javax.xml.namespace.QName("", "user-has-page"))).intValue();
                } catch (java.lang.Exception _exception) {
                    userHasPage.value = ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "user-has-page")), int.class)).intValue();
                }
                try {
                    userIsSseller.value = ((java.lang.Integer) _output.get(new javax.xml.namespace.QName("", "user-is-sseller"))).intValue();
                } catch (java.lang.Exception _exception) {
                    userIsSseller.value = ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "user-is-sseller")), int.class)).intValue();
                }
                try {
                    userIsEco.value = ((java.lang.Integer) _output.get(new javax.xml.namespace.QName("", "user-is-eco"))).intValue();
                } catch (java.lang.Exception _exception) {
                    userIsEco.value = ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "user-is-eco")), int.class)).intValue();
                }
                try {
                    userPositiveFeedback.value = (pl.net.yuri.magister.soap.ShowUserFeedbacks) _output.get(new javax.xml.namespace.QName("", "user-positive-feedback"));
                } catch (java.lang.Exception _exception) {
                    userPositiveFeedback.value = (pl.net.yuri.magister.soap.ShowUserFeedbacks) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "user-positive-feedback")), pl.net.yuri.magister.soap.ShowUserFeedbacks.class);
                }
                try {
                    userNegativeFeedback.value = (pl.net.yuri.magister.soap.ShowUserFeedbacks) _output.get(new javax.xml.namespace.QName("", "user-negative-feedback"));
                } catch (java.lang.Exception _exception) {
                    userNegativeFeedback.value = (pl.net.yuri.magister.soap.ShowUserFeedbacks) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "user-negative-feedback")), pl.net.yuri.magister.soap.ShowUserFeedbacks.class);
                }
                try {
                    userNeutralFeedback.value = (pl.net.yuri.magister.soap.ShowUserFeedbacks) _output.get(new javax.xml.namespace.QName("", "user-neutral-feedback"));
                } catch (java.lang.Exception _exception) {
                    userNeutralFeedback.value = (pl.net.yuri.magister.soap.ShowUserFeedbacks) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "user-neutral-feedback")), pl.net.yuri.magister.soap.ShowUserFeedbacks.class);
                }
                try {
                    userJuniorStatus.value = ((java.lang.Integer) _output.get(new javax.xml.namespace.QName("", "user-junior-status"))).intValue();
                } catch (java.lang.Exception _exception) {
                    userJuniorStatus.value = ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "user-junior-status")), int.class)).intValue();
                }
                try {
                    userHasShop.value = ((java.lang.Integer) _output.get(new javax.xml.namespace.QName("", "user-has-shop"))).intValue();
                } catch (java.lang.Exception _exception) {
                    userHasShop.value = ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "user-has-shop")), int.class)).intValue();
                }
                try {
                    userCompanyIcon.value = ((java.lang.Integer) _output.get(new javax.xml.namespace.QName("", "user-company-icon"))).intValue();
                } catch (java.lang.Exception _exception) {
                    userCompanyIcon.value = ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "user-company-icon")), int.class)).intValue();
                }
                try {
                    userSellRatingCount.value = ((java.lang.Integer) _output.get(new javax.xml.namespace.QName("", "user-sell-rating-count"))).intValue();
                } catch (java.lang.Exception _exception) {
                    userSellRatingCount.value = ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "user-sell-rating-count")), int.class)).intValue();
                }
                try {
                    userSellRatingAverage.value = (pl.net.yuri.magister.soap.SellRatingAverageStruct[]) _output.get(new javax.xml.namespace.QName("", "user-sell-rating-average"));
                } catch (java.lang.Exception _exception) {
                    userSellRatingAverage.value = (pl.net.yuri.magister.soap.SellRatingAverageStruct[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "user-sell-rating-average")), pl.net.yuri.magister.soap.SellRatingAverageStruct[].class);
                }
                try {
                    userIsAllegroStandard.value = ((java.lang.Integer) _output.get(new javax.xml.namespace.QName("", "user-is-allegro-standard"))).intValue();
                } catch (java.lang.Exception _exception) {
                    userIsAllegroStandard.value = ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "user-is-allegro-standard")), int.class)).intValue();
                }
                try {
                    userIsB2CSeller.value = ((java.lang.Integer) _output.get(new javax.xml.namespace.QName("", "user-is-b2c-seller"))).intValue();
                } catch (java.lang.Exception _exception) {
                    userIsB2CSeller.value = ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "user-is-b2c-seller")), int.class)).intValue();
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public void doVerifyItem(java.lang.String sessionHandle, int localId, javax.xml.rpc.holders.LongHolder itemId, javax.xml.rpc.holders.IntHolder itemListed) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[28]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#verifyitem");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doVerifyItem"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{sessionHandle, new java.lang.Integer(localId)});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                java.util.Map _output;
                _output = _call.getOutputParams();
                try {
                    itemId.value = ((java.lang.Long) _output.get(new javax.xml.namespace.QName("", "item-id"))).longValue();
                } catch (java.lang.Exception _exception) {
                    itemId.value = ((java.lang.Long) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "item-id")), long.class)).longValue();
                }
                try {
                    itemListed.value = ((java.lang.Integer) _output.get(new javax.xml.namespace.QName("", "item-listed"))).intValue();
                } catch (java.lang.Exception _exception) {
                    itemListed.value = ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "item-listed")), int.class)).intValue();
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public void doAddWatchList(java.lang.String sessionHandle, long[] itemsIdArray, pl.net.yuri.magister.soap.holders.ArrayOfItemsIDHolder arrayItemsAddId, pl.net.yuri.magister.soap.holders.ArrayOfItemsIDHolder arrayItemsNotFound, pl.net.yuri.magister.soap.holders.ArrayOfItemsIDHolder arrayItemsAdminKilled) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[29]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#addwatch");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doAddWatchList"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{sessionHandle, itemsIdArray});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                java.util.Map _output;
                _output = _call.getOutputParams();
                try {
                    arrayItemsAddId.value = (long[]) _output.get(new javax.xml.namespace.QName("", "array-items-add-id"));
                } catch (java.lang.Exception _exception) {
                    arrayItemsAddId.value = (long[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "array-items-add-id")), long[].class);
                }
                try {
                    arrayItemsNotFound.value = (long[]) _output.get(new javax.xml.namespace.QName("", "array-items-not-found"));
                } catch (java.lang.Exception _exception) {
                    arrayItemsNotFound.value = (long[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "array-items-not-found")), long[].class);
                }
                try {
                    arrayItemsAdminKilled.value = (long[]) _output.get(new javax.xml.namespace.QName("", "array-items-admin-killed"));
                } catch (java.lang.Exception _exception) {
                    arrayItemsAdminKilled.value = (long[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "array-items-admin-killed")), long[].class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public int doFeedback(java.lang.String sessionHandle, int feItemId, int feFromUserId, int feToUserId, java.lang.String feComment, java.lang.String feCommentType, int feOp, pl.net.yuri.magister.soap.SellRatingEstimationStruct[] feRating) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[30]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#feedback");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doFeedback"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{sessionHandle, new java.lang.Integer(feItemId), new java.lang.Integer(feFromUserId), new java.lang.Integer(feToUserId), feComment, feCommentType, new java.lang.Integer(feOp), feRating});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return ((java.lang.Integer) _resp).intValue();
                } catch (java.lang.Exception _exception) {
                    return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public pl.net.yuri.magister.soap.BidListStruct2[] doGetBidItem2(java.lang.String sessionHandle, long itemId) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[31]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#getbiditem");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doGetBidItem2"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{sessionHandle, new java.lang.Long(itemId)});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (pl.net.yuri.magister.soap.BidListStruct2[]) _resp;
                } catch (java.lang.Exception _exception) {
                    return (pl.net.yuri.magister.soap.BidListStruct2[]) org.apache.axis.utils.JavaUtils.convert(_resp, pl.net.yuri.magister.soap.BidListStruct2[].class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public void doGetFeedback(java.lang.String sessionHandle, int feedbackFrom, int feedbackTo, int feedbackOffset, java.lang.String feedbackKindList, pl.net.yuri.magister.soap.holders.ArrayOfFeedbackListHolder feedbackList, javax.xml.rpc.holders.IntHolder feedbackCount) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[32]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#getfeedback");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doGetFeedback"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{sessionHandle, new java.lang.Integer(feedbackFrom), new java.lang.Integer(feedbackTo), new java.lang.Integer(feedbackOffset), feedbackKindList});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                java.util.Map _output;
                _output = _call.getOutputParams();
                try {
                    feedbackList.value = (pl.net.yuri.magister.soap.FeedbackList[]) _output.get(new javax.xml.namespace.QName("", "feedback-list"));
                } catch (java.lang.Exception _exception) {
                    feedbackList.value = (pl.net.yuri.magister.soap.FeedbackList[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "feedback-list")), pl.net.yuri.magister.soap.FeedbackList[].class);
                }
                try {
                    feedbackCount.value = ((java.lang.Integer) _output.get(new javax.xml.namespace.QName("", "feedback-count"))).intValue();
                } catch (java.lang.Exception _exception) {
                    feedbackCount.value = ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "feedback-count")), int.class)).intValue();
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public pl.net.yuri.magister.soap.SiteJournal[] doGetSiteJournal(java.lang.String sessionHandle, long startingPoint, int infoType) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[33]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#getsitejournal");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doGetSiteJournal"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{sessionHandle, new java.lang.Long(startingPoint), new java.lang.Integer(infoType)});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (pl.net.yuri.magister.soap.SiteJournal[]) _resp;
                } catch (java.lang.Exception _exception) {
                    return (pl.net.yuri.magister.soap.SiteJournal[]) org.apache.axis.utils.JavaUtils.convert(_resp, pl.net.yuri.magister.soap.SiteJournal[].class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public pl.net.yuri.magister.soap.SiteJournalInfo doGetSiteJournalInfo(java.lang.String sessionHandle, long startingPoint, int infoType) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[34]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#getsitejournalinfo");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doGetSiteJournalInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{sessionHandle, new java.lang.Long(startingPoint), new java.lang.Integer(infoType)});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (pl.net.yuri.magister.soap.SiteJournalInfo) _resp;
                } catch (java.lang.Exception _exception) {
                    return (pl.net.yuri.magister.soap.SiteJournalInfo) org.apache.axis.utils.JavaUtils.convert(_resp, pl.net.yuri.magister.soap.SiteJournalInfo.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public pl.net.yuri.magister.soap.MyAccountStruct2[] doMyAccount2(java.lang.String sessionHandle, java.lang.String accountType, int offset, int[] itemsArray, int limit) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[35]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#myaccount");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doMyAccount2"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{sessionHandle, accountType, new java.lang.Integer(offset), itemsArray, new java.lang.Integer(limit)});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (pl.net.yuri.magister.soap.MyAccountStruct2[]) _resp;
                } catch (java.lang.Exception _exception) {
                    return (pl.net.yuri.magister.soap.MyAccountStruct2[]) org.apache.axis.utils.JavaUtils.convert(_resp, pl.net.yuri.magister.soap.MyAccountStruct2[].class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public int doMyAccountItemsCount(java.lang.String sessionHandle, java.lang.String accountType, int[] itemsArray) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[36]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#myaccountitemscount");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doMyAccountItemsCount"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{sessionHandle, accountType, itemsArray});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return ((java.lang.Integer) _resp).intValue();
                } catch (java.lang.Exception _exception) {
                    return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public java.lang.String doMyBilling(java.lang.String sessionHandle) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[37]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#mybilling");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doMyBilling"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{sessionHandle});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (java.lang.String) _resp;
                } catch (java.lang.Exception _exception) {
                    return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public pl.net.yuri.magister.soap.MyContactList[] doMyContact(java.lang.String sessionHandle, int[] auctionIdList, int offset, int desc) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[38]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#mycontacts");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doMyContact"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{sessionHandle, auctionIdList, new java.lang.Integer(offset), new java.lang.Integer(desc)});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (pl.net.yuri.magister.soap.MyContactList[]) _resp;
                } catch (java.lang.Exception _exception) {
                    return (pl.net.yuri.magister.soap.MyContactList[]) org.apache.axis.utils.JavaUtils.convert(_resp, pl.net.yuri.magister.soap.MyContactList[].class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public pl.net.yuri.magister.soap.MyFeedbackListStruct2[] doMyFeedback2(java.lang.String sessionHandle, java.lang.String feedbackType, int offset, int desc, int[] itemsArray) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[39]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#myfeedback");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doMyFeedback2"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{sessionHandle, feedbackType, new java.lang.Integer(offset), new java.lang.Integer(desc), itemsArray});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (pl.net.yuri.magister.soap.MyFeedbackListStruct2[]) _resp;
                } catch (java.lang.Exception _exception) {
                    return (pl.net.yuri.magister.soap.MyFeedbackListStruct2[]) org.apache.axis.utils.JavaUtils.convert(_resp, pl.net.yuri.magister.soap.MyFeedbackListStruct2[].class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public void doSearch(java.lang.String sessionHandle, pl.net.yuri.magister.soap.SearchOptType searchQuery, javax.xml.rpc.holders.IntHolder searchCount, javax.xml.rpc.holders.IntHolder searchCountFeatured, pl.net.yuri.magister.soap.holders.ArrayOfSearchResponseHolder searchArray, pl.net.yuri.magister.soap.holders.ArrayOfExcludedWordsHolder searchExcludedWords) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[40]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#search");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doSearch"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{sessionHandle, searchQuery});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                java.util.Map _output;
                _output = _call.getOutputParams();
                try {
                    searchCount.value = ((java.lang.Integer) _output.get(new javax.xml.namespace.QName("", "search-count"))).intValue();
                } catch (java.lang.Exception _exception) {
                    searchCount.value = ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "search-count")), int.class)).intValue();
                }
                try {
                    searchCountFeatured.value = ((java.lang.Integer) _output.get(new javax.xml.namespace.QName("", "search-count-featured"))).intValue();
                } catch (java.lang.Exception _exception) {
                    searchCountFeatured.value = ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "search-count-featured")), int.class)).intValue();
                }
                try {
                    searchArray.value = (pl.net.yuri.magister.soap.SearchResponseType[]) _output.get(new javax.xml.namespace.QName("", "search-array"));
                } catch (java.lang.Exception _exception) {
                    searchArray.value = (pl.net.yuri.magister.soap.SearchResponseType[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "search-array")), pl.net.yuri.magister.soap.SearchResponseType[].class);
                }
                try {
                    searchExcludedWords.value = (java.lang.String[]) _output.get(new javax.xml.namespace.QName("", "search-excluded-words"));
                } catch (java.lang.Exception _exception) {
                    searchExcludedWords.value = (java.lang.String[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "search-excluded-words")), java.lang.String[].class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public float doGetAdminUserLicenceDate(java.lang.String adminSessionHandle, java.lang.String userLicLogin) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[41]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#getadminuserlicdate");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doGetAdminUserLicenceDate"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{adminSessionHandle, userLicLogin});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return ((java.lang.Float) _resp).floatValue();
                } catch (java.lang.Exception _exception) {
                    return ((java.lang.Float) org.apache.axis.utils.JavaUtils.convert(_resp, float.class)).floatValue();
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public float doGetUserLicenceDate(java.lang.String sessionHandle) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[42]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#getuserlicdate");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doGetUserLicenceDate"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{sessionHandle});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return ((java.lang.Float) _resp).floatValue();
                } catch (java.lang.Exception _exception) {
                    return ((java.lang.Float) org.apache.axis.utils.JavaUtils.convert(_resp, float.class)).floatValue();
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public void doMyBillingItem(java.lang.String sessionHandle, int itemId, java.lang.String option, pl.net.yuri.magister.soap.holders.ItemBillingListHolder entryFees, pl.net.yuri.magister.soap.holders.ItemBillingListHolder endingFees) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[43]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#billingitem");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doMyBillingItem"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{sessionHandle, new java.lang.Integer(itemId), option});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                java.util.Map _output;
                _output = _call.getOutputParams();
                try {
                    entryFees.value = (pl.net.yuri.magister.soap.ItemBilling[]) _output.get(new javax.xml.namespace.QName("", "entry-fees"));
                } catch (java.lang.Exception _exception) {
                    entryFees.value = (pl.net.yuri.magister.soap.ItemBilling[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "entry-fees")), pl.net.yuri.magister.soap.ItemBilling[].class);
                }
                try {
                    endingFees.value = (pl.net.yuri.magister.soap.ItemBilling[]) _output.get(new javax.xml.namespace.QName("", "ending-fees"));
                } catch (java.lang.Exception _exception) {
                    endingFees.value = (pl.net.yuri.magister.soap.ItemBilling[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "ending-fees")), pl.net.yuri.magister.soap.ItemBilling[].class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public int doSetUserLicenceDate(java.lang.String adminSessionHandle, java.lang.String userLicLogin, int userLicCountry, float userLicDate) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[44]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#setuserlicdate");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doSetUserLicenceDate"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{adminSessionHandle, userLicLogin, new java.lang.Integer(userLicCountry), new java.lang.Float(userLicDate)});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return ((java.lang.Integer) _resp).intValue();
                } catch (java.lang.Exception _exception) {
                    return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public java.lang.String doBidItem(java.lang.String sessionHandle, long bidItId, float bidUserPrice, long bidQuantity, long bidBuyNow) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[45]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#biditem");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doBidItem"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{sessionHandle, new java.lang.Long(bidItId), new java.lang.Float(bidUserPrice), new java.lang.Long(bidQuantity), new java.lang.Long(bidBuyNow)});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (java.lang.String) _resp;
                } catch (java.lang.Exception _exception) {
                    return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public void doCancelBidItem(java.lang.String sessionHandle, long cancelItemId, int[] cancelBidsArray, java.lang.String cancelBidsReason, long cancelAddToBlackList, javax.xml.rpc.holders.IntHolder cancelBidValue, pl.net.yuri.magister.soap.holders.ArrayOfCancelBidsIDHolder cancelledBids, pl.net.yuri.magister.soap.holders.ArrayOfCancelBidsIDHolder notCancelledBids) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[46]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#cancelbiditem");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doCancelBidItem"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{sessionHandle, new java.lang.Long(cancelItemId), cancelBidsArray, cancelBidsReason, new java.lang.Long(cancelAddToBlackList)});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                java.util.Map _output;
                _output = _call.getOutputParams();
                try {
                    cancelBidValue.value = ((java.lang.Integer) _output.get(new javax.xml.namespace.QName("", "cancel-bid-value"))).intValue();
                } catch (java.lang.Exception _exception) {
                    cancelBidValue.value = ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "cancel-bid-value")), int.class)).intValue();
                }
                try {
                    cancelledBids.value = (int[]) _output.get(new javax.xml.namespace.QName("", "cancelled-bids"));
                } catch (java.lang.Exception _exception) {
                    cancelledBids.value = (int[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "cancelled-bids")), int[].class);
                }
                try {
                    notCancelledBids.value = (int[]) _output.get(new javax.xml.namespace.QName("", "not-cancelled-bids"));
                } catch (java.lang.Exception _exception) {
                    notCancelledBids.value = (int[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "not-cancelled-bids")), int[].class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public java.lang.String doChangePriceItem(java.lang.String sessionHandle, javax.xml.rpc.holders.LongHolder itemId, float newStartingPrice, float newReservePrice, float newBuyNowPrice) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[47]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#changeprice");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doChangePriceItem"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{sessionHandle, new java.lang.Long(itemId.value), new java.lang.Float(newStartingPrice), new java.lang.Float(newReservePrice), new java.lang.Float(newBuyNowPrice)});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                java.util.Map _output;
                _output = _call.getOutputParams();
                try {
                    itemId.value = ((java.lang.Long) _output.get(new javax.xml.namespace.QName("", "item-id"))).longValue();
                } catch (java.lang.Exception _exception) {
                    itemId.value = ((java.lang.Long) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "item-id")), long.class)).longValue();
                }
                try {
                    return (java.lang.String) _resp;
                } catch (java.lang.Exception _exception) {
                    return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public int doFinishItem(java.lang.String sessionHandle, long finishItemId, int finishCancelAllBids, java.lang.String finishCancelReason) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[48]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#finishauction");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doFinishItem"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{sessionHandle, new java.lang.Long(finishItemId), new java.lang.Integer(finishCancelAllBids), finishCancelReason});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return ((java.lang.Integer) _resp).intValue();
                } catch (java.lang.Exception _exception) {
                    return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public int doRequestCancelBid(java.lang.String sessionHandle, long requestItemId, java.lang.String requestCancelReason) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[49]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#requestcancelbid");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doRequestCancelBid"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{sessionHandle, new java.lang.Long(requestItemId), requestCancelReason});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return ((java.lang.Integer) _resp).intValue();
                } catch (java.lang.Exception _exception) {
                    return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public void doGetCatsDataCount(int countryId, long localVersion, java.lang.String webapiKey, javax.xml.rpc.holders.IntHolder catsCount, javax.xml.rpc.holders.LongHolder verKey, javax.xml.rpc.holders.StringHolder verStr) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[50]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#catsdatacount");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doGetCatsDataCount"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{new java.lang.Integer(countryId), new java.lang.Long(localVersion), webapiKey});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                java.util.Map _output;
                _output = _call.getOutputParams();
                try {
                    catsCount.value = ((java.lang.Integer) _output.get(new javax.xml.namespace.QName("", "cats-count"))).intValue();
                } catch (java.lang.Exception _exception) {
                    catsCount.value = ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "cats-count")), int.class)).intValue();
                }
                try {
                    verKey.value = ((java.lang.Long) _output.get(new javax.xml.namespace.QName("", "ver-key"))).longValue();
                } catch (java.lang.Exception _exception) {
                    verKey.value = ((java.lang.Long) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "ver-key")), long.class)).longValue();
                }
                try {
                    verStr.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("", "ver-str"));
                } catch (java.lang.Exception _exception) {
                    verStr.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "ver-str")), java.lang.String.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public pl.net.yuri.magister.soap.MyFeedbackListStruct2[] doMyFeedback2Limit(java.lang.String sessionHandle, java.lang.String feedbackType, int offset, int desc, int[] itemsArray, int packageElement) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[51]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#myfeedbacklimit");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doMyFeedback2Limit"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{sessionHandle, feedbackType, new java.lang.Integer(offset), new java.lang.Integer(desc), itemsArray, new java.lang.Integer(packageElement)});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (pl.net.yuri.magister.soap.MyFeedbackListStruct2[]) _resp;
                } catch (java.lang.Exception _exception) {
                    return (pl.net.yuri.magister.soap.MyFeedbackListStruct2[]) org.apache.axis.utils.JavaUtils.convert(_resp, pl.net.yuri.magister.soap.MyFeedbackListStruct2[].class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public pl.net.yuri.magister.soap.CountryInfoType[] doGetCountries(int countryCode, java.lang.String webapiKey) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[52]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#getcountry");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doGetCountries"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{new java.lang.Integer(countryCode), webapiKey});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (pl.net.yuri.magister.soap.CountryInfoType[]) _resp;
                } catch (java.lang.Exception _exception) {
                    return (pl.net.yuri.magister.soap.CountryInfoType[]) org.apache.axis.utils.JavaUtils.convert(_resp, pl.net.yuri.magister.soap.CountryInfoType[].class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public pl.net.yuri.magister.soap.TemplateInfoType[] doGetServiceTemplates(int countryCode, java.lang.String webapiKey) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[53]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#gettemplates");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doGetServiceTemplates"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{new java.lang.Integer(countryCode), webapiKey});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (pl.net.yuri.magister.soap.TemplateInfoType[]) _resp;
                } catch (java.lang.Exception _exception) {
                    return (pl.net.yuri.magister.soap.TemplateInfoType[]) org.apache.axis.utils.JavaUtils.convert(_resp, pl.net.yuri.magister.soap.TemplateInfoType[].class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public void doGetSellFormAttribs(int countryId, java.lang.String webapiKey, long localVersion, int catId, pl.net.yuri.magister.soap.holders.ArrayOfSellFormsHolder sellFormFields, javax.xml.rpc.holders.LongHolder verKey, javax.xml.rpc.holders.StringHolder verStr) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[54]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#sellformattribs");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doGetSellFormAttribs"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{new java.lang.Integer(countryId), webapiKey, new java.lang.Long(localVersion), new java.lang.Integer(catId)});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                java.util.Map _output;
                _output = _call.getOutputParams();
                try {
                    sellFormFields.value = (pl.net.yuri.magister.soap.SellFormType[]) _output.get(new javax.xml.namespace.QName("", "sell-form-fields"));
                } catch (java.lang.Exception _exception) {
                    sellFormFields.value = (pl.net.yuri.magister.soap.SellFormType[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "sell-form-fields")), pl.net.yuri.magister.soap.SellFormType[].class);
                }
                try {
                    verKey.value = ((java.lang.Long) _output.get(new javax.xml.namespace.QName("", "ver-key"))).longValue();
                } catch (java.lang.Exception _exception) {
                    verKey.value = ((java.lang.Long) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "ver-key")), long.class)).longValue();
                }
                try {
                    verStr.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("", "ver-str"));
                } catch (java.lang.Exception _exception) {
                    verStr.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "ver-str")), java.lang.String.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public pl.net.yuri.magister.soap.FeedbackResultStruct[] doFeedbackMany(java.lang.String sessionHandle, pl.net.yuri.magister.soap.FeedbackManyStruct[] feedbacksList) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[55]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#feedbackmany");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doFeedbackMany"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{sessionHandle, feedbacksList});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (pl.net.yuri.magister.soap.FeedbackResultStruct[]) _resp;
                } catch (java.lang.Exception _exception) {
                    return (pl.net.yuri.magister.soap.FeedbackResultStruct[]) org.apache.axis.utils.JavaUtils.convert(_resp, pl.net.yuri.magister.soap.FeedbackResultStruct[].class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public void doShowItemInfoExt(java.lang.String sessionHandle, long itemId, int getDesc, int getImageUrl, int getAttribs, int getPostageOptions, int getCompanyInfo, pl.net.yuri.magister.soap.holders.ItemInfoExtHolder itemListInfoExt, pl.net.yuri.magister.soap.holders.ArrayOfItemCatListHolder itemCatPath, pl.net.yuri.magister.soap.holders.ArrayOfItemImageListHolder itemImgList, pl.net.yuri.magister.soap.holders.ArrayOfAttribStructHolder itemAttribList, pl.net.yuri.magister.soap.holders.ArrayOfPostageStructHolder itemPostageOptions, pl.net.yuri.magister.soap.holders.ItemPaymentOptionsHolder itemPaymentOptions, pl.net.yuri.magister.soap.holders.CompanyInfoStructHolder itemCompanyInfo) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[56]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#showiteminfoext");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doShowItemInfoExt"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{sessionHandle, new java.lang.Long(itemId), new java.lang.Integer(getDesc), new java.lang.Integer(getImageUrl), new java.lang.Integer(getAttribs), new java.lang.Integer(getPostageOptions), new java.lang.Integer(getCompanyInfo)});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                java.util.Map _output;
                _output = _call.getOutputParams();
                try {
                    itemListInfoExt.value = (pl.net.yuri.magister.soap.ItemInfoExt) _output.get(new javax.xml.namespace.QName("", "item-list-info-ext"));
                } catch (java.lang.Exception _exception) {
                    itemListInfoExt.value = (pl.net.yuri.magister.soap.ItemInfoExt) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "item-list-info-ext")), pl.net.yuri.magister.soap.ItemInfoExt.class);
                }
                try {
                    itemCatPath.value = (pl.net.yuri.magister.soap.ItemCatList[]) _output.get(new javax.xml.namespace.QName("", "item-cat-path"));
                } catch (java.lang.Exception _exception) {
                    itemCatPath.value = (pl.net.yuri.magister.soap.ItemCatList[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "item-cat-path")), pl.net.yuri.magister.soap.ItemCatList[].class);
                }
                try {
                    itemImgList.value = (pl.net.yuri.magister.soap.ItemImageList[]) _output.get(new javax.xml.namespace.QName("", "item-img-list"));
                } catch (java.lang.Exception _exception) {
                    itemImgList.value = (pl.net.yuri.magister.soap.ItemImageList[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "item-img-list")), pl.net.yuri.magister.soap.ItemImageList[].class);
                }
                try {
                    itemAttribList.value = (pl.net.yuri.magister.soap.AttribStruct[]) _output.get(new javax.xml.namespace.QName("", "item-attrib-list"));
                } catch (java.lang.Exception _exception) {
                    itemAttribList.value = (pl.net.yuri.magister.soap.AttribStruct[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "item-attrib-list")), pl.net.yuri.magister.soap.AttribStruct[].class);
                }
                try {
                    itemPostageOptions.value = (pl.net.yuri.magister.soap.PostageStruct[]) _output.get(new javax.xml.namespace.QName("", "item-postage-options"));
                } catch (java.lang.Exception _exception) {
                    itemPostageOptions.value = (pl.net.yuri.magister.soap.PostageStruct[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "item-postage-options")), pl.net.yuri.magister.soap.PostageStruct[].class);
                }
                try {
                    itemPaymentOptions.value = (pl.net.yuri.magister.soap.ItemPaymentOptions) _output.get(new javax.xml.namespace.QName("", "item-payment-options"));
                } catch (java.lang.Exception _exception) {
                    itemPaymentOptions.value = (pl.net.yuri.magister.soap.ItemPaymentOptions) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "item-payment-options")), pl.net.yuri.magister.soap.ItemPaymentOptions.class);
                }
                try {
                    itemCompanyInfo.value = (pl.net.yuri.magister.soap.CompanyInfoStruct) _output.get(new javax.xml.namespace.QName("", "item-company-info"));
                } catch (java.lang.Exception _exception) {
                    itemCompanyInfo.value = (pl.net.yuri.magister.soap.CompanyInfoStruct) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "item-company-info")), pl.net.yuri.magister.soap.CompanyInfoStruct.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public int doGetWaitingFeedbacksCount(java.lang.String sessionHandle) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[57]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#waitfeedcount");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doGetWaitingFeedbacksCount"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{sessionHandle});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return ((java.lang.Integer) _resp).intValue();
                } catch (java.lang.Exception _exception) {
                    return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public pl.net.yuri.magister.soap.WaitFeedbackStruct[] doGetWaitingFeedbacks(java.lang.String sessionHandle, int offset, int packageSize) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[58]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#waitfeed");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doGetWaitingFeedbacks"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{sessionHandle, new java.lang.Integer(offset), new java.lang.Integer(packageSize)});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (pl.net.yuri.magister.soap.WaitFeedbackStruct[]) _resp;
                } catch (java.lang.Exception _exception) {
                    return (pl.net.yuri.magister.soap.WaitFeedbackStruct[]) org.apache.axis.utils.JavaUtils.convert(_resp, pl.net.yuri.magister.soap.WaitFeedbackStruct[].class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public pl.net.yuri.magister.soap.BlackListStruct[] doGetBlackListUsers(java.lang.String sessionHandle) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[59]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#getblacklist");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doGetBlackListUsers"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{sessionHandle});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (pl.net.yuri.magister.soap.BlackListStruct[]) _resp;
                } catch (java.lang.Exception _exception) {
                    return (pl.net.yuri.magister.soap.BlackListStruct[]) org.apache.axis.utils.JavaUtils.convert(_resp, pl.net.yuri.magister.soap.BlackListStruct[].class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public pl.net.yuri.magister.soap.BlackListResStruct[] doRemoveFromBlackList(java.lang.String sessionHandle, long[] usersIdArray) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[60]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#removefromblacklist");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doRemoveFromBlackList"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{sessionHandle, usersIdArray});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (pl.net.yuri.magister.soap.BlackListResStruct[]) _resp;
                } catch (java.lang.Exception _exception) {
                    return (pl.net.yuri.magister.soap.BlackListResStruct[]) org.apache.axis.utils.JavaUtils.convert(_resp, pl.net.yuri.magister.soap.BlackListResStruct[].class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public pl.net.yuri.magister.soap.ServiceInfoCatStruct[] doGetServiceInfoCategories(int countryCode, java.lang.String webapiKey) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[61]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#getannouncementcats");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doGetServiceInfoCategories"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{new java.lang.Integer(countryCode), webapiKey});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (pl.net.yuri.magister.soap.ServiceInfoCatStruct[]) _resp;
                } catch (java.lang.Exception _exception) {
                    return (pl.net.yuri.magister.soap.ServiceInfoCatStruct[]) org.apache.axis.utils.JavaUtils.convert(_resp, pl.net.yuri.magister.soap.ServiceInfoCatStruct[].class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public pl.net.yuri.magister.soap.ServiceInfoStruct[] doGetServiceInfo(int countryCode, int anCatId, long anItDate, int anItId, java.lang.String webapiKey) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[62]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#getannouncementitems");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doGetServiceInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{new java.lang.Integer(countryCode), new java.lang.Integer(anCatId), new java.lang.Long(anItDate), new java.lang.Integer(anItId), webapiKey});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (pl.net.yuri.magister.soap.ServiceInfoStruct[]) _resp;
                } catch (java.lang.Exception _exception) {
                    return (pl.net.yuri.magister.soap.ServiceInfoStruct[]) org.apache.axis.utils.JavaUtils.convert(_resp, pl.net.yuri.magister.soap.ServiceInfoStruct[].class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public pl.net.yuri.magister.soap.StateInfoStruct[] doGetStatesInfo(int countryCode, java.lang.String webapiKey) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[63]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#getstatesinfo");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doGetStatesInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{new java.lang.Integer(countryCode), webapiKey});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (pl.net.yuri.magister.soap.StateInfoStruct[]) _resp;
                } catch (java.lang.Exception _exception) {
                    return (pl.net.yuri.magister.soap.StateInfoStruct[]) org.apache.axis.utils.JavaUtils.convert(_resp, pl.net.yuri.magister.soap.StateInfoStruct[].class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public pl.net.yuri.magister.soap.CatInfoType[] doGetShopCatsData(java.lang.String sessionHandle) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[64]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#shopcatsdata");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doGetShopCatsData"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{sessionHandle});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (pl.net.yuri.magister.soap.CatInfoType[]) _resp;
                } catch (java.lang.Exception _exception) {
                    return (pl.net.yuri.magister.soap.CatInfoType[]) org.apache.axis.utils.JavaUtils.convert(_resp, pl.net.yuri.magister.soap.CatInfoType[].class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public int doCheckExternalKey(java.lang.String webapiKey, long userId, long itemId, java.lang.String hashKey) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[65]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#checkexternalkey");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doCheckExternalKey"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{webapiKey, new java.lang.Long(userId), new java.lang.Long(itemId), hashKey});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return ((java.lang.Integer) _resp).intValue();
                } catch (java.lang.Exception _exception) {
                    return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public void doSellSomeAgainInShop(java.lang.String sessionHandle, long[] sellItemsArray, long sellStartingTime, int sellShopDuration, int sellShopOptions, int sellProlongOptions, long sellShopCategory, pl.net.yuri.magister.soap.holders.ArrayOfStructSellAgainHolder itemsSellAgain, pl.net.yuri.magister.soap.holders.ArrayOfStructSellFailedHolder itemsSellFailed, pl.net.yuri.magister.soap.holders.ArrayOfItemsIDHolder itemsSellNotFound) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[66]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#sellshopagain");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doSellSomeAgainInShop"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{sessionHandle, sellItemsArray, new java.lang.Long(sellStartingTime), new java.lang.Integer(sellShopDuration), new java.lang.Integer(sellShopOptions), new java.lang.Integer(sellProlongOptions), new java.lang.Long(sellShopCategory)});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                java.util.Map _output;
                _output = _call.getOutputParams();
                try {
                    itemsSellAgain.value = (pl.net.yuri.magister.soap.StructSellAgain[]) _output.get(new javax.xml.namespace.QName("", "items-sell-again"));
                } catch (java.lang.Exception _exception) {
                    itemsSellAgain.value = (pl.net.yuri.magister.soap.StructSellAgain[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "items-sell-again")), pl.net.yuri.magister.soap.StructSellAgain[].class);
                }
                try {
                    itemsSellFailed.value = (pl.net.yuri.magister.soap.StructSellFailed[]) _output.get(new javax.xml.namespace.QName("", "items-sell-failed"));
                } catch (java.lang.Exception _exception) {
                    itemsSellFailed.value = (pl.net.yuri.magister.soap.StructSellFailed[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "items-sell-failed")), pl.net.yuri.magister.soap.StructSellFailed[].class);
                }
                try {
                    itemsSellNotFound.value = (long[]) _output.get(new javax.xml.namespace.QName("", "items-sell-not-found"));
                } catch (java.lang.Exception _exception) {
                    itemsSellNotFound.value = (long[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "items-sell-not-found")), long[].class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public int doGetSuperSellerStatus(java.lang.String webapiKey, long userId) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[67]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#getsupersellerstatus");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doGetSuperSellerStatus"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{webapiKey, new java.lang.Long(userId)});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return ((java.lang.Integer) _resp).intValue();
                } catch (java.lang.Exception _exception) {
                    return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public void doGetMyData(java.lang.String sessionHandle, pl.net.yuri.magister.soap.holders.UserDataStructHolder userData, pl.net.yuri.magister.soap.holders.InvoiceDataStructHolder invoiceData, pl.net.yuri.magister.soap.holders.CompanyExtraDataStructHolder companyExtraData, pl.net.yuri.magister.soap.holders.CompanySecondAddressStructHolder companySecondAddress, pl.net.yuri.magister.soap.holders.PharmacyDataStructHolder pharmacyData, pl.net.yuri.magister.soap.holders.AlcoholDataStructHolder alcoholData) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[68]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#getmydata");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doGetMyData"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{sessionHandle});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                java.util.Map _output;
                _output = _call.getOutputParams();
                try {
                    userData.value = (pl.net.yuri.magister.soap.UserDataStruct) _output.get(new javax.xml.namespace.QName("", "user-data"));
                } catch (java.lang.Exception _exception) {
                    userData.value = (pl.net.yuri.magister.soap.UserDataStruct) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "user-data")), pl.net.yuri.magister.soap.UserDataStruct.class);
                }
                try {
                    invoiceData.value = (pl.net.yuri.magister.soap.InvoiceDataStruct) _output.get(new javax.xml.namespace.QName("", "invoice-data"));
                } catch (java.lang.Exception _exception) {
                    invoiceData.value = (pl.net.yuri.magister.soap.InvoiceDataStruct) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "invoice-data")), pl.net.yuri.magister.soap.InvoiceDataStruct.class);
                }
                try {
                    companyExtraData.value = (pl.net.yuri.magister.soap.CompanyExtraDataStruct) _output.get(new javax.xml.namespace.QName("", "company-extra-data"));
                } catch (java.lang.Exception _exception) {
                    companyExtraData.value = (pl.net.yuri.magister.soap.CompanyExtraDataStruct) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "company-extra-data")), pl.net.yuri.magister.soap.CompanyExtraDataStruct.class);
                }
                try {
                    companySecondAddress.value = (pl.net.yuri.magister.soap.CompanySecondAddressStruct) _output.get(new javax.xml.namespace.QName("", "company-second-address"));
                } catch (java.lang.Exception _exception) {
                    companySecondAddress.value = (pl.net.yuri.magister.soap.CompanySecondAddressStruct) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "company-second-address")), pl.net.yuri.magister.soap.CompanySecondAddressStruct.class);
                }
                try {
                    pharmacyData.value = (pl.net.yuri.magister.soap.PharmacyDataStruct) _output.get(new javax.xml.namespace.QName("", "pharmacy-data"));
                } catch (java.lang.Exception _exception) {
                    pharmacyData.value = (pl.net.yuri.magister.soap.PharmacyDataStruct) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "pharmacy-data")), pl.net.yuri.magister.soap.PharmacyDataStruct.class);
                }
                try {
                    alcoholData.value = (pl.net.yuri.magister.soap.AlcoholDataStruct) _output.get(new javax.xml.namespace.QName("", "alcohol-data"));
                } catch (java.lang.Exception _exception) {
                    alcoholData.value = (pl.net.yuri.magister.soap.AlcoholDataStruct) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "alcohol-data")), pl.net.yuri.magister.soap.AlcoholDataStruct.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public int doInternalIStoreChange(java.lang.String webapiKey, long userId, long istoreId, java.lang.String actionType, long actionDate, long validDate) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[69]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#internalistorechange");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doInternalIStoreChange"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{webapiKey, new java.lang.Long(userId), new java.lang.Long(istoreId), actionType, new java.lang.Long(actionDate), new java.lang.Long(validDate)});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return ((java.lang.Integer) _resp).intValue();
                } catch (java.lang.Exception _exception) {
                    return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public pl.net.yuri.magister.soap.FavouritesSellersStruct[] doGetFavouriteSellers(java.lang.String sessionHandle) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[70]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#dogetfavouritesellers");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doGetFavouriteSellers"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{sessionHandle});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (pl.net.yuri.magister.soap.FavouritesSellersStruct[]) _resp;
                } catch (java.lang.Exception _exception) {
                    return (pl.net.yuri.magister.soap.FavouritesSellersStruct[]) org.apache.axis.utils.JavaUtils.convert(_resp, pl.net.yuri.magister.soap.FavouritesSellersStruct[].class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public pl.net.yuri.magister.soap.FavouritesCategoriesStruct[] doGetFavouriteCategories(java.lang.String sessionHandle) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[71]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#dogetfavouritecategories");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doGetFavouriteCategories"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{sessionHandle});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (pl.net.yuri.magister.soap.FavouritesCategoriesStruct[]) _resp;
                } catch (java.lang.Exception _exception) {
                    return (pl.net.yuri.magister.soap.FavouritesCategoriesStruct[]) org.apache.axis.utils.JavaUtils.convert(_resp, pl.net.yuri.magister.soap.FavouritesCategoriesStruct[].class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public pl.net.yuri.magister.soap.ItemImagesStruct[] doGetItemsImages(java.lang.String sessionHandle, pl.net.yuri.magister.soap.ItemGetImage[] itemsArray, int imageType) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[72]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#dogetitemsimages");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doGetItemsImages"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{sessionHandle, itemsArray, new java.lang.Integer(imageType)});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (pl.net.yuri.magister.soap.ItemImagesStruct[]) _resp;
                } catch (java.lang.Exception _exception) {
                    return (pl.net.yuri.magister.soap.ItemImagesStruct[]) org.apache.axis.utils.JavaUtils.convert(_resp, pl.net.yuri.magister.soap.ItemImagesStruct[].class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public pl.net.yuri.magister.soap.SpecialAuctionStruct[] doGetSpecialItems(java.lang.String sessionHandle, int specialType, int specialGroup, int offset, int orderFulfillmentTime) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[73]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#dogetspecialitems");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doGetSpecialItems"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{sessionHandle, new java.lang.Integer(specialType), new java.lang.Integer(specialGroup), new java.lang.Integer(offset), new java.lang.Integer(orderFulfillmentTime)});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (pl.net.yuri.magister.soap.SpecialAuctionStruct[]) _resp;
                } catch (java.lang.Exception _exception) {
                    return (pl.net.yuri.magister.soap.SpecialAuctionStruct[]) org.apache.axis.utils.JavaUtils.convert(_resp, pl.net.yuri.magister.soap.SpecialAuctionStruct[].class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public pl.net.yuri.magister.soap.UserBlackListAddResultStruct[] doAddToBlackList(java.lang.String sessionHandle, pl.net.yuri.magister.soap.UserBlackListStruct[] usersBlackListArray) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[74]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doAddToBlackList");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doAddToBlackList"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{sessionHandle, usersBlackListArray});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (pl.net.yuri.magister.soap.UserBlackListAddResultStruct[]) _resp;
                } catch (java.lang.Exception _exception) {
                    return (pl.net.yuri.magister.soap.UserBlackListAddResultStruct[]) org.apache.axis.utils.JavaUtils.convert(_resp, pl.net.yuri.magister.soap.UserBlackListAddResultStruct[].class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public pl.net.yuri.magister.soap.ItemPostBuyDataStruct[] doGetPostBuyData(java.lang.String sessionHandle, int[] itemsArray) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[75]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#getpostbuydata");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doGetPostBuyData"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{sessionHandle, itemsArray});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (pl.net.yuri.magister.soap.ItemPostBuyDataStruct[]) _resp;
                } catch (java.lang.Exception _exception) {
                    return (pl.net.yuri.magister.soap.ItemPostBuyDataStruct[]) org.apache.axis.utils.JavaUtils.convert(_resp, pl.net.yuri.magister.soap.ItemPostBuyDataStruct[].class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public pl.net.yuri.magister.soap.CancelRefundFormResultStruct[] doCancelRefundForms(java.lang.String sessionHandle, pl.net.yuri.magister.soap.CancelRefundDataStruct[] refundCancelDataArr) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[76]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doCancelRefundForms");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doCancelRefundForms"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{sessionHandle, refundCancelDataArr});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (pl.net.yuri.magister.soap.CancelRefundFormResultStruct[]) _resp;
                } catch (java.lang.Exception _exception) {
                    return (pl.net.yuri.magister.soap.CancelRefundFormResultStruct[]) org.apache.axis.utils.JavaUtils.convert(_resp, pl.net.yuri.magister.soap.CancelRefundFormResultStruct[].class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public void doGetSessionHandleForWidget(java.lang.String webapiKey, int countryCode, javax.xml.rpc.holders.StringHolder sessionHandle, javax.xml.rpc.holders.LongHolder serverTime) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[77]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#getsessionhandleforwidget");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doGetSessionHandleForWidget"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{webapiKey, new java.lang.Integer(countryCode)});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                java.util.Map _output;
                _output = _call.getOutputParams();
                try {
                    sessionHandle.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("", "session-handle"));
                } catch (java.lang.Exception _exception) {
                    sessionHandle.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "session-handle")), java.lang.String.class);
                }
                try {
                    serverTime.value = ((java.lang.Long) _output.get(new javax.xml.namespace.QName("", "server-time"))).longValue();
                } catch (java.lang.Exception _exception) {
                    serverTime.value = ((java.lang.Long) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "server-time")), long.class)).longValue();
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public pl.net.yuri.magister.soap.CancelRefundWarningResultStruct[] doCancelRefundWarnings(java.lang.String sessionHandle, pl.net.yuri.magister.soap.CancelRefundWarningStruct[] cancelRefundWarningsDataArr) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[78]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doCancelRefundWarnings");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doCancelRefundWarnings"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{sessionHandle, cancelRefundWarningsDataArr});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (pl.net.yuri.magister.soap.CancelRefundWarningResultStruct[]) _resp;
                } catch (java.lang.Exception _exception) {
                    return (pl.net.yuri.magister.soap.CancelRefundWarningResultStruct[]) org.apache.axis.utils.JavaUtils.convert(_resp, pl.net.yuri.magister.soap.CancelRefundWarningResultStruct[].class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public int doInternalSendMessage(java.lang.String sessionHandle, int userId, int mail_template_id, java.lang.String[] arrayOfAdditionalData) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[79]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doInternalSendMessage");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doInternalSendMessage"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{sessionHandle, new java.lang.Integer(userId), new java.lang.Integer(mail_template_id), arrayOfAdditionalData});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return ((java.lang.Integer) _resp).intValue();
                } catch (java.lang.Exception _exception) {
                    return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public void doGetRefundTransactions(java.lang.String sessionHandle, int offset, int limit, javax.xml.rpc.holders.IntHolder refundFormsCount, pl.net.yuri.magister.soap.holders.ArrayOfRefundFormDataStructHolder refundFormsList) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[80]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetRefundTransactions");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doGetRefundTransactions"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{sessionHandle, new java.lang.Integer(offset), new java.lang.Integer(limit)});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                java.util.Map _output;
                _output = _call.getOutputParams();
                try {
                    refundFormsCount.value = ((java.lang.Integer) _output.get(new javax.xml.namespace.QName("", "refund-forms-count"))).intValue();
                } catch (java.lang.Exception _exception) {
                    refundFormsCount.value = ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "refund-forms-count")), int.class)).intValue();
                }
                try {
                    refundFormsList.value = (pl.net.yuri.magister.soap.RefundFormDataStruct[]) _output.get(new javax.xml.namespace.QName("", "refund-forms-list"));
                } catch (java.lang.Exception _exception) {
                    refundFormsList.value = (pl.net.yuri.magister.soap.RefundFormDataStruct[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "refund-forms-list")), pl.net.yuri.magister.soap.RefundFormDataStruct[].class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public pl.net.yuri.magister.soap.SendReminderMessageResultStruct[] doSendReminderMessages(java.lang.String sessionHandle, pl.net.yuri.magister.soap.SendReminderMessageStruct[] sendReminderMessagesDataArr) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[81]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doSendReminderMessages");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doSendReminderMessages"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{sessionHandle, sendReminderMessagesDataArr});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (pl.net.yuri.magister.soap.SendReminderMessageResultStruct[]) _resp;
                } catch (java.lang.Exception _exception) {
                    return (pl.net.yuri.magister.soap.SendReminderMessageResultStruct[]) org.apache.axis.utils.JavaUtils.convert(_resp, pl.net.yuri.magister.soap.SendReminderMessageResultStruct[].class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public pl.net.yuri.magister.soap.ItemRemoveWatchStruct[] doRemoveFromWatchList(java.lang.String sessionHandle, long[] itemsIdArray) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[82]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doRemoveFromWatchList");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doRemoveFromWatchList"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{sessionHandle, itemsIdArray});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (pl.net.yuri.magister.soap.ItemRemoveWatchStruct[]) _resp;
                } catch (java.lang.Exception _exception) {
                    return (pl.net.yuri.magister.soap.ItemRemoveWatchStruct[]) org.apache.axis.utils.JavaUtils.convert(_resp, pl.net.yuri.magister.soap.ItemRemoveWatchStruct[].class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public pl.net.yuri.magister.soap.SendRefundFormResultStruct[] doSendRefundForms(java.lang.String sessionHandle, pl.net.yuri.magister.soap.SendRefundFormStruct[] sendRefundFormsDataArr) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[83]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doSendRefundForms");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doSendRefundForms"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{sessionHandle, sendRefundFormsDataArr});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (pl.net.yuri.magister.soap.SendRefundFormResultStruct[]) _resp;
                } catch (java.lang.Exception _exception) {
                    return (pl.net.yuri.magister.soap.SendRefundFormResultStruct[]) org.apache.axis.utils.JavaUtils.convert(_resp, pl.net.yuri.magister.soap.SendRefundFormResultStruct[].class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public pl.net.yuri.magister.soap.RefundFormStatusResultStruct[] doGetRefundFormsStatuses(java.lang.String sessionHandle, pl.net.yuri.magister.soap.RefundFormStatusStruct[] refundFormsStatusesDataArr) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[84]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetRefundFormsStatuses");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doGetRefundFormsStatuses"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{sessionHandle, refundFormsStatusesDataArr});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (pl.net.yuri.magister.soap.RefundFormStatusResultStruct[]) _resp;
                } catch (java.lang.Exception _exception) {
                    return (pl.net.yuri.magister.soap.RefundFormStatusResultStruct[]) org.apache.axis.utils.JavaUtils.convert(_resp, pl.net.yuri.magister.soap.RefundFormStatusResultStruct[].class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public pl.net.yuri.magister.soap.RefundReasonStruct[] doGetRefundReasons(java.lang.String webapiKey, int countryCode) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[85]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doGetRefundReasons");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doGetRefundReasons"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{webapiKey, new java.lang.Integer(countryCode)});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (pl.net.yuri.magister.soap.RefundReasonStruct[]) _resp;
                } catch (java.lang.Exception _exception) {
                    return (pl.net.yuri.magister.soap.RefundReasonStruct[]) org.apache.axis.utils.JavaUtils.convert(_resp, pl.net.yuri.magister.soap.RefundReasonStruct[].class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public pl.net.yuri.magister.soap.UserIncomingPaymentStruct[] doGetMyIncomingPayments(java.lang.String sessionHandle, int buyerId, long itemId, long transRecvDateFrom, long transRecvDateTo, int transPageLimit, int transOffset) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[86]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#getmyinpayments");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doGetMyIncomingPayments"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{sessionHandle, new java.lang.Integer(buyerId), new java.lang.Long(itemId), new java.lang.Long(transRecvDateFrom), new java.lang.Long(transRecvDateTo), new java.lang.Integer(transPageLimit), new java.lang.Integer(transOffset)});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (pl.net.yuri.magister.soap.UserIncomingPaymentStruct[]) _resp;
                } catch (java.lang.Exception _exception) {
                    return (pl.net.yuri.magister.soap.UserIncomingPaymentStruct[]) org.apache.axis.utils.JavaUtils.convert(_resp, pl.net.yuri.magister.soap.UserIncomingPaymentStruct[].class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public pl.net.yuri.magister.soap.UserPaymentStruct[] doGetMyPayments(java.lang.String sessionHandle, int sellerId, long itemId, long transCreateDateFrom, long transCreateDateTo, int transPageLimit, int transOffset) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[87]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#getmypayments");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doGetMyPayments"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{sessionHandle, new java.lang.Integer(sellerId), new java.lang.Long(itemId), new java.lang.Long(transCreateDateFrom), new java.lang.Long(transCreateDateTo), new java.lang.Integer(transPageLimit), new java.lang.Integer(transOffset)});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (pl.net.yuri.magister.soap.UserPaymentStruct[]) _resp;
                } catch (java.lang.Exception _exception) {
                    return (pl.net.yuri.magister.soap.UserPaymentStruct[]) org.apache.axis.utils.JavaUtils.convert(_resp, pl.net.yuri.magister.soap.UserPaymentStruct[].class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public pl.net.yuri.magister.soap.UserPayoutStruct[] doGetMyPayouts(java.lang.String sessionHandle, long transCreateDateFrom, long transCreateDateTo, int transPageLimit, int transOffset) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[88]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#getmypayouts");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doGetMyPayouts"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{sessionHandle, new java.lang.Long(transCreateDateFrom), new java.lang.Long(transCreateDateTo), new java.lang.Integer(transPageLimit), new java.lang.Integer(transOffset)});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (pl.net.yuri.magister.soap.UserPayoutStruct[]) _resp;
                } catch (java.lang.Exception _exception) {
                    return (pl.net.yuri.magister.soap.UserPayoutStruct[]) org.apache.axis.utils.JavaUtils.convert(_resp, pl.net.yuri.magister.soap.UserPayoutStruct[].class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public void doChangeQuantityItem(java.lang.String sessionHandle, javax.xml.rpc.holders.LongHolder itemId, int newItemQuantity, javax.xml.rpc.holders.StringHolder itemInfo, javax.xml.rpc.holders.IntHolder itemQuantityLeft, javax.xml.rpc.holders.IntHolder itemQuantitySold) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[89]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#doChangeQuantityItem");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doChangeQuantityItem"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{sessionHandle, new java.lang.Long(itemId.value), new java.lang.Integer(newItemQuantity)});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                java.util.Map _output;
                _output = _call.getOutputParams();
                try {
                    itemId.value = ((java.lang.Long) _output.get(new javax.xml.namespace.QName("", "item-id"))).longValue();
                } catch (java.lang.Exception _exception) {
                    itemId.value = ((java.lang.Long) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "item-id")), long.class)).longValue();
                }
                try {
                    itemInfo.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("", "item-info"));
                } catch (java.lang.Exception _exception) {
                    itemInfo.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "item-info")), java.lang.String.class);
                }
                try {
                    itemQuantityLeft.value = ((java.lang.Integer) _output.get(new javax.xml.namespace.QName("", "item-quantity-left"))).intValue();
                } catch (java.lang.Exception _exception) {
                    itemQuantityLeft.value = ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "item-quantity-left")), int.class)).intValue();
                }
                try {
                    itemQuantitySold.value = ((java.lang.Integer) _output.get(new javax.xml.namespace.QName("", "item-quantity-sold"))).intValue();
                } catch (java.lang.Exception _exception) {
                    itemQuantitySold.value = ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "item-quantity-sold")), int.class)).intValue();
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public void doShowUserPage(java.lang.String webapiKey, int countryId, long userId, javax.xml.rpc.holders.StringHolder userPageContent, javax.xml.rpc.holders.StringHolder userPagePharmacyPermit, javax.xml.rpc.holders.StringHolder userPageAlcoholPermit) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[90]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#showuserpage");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doShowUserPage"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{webapiKey, new java.lang.Integer(countryId), new java.lang.Long(userId)});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                java.util.Map _output;
                _output = _call.getOutputParams();
                try {
                    userPageContent.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("", "user-page-content"));
                } catch (java.lang.Exception _exception) {
                    userPageContent.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "user-page-content")), java.lang.String.class);
                }
                try {
                    userPagePharmacyPermit.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("", "user-page-pharmacy-permit"));
                } catch (java.lang.Exception _exception) {
                    userPagePharmacyPermit.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "user-page-pharmacy-permit")), java.lang.String.class);
                }
                try {
                    userPageAlcoholPermit.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("", "user-page-alcohol-permit"));
                } catch (java.lang.Exception _exception) {
                    userPageAlcoholPermit.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "user-page-alcohol-permit")), java.lang.String.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public java.lang.String doSendEmailToUser(java.lang.String sessionHandle, long mailToUserItemId, javax.xml.rpc.holders.LongHolder mailToUserReceiverId, int mailToUserSubjectId, int mailToUserOption, java.lang.String mailToUserMessage) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[91]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#sendemailtouser");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doSendEmailToUser"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{sessionHandle, new java.lang.Long(mailToUserItemId), new java.lang.Long(mailToUserReceiverId.value), new java.lang.Integer(mailToUserSubjectId), new java.lang.Integer(mailToUserOption), mailToUserMessage});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                java.util.Map _output;
                _output = _call.getOutputParams();
                try {
                    mailToUserReceiverId.value = ((java.lang.Long) _output.get(new javax.xml.namespace.QName("", "mail-to-user-receiver-id"))).longValue();
                } catch (java.lang.Exception _exception) {
                    mailToUserReceiverId.value = ((java.lang.Long) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "mail-to-user-receiver-id")), long.class)).longValue();
                }
                try {
                    return (java.lang.String) _resp;
                } catch (java.lang.Exception _exception) {
                    return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public long[] doGetTransactionsIDs(java.lang.String sessionHandle, long[] itemsIdArray, java.lang.String userRole) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[92]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#gettransids");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doGetTransactionsIDs"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{sessionHandle, itemsIdArray, userRole});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (long[]) _resp;
                } catch (java.lang.Exception _exception) {
                    return (long[]) org.apache.axis.utils.JavaUtils.convert(_resp, long[].class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public pl.net.yuri.magister.soap.PostBuyFormDataStruct[] doGetPostBuyFormsData(java.lang.String sessionHandle, long[] transactionsIdsArray) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[93]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#getpostbuyforms");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doGetPostBuyFormsData"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{sessionHandle, transactionsIdsArray});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (pl.net.yuri.magister.soap.PostBuyFormDataStruct[]) _resp;
                } catch (java.lang.Exception _exception) {
                    return (pl.net.yuri.magister.soap.PostBuyFormDataStruct[]) org.apache.axis.utils.JavaUtils.convert(_resp, pl.net.yuri.magister.soap.PostBuyFormDataStruct[].class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public pl.net.yuri.magister.soap.UserIncomingPaymentRefundsStruct[] doGetMyIncomingPaymentsRefunds(java.lang.String sessionHandle, int buyerId, long itemId, int limit, int offset) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[94]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#getmyinpaymentsrefunds");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doGetMyIncomingPaymentsRefunds"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{sessionHandle, new java.lang.Integer(buyerId), new java.lang.Long(itemId), new java.lang.Integer(limit), new java.lang.Integer(offset)});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (pl.net.yuri.magister.soap.UserIncomingPaymentRefundsStruct[]) _resp;
                } catch (java.lang.Exception _exception) {
                    return (pl.net.yuri.magister.soap.UserIncomingPaymentRefundsStruct[]) org.apache.axis.utils.JavaUtils.convert(_resp, pl.net.yuri.magister.soap.UserIncomingPaymentRefundsStruct[].class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public pl.net.yuri.magister.soap.UserPaymentRefundsStruct[] doGetMyPaymentsRefunds(java.lang.String sessionHandle, int sellerId, long itemId, int limit, int offset) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[95]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#getmypaymentsrafunds");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doGetMyPaymentsRefunds"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{sessionHandle, new java.lang.Integer(sellerId), new java.lang.Long(itemId), new java.lang.Integer(limit), new java.lang.Integer(offset)});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (pl.net.yuri.magister.soap.UserPaymentRefundsStruct[]) _resp;
                } catch (java.lang.Exception _exception) {
                    return (pl.net.yuri.magister.soap.UserPaymentRefundsStruct[]) org.apache.axis.utils.JavaUtils.convert(_resp, pl.net.yuri.magister.soap.UserPaymentRefundsStruct[].class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public void doGetMySellRating(java.lang.String sessionHandle, javax.xml.rpc.holders.IntHolder sellRatingTotalCount, pl.net.yuri.magister.soap.holders.ArrayOfSellRatingAverageStructHolder sellRatingAverage, pl.net.yuri.magister.soap.holders.ArrayOfSellRatingDetailStructHolder sellRatingDetails, pl.net.yuri.magister.soap.holders.ArrayOfSellRatingAveragePerMonthHolder sellRatingStatsPerMonth) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[96]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#getmysellrating");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doGetMySellRating"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{sessionHandle});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                java.util.Map _output;
                _output = _call.getOutputParams();
                try {
                    sellRatingTotalCount.value = ((java.lang.Integer) _output.get(new javax.xml.namespace.QName("", "sell-rating-total-count"))).intValue();
                } catch (java.lang.Exception _exception) {
                    sellRatingTotalCount.value = ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "sell-rating-total-count")), int.class)).intValue();
                }
                try {
                    sellRatingAverage.value = (pl.net.yuri.magister.soap.SellRatingAverageStruct[]) _output.get(new javax.xml.namespace.QName("", "sell-rating-average"));
                } catch (java.lang.Exception _exception) {
                    sellRatingAverage.value = (pl.net.yuri.magister.soap.SellRatingAverageStruct[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "sell-rating-average")), pl.net.yuri.magister.soap.SellRatingAverageStruct[].class);
                }
                try {
                    sellRatingDetails.value = (pl.net.yuri.magister.soap.SellRatingDetailStruct[]) _output.get(new javax.xml.namespace.QName("", "sell-rating-details"));
                } catch (java.lang.Exception _exception) {
                    sellRatingDetails.value = (pl.net.yuri.magister.soap.SellRatingDetailStruct[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "sell-rating-details")), pl.net.yuri.magister.soap.SellRatingDetailStruct[].class);
                }
                try {
                    sellRatingStatsPerMonth.value = (pl.net.yuri.magister.soap.SellRatingAveragePerMonthStruct[]) _output.get(new javax.xml.namespace.QName("", "sell-rating-stats-per-month"));
                } catch (java.lang.Exception _exception) {
                    sellRatingStatsPerMonth.value = (pl.net.yuri.magister.soap.SellRatingAveragePerMonthStruct[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "sell-rating-stats-per-month")), pl.net.yuri.magister.soap.SellRatingAveragePerMonthStruct[].class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public pl.net.yuri.magister.soap.SellRatingInfoStruct[] doGetSellRatingReasons(java.lang.String webapiKey, int countryCode) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[97]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#getsellratingreasons");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doGetSellRatingReasons"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{webapiKey, new java.lang.Integer(countryCode)});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (pl.net.yuri.magister.soap.SellRatingInfoStruct[]) _resp;
                } catch (java.lang.Exception _exception) {
                    return (pl.net.yuri.magister.soap.SellRatingInfoStruct[]) org.apache.axis.utils.JavaUtils.convert(_resp, pl.net.yuri.magister.soap.SellRatingInfoStruct[].class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public pl.net.yuri.magister.soap.DealsStruct[] doGetDeals(java.lang.String sessionHandle, long itemId, int buyerId) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[98]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#getdeals");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doGetDeals"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{sessionHandle, new java.lang.Long(itemId), new java.lang.Integer(buyerId)});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (pl.net.yuri.magister.soap.DealsStruct[]) _resp;
                } catch (java.lang.Exception _exception) {
                    return (pl.net.yuri.magister.soap.DealsStruct[]) org.apache.axis.utils.JavaUtils.convert(_resp, pl.net.yuri.magister.soap.DealsStruct[].class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public float doMakeDiscount(java.lang.String sessionHandle, long dealId, float discountAmount, float discountPercentage) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[99]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#makediscount");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doMakeDiscount"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{sessionHandle, new java.lang.Long(dealId), new java.lang.Float(discountAmount), new java.lang.Float(discountPercentage)});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return ((java.lang.Float) _resp).floatValue();
                } catch (java.lang.Exception _exception) {
                    return ((java.lang.Float) org.apache.axis.utils.JavaUtils.convert(_resp, float.class)).floatValue();
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public void doChangeItem(java.lang.String sessionHandle, javax.xml.rpc.holders.LongHolder itemId, pl.net.yuri.magister.soap.FieldsValue[] itemFields, pl.net.yuri.magister.soap.ItemImageOptionsStruct[] itemImagesOptions, javax.xml.rpc.holders.FloatHolder itemCountrySurchargeValue, javax.xml.rpc.holders.StringHolder itemCountrySurchargeCurrency, javax.xml.rpc.holders.FloatHolder sellerCountrySurchargeValue, javax.xml.rpc.holders.StringHolder sellerCountrySurchargeCurrency) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[100]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#changeitem");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doChangeItem"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{sessionHandle, new java.lang.Long(itemId.value), itemFields, itemImagesOptions});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                java.util.Map _output;
                _output = _call.getOutputParams();
                try {
                    itemId.value = ((java.lang.Long) _output.get(new javax.xml.namespace.QName("", "item-id"))).longValue();
                } catch (java.lang.Exception _exception) {
                    itemId.value = ((java.lang.Long) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "item-id")), long.class)).longValue();
                }
                try {
                    itemCountrySurchargeValue.value = ((java.lang.Float) _output.get(new javax.xml.namespace.QName("", "item-country-surcharge-value"))).floatValue();
                } catch (java.lang.Exception _exception) {
                    itemCountrySurchargeValue.value = ((java.lang.Float) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "item-country-surcharge-value")), float.class)).floatValue();
                }
                try {
                    itemCountrySurchargeCurrency.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("", "item-country-surcharge-currency"));
                } catch (java.lang.Exception _exception) {
                    itemCountrySurchargeCurrency.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "item-country-surcharge-currency")), java.lang.String.class);
                }
                try {
                    sellerCountrySurchargeValue.value = ((java.lang.Float) _output.get(new javax.xml.namespace.QName("", "seller-country-surcharge-value"))).floatValue();
                } catch (java.lang.Exception _exception) {
                    sellerCountrySurchargeValue.value = ((java.lang.Float) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "seller-country-surcharge-value")), float.class)).floatValue();
                }
                try {
                    sellerCountrySurchargeCurrency.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("", "seller-country-surcharge-currency"));
                } catch (java.lang.Exception _exception) {
                    sellerCountrySurchargeCurrency.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "seller-country-surcharge-currency")), java.lang.String.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public void doFinishItems(java.lang.String sessionHandle, pl.net.yuri.magister.soap.FinishItemsStruct[] finishItemsList, pl.net.yuri.magister.soap.holders.ArrayOfFinishSuccessStructHolder finishItemsSucceed, pl.net.yuri.magister.soap.holders.ArrayOfFinishFailureStructHolder finishItemsFailed) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[101]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#finishitems");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doFinishItems"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{sessionHandle, finishItemsList});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                java.util.Map _output;
                _output = _call.getOutputParams();
                try {
                    finishItemsSucceed.value = (long[]) _output.get(new javax.xml.namespace.QName("", "finish-items-succeed"));
                } catch (java.lang.Exception _exception) {
                    finishItemsSucceed.value = (long[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "finish-items-succeed")), long[].class);
                }
                try {
                    finishItemsFailed.value = (pl.net.yuri.magister.soap.FinishFailureStruct[]) _output.get(new javax.xml.namespace.QName("", "finish-items-failed"));
                } catch (java.lang.Exception _exception) {
                    finishItemsFailed.value = (pl.net.yuri.magister.soap.FinishFailureStruct[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "finish-items-failed")), pl.net.yuri.magister.soap.FinishFailureStruct[].class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public void doGetShipmentData(int countryId, java.lang.String webapiKey, pl.net.yuri.magister.soap.holders.ArrayOfShipmentDataStructHolder shipmentDataList, javax.xml.rpc.holders.LongHolder localVersion) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[102]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#getshipmentdata");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doGetShipmentData"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{new java.lang.Integer(countryId), webapiKey});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                java.util.Map _output;
                _output = _call.getOutputParams();
                try {
                    shipmentDataList.value = (pl.net.yuri.magister.soap.ShipmentDataStruct[]) _output.get(new javax.xml.namespace.QName("", "shipment-data-list"));
                } catch (java.lang.Exception _exception) {
                    shipmentDataList.value = (pl.net.yuri.magister.soap.ShipmentDataStruct[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "shipment-data-list")), pl.net.yuri.magister.soap.ShipmentDataStruct[].class);
                }
                try {
                    localVersion.value = ((java.lang.Long) _output.get(new javax.xml.namespace.QName("", "local-version"))).longValue();
                } catch (java.lang.Exception _exception) {
                    localVersion.value = ((java.lang.Long) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "local-version")), long.class)).longValue();
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public pl.net.yuri.magister.soap.FieldsValue[] doGetItemFields(java.lang.String sessionHandle, long itemId) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[103]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#getitemfields");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doGetItemFields"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{sessionHandle, new java.lang.Long(itemId)});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (pl.net.yuri.magister.soap.FieldsValue[]) _resp;
                } catch (java.lang.Exception _exception) {
                    return (pl.net.yuri.magister.soap.FieldsValue[]) org.apache.axis.utils.JavaUtils.convert(_resp, pl.net.yuri.magister.soap.FieldsValue[].class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public pl.net.yuri.magister.soap.ProductStruct[] doFindProductByName(java.lang.String sessionHandle, java.lang.String productName, long categoryId) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[104]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#findproductbyname");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doFindProductByName"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{sessionHandle, productName, new java.lang.Long(categoryId)});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (pl.net.yuri.magister.soap.ProductStruct[]) _resp;
                } catch (java.lang.Exception _exception) {
                    return (pl.net.yuri.magister.soap.ProductStruct[]) org.apache.axis.utils.JavaUtils.convert(_resp, pl.net.yuri.magister.soap.ProductStruct[].class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public void doGetProductItems(java.lang.String sessionHandle, long productId, int categoryId, int pageSize, int pageNumber, javax.xml.rpc.holders.IntHolder productItemsCount, pl.net.yuri.magister.soap.holders.ArrayOfProductItemsIdsHolder productItemsIds) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[105]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#getproductitems");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doGetProductItems"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{sessionHandle, new java.lang.Long(productId), new java.lang.Integer(categoryId), new java.lang.Integer(pageSize), new java.lang.Integer(pageNumber)});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                java.util.Map _output;
                _output = _call.getOutputParams();
                try {
                    productItemsCount.value = ((java.lang.Integer) _output.get(new javax.xml.namespace.QName("", "product-items-count"))).intValue();
                } catch (java.lang.Exception _exception) {
                    productItemsCount.value = ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "product-items-count")), int.class)).intValue();
                }
                try {
                    productItemsIds.value = (long[]) _output.get(new javax.xml.namespace.QName("", "product-items-ids"));
                } catch (java.lang.Exception _exception) {
                    productItemsIds.value = (long[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "product-items-ids")), long[].class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public pl.net.yuri.magister.soap.ProductStruct doFindProductByCode(java.lang.String sessionHandle, java.lang.String productCode) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[106]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#findproductbycode");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doFindProductByCode"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{sessionHandle, productCode});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (pl.net.yuri.magister.soap.ProductStruct) _resp;
                } catch (java.lang.Exception _exception) {
                    return (pl.net.yuri.magister.soap.ProductStruct) org.apache.axis.utils.JavaUtils.convert(_resp, pl.net.yuri.magister.soap.ProductStruct.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public int doRequestSurcharge(java.lang.String sessionHandle, long transactionId, float surchargeValue, java.lang.String surchargeMessageToBuyer) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[107]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("#requestsurcharge");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:AllegroWebApi", "doRequestSurcharge"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[]{sessionHandle, new java.lang.Long(transactionId), new java.lang.Float(surchargeValue), surchargeMessageToBuyer});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return ((java.lang.Integer) _resp).intValue();
                } catch (java.lang.Exception _exception) {
                    return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

}
