package oop2.tp3.ejercicio2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Recaudacion {
    private List<String[]> csvData;

    public Recaudacion() {
        csvData = LecturaCSV.getCsvData();
    }

    public List<Map<String, String>> where(Map<String, String> options)
            throws IOException {
        List<Map<String, String>> output = new ArrayList<Map<String, String>>();
        this.filter(options);
        this.extracted(output);
        return output;
    }

    private void extracted(List<Map<String, String>> output) {
        for (String[] data : csvData) {
            Map<String, String> mapped = new HashMap<String, String>();
            mapped.put("permalink", data[0]);
            mapped.put("company_name", data[1]);
            mapped.put("number_employees", data[2]);
            mapped.put("category", data[3]);
            mapped.put("city", data[4]);
            mapped.put("state", data[5]);
            mapped.put("funded_date", data[6]);
            mapped.put("raised_amount", data[7]);
            mapped.put("raised_currency", data[8]);
            mapped.put("round", data[9]);
            output.add(mapped);
        }
    }

    private void filter(Map<String, String> options) {
        if (options.containsKey("company_name")) {
            List<String[]> results = new ArrayList<String[]>();

            for (String[] data : csvData) {
                if (data[1].equals(options.get("company_name"))) {
                    results.add(data);
                }
            }
            csvData = results;
        }

        if (options.containsKey("city")) {
            List<String[]> results = new ArrayList<String[]>();

            for (String[] data : csvData) {
                if (data[4].equals(options.get("city"))) {
                    results.add(data);
                }
            }
            csvData = results;
        }

        if (options.containsKey("state")) {
            List<String[]> results = new ArrayList<String[]>();

            for (String[] data : csvData) {
                if (data[5].equals(options.get("state"))) {
                    results.add(data);
                }
            }
            csvData = results;
        }

        if (options.containsKey("round")) {
            List<String[]> results = new ArrayList<String[]>();

            for (String[] data : csvData) {
                if (data[9].equals(options.get("round"))) {
                    results.add(data);
                }
            }
            csvData = results;
        }
    }
}
