package EsercitazioniClientServer.MiniChat;
import java.io.*;
import java.net.*;

import javax.xml.crypto.Data;

public class Client extends Server{
	

	Socket mioSocket = null;

	
	
	@Override
	public Socket connetti() {
		
		try {
			
			System.out.println("0) Provo a connettermi con il server");

			Socket mioSocket = new Socket(InetAddress.getLocalHost(),porta);
			
			System.out.println("1) Connesso!");
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
	

	public static void main(String[] args) {
		
		Client c = new Client();
		
		try {
			System.out.println(InetAddress.getLocalHost());
			c.connetti();
			while(true)
				c.comunica();

		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
