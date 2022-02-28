package EsercitazioniCollectionMap.Es1_Tipi_di_Bevande;

import java.util.HashMap;
import java.util.Map;

public class DistributoreDiBevande {
	
	private HashMap<String, Bevanda> distributore = new HashMap<>();
	
	public void aggiungiBevanda(Bevanda b) {
		
		distributore.put(b.getCodice(), b);
		
	}

	public DistributoreDiBevande(HashMap<String, Bevanda> distributore) {
		super();
		this.distributore = distributore;
	}

	public HashMap<String, Bevanda> getDistributore() {
		return distributore;
	}

	public void setDistributore(HashMap<String, Bevanda> distributore) {
		this.distributore = distributore;
	}
	
	

	

		
	

}
