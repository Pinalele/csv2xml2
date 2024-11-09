package org.example;

import javax.xml.bind.JAXBException;
import javax.xml.datatype.DatatypeConfigurationException;
import java.util.List;

public interface XMLGenerator {
    String generateXML(List<List<String>> data) throws JAXBException, DatatypeConfigurationException;
}
