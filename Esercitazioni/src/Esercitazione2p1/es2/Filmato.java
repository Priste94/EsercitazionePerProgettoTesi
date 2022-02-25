package Esercitazione2p1.es2;

public class Filmato extends Audio{

	private int luminosit� = 0;
	
	public Filmato(String titolo,int durata, int volume, int luminosit�) {
		super(titolo, durata,volume);
		if(luminosit�>=0)
			this.luminosit� = luminosit�;
	}

	public void brighter() {
		if(luminosit�>=1)
			luminosit� -= 1;
	}
	
	public void darker() {
		if(luminosit�<10)  //ho assunto che la luminosit� massima sia a 10
			luminosit� += 1;
	}	
	
	@Override
	public void play() {
		String esclamativi = "";
		String asterischi = "";
		for (int i=0; i<volume; ++i)
			esclamativi+="!";
		
		for (int i=0; i<luminosit�; ++i)
			asterischi+="*";
		
		for (int i=0; i<durata; ++i) 
			System.out.println(titolo+esclamativi+asterischi);
			
	}


	@Override
	public void esegui() {
		this.play();
		
	}

	@Override
	public void cambiaParametri(boolean l, boolean v) {
		if (l)
			super.cambiaParametri(l, v);
		else if (v)
			this.brighter();
		else if (!v)
			this.darker();
		else
			this.weaker();

		
	}
	
	
	
	
	
}
