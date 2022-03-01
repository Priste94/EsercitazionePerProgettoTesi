package EsercitazioniCollectionMap;

import java.util.HashMap;

public class Distributore {
	
private HashMap<String, Bevanda> distributoreb = new HashMap<>();
private HashMap<Integer, Tessera> distributoret = new HashMap<>();
private HashMap<Integer, Lattina> distributorel = new HashMap<>();


	
	public HashMap<Integer, Lattina> getDistributorel() {
	return distributorel;
}

public void setDistributorel(HashMap<Integer, Lattina> distributorel) {
	this.distributorel = distributorel;
}

	public Distributore(HashMap<String, Bevanda> distributoreb, HashMap<Integer, Tessera> distributoret, HashMap<Integer, Lattina> distributorel) {
	super();
	this.distributoreb = distributoreb;
	this.distributoret = distributoret;
	this.distributorel = distributorel;
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

	
	public void aggiornaColonna(int i, String nomeBevanda, int numeroLattine) {
		distributorel.get(i).setBevanda(nomeBevanda);
		distributorel.get(i).setQuantita(numeroLattine);
		distributorel.
	}
	
}
