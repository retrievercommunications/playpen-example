
package au.com.retriever.playpen.ws.client.generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for result complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="result"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="success" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="txId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="errorCode" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="errorMsg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="completedForm" type="{http://ws.api.playpen.retriever.com.au/}eCompletedForm" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="eFieldworker" type="{http://ws.api.playpen.retriever.com.au/}eFieldworker" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="eGPS" type="{http://ws.api.playpen.retriever.com.au/}eGps" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="eStatusUpdate" type="{http://ws.api.playpen.retriever.com.au/}eStatusUpdate" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="eJob" type="{http://ws.api.playpen.retriever.com.au/}eJob" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="eNPTime" type="{http://ws.api.playpen.retriever.com.au/}enpTime" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="eNewJob" type="{http://ws.api.playpen.retriever.com.au/}eNewJob" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "result", propOrder = {
    "success",
    "txId",
    "errorCode",
    "errorMsg",
    "completedForm",
    "eFieldworker",
    "egps",
    "eStatusUpdate",
    "eJob",
    "enpTime",
    "eNewJob"
})
public class Result {

    protected boolean success;
    protected String txId;
    protected int errorCode;
    protected String errorMsg;
    protected List<ECompletedForm> completedForm;
    protected List<EFieldworker> eFieldworker;
    @XmlElement(name = "eGPS")
    protected List<EGps> egps;
    protected List<EStatusUpdate> eStatusUpdate;
    protected List<EJob> eJob;
    @XmlElement(name = "eNPTime")
    protected List<EnpTime> enpTime;
    protected List<ENewJob> eNewJob;

    /**
     * Gets the value of the success property.
     * 
     */
    public boolean isSuccess() {
        return success;
    }

    /**
     * Sets the value of the success property.
     * 
     */
    public void setSuccess(boolean value) {
        this.success = value;
    }

    /**
     * Gets the value of the txId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxId() {
        return txId;
    }

    /**
     * Sets the value of the txId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxId(String value) {
        this.txId = value;
    }

    /**
     * Gets the value of the errorCode property.
     * 
     */
    public int getErrorCode() {
        return errorCode;
    }

    /**
     * Sets the value of the errorCode property.
     * 
     */
    public void setErrorCode(int value) {
        this.errorCode = value;
    }

    /**
     * Gets the value of the errorMsg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorMsg() {
        return errorMsg;
    }

    /**
     * Sets the value of the errorMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorMsg(String value) {
        this.errorMsg = value;
    }

    /**
     * Gets the value of the completedForm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the completedForm property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCompletedForm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ECompletedForm }
     * 
     * 
     */
    public List<ECompletedForm> getCompletedForm() {
        if (completedForm == null) {
            completedForm = new ArrayList<ECompletedForm>();
        }
        return this.completedForm;
    }

    /**
     * Gets the value of the eFieldworker property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eFieldworker property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEFieldworker().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EFieldworker }
     * 
     * 
     */
    public List<EFieldworker> getEFieldworker() {
        if (eFieldworker == null) {
            eFieldworker = new ArrayList<EFieldworker>();
        }
        return this.eFieldworker;
    }

    /**
     * Gets the value of the egps property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the egps property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEGPS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EGps }
     * 
     * 
     */
    public List<EGps> getEGPS() {
        if (egps == null) {
            egps = new ArrayList<EGps>();
        }
        return this.egps;
    }

    /**
     * Gets the value of the eStatusUpdate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eStatusUpdate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEStatusUpdate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EStatusUpdate }
     * 
     * 
     */
    public List<EStatusUpdate> getEStatusUpdate() {
        if (eStatusUpdate == null) {
            eStatusUpdate = new ArrayList<EStatusUpdate>();
        }
        return this.eStatusUpdate;
    }

    /**
     * Gets the value of the eJob property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eJob property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEJob().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EJob }
     * 
     * 
     */
    public List<EJob> getEJob() {
        if (eJob == null) {
            eJob = new ArrayList<EJob>();
        }
        return this.eJob;
    }

    /**
     * Gets the value of the enpTime property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the enpTime property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getENPTime().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EnpTime }
     * 
     * 
     */
    public List<EnpTime> getENPTime() {
        if (enpTime == null) {
            enpTime = new ArrayList<EnpTime>();
        }
        return this.enpTime;
    }

    /**
     * Gets the value of the eNewJob property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eNewJob property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getENewJob().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ENewJob }
     * 
     * 
     */
    public List<ENewJob> getENewJob() {
        if (eNewJob == null) {
            eNewJob = new ArrayList<ENewJob>();
        }
        return this.eNewJob;
    }

}
