//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.11.26 at 04:19:50 PM CET 
//


package generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="coffeeDrink" type="{}coffeeDrink"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "coffeeDrink"
})
@XmlRootElement(name = "getCoffeeResponse")
public class GetCoffeeResponse {

    @XmlElement(required = true)
    protected CoffeeDrink coffeeDrink;

    /**
     * Gets the value of the coffeeDrink property.
     * 
     * @return
     *     possible object is
     *     {@link CoffeeDrink }
     *     
     */
    public CoffeeDrink getCoffeeDrink() {
        return coffeeDrink;
    }

    /**
     * Sets the value of the coffeeDrink property.
     * 
     * @param value
     *     allowed object is
     *     {@link CoffeeDrink }
     *     
     */
    public void setCoffeeDrink(CoffeeDrink value) {
        this.coffeeDrink = value;
    }

}