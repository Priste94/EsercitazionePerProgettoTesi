package Esercitazione3_ClassiAstratte_Interfacce.Es2;

public class Moneta {
	
	private int ht;
	
	public Moneta() {
		this.ht = 0;
	}
	
	public void lancio() {
		this.ht = (int) (Math.random() *2);
	}

	
	public String getHorT() {
		if (ht == 0)
			return "testa";
		return "croce";
	}
	
	
	

}
