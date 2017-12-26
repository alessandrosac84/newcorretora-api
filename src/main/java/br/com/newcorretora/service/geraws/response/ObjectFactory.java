
package br.com.newcorretora.service.geraws.response;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.gov.caixa.geraws.response package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GerawsResponse_QNAME = new QName("http://br.com.newcorretora.service.geraws/response", "gerawsResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.gov.caixa.geraws.response
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ProgramInterface }
     * 
     */
    public ProgramInterface createProgramInterface() {
        return new ProgramInterface();
    }

    /**
     * Create an instance of {@link ProgramInterface.WebSudwsmsg }
     * 
     */
    public ProgramInterface.WebSudwsmsg createProgramInterfaceWebSudwsmsg() {
        return new ProgramInterface.WebSudwsmsg();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProgramInterface }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://br.com.newcorretora.service.geraws/response", name = "gerawsResponse")
    public JAXBElement<ProgramInterface> createGerawsResponse(ProgramInterface value) {
        return new JAXBElement<ProgramInterface>(_GerawsResponse_QNAME, ProgramInterface.class, null, value);
    }

}
