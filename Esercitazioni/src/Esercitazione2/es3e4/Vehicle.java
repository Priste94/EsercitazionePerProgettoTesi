package Esercitazione2.es3e4;

public class Vehicle {
	protected String targa, marca, modello;
	protected boolean guasto;
	

	public boolean isGuasto() {
		return guasto;
	}

	public Vehicle(String targa, String marca, String modello, boolean guasto) {
		super();
		this.targa = targa;
		this.marca = marca;
		this.modello = modello;
		this.guasto = guasto;
	}
	
	public String getTipologia() {
		return "ciao";
	}
	
	
	

}
