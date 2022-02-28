package Esercitazione3_ClassiAstratte_Interfacce.es3Interfacce;

public class Addizione extends FunzionalitaComuni implements Operazione{
	
	private String ciao ="ciao";

	public String getCiao() {
		return ciao;
	}

	public void setCiao(String ciao) {
		this.ciao = ciao;
	}

	@Override
	public void opera(int operando1, int operando2) {
		
		print(operando1 + operando2);
	}

}
