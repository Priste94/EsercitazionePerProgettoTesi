package Esercitazione3_ClassiAstratte_Interfacce.Es1;

public class testTridimensionale {

	public static void main(String[] args) {
		
		Cilindro c = new Cilindro(10, 3);
		Parallelepipedo p = new Parallelepipedo(10, 4);
				
		Tridimensionale[] solidi = {c, p};
		
		for (Tridimensionale solido : solidi) //for each
			solido.stampaVolume();;

	}

}
