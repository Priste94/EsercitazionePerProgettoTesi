package EsercitazioniCollectionMap.Es1_Tipi_di_Bevande;

public class Bevanda {
	
	private String codice, nome;
	private double prezzo;
	
	public Bevanda(String codice, String nome, double prezzo) {
		super();
		this.codice = codice;
		this.nome = nome;
		this.prezzo = prezzo;
	}

	public String getCodice() {
		return codice;
	}

	public void setCodice(String codice) {
		this.codice = codice;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}
	
	

}
