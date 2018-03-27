
package au.com.retriever.playpen.ws.client.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for message complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="message"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="techId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="msgId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="msg" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="msgDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "message", propOrder = {
    "techId",
    "msgId",
    "msg",
    "msgDate"
})
public class Message {

    @XmlElement(required = true)
    protected String techId;
    @XmlElement(required = true)
    protected String msgId;
    @XmlElement(required = true)
    protected String msg;
    @XmlElement(required = true)
    protected String msgDate;

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
     * Gets the value of the msgId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgId() {
        return msgId;
    }

    /**
     * Sets the value of the msgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgId(String value) {
        this.msgId = value;
    }

    /**
     * Gets the value of the msg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsg() {
        return msg;
    }

    /**
     * Sets the value of the msg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsg(String value) {
        this.msg = value;
    }

    /**
     * Gets the value of the msgDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgDate() {
        return msgDate;
    }

    /**
     * Sets the value of the msgDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgDate(String value) {
        this.msgDate = value;
    }

}
