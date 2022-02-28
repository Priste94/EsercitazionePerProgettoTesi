package EsercitazioniCollectionMap.Es1_Tipi_di_Bevande;

import java.util.HashMap;

import EsercitazioniCollectionMap.Es2_Credito.Tessera;
import EsercitazioniCollectionMap.Es2_Credito.TesseraNonValidaException;

public class Distributore {
	
private HashMap<String, Bevanda> distributoreb = new HashMap<>();
private HashMap<Integer, Tessera> distributoret = new HashMap<>();


	
	public Distributore(HashMap<String, Bevanda> distributoreb, HashMap<Integer, Tessera> distributoret) {
	super();
	this.distributoreb = distributoreb;
	this.distributoret = distributoret;
}

	public void aggiungiBevanda(Bevanda b) {
		
		distributoreb.put(b.getCodice(), b);
		
	}

	public HashMap<String, Bevanda> getDistributoreb() {
		return distributoreb;
	}

	
	
	public void setDistributoreb(HashMap<String, Bevanda> distributoreb) {
		this.distributoreb = distributoreb;
	}
		

	public double getPrice (String codice) throws BevandaNonValidaException{
		if (distributoreb.containsKey(codice))
			return distributoreb.get(codice).getPrezzo();
		else
			throw new BevandaNonValidaException("Bevanda non valida!");
	}
	
	public String getName (String codice) throws BevandaNonValidaException {
		if (distributoreb.containsKey(codice))
			return distributoreb.get(codice).getNome();
		else
			throw new BevandaNonValidaException("Bevanda non valida!");
	}
	
	public void caricaTessera(Tessera t, double c) throws TesseraNonValidaException{
		if (distributoret.containsKey(t.getCodice()))
			t.setCredito(c);
		else
			throw new TesseraNonValidaException("Tessera non valida!");
	}
	
	public double leggiCredito(Tessera t) throws TesseraNonValidaException{
		if (distributoret.containsKey(t.getCodice()))
			return t.getCredito();
		else
			throw new TesseraNonValidaException("Tessera non valida!");
	}

	public HashMap<Integer, Tessera> getDistributoret() {
		return distributoret;
	}

	public void setDistributoret(HashMap<Integer, Tessera> distributore) {
		this.distributoret = distributore;
	}

}
