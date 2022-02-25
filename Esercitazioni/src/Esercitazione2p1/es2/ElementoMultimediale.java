package Esercitazione2p1.es2;

import java.util.Scanner;

public abstract class ElementoMultimediale {
	
	protected String titolo = "senzaNome";


	public ElementoMultimediale(String titolo) {
		super();
		if (titolo != null)		
			this.titolo = titolo;
	}
	
	public abstract void esegui();
	public abstract void modificaParametri(Scanner in);


}
