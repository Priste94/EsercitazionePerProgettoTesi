package Esercitazione1;

public class Esercitazione1 {
	

	public static void main(String[] args) {
		
		int [] ai1 = {1,2,3,4,5,6,7,8,9,10};
		stampaPrimoUltimo(ai1);
		System.out.println();
		
		int [] ai2 = {1,2,3,4,5,6,7,8,9};
		stampaPrimoUltimo(ai2);

	}
	
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

}
