package EsercitazioniCollectionMap.Esercitazione3p1;

import java.util.Iterator;
import java.util.LinkedList;

public class Esercizio4 {

	public static void main(String[] args) {
		
		
		stampa((insiemeDiInsiemi(4)));

	}
	
	public static LinkedList<LinkedList<Integer>> insiemeDiInsiemi(int n){
		LinkedList<LinkedList<Integer>> ll = new LinkedList<LinkedList<Integer>>();
		
		for (int i=1; i<=n; ++i){	
			LinkedList<Integer> l = new LinkedList<Integer>();
			ll.add(l);
			for (int j=0; j<i; ++j)
				l.add(j);
		}
		
//		for (int i=0; i<n; ++i) {
//			ll.add(i, new LinkedList<Integer>());
//			
//		}
	
		return ll;
		
	}
	
	public static void stampa(LinkedList<LinkedList<Integer>> ll) {
		Iterator<LinkedList<Integer>> i = ll.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}

}
