package Esercitazione3_ClassiAstratte_Interfacce.es2Interfacce;

public class DistributoreDiBenzina implements Comparable{
	private String citta, proprietario;
	private int capacita, contenuta;
	
	private int costo_litro=1,costo_vendita=2,bilancio=0;

	public DistributoreDiBenzina(String citta, String proprietario, int capacita) { //inizialmente ogni distributore non contiene benzina
		super();
		this.citta = citta;
		this.proprietario = proprietario;
		this.capacita = capacita;
		this.contenuta = capacita;
		this.bilancio -= capacita *costo_litro;
	}

	
	public String getCitta() {
		return citta;
	}


	public void setCitta(String citta) {
		this.citta = citta;
	}


	public String getProprietario() {
		return proprietario;
	}


	public void setProprietario(String proprietario) {
		this.proprietario = proprietario;
	}


	public int getCapacita() {
		return capacita;
	}


	public void setCapacita(int capacita) {
		this.capacita = capacita;
	}


	public int getContenuta() {
		return contenuta;
	}


	public void setContenuta(int contenuta) {
		this.contenuta = contenuta;
	}


	public int getCosto_litro() {
		return costo_litro;
	}


	public void setCosto_litro(int costo_litro) {
		this.costo_litro = costo_litro;
	}


	public int getCosto_vendita() {
		return costo_vendita;
	}


	public void setCosto_vendita(int costo_vendita) {
		this.costo_vendita = costo_vendita;
	}


	public int getBilancio() {
		return bilancio;
	}


	public void setBilancio(int bilancio) {
		this.bilancio = bilancio;
	}


	@Override
	public int compareTo(DistributoreDiBenzina d) { //differenza di capacità tra 2 distributori
		return (this.capacita-d.capacita);
	}
	
	public void rifornisciDistributore(){

		if(capacita - contenuta > 0){
			bilancio -= (capacita - contenuta)*costo_litro;
			contenuta = capacita;
		}
	}
	
	public void erogazioneCarburante(int euro) {
		bilancio += euro*costo_vendita;
		contenuta -= euro/costo_vendita;
			
		
	}
	
	
}
