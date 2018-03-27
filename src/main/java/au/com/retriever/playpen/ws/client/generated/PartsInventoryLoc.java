
package au.com.retriever.playpen.ws.client.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for partsInventoryLoc complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="partsInventoryLoc"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="invLocId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="partId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="partDesc" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="invLocQty" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="unitPrice" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "partsInventoryLoc", propOrder = {
    "invLocId",
    "partId",
    "partDesc",
    "invLocQty",
    "unitPrice"
})
public class PartsInventoryLoc {

    @XmlElement(required = true)
    protected String invLocId;
    @XmlElement(required = true)
    protected String partId;
    @XmlElement(required = true)
    protected String partDesc;
    protected int invLocQty;
    protected double unitPrice;

    /**
     * Gets the value of the invLocId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvLocId() {
        return invLocId;
    }

    /**
     * Sets the value of the invLocId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvLocId(String value) {
        this.invLocId = value;
    }

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
     *     {@link String }
     *     
     */
    public String getPartDesc() {
        return partDesc;
    }

    /**
     * Sets the value of the partDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartDesc(String value) {
        this.partDesc = value;
    }

    /**
     * Gets the value of the invLocQty property.
     * 
     */
    public int getInvLocQty() {
        return invLocQty;
    }

    /**
     * Sets the value of the invLocQty property.
     * 
     */
    public void setInvLocQty(int value) {
        this.invLocQty = value;
    }

    /**
     * Gets the value of the unitPrice property.
     * 
     */
    public double getUnitPrice() {
        return unitPrice;
    }

    /**
     * Sets the value of the unitPrice property.
     * 
     */
    public void setUnitPrice(double value) {
        this.unitPrice = value;
    }

}
