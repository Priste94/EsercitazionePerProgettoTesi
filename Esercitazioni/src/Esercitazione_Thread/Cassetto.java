package Esercitazione_Thread;

public class Cassetto {
	private static int denaro=0;
	boolean ritirati = true; //il padre non può aggiungere se il figlio non ha ritirato prima
	boolean unaVoltaAlMese = false; // per simulare il ritiro una volta al mese
	
	public synchronized void deposito(int deposito) {
		try { while(!ritirati) {
			wait();
		}
		
			ritirati = false;
			
			denaro+=deposito;
			System.out.println("Effettuato un deposito di: "+deposito);
			unaVoltaAlMese=false;
			notifyAll();
	
		} catch(Exception e) {
			System.out.println();
		}
	}

	public synchronized void prelievo(int cifra) {
//		if(denaro>cifra) {
		try { while(unaVoltaAlMese||denaro<cifra)  {
			System.out.println("Aspetto");
				wait();
		}
		
		
			
			
			denaro-=cifra;
			System.out.println("Effettuato un ritiro di: "+cifra);
			
			
			ritirati = true;
			unaVoltaAlMese = true;
			notifyAll();
			
			
		} catch(Exception e) {
			System.out.println();
		}
//		}
//		int presi=denaro;
//		denaro=0;
//		System.out.println("Effettuato un ritiro di: "+presi);
//		return presi;
	
	}
	
	public static void stampaDenaro() {
		System.out.println("il denaro è: "+denaro);
	}
	
}
