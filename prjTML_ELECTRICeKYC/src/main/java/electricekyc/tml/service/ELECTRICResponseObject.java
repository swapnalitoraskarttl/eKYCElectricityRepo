
package electricekyc.tml.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ELECTRICResponseObject complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ELECTRICResponseObject"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="KYC" type="{http://service.TML.ELECTRICeKYC/}KYCObject" minOccurs="0"/&gt;
 *         &lt;element name="NameMatch" type="{http://service.TML.ELECTRICeKYC/}NameMatchObject" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ELECTRICResponseObject", propOrder = {
    "kyc",
    "nameMatch"
})
public class ELECTRICResponseObject {

    @XmlElement(name = "KYC")
    protected KYCObject kyc;
    @XmlElement(name = "NameMatch")
    protected NameMatchObject nameMatch;

    /**
     * Gets the value of the kyc property.
     * 
     * @return
     *     possible object is
     *     {@link KYCObject }
     *     
     */
    public KYCObject getKYC() {
        return kyc;
    }

    /**
     * Sets the value of the kyc property.
     * 
     * @param value
     *     allowed object is
     *     {@link KYCObject }
     *     
     */
    public void setKYC(KYCObject value) {
        this.kyc = value;
    }

    /**
     * Gets the value of the nameMatch property.
     * 
     * @return
     *     possible object is
     *     {@link NameMatchObject }
     *     
     */
    public NameMatchObject getNameMatch() {
        return nameMatch;
    }

    /**
     * Sets the value of the nameMatch property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameMatchObject }
     *     
     */
    public void setNameMatch(NameMatchObject value) {
        this.nameMatch = value;
    }

}
