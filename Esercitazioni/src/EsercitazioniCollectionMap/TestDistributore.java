package EsercitazioniCollectionMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class TestDistributore {

	public static void main(String[] args) {
		
		
		Distributore d = new Distributore(new HashMap<String, Bevanda>(), new HashMap<Integer, Tessera>(), new HashMap<Integer, Lattina>());
		
		d.aggiungiBevanda(new Bevanda("A", "Acqua", 0.2));
		d.aggiungiBevanda(new Bevanda("B", "Coca", 0.3));
		d.aggiungiBevanda(new Bevanda("C", "Birra", 1.0));
			
		d.getDistributoret().put(12, new Tessera(12, 5.5));
		d.getDistributoret().put(21, new Tessera(21, 10.0));
		d.getDistributoret().put(99, new Tessera(99, 0.75));
		

	
		d.aggiornaColonna(1, "Acqua", 40);	
		d.aggiornaColonna(2, "Coca", 1);
		d.aggiornaColonna(3, "Birra", 50);
		d.aggiornaColonna(4, "Acqua", 50);
					
		try {
			for(Entry<String, Bevanda> b : d.getDistributoreb().entrySet()) {
				System.out.println(d.getName(b.getValue().getCodice()));
				System.out.println("Costo: "+d.getPrice(b.getValue().getCodice()));
				System.out.println("");
			}
		} catch (BevandaNonValidaException e) {  e.printStackTrace(); }
		
		for(int i=0;i<80;++i)
			System.out.print("-");
		System.out.println();
		
		try {
			for(Entry<Integer, Tessera> t : d.getDistributoret().entrySet()) {
				System.out.println("Codice tessera: "+t.getValue().getCodice());
				System.out.println("Credito: "+d.leggiCredito(t.getValue()));
			}
		} catch (TesseraNonValidaException e) {  e.printStackTrace(); }   
		
		System.out.println();
		System.out.println(d.lattineDisponibili("Acqua"));
		System.out.println(d.lattineDisponibili("coca"));
		System.out.println(d.lattineDisponibili("Birra"));
		System.out.println();
		
		System.out.println(d.eroga("A", 12)); //stampa 1
		
		System.out.println(d.lattineDisponibili("Acqua")); //i valori sono aggiornati
		System.out.println(d.lattineDisponibili("coca"));
		System.out.println(d.lattineDisponibili("Birra"));
		System.out.println();
		
		System.out.println(d.eroga("A", 12));
		
		System.out.println(d.lattineDisponibili("Acqua"));
		System.out.println(d.lattineDisponibili("coca"));
		System.out.println(d.lattineDisponibili("Birra"));
		System.out.println();
		
		System.out.println(d.eroga("B", 12)); //stampa 2
		
		System.out.println(d.lattineDisponibili("Acqua"));
		System.out.println(d.lattineDisponibili("coca"));
		System.out.println(d.lattineDisponibili("Birra"));
		System.out.println();
		
		//System.out.println(d.eroga("C", 99)); //lancia eccezione
		System.out.println(d.eroga("D", 12)); //mi ritorna 0 perchè il codice non è presente
		
		System.out.println(d.eroga("B", 12)); //stampa "Lattine terminate!"
		
		for (int i=1; i<=4; ++i) {  //situazione colonne distributore
			System.out.print(i+")");
			System.out.println(d.getDistributorel().get(i).getQuantita());
		}
		
		
//      test per eccezione BevandaNonValida
//		try {
//		d.getName("D");
//		} catch (BevandaNonValidaException e) {  e.printStackTrace(); }   
		
		
//		test per eccezione TesseraNonValida
//		try {
//		d.caricaTessera( new Tessera(15, 0.75), 0.75);
//		} catch (TesseraNonValidaException e) {  e.printStackTrace();   }	
		
		
	}

}
