package EsercitazioniCollectionMap.Esercitazione3p1;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.regex.Pattern;

public class Esercizio2 extends Esercizio1{

	public static void main(String[] args) {
		

		
		provaEx2();
		

	}
	
	//es1
		public static LinkedList<Integer> creaRandom(int n, int max) {
			LinkedList<Integer> l = new LinkedList<Integer>();
			if (n>0 && max>0 && max<=100) 
				for(int i=0; i<n; ++i)
					l.add(i, (int) (Math.random()*max)+1); //valori da 1 a max
			Collections.sort(l);
			return l;
					
		}
		
		public static LinkedList<Integer> parseString(LinkedList<String> a) {
			LinkedList<Integer> l = new LinkedList<Integer>();
			Iterator<String> i = a.iterator();
			String s="";

			
			while (i.hasNext()) {
				s = i.next();
				if (s!=null) {
					boolean isNumber = Pattern.matches("[0-9]+", s);
					if(isNumber) {
						l.add(Integer.parseInt(s));
					}
				}
			}
			
			Collections.sort(l);
			return l;											
		}
		
		//parte2
		public static void provaEx2() {
			LinkedList<Integer> l = creaRandom(20, 100);
			Iterator<Integer> it = l.iterator();
			stampa(it);
			
			LinkedList<String> s = new LinkedList<String>();
			
			s.add("7");
			s.add("3");
			s.add("2");
			s.add("9");
			s.add("19");
			s.add("21");
			s.add("2");
			s.add("66");
			s.add("CIAO	");
			s.add(null);
			
			System.out.println(parseString(s));
		}

}
