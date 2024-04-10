package oop2.tp3.ejercicio2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Recaudacion {
    private List<String[]> csvData;
    private List<String> columns;

    public Recaudacion() {
        csvData = LecturaCSV.getCsvData();
        columns = List.of("permalink", "company_name", "number_employees", "category", "city", "state", "funded_date", "raised_amount", "raised_currency", "round");
    }

    public List<Map<String, String>> where(Map<String, String> options)
            throws IOException {
        List<Map<String, String>> output = new ArrayList<Map<String, String>>();
        for (Map.Entry<String, String> entry : options.entrySet()) {
            this.filter(entry.getKey(), entry.getValue());
        }
        this.extracted(output);
        return output;
    }

    private void filter(String key, String value) {
        List<String[]> results = new ArrayList<String[]>();
        int index = columns.indexOf(key);
        for (String[] data : csvData) {
            if (data[index].equals(value)) {
                results.add(data);
            }
        }
        csvData = results;
    }

    private void extracted(List<Map<String, String>> output) {
        for (String[] data : csvData) {
            Map<String, String> mapped = new HashMap<>();
            for (int i = 0; i < columns.size(); i++) {
                mapped.put(columns.get(i), data[i]);
            }
            output.add(mapped);
        }
    }
}
