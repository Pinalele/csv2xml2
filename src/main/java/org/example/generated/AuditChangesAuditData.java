//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.11.04 at 06:06:42 da tarde WET 
//


package org.example.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for auditChangesAuditData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="auditChangesAuditData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="issue_ref" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="date_object_type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="time_object_type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="user_object_type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="last_val" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "auditChangesAuditData", namespace = "urn:x-emc:com.bnpparibas:solar:solar:infoarchive:lama:london:1.9", propOrder = {
    "issueRef",
    "description",
    "dateObjectType",
    "timeObjectType",
    "userObjectType",
    "lastVal"
})
public class AuditChangesAuditData {

    @XmlElement(name = "issue_ref", required = true)
    protected String issueRef;
    @XmlElement(required = true)
    protected String description;
    @XmlElement(name = "date_object_type", required = true)
    protected String dateObjectType;
    @XmlElement(name = "time_object_type", required = true)
    protected String timeObjectType;
    @XmlElement(name = "user_object_type", required = true)
    protected String userObjectType;
    @XmlElement(name = "last_val", required = true)
    protected String lastVal;

    /**
     * Gets the value of the issueRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssueRef() {
        return issueRef;
    }

    /**
     * Sets the value of the issueRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssueRef(String value) {
        this.issueRef = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the dateObjectType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateObjectType() {
        return dateObjectType;
    }

    /**
     * Sets the value of the dateObjectType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateObjectType(String value) {
        this.dateObjectType = value;
    }

    /**
     * Gets the value of the timeObjectType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeObjectType() {
        return timeObjectType;
    }

    /**
     * Sets the value of the timeObjectType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeObjectType(String value) {
        this.timeObjectType = value;
    }

    /**
     * Gets the value of the userObjectType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserObjectType() {
        return userObjectType;
    }

    /**
     * Sets the value of the userObjectType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserObjectType(String value) {
        this.userObjectType = value;
    }

    /**
     * Gets the value of the lastVal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastVal() {
        return lastVal;
    }

    /**
     * Sets the value of the lastVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastVal(String value) {
        this.lastVal = value;
    }

}
