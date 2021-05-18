
package com.bajajalianz.insurance.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
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
 *         &lt;element name="plan-no" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="plan-name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tenure" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="insured-amount" type="{http://www.w3.org/2001/XMLSchema}float"/>
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
    "planNo",
    "planName",
    "tenure",
    "insuredAmount"
})
@XmlRootElement(name = "plan")
public class Plan {

    @XmlElement(name = "plan-no")
    protected int planNo;
    @XmlElement(name = "plan-name", required = true)
    protected String planName;
    protected int tenure;
    @XmlElement(name = "insured-amount")
    protected float insuredAmount;

    /**
     * Gets the value of the planNo property.
     * 
     */
    public int getPlanNo() {
        return planNo;
    }

    /**
     * Sets the value of the planNo property.
     * 
     */
    public void setPlanNo(int value) {
        this.planNo = value;
    }

    /**
     * Gets the value of the planName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlanName() {
        return planName;
    }

    /**
     * Sets the value of the planName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlanName(String value) {
        this.planName = value;
    }

    /**
     * Gets the value of the tenure property.
     * 
     */
    public int getTenure() {
        return tenure;
    }

    /**
     * Sets the value of the tenure property.
     * 
     */
    public void setTenure(int value) {
        this.tenure = value;
    }

    /**
     * Gets the value of the insuredAmount property.
     * 
     */
    public float getInsuredAmount() {
        return insuredAmount;
    }

    /**
     * Sets the value of the insuredAmount property.
     * 
     */
    public void setInsuredAmount(float value) {
        this.insuredAmount = value;
    }

}
