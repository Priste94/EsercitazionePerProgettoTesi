package Esercitazione3_ClassiAstratte_Interfacce.Es1;

public abstract class Tridimensionale {
	
	protected double altezza;

	abstract double area();
	
	public double volume(){
	     return altezza*area();
	}

	public  void stampaVolume() {
		System.out.println(volume());
	}

}
