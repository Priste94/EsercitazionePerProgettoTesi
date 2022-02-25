package Esercitazione2p1.es2;

import java.util.Scanner;

public class Audio extends Riproducibile{
	
	
	public Audio(String titolo, int durata, int volume) {
		super(titolo, durata, volume);		
	}
	

	public void weaker(int weak) {
        this.volume = weak;

    }
	
	public void louder(int loud) {
        this.volume = loud;

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


	 public void modificaParametri(Scanner in) {
		  
	        int volume = 0;
	        System.out.println("Inserire il nuovo valore di Volume per " + titolo);
	        volume = in.nextInt();
	        in.nextLine();
	        if (this.volume > volume)
	            weaker(volume);
	        else
	            louder(volume);
	    }
}
	
	

