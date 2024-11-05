//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.11.05 at 06:49:23 da tarde WET 
//


package org.example.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CaaMessageAuditObject complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CaaMessageAuditObject">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="trigram" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="type_of_data" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="date_of_extraction" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="branch" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="londonCaaMessageAudit" type="{urn:x-emc:com.bnpparibas:solar:solar:infoarchive:lama:london:1.13}CaaMessageAudit" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CaaMessageAuditObject", propOrder = {
    "trigram",
    "typeOfData",
    "dateOfExtraction",
    "branch",
    "londonCaaMessageAudit"
})
public class CaaMessageAuditObject {

    @XmlElement(required = true)
    protected String trigram;
    @XmlElement(name = "type_of_data", required = true)
    protected String typeOfData;
    @XmlElement(name = "date_of_extraction", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateOfExtraction;
    @XmlElement(required = true)
    protected String branch;
    protected CaaMessageAudit londonCaaMessageAudit;

    /**
     * Gets the value of the trigram property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrigram() {
        return trigram;
    }

    /**
     * Sets the value of the trigram property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrigram(String value) {
        this.trigram = value;
    }

    /**
     * Gets the value of the typeOfData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeOfData() {
        return typeOfData;
    }

    /**
     * Sets the value of the typeOfData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeOfData(String value) {
        this.typeOfData = value;
    }

    /**
     * Gets the value of the dateOfExtraction property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateOfExtraction() {
        return dateOfExtraction;
    }

    /**
     * Sets the value of the dateOfExtraction property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateOfExtraction(XMLGregorianCalendar value) {
        this.dateOfExtraction = value;
    }

    /**
     * Gets the value of the branch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBranch() {
        return branch;
    }

    /**
     * Sets the value of the branch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBranch(String value) {
        this.branch = value;
    }

    /**
     * Gets the value of the londonCaaMessageAudit property.
     * 
     * @return
     *     possible object is
     *     {@link CaaMessageAudit }
     *     
     */
    public CaaMessageAudit getLondonCaaMessageAudit() {
        return londonCaaMessageAudit;
    }

    /**
     * Sets the value of the londonCaaMessageAudit property.
     * 
     * @param value
     *     allowed object is
     *     {@link CaaMessageAudit }
     *     
     */
    public void setLondonCaaMessageAudit(CaaMessageAudit value) {
        this.londonCaaMessageAudit = value;
    }

}
