package Esercitazione2.es3e4;

public class TestVehicles {

	public static void main(String[] args) {
		Car c1, c2;
		Motocycle m1, m2;
		
		c1 = new Car("AG707PJ", "BMW", "2001", false, "SUV" );
		c2 = new Car("BW567AZ", "FIAT", "1990", false, "utilitaria" );
		m1 = new Motocycle("CV287PK", "PIAGGIO", "1982", false, 125);
		m2 = new Motocycle("NM560QW", "KTM", "2015", false, 250);
		
		Vehicle [] veicoli = {c1, c2, m1, m2};
		veicoli[1].setGuasto(true);
		veicoli[2].setGuasto(true);
		
		for (int i=0; i<veicoli.length; ++i)
			if(veicoli[i].isGuasto())
				System.out.println(veicoli[i].getTarga());
		
	}

}
