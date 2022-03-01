package EsercitazioniCollectionMap;

public class Tessera {
	private int codice;
	private double credito;
	

	public Tessera(int i, double d) {
		this.codice = i;
		this.credito = d;
	}

	public int getCodice() {
		return codice;
	}

	public void setCodice(int codice) {
		this.codice = codice;
	}

	public double getCredito() {
		return credito;
	}

	public void setCredito(double credito) {
		this.credito += credito;
	}
	
	
}
