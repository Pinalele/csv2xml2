package org.example.objects;

import org.example.XMLGenerator;
import org.example.generated.AuditChangesAuditData;
import org.example.generated.AuditChangesIssueDataObject;
import org.example.generated.LondonAuditChangesIssueDataElement;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.io.StringWriter;
import java.util.List;

public class AuditChangesIssueData implements XMLGenerator {
    @Override
    public String generateXML(List<String> data) throws JAXBException, DatatypeConfigurationException {
        LondonAuditChangesIssueDataElement rootElement = new LondonAuditChangesIssueDataElement();

        AuditChangesIssueDataObject auditChangesIssueDataObject = new AuditChangesIssueDataObject();
        auditChangesIssueDataObject.setTrigram(data.get(0)); // Supõe-se que trigram está na posição 0
        auditChangesIssueDataObject.setTypeOfData(data.get(1)); // Suponha que type_of_data está na posição 1
        XMLGregorianCalendar xml = DatatypeFactory.newInstance().newXMLGregorianCalendar(data.get(2));
        auditChangesIssueDataObject.setDateOfExtraction(xml); // Suponha que date_of_extraction está na posição 2
        auditChangesIssueDataObject.setBranch(data.get(3));

        AuditChangesAuditData auditData = new AuditChangesAuditData();
        auditData.setIssueRef(data.get(4));
        auditData.setDescription(data.get(5));
        auditData.setDateObjectType(data.get(6));
        auditData.setTimeObjectType(data.get(7));
        auditData.setUserObjectType(data.get(8));
        auditData.setLastVal(data.get(9));

        auditChangesIssueDataObject.setLondonAuditChangesIssueData(auditData);

        rootElement.getLondonNameElement().add(auditChangesIssueDataObject);

        JAXBContext context = JAXBContext.newInstance(LondonAuditChangesIssueDataElement.class);

        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

        // Serializa o rootElement para uma string XML
        StringWriter writer = new StringWriter();
        marshaller.marshal(rootElement, writer);
        return writer.toString();
    }
}
