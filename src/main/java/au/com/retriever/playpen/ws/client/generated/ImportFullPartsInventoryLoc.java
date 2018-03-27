
package au.com.retriever.playpen.ws.client.generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for importFullPartsInventoryLoc complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="importFullPartsInventoryLoc"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="partsInventoryLoc" type="{http://ws.api.playpen.retriever.com.au/}partsInventoryLoc" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "importFullPartsInventoryLoc", propOrder = {
    "partsInventoryLoc"
})
public class ImportFullPartsInventoryLoc {

    @XmlElement(required = true)
    protected List<PartsInventoryLoc> partsInventoryLoc;

    /**
     * Gets the value of the partsInventoryLoc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partsInventoryLoc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartsInventoryLoc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartsInventoryLoc }
     * 
     * 
     */
    public List<PartsInventoryLoc> getPartsInventoryLoc() {
        if (partsInventoryLoc == null) {
            partsInventoryLoc = new ArrayList<PartsInventoryLoc>();
        }
        return this.partsInventoryLoc;
    }

}
