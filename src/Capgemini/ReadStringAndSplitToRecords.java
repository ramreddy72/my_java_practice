package Capgemini;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class ReadStringAndSplitToRecords {

    private static final String LINE_START_Q4 = "Q4";
    private static final String LINE_START_10 = "10";
    private static final String LINE_START_20 = "20";
    private static final String LINE_START_40 = "40";
    private static final String LINE_START_50 = "50";
    private static final String LINE_START_70 = "70";
    private static final String LINE_START_EF = "EF";

    private static final String LINE_START_40_01 = "40_01";
    private static final String LINE_START_40_02 = "40_02";
    private static final String LINE_START_40_03 = "40_03";
    private static final String LINE_START_40_04 = "40_04";
    private static final String LINE_START_40_05 = "40_05";
    private static final String LINE_START_40_06 = "40_06";
    private static final String LINE_START_40_07 = "40_07";
    private static final String LINE_START_40_08 = "40_08";
    private static final String LINE_START_40_09 = "40_09";
    private static final String LINE_START_40_10 = "40_10";
    private static final String LINE_START_40_11 = "40_11";
    private static final String LINE_START_40_12 = "40_12";
    private static final String LINE_START_40_13 = "40_13";
    private static final String LINE_START_40_14 = "40_14";
    private static final String LINE_START_40_15 = "40_15";
    private static final String LINE_START_40_16 = "40_16";
    private static final String LINE_START_40_17 = "40_17";
    private static final String LINE_START_40_18 = "40_18";


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

        String input = "";

        String filePath = "C:\\Users\\palnredd\\OneDrive - Capgemini\\Documents\\Tasks\\RM 73802\\F24TextOutput.txt"; // Replace with the actual file path
        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new FileReader(filePath));
            String line;
            while ((line = reader.readLine()) != null) {
                input += line + "\n";
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

        extractDetailDataFromFlow(input);
       
    }
    
    public static void extractDetailDataFromFlow(String flowInput) {
        // Splitting the input string into lines
        String[] lines = flowInput.split("\n");

        for (String line : lines) {

            String lineStartWith = line.substring(1, 3);

            if (lineStartWith.equals(LINE_START_Q4)) {
                getData_LineStartWith_Q4(line);

            } else if (lineStartWith.equals(LINE_START_EF)) {
                getData_LineStartWith_EF(line);
            } else {
                recordExtraction(line);
            }
        }

        System.out.println("Header Q4: ");
        headerMap.forEach((key, value) -> {
            System.out.println(key + " : " + value);
        });

        System.out.println(" \n Record Map: ");
        recordsDataMap.forEach(record -> {
            System.out.println("Record start : ");
            record.forEach((key, value) -> {
                System.out.println(key + " : " + value + "\n");
            });
            System.out.println(" Record end \n");
        });

        System.out.println("Tail EF: ");
        tailMap.forEach((key, value) -> {
            System.out.println(key + " : " + value);
        });

        List<PrintProxiesF24DTO> printProxiesF24DTOList = new LinkedList<>();

        for (Map<String, Map<String, String>> record : recordsDataMap) {
            if (!record.isEmpty()) {
                printProxiesF24DTOList.add(getPrintProxiesF24DTO(record, headerMap, tailMap));
            }
        }

        System.out.println("PrintProxiesF24DTO List: ");
        printProxiesF24DTOList.forEach(printProxiesF24DTO -> {
            System.out.println(printProxiesF24DTO);
        });
    }

    private static PrintProxiesF24DTO getPrintProxiesF24DTO(Map<String, Map<String, String>> record,
            Map<String, String> headerMap, Map<String, String> tailMap) {
        PrintProxiesF24DTO printProxiesF24DTO = new PrintProxiesF24DTO();

        /*protocolloTelematico1 -> "B"  
                              + if (record 70 field flag_posiz_cod_abi_rendicont = 1 )
                                          ? record 70 field banca_pass_rendicontante
                                          : record Q4 field mittente 
                              + record 70 field sportello_banca_passiva
                              + record 70 field data_pagamento (format ddmmyy)
                              + record 70 field progressivo_assoluto */
        StringBuilder protocolloTelematico1 = new StringBuilder("B");
        if (record.containsKey(LINE_START_70) && record.get(LINE_START_70).containsKey(FLAG_POSIZ_COD_ABI_RENDICONT)
             && record.get(LINE_START_70).get(FLAG_POSIZ_COD_ABI_RENDICONT).equals("1")) {
            protocolloTelematico1.append(record.get(LINE_START_70).get(BANCA_PASS_RENDICONTANTE));
        } else {
            protocolloTelematico1.append(headerMap.get(MITTENTE));
        }
        protocolloTelematico1.append(record.get(LINE_START_70).get(SPORTELLO_BANCA_PASSIVA));
        protocolloTelematico1.append(record.get(LINE_START_70).get(DATA_PAGAMENTO));
        protocolloTelematico1.append(record.get(LINE_START_70).get(PROGRESSIVO_ASSOLUTO));

        printProxiesF24DTO.setProtocolloTelematico1(protocolloTelematico1.toString());

        //protocolloTelematico2   -> record 70 field progressivo_assoluto
        printProxiesF24DTO.setProtocolloTelematico2(record.get(LINE_START_70).get(PROGRESSIVO_ASSOLUTO));

        // saldoDelega             -> record 70 field totale_delega
        printProxiesF24DTO.setSaldoDelega(new BigDecimal(record.get(LINE_START_70).get(TOTALE_DELEGA)));

        // dataVersamento          -> record 20 field data_pagamento
        printProxiesF24DTO.setDataVersamento(record.get(LINE_START_20).get(DATA_PAGAMENTO));

        // abi                     -> record Q4 field mittente
        printProxiesF24DTO.setAbi(headerMap.get(MITTENTE));

        // cab                     -> record 70 field sportello_banca_passiva
        printProxiesF24DTO.setCab(record.get(LINE_START_70).get(SPORTELLO_BANCA_PASSIVA));

        // codiceFiscale           -> record 10 field codice_fiscale
        printProxiesF24DTO.setCodiceFiscale(record.get(LINE_START_10).get(CODICE_FISCALE));

        // cognomeNome             -> record 10 field cognome + " " + nome
        printProxiesF24DTO.setCognomeNome(record.get(LINE_START_10).get(COGNOME) + " " + record.get(LINE_START_10).get(NOME));
        
        // secondoCodiceFiscale    -> record 20 field secondo_codice_fiscale
        printProxiesF24DTO.setSecondoCodiceFiscale(record.get(LINE_START_20).get(SECONDO_CODICE_FISCALE));

        // codiceIdentificativo    -> record 20 field codice_identificativo_20
        printProxiesF24DTO.setCodiceIdentificativo(record.get(LINE_START_20).get(CODICE_IDENTIFICATIVO_20));

        /*codiceUfficio           -> if (exists record 40_01 or exists record 40_13 ) {                   
                                        if (exists record 40_01 field codice_ufficio and it’s not null)
                                            record 40_01 field codice_ufficio
                                        else
                                                record 40_13 field codice_ufficio
                                    } else 
                                        record 40_17 field codice_ufficio   */
        String codiceUfficio = null;
        boolean isRecordAvailable_40_01 = false;
        boolean isRecordAvailable_40_13 = false;
        for (String outerKey : record.keySet()) {
            if (outerKey.startsWith(LINE_START_40_01)) {
                isRecordAvailable_40_01 = true;
                break;
            } else if (outerKey.startsWith(LINE_START_40_13)) {
                isRecordAvailable_40_13 = true;
                break;
            }
        }
        
        if ( isRecordAvailable_40_01 || isRecordAvailable_40_13 ) {
            if (isRecordAvailable_40_01 && record.get(LINE_START_40_01 + "_01").containsKey(CODICE_UFFICIO) && record.get(LINE_START_40_01 + "_01").get(CODICE_UFFICIO) != null) {
                codiceUfficio = record.get(LINE_START_40_01 + "_01").get(CODICE_UFFICIO);
            } else if (isRecordAvailable_40_13 && record.get(LINE_START_40_13 + "_01").containsKey(CODICE_UFFICIO) && record.get(LINE_START_40_13 + "_01").get(CODICE_UFFICIO) != null) {
                codiceUfficio = record.get(LINE_START_40_13 + "_01").get(CODICE_UFFICIO);
            }
        } else {
            codiceUfficio = record.get(LINE_START_40_17).get(CODICE_UFFICIO);
        }
        printProxiesF24DTO.setCodiceUfficio(codiceUfficio);

        /*codiceAtto              -> if (exists record 40_01 or exists record 40_13 ) {
                                        if (exists record 40_01 field codice_atto and it’s not null)
                                            record 40_01 field codice_atto
                                        else
                                            record 40_13 field codice_atto
                                    } else 
                                        record 40_17 field codice_atto */
        String codiceAtto = null;
        if ( isRecordAvailable_40_01 || isRecordAvailable_40_13 ) {
            if (isRecordAvailable_40_01 && record.get(LINE_START_40_01 + "_01").containsKey(CODICE_ATTO) && record.get(LINE_START_40_01 + "_01").get(CODICE_ATTO) != null) {
                codiceAtto = record.get(LINE_START_40_01 + "_01").get(CODICE_ATTO);
            } else if (isRecordAvailable_40_13 && record.get(LINE_START_40_13 + "_01").containsKey(CODICE_ATTO) && record.get(LINE_START_40_13 + "_01").get(CODICE_ATTO) != null) {
                codiceAtto = record.get(LINE_START_40_13 + "_01").get(CODICE_ATTO);
            }
        } else {
            codiceAtto = record.get(LINE_START_40_17).get(CODICE_ATTO);
        }
        printProxiesF24DTO.setCodiceAtto(codiceAtto);

        /*statoQuietanza          -> if (record 70 field flag_posiz_cod_abi_rendicont = 1 and record 70 field banca_pass_rendicontante is empty) 
                              then 1 
                              else 0*/
        if (record.get(LINE_START_70).get(FLAG_POSIZ_COD_ABI_RENDICONT).equals("1") && record.get(LINE_START_70).get(BANCA_PASS_RENDICONTANTE).isEmpty()) {
            printProxiesF24DTO.setStatoQuietanza(1);
        } else {
            printProxiesF24DTO.setStatoQuietanza(0);
        }

        // identificativoOperazione -> record 40_07 field identificativo_operazione
        String identificativoOperazione = null;
        if (record.containsKey(LINE_START_40_07)) {
            identificativoOperazione = record.get(LINE_START_40_07).get(IDENTIFICATIVO_OPERAZIONE);
        }
        printProxiesF24DTO.setIdentificativoOperazione(identificativoOperazione);


        List<PrintDetailProxiesF24DTO> printDetailProxiesF24DTOList = new LinkedList<>();

        // Loop through the outer map
        for (Map.Entry<String, Map<String, String>> entry : record.entrySet()) {

            String recordType = entry.getKey();
            if (recordType.startsWith(LINE_START_40)) {
                printDetailProxiesF24DTOList.add(getPrintDetailProxiesF24DTO(entry.getValue(), recordType));
            }
        }

        return printProxiesF24DTO;
    }
    
    private static PrintDetailProxiesF24DTO getPrintDetailProxiesF24DTO(Map<String, String> recordDetailsProxy,
            String recordDetailsProxyType) {
       
        PrintDetailProxiesF24DTO printDetailProxiesF24DTO = new PrintDetailProxiesF24DTO();
        if (recordDetailsProxyType.length() > 5) {
            recordDetailsProxyType = recordDetailsProxyType.substring(0, 5);
        }
        String importo_credito = recordDetailsProxy.get(IMPORTO_CREDITO);
        String importo_debito = recordDetailsProxy.get(IMPORTO_DEBITO);
        if (importo_credito == null || importo_credito.isEmpty()) {
            importo_credito = "0";
        }
        if (importo_debito == null || importo_debito.isEmpty()) {
            importo_debito = "0";
        }
        switch (recordDetailsProxyType) {
            case LINE_START_40_01:
                printDetailProxiesF24DTO.setSezione("ERARIO");
                printDetailProxiesF24DTO.setCodice("");
                printDetailProxiesF24DTO.setTributoCausale(recordDetailsProxy.get(CODICE_TRIBUTO).toUpperCase());
                printDetailProxiesF24DTO.setImportoCredito(new BigDecimal(importo_credito));
                printDetailProxiesF24DTO.setImportoDebito(new BigDecimal(importo_debito));
                printDetailProxiesF24DTO.setEstremiIdentificativi("");
                String riferimenti_tributo = recordDetailsProxy.get(RIFERIMENTI_TRIBUTO);
                printDetailProxiesF24DTO
                        .setRif1(riferimenti_tributo.substring(0, 4) + "0000" + riferimenti_tributo.substring(0, 4));
                printDetailProxiesF24DTO
                        .setRif2(riferimenti_tributo.substring(riferimenti_tributo.length() - 4, riferimenti_tributo.length()) + "0000"
                                + riferimenti_tributo.substring(riferimenti_tributo.length() - 4, riferimenti_tributo.length()));
                break;
            case LINE_START_40_02:

                break;
            case LINE_START_40_03:
            /*sezione                        "INPS"  
            codice                         upper(codice_sede)
            tributoCausale                 upper(causale_contributo)
            importoCredito                 importo_credito
            importoDebito                  importo_debito
            estremiIdentificativi          upper(matricola_inps)
            rif1                           decode(rtrim(periodo_inizio),'0','',substr(periodo_inizio,1,2)) || '/' || decode(rtrim(periodo_inizio),'0','',substr(periodo_inizio,3))
            rif2                           decode(rtrim(periodo_fine),'0','',substr(periodo_fine,1,2)) || '/' || decode(rtrim(periodo_fine),'0','',substr(periodo_fine,3))
            
            */
            printDetailProxiesF24DTO.setSezione("INPS");
            printDetailProxiesF24DTO.setCodice(recordDetailsProxy.get(CODICE_SEDE).toUpperCase());
            printDetailProxiesF24DTO.setTributoCausale(recordDetailsProxy.get(CAUSALE_CONTRIBUTO).toUpperCase());
            printDetailProxiesF24DTO.setImportoCredito(new BigDecimal(importo_credito));
            printDetailProxiesF24DTO.setImportoDebito(new BigDecimal(importo_debito));
            printDetailProxiesF24DTO.setEstremiIdentificativi(recordDetailsProxy.get(MATRICOLA_INPS).toUpperCase());
            String periodo_inizio = recordDetailsProxy.get(PERIODO_INIZIO);
            //TBD
            printDetailProxiesF24DTO.setRif1(periodo_inizio.trim() + "0" + periodo_inizio.substring(0, 2) + "/"
                            + recordDetailsProxy.get(PERIODO_INIZIO).substring(2));
            
            printDetailProxiesF24DTO.setRif2(recordDetailsProxy.get(PERIODO_FINE).trim().equals("0") ? ""
                    : recordDetailsProxy.get(PERIODO_FINE).substring(0, 2) + "/"
                            + recordDetailsProxy.get(PERIODO_FINE).substring(2));

                break;
            case LINE_START_40_04:

                break;
            case LINE_START_40_05:
                /*sezione                        "REGIONI"  
                codice                         upper(codice_regione)
                tributoCausale                 upper(codice_tributo)
                importoCredito                 importo_credito
                importoDebito                  importo_debito
                estremiIdentificativi          ""
                rif1                           decode(SUBSTR(riferimenti_tributo,1,4),'0000','',SUBSTR(riferimenti_tributo,1,4))
                rif2                           decode(SUBSTR(riferimenti_tributo,-4,4),'0000','',SUBSTR(riferimenti_tributo,-4,4))
                */
                printDetailProxiesF24DTO.setSezione("REGIONI");
                printDetailProxiesF24DTO.setCodice(recordDetailsProxy.get(CODICE_REGIONE).toUpperCase());
                printDetailProxiesF24DTO.setTributoCausale(recordDetailsProxy.get(CODICE_TRIBUTO).toUpperCase());
                printDetailProxiesF24DTO.setImportoCredito(new BigDecimal(importo_credito));
                printDetailProxiesF24DTO.setImportoDebito(new BigDecimal(importo_debito));
                printDetailProxiesF24DTO.setEstremiIdentificativi("");
                String riferimenti_tributo_05 = recordDetailsProxy.get(RIFERIMENTI_TRIBUTO);
                printDetailProxiesF24DTO
                        .setRif1(riferimenti_tributo_05.substring(0, 4).equals("0000") ? ""
                                : riferimenti_tributo_05.substring(0, 4));
                        
                printDetailProxiesF24DTO
                        .setRif2(riferimenti_tributo_05.substring(riferimenti_tributo_05.length() - 4, riferimenti_tributo_05.length()).equals("0000") ? ""
                                : riferimenti_tributo_05.substring(riferimenti_tributo_05.length() - 4,
                                        riferimenti_tributo_05.length()));
                break;
            case LINE_START_40_06:
                /*      sezione                        "INAIL"  
                codice                         upper(codice_sede)
                tributoCausale                 UPPER(numero_riferimento) ||' - ' ||  UPPER(causale)
                importoCredito                 importo_credito
                importoDebito                  importo_debito
                estremiIdentificativi          decode(upper(numero_posizione),null,'',upper(numero_posizione)||' / ' ) || upper(codice_controllo_posizione)
                rif1                           ""
                rif2                           ""
                */
                printDetailProxiesF24DTO.setSezione("INAIL");
                printDetailProxiesF24DTO.setCodice(recordDetailsProxy.get(CODICE_SEDE).toUpperCase());
                printDetailProxiesF24DTO.setTributoCausale(recordDetailsProxy.get(NUMERO_RIFERIMENTO).toUpperCase() + " - "
                        + recordDetailsProxy.get(CAUSALE).toUpperCase());
                printDetailProxiesF24DTO.setImportoCredito(new BigDecimal(importo_credito));
                printDetailProxiesF24DTO.setImportoDebito(new BigDecimal(importo_debito));
                // TBD
                // printDetailProxiesF24DTO.setEstremiIdentificativi(recordDetailsProxy.get(NUMERO_POSIZIONE).toUpperCase() == null ? ""
                //         : recordDetailsProxy.get(NUMERO_POSIZIONE).toUpperCase() + " / "
                //                 + recordDetailsProxy.get(CODICE_CONTROLLO_POSIZIONE).toUpperCase());
                printDetailProxiesF24DTO.setRif1("");
                printDetailProxiesF24DTO.setRif2("");

                break;
            case LINE_START_40_07:
            /*      sezione                        "IMU/TRIB.LOCALI"  
            codice                         codice_ente (uppercase)
            tributoCausale                 codice_tributo (uppercase)
            importoCredito                 importo_credito
            importoDebito                  importo_debito
            estremiIdentificativi          decode(ravvedimento,1,'X','-') || ' | '||decode(immobili_variati,1,'X','-') || ' | '|| decode(acconto,1,'X','-') || ' | '|| decode(saldo,1,'X','-') || ' | '||
                            numero_fabbricati || ' | '||  ltrim(to_char(f24_ici_tributi_locali.detrazioni_ici,'999999999990D99','NLS_NUMERIC_CHARACTERS=''.,''  '))
            rif1                           decode(SUBSTR(riferimenti_tributo,1,4),'0000','',SUBSTR(riferimenti_tributo,1,4))
            rif2                           decode(SUBSTR(riferimenti_tributo,-4,4),'0000','',SUBSTR(riferimenti_tributo,-4,4))
            */
            printDetailProxiesF24DTO.setSezione("IMU/TRIB.LOCALI");
            printDetailProxiesF24DTO.setCodice(recordDetailsProxy.get(CODICE_ENTE).toUpperCase());
            printDetailProxiesF24DTO.setTributoCausale(recordDetailsProxy.get(CODICE_TRIBUTO).toUpperCase());
            printDetailProxiesF24DTO.setImportoCredito(new BigDecimal(importo_credito));
            printDetailProxiesF24DTO.setImportoDebito(new BigDecimal(importo_debito));
            // TBD
            // printDetailProxiesF24DTO.setEstremiIdentificativi(
            //         (recordDetailsProxy.get(RAVVEDIMENTO).equals("1") ? "X" : "-") + " | "
            //                 + (recordDetailsProxy.get(IMMOBILI_VARIATI).equals("1") ? "X" : "-") + " | "
            //                 + (recordDetailsProxy.get(ACCONTO).equals("1") ? "X" : "-") + " | "
            //                 + (recordDetailsProxy.get(SALDO).equals("1") ? "X" : "-") + " | "
            //                 + recordDetailsProxy.get(NUMERO_FABBRICATI) + " | "
            //                 + recordDetailsProxy.get(DETRAZIONI_ICI));
            String riferimenti_tributo_07 = recordDetailsProxy.get(RIFERIMENTI_TRIBUTO);
            printDetailProxiesF24DTO
                    .setRif1(riferimenti_tributo_07.substring(0, 4).equals("0000") ? ""
                            : riferimenti_tributo_07.substring(0, 4));
            printDetailProxiesF24DTO
                    .setRif2(riferimenti_tributo_07.substring(riferimenti_tributo_07.length() - 4, riferimenti_tributo_07.length()).equals("0000") ? ""
                            : riferimenti_tributo_07.substring(riferimenti_tributo_07.length() - 4,
                                    riferimenti_tributo_07.length()));
                break;
            case LINE_START_40_08:

                break;
            case LINE_START_40_09:

                break;
            case LINE_START_40_10:

                break;
            case LINE_START_40_11:
                /*sezione                        "ENTI PREVID." 
                codice                         upper(codice_ente)
                tributoCausale                 upper(causale)
                importoCredito                 importo_credito
                importoDebito                  importo_debito
                estremiIdentificativi          decode(upper(codice_sede),null,'',upper(codice_sede)||' / ')|| upper(codice_posizione)
                rif1                           decode(substr(periodo_inizio,1,2),'00','',substr(periodo_inizio,1,2)) ||'/'|| decode(substr(periodo_inizio,3,4),'0000','',substr(periodo_inizio,3,4))
                rif2                           decode(substr(periodo_fine,1,2),'00','',substr(periodo_fine,1,2)) ||'/'|| decode(substr(periodo_fine,3,4),'0000','',substr(periodo_fine,3,4))
                */
                printDetailProxiesF24DTO.setSezione("ENTI PREVID.");
                printDetailProxiesF24DTO.setCodice(recordDetailsProxy.get(CODICE_ENTE).toUpperCase());
                printDetailProxiesF24DTO.setTributoCausale(recordDetailsProxy.get(CAUSALE).toUpperCase());
                printDetailProxiesF24DTO.setImportoCredito(new BigDecimal(importo_credito));
                printDetailProxiesF24DTO.setImportoDebito(new BigDecimal(importo_debito));
                printDetailProxiesF24DTO.setEstremiIdentificativi(
                        (recordDetailsProxy.get(CODICE_SEDE) == null ? ""
                                : recordDetailsProxy.get(CODICE_SEDE) + " / ")
                                + recordDetailsProxy.get(CODICE_POSIZIONE));
                // TBD
                // printDetailProxiesF24DTO.setRif1()
                // printDetailProxiesF24DTO.setRif2()


                break;
            case LINE_START_40_12:

                break;
            case LINE_START_40_13:
                /*sezione                        "ACCISE/MONOPOLI" 
                codice                         decode(UPPER(codice_ente),null,'',UPPER(codice_ente))||decode(UPPER(codice_provincia),null,'',('/'||UPPER(codice_provincia)))
                tributoCausale                 UPPER(codice_tributo)
                importoCredito                 importo_credito
                importoDebito                  importo_debito
                estremiIdentificativi          ""
                rif1                           decode(substr(riferimento_tributo,1,2),'00','',(substr(riferimento_tributo,1,2)||'-'))||decode(substr(riferimento_tributo,3,4),'0000','',substr(riferimento_tributo,3,4))
                rif2                           rateazione
                */
                printDetailProxiesF24DTO.setSezione("ACCISE/MONOPOLI");
                printDetailProxiesF24DTO.setCodice(
                        (recordDetailsProxy.get(CODICE_ENTE) == null ? ""
                                : recordDetailsProxy.get(CODICE_ENTE))
                                + (recordDetailsProxy.get(CODICE_PROVINCIA) == null ? ""
                                        : ("/" + recordDetailsProxy.get(CODICE_PROVINCIA))));
                printDetailProxiesF24DTO.setTributoCausale(recordDetailsProxy.get(CODICE_TRIBUTO).toUpperCase());
                printDetailProxiesF24DTO.setImportoCredito(new BigDecimal(importo_credito));
                printDetailProxiesF24DTO.setImportoDebito(new BigDecimal(importo_debito));
                printDetailProxiesF24DTO.setEstremiIdentificativi("");
                // TBD
                printDetailProxiesF24DTO.setRif1(
                        (recordDetailsProxy.get(RIFERIMENTO_TRIBUTO).substring(0, 2).equals("00") ? ""
                                : recordDetailsProxy.get(RIFERIMENTO_TRIBUTO).substring(0, 2) + "-")
                                + (recordDetailsProxy.get(RIFERIMENTO_TRIBUTO).substring(2, 4).equals("0000") ? ""
                                        : recordDetailsProxy.get(RIFERIMENTO_TRIBUTO).substring(2, 4)));
                printDetailProxiesF24DTO.setRif2(recordDetailsProxy.get(RATEAZIONE));

                break;
            case LINE_START_40_14:

                break;
            case LINE_START_40_15:

                break;
            case LINE_START_40_16:

                break;

            case LINE_START_40_17:
            printDetailProxiesF24DTO.setSezione("ERARIO ED ALTRO");
            printDetailProxiesF24DTO.setCodice(recordDetailsProxy.get(TIPO_VEICOLO));
            printDetailProxiesF24DTO.setTributoCausale(recordDetailsProxy.get(CODICE_TRIBUTO).toUpperCase());
            printDetailProxiesF24DTO.setImportoCredito(new BigDecimal(importo_credito));
            printDetailProxiesF24DTO.setImportoDebito(new BigDecimal(importo_debito));
            printDetailProxiesF24DTO.setEstremiIdentificativi(recordDetailsProxy.get(NUMERO_TELAIO));
            printDetailProxiesF24DTO.setRif1("");
            printDetailProxiesF24DTO.setRif2(recordDetailsProxy.get(ANNO_RIFERIMENTO_TRIBUTO));
            
                break;
            case LINE_START_40_18:
                break;
            default:
                break;
        }
        return printDetailProxiesF24DTO;
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
                String keyFormation = LINE_START_40 + "_" + resultData.get(SUB_TIPO_RECORD);
                if(resultData.containsKey(PROGRESSIVO_TRIBUTO)) 
                    keyFormation = keyFormation + "_" + resultData.get(PROGRESSIVO_TRIBUTO);
                if(resultData.containsKey(PROGRESSIVO_CONTRIBUTO))
                    keyFormation = keyFormation + "_" + resultData.get(PROGRESSIVO_CONTRIBUTO);
                currentMap.put(keyFormation, resultData);
                currentlRecordStartWith = LINE_START_40;
                break;
            case LINE_START_50:
                Map<String, String> resultData_50 = getData_LineStartWith_50(line);
                 String keyFormation_50 = LINE_START_50 + "_" + resultData_50.get(SUB_TIPO_RECORD);
                if(resultData_50.containsKey(PROGRESSIVO_TRIBUTO))
                    keyFormation_50 = keyFormation_50 + "_" + resultData_50.get(PROGRESSIVO_TRIBUTO);
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
        return substring.trim();
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
        Map<String, String> recordMapData = new LinkedHashMap<>();

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
        Map<String, String> recordMapData = new LinkedHashMap<>();

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
        Map<String, String> recordMapData = new LinkedHashMap<>();
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
        Map<String, String> recordMapData = new LinkedHashMap<>();
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
        Map<String, String> recordMapData = new LinkedHashMap<>();
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
