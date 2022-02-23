package Esercitazione2;


public class TestEmployee {

	public static void main(String[] args) {
		Employee e1, e2, e3, ricco;
		e1 = new Employee("Rossi", "Mario", "RSSMRI77.........", "Milano", 1991, 2400);
		e2 = new Employee("Hontas", "Poca", "HNTPCA93.........", "Canicattì", 2020, 1700);
		e3 = new Employee("Bianchi", "Paolo", "BNCPLO91........", "Vimercate", 2000, 2100);
		
		Employee[] impiegati = {e1, e2, e3};
		
		for(int i = 0; i < impiegati.length; i++) {  //bubblesort
			boolean flag = false;
			for (int j = 1; j<impiegati.length-1; j++) 
		        //Se l' elemento j e maggiore del successivo allora
		        //scambiamo i valori
				if (impiegati[j-1].gainsMore(impiegati[j])) {
					ricco = impiegati[j];
					impiegati[j] = impiegati[j+1];
					impiegati[j+1] = ricco;
					flag=true; //Lo setto a true per indicare che é avvenuto uno scambio
				
				}
			if (!flag)
				break; //Se flag=false allora vuol dire che nell' ultima iterazione
            //non ci sono stati scambi, quindi il metodo può terminare
            //poiché l' array risulta ordinato
	
		}
		for(int k = 0; k < impiegati.length; k++)
			System.out.println(impiegati[k].toString());
	}
	
}

