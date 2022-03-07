package EsercitazioniClientServer.MeteoCitta;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;




public class Server{
	
	HashMap<String, String> meteoCitta = new HashMap<>();
	
	protected int porta = 6788;
	private ServerSocket server = null;
	Socket socketClient = null;
	
	protected DataInputStream in = null;
	protected DataOutputStream out = null;
	
	
	
	public Socket connetti() {	
		try {
			System.out.println("0) Inizializzo il server");
			server = new ServerSocket(porta);
			System.out.println("1) Server pronto in ascolto sulla porta: "+porta);
			socketClient = server.accept(); //mi metto in ascolto sulla porta aperta
			System.out.println("2) Connessione stabilita con il client");
			server.close();//evitiamo connessioni multiple
			in = new DataInputStream(socketClient.getInputStream());
			out = new DataOutputStream(socketClient.getOutputStream());
		
		} catch (IOException e) {
			
			e.printStackTrace();
		}		
		return socketClient;		
	}
	
	public void comunica() {
		BufferedReader tastiera = new BufferedReader(new InputStreamReader(System.in));
		
		String letto="",messaggio = "";
		System.out.println(socketClient.toString());
//			System.out.println("In attesa di risposta");
//			letto = in.readLine(); 
//			System.out.println("Messaggio ricevuto: "+letto);
		
		
	}
	
	
	

	public static void main(String[] args) {
		Server server = new Server();
		server.meteoCitta.put("Milano", "Pioggia");
		server.meteoCitta.put("Roma", "Sole");
		server.meteoCitta.put("Napoli", "Sole");
		server.meteoCitta.put("Firenze", "Parzialmente nuvoloso");
		
		
		while(true) {
			server.connetti();
			
			server.comunica();
			
			
			
		}
		
		
	}

}
