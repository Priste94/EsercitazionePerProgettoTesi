package EserciziIO;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

import Esercitazione2.es1e2.*;

public class EserciziIO {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		backupDbFile();
		File file = new File("C://Users//Andrea//git//EsercitazionePerProgettoTesi//Esercitazioni/es2.txt");
//		FileWriter file2 = new FileWriter("C://Users//Andrea//git//EsercitazionePerProgettoTesi//Esercitazioni/esD.txt");
//		file2.write(Double.parseDouble("3.4"));
		

		stampaDaTxt (file);
		//stampaDaTxt("C://Users//Andrea//git//EsercitazionePerProgettoTesi//Esercitazioni/es.txt");

		
		stampaDouble (new File("C://Users//Andrea//git//EsercitazionePerProgettoTesi//Esercitazioni/esD.txt"), 3.4);
		
		Employee e1 = new Employee("Rossi", "Mario", "RSSMRI77.........", "Milano", 1991, 2400);
		Employee e2 = new Employee("Hontas", "Poca", "HNTPCA93.........", "Canicattì", 2020, 1700);
		stampaImpiegato (new File("C://Users//Andrea//git//EsercitazionePerProgettoTesi//Esercitazioni/esI.txt"), e1);
		stampaImpiegato (new File("C://Users//Andrea//git//EsercitazionePerProgettoTesi//Esercitazioni/esI.txt"), e2);
		
		stampaDaTxt (new File("C://Users//Andrea//git//EsercitazionePerProgettoTesi//Esercitazioni/ultimoEs.txt"));
		System.out.println(numeroParoleDiverse (new File("C://Users//Andrea//git//EsercitazionePerProgettoTesi//Esercitazioni/ultimoEs.txt")));
	}

	
	//es1
	  public static void backupDbFile() throws FileNotFoundException, IOException {
		     File dbOrig = new File("C://Users//Andrea//git//EsercitazionePerProgettoTesi//Esercitazioni/download.jpg");
		     File dbCopy = new File("download2.jpg");
		     InputStream in = new FileInputStream(dbOrig);
		     OutputStream out = new FileOutputStream(dbCopy);
		     byte[] buf = new byte[1024];
		     int len;
		     while ((len = in.read(buf)) > 0) {
		        out.write(buf, 0, len);
		     }
		     in.close();
		     out.close();
		   }
	  
	  public static void stampaDaTxt (File file) throws IOException {
		  String encoding = "Cp1250";
		  if (file.exists()) {
			    try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file), encoding))) {
			        String line = null;
			        while ((line = br.readLine()) != null) {
			            System.out.println(line);
			        }
			    } catch (IOException e) {
			        e.printStackTrace();
			    }
			}
			else {
			    System.out.println("file doesn't exist");
			}
	  }
	  
	  public static void stampaDouble (File f, double d) throws IOException {
			  //FileOutputStream f2 = new FileOutputStream(f);
			  BufferedWriter b = new BufferedWriter (new FileWriter (f));
			  b.write("3.4");
			  b.flush();

			  stampaDaTxt(f) ;
	  }
	  
	  public static void stampaImpiegato (File f, Employee i) throws IOException, ClassNotFoundException {
		  FileOutputStream fos1 = new FileOutputStream(f);
		  //FileOutputStream fos2 = new FileOutputStream(f.getPath().concat(".ser"));
		  ObjectOutputStream oos = new ObjectOutputStream(fos1);
		  oos.writeObject(i);
		  oos.close();
		  fos1.close();
		  
		  FileInputStream in = new FileInputStream(f);
		  ObjectInputStream ois = new ObjectInputStream(in);
		  
		  Employee e = null;
		  e = (Employee) ois.readObject();
		  System.out.println(e);		  
		  
		  ois.close();
		  in.close();
	  }
	  
	  
public static int numeroParoleDiverse (File f) throws FileNotFoundException {
	FileReader file = new FileReader(f);

	Scanner sc = new Scanner(file);
	ArrayList<String> listOfWords = new ArrayList<String>();
	

	sc = sc.useDelimiter("[ .,:;!?~()-/”]+");
	

	int k = 0;
	String ss = "";
	
	while(sc.hasNext()){
		ss = (String)sc.next();
		if(!listOfWords.contains(ss)) //add the word if it isn't added already
            listOfWords.add(ss);
    
	}
	
	return listOfWords.size();
}
	  
}
