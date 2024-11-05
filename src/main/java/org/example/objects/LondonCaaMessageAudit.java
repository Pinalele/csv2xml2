package org.example.objects;

import org.example.XMLGenerator;
import org.example.generated.CaaMessageAudit;
import org.example.generated.CaaMessageAuditObject;
import org.example.generated.LondonCaaMessageAuditElement;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.io.StringWriter;
import java.util.List;

public class LondonCaaMessageAudit implements XMLGenerator {

    @Override
    public String generateXML(List<String> data) throws JAXBException, DatatypeConfigurationException {
// Cria o elemento raiz LondonCaaMessageAuditElement
        LondonCaaMessageAuditElement rootElement = new LondonCaaMessageAuditElement();

        // Cria um novo objeto CaaMessageAuditObject e define seus campos
        CaaMessageAuditObject messageAuditObject = new CaaMessageAuditObject();
        messageAuditObject.setTrigram(data.get(0)); // Supõe-se que trigram está na posição 0
        messageAuditObject.setTypeOfData(data.get(1)); // Suponha que type_of_data está na posição 1
        XMLGregorianCalendar xml = DatatypeFactory.newInstance().newXMLGregorianCalendar(data.get(2));
        messageAuditObject.setDateOfExtraction(xml); // Suponha que date_of_extraction está na posição 2
        messageAuditObject.setBranch(data.get(3)); // Suponha que branch está na posição 3

        // Cria o objeto CaaMessageAudit e define seus campos, caso existam no CSV
        CaaMessageAudit messageAudit = new CaaMessageAudit();
        messageAudit.setEventNumber(data.get(4)); // Suponha que event_number está na posição 4
        messageAudit.setDestinationType(data.get(5)); // Suponha que destination_type está na posição 5
        messageAudit.setCustodyAccount(data.get(6)); // Suponha que custody_account está na posição 6
        messageAudit.setMessageType(data.get(7)); // Suponha que message_type está na posição 7
        messageAudit.setMessageFunction(data.get(8)); // Suponha que message_function está na posição 8
        messageAudit.setMessageDevice(data.get(9)); // Suponha que message_device está na posição 9
        messageAudit.setMessageAdress(data.get(10)); // Suponha que message_adress está na posição 10
        messageAudit.setMessageReferenceOne(data.get(11)); // Suponha que message_reference_one está na posição 11
        messageAudit.setMessageDate(data.get(12)); // Suponha que message_date está na posição 12
        messageAudit.setMessageTime(data.get(13)); // Suponha que message_time está na posição 13
        messageAudit.setMessageBulk(data.get(14)); // Suponha que message_bulk está na posição 14

        // Adiciona o messageAudit ao messageAuditObject
        messageAuditObject.setLondonCaaMessageAudit(messageAudit);

        // Adiciona o messageAuditObject ao rootElement
        rootElement.getLondonNameElement().add(messageAuditObject);

        // Cria o contexto JAXB e o Marshaller para serializar o rootElement em XML
        JAXBContext context = JAXBContext.newInstance(LondonCaaMessageAuditElement.class);
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

        // Serializa o rootElement para uma string XML
        StringWriter writer = new StringWriter();
        marshaller.marshal(rootElement, writer);

        return writer.toString();
    }
}
