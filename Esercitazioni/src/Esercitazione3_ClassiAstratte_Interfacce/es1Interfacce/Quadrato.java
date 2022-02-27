package Esercitazione3_ClassiAstratte_Interfacce.es1Interfacce;

public class Quadrato implements Elevato{

	public Quadrato(int n) {
		super();
		this.n = n;
	}

	int n;

	@Override
	public void perSeStesso() {
		n*=n;
			
	}

	public int getN() {
		return n;
	}
	


}
