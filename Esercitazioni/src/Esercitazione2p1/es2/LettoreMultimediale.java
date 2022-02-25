package Esercitazione2p1.es2;

import java.util.Scanner;

public class LettoreMultimediale {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		ElementoMultimediale[] em = new ElementoMultimediale[5];
		int scelta = 0;
		String titolo = "";
		int durata = 0;
		int volume = 0;
		int luminosità = 0;
		String supporto = "";
		
		for (int i=0; i<2; i++) {
			do {
				System.out.println("Che tipo di elemento multimediale vuoi inserire? (indica come un numero da 1 a 3)");
				System.out.println("1) Audio");
				System.out.println("2) Filmato");
				System.out.println("3) Immagine");
				scelta = scanner.nextInt(); }
				while (scelta > 3);
				if (scelta==1) {
					
					System.out.println("titolo? ");
					titolo = scanner.next();						
					System.out.println("durata? ");
					durata = scanner.nextInt();
					System.out.println("volume? ");
					volume = scanner.nextInt();
					em[i] = new Audio(titolo, durata, volume);
				}
				
				if (scelta==2) {
					
					System.out.println("titolo? ");
					titolo = scanner.next();						
					System.out.println("durata? ");
					durata = scanner.nextInt();
					System.out.println("volume? ");
					volume = scanner.nextInt();
					System.out.println("luminosità? ");
					luminosità = scanner.nextInt();
					em[i] = new Filmato(titolo, durata, volume, luminosità);
				}
				
				if (scelta==3) {
					
					System.out.println("titolo? ");
					titolo = scanner.next();						
					System.out.println("luminosità? ");
					luminosità = scanner.nextInt();
					em[i] = new Immagine(titolo, luminosità);
				}
						
		}
				
		do {
			System.out.println("Quale file multimediale vuoi eseguire? (indica come un numero da 1 a 5)");
			for (int i=0; i<em.length; i++) 
				if (em[i]!=null)
					System.out.println((i+1)+") "+em[i].titolo);
			scelta = scanner.nextInt();
			if (scelta > 0) { 
				if (em[scelta-1]!=null)
					em[scelta-1].esegui();	
				System.out.println("Vuoi modificarne i parametri? (si o no)");
				supporto = scanner.next();
				//if (supporto.equalsIgnoreCase("si"))
				// programma da terminare
					
					
			}
		}
			while (scelta != 0);

	}

}
