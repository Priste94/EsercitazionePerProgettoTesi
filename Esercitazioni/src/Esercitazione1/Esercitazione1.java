package Esercitazione1;

public class Esercitazione1 {
	

	public static void main(String[] args) {
		//test es1 array
		int [] ai1 = {1,2,3,4,5,6,7,8,9,10};
		stampaPrimoUltimo(ai1);
		System.out.println();
		
		int [] ai2 = {1,2,3,4,5,6,7,8,9};
		stampaPrimoUltimo(ai2);
		System.out.println();
		
		//test es2 array
		int [] ai3 = {1,2,3,3,1};		
		pariEDispari(ai3);		
		System.out.println();
		

	}
	//es1 array
	public static void stampaPrimoUltimo(int[] ai) {
		if (ai.length%2==0) //se la lunghezza � pari
			for (int i=0; i<ai.length/2; ++i) {
				System.out.println(ai[i]);
				System.out.println(ai[ai.length-1-i]);
			}
		else {              //se la lunghezza � dispari
			for (int i=0; i<ai.length/2; ++i) {
				System.out.println(ai[i]);
				System.out.println(ai[ai.length-1-i]);
			}
			System.out.println(ai[ai.length/2]);
		}
			
	}
	
	//es2 array
	public static void pariEDispari (int[] ai) {
		int sommaPari=0;
		int sommaDispari=0;
		
			for (int i=0; i<ai.length; ++i) {
				if(i%2==0)
					sommaPari+=ai[i];
				else
					sommaDispari+=ai[i];
			}
		
		System.out.println(sommaPari);
		System.out.println(sommaDispari);
		
		if (sommaPari==sommaDispari)
			System.out.println("Pari e dispari uguali");
		else
			System.out.println("Pari e dispari diversi");
	}				
}
