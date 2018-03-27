
package au.com.retriever.playpen.ws.client.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for eJob complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="eJob"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="jobId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="phaseId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="techId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="workDone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="workRecommend" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="officeNotes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="jobDateTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="signatureName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="jobStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="custName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="custId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="address1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="address2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="suburb" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="postcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="contact" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="jobDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="createDatetime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="techName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="serialNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="jobType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="accountMgrEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="serviceMgrEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="eSignature" type="{http://ws.api.playpen.retriever.com.au/}eSignature" minOccurs="0"/&gt;
 *         &lt;element name="eTime" type="{http://ws.api.playpen.retriever.com.au/}eTime" minOccurs="0"/&gt;
 *         &lt;element name="paymentOption" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="siteNotes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="employer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="subemployer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="eResolutionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="custState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "eJob", propOrder = {
    "jobId",
    "phaseId",
    "techId",
    "workDone",
    "workRecommend",
    "comments",
    "officeNotes",
    "jobDateTime",
    "signatureName",
    "jobStatus",
    "custName",
    "custId",
    "address1",
    "address2",
    "suburb",
    "postcode",
    "contact",
    "phone",
    "jobDesc",
    "createDatetime",
    "techName",
    "serialNo",
    "jobType",
    "email",
    "accountMgrEmail",
    "serviceMgrEmail",
    "eSignature",
    "eTime",
    "paymentOption",
    "siteNotes",
    "employer",
    "subemployer",
    "eResolutionCode",
    "custState"
})
public class EJob {

    protected String jobId;
    protected String phaseId;
    protected String techId;
    protected String workDone;
    protected String workRecommend;
    protected String comments;
    protected String officeNotes;
    protected String jobDateTime;
    protected String signatureName;
    protected String jobStatus;
    protected String custName;
    protected String custId;
    protected String address1;
    protected String address2;
    protected String suburb;
    protected String postcode;
    protected String contact;
    protected String phone;
    protected String jobDesc;
    protected String createDatetime;
    protected String techName;
    protected String serialNo;
    protected String jobType;
    protected String email;
    protected String accountMgrEmail;
    protected String serviceMgrEmail;
    protected ESignature eSignature;
    protected ETime eTime;
    protected String paymentOption;
    protected String siteNotes;
    protected String employer;
    protected String subemployer;
    protected String eResolutionCode;
    protected String custState;

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
     * Gets the value of the phaseId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhaseId() {
        return phaseId;
    }

    /**
     * Sets the value of the phaseId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhaseId(String value) {
        this.phaseId = value;
    }

    /**
     * Gets the value of the techId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTechId() {
        return techId;
    }

    /**
     * Sets the value of the techId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTechId(String value) {
        this.techId = value;
    }

    /**
     * Gets the value of the workDone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkDone() {
        return workDone;
    }

    /**
     * Sets the value of the workDone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkDone(String value) {
        this.workDone = value;
    }

    /**
     * Gets the value of the workRecommend property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkRecommend() {
        return workRecommend;
    }

    /**
     * Sets the value of the workRecommend property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkRecommend(String value) {
        this.workRecommend = value;
    }

    /**
     * Gets the value of the comments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComments() {
        return comments;
    }

    /**
     * Sets the value of the comments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComments(String value) {
        this.comments = value;
    }

    /**
     * Gets the value of the officeNotes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfficeNotes() {
        return officeNotes;
    }

    /**
     * Sets the value of the officeNotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfficeNotes(String value) {
        this.officeNotes = value;
    }

    /**
     * Gets the value of the jobDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobDateTime() {
        return jobDateTime;
    }

    /**
     * Sets the value of the jobDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobDateTime(String value) {
        this.jobDateTime = value;
    }

    /**
     * Gets the value of the signatureName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignatureName() {
        return signatureName;
    }

    /**
     * Sets the value of the signatureName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignatureName(String value) {
        this.signatureName = value;
    }

    /**
     * Gets the value of the jobStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobStatus() {
        return jobStatus;
    }

    /**
     * Sets the value of the jobStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobStatus(String value) {
        this.jobStatus = value;
    }

    /**
     * Gets the value of the custName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustName() {
        return custName;
    }

    /**
     * Sets the value of the custName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustName(String value) {
        this.custName = value;
    }

    /**
     * Gets the value of the custId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustId() {
        return custId;
    }

    /**
     * Sets the value of the custId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustId(String value) {
        this.custId = value;
    }

    /**
     * Gets the value of the address1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress1() {
        return address1;
    }

    /**
     * Sets the value of the address1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress1(String value) {
        this.address1 = value;
    }

    /**
     * Gets the value of the address2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress2() {
        return address2;
    }

    /**
     * Sets the value of the address2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress2(String value) {
        this.address2 = value;
    }

    /**
     * Gets the value of the suburb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuburb() {
        return suburb;
    }

    /**
     * Sets the value of the suburb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuburb(String value) {
        this.suburb = value;
    }

    /**
     * Gets the value of the postcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostcode() {
        return postcode;
    }

    /**
     * Sets the value of the postcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostcode(String value) {
        this.postcode = value;
    }

    /**
     * Gets the value of the contact property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContact() {
        return contact;
    }

    /**
     * Sets the value of the contact property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContact(String value) {
        this.contact = value;
    }

    /**
     * Gets the value of the phone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Sets the value of the phone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone(String value) {
        this.phone = value;
    }

    /**
     * Gets the value of the jobDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobDesc() {
        return jobDesc;
    }

    /**
     * Sets the value of the jobDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobDesc(String value) {
        this.jobDesc = value;
    }

    /**
     * Gets the value of the createDatetime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreateDatetime() {
        return createDatetime;
    }

    /**
     * Sets the value of the createDatetime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreateDatetime(String value) {
        this.createDatetime = value;
    }

    /**
     * Gets the value of the techName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTechName() {
        return techName;
    }

    /**
     * Sets the value of the techName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTechName(String value) {
        this.techName = value;
    }

    /**
     * Gets the value of the serialNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerialNo() {
        return serialNo;
    }

    /**
     * Sets the value of the serialNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerialNo(String value) {
        this.serialNo = value;
    }

    /**
     * Gets the value of the jobType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobType() {
        return jobType;
    }

    /**
     * Sets the value of the jobType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobType(String value) {
        this.jobType = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the accountMgrEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountMgrEmail() {
        return accountMgrEmail;
    }

    /**
     * Sets the value of the accountMgrEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountMgrEmail(String value) {
        this.accountMgrEmail = value;
    }

    /**
     * Gets the value of the serviceMgrEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceMgrEmail() {
        return serviceMgrEmail;
    }

    /**
     * Sets the value of the serviceMgrEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceMgrEmail(String value) {
        this.serviceMgrEmail = value;
    }

    /**
     * Gets the value of the eSignature property.
     * 
     * @return
     *     possible object is
     *     {@link ESignature }
     *     
     */
    public ESignature getESignature() {
        return eSignature;
    }

    /**
     * Sets the value of the eSignature property.
     * 
     * @param value
     *     allowed object is
     *     {@link ESignature }
     *     
     */
    public void setESignature(ESignature value) {
        this.eSignature = value;
    }

    /**
     * Gets the value of the eTime property.
     * 
     * @return
     *     possible object is
     *     {@link ETime }
     *     
     */
    public ETime getETime() {
        return eTime;
    }

    /**
     * Sets the value of the eTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link ETime }
     *     
     */
    public void setETime(ETime value) {
        this.eTime = value;
    }

    /**
     * Gets the value of the paymentOption property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentOption() {
        return paymentOption;
    }

    /**
     * Sets the value of the paymentOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentOption(String value) {
        this.paymentOption = value;
    }

    /**
     * Gets the value of the siteNotes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSiteNotes() {
        return siteNotes;
    }

    /**
     * Sets the value of the siteNotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSiteNotes(String value) {
        this.siteNotes = value;
    }

    /**
     * Gets the value of the employer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmployer() {
        return employer;
    }

    /**
     * Sets the value of the employer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmployer(String value) {
        this.employer = value;
    }

    /**
     * Gets the value of the subemployer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubemployer() {
        return subemployer;
    }

    /**
     * Sets the value of the subemployer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubemployer(String value) {
        this.subemployer = value;
    }

    /**
     * Gets the value of the eResolutionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEResolutionCode() {
        return eResolutionCode;
    }

    /**
     * Sets the value of the eResolutionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEResolutionCode(String value) {
        this.eResolutionCode = value;
    }

    /**
     * Gets the value of the custState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustState() {
        return custState;
    }

    /**
     * Sets the value of the custState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustState(String value) {
        this.custState = value;
    }

}
