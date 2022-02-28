package EsercitazioniCollectionMap.Es1_Tipi_di_Bevande;

import java.util.HashMap;
import java.util.Map;

public class TestDistributoreBevande {

	public static void main(String[] args) {
		
		DistributoreDiBevande db = new DistributoreDiBevande(new HashMap<String, Bevanda>());
		
		db.aggiungiBevanda(new Bevanda("A", "Acqua", 0.2));
		db.aggiungiBevanda(new Bevanda("B", "Coca", 0.3));
		db.aggiungiBevanda(new Bevanda("C", "Birra", 1.0));
		
		for(Map.Entry<String, Bevanda> b : db.getDistributore().entrySet()) {
			System.out.println(b.getValue().getNome());
			System.out.println(b.getValue().getPrezzo());
		}
	

	}

}
