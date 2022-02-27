package Esercitazione3_ClassiAstratte_Interfacce.es1Interfacce;

import java.util.Scanner;

public class TestElevato {

	public static void main(String[] args) {
		
		int numero;
		
		System.out.println("inserisci un numero intero: ");
		Scanner scanner = new Scanner(System.in);
		
		numero = scanner.nextInt();
		Quadrato q = new Quadrato(numero);
		Cubo c = new Cubo(numero);
		
		q.perSeStesso();
		c.perSeStesso();
		
		System.out.println("il quadrato del numero inserito è: "+q.getN()); 
		System.out.println("il cubo del numero inserito è: "+c.getN());
	}

}
