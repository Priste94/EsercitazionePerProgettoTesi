package Esercitazione2.es1e2;

public class Employee extends Person{
	
	private int annoAssunzione, stipendio;

	public Employee(String surname, String name, String taxCode, String city, int annoAssunzione, int stipendio) {
		super(surname, name, taxCode, city);
		this.annoAssunzione = annoAssunzione;
		this.stipendio = stipendio;
	}

	public int getAnnoAssunzione() {
		return annoAssunzione;
	}

	public void setAnnoAssunzione(int annoAssunzione) {
		this.annoAssunzione = annoAssunzione;
	}

	public int getStipendio() {
		return stipendio;
	}

	public void setStipendio(int stipendio) {
		this.stipendio = stipendio;
	}
	
	public boolean gainsMore (Employee other) {
		if (other.getStipendio() < this.stipendio)
			return true;
		return false;
					
	}

	@Override
	public String toString() {
		return "Employee [annoAssunzione=" + annoAssunzione + ", stipendio=" + stipendio + "]";
	}
	
	

}
