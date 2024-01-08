package pt.RDB.management.dao;

import pt.RDB.management.domain.Client;

public class ClientDao {
	
	public void changeName(Client client, String nome) {
		client.setName(nome);
	}
	
	public void changePassword(Client client, String password) {
		client.setPassword(password);
	}

	public void changePhoneNumber(Client client, int phoneNumber) {
		client.setTelefone(phoneNumber);
	}
	
	public void changeMobileNumber(Client client, int mobileNumber) {
		client.setTelemovel(mobileNumber);
	}
	
	public void changeEmail(Client client, String email) {
		client.setEmail(email);
	}
	
	public void changeProfissao(Client client, String job) {
		client.setProfissao(job);
	}
}
