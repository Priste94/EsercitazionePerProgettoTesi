package Esercitazione2p1;

public class ProdottiNonAlimentari extends Prodotti{
	
	protected String materiale;

	public ProdottiNonAlimentari(String codiceABarre, String descrizione, double prezzo, String materiale) {
		super(codiceABarre, descrizione, prezzo);
		this.materiale=materiale;
		
	}

	public String getMateriale() {
		return materiale;
	}

	public void setMateriale(String materiale) {
		this.materiale = materiale;
	}
	
	@Override
	public void applicaSconto () {
		if(materiale == "carta" || materiale == "vetro" || materiale == "plastica")
			prezzo *= 0.9;
	}
	
	

}
