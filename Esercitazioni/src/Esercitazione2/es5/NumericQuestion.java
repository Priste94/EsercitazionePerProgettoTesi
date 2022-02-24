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
		int rispostaUtente;

		System.out.println("Rispondi con un valore intero!");
		rispostaUtente = scanner.nextInt();
		
			
		if (rispostaUtente == risposta)			
			return punteggio;
		return 0;
	}
	
}
