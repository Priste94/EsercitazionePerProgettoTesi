package Esercitazione2p1.es2;

public abstract class Riproducibile extends ElementoMultimediale{
	
	int durata, volume;

	public Riproducibile(String titolo,int durata, int volume) {
		super(titolo);
		if(durata>=0)
			this.durata = durata;
		if(volume>=0)
			this.volume = volume;
		
	}

	public abstract void play();

}
