package EsercitazioniCollectionMap;

public class Lattina {
	
	private String nomeBevanda = null;
	private int quantita = 0;
	
	
	public String getBevanda() {
		return nomeBevanda;
	}
	public void setBevanda(String nomeBevanda) {
		this.nomeBevanda = nomeBevanda;
	}
	public int getQuantita() {
		return quantita;
	}
	public void setQuantita(int quantita) {
		this.quantita = quantita;
	}
	public Lattina(String nomeBevanda, int quantita) {
		super();
		this.nomeBevanda = nomeBevanda;
		this.quantita = quantita;
	}
	
	

}
