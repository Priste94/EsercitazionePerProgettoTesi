package Esercitazione3_ClassiAstratte_Interfacce.Es1;

public class Cilindro extends Tridimensionale{
	
	private double raggio;

	public Cilindro(double altezza, double raggio) {
		this.altezza=altezza;
		this.raggio=raggio;		
	}
	
	public double area(){
		return raggio*raggio*Math.PI;
	}
	


}
