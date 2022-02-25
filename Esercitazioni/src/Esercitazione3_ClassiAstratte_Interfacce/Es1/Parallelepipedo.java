package Esercitazione3_ClassiAstratte_Interfacce.Es1;

public class Parallelepipedo extends Tridimensionale{
	
	private double lato;

	public Parallelepipedo(double altezza, double lato) {
		this.altezza=altezza;
		this.lato=lato;
	}
	
	public double area(){
		return lato*lato;
	}

}