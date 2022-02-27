package Esercitazione3_ClassiAstratte_Interfacce.es3Interfacce;

public class testOperandi {

	public static void main(String[] args) {
		
		Addizione a1 = new Addizione();
		Sottrazione s1 = new Sottrazione();
		Divisione d1 = new Divisione();
		Moltiplicazione m1 = new Moltiplicazione();
		
		Operazione[] op = {a1, s1, d1, m1};
		
		for (int i=0; i<op.length; ++i) {					
			op[i].opera(10, 2);

		}	
			
	}
		
}
