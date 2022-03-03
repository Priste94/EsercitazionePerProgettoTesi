package EserciziIO;
import java.io.*;

public class EserciziIO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
	
	  public static void backupDbFile() throws FileNotFoundException, IOException {
		     File dbOrig = new File("immagine.jpg");
		     File dbCopy = new File("immagine.jpg.copy");
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
}
