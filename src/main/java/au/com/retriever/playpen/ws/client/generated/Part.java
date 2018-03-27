
package au.com.retriever.playpen.ws.client.generated;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for part complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="part"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="partId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="partDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="unitPrice" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "part", propOrder = {
    "partId",
    "partDesc",
    "unitPrice"
})
public class Part {

    @XmlElement(required = true)
    protected String partId;
    @XmlElementRef(name = "partDesc", type = JAXBElement.class, required = false)
    protected JAXBElement<String> partDesc;
    @XmlElementRef(name = "unitPrice", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> unitPrice;

    /**
     * Gets the value of the partId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartId() {
        return partId;
    }

    /**
     * Sets the value of the partId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartId(String value) {
        this.partId = value;
    }

    /**
     * Gets the value of the partDesc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPartDesc() {
        return partDesc;
    }

    /**
     * Sets the value of the partDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPartDesc(JAXBElement<String> value) {
        this.partDesc = value;
    }

    /**
     * Gets the value of the unitPrice property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getUnitPrice() {
        return unitPrice;
    }

    /**
     * Sets the value of the unitPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setUnitPrice(JAXBElement<Double> value) {
        this.unitPrice = value;
    }

}
