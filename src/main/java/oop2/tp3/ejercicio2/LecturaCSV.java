package oop2.tp3.ejercicio2;

import com.opencsv.CSVReader;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LecturaCSV {
    public static List<String[]> getCsvData() {
        List<String[]> csvData = new ArrayList<String[]>();
        try (CSVReader reader = new CSVReader(new FileReader("src/main/resources/data.csv"))) {
            String[] row = null;
            while ((row = reader.readNext()) != null) {
                csvData.add(row);
            }
            reader.close();
            csvData.remove(0);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return csvData;
    }
}
