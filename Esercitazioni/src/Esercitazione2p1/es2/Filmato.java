package Esercitazione2p1.es2;

import java.util.Scanner;

public class Filmato extends Audio{

	private int luminosita = 0;
	
	public Filmato(String titolo,int durata, int volume, int luminosità) {
		super(titolo, durata,volume);
		if(luminosità>=0)
			this.luminosita = luminosita;
	}

	public void brighter(int bright) {
        if (bright > this.luminosita) this.luminosita = bright;
        else System.out.println("valore inserito inferiore o uguale");
    }
	
	public void darker(int dark) {
        if (dark < this.luminosita) this.luminosita = dark;
        else System.out.println("valore inserito superiore o uguale");
    }
	
	@Override
	public void play() {
		String esclamativi = "";
		String asterischi = "";
		for (int i=0; i<volume; ++i)
			esclamativi+="!";
		
		for (int i=0; i<luminosita; ++i)
			asterischi+="*";
		
		for (int i=0; i<durata; ++i) 
			System.out.println(titolo+esclamativi+asterischi);
			
	}


	@Override
	public void esegui() {
		this.play();
		
	}

	@Override
	public void modificaParametri(Scanner in)
    {
        int luminosita,volume;
        System.out.println("Inserire nuovo valore di Luminosità per " + titolo);
        luminosita = in.nextInt();
        in.nextLine();
        if (this.luminosita > luminosita)
            darker(luminosita);
        else
            brighter(luminosita);
        
        System.out.println("Inserire il nuovo valore di Volume per " + titolo);
        volume = in.nextInt();
        in.nextLine();
        if (this.volume > volume)
            weaker(volume);
        else
            louder(volume);
    
    }
	
}
