
package au.com.retriever.playpen.ws.client.generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for job complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="job"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ws.api.playpen.retriever.com.au/}generalDetails"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="phaseId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="custSubId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="techId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="customerName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="custId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="location" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="serialNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="duration" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="plannedStart" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="plannedEnd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="jobType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="priority" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="slaPriority" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="officeNote" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="asset" type="{http://ws.api.playpen.retriever.com.au/}asset" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="services" type="{http://ws.api.playpen.retriever.com.au/}service" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="formItemProperties" type="{http://ws.api.playpen.retriever.com.au/}formItemProperties" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="requiredCapabilities" type="{http://ws.api.playpen.retriever.com.au/}requiredCapabilities" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "job", propOrder = {
    "phaseId",
    "custSubId",
    "techId",
    "customerName",
    "custId",
    "location",
    "serialNo",
    "startDate",
    "duration",
    "plannedStart",
    "plannedEnd",
    "jobType",
    "priority",
    "slaPriority",
    "officeNote",
    "asset",
    "services",
    "formItemProperties",
    "requiredCapabilities"
})
public class Job
    extends GeneralDetails
{

    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer phaseId;
    @XmlElementRef(name = "custSubId", type = JAXBElement.class, required = false)
    protected JAXBElement<String> custSubId;
    @XmlElementRef(name = "techId", type = JAXBElement.class, required = false)
    protected JAXBElement<String> techId;
    @XmlElement(required = true)
    protected String customerName;
    @XmlElementRef(name = "custId", type = JAXBElement.class, required = false)
    protected JAXBElement<String> custId;
    @XmlElementRef(name = "location", type = JAXBElement.class, required = false)
    protected JAXBElement<String> location;
    @XmlElementRef(name = "serialNo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> serialNo;
    @XmlElementRef(name = "startDate", type = JAXBElement.class, required = false)
    protected JAXBElement<String> startDate;
    @XmlElementRef(name = "duration", type = JAXBElement.class, required = false)
    protected JAXBElement<String> duration;
    @XmlElementRef(name = "plannedStart", type = JAXBElement.class, required = false)
    protected JAXBElement<String> plannedStart;
    @XmlElementRef(name = "plannedEnd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> plannedEnd;
    @XmlElementRef(name = "jobType", type = JAXBElement.class, required = false)
    protected JAXBElement<String> jobType;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean priority;
    @XmlElementRef(name = "slaPriority", type = JAXBElement.class, required = false)
    protected JAXBElement<String> slaPriority;
    @XmlElementRef(name = "officeNote", type = JAXBElement.class, required = false)
    protected JAXBElement<String> officeNote;
    @XmlElement(nillable = true)
    protected List<Asset> asset;
    @XmlElement(nillable = true)
    protected List<Service> services;
    @XmlElement(nillable = true)
    protected List<FormItemProperties> formItemProperties;
    @XmlElement(nillable = true)
    protected List<RequiredCapabilities> requiredCapabilities;

    /**
     * Gets the value of the phaseId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPhaseId() {
        return phaseId;
    }

    /**
     * Sets the value of the phaseId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPhaseId(Integer value) {
        this.phaseId = value;
    }

    /**
     * Gets the value of the custSubId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCustSubId() {
        return custSubId;
    }

    /**
     * Sets the value of the custSubId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCustSubId(JAXBElement<String> value) {
        this.custSubId = value;
    }

    /**
     * Gets the value of the techId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTechId() {
        return techId;
    }

    /**
     * Sets the value of the techId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTechId(JAXBElement<String> value) {
        this.techId = value;
    }

    /**
     * Gets the value of the customerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * Sets the value of the customerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerName(String value) {
        this.customerName = value;
    }

    /**
     * Gets the value of the custId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCustId() {
        return custId;
    }

    /**
     * Sets the value of the custId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCustId(JAXBElement<String> value) {
        this.custId = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLocation(JAXBElement<String> value) {
        this.location = value;
    }

    /**
     * Gets the value of the serialNo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSerialNo() {
        return serialNo;
    }

    /**
     * Sets the value of the serialNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSerialNo(JAXBElement<String> value) {
        this.serialNo = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStartDate(JAXBElement<String> value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the duration property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDuration() {
        return duration;
    }

    /**
     * Sets the value of the duration property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDuration(JAXBElement<String> value) {
        this.duration = value;
    }

    /**
     * Gets the value of the plannedStart property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPlannedStart() {
        return plannedStart;
    }

    /**
     * Sets the value of the plannedStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPlannedStart(JAXBElement<String> value) {
        this.plannedStart = value;
    }

    /**
     * Gets the value of the plannedEnd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPlannedEnd() {
        return plannedEnd;
    }

    /**
     * Sets the value of the plannedEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPlannedEnd(JAXBElement<String> value) {
        this.plannedEnd = value;
    }

    /**
     * Gets the value of the jobType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getJobType() {
        return jobType;
    }

    /**
     * Sets the value of the jobType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setJobType(JAXBElement<String> value) {
        this.jobType = value;
    }

    /**
     * Gets the value of the priority property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPriority(Boolean value) {
        this.priority = value;
    }

    /**
     * Gets the value of the slaPriority property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSlaPriority() {
        return slaPriority;
    }

    /**
     * Sets the value of the slaPriority property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSlaPriority(JAXBElement<String> value) {
        this.slaPriority = value;
    }

    /**
     * Gets the value of the officeNote property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOfficeNote() {
        return officeNote;
    }

    /**
     * Sets the value of the officeNote property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOfficeNote(JAXBElement<String> value) {
        this.officeNote = value;
    }

    /**
     * Gets the value of the asset property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the asset property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAsset().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Asset }
     * 
     * 
     */
    public List<Asset> getAsset() {
        if (asset == null) {
            asset = new ArrayList<Asset>();
        }
        return this.asset;
    }

    /**
     * Gets the value of the services property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the services property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServices().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Service }
     * 
     * 
     */
    public List<Service> getServices() {
        if (services == null) {
            services = new ArrayList<Service>();
        }
        return this.services;
    }

    /**
     * Gets the value of the formItemProperties property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the formItemProperties property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFormItemProperties().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FormItemProperties }
     * 
     * 
     */
    public List<FormItemProperties> getFormItemProperties() {
        if (formItemProperties == null) {
            formItemProperties = new ArrayList<FormItemProperties>();
        }
        return this.formItemProperties;
    }

    /**
     * Gets the value of the requiredCapabilities property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the requiredCapabilities property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRequiredCapabilities().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RequiredCapabilities }
     * 
     * 
     */
    public List<RequiredCapabilities> getRequiredCapabilities() {
        if (requiredCapabilities == null) {
            requiredCapabilities = new ArrayList<RequiredCapabilities>();
        }
        return this.requiredCapabilities;
    }

}
