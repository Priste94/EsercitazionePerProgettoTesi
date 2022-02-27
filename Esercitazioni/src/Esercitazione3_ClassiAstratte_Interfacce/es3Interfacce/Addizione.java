package Esercitazione3_ClassiAstratte_Interfacce.es3Interfacce;

public class Addizione extends FunzionalitaComuni implements Operazione{
	
	

	@Override
	public void opera(int operando1, int operando2) {
		
		print(operando1 + operando2);
	}

}
