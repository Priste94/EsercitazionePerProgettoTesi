package EsercitazioniClientServer.MiniChat;
import java.io.*;
import java.net.*;

public class Server {

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
		
		try {
			
			String letto="",messaggio = "";
			
			System.out.println("Scivi al client:");
			
			messaggio = tastiera.readLine();
			out.writeBytes(messaggio + "\n");
			System.out.println("In attesa di risposta");
			letto = in.readLine(); 
			System.out.println("Messaggio ricevuto: "+letto);
		
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	public static void main(String[] args) {
		
		Server s = new Server();
		s.connetti();
		while(true)
			s.comunica();

	}

}
