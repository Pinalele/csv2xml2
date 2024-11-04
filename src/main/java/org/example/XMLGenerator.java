package org.example;

import javax.xml.bind.JAXBException;
import java.util.List;

public interface XMLGenerator {
    String generateXML(List<String> data) throws JAXBException;
}
