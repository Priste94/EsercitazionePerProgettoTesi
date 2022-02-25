package Esercitazione2p1.es2;

public class Immagine extends ElementoMultimediale{
	
	private int luminosità = 0;

	public Immagine(String titolo, int luminosità) {
		super(titolo);	
		this.luminosità=luminosità;
	}
	
	public void brighter() {
		if(luminosità>=1)
			luminosità -= 1;
	}
	
	public void darker() {
		if(luminosità<10)  //ho assunto che la luminosità massima sia a 10
			luminosità += 1;
	}	
	
	public void show() {

		String asterischi = "";		
		for (int i=0; i<luminosità; ++i)
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
