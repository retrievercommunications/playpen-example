
package au.com.retriever.playpen.ws.client.generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for importCustomerAssets complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="importCustomerAssets"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="assetsList" type="{http://ws.api.playpen.retriever.com.au/}customerAssets" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "importCustomerAssets", propOrder = {
    "assetsList"
})
public class ImportCustomerAssets {

    @XmlElement(required = true)
    protected List<CustomerAssets> assetsList;

    /**
     * Gets the value of the assetsList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the assetsList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssetsList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerAssets }
     * 
     * 
     */
    public List<CustomerAssets> getAssetsList() {
        if (assetsList == null) {
            assetsList = new ArrayList<CustomerAssets>();
        }
        return this.assetsList;
    }

}
