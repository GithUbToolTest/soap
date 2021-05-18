//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.05.11 at 05:03:11 PM IST 
//


package ford._interface.vehicle.security.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ModuleAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="VIN" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PartNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Seed" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SecurityLevel" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
 *         &lt;element name="TransactionId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="UserID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="UserType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="LanguageCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CountryCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "moduleAddress",
    "vin",
    "partNumber",
    "seed",
    "securityLevel",
    "transactionId",
    "userID",
    "userType",
    "languageCode",
    "countryCode"
})
@XmlRootElement(name = "GetSecurityLevelRequest")
public class GetSecurityLevelRequest {

    @XmlElement(name = "ModuleAddress", required = true)
    protected String moduleAddress;
    @XmlElement(name = "VIN", required = true)
    protected String vin;
    @XmlElement(name = "PartNumber", required = true)
    protected String partNumber;
    @XmlElement(name = "Seed", required = true)
    protected String seed;
    @XmlElement(name = "SecurityLevel")
    @XmlSchemaType(name = "unsignedByte")
    protected short securityLevel;
    @XmlElement(name = "TransactionId", required = true)
    protected String transactionId;
    @XmlElement(name = "UserID", required = true)
    protected String userID;
    @XmlElement(name = "UserType", required = true)
    protected String userType;
    @XmlElement(name = "LanguageCode", required = true)
    protected String languageCode;
    @XmlElement(name = "CountryCode", required = true)
    protected String countryCode;

    /**
     * Gets the value of the moduleAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModuleAddress() {
        return moduleAddress;
    }

    /**
     * Sets the value of the moduleAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModuleAddress(String value) {
        this.moduleAddress = value;
    }

    /**
     * Gets the value of the vin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVIN() {
        return vin;
    }

    /**
     * Sets the value of the vin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVIN(String value) {
        this.vin = value;
    }

    /**
     * Gets the value of the partNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartNumber() {
        return partNumber;
    }

    /**
     * Sets the value of the partNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartNumber(String value) {
        this.partNumber = value;
    }

    /**
     * Gets the value of the seed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeed() {
        return seed;
    }

    /**
     * Sets the value of the seed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeed(String value) {
        this.seed = value;
    }

    /**
     * Gets the value of the securityLevel property.
     * 
     */
    public short getSecurityLevel() {
        return securityLevel;
    }

    /**
     * Sets the value of the securityLevel property.
     * 
     */
    public void setSecurityLevel(short value) {
        this.securityLevel = value;
    }

    /**
     * Gets the value of the transactionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionId() {
        return transactionId;
    }

    /**
     * Sets the value of the transactionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionId(String value) {
        this.transactionId = value;
    }

    /**
     * Gets the value of the userID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserID() {
        return userID;
    }

    /**
     * Sets the value of the userID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserID(String value) {
        this.userID = value;
    }

    /**
     * Gets the value of the userType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserType() {
        return userType;
    }

    /**
     * Sets the value of the userType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserType(String value) {
        this.userType = value;
    }

    /**
     * Gets the value of the languageCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguageCode() {
        return languageCode;
    }

    /**
     * Sets the value of the languageCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguageCode(String value) {
        this.languageCode = value;
    }

    /**
     * Gets the value of the countryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the countryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryCode(String value) {
        this.countryCode = value;
    }

}
