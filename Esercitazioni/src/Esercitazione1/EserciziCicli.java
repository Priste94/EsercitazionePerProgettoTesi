package Esercitazione1;

import java.util.Scanner;

public class EserciziCicli {

	public static void main(String[] args) {
		
	//test es1 cicli	
		String si = "122 2 34 10 4";
		String si2 = "122 2 31 10 4";
		String si3 = "122 2 -34 10 4";
		
		posEParONo(si);
		System.out.println();
		
		posEParONo(si2);
		System.out.println();
		
		posEParONo(si3);
		System.out.println();
		
		//test es2 cicli
		String si4 = "5 8 9 12 7 6 1";
		String si5 = "5 8 9 14 7 6 1";
		
		mediaDivTre(si4);
		System.out.println();
		
		mediaDivTre(si5);
		System.out.println();
		
		
		//test es 3
		insCaratteri();
		
	}
	
	//es1 cicli
	public static void posEParONo (String si) {
		boolean t = true;
		String appoggio = "";
		int tmp=0;
		
		for (int i=0; i<si.length(); ++i) { //ciclo for per scorrere la stringa
			if (si.charAt(i) != ' ') {  //aggiungo di volta in volta il numero fino a quando non ho uno spazio
				appoggio+=si.charAt(i); 
				if (i==si.length()-1) //necessario altrimenti l' ultimo numero non viene preso in considerazione
					tmp = Integer.parseInt(appoggio);					
			}
			
			else {				
				tmp = Integer.parseInt(appoggio);
				appoggio = ""; //necessario per individuare i numeri negativi r non dare errori
			}			
			if (tmp<0 || tmp%2!=0) //per ogni numero estratto controllo che sia pari e positivo 
				t=false;
		}
		
			if (t)
				System.out.println("tutti positivi e pari");
			else
				System.out.println("NO");
								
	}
	
	
	//es2 cicli
	public static void mediaDivTre (String si) {
		int somma = 0;
		int count = 0;
		String appoggio = "";
		int tmp = 0;
		
		for (int i=0; i<si.length(); ++i) { //ciclo for per scorrere la stringa
			if (si.charAt(i) != ' ') {  //aggiungo di volta in volta il numero fino a quando non ho uno spazio
				appoggio+=si.charAt(i); 
				if (i==si.length()-1) { //necessario altrimenti l' ultimo numero non viene preso in considerazione
						tmp = Integer.parseInt(appoggio);
						if (tmp%3==0) {
							somma+=tmp;
							count+=1;
						}
				}
			}
			
			else 	{
				
				tmp = Integer.parseInt(appoggio);
				if (tmp%3==0) {
					somma+=tmp;
					count+=1;
				}
				
				appoggio = ""; //necessario per separare i numeri					
		    }

		}

		System.out.println(somma);
		System.out.println(count);
		System.out.println((double) somma/count);	 //voglio la media precisa
	}
	
	//es3 cicli
	
	public static void insCaratteri () {
		Scanner scanner = new Scanner(System.in);
		for(int i=0; i<5; ++i) {
			System.out.println("Quanti caratteri vuoi inserire? ");
			int quanti = scanner.nextInt();
			
			for (int j=0; j<quanti; j++) {				      
		        System.out.println("Inserisci il carattere: ");
		        char value = scanner.next().charAt(0);
		        System.out.println("Carattere: "+value);
		        System.out.println();
			}
		}
	}
	
}
