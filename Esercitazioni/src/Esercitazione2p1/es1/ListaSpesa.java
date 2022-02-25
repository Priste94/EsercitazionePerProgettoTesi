package Esercitazione2p1.es1;

import java.util.GregorianCalendar;
import java.util.Scanner;

public class ListaSpesa {
	
	
	public static void main(String[] args) {
				
		ProdottiAlimentari p1 = new ProdottiAlimentari("33v6y6hr23cr", "1 kg di pane di grano duro", 3.40, new GregorianCalendar(2022, 2, 26));
		ProdottiAlimentari p2 = new ProdottiAlimentari("22f123v5f232", "1 litro di latte", 1.20, new GregorianCalendar(2022, 02, 29));
		ProdottiAlimentari p3 = new ProdottiAlimentari("22f123v5f232", "1 litro di latte", 1.20, new GregorianCalendar(2022, 03, 15));
		ProdottiNonAlimentari p4 = new ProdottiNonAlimentari("3487tfbgsdk4", "Catene per auto", 31.00, null);
		ProdottiNonAlimentari p5 = new ProdottiNonAlimentari("67buugwefrt5", "Ammorbidente da 10 litri", 16.90, "plastica");
		
		Prodotti[] prodottiDisponibili = {p1, p2, p3, p4, p5};
		Scanner scanner = new Scanner(System.in);
		
		double somma = 0;
		String scelta = "";
		do {
		System.out.println("Dimmi cosa vuoi acquistare digitando un numero alla volta tra 0 e "+(prodottiDisponibili.length-1));
		for (int i=0; i<prodottiDisponibili.length; ++i)
			System.out.println(i+ " - "+prodottiDisponibili[i].toString());
		int rispostaUtente = scanner.nextInt();
		if (rispostaUtente>=0 && rispostaUtente<prodottiDisponibili.length) {
			prodottiDisponibili[rispostaUtente].applicaSconto();
			somma += prodottiDisponibili[rispostaUtente].prezzo;
			System.out.println(somma);
		}
		do {
		System.out.println("Vuoi acquistare altro? (rispondi si o no)");	
		scelta = scanner.next();
		}
		while (!scelta.equalsIgnoreCase("si") && !scelta.equalsIgnoreCase("no"));
		}
		while (!scelta.equalsIgnoreCase("no"));
		
		System.out.println("Il totale è: "+somma);
		
	}
		

}
