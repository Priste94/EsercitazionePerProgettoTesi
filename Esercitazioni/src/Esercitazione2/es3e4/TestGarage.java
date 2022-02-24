package Esercitazione2.es3e4;

public class TestGarage {

	public static void main(String[] args) {
		Car c1, c2, c3, c4;
		Motocycle m1, m2;
		
		c1 = new Car("AG707PJ", "BMW", "2001", true, "SUV" );
		c2 = new Car("BW567AZ", "FIAT", "1990", false, "utilitaria" );
		c3 = new Car("CV287PK", "AUDI", "1982", true, "station wagon");
		c4 = new Car("NM560QW", "alfa romeo", "2015", false, "station wagon");
		m1 = new Motocycle("RT290ER", "PIAGGIO", "1982", false, 125);
		m2 = new Motocycle("VB347NM", "KTM", "2015", false, 250);
		
		Vehicle [] veicoli = {c1, c2, c3, c4, m1, m2}; //conformità di tipo
		veicoli[1].guasto = true;
		veicoli[2].guasto = true;
		veicoli[5].guasto = true;
		
		Garage garage = new Garage(veicoli);
		
				
		for (Vehicle veicolo : garage.getVeicoli()) 			
			System.out.println(garage.repair(veicolo));

	}

}
