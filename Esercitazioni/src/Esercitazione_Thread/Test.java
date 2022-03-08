package Esercitazione_Thread;

public class Test {
	
	public static class Genitore extends Thread{
		private Cassetto c;
		int paghetta=0;
		//
		
		
		
		public Genitore(Cassetto c) {
			super();
			this.c = c;
		}

		public void riponiSoldi() throws InterruptedException {
			paghetta = (int) ((Math.random()*100)+1);
			c.deposito(paghetta);
			
		}
		
		public void run() {
			try {
				riponiSoldi();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}
	
	
	
	public static class Figlio extends Thread{
		private Cassetto c;
		int paghetta=0;
		
		
		
		public Figlio(Cassetto c) {
			super();
			this.c = c;
		}

		public void prendiSoldi() {
;
			c.prelievo();
			
		}
		
		public void run() {
			prendiSoldi();

		}

	}
	
	

	public static void main(String[] args) {
		
		Cassetto c = new Cassetto();
		
		Genitore g1 = new Genitore(c) ;
		Genitore g2 = new Genitore(c) ;
		Figlio f1 = new Figlio(c);
		Figlio f2 = new Figlio(c);


		g1.start();		
		f1.start();
		g2.start();
		f2.start();
		


		try {
			g1.join();
			f1.join();
			g2.join();
			f2.join();
		} catch (Exception e) {}
		
		c.stampaDenaro();
		
	}

}
