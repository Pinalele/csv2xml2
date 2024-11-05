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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CaaMessageAudit complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CaaMessageAudit">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="event_number" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="destination_type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="custody_account" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="message_type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="message_function" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="message_device" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="message_adress" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="message_reference_one" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="message_date" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="message_time" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="message_bulk" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CaaMessageAudit", propOrder = {
    "eventNumber",
    "destinationType",
    "custodyAccount",
    "messageType",
    "messageFunction",
    "messageDevice",
    "messageAdress",
    "messageReferenceOne",
    "messageDate",
    "messageTime",
    "messageBulk"
})
public class CaaMessageAudit {

    @XmlElement(name = "event_number", required = true)
    protected String eventNumber;
    @XmlElement(name = "destination_type", required = true)
    protected String destinationType;
    @XmlElement(name = "custody_account", required = true)
    protected String custodyAccount;
    @XmlElement(name = "message_type", required = true)
    protected String messageType;
    @XmlElement(name = "message_function", required = true)
    protected String messageFunction;
    @XmlElement(name = "message_device", required = true)
    protected String messageDevice;
    @XmlElement(name = "message_adress", required = true)
    protected String messageAdress;
    @XmlElement(name = "message_reference_one", required = true)
    protected String messageReferenceOne;
    @XmlElement(name = "message_date", required = true)
    protected String messageDate;
    @XmlElement(name = "message_time", required = true)
    protected String messageTime;
    @XmlElement(name = "message_bulk", required = true)
    protected String messageBulk;

    /**
     * Gets the value of the eventNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventNumber() {
        return eventNumber;
    }

    /**
     * Sets the value of the eventNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventNumber(String value) {
        this.eventNumber = value;
    }

    /**
     * Gets the value of the destinationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationType() {
        return destinationType;
    }

    /**
     * Sets the value of the destinationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationType(String value) {
        this.destinationType = value;
    }

    /**
     * Gets the value of the custodyAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustodyAccount() {
        return custodyAccount;
    }

    /**
     * Sets the value of the custodyAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustodyAccount(String value) {
        this.custodyAccount = value;
    }

    /**
     * Gets the value of the messageType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageType() {
        return messageType;
    }

    /**
     * Sets the value of the messageType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageType(String value) {
        this.messageType = value;
    }

    /**
     * Gets the value of the messageFunction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageFunction() {
        return messageFunction;
    }

    /**
     * Sets the value of the messageFunction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageFunction(String value) {
        this.messageFunction = value;
    }

    /**
     * Gets the value of the messageDevice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageDevice() {
        return messageDevice;
    }

    /**
     * Sets the value of the messageDevice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageDevice(String value) {
        this.messageDevice = value;
    }

    /**
     * Gets the value of the messageAdress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageAdress() {
        return messageAdress;
    }

    /**
     * Sets the value of the messageAdress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageAdress(String value) {
        this.messageAdress = value;
    }

    /**
     * Gets the value of the messageReferenceOne property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageReferenceOne() {
        return messageReferenceOne;
    }

    /**
     * Sets the value of the messageReferenceOne property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageReferenceOne(String value) {
        this.messageReferenceOne = value;
    }

    /**
     * Gets the value of the messageDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageDate() {
        return messageDate;
    }

    /**
     * Sets the value of the messageDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageDate(String value) {
        this.messageDate = value;
    }

    /**
     * Gets the value of the messageTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageTime() {
        return messageTime;
    }

    /**
     * Sets the value of the messageTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageTime(String value) {
        this.messageTime = value;
    }

    /**
     * Gets the value of the messageBulk property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageBulk() {
        return messageBulk;
    }

    /**
     * Sets the value of the messageBulk property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageBulk(String value) {
        this.messageBulk = value;
    }

}
