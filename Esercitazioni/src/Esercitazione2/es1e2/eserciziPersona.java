package Esercitazione2.es1e2;


public class eserciziPersona {

	public static void main(String[] args) {
		
		//test es1 persona
		Person me = new Person("Prister�", "Andrea", "PRSNDR94C25F704P", "Monza");
		System.out.println(me.getName());
		System.out.println(me.getSurname());
		System.out.println(me.bornYear());
		
		//test stagista
		Stagista s1,s2,s3, pi�Giovane;
		s1 = new Stagista("Rossi", "Mario", "RSSMRI77.........", "Milano", 5, 123);
		s2 = new Stagista("Hontas", "Poca", "HNTPCA93.........", "Canicatt�", 10, 46);
		s2.setNumberOfPresence(8);
		s2.setIdNumber(46);
		s3 = new Stagista("Bianchi", "Paolo", "BNCPLO91........", "Vimercate", 6, 7);
		
		Stagista [] stagisti = {s1, s2, s3};
		pi�Giovane = s1;
		
		for (int i=1; i<stagisti.length; ++i) {
			if (stagisti[i].quantiAnni()< pi�Giovane.quantiAnni())
				pi�Giovane = stagisti[i];			
		}
		
		System.out.println(pi�Giovane.toString());
		
		
		
		

	}

}
