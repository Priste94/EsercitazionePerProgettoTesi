package Esercitazione3_ClassiAstratte_Interfacce.Es2;

public class Dado {
	
	private int numero;

	public Dado() {
		this.numero = 1;
	}
	
	public void lancio() {
		
		numero = (1+ (int) (Math.random()*6));
		
	}

	public int getNumero() {
		return numero;
	}

}
