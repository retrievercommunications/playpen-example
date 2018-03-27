
package au.com.retriever.playpen.ws.client.generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for form complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="form"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="formDesc" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="page" type="{http://ws.api.playpen.retriever.com.au/}page" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "form", propOrder = {
    "formDesc",
    "page"
})
public class Form {

    @XmlElement(required = true)
    protected String formDesc;
    @XmlElement(required = true)
    protected List<Page> page;

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
     * Gets the value of the page property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the page property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Page }
     * 
     * 
     */
    public List<Page> getPage() {
        if (page == null) {
            page = new ArrayList<Page>();
        }
        return this.page;
    }

}
