package Esercitazione2.es5;

import java.util.Arrays;
import java.util.Scanner;

public class QuestionYesNo extends Question{



	public QuestionYesNo(String domanda, String risposta, int punteggio) {
		super(domanda, risposta, punteggio);
	}

	@Override
	public int ask() {
		Scanner scanner = new Scanner(System.in);
		System.out.println(domanda);
		String rispostaUtente;
		do {
			System.out.println("Rispondi solo con si o no!");
			rispostaUtente = scanner.next();
		}
			while (!rispostaUtente.equalsIgnoreCase("si") && !rispostaUtente.equalsIgnoreCase("no"));
				
		if (rispostaUtente.equalsIgnoreCase(risposta))			
			return punteggio;
		return 0;
	}
	

}
