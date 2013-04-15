package de.uniba.dsg.soa;

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
 * JAX-WS RI 2.2.6-2b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "HistoryService", targetNamespace = "http://uniba.de/dsg/soa/", wsdlLocation = "file:/C:/Users/Administrator/Documents/GitHub/jaxws-samples/wsimport-client/plain-style/metadata/historyservice.wsdl")
public class HistoryService
    extends Service
{

    private final static URL HISTORYSERVICE_WSDL_LOCATION;
    private final static WebServiceException HISTORYSERVICE_EXCEPTION;
    private final static QName HISTORYSERVICE_QNAME = new QName("http://uniba.de/dsg/soa/", "HistoryService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/C:/Users/Administrator/Documents/GitHub/jaxws-samples/wsimport-client/plain-style/metadata/historyservice.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        HISTORYSERVICE_WSDL_LOCATION = url;
        HISTORYSERVICE_EXCEPTION = e;
    }

    public HistoryService() {
        super(__getWsdlLocation(), HISTORYSERVICE_QNAME);
    }

    public HistoryService(WebServiceFeature... features) {
        super(__getWsdlLocation(), HISTORYSERVICE_QNAME, features);
    }

    public HistoryService(URL wsdlLocation) {
        super(wsdlLocation, HISTORYSERVICE_QNAME);
    }

    public HistoryService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, HISTORYSERVICE_QNAME, features);
    }

    public HistoryService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public HistoryService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns History
     */
    @WebEndpoint(name = "HistoryPort")
    public History getHistoryPort() {
        return super.getPort(new QName("http://uniba.de/dsg/soa/", "HistoryPort"), History.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns History
     */
    @WebEndpoint(name = "HistoryPort")
    public History getHistoryPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://uniba.de/dsg/soa/", "HistoryPort"), History.class, features);
    }

    private static URL __getWsdlLocation() {
        if (HISTORYSERVICE_EXCEPTION!= null) {
            throw HISTORYSERVICE_EXCEPTION;
        }
        return HISTORYSERVICE_WSDL_LOCATION;
    }

}
