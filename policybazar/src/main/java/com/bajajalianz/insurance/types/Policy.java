
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
 *         &lt;element name="policy-no" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="policy-name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tenure" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="insured-amount" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="insured-policy-member" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "policyNo",
    "policyName",
    "tenure",
    "insuredAmount",
    "insuredPolicyMember"
})
@XmlRootElement(name = "policy")
public class Policy {

    @XmlElement(name = "policy-no")
    protected int policyNo;
    @XmlElement(name = "policy-name", required = true)
    protected String policyName;
    protected int tenure;
    @XmlElement(name = "insured-amount")
    protected float insuredAmount;
    @XmlElement(name = "insured-policy-member", required = true)
    protected String insuredPolicyMember;

    /**
     * Gets the value of the policyNo property.
     * 
     */
    public int getPolicyNo() {
        return policyNo;
    }

    /**
     * Sets the value of the policyNo property.
     * 
     */
    public void setPolicyNo(int value) {
        this.policyNo = value;
    }

    /**
     * Gets the value of the policyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolicyName() {
        return policyName;
    }

    /**
     * Sets the value of the policyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolicyName(String value) {
        this.policyName = value;
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

    /**
     * Gets the value of the insuredPolicyMember property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsuredPolicyMember() {
        return insuredPolicyMember;
    }

    /**
     * Sets the value of the insuredPolicyMember property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsuredPolicyMember(String value) {
        this.insuredPolicyMember = value;
    }

	@Override
	public String toString() {
		return "Policy [policyNo=" + policyNo + ", policyName=" + policyName + ", tenure=" + tenure + ", insuredAmount="
				+ insuredAmount + ", insuredPolicyMember=" + insuredPolicyMember + "]";
	}
    
}
