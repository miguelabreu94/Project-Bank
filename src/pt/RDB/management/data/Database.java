package pt.RDB.management.data;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import pt.RDB.management.domain.model.Client;
import pt.RDB.management.domain.model.ContaBancaria;

public class Database {

	public static List<Client> clients = new ArrayList<Client>();
	public static List<ContaBancaria> cb = new ArrayList<ContaBancaria>();
	
	
	static {
		seedData();
	}


	private static void seedData() {
		
		Client client1 = new Client(23213123,"sdadsd","sadsaodk",new SimpleDateFormat("08/07/1994"),331231,"sadsadas","sdsasda");
		clients.add(client1);
		cb.add(new ContaBancaria(545456465,4564564,"saddsaasd",client1));
	}
	
}
