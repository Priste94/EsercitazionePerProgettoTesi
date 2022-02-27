package Esercitazione3_ClassiAstratte_Interfacce.es1Interfacce;

public class Cubo extends Quadrato implements Elevato{

	public Cubo(int n) {
		super(n);
	
	}

	@Override
	public void perSeStesso() {
		n*= n*n;
	
	}

}
