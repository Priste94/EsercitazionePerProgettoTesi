package Esercitazione2.es3e4;

public class Garage {
	
	private Vehicle[] veicoli;

	                               
	
	public Garage(Vehicle[] veicoli) {
		super();
		this.veicoli = veicoli;
	}



	public Vehicle[] getVeicoli() {
		return veicoli;
	}



	public void setVeicoli(Vehicle[] veicoli) {
		this.veicoli = veicoli;
	}



	public int repair (Vehicle vehicle) {
		int prezzo = 0;
		
//		if (vehicle instanceof Car) { //non serve questo controllo 
			//vehicle = (Car) vehicle;  //il cast non serve: java fà dynamic binding/late binding!!
			if (vehicle.getTipologia()=="utilitaria")
				prezzo+=30;
			if (vehicle.getTipologia()=="station wagon")
				prezzo+=50;
			if (vehicle.getTipologia()=="SUV")
				prezzo+=100;
      //}
		if (vehicle.isGuasto()) //aggiunta fissa, sia per moto che per auto guaste
			prezzo+=110;
		return prezzo;
		
	}

}
