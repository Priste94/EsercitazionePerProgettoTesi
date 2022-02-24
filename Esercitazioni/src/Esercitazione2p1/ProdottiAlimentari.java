package Esercitazione2p1;

import java.util.GregorianCalendar;

public class ProdottiAlimentari extends Prodotti{

	protected GregorianCalendar dataDiScadenza;

	public ProdottiAlimentari(String codiceABarre, String descrizione, double prezzo, Date dataDiScadenza) {
		super(codiceABarre, descrizione, prezzo);
		this.dataDiScadenza=dataDiScadenza;
	}

	public GregorianCalendar getDataDiScadenza() {
		return dataDiScadenza;
	}

	public void setDataDiScadenza(GregorianCalendar dataDiScadenza) {
		this.dataDiScadenza = dataDiScadenza;
	}
	
	@Override
	public void applicaSconto () {
		GregorianCalendar c = new GregorianCalendar();
		if (c.compareTo(dataDiScadenza)<=10)
			prezzo *= 0.8;
	}
	
}
