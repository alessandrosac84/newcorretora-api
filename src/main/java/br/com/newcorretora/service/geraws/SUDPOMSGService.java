package br.com.newcorretora.service.geraws;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.1.4.redhat-1
 * 2017-12-12T11:56:32.339-02:00
 * Generated source version: 3.1.4.redhat-1
 * 
 */
@WebServiceClient(name = "SUDPOMSGService", 
                  wsdlLocation = "http://cicsweb.des.caixa:32584/sud/geraws?wsdl",
                  targetNamespace = "geraws") 
public class SUDPOMSGService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("geraws", "SUDPOMSGService");
    public final static QName SUDPOMSGPort = new QName("geraws", "SUDPOMSGPort");
    static {
        URL url = null;
        try {
            url = new URL("http://cicsweb.des.caixa:32584/sud/geraws?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(SUDPOMSGService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://cicsweb.des.caixa:32584/sud/geraws?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public SUDPOMSGService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public SUDPOMSGService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SUDPOMSGService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public SUDPOMSGService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public SUDPOMSGService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public SUDPOMSGService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns SUDPOMSGPort
     */
    @WebEndpoint(name = "SUDPOMSGPort")
    public SUDPOMSGPort getSUDPOMSGPort() {
        return super.getPort(SUDPOMSGPort, SUDPOMSGPort.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SUDPOMSGPort
     */
    @WebEndpoint(name = "SUDPOMSGPort")
    public SUDPOMSGPort getSUDPOMSGPort(WebServiceFeature... features) {
        return super.getPort(SUDPOMSGPort, SUDPOMSGPort.class, features);
    }

}
