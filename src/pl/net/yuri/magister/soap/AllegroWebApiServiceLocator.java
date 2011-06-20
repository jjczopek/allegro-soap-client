/**
 * AllegroWebApiServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pl.net.yuri.magister.soap;

public class AllegroWebApiServiceLocator extends org.apache.axis.client.Service implements pl.net.yuri.magister.soap.AllegroWebApiService {

    public AllegroWebApiServiceLocator() {
    }


    public AllegroWebApiServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public AllegroWebApiServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for AllegroWebApiPort
    private java.lang.String AllegroWebApiPort_address = "http://webapi.allegro.pl/uploader.php";

    public java.lang.String getAllegroWebApiPortAddress() {
        return AllegroWebApiPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String AllegroWebApiPortWSDDServiceName = "AllegroWebApiPort";

    public java.lang.String getAllegroWebApiPortWSDDServiceName() {
        return AllegroWebApiPortWSDDServiceName;
    }

    public void setAllegroWebApiPortWSDDServiceName(java.lang.String name) {
        AllegroWebApiPortWSDDServiceName = name;
    }

    public pl.net.yuri.magister.soap.AllegroWebApiPortType getAllegroWebApiPort() throws javax.xml.rpc.ServiceException {
        java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(AllegroWebApiPort_address);
        } catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getAllegroWebApiPort(endpoint);
    }

    public pl.net.yuri.magister.soap.AllegroWebApiPortType getAllegroWebApiPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            pl.net.yuri.magister.soap.AllegroWebApiBindingStub _stub = new pl.net.yuri.magister.soap.AllegroWebApiBindingStub(portAddress, this);
            _stub.setPortName(getAllegroWebApiPortWSDDServiceName());
            return _stub;
        } catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setAllegroWebApiPortEndpointAddress(java.lang.String address) {
        AllegroWebApiPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (pl.net.yuri.magister.soap.AllegroWebApiPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                pl.net.yuri.magister.soap.AllegroWebApiBindingStub _stub = new pl.net.yuri.magister.soap.AllegroWebApiBindingStub(new java.net.URL(AllegroWebApiPort_address), this);
                _stub.setPortName(getAllegroWebApiPortWSDDServiceName());
                return _stub;
            }
        } catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("AllegroWebApiPort".equals(inputPortName)) {
            return getAllegroWebApiPort();
        } else {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:AllegroWebApi", "AllegroWebApiService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:AllegroWebApi", "AllegroWebApiPort"));
        }
        return ports.iterator();
    }

    /**
     * Set the endpoint address for the specified port name.
     */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {

        if ("AllegroWebApiPort".equals(portName)) {
            setAllegroWebApiPortEndpointAddress(address);
        } else { // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
     * Set the endpoint address for the specified port name.
     */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
