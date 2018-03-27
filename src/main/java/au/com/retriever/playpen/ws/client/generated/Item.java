
package au.com.retriever.playpen.ws.client.generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for item complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="item"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="itemName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="inputType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="itemText" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="listItem" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="defaultValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isMandatory" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="sortCode" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "item", propOrder = {
    "itemName",
    "inputType",
    "itemText",
    "listItem",
    "defaultValue",
    "isMandatory",
    "sortCode"
})
public class Item {

    @XmlElement(required = true)
    protected String itemName;
    @XmlElement(required = true)
    protected String inputType;
    @XmlElement(required = true)
    protected String itemText;
    protected List<String> listItem;
    protected String defaultValue;
    protected boolean isMandatory;
    protected int sortCode;

    /**
     * Gets the value of the itemName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemName() {
        return itemName;
    }

    /**
     * Sets the value of the itemName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemName(String value) {
        this.itemName = value;
    }

    /**
     * Gets the value of the inputType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInputType() {
        return inputType;
    }

    /**
     * Sets the value of the inputType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInputType(String value) {
        this.inputType = value;
    }

    /**
     * Gets the value of the itemText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemText() {
        return itemText;
    }

    /**
     * Sets the value of the itemText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemText(String value) {
        this.itemText = value;
    }

    /**
     * Gets the value of the listItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getListItem() {
        if (listItem == null) {
            listItem = new ArrayList<String>();
        }
        return this.listItem;
    }

    /**
     * Gets the value of the defaultValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultValue() {
        return defaultValue;
    }

    /**
     * Sets the value of the defaultValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultValue(String value) {
        this.defaultValue = value;
    }

    /**
     * Gets the value of the isMandatory property.
     * 
     */
    public boolean isIsMandatory() {
        return isMandatory;
    }

    /**
     * Sets the value of the isMandatory property.
     * 
     */
    public void setIsMandatory(boolean value) {
        this.isMandatory = value;
    }

    /**
     * Gets the value of the sortCode property.
     * 
     */
    public int getSortCode() {
        return sortCode;
    }

    /**
     * Sets the value of the sortCode property.
     * 
     */
    public void setSortCode(int value) {
        this.sortCode = value;
    }

}
