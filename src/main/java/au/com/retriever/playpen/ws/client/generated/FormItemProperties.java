
package au.com.retriever.playpen.ws.client.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for formItemProperties complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="formItemProperties"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="formDesc" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="pageName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="itemName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="defaultValue" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "formItemProperties", propOrder = {
    "formDesc",
    "pageName",
    "itemName",
    "defaultValue"
})
public class FormItemProperties {

    @XmlElement(required = true)
    protected String formDesc;
    @XmlElement(required = true)
    protected String pageName;
    @XmlElement(required = true)
    protected String itemName;
    @XmlElement(required = true)
    protected String defaultValue;

    /**
     * Gets the value of the formDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormDesc() {
        return formDesc;
    }

    /**
     * Sets the value of the formDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormDesc(String value) {
        this.formDesc = value;
    }

    /**
     * Gets the value of the pageName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPageName() {
        return pageName;
    }

    /**
     * Sets the value of the pageName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPageName(String value) {
        this.pageName = value;
    }

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

}
