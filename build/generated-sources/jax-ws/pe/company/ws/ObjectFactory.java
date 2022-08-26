
package pe.company.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the pe.company.ws package. 
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

    private final static QName _Dividir_QNAME = new QName("http://ws.company.pe/", "dividir");
    private final static QName _DividirResponse_QNAME = new QName("http://ws.company.pe/", "dividirResponse");
    private final static QName _Hello_QNAME = new QName("http://ws.company.pe/", "hello");
    private final static QName _HelloResponse_QNAME = new QName("http://ws.company.pe/", "helloResponse");
    private final static QName _Multiplicar_QNAME = new QName("http://ws.company.pe/", "multiplicar");
    private final static QName _MultiplicarResponse_QNAME = new QName("http://ws.company.pe/", "multiplicarResponse");
    private final static QName _Resta_QNAME = new QName("http://ws.company.pe/", "resta");
    private final static QName _RestaResponse_QNAME = new QName("http://ws.company.pe/", "restaResponse");
    private final static QName _Suma_QNAME = new QName("http://ws.company.pe/", "suma");
    private final static QName _SumaResponse_QNAME = new QName("http://ws.company.pe/", "sumaResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: pe.company.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Dividir }
     * 
     */
    public Dividir createDividir() {
        return new Dividir();
    }

    /**
     * Create an instance of {@link DividirResponse }
     * 
     */
    public DividirResponse createDividirResponse() {
        return new DividirResponse();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link Multiplicar }
     * 
     */
    public Multiplicar createMultiplicar() {
        return new Multiplicar();
    }

    /**
     * Create an instance of {@link MultiplicarResponse }
     * 
     */
    public MultiplicarResponse createMultiplicarResponse() {
        return new MultiplicarResponse();
    }

    /**
     * Create an instance of {@link Resta }
     * 
     */
    public Resta createResta() {
        return new Resta();
    }

    /**
     * Create an instance of {@link RestaResponse }
     * 
     */
    public RestaResponse createRestaResponse() {
        return new RestaResponse();
    }

    /**
     * Create an instance of {@link Suma }
     * 
     */
    public Suma createSuma() {
        return new Suma();
    }

    /**
     * Create an instance of {@link SumaResponse }
     * 
     */
    public SumaResponse createSumaResponse() {
        return new SumaResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Dividir }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Dividir }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.company.pe/", name = "dividir")
    public JAXBElement<Dividir> createDividir(Dividir value) {
        return new JAXBElement<Dividir>(_Dividir_QNAME, Dividir.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DividirResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DividirResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.company.pe/", name = "dividirResponse")
    public JAXBElement<DividirResponse> createDividirResponse(DividirResponse value) {
        return new JAXBElement<DividirResponse>(_DividirResponse_QNAME, DividirResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.company.pe/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.company.pe/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Multiplicar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Multiplicar }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.company.pe/", name = "multiplicar")
    public JAXBElement<Multiplicar> createMultiplicar(Multiplicar value) {
        return new JAXBElement<Multiplicar>(_Multiplicar_QNAME, Multiplicar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MultiplicarResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MultiplicarResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.company.pe/", name = "multiplicarResponse")
    public JAXBElement<MultiplicarResponse> createMultiplicarResponse(MultiplicarResponse value) {
        return new JAXBElement<MultiplicarResponse>(_MultiplicarResponse_QNAME, MultiplicarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Resta }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Resta }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.company.pe/", name = "resta")
    public JAXBElement<Resta> createResta(Resta value) {
        return new JAXBElement<Resta>(_Resta_QNAME, Resta.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RestaResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RestaResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.company.pe/", name = "restaResponse")
    public JAXBElement<RestaResponse> createRestaResponse(RestaResponse value) {
        return new JAXBElement<RestaResponse>(_RestaResponse_QNAME, RestaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Suma }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Suma }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.company.pe/", name = "suma")
    public JAXBElement<Suma> createSuma(Suma value) {
        return new JAXBElement<Suma>(_Suma_QNAME, Suma.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SumaResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SumaResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.company.pe/", name = "sumaResponse")
    public JAXBElement<SumaResponse> createSumaResponse(SumaResponse value) {
        return new JAXBElement<SumaResponse>(_SumaResponse_QNAME, SumaResponse.class, null, value);
    }

}
