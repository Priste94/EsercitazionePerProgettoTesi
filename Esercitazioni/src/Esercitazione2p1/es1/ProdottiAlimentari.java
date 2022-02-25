package Esercitazione2p1.es1;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class ProdottiAlimentari extends Prodotti{

	protected GregorianCalendar dataDiScadenza;


	public ProdottiAlimentari(String codiceABarre, String descrizione, double prezzo, GregorianCalendar dataDiScadenza) {
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
		long milliseconds1 = dataDiScadenza.getTimeInMillis();
		long milliseconds2 = System.currentTimeMillis();
		long diff = milliseconds2 - milliseconds1;
		long diffDays = diff / (24 * 60 * 60 * 1000);
		if (diffDays<=10)
			prezzo *= 0.8;
	}

	@Override
	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		super.toString();
		return  super.toString() +"  dataDiScadenza = " + sdf.format(dataDiScadenza.getTime());
	}
	
	
	
}
