package Esercitazione_Thread;

public class Cassetto {
	private static int denaro=0;
	boolean ritirati = true; //il padre non può aggiungere se il figlio non ha ritirato prima
	boolean unaVoltaAlMese = false; // per simulare il ritiro una volta al mese
	int mensilita=0;
	
	public synchronized void deposito(int deposito) throws InterruptedException {
		try { while(denaro>0) {
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
		//Thread.sleep(2000);	//simulo il passare di un mes
	}

	public synchronized void prelievo() {
		int cifra=(int) ((Math.random()*70)+1);

		try { while(denaro==0)  {
				wait();
		}
		
		if (denaro<=cifra)
			cifra = denaro;

		while (denaro>0&&denaro>=cifra) {
			
			
			if (denaro>=cifra) {
	
				denaro-=cifra;
				System.out.println("Effettuato un ritiro di: "+cifra);
				
				
				ritirati = true;
				//unaVoltaAlMese = true;
			}
			if (denaro!=1) {
				cifra = (int) ((Math.random()*100)+1);

				while (denaro<=cifra&&denaro>0)
					cifra = (int) ((Math.random()*100)+1);
			}
				else cifra = 1;
			
			
			
			
		}

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
