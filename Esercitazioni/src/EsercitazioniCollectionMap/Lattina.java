package EsercitazioniCollectionMap;

public class Lattina {
	
	public String nomeBevanda = null;
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
	
	public void decrementaQuantita() {
		if(this.quantita>=1)
			this.quantita -= 1;
		else
			System.out.println("Lattine terminate!");
	}
	
	
	

}
