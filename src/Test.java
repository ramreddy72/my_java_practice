import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {

    public static final String LINE_START_Q4 = "Q4";
    public static final String LINE_START_10 = "10";
    public static final String LINE_START_20 = "20";
    public static final String LINE_START_40 = "40";
    public static final String LINE_START_50 = "50";
    public static final String LINE_START_70 = "70";
    public static final String LINE_START_EF = "EF";

    public static int LINE_START_40_COUNTER = 1;
    public static int LINE_START_50_COUNTER = 1;
    public static int LINE_START_70_COUNTER = 1;

    public static void main(String[] args) {

        String filePath = "C:\\Users\\palnredd\\OneDrive - Capgemini\\Documents\\Tasks\\RM 73802\\F24TextOutput.txt"; // Replace with the actual file path
        BufferedReader reader = null;
        List<String> lines = new ArrayList<>();
        Map<String, Map<String, String>> globalMap = new HashMap<>();

        try {
            reader = new BufferedReader(new FileReader(filePath));
            String line;
           
            while ((line = reader.readLine()) != null) {
                // line = line.trim();
                String lineStartWith = line.substring(2, 4);

                switch (lineStartWith) {

                    case LINE_START_Q4:
                        globalMap.put(LINE_START_Q4, getData_LineStartWith_Q4(line));
                        break;
                    case LINE_START_10:
                        globalMap.put(LINE_START_10, getData_LineStartWith_10(line));
                        break;
                    case LINE_START_20:
                        globalMap.put(LINE_START_20, getData_LineStartWith_20(line));
                        break;    
                    case LINE_START_40:
                        globalMap.put(LINE_START_20, getData_LineStartWith_40(line, LINE_START_40_COUNTER));
                        LINE_START_40_COUNTER++;    
                        break;
                    case LINE_START_50:
                        globalMap.put(LINE_START_20, getData_LineStartWith_50(line));
                        LINE_START_50_COUNTER++;
                        break;
                    case LINE_START_70:
                        globalMap.put(LINE_START_20, getData_LineStartWith_70(line));
                        LINE_START_70_COUNTER++;
                        break;
                    case LINE_START_EF:
                        globalMap.put(LINE_START_20, getData_LineStartWith_EF(line));
                        break;
                    default:
                        break;
                }
            }
        } catch (FileNotFoundException ex) {
            throw new RuntimeException(ex);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        System.out.println(globalMap);

    }

    private static String extractData(String line, int start, int end) {
        String substring = "";
        try {
            
           substring = line.substring(start, end);
        } catch (Exception e) {
            // TODO: handle exception
        }
        return substring;
    }
    public static Map<String,String> getData_LineStartWith_Q4(String line)
    {
        Map<String, String> recordMapData = new HashMap<>();

        recordMapData.put("tipo_record", extractData(line, 1, 3));
        recordMapData.put("mittente", extractData(line, 3, 8));
        recordMapData.put("ricevente", extractData(line, 8, 13));
        recordMapData.put("data_creazione", extractData(line, 13, 19));
        recordMapData.put("nome_supporto", extractData(line, 19, 39));
        recordMapData.put("riferimenti_mittente", extractData(line, 39, 45));
        recordMapData.put("codice_divisa", extractData(line, 113, 114));

        return recordMapData;
    }
    public static Map<String,String> getData_LineStartWith_10(String line)
    {
        Map<String, String> recordMapData = new HashMap<>();

        //<UNIT name="f24_dispsizione_orig" first_record="10.........">
        //<RECORD name="10.........">
        recordMapData.put("tipo_record", extractData(line, 1, 3));
        recordMapData.put("progressivo_delega_f24", extractData(line, 3, 10));
        recordMapData.put("codice_fiscale", extractData(line, 10, 26));
        recordMapData.put("cognome", extractData(line, 26, 50));
        recordMapData.put("nome", extractData(line, 50, 70));
        recordMapData.put("sesso", extractData(line, 70, 71));
        recordMapData.put("comune_nascita", extractData(line, 71, 96));
        recordMapData.put("provincia_nascita", extractData(line, 96, 98));
        recordMapData.put("data_nascita", extractData(line, 98, 106));
        // recordMapData.put("protocollo_delega", extractData(line, 106, 200));

        return recordMapData;
    }
    public static Map<String,String> getData_LineStartWith_20(String line)
    {
        Map<String, String> recordMapData = new HashMap<>();

        // <RECORD name="20.........">
        recordMapData.put("tipo_record", extractData(line, 1, 3));
        recordMapData.put("progressivo_delega_f24", extractData(line, 3, 10));
        recordMapData.put("comune_domicilio", extractData(line, 10, 25));
        recordMapData.put("provincia_domicilio", extractData(line, 35, 37));
        recordMapData.put("indirizzo_domicilio", extractData(line, 37, 72));
        recordMapData.put("data_pagamento", extractData(line, 72, 80));
        recordMapData.put("flag_anno_imposta", extractData(line, 80, 81));
        recordMapData.put("secondo_codice_fiscale", extractData(line, 81, 97));
        recordMapData.put("codice_identificativo_20", extractData(line, 97, 99));

        return recordMapData;
    }
    public static Map<String,String> getData_LineStartWith_40(String line, int counter)
    {
        Map<String, String> recordMapData = new HashMap<>();

        switch (counter) {
            case 01:
                // <UNIT name="erario" first_record="40.......01">
                recordMapData.put("tipo_record", extractData(line, 1, 3));
                recordMapData.put("progressivo_delega_f24", extractData(line, 3, 10));
                recordMapData.put("sub_tipo_record", extractData(line, 10, 12));
                recordMapData.put("progressivo_tributo", extractData(line, 12, 14));
                recordMapData.put("codice_tributo", extractData(line, 14, 18));
                recordMapData.put("riferimenti_tributo", extractData(line, 18, 26));
                recordMapData.put("importo_debito", extractData(line, 26, 41));
                recordMapData.put("importo_credito", extractData(line, 41, 56));
                recordMapData.put("codice_ufficio", extractData(line, 56, 59));
                recordMapData.put("codice_atto", extractData(line, 59, 70));
                break;
            case 02:
                recordMapData.put("tipo_record", extractData(line, 1, 3));
                recordMapData.put("progressivo_delega_f24", extractData(line, 3, 10));
                recordMapData.put("sub_tipo_record", extractData(line, 10, 12));
                recordMapData.put("totale_debito", extractData(line, 12, 27));
                recordMapData.put("totale_credito", extractData(line, 27, 42));
                recordMapData.put("segno_sezione", extractData(line, 42, 43));
                recordMapData.put("saldo_sezione", extractData(line, 43, 58));
                break;
            case 03:

                break;

            default:
                break;
        }
        return recordMapData;
    }
    
    public static Map<String,String> getData_LineStartWith_50(String line)
    {
        Map<String, String> recordMapData = new HashMap<>();

        return recordMapData;
    }

    public static Map<String,String> getData_LineStartWith_70(String line)
    {
        Map<String, String> recordMapData = new HashMap<>();

        return recordMapData;
    }

    public static Map<String,String> getData_LineStartWith_EF(String line)
    {
        Map<String, String> recordMapData = new HashMap<>();

        return recordMapData;
    }
}