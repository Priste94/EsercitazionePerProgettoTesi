package Esercitazione2p1.es2;

public class Audio extends ElementoMultimediale{
	
	private int durata = 0;
	private int volume = 0;

	public Audio(String titolo,int durata, int volume) {
		super(titolo);
		if(durata>=0)
			this.durata = durata;
		if(volume>=0)
			this.volume = volume;
		
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
		
		for (int i=0; i<durata; ++i) {
			System.out.println(titolo+esclamativi);
		}
	}
	
	
	

}
