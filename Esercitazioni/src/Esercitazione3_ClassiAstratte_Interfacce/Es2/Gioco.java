package Esercitazione3_ClassiAstratte_Interfacce.Es2;

public class Gioco {
	
	public static void main(String[] args) {
	
	Dado d = new Dado();
	Moneta m = new Moneta();
	
	d.lancio();
	m.lancio();
	
	DadoA da = new DadoA();
	MonetaA ma = new MonetaA();
	
	da.lancio();
	ma.lancio();
	
	
	System.out.println("Il lancio del dado ha restituito: "+d.getNumero());

	System.out.println("Il lancio della moneta ha restituito: "+m.getHorT());
	
	System.out.println("Il lancio del dado con astrazione ha restituito: "+da.getN());

	System.out.println("Il lancio della moneta con astrazione ha restituito: "+ma.getHorT());
	}
	

}
