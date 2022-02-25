package Esercitazione2p1.es2;

public class Audio extends Riproducibile{
	
	
	public Audio(String titolo, int durata, int volume) {
		super(titolo, durata, volume);		
	}
	

	public void weaker() {
		if(volume>=1)
			volume -= 1;
	}
	
	public void louder() {
		if(volume<10)  //ho assunto che il volume massimo sia a 10
			volume += 1;
	}
	@Override
	public void play() {
		String esclamativi = "";
		for (int i=0; i<volume; ++i)
			esclamativi+="!";
		
		for (int i=0; i<durata; ++i) 
			System.out.println(titolo+esclamativi);
		
	}

	@Override
	public void esegui() {
		this.play();  //senza questo this non mi andava correttamente
		
	}


	@Override
	public void cambiaParametri(boolean l, boolean v) {
		if (l)
			this.louder();
		else
			this.weaker();
		
	}
}
	
	

