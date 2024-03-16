package Capgemini;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

// List<PrintProxiesF24DTO>

public class PrintProxiesF24DTO {
    
	// private static final long serialVersionUID = -7078769789725064424L;

	private String protocolloTelematico1;
	private String protocolloTelematico2;
	private BigDecimal saldoDelega;
	private String dataVersamento;
	private String abi;
	private String cab;
	private String codiceFiscale;
	private String cognomeNome;
	private String secondoCodiceFiscale;
	private String codiceIdentificativo;
	private String codiceUfficio;
	private String codiceAtto;
	private Integer statoQuietanza;
	private String identificativoOperazione;
	private List<PrintDetailProxiesF24DTO> listDetails;
	
	public String getProtocolloTelematico1() {
		return protocolloTelematico1;
	}

	public void setProtocolloTelematico1(String protocolloTelematico1) {
		this.protocolloTelematico1 = protocolloTelematico1;
	}

	public String getProtocolloTelematico2() {
		return protocolloTelematico2;
	}

	public void setProtocolloTelematico2(String protocolloTelematico2) {
		this.protocolloTelematico2 = protocolloTelematico2;
	}

	public BigDecimal getSaldoDelega() {
		return saldoDelega;
	}

	public void setSaldoDelega(BigDecimal saldoDelega) {
		this.saldoDelega = saldoDelega;
	}

	public String getDataVersamento() {
		return dataVersamento;
	}

	public void setDataVersamento(String dataVersamento) {
		this.dataVersamento = dataVersamento;
	}

	public String getAbi() {
		return abi;
	}

	public void setAbi(String abi) {
		this.abi = abi;
	}

	public String getCab() {
		return cab;
	}

	public void setCab(String cab) {
		this.cab = cab;
	}

	public String getCodiceFiscale() {
		return codiceFiscale;
	}

	public void setCodiceFiscale(String codiceFiscale) {
		this.codiceFiscale = codiceFiscale;
	}

	public String getCognomeNome() {
		return cognomeNome;
	}

	public void setCognomeNome(String cognomeNome) {
		this.cognomeNome = cognomeNome;
	}

	public String getSecondoCodiceFiscale() {
		return secondoCodiceFiscale;
	}

	public void setSecondoCodiceFiscale(String secondoCodiceFiscale) {
		this.secondoCodiceFiscale = secondoCodiceFiscale;
	}

	public String getCodiceIdentificativo() {
		return codiceIdentificativo;
	}

	public void setCodiceIdentificativo(String codiceIdentificativo) {
		this.codiceIdentificativo = codiceIdentificativo;
	}

	public String getCodiceUfficio() {
		return codiceUfficio;
	}

	public void setCodiceUfficio(String codiceUfficio) {
		this.codiceUfficio = codiceUfficio;
	}

	public String getCodiceAtto() {
		return codiceAtto;
	}

	public void setCodiceAtto(String codiceAtto) {
		this.codiceAtto = codiceAtto;
	}

	public Integer getStatoQuietanza() {
		return statoQuietanza;
	}

	public void setStatoQuietanza(Integer statoQuietanza) {
		this.statoQuietanza = statoQuietanza;
	}

	public String getIdentificativoOperazione() {
		return identificativoOperazione;
	}

	public void setIdentificativoOperazione(String identificativoOperazione) {
		this.identificativoOperazione = identificativoOperazione;
	}

	public List<PrintDetailProxiesF24DTO> getListDetails() {
		if(listDetails == null) {
			listDetails = new ArrayList<>();
		}
		return listDetails;
	}
	
	public void setListDetails(List<PrintDetailProxiesF24DTO> listDetails) {
		this.listDetails = listDetails;
	}
}
