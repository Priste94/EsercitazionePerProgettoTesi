package Esercitazione2.es5;

import java.util.Scanner;

public class MultipleQuestion extends NumericQuestion{
	private int opzioniDisponibili;
	String[] risposte;
	

	public MultipleQuestion(String domanda, int risposta, int punteggio, int opzioniDisponibili, String[] risposte) {
		super(domanda, risposta, punteggio);
		this.opzioniDisponibili = opzioniDisponibili;
		this.risposte = risposte;
		
	}

	@Override
	public int ask() {
		Scanner scanner = new Scanner(System.in);
		System.out.println(domanda);
		int rispostaUtente;
		String scelta;
	
		for (int i=0; i<opzioniDisponibili; ++i) {
			System.out.print(i+1 +")");
			System.out.println(risposte[i]);
		}
		
		do {
			while(!scanner.hasNextInt() || scanner == null) {
				System.out.println("Rispondi con un valore intero inferiore o uguale a: "+opzioniDisponibili);
				scelta = scanner.next();
				} 
			scelta = scanner.next();
			rispostaUtente = Integer.parseInt(scelta);
		}
			while (rispostaUtente > opzioniDisponibili);
	    
		if (rispostaUtente == risposta)			
			return punteggio;
		return 0;
	}

}
