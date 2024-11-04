package org.example;

import com.opencsv.CSVReader;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CSVLoader {
    public List<List<String>> loadCSV(String filePath) throws Exception {
        List<List<String>> data = new ArrayList<>();

        try (CSVReader reader = new CSVReader(new FileReader(filePath))) {
            String[] line;

            while ((line = reader.readNext()) != null) {
                for (String val : line) {
                    String[] splitValues = val.split(";");
                    data.add(Arrays.asList(splitValues));
                }
            }
            return data;
        }
    }
}
