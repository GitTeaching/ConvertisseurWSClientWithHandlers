
package org.soa.ws.tp8;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.soa.ws.tp8 package. 
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

    private final static QName _GetDinarFromEuroResponse_QNAME = new QName("http://tp8.ws.soa.org/", "getDinarFromEuroResponse");
    private final static QName _GetDinarFromEuro_QNAME = new QName("http://tp8.ws.soa.org/", "getDinarFromEuro");
    private final static QName _GetEuroFromDinar_QNAME = new QName("http://tp8.ws.soa.org/", "getEuroFromDinar");
    private final static QName _GetEuroFromDinarResponse_QNAME = new QName("http://tp8.ws.soa.org/", "getEuroFromDinarResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.soa.ws.tp8
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetDinarFromEuroResponse }
     * 
     */
    public GetDinarFromEuroResponse createGetDinarFromEuroResponse() {
        return new GetDinarFromEuroResponse();
    }

    /**
     * Create an instance of {@link GetEuroFromDinarResponse }
     * 
     */
    public GetEuroFromDinarResponse createGetEuroFromDinarResponse() {
        return new GetEuroFromDinarResponse();
    }

    /**
     * Create an instance of {@link GetEuroFromDinar }
     * 
     */
    public GetEuroFromDinar createGetEuroFromDinar() {
        return new GetEuroFromDinar();
    }

    /**
     * Create an instance of {@link GetDinarFromEuro }
     * 
     */
    public GetDinarFromEuro createGetDinarFromEuro() {
        return new GetDinarFromEuro();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDinarFromEuroResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tp8.ws.soa.org/", name = "getDinarFromEuroResponse")
    public JAXBElement<GetDinarFromEuroResponse> createGetDinarFromEuroResponse(GetDinarFromEuroResponse value) {
        return new JAXBElement<GetDinarFromEuroResponse>(_GetDinarFromEuroResponse_QNAME, GetDinarFromEuroResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDinarFromEuro }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tp8.ws.soa.org/", name = "getDinarFromEuro")
    public JAXBElement<GetDinarFromEuro> createGetDinarFromEuro(GetDinarFromEuro value) {
        return new JAXBElement<GetDinarFromEuro>(_GetDinarFromEuro_QNAME, GetDinarFromEuro.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEuroFromDinar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tp8.ws.soa.org/", name = "getEuroFromDinar")
    public JAXBElement<GetEuroFromDinar> createGetEuroFromDinar(GetEuroFromDinar value) {
        return new JAXBElement<GetEuroFromDinar>(_GetEuroFromDinar_QNAME, GetEuroFromDinar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEuroFromDinarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tp8.ws.soa.org/", name = "getEuroFromDinarResponse")
    public JAXBElement<GetEuroFromDinarResponse> createGetEuroFromDinarResponse(GetEuroFromDinarResponse value) {
        return new JAXBElement<GetEuroFromDinarResponse>(_GetEuroFromDinarResponse_QNAME, GetEuroFromDinarResponse.class, null, value);
    }

}
