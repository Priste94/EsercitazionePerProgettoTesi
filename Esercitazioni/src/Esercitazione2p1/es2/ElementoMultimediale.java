package Esercitazione2p1.es2;

public abstract class ElementoMultimediale {
	
	protected String titolo = "senzaNome";

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		if (titolo!= null)
			this.titolo = titolo;
	}

	public ElementoMultimediale(String titolo) {
		super();
		if (titolo!= null)		
			this.titolo = titolo;
	}
	
	public abstract void play();

}
