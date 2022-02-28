package EsercitazioniCollectionMap.Es1_Tipi_di_Bevande;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import EsercitazioniCollectionMap.Es2_Credito.Tessera;
import EsercitazioniCollectionMap.Es2_Credito.TesseraNonValidaException;

public class TestDistributore {

	public static void main(String[] args) {
		
		
		Distributore d = new Distributore(new HashMap<String, Bevanda>(), new HashMap<Integer, Tessera>());
		
		d.aggiungiBevanda(new Bevanda("A", "Acqua", 0.2));
		d.aggiungiBevanda(new Bevanda("B", "Coca", 0.3));
		d.aggiungiBevanda(new Bevanda("C", "Birra", 1.0));
			
		d.getDistributoret().put(12, new Tessera(12, 5.5));
		d.getDistributoret().put(21, new Tessera(21, 10.0));
		d.getDistributoret().put(99, new Tessera(99, 0.75));
		
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
