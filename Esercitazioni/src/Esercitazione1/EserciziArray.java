package Esercitazione1;

public class EserciziArray {
	

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
		
		//test es3 array
		int [] ai4 = {1,1,2,2,3,3,3};
		treConsecutivi(ai4);
		System.out.println();
		
		//test es4 array
		String [] as1 = {"Ciao", "amico", "mio", "come", "stai?"};
		String [] as2 = {"Hi", "my", "frind", "come", "on!"};
		String [] as3 = {"Array di", "stringhe", "senza", "parole", "uguali"};
		equalsString(as1, as2);
		equalsString(as1, as3);
		System.out.println();


	}
	//es1 array
	public static void stampaPrimoUltimo(int[] ai) {
		if (ai.length%2==0) //se la lunghezza è pari
			for (int i=0; i<ai.length/2; ++i) {
				System.out.println(ai[i]);
				System.out.println(ai[ai.length-1-i]);
			}
		else {              //se la lunghezza è dispari
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
		
		if (sommaPari==sommaDispari)
			System.out.println("Pari e dispari uguali");
		else
			System.out.println("Pari e dispari diversi");
	}
	
	//es3 array
	public static void treConsecutivi (int[] ai) {
		
		int contatore=1;
		int tmp=-1;
		for (int i=0; i<ai.length && contatore < 3; ++i) {
			if (ai[i]==tmp) {
				contatore++;
				tmp = ai[i];
				}		
			else {
				contatore=1;
				tmp = ai[i];
			}
		}
		if (contatore==3)
			System.out.println("Tre valori consecutivi uguali");
		else 
			System.out.println("NO");
	}
	
	//es4 array
	public static void equalsString (String[] as1, String[] as2) {
		/*se non sapessi da specifica che sono obbligatoriamente
		  di 5 elementi, farei dei controlli sulle dimensioni*/
		boolean eq=false;
		for (int i=0; i<as1.length; ++i) 
			for (int j=0; j<as2.length; ++j) 
				if(as1[i].equals(as2[j]))
						eq=true;
		if(eq==true)
			System.out.println("OK");
		else
			System.out.println("KO");		
						
	}
	
}
