package Esercitazione2.es5;

import java.util.Scanner;

public class Question {
	protected String domanda;
	protected String risposta;
	protected int punteggio;
	
	public Question(String domanda, String risposta, int punteggio) {
		super();
		this.domanda = domanda;
		this.risposta = risposta;
		this.punteggio = punteggio;
	}


	public int ask() {
		Scanner scanner = new Scanner(System.in);
		System.out.println(domanda);
		String rispostaUtente;
		while(!scanner.hasNext() || scanner == null) {
			System.out.println("metti una risposta in formato stringa");
			rispostaUtente = scanner.next();
			} 
		rispostaUtente = scanner.next();
		if (rispostaUtente.equalsIgnoreCase(risposta))
			return punteggio;
		return 0;
	}
	
	
	
}
