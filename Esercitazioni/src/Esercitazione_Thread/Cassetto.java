package Esercitazione_Thread;

public class Cassetto {
	private static int denaro=0;
	
	public synchronized void deposito(int deposito) throws InterruptedException {
		try { while(denaro>0) {
			wait();
		}
	
			denaro+=deposito;
			System.out.println("Effettuato un deposito di: "+deposito);

			notifyAll();
	
		} catch(Exception e) {
			System.out.println();
		}
	
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
	
	}
	
	public static void stampaDenaro() {
		System.out.println("il denaro è: "+denaro);
	}
	
}
