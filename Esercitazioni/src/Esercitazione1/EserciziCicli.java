package Esercitazione1;

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
		
	}
	
	public static void posEParONo (String si) {
		boolean t = true;
		String appoggio = "";
		int tmp=0;
		
		for (int i=0; i<si.length(); ++i) { //ciclo for per scorrere la stringa
			if (si.charAt(i) != ' ') {  //aggiungo di vola in volta il numero fino a quando non ho uno spazio
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
	
}
