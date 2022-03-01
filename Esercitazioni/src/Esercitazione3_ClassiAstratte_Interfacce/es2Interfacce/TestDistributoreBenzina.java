package Esercitazione3_ClassiAstratte_Interfacce.es2Interfacce;

import java.util.Scanner;
import java.util.ArrayList;

public class TestDistributoreBenzina {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		//ArrayList T=new ArrayList(3);
		DistributoreDiBenzina db1 = new DistributoreDiBenzina("Esso","Giuseppe",500);
		DistributoreDiBenzina db2 = new DistributoreDiBenzina("Api","Francesco",300);
		DistributoreDiBenzina db3 = new DistributoreDiBenzina("Q8","Anna",800);
		
		DistributoreDiBenzina[] T = {db1, db2, db3};
		
		int i,ch=0,var,scelta2=0, scelta3=0;
		String scelta="";
		System.out.println("Seleziona il distributore");
		for(i=0;i < T.length;i++)
		   System.out.println(i+"]"+T[i].getProprietario());
		
		while(!scanner.hasNextInt() || scanner == null) {
			System.out.println("Rispondi con un valore intero!");
			scelta = scanner.next();		 
		}
		scelta = scanner.next();
		ch = Integer.parseInt(scelta);
		//Giuseppe è distributore di default
		
		System.out.println();
		while(scelta2!=1){
			System.out.printf("1)Erogazione carburante\n"
				+ "2)Rifornimento Distributore\n"
				+ "3)Calcolo incasso giornaliero\n"
				+ "4)Comparazione");
		System.out.println();
		
			System.out.println("Inserisci la tua scelta: ");
			
			while(!scanner.hasNextInt() || scanner == null) {
				System.out.println("Rispondi con un valore intero!");
				scelta = scanner.next();		 
			}
			scelta = scanner.next();
			scelta2 = Integer.parseInt(scelta);

			switch(scelta2){
				case 1:
					System.out.printf("Ins.num.litri da prelevare ,contenuta: "+
					T[scelta2].getContenuta()+" litri: ");
					T[scelta2].erogazioneCarburante(scanner.nextInt());
			
					System.out.printf("Vuoi continuare?\nDigita 0 per confermare oppure 1 per negare: ");
					scelta3=scanner.nextInt();
					break;
				case 2:
					System.out.printf("il distrubutore contiene "+T[scelta2].getContenuta()+" su "+T[ch].getCapacita());
					T[ch].rifornisciDistributore();
					System.out.printf(" Vuoi continuare?\nDigita 0 per confermare oppure 1 per negare: ");
					
					scelta3=scanner.nextInt();
					break;
				case 3: 
					System.out.printf("L'incasso totale di oggi:"+T[ch].getBilancio());
					System.out.printf("Vuoi continuare?\nDigita 0 per confermare oppure 1 per negare: ");
					scelta3=scanner.nextInt();
					break;
				case 4:
					DistributoreDiBenzina Dch = T[ch];
					for(i=0;i < T.length;i++){
						if(i!=ch){
							DistributoreDiBenzina Di = T[i];
							if(Dch.compareTo(Di)>0)
								System.out.println(Dch.getProprietario()+ " ha più benzina di "+Di.getProprietario());
							else 
								System.out.println(Dch.getProprietario()+ " ha meno benzina di "+Di.getProprietario());
						}// fine if
					} //fine for
					break;
			} //fine switch
		}//fine while
	} //fine main
}//fine classe test
