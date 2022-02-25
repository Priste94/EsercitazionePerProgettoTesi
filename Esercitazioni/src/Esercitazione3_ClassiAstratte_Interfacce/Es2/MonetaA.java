package Esercitazione3_ClassiAstratte_Interfacce.Es2;

public class MonetaA extends OggettoGioco{

	public void lancio() {
		n = (int) (Math.random() *2);
	}
	
	
	public String getHorT() {
		if (n == 0)
			return "testa";
		return "croce";
	}
		

}
