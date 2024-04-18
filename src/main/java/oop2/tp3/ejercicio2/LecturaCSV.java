package oop2.tp3.ejercicio2;

import com.opencsv.CSVReader;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LecturaCSV {
    private final String path;

    public LecturaCSV(String path) {
        this.path = path;
    }

    public List<String[]> getCsvData() {
        List<String[]> csvData = new ArrayList<String[]>();
        try (CSVReader reader = new CSVReader(new FileReader(this.path))) {
            String[] row = null;
            while ((row = reader.readNext()) != null) {
                csvData.add(row);
            }
            csvData.removeFirst();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return csvData;
    }
}
