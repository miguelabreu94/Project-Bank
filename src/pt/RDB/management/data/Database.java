package pt.RDB.management.data;

import java.util.ArrayList;
import java.util.List;

import pt.RDB.management.domain.Client;
import pt.RDB.management.domain.ContaBancaria;

public class Database {

	public static List<Client> clients = new ArrayList<Client>();
	public static List<ContaBancaria> cb = new ArrayList<ContaBancaria>();
	
	
	static {
		seedData();
	}


	private static void seedData() {
		
		//Client client1 = new Client(5464654,"password","nome","08/07/1994",239878879,914088484,"email","job");
		//clients.add(client1);
		// cb.add(new ContaBancaria(545456465,4564564,"saddsaasd",client1));
	}
	
}
