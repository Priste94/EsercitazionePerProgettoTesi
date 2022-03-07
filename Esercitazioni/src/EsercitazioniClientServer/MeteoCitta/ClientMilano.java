package EsercitazioniClientServer.MeteoCitta;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

import EsercitazioniClientServer.MiniChat.Client;

public class ClientMilano {
	Socket mioSocket = null;
	final String nome = "Milano";

	protected int porta = 6788;
	private ServerSocket server = null;
	
	protected DataInputStream in = null;
	protected DataOutputStream out = null;
	
	
	
	public Socket connetti() {
		
		try {
			
			System.out.println("0) Provo a connettermi con il server");

			Socket mioSocket = new Socket(InetAddress.getLocalHost(),porta);
			
			System.out.println("1) Client Milano connesso!");
			in = new DataInputStream(mioSocket.getInputStream());
			out = new DataOutputStream(mioSocket.getOutputStream());
		
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return mioSocket;
		
	}
	
	
	
	public void comunica() {
		BufferedReader tastiera = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			
			String letto="";

			System.out.println("In attesa di risposta");
			letto = in.readLine(); 
			System.out.println("Messaggio ricevuto: "+letto);
		
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	

	public static void main(String[] args) {
		
		Client c = new Client();
		
		try {
			System.out.println(InetAddress.getLocalHost());
			c.connetti();
			c.comunica();

		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}