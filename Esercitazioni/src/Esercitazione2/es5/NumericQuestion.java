package Esercitazione2.es5;

import java.util.Arrays;
import java.util.Scanner;

public class NumericQuestion extends Question{
	protected int risposta;

	public NumericQuestion(String domanda, int risposta, int punteggio) {
		super(domanda, null, punteggio);
		this.risposta = risposta;
		
	}

	@Override
	public int ask() {
		Scanner scanner = new Scanner(System.in);
		System.out.println(domanda);
		String scelta;
		int rispostaUtente;

		while(!scanner.hasNextInt() || scanner == null) {
			System.out.println("Rispondi con un valore intero!");
			scelta = scanner.next();
			} 
		scelta = scanner.next();

		rispostaUtente = Integer.parseInt(scelta);
		
			
		if (rispostaUtente == risposta)			
			return punteggio;
		return 0;
	}
	
}
