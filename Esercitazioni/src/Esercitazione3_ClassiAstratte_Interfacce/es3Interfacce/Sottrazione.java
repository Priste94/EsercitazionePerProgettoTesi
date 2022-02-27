package Esercitazione3_ClassiAstratte_Interfacce.es3Interfacce;

public class Sottrazione extends FunzionalitaComuni implements Operazione{

	@Override
	public void opera(int operando1, int operando2) {
		
		print(operando1 - operando2);
	}

}
