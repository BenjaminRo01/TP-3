package oop2.tp3.ejercicio2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

public class Recaudacion {
    private List<String[]> csvData;

    public Recaudacion(LecturaCSV lecturaCSV) {
        this.csvData = lecturaCSV.getCsvData();
    }

    public List<Map<String, String>> where(Map<String, String> options)
            throws IOException {

        if (options.containsKey("company_name")) {
            csvData = filter((fila) -> fila[1].equals(options.get("company_name")));
        }
        if (options.containsKey("city")) {
            csvData = filter((fila) -> fila[4].equals(options.get("city")));
        }
        if (options.containsKey("state")) {
            csvData = filter((fila) -> fila[5].equals(options.get("state")));
        }
        if (options.containsKey("round")) {
            csvData = filter((fila) -> fila[9].equals(options.get("round")));
        }

        return this.extracted();
    }

    private List<String[]> filter(Predicate<String[]> predicate) {
        List<String[]> results = new ArrayList<String[]>();
        for (String[] fila : csvData) {
            if (predicate.test(fila)) {
                results.add(fila);
            }
        }
        return results;
    }

    private List<Map<String, String>> extracted() {
        List<Map<String, String>> output = new ArrayList<Map<String, String>>();
        for (String[] fila : csvData) {
            Map<String, String> mapped = new HashMap<String, String>();
            mapped.put("permalink", fila[0]);
            mapped.put("company_name", fila[1]);
            mapped.put("number_employees", fila[2]);
            mapped.put("category", fila[3]);
            mapped.put("city", fila[4]);
            mapped.put("state", fila[5]);
            mapped.put("funded_date", fila[6]);
            mapped.put("raised_amount", fila[7]);
            mapped.put("raised_currency", fila[8]);
            mapped.put("round", fila[9]);
            output.add(mapped);
        }
        return output;
    }
}
