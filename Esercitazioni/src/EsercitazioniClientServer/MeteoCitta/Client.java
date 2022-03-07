package EsercitazioniClientServer.MeteoCitta;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Client extends EsercitazioniClientServer.MiniChat.Client{

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
