package org.example;

import javax.xml.bind.JAXBException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class CSVToXMLConverter {
    public static void main(String[] args) {

        String csvPath = "D:\\projects\\git\\csv2xml2\\src\\main\\resources\\TemplateCsv.csv";
        String outputDir = "D:\\projects\\git\\csv2xml2\\src\\main\\resources";

        // Cria uma instância do conversor e inicia a conversão
        CSVToXMLConverter converter = new CSVToXMLConverter();
        try {
            converter.convertCSVToXML(csvPath, outputDir);
            System.out.println("Conversão concluída com sucesso!");
        } catch (IOException | JAXBException e) {
            System.err.println("Erro ao converter CSV para XML: " + e.getMessage());
            e.printStackTrace();
        } catch (Exception e) {
            System.err.println("Erro inesperado: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private CSVLoader csvLoader;
    private XMLGeneratorFactory generatorFactory;

    public CSVToXMLConverter() {
        this.csvLoader = new CSVLoader();
        this.generatorFactory = new XMLGeneratorFactory();
    }

    public void convertCSVToXML(String csvPath, String outputDir) throws Exception {
        List<List<String>> rows = csvLoader.loadCSV(csvPath);

        for (List<String> row : rows) {
            int type = Integer.parseInt(row.get(1));  // Tipo está na posição 1
            XMLGenerator generator = generatorFactory.getGenerator(type);

            String xmlContent = generator.generateXML(row);
            String tableVal = getLetter(type);
            String outputFileName = outputDir + "/" + tableVal + "_" + row.get(0) + ".xml"; // ID na posição 0

            try (FileWriter writer = new FileWriter(outputFileName)) {
                writer.write(xmlContent);
            }

            System.out.println("XML gerado para " + type + ": " + outputFileName);
        }
    }

    public static String getLetter(int number) {
        String result;
        switch (number) {
            case 0:
                result = "CaaMessageAudit";
                break;
            case 1:
                result = "AuditChangesIssueData";
                break;
            default:
                result = "Invalid";
                break;
        }
        return result;
    }
}
