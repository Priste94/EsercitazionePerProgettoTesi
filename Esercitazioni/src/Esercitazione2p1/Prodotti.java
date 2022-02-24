package Esercitazione2p1;

import java.util.Objects;

public class Prodotti {
	
	protected String codiceABarre, descrizione;
	protected double prezzo;
	
	
	public Prodotti(String codiceABarre, String descrizione, double prezzo) {
		super();
		this.codiceABarre = codiceABarre;
		this.descrizione = descrizione;
		this.prezzo = prezzo;
	}
	
	
	public String getCodiceABarre() {
		return codiceABarre;
	}
	public void setCodiceABarre(String codiceABarre) {
		this.codiceABarre = codiceABarre;
	}
	public String getDescrizione() {
		return descrizione;
	}
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	public double getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}
	
	public void applicaSconto () {
		prezzo *= 0.95;
	}


	@Override
	public int hashCode() {
		return Objects.hash(codiceABarre, descrizione, prezzo);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Prodotti other = (Prodotti) obj;
		return Objects.equals(codiceABarre, other.codiceABarre) && Objects.equals(descrizione, other.descrizione)
				&& Double.doubleToLongBits(prezzo) == Double.doubleToLongBits(other.prezzo);
	}


	@Override
	public String toString() {
		return "descrizione = " + descrizione + " , prezzo = " + prezzo;
	}


	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}


	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}
	
	

	
}