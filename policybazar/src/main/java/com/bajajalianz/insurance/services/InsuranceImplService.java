
package com.bajajalianz.insurance.services;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "InsuranceImplService", targetNamespace = "http://services.insurance.bajajalianz.com/", wsdlLocation = "http://localhost:5858/bajajalianz/plans?wsdl")
public class InsuranceImplService
    extends Service
{

    private final static URL INSURANCEIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException INSURANCEIMPLSERVICE_EXCEPTION;
    private final static QName INSURANCEIMPLSERVICE_QNAME = new QName("http://services.insurance.bajajalianz.com/", "InsuranceImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:5858/bajajalianz/plans?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        INSURANCEIMPLSERVICE_WSDL_LOCATION = url;
        INSURANCEIMPLSERVICE_EXCEPTION = e;
    }

    public InsuranceImplService() {
        super(__getWsdlLocation(), INSURANCEIMPLSERVICE_QNAME);
    }

    public InsuranceImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), INSURANCEIMPLSERVICE_QNAME, features);
    }

    public InsuranceImplService(URL wsdlLocation) {
        super(wsdlLocation, INSURANCEIMPLSERVICE_QNAME);
    }

    public InsuranceImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, INSURANCEIMPLSERVICE_QNAME, features);
    }

    public InsuranceImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public InsuranceImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns Insurance
     */
    @WebEndpoint(name = "InsuranceImplPort")
    public Insurance getInsuranceImplPort() {
        return super.getPort(new QName("http://services.insurance.bajajalianz.com/", "InsuranceImplPort"), Insurance.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Insurance
     */
    @WebEndpoint(name = "InsuranceImplPort")
    public Insurance getInsuranceImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://services.insurance.bajajalianz.com/", "InsuranceImplPort"), Insurance.class, features);
    }

    private static URL __getWsdlLocation() {
        if (INSURANCEIMPLSERVICE_EXCEPTION!= null) {
            throw INSURANCEIMPLSERVICE_EXCEPTION;
        }
        return INSURANCEIMPLSERVICE_WSDL_LOCATION;
    }

}