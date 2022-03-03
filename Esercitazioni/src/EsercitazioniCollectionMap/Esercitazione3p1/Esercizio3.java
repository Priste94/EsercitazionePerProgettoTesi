package EsercitazioniCollectionMap.Esercitazione3p1;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class Esercizio3 {

	public static void main(String[] args) {
		
		provaEx3();

		
	}

	public static LinkedList <Integer> mergeOrdinato(Iterator<Integer> a, Iterator<Integer> b) {
		
		LinkedList<Integer> l = new LinkedList<Integer>();
		LinkedList<Integer> l1 = new LinkedList<Integer>();
		int i1=0, i2=0;
		while(a.hasNext())
				l.add(a.next());
		while(b.hasNext())
			l1.add(b.next());
		l.addAll(l1);
		Collections.sort(l);
		
		return l;
	}
	
	public static void provaEx3() {
		LinkedList<Integer> l1 = new LinkedList<Integer>();
		LinkedList<Integer> l2 = new LinkedList<Integer>();
		l1.add(100);
		l1.add(200);
		l1.add(300);
		l2.add(1);
		l2.add(2);
		l2.add(3);
		l2.add(1);
		
		
		Iterator<Integer> i1 = l1.iterator();
		Iterator<Integer> i2 = l2.iterator();
		//System.out.println(l1);
		System.out.println(mergeOrdinato(i1, i2));
		
		i1 = l1.iterator();
		i2 = l2.iterator();
		
		System.out.print("il primo vettore: [");
		while(i1.hasNext()) {
			System.out.print(i1.next());
			if (i1.hasNext())
				System.out.print(",");
		}
		
		
		System.out.println("]");
		
		System.out.print("il secondo vettore: [");
		while(i2.hasNext()) {
			System.out.print(i2.next());
			if (i2.hasNext())
				System.out.print(",");
		}
		System.out.println("]");
	}
}

