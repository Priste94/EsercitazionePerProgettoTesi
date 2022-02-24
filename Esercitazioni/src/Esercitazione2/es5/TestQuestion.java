package Esercitazione2.es5;

public class TestQuestion {

	public static void main(String[] args) {
		
		Question q1 = new Question("Di che colore era il cavallo bianco di Napoleone? ", "Bianco", 1);
		Question q2 = new Question("Qui, Quo ...?", "Qua", 1);
		NumericQuestion nq1 = new NumericQuestion("In che anno avvenne la rivoluzione francese?", 1789, 2);
		NumericQuestion nq2 = new NumericQuestion("Da quanti secondi è composto un minuto?", 60, 1);
		NumericQuestion nq3 = new NumericQuestion("numero di Valentino Rossi", 46, 2);
		NumericQuestion nq4 = new NumericQuestion("In che anno ci fù l'unità d'Italia?", 1861, 3);
		MultipleQuestion mq1 = new MultipleQuestion("Squadra di calcio più forte?", 2, 3, 3, new String[] {"Milan", "Juventus", "Inter"});
		QuestionYesNo qyn1 = new QuestionYesNo("Questo programma funzionerà?" , "si", 3);
		
		Question[] questions = {q1, q2, nq1, nq2, nq3, nq4, mq1, qyn1};
		int punteggio = 0;
		int totale = 0;
		for (int i=0; i<questions.length; ++i) {
			punteggio+=questions[i].ask();
			totale+=questions[i].punteggio;
		}
		System.out.println("Punteggio ottenuto: "+punteggio+" su "+totale);
	}

}
