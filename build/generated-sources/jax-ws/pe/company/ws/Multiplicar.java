
package pe.company.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para multiplicar complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="multiplicar"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="a" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="b" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "multiplicar", propOrder = {
    "a",
    "b"
})
public class Multiplicar {

    protected double a;
    protected double b;

    /**
     * Obtiene el valor de la propiedad a.
     * 
     */
    public double getA() {
        return a;
    }

    /**
     * Define el valor de la propiedad a.
     * 
     */
    public void setA(double value) {
        this.a = value;
    }

    /**
     * Obtiene el valor de la propiedad b.
     * 
     */
    public double getB() {
        return b;
    }

    /**
     * Define el valor de la propiedad b.
     * 
     */
    public void setB(double value) {
        this.b = value;
    }

}
