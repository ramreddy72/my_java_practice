package Capgemini;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class ReadFileAndSplitToRecords {

    private static final String LINE_START_Q4 = "Q4";
    private static final String LINE_START_10 = "10";
    private static final String LINE_START_20 = "20";
    private static final String LINE_START_40 = "40";
    private static final String LINE_START_50 = "50";
    private static final String LINE_START_70 = "70";
    private static final String LINE_START_EF = "EF";


    /* Constants of fields Names*/

        private static final String TIPO_RECORD = "tipo_record";
        private static final String MITTENTE = "mittente";
        private static final String RICEVENTE = "ricevente";
        private static final String DATA_CREAZIONE = "data_creazione";
        private static final String NOME_SUPPORTO = "nome_supporto";
        private static final String RIFERIMENTI_MITTENTE = "riferimenti_mittente";
        private static final String CODICE_DIVISA = "codice_divisa";
        private static final String PROGRESSIVO_DELEGA_F24 = "progressivo_delega_f24";
        private static final String CODICE_FISCALE = "codice_fiscale";
        private static final String COGNOME = "cognome";
        private static final String NOME = "nome";
        private static final String SESSO = "sesso";
        private static final String COMUNE_NASCITA = "comune_nascita";
        private static final String PROVINCIA_NASCITA = "provincia_nascita";
        private static final String DATA_NASCITA = "data_nascita";
        private static final String PROTOCOLLO_DELEGA = "protocollo_delega";
        private static final String COMUNE_DOMICILIO = "comune_domicilio";
        private static final String PROVINCIA_DOMICILIO = "provincia_domicilio";
        private static final String INDIRIZZO_DOMICILIO = "indirizzo_domicilio";
        private static final String DATA_PAGAMENTO = "data_pagamento";
        private static final String FLAG_ANNO_IMPOSTA = "flag_anno_imposta";
        private static final String SECONDO_CODICE_FISCALE = "secondo_codice_fiscale";
        private static final String CODICE_IDENTIFICATIVO_20 = "codice_identificativo_20";
        private static final String SUB_TIPO_RECORD = "sub_tipo_record";
        private static final String PROGRESSIVO_TRIBUTO = "progressivo_tributo";
        private static final String CODICE_TRIBUTO = "codice_tributo";
        private static final String RIFERIMENTI_TRIBUTO = "riferimenti_tributo";
        private static final String IMPORTO_DEBITO = "importo_debito";
        private static final String IMPORTO_CREDITO = "importo_credito";
        private static final String CODICE_UFFICIO = "codice_ufficio";
        private static final String CODICE_ATTO = "codice_atto";
        private static final String TOTALE_CREDITO = "totale_credito";
        private static final String SEGNO_SEZIONE = "segno_sezione";
        private static final String SALDO_SEZIONE = "saldo_sezione";
        private static final String CODICE_SEDE = "codice_sede";
        private static final String CAUSALE_CONTRIBUTO = "causale_contributo";
        private static final String MATRICOLA_INPS = "matricola_inps";
        private static final String PERIODO_INIZIO = "periodo_inizio";
        private static final String PERIODO_FINE = "periodo_fine";
        private static final String PROGRESSIVO_CONTRIBUTO = "progressivo_contributo";
        private static final String NUMERO_POSIZIONE = "numero_posizione";
        private static final String CODICE_CONTROLLO_POSIZIONE = "codice_controllo_posizione";
        private static final String CAUSALE = "causale";
        private static final String NUMERO_RIFERIMENTO = "numero_riferimento";
        private static final String IDENTIFICATIVO_OPERAZIONE = "identificativo_operazione";
        private static final String CAP = "cap";
        private static final String COMUNE = "comune";
        private static final String INDIRIZZO = "indirizzo";
        private static final String COD_ABI_RICEVENTE = "cod_abi_ricevente";
        private static final String COD_CAB_RICEVENTE = "cod_cab_ricevente";
        private static final String NUM_CC_RICEVENTE = "num_cc_ricevente";
        private static final String CIN = "cin";
        private static final String FLAG_FIRMATARIO = "flag_firmatario";
        private static final String CODICE_FISCALE_P = "codice_fiscale_p";
        private static final String TITOLARE_PAGAMENTO = "titolare_pagamento";
        private static final String DATA_PAGAMENTO_P = "data_pagamento_p";
        private static final String TIPO_CODICE_INDIVIDUALE = "tipo_codice_individuale";
        private static final String ESITO_QUIETANZA = "esito_quietanza";
        private static final String DESCRIZIONE_RIFIUTO = "descrizione_rifiuto";
        private static final String BANCA_PASS_RENDICONTANTE = "banca_pass_rendicontante";
        private static final String SPORTELLO_BANCA_PASSIVA ="sportello_banca_passiva";
    private static final String NUMERO_RECORD ="numero_record";
    private static final String TOTALE_DEBITO ="totale_debito";
    private static final String SEGNO_SALDO ="segno_saldo";
    private static final String TOTALE_IMPORTI_NEGATIVI ="totale_importi_negativi";
    private static final String TOTALE_IMPORTI_POSITIVI ="totale_importi_positivi";
    private static final String NUMERO_DISPOSIZIONI ="numero_disposizioni";
    private static final String TOTALE_DELEGA ="totale_delega";
    private static final String PROGRESSIVO_ASSOLUTO ="progressivo_assoluto";
    private static final String FLAG_POSIZ_COD_ABI_RENDICONT ="flag_posiz_cod_abi_rendicont";
    private static final String PROVINCIA ="provincia";
    private static final String DENOMINAZIONE_MITTENTE ="denominazione_mittente";
    private static final String DESTINATARIO_STAMPA ="destinatario_stampa";
    private static final String CODICE_CLIENTE_BANCARIO ="codice_cliente_bancario";
    private static final String COD_CAB_RIFERIMENTO_MITTENTE ="cod_cab_riferimento_mittente";
    private static final String COD_ABI_RIFERIMENTO_MITTENTE ="cod_abi_riferimento_mittente";
    private static final String COD_MITTENTE ="cod_mittente";
    private static final String SALDO_DELEGA ="saldo_delega";
    private static final String IMPORTO_CREDITO_COMPENSATO ="importo_credito_compensato";
    private static final String IMPORTO_DEBITO_VERSATO ="importo_debito_versato";
    private static final String ANNO_RIFERIMENTO_TRIBUTO ="anno_riferimento_tributo";
    private static final String NUMERO_TELAIO ="numero_telaio";
    private static final String TIPO_VEICOLO ="tipo_veicolo";
    private static final String RATEAZIONE ="rateazione";
    private static final String RIFERIMENTO_TRIBUTO ="riferimento_tributo";
    private static final String CODICE_IDENTIFICATIVO ="codice_identificativo";

    private static final String CODICE_PROVINCIA ="codice_provincia";
    private static final String CODICE_ENTE ="codice_ente";
    private static final String CODICE_POSIZIONE ="codice_posizione";
    private static final String DETRAZIONE_ICI ="detrazione_ici";
    private static final String NUMERO_FABBRICATI ="numero_fabbricati";
    private static final String SALDO ="saldo";
    private static final String ACCONTO ="acconto";
    private static final String IMMOBILI_VARIATI ="immobili_variati";
    private static final String RAVVEDIMENTO ="ravvedimento";
    private static final String CODICE_REGIONE = "codice_regione";
    private static String currentlRecordStartWith = "10";
    private static List<Map<String, Map<String, String>>> recordsDataMap = new LinkedList<>();
    private static Map<String, Map<String, String>> currentMap = new LinkedHashMap<>();
    private static Map<String, String> headerMap = new HashMap<>();
    private static Map<String, String> tailMap = new HashMap<>();

    
    public static void main(String[] args) {
        String filePath = "C:\\Users\\palnredd\\OneDrive - Capgemini\\Documents\\Tasks\\RM 73802\\F24TextOutput.txt"; // Replace with the actual file path
        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new FileReader(filePath));
            String line;
            while ((line = reader.readLine()) != null) {

                String lineStartWith = line.substring(1, 3);

                if (lineStartWith.equals(LINE_START_Q4)) {
                    getData_LineStartWith_Q4(line);

                } else if (lineStartWith.equals(LINE_START_EF)) {
                    getData_LineStartWith_EF(line);
                } else {
                    recordExtraction(line);
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

        System.out.println("Header Q4: " );
        headerMap.forEach((key, value) -> {
            System.out.println(key + " : " + value);
        });

         System.out.println(" \n Record Map: " );
         recordsDataMap.forEach(record -> {
            System.out.println("Record start : ");
            record.forEach((key, value) -> {
                System.out.println(key + " : " + value + "\n");
             });
            System.out.println(" Record end \n");
        });
        
        System.out.println("Tail EF: " );
        tailMap.forEach((key, value) -> {
            System.out.println(key + " : " + value);
        }); 

    }
    
    private static void recordExtraction(String line) {

        String lineStartWith = line.substring(1, 3);

        if (Integer.parseInt(lineStartWith) < Integer.parseInt(currentlRecordStartWith) ) {
            recordsDataMap.add(currentMap);
            currentMap = new LinkedHashMap<>();
            currentlRecordStartWith = LINE_START_10;
        }

        switch (lineStartWith) {

            case LINE_START_10:
                currentMap.put(LINE_START_10, getData_LineStartWith_10(line));
                currentlRecordStartWith = LINE_START_10;
                break;
            case LINE_START_20:
                currentMap.put(LINE_START_20, getData_LineStartWith_20(line));
                currentlRecordStartWith = LINE_START_20;
                break;
            case LINE_START_40:
                Map<String, String> resultData = getData_LineStartWith_40(line);
                String keyFormation = LINE_START_40 + resultData.get(SUB_TIPO_RECORD);
                if(resultData.containsKey(PROGRESSIVO_TRIBUTO)) 
                    keyFormation = keyFormation + resultData.get(PROGRESSIVO_TRIBUTO);
                if(resultData.containsKey(PROGRESSIVO_CONTRIBUTO))
                    keyFormation = keyFormation + resultData.get(PROGRESSIVO_CONTRIBUTO);
                currentMap.put(keyFormation, resultData);
                currentlRecordStartWith = LINE_START_40;
                break;
            case LINE_START_50:
                Map<String, String> resultData_50 = getData_LineStartWith_50(line);
                 String keyFormation_50 = LINE_START_50 + resultData_50.get(SUB_TIPO_RECORD);
                if(resultData_50.containsKey(PROGRESSIVO_TRIBUTO))
                    keyFormation_50 = keyFormation_50 + resultData_50.get(PROGRESSIVO_TRIBUTO);
                currentMap.put(keyFormation_50, resultData_50);
                currentlRecordStartWith = LINE_START_50;
                break;
            case LINE_START_70:
                currentMap.put(LINE_START_70, getData_LineStartWith_70(line));
                currentlRecordStartWith = LINE_START_70;
                 recordsDataMap.add(currentMap);
                currentMap = new LinkedHashMap<>();
                break;
            default:
                break;
        }
    }

    
    private static String extractData(String line, int start, int end) {
        String substring = "";
        try {
            substring = line.substring(start, end);
        } catch (Exception e) {
           return substring;
        }
        return substring;
    }
    public static void getData_LineStartWith_Q4(String line)
    {
        headerMap.put(TIPO_RECORD, extractData(line, 1, 3));
        headerMap.put(MITTENTE, extractData(line, 3, 8));
        headerMap.put(RICEVENTE, extractData(line, 8, 13));
        headerMap.put(DATA_CREAZIONE, extractData(line, 13, 19));
        headerMap.put(NOME_SUPPORTO, extractData(line, 19, 39));
        headerMap.put(RIFERIMENTI_MITTENTE, extractData(line, 39, 45));
        headerMap.put(CODICE_DIVISA, extractData(line, 113, 114));

    }
    public static Map<String,String> getData_LineStartWith_10(String line)
    {
        Map<String, String> recordMapData = new HashMap<>();

        //<UNIT name="f24_dispsizione_orig" first_record="10.........">
        //<RECORD name="10.........">
        recordMapData.put(TIPO_RECORD, extractData(line, 1, 3));
        recordMapData.put(PROGRESSIVO_DELEGA_F24, extractData(line, 3, 10));
        recordMapData.put(CODICE_FISCALE, extractData(line, 10, 26));
        recordMapData.put(COGNOME, extractData(line, 26, 50));
        recordMapData.put(NOME, extractData(line, 50, 70));
        recordMapData.put(SESSO, extractData(line, 70, 71));
        recordMapData.put(COMUNE_NASCITA, extractData(line, 71, 96));
        recordMapData.put(PROVINCIA_NASCITA, extractData(line, 96, 98));
        recordMapData.put(DATA_NASCITA, extractData(line, 98, 106));
         recordMapData.put(PROTOCOLLO_DELEGA, extractData(line, 106, 113));

        return recordMapData;
    }
    public static Map<String,String> getData_LineStartWith_20(String line)
    {
        Map<String, String> recordMapData = new HashMap<>();

        // <RECORD name="20.........">
        recordMapData.put(TIPO_RECORD, extractData(line, 1, 3));
        recordMapData.put(PROGRESSIVO_DELEGA_F24, extractData(line, 3, 10));
        recordMapData.put(COMUNE_DOMICILIO, extractData(line, 10, 35));
        recordMapData.put(PROVINCIA_DOMICILIO, extractData(line, 35, 37));
        recordMapData.put(INDIRIZZO_DOMICILIO, extractData(line, 37, 72));
        recordMapData.put(DATA_PAGAMENTO, extractData(line, 72, 80));
        recordMapData.put(FLAG_ANNO_IMPOSTA, extractData(line, 80, 81));
        recordMapData.put(SECONDO_CODICE_FISCALE, extractData(line, 81, 97));
        recordMapData.put(CODICE_IDENTIFICATIVO_20, extractData(line, 97, 99));

        return recordMapData;
    }
    public static Map<String,String> getData_LineStartWith_40(String line)
    {
        Map<String, String> recordMapData = new HashMap<>();
        String recordNumber = line.substring(10, 12);

        switch (recordNumber) {
            case "01":
                recordMapData.put(TIPO_RECORD, extractData(line, 1, 3));
                recordMapData.put(PROGRESSIVO_DELEGA_F24, extractData(line, 3,10 ));
                recordMapData.put(SUB_TIPO_RECORD, extractData(line, 10, 12));
                recordMapData.put(PROGRESSIVO_TRIBUTO, extractData(line, 12, 14));
                recordMapData.put(CODICE_TRIBUTO, extractData(line, 14, 18));
                recordMapData.put(RIFERIMENTI_TRIBUTO, extractData(line, 18, 26));
                recordMapData.put(IMPORTO_DEBITO, extractData(line, 26, 41));
                recordMapData.put(IMPORTO_CREDITO, extractData(line, 41, 56));
                recordMapData.put(CODICE_UFFICIO, extractData(line, 56, 59));
                recordMapData.put(CODICE_ATTO, extractData(line, 59, 70));
                break;
            case "02":
                recordMapData.put(TIPO_RECORD, extractData(line, 1, 3));
                recordMapData.put(PROGRESSIVO_DELEGA_F24, extractData(line, 3,10 ));
                recordMapData.put(SUB_TIPO_RECORD, extractData(line, 10, 12));
                recordMapData.put(TOTALE_DEBITO, extractData(line, 12, 27));
                recordMapData.put(TOTALE_CREDITO, extractData(line, 27, 42));
                recordMapData.put(SEGNO_SEZIONE, extractData(line, 42, 43));
                recordMapData.put(SALDO_SEZIONE, extractData(line, 43, 58));
                break;
            case "03":
                recordMapData.put(TIPO_RECORD, extractData(line, 1, 3));
                recordMapData.put(PROGRESSIVO_DELEGA_F24, extractData(line, 3,10 ));
                recordMapData.put(SUB_TIPO_RECORD, extractData(line, 10, 12));
                recordMapData.put(PROGRESSIVO_CONTRIBUTO, extractData(line, 12, 14));
                recordMapData.put(CODICE_SEDE, extractData(line, 14, 18));
                recordMapData.put(CAUSALE_CONTRIBUTO, extractData(line, 18, 22));
                recordMapData.put(MATRICOLA_INPS, extractData(line, 22, 39));
                recordMapData.put(PERIODO_INIZIO, extractData(line, 39, 45));
                recordMapData.put(PERIODO_FINE, extractData(line, 45, 51));
                recordMapData.put(IMPORTO_DEBITO, extractData(line, 51, 66));
                recordMapData.put(IMPORTO_CREDITO, extractData(line, 66, 81));

                break;

            case "04":
                recordMapData.put(TIPO_RECORD, extractData(line, 1, 3));
                recordMapData.put(PROGRESSIVO_DELEGA_F24, extractData(line, 3,10 ));
                recordMapData.put(SUB_TIPO_RECORD, extractData(line, 10, 12));
                recordMapData.put(TOTALE_DEBITO, extractData(line, 12, 27));
                recordMapData.put(TOTALE_CREDITO, extractData(line, 27, 42));
                recordMapData.put(SEGNO_SEZIONE, extractData(line, 42, 43));
                recordMapData.put(SALDO_SEZIONE, extractData(line, 43, 58));
                break;
            case "05":
                recordMapData.put(TIPO_RECORD, extractData(line, 1, 3));
                recordMapData.put(PROGRESSIVO_DELEGA_F24, extractData(line, 3,10 ));
                recordMapData.put(SUB_TIPO_RECORD, extractData(line, 10, 12));
                recordMapData.put(CODICE_REGIONE, extractData(line, 12, 14));
                recordMapData.put(PROGRESSIVO_TRIBUTO, extractData(line, 14, 16));
                recordMapData.put(CODICE_TRIBUTO, extractData(line, 16, 20));
                recordMapData.put(RIFERIMENTI_TRIBUTO, extractData(line, 20, 28));
                recordMapData.put(IMPORTO_DEBITO, extractData(line, 28, 43));
                recordMapData.put(IMPORTO_CREDITO, extractData(line, 43, 58));

                break;
            case "06":
                recordMapData.put(TIPO_RECORD, extractData(line, 1, 3));
                recordMapData.put(PROGRESSIVO_DELEGA_F24, extractData(line, 3,10 ));
                recordMapData.put(SUB_TIPO_RECORD, extractData(line, 10, 12));
                recordMapData.put(TOTALE_DEBITO, extractData(line, 14, 29));
                recordMapData.put(TOTALE_CREDITO, extractData(line, 29, 44));
                recordMapData.put(SEGNO_SEZIONE, extractData(line, 44, 45));
                recordMapData.put(SALDO_SEZIONE, extractData(line, 45, 60));
                break;
            case "07":
                recordMapData.put(TIPO_RECORD, extractData(line, 1, 3));
                recordMapData.put(PROGRESSIVO_DELEGA_F24, extractData(line, 3,10 ));
                recordMapData.put(SUB_TIPO_RECORD, extractData(line, 10, 12));
                recordMapData.put(CODICE_ENTE, extractData(line, 12, 16));
                recordMapData.put(PROGRESSIVO_TRIBUTO, extractData(line, 16, 18));
                recordMapData.put(CODICE_TRIBUTO, extractData(line, 18, 22));
                recordMapData.put(RIFERIMENTI_TRIBUTO, extractData(line, 22, 30));
                recordMapData.put(IMPORTO_DEBITO, extractData(line, 30, 45));
                recordMapData.put(IMPORTO_CREDITO, extractData(line, 45,60 ));
                recordMapData.put(RAVVEDIMENTO, extractData(line, 60, 61));
                recordMapData.put(IMMOBILI_VARIATI, extractData(line, 61, 62));
                recordMapData.put(ACCONTO, extractData(line, 62, 63));
                recordMapData.put(SALDO, extractData(line, 63, 64));
                recordMapData.put(NUMERO_FABBRICATI, extractData(line, 64, 67));
                recordMapData.put(DETRAZIONE_ICI, extractData(line, 67, 82));
                recordMapData.put(IDENTIFICATIVO_OPERAZIONE, extractData(line, 82, 100));
                break;
            case "08":
                recordMapData.put(TIPO_RECORD, extractData(line, 1, 3));
                recordMapData.put(PROGRESSIVO_DELEGA_F24, extractData(line, 3,10 ));
                recordMapData.put(SUB_TIPO_RECORD, extractData(line, 10, 12));
                recordMapData.put(TOTALE_DEBITO, extractData(line, 16, 31));
                recordMapData.put(TOTALE_CREDITO, extractData(line, 31, 46));
                recordMapData.put(SEGNO_SEZIONE, extractData(line, 46, 47));
                recordMapData.put(SALDO_SEZIONE, extractData(line, 47, 62));
                break;
            case "09":
                recordMapData.put(TIPO_RECORD, extractData(line, 1, 3));
                recordMapData.put(PROGRESSIVO_DELEGA_F24, extractData(line, 3,10 ));
                recordMapData.put(SUB_TIPO_RECORD, extractData(line, 10, 12));
                recordMapData.put(PROGRESSIVO_CONTRIBUTO, extractData(line, 12, 14));
                recordMapData.put(CODICE_SEDE, extractData(line, 14, 19));
                recordMapData.put(NUMERO_POSIZIONE, extractData(line, 19, 27));
                recordMapData.put(CODICE_CONTROLLO_POSIZIONE, extractData(line, 27, 29));
                recordMapData.put(CAUSALE, extractData(line, 29, 30));
                recordMapData.put(NUMERO_RIFERIMENTO, extractData(line, 34,40 ));
                recordMapData.put(IMPORTO_DEBITO, extractData(line, 40, 55));
                recordMapData.put(IMPORTO_CREDITO, extractData(line, 55, 70));
                break;
            case "10":
                recordMapData.put(TIPO_RECORD, extractData(line, 1, 3));
                recordMapData.put(PROGRESSIVO_DELEGA_F24, extractData(line, 3,10 ));
                recordMapData.put(SUB_TIPO_RECORD, extractData(line, 10, 12));
                recordMapData.put(TOTALE_DEBITO, extractData(line, 12, 27));
                recordMapData.put(TOTALE_CREDITO, extractData(line, 27, 42));
                recordMapData.put(SEGNO_SEZIONE, extractData(line, 42, 43));
                recordMapData.put(SALDO_SEZIONE, extractData(line, 43, 58));
                break;
            case "11":
                recordMapData.put(TIPO_RECORD, extractData(line, 1, 3));
                recordMapData.put(PROGRESSIVO_DELEGA_F24, extractData(line, 3,10 ));
                recordMapData.put(SUB_TIPO_RECORD, extractData(line, 10, 12));
                recordMapData.put(PROGRESSIVO_CONTRIBUTO, extractData(line, 12, 14));
                recordMapData.put(CODICE_ENTE, extractData(line, 14,18 ));
                recordMapData.put(CODICE_SEDE, extractData(line, 18, 23));
                recordMapData.put(CAUSALE, extractData(line, 23, 27));
                recordMapData.put(CODICE_POSIZIONE, extractData(line, 27, 36));
                recordMapData.put(PERIODO_INIZIO, extractData(line, 36, 42));
                recordMapData.put(PERIODO_FINE, extractData(line, 42,48 ));
                recordMapData.put(IMPORTO_DEBITO, extractData(line, 48, 63));
                recordMapData.put(IMPORTO_CREDITO, extractData(line, 63, 78));
                break;
            case "12":
                recordMapData.put(TIPO_RECORD, extractData(line, 1, 3));
                recordMapData.put(PROGRESSIVO_DELEGA_F24, extractData(line, 3,10 ));
                recordMapData.put(SUB_TIPO_RECORD, extractData(line, 10, 12));
                recordMapData.put(CODICE_ENTE, extractData(line, 12,16 ));
                recordMapData.put(TOTALE_DEBITO, extractData(line, 16, 31));
                recordMapData.put(TOTALE_CREDITO, extractData(line, 31, 46));
                recordMapData.put(SEGNO_SEZIONE, extractData(line, 46, 47));
                recordMapData.put(SALDO_SEZIONE, extractData(line, 47, 62));
                break;
            case "13":
                recordMapData.put(TIPO_RECORD, extractData(line, 1, 3));
                recordMapData.put(PROGRESSIVO_DELEGA_F24, extractData(line, 3,10 ));
                recordMapData.put(SUB_TIPO_RECORD, extractData(line, 10, 12));
                recordMapData.put(PROGRESSIVO_TRIBUTO, extractData(line, 12, 14));
                recordMapData.put(CODICE_ENTE, extractData(line, 14,16 ));
                recordMapData.put(CODICE_PROVINCIA, extractData(line, 16, 18));
                recordMapData.put(CODICE_TRIBUTO, extractData(line, 18, 22));
                recordMapData.put(CODICE_IDENTIFICATIVO, extractData(line, 22, 36));
                recordMapData.put(RIFERIMENTO_TRIBUTO, extractData(line, 36, 42));
                recordMapData.put(IMPORTO_DEBITO, extractData(line, 42, 57));
                recordMapData.put(IMPORTO_CREDITO, extractData(line, 57, 72));
                recordMapData.put(CODICE_UFFICIO, extractData(line, 72, 75));
                recordMapData.put(CODICE_ATTO, extractData(line, 75, 86));
                recordMapData.put(RATEAZIONE, extractData(line, 86, 92));
                break;
            case "14":
                recordMapData.put(TIPO_RECORD, extractData(line, 1, 3));
                recordMapData.put(PROGRESSIVO_DELEGA_F24, extractData(line, 3,10 ));
                recordMapData.put(SUB_TIPO_RECORD, extractData(line, 10, 12));
                recordMapData.put(TOTALE_DEBITO, extractData(line, 12, 27));
                recordMapData.put(TOTALE_CREDITO, extractData(line, 27, 42));
                recordMapData.put(SEGNO_SEZIONE, extractData(line, 42, 43));
                recordMapData.put(SALDO_SEZIONE, extractData(line, 43, 58));
                break;

            case "17":
                recordMapData.put(TIPO_RECORD, extractData(line, 1, 3));
                recordMapData.put(PROGRESSIVO_DELEGA_F24, extractData(line, 3,10 ));
                recordMapData.put(SUB_TIPO_RECORD, extractData(line, 10, 12));
                recordMapData.put(PROGRESSIVO_TRIBUTO, extractData(line, 12, 14));
                recordMapData.put(TIPO_VEICOLO, extractData(line, 14,15 ));
                recordMapData.put(NUMERO_TELAIO, extractData(line, 15, 32));
                recordMapData.put(CODICE_TRIBUTO, extractData(line, 32, 36));
                recordMapData.put(ANNO_RIFERIMENTO_TRIBUTO, extractData(line, 36, 40));
                recordMapData.put(IMPORTO_DEBITO_VERSATO, extractData(line, 40, 55));
                recordMapData.put(IMPORTO_CREDITO_COMPENSATO, extractData(line, 55, 70));
                recordMapData.put(CODICE_UFFICIO, extractData(line, 70, 73));
                recordMapData.put(CODICE_ATTO, extractData(line, 73, 84));

                break;
            case "18":
                recordMapData.put(TIPO_RECORD, extractData(line, 1, 3));
                recordMapData.put(PROGRESSIVO_DELEGA_F24, extractData(line, 3,10 ));
                recordMapData.put(SUB_TIPO_RECORD, extractData(line, 10, 12));
                recordMapData.put(SEGNO_SALDO, extractData(line, 42, 43));
                recordMapData.put(SALDO_SEZIONE, extractData(line, 43, 58));
                break;

            default:
                break;
        }
        return recordMapData;
    }

    public static Map<String,String> getData_LineStartWith_50(String line)
    {
        Map<String, String> recordMapData = new HashMap<>();
        String recordNumber = line.substring(10, 12);
        switch (recordNumber) {
            case "01":
                recordMapData.put(TIPO_RECORD, extractData(line, 1, 3));
                recordMapData.put(PROGRESSIVO_DELEGA_F24, extractData(line, 3,10 ));
                recordMapData.put(SUB_TIPO_RECORD, extractData(line, 10, 12));
                recordMapData.put(COD_ABI_RICEVENTE, extractData(line, 12, 17));
                recordMapData.put(COD_CAB_RICEVENTE, extractData(line, 17, 22));
                recordMapData.put(NUM_CC_RICEVENTE, extractData(line, 22, 34));
                recordMapData.put(CIN, extractData(line, 34, 35));
                recordMapData.put(SALDO_DELEGA, extractData(line, 35, 50));
                recordMapData.put(FLAG_FIRMATARIO, extractData(line, 50, 51));
                recordMapData.put(CODICE_FISCALE_P, extractData(line, 53, 69));
                recordMapData.put(TITOLARE_PAGAMENTO, extractData(line, 69, 70));
                recordMapData.put(DATA_PAGAMENTO_P, extractData(line, 70, 78));
                recordMapData.put(TOTALE_CREDITO, extractData(line, 78, 93));
                recordMapData.put(TIPO_CODICE_INDIVIDUALE, extractData(line, 95, 96));
                break;
            case "02":
                recordMapData.put(TIPO_RECORD, extractData(line, 1, 3));
                recordMapData.put(PROGRESSIVO_DELEGA_F24, extractData(line, 3,10 ));
                recordMapData.put(SUB_TIPO_RECORD, extractData(line, 10, 12));
                recordMapData.put(COD_MITTENTE, extractData(line, 12, 32));
                recordMapData.put(COD_ABI_RIFERIMENTO_MITTENTE, extractData(line, 32, 37));
                recordMapData.put(COD_CAB_RIFERIMENTO_MITTENTE, extractData(line, 37, 42));
                recordMapData.put(CODICE_CLIENTE_BANCARIO, extractData(line, 42, 62));
                recordMapData.put(DESTINATARIO_STAMPA, extractData(line, 62, 63));
                recordMapData.put(DENOMINAZIONE_MITTENTE, extractData(line, 63, 108));
                break;
            case "03":
                recordMapData.put(TIPO_RECORD, extractData(line, 1, 3));
                recordMapData.put(PROGRESSIVO_DELEGA_F24, extractData(line, 3,10 ));
                recordMapData.put(SUB_TIPO_RECORD, extractData(line, 10, 12));
                recordMapData.put(CAP, extractData(line, 12, 17));
                recordMapData.put(COMUNE, extractData(line, 17, 42));
                recordMapData.put(PROVINCIA, extractData(line, 42, 44));
                recordMapData.put(INDIRIZZO, extractData(line, 44, 78));
                break;

            default:
                break;
        }
        return recordMapData;
    }

    public static Map<String,String> getData_LineStartWith_70(String line)
    {
        Map<String, String> recordMapData = new HashMap<>();
        recordMapData.put(TIPO_RECORD, extractData(line, 1, 3));
        recordMapData.put(PROGRESSIVO_DELEGA_F24, extractData(line, 3,10 ));
        recordMapData.put(SUB_TIPO_RECORD, extractData(line, 10, 12));
        recordMapData.put(DATA_CREAZIONE, extractData(line, 12, 18));
        recordMapData.put(NOME_SUPPORTO, extractData(line, 18, 38));
        recordMapData.put(DATA_PAGAMENTO, extractData(line, 38, 46));
        recordMapData.put(TOTALE_DELEGA, extractData(line, 46, 61));
        recordMapData.put(ESITO_QUIETANZA, extractData(line, 61, 62));
        recordMapData.put(DESCRIZIONE_RIFIUTO, extractData(line, 62, 102));
        recordMapData.put(BANCA_PASS_RENDICONTANTE, extractData(line, 102, 107));
        recordMapData.put(SPORTELLO_BANCA_PASSIVA, extractData(line, 107, 112));
        recordMapData.put(PROGRESSIVO_ASSOLUTO, extractData(line, 112, 119));
        recordMapData.put(FLAG_POSIZ_COD_ABI_RENDICONT, extractData(line, 119, 120));

        return recordMapData;
    }

    public static void getData_LineStartWith_EF(String line)
    {
        tailMap.put(TIPO_RECORD, extractData(line, 1, 3));
        tailMap.put(MITTENTE, extractData(line, 3,8 ));
        tailMap.put(RICEVENTE, extractData(line, 8, 13));
        tailMap.put(DATA_CREAZIONE, extractData(line, 13, 19));
        tailMap.put(NOME_SUPPORTO, extractData(line, 19, 39));
        tailMap.put(RIFERIMENTI_MITTENTE, extractData(line, 39, 45));
        tailMap.put(NUMERO_DISPOSIZIONI, extractData(line, 45, 52));
        tailMap.put(TOTALE_IMPORTI_POSITIVI, extractData(line, 52, 67));
        tailMap.put(TOTALE_IMPORTI_NEGATIVI, extractData(line, 67, 82));
        tailMap.put(NUMERO_RECORD, extractData(line, 82, 89));
        tailMap.put(CODICE_DIVISA, extractData(line, 113, 114));
    }
}
