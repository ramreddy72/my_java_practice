package Capgemini;

import java.math.BigDecimal;

public class PrintDetailProxiesF24DTO {
    
	// private static final long serialVersionUID = -2393220772210012580L;

	private String codice;
	private BigDecimal importoCredito;
	private BigDecimal importoDebito;
	private String estremiIdentificativi;
	private String rif1;
	private String rif2;
	private String sezione;
	private String tributoCausale;
	public String getCodice() {
		return codice;
	}
	public void setCodice(String codice) {
		this.codice = codice;
	}
	public BigDecimal getImportoCredito() {
		return importoCredito;
	}
	public void setImportoCredito(BigDecimal importoCredito) {
		this.importoCredito = importoCredito;
	}
	public BigDecimal getImportoDebito() {
		return importoDebito;
	}
	public void setImportoDebito(BigDecimal importoDebito) {
		this.importoDebito = importoDebito;
	}
	public String getEstremiIdentificativi() {
		return estremiIdentificativi;
	}
	public void setEstremiIdentificativi(String estremiIdentificativi) {
		this.estremiIdentificativi = estremiIdentificativi;
	}
	public String getRif1() {
		return rif1;
	}
	public void setRif1(String rif1) {
		this.rif1 = rif1;
	}
	public String getRif2() {
		return rif2;
	}
	public void setRif2(String rif2) {
		this.rif2 = rif2;
	}
	public String getSezione() {
		return sezione;
	}
	public void setSezione(String sezione) {
		this.sezione = sezione;
	}
	public String getTributoCausale() {
		return tributoCausale;
	}
	public void setTributoCausale(String tributoCausale) {
		this.tributoCausale = tributoCausale;
	}
	
}
