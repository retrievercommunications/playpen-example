
package au.com.retriever.playpen.ws.client.generated;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for export complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="export"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="timeout" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="updatedSince" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="export" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="max" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="transactionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="maxProcessingTime" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "export", propOrder = {
    "timeout",
    "updatedSince",
    "export",
    "max",
    "transactionId",
    "maxProcessingTime"
})
@XmlSeeAlso({
    ExportWithJobId.class,
    ExportWithTechId.class
})
public class Export {

    @XmlElementRef(name = "timeout", type = JAXBElement.class, required = false)
    protected JAXBElement<String> timeout;
    @XmlElementRef(name = "updatedSince", type = JAXBElement.class, required = false)
    protected JAXBElement<String> updatedSince;
    protected boolean export;
    @XmlElementRef(name = "max", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> max;
    @XmlElementRef(name = "transactionId", type = JAXBElement.class, required = false)
    protected JAXBElement<String> transactionId;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer maxProcessingTime;

    /**
     * Gets the value of the timeout property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTimeout() {
        return timeout;
    }

    /**
     * Sets the value of the timeout property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTimeout(JAXBElement<String> value) {
        this.timeout = value;
    }

    /**
     * Gets the value of the updatedSince property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUpdatedSince() {
        return updatedSince;
    }

    /**
     * Sets the value of the updatedSince property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUpdatedSince(JAXBElement<String> value) {
        this.updatedSince = value;
    }

    /**
     * Gets the value of the export property.
     * 
     */
    public boolean isExport() {
        return export;
    }

    /**
     * Sets the value of the export property.
     * 
     */
    public void setExport(boolean value) {
        this.export = value;
    }

    /**
     * Gets the value of the max property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getMax() {
        return max;
    }

    /**
     * Sets the value of the max property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setMax(JAXBElement<Integer> value) {
        this.max = value;
    }

    /**
     * Gets the value of the transactionId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTransactionId() {
        return transactionId;
    }

    /**
     * Sets the value of the transactionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTransactionId(JAXBElement<String> value) {
        this.transactionId = value;
    }

    /**
     * Gets the value of the maxProcessingTime property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxProcessingTime() {
        return maxProcessingTime;
    }

    /**
     * Sets the value of the maxProcessingTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxProcessingTime(Integer value) {
        this.maxProcessingTime = value;
    }

}
