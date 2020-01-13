
package electricekyc.tml.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the electricekyc.tml.service package. 
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

    private final static QName _ELECTRICRequest_QNAME = new QName("http://service.TML.ELECTRICeKYC/", "ELECTRICRequest");
    private final static QName _ELECTRICResponse_QNAME = new QName("http://service.TML.ELECTRICeKYC/", "ELECTRICResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: electricekyc.tml.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ELECTRICRequestObject }
     * 
     */
    public ELECTRICRequestObject createELECTRICRequestObject() {
        return new ELECTRICRequestObject();
    }

    /**
     * Create an instance of {@link ELECTRICResponseObject }
     * 
     */
    public ELECTRICResponseObject createELECTRICResponseObject() {
        return new ELECTRICResponseObject();
    }

    /**
     * Create an instance of {@link KYCObject }
     * 
     */
    public KYCObject createKYCObject() {
        return new KYCObject();
    }

    /**
     * Create an instance of {@link KYCResultObject }
     * 
     */
    public KYCResultObject createKYCResultObject() {
        return new KYCResultObject();
    }

    /**
     * Create an instance of {@link NameMatchObject }
     * 
     */
    public NameMatchObject createNameMatchObject() {
        return new NameMatchObject();
    }

    /**
     * Create an instance of {@link ELECTRICResultObject }
     * 
     */
    public ELECTRICResultObject createELECTRICResultObject() {
        return new ELECTRICResultObject();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ELECTRICRequestObject }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ELECTRICRequestObject }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.TML.ELECTRICeKYC/", name = "ELECTRICRequest")
    public JAXBElement<ELECTRICRequestObject> createELECTRICRequest(ELECTRICRequestObject value) {
        return new JAXBElement<ELECTRICRequestObject>(_ELECTRICRequest_QNAME, ELECTRICRequestObject.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ELECTRICResponseObject }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ELECTRICResponseObject }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.TML.ELECTRICeKYC/", name = "ELECTRICResponse")
    public JAXBElement<ELECTRICResponseObject> createELECTRICResponse(ELECTRICResponseObject value) {
        return new JAXBElement<ELECTRICResponseObject>(_ELECTRICResponse_QNAME, ELECTRICResponseObject.class, null, value);
    }

}
