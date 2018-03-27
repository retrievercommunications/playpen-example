
package au.com.retriever.playpen.ws.client.generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for exportNPTimes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="exportNPTimes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NPTime" type="{http://ws.api.playpen.retriever.com.au/}export" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "exportNPTimes", propOrder = {
    "npTime"
})
public class ExportNPTimes {

    @XmlElement(name = "NPTime", required = true)
    protected List<Export> npTime;

    /**
     * Gets the value of the npTime property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the npTime property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNPTime().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Export }
     * 
     * 
     */
    public List<Export> getNPTime() {
        if (npTime == null) {
            npTime = new ArrayList<Export>();
        }
        return this.npTime;
    }

}
