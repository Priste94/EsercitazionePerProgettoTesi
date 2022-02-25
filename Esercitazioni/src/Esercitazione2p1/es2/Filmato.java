package Esercitazione2p1.es2;

public class Filmato extends Audio{

	private int luminosità = 0;
	
	public Filmato(String titolo,int durata, int volume, int luminosità) {
		super(titolo, durata,volume);
		if(luminosità>=0)
			this.luminosità = luminosità;
	}

	public void brighter() {
		if(luminosità>=1)
			luminosità -= 1;
	}
	
	public void darker() {
		if(luminosità<10)  //ho assunto che la luminosità massima sia a 10
			luminosità += 1;
	}	
	
	@Override
	public void play() {
		String esclamativi = "";
		String asterischi = "";
		for (int i=0; i<volume; ++i)
			esclamativi+="!";
		
		for (int i=0; i<luminosità; ++i)
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
