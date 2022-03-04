package Esercitazione2.es1e2;
import java.time.LocalDate;

public class Person {
	private String surname, name, taxCode, city;
	
	public Person() {}
	

	public Person(String surname, String name, String taxCode, String city) {
		super();
	 
		this.surname = surname;
		this.name = name;
		if (taxCode!=null) 
			this.taxCode = taxCode;
		else
			this.taxCode = "";
		this.city = city;
	}
	

	public String getSurname() {
		return surname;
	}

	public String toString() {
		return "Person [surname=" + surname + ", name=" + name + ", taxCode=" + taxCode + ", city=" + city
				+ ", anni=" + quantiAnni() + ", nato nel=" + bornYear() + "]";
	}


	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTaxCode() {
		return taxCode;
	}

	public void setTaxCode(String taxCode) {
		this.taxCode = taxCode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	//metodo creato per errore
	public int quantiAnni() {
		String anniS = "";

		LocalDate current_date = LocalDate.now();
		int current_Year = current_date.getYear();
		if (!taxCode.isEmpty()) {
			anniS += taxCode.charAt(6);
			anniS += taxCode.charAt(7);
		

		if (Integer.parseInt(anniS)>22) //ho messo 23 come valore fisso, ma andrebbe aggiornato sempre con l' anno attuale
			anniS = "19" + anniS;       // in più con questa logica mi limito a calcolare l' età di persone fino ad un massimo di
		else							//99 anni. Per semplicità non ho tenuto conto di giiorno e mese di nascita
			anniS ="20" + anniS;
		
		
		return (current_Year-(Integer.parseInt(anniS)));
		}
		else return 1000;
	}
	
	public int bornYear() {
		String anniS = "";
		if (!taxCode.isEmpty()) {
			anniS += taxCode.charAt(6);
			anniS += taxCode.charAt(7);
			return Integer.parseInt(anniS);
		}
		else return 1000;
	}

}
