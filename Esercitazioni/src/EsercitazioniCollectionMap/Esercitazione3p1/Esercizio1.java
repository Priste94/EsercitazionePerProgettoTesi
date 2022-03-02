package EsercitazioniCollectionMap.Esercitazione3p1;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;

public class Esercizio1 {

	public static void main(String[] args) {
		
//		LinkedList<Integer> l;
//		
//		//es1
//		l = creaRandom(4, 50); //lista di 4 valori da 1 a 50
//		for(int i=0; i<l.size();++i)
//			System.out.println(l.get(i));
//		
//		//parte2
//		Iterator<Integer> it = l.iterator();
//		stampa(it);  //stampa con iteratore
//		
		System.out.println("Esercizio con LinkedList");
		provaEx1();
		System.out.println();
		System.out.println("Esercizio con ArrayList");
		provaEx1A();

	}
	
	//es1
	public static LinkedList<Integer> creaRandom(int n, int max) {
		LinkedList<Integer> l = new LinkedList<Integer>();
		if (n>0 && max>0 && max<=100) 
			for(int i=0; i<n; ++i)
				l.add(i, (int) (Math.random()*max)+1); //valori da 1 a max
		return l;
				
	}
	
	//parte2
	public static void stampa(Iterator<Integer> i) {
		String st="";
		while(i.hasNext()) { 
			st+="<"+i.next()+">";
			if(i.hasNext())
				st+=",";
		}
		System.out.println(st);			
	}
	
	//parte2
	public static void provaEx1() {
		LinkedList<Integer> l = creaRandom(20, 100);
		Iterator<Integer> it = l.iterator();
		stampa(it);
		it = l.iterator();
		Collections.sort(l);//con LinkedList si può ordinare dopo
		stampa(it);
	}
	
	
	
	
	public static ArrayList<Integer> creaRandomA(int n, int max) {
		ArrayList<Integer> l = new ArrayList<Integer>();
		if (n>0 && max>0 && max<=100) 
			for(int i=0; i<n; ++i)
				l.add(i, (int) (Math.random()*max)+1); //valori da 1 a max
		return l;
				
	}

	
	//parte2
	public static void provaEx1A() {
		ArrayList<Integer> l = creaRandomA(20, 100);
		Iterator<Integer> it = l.iterator();
		stampa(it);		
		Collections.sort(l);//mentre su ArrayList prima si deve riordinare poi assegnare iteratore altrimenti errore
		it = l.iterator();
		stampa(it);
	}
	
	
	
	
	
	

}
