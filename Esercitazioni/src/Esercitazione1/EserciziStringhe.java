package Esercitazione1;

public class EserciziStringhe {

	public static void main(String[] args) {
		
		//test es1 stringhe
		String s1 = "Viva java";
		String s2 = "Abbasso C++";
		contrario(s1);
		System.out.println();
		
		//test es2 stringhe
		vocali(s1);
		System.out.println();
		
		vocali(s2);
		System.out.println();
		
		//test es3 stringhe
		String [] as = {"Albero", "foglia", "Radici", "Ramo", "fiore" , ""};
		sommaMaiuscole(as);
		System.out.println();
		

	}
	
	//es1 stringhe
public static void contrario (String s) {	
	for (int i=s.length()-1; i>=0; --i)
		System.out.print(s.charAt(i));
}

    //es2 stringhe
public static void vocali (String s) {
	for (int i=0; i<s.length(); ++i)
		if (s.charAt(i)== 'a' || s.charAt(i)== 'e' || s.charAt(i)== 'i' ||
			s.charAt(i)== 'o' || s.charAt(i)== 'u' ||
			s.charAt(i)== 'A' || s.charAt(i)== 'E' || s.charAt(i)== 'I' ||
			s.charAt(i)== 'O' || s.charAt(i)== 'U')
			System.out.print(s.charAt(i));
}
	
//	if (s.length()%2==0) //se la lunghezza è pari
//		for (int i=0; i<s.length()/2; ++i) {
//			System.out.println(s.charAt(i));
//			System.out.println(s.charAt(s.length()-1-i));
//		}
//	else {              //se la lunghezza è dispari
//		for (int i=0; i<s.length()/2; ++i) {
//			System.out.println(s.charAt(i));
//			System.out.println(s.charAt(s.length()-1-i));
//		}
//		System.out.println(s.charAt(s.length()/2));
//		System.out.println(ai[ai.length/2]);
 

//es3 stringhe

public static void sommaMaiuscole (String [] as) {
	int somma=0;
	for (int i=0; i<as.length; ++i)
		if (as[i] != "")
			 if(Character.isUpperCase(as[i].charAt(0)))
				 somma+=as[i].length();
	System.out.print(somma);
					
}


	
	
	
}


