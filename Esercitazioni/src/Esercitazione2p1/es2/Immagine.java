package Esercitazione2p1.es2;

public class Immagine extends ElementoMultimediale{
	
	private int luminosit� = 0;

	public Immagine(String titolo, int luminosit�) {
		super(titolo);	
		this.luminosit�=luminosit�;
	}
	
	public void brighter() {
		if(luminosit�>=1)
			luminosit� -= 1;
	}
	
	public void darker() {
		if(luminosit�<10)  //ho assunto che la luminosit� massima sia a 10
			luminosit� += 1;
	}	
	
	public void show() {

		String asterischi = "";		
		for (int i=0; i<luminosit�; ++i)
			asterischi+="*";
	
		System.out.println(titolo+asterischi);
				
	}

	@Override
	public void esegui() {
		this.show();
		
	}

	@Override
	public void cambiaParametri(boolean l, boolean v) {
		if (l)
			this.brighter();
		else
			this.darker();
		
	}	

}
