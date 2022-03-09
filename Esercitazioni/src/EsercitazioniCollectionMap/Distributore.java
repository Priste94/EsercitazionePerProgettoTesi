package EsercitazioniCollectionMap;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

public class Distributore {
	
private HashMap<String, Bevanda> distributoreb = new HashMap<>();
private HashMap<Integer, Tessera> distributoret = new HashMap<>();
private HashMap<Integer, Lattina> distributorel = new HashMap<>();

Iterator itb = distributoreb.entrySet().iterator();
Iterator itt = distributoret.entrySet().iterator();
Iterator itl = distributorel.entrySet().iterator();


	
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
		if (distributorel.size() < i)
			distributorel.put(i, new Lattina(nomeBevanda, numeroLattine));
		else
			distributorel.get(i).setBevanda(nomeBevanda);
			distributorel.get(i).setQuantita(numeroLattine);

	}
	
	public int lattineDisponibili(String nome) {
		int result = 0;
		if (nome!= null)
			for (int i=1; i<=distributorel.size(); ++i) 
				
				if (nome.equalsIgnoreCase(distributorel.get(i).nomeBevanda))
					result+=distributorel.get(i).getQuantita();
			

				
				return result;	

	
	}
	
	///&&distributorel.containsValue(distributoreb.get(codBev).getNome())
	
	public int eroga(String codBev, int codTes) {
		String nome;
		
		if (codBev!=null&&distributoreb.get(codBev)!=null&&distributoret.get(codTes)!=null) {	// controlli
			
//&&distributoreb.get(codBev).getPrezzo()<=distributoret.get(codTes).getCredito() //questo controllo lo levo per lanciare l' eccezione successivamente
			
			nome=distributoreb.get(codBev).getNome();	//cosi ottengo dal codice inserito il nome della bevanda
			if (lattineDisponibili(nome)>0) //ultimo controllo: esiste almeno una lattina disponibile per la bevanda selezionata
				try {
					distributoret.get(codTes).decrementaCredito(distributoreb.get(codBev).getPrezzo());
				} catch (CreditoInsufficienteException e) {  e.printStackTrace(); }
			
			for (int i=1; i<=4; ++i) 
				if (distributorel.get(i).nomeBevanda.equalsIgnoreCase(nome)) {
					distributorel.get(i).decrementaQuantita();
					return i;
				}
		}
		System.out.println("Nessuno prodotto trovato!");
		return 0;
		
	}		
	
}
