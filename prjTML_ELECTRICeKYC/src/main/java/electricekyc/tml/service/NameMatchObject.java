
package electricekyc.tml.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NameMatchObject complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NameMatchObject"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="request_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="statusCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ELECTRICResult" type="{http://service.TML.ELECTRICeKYC/}ELECTRICResultObject" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NameMatchObject", propOrder = {
    "requestId",
    "statusCode",
    "electricResult"
})
public class NameMatchObject {

    @XmlElement(name = "request_id")
    protected String requestId;
    protected String statusCode;
    @XmlElement(name = "ELECTRICResult")
    protected ELECTRICResultObject electricResult;

    /**
     * Gets the value of the requestId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestId() {
        return requestId;
    }

    /**
     * Sets the value of the requestId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestId(String value) {
        this.requestId = value;
    }

    /**
     * Gets the value of the statusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusCode() {
        return statusCode;
    }

    /**
     * Sets the value of the statusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusCode(String value) {
        this.statusCode = value;
    }

    /**
     * Gets the value of the electricResult property.
     * 
     * @return
     *     possible object is
     *     {@link ELECTRICResultObject }
     *     
     */
    public ELECTRICResultObject getELECTRICResult() {
        return electricResult;
    }

    /**
     * Sets the value of the electricResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ELECTRICResultObject }
     *     
     */
    public void setELECTRICResult(ELECTRICResultObject value) {
        this.electricResult = value;
    }

}
