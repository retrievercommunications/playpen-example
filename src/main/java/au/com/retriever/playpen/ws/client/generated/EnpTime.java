
package au.com.retriever.playpen.ws.client.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for enpTime complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="enpTime"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="jobId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="labType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="labQty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="labQtyOT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="labQtyDT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="travelQty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="statusTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fieldWorker" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="endDateTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="startDateTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nonJobTimeTypeID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "enpTime", propOrder = {
    "jobId",
    "labType",
    "labQty",
    "labQtyOT",
    "labQtyDT",
    "travelQty",
    "statusTime",
    "fieldWorker",
    "endDateTime",
    "startDateTime",
    "nonJobTimeTypeID"
})
public class EnpTime {

    protected String jobId;
    protected String labType;
    protected String labQty;
    protected String labQtyOT;
    protected String labQtyDT;
    protected String travelQty;
    protected String statusTime;
    protected String fieldWorker;
    protected String endDateTime;
    protected String startDateTime;
    protected String nonJobTimeTypeID;

    /**
     * Gets the value of the jobId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobId() {
        return jobId;
    }

    /**
     * Sets the value of the jobId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobId(String value) {
        this.jobId = value;
    }

    /**
     * Gets the value of the labType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabType() {
        return labType;
    }

    /**
     * Sets the value of the labType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabType(String value) {
        this.labType = value;
    }

    /**
     * Gets the value of the labQty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabQty() {
        return labQty;
    }

    /**
     * Sets the value of the labQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabQty(String value) {
        this.labQty = value;
    }

    /**
     * Gets the value of the labQtyOT property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabQtyOT() {
        return labQtyOT;
    }

    /**
     * Sets the value of the labQtyOT property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabQtyOT(String value) {
        this.labQtyOT = value;
    }

    /**
     * Gets the value of the labQtyDT property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabQtyDT() {
        return labQtyDT;
    }

    /**
     * Sets the value of the labQtyDT property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabQtyDT(String value) {
        this.labQtyDT = value;
    }

    /**
     * Gets the value of the travelQty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTravelQty() {
        return travelQty;
    }

    /**
     * Sets the value of the travelQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTravelQty(String value) {
        this.travelQty = value;
    }

    /**
     * Gets the value of the statusTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusTime() {
        return statusTime;
    }

    /**
     * Sets the value of the statusTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusTime(String value) {
        this.statusTime = value;
    }

    /**
     * Gets the value of the fieldWorker property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFieldWorker() {
        return fieldWorker;
    }

    /**
     * Sets the value of the fieldWorker property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFieldWorker(String value) {
        this.fieldWorker = value;
    }

    /**
     * Gets the value of the endDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndDateTime() {
        return endDateTime;
    }

    /**
     * Sets the value of the endDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndDateTime(String value) {
        this.endDateTime = value;
    }

    /**
     * Gets the value of the startDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartDateTime() {
        return startDateTime;
    }

    /**
     * Sets the value of the startDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartDateTime(String value) {
        this.startDateTime = value;
    }

    /**
     * Gets the value of the nonJobTimeTypeID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNonJobTimeTypeID() {
        return nonJobTimeTypeID;
    }

    /**
     * Sets the value of the nonJobTimeTypeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNonJobTimeTypeID(String value) {
        this.nonJobTimeTypeID = value;
    }

}
