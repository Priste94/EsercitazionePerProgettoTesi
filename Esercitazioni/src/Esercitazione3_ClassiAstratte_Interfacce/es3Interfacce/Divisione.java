package Esercitazione3_ClassiAstratte_Interfacce.es3Interfacce;

public class Divisione extends FunzionalitaComuni implements Operazione{

	@Override
	public void opera(int operando1, int operando2) {
		
		if (operando2 != 0)
			print(operando1 / operando2);
		else
			System.out.println("impossibile");
	}


}
