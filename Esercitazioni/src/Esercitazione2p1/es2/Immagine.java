package Esercitazione2p1.es2;

import java.util.Scanner;

public class Immagine extends ElementoMultimediale{
	
	private int luminosita = 0;

	public Immagine(String titolo, int luminosita) {
		super(titolo);	
		this.luminosita=luminosita;
	}
	
	public void brighter(int bright) {
        if (bright > this.luminosita) this.luminosita = bright;
        else System.out.println("valore inserito inferiore o uguale");
    }
	
	public void darker(int dark) {
        if (dark < this.luminosita) this.luminosita = dark;
        else System.out.println("valore inserito superiore o uguale");
    }
	
	public void show() {

		String asterischi = "";		
		for (int i=0; i<luminosita; ++i)
			asterischi+="*";
	
		System.out.println(titolo+asterischi);
				
	}

	@Override
	public void esegui() {
		this.show();
		
	}


	public void modificaParametri(Scanner in)
    {
        int luminosita;
        System.out.println("Inserire nuovo valore di Luminosità per " + titolo);
        luminosita = in.nextInt();
        in.nextLine();
        if (this.luminosita > luminosita)
            darker(luminosita);
        else
            brighter(luminosita);
    }	

}
