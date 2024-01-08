package pt.RDB.management.services;

import pt.RDB.management.dao.ClientDao;
import pt.RDB.management.domain.Client;

public class ClientService {
	
	private ClientDao clDao;
	
	public void changeName (Client client, String nome) {
		clDao.changeName(client, nome);
	}
	
	public void changePassword(Client client, String password) {
		clDao.changePassword(client, password);
	}
	
	public void changePhonenumber(Client client, int phoneNumber) {
		clDao.changePhoneNumber(client, phoneNumber);
	}

	public void changeMobilenumber(Client client, int mobileNumber) {
		clDao.changeMobileNumber(client, mobileNumber);
	}
	
	public void changeEmail(Client client, String email) {
		clDao.changeEmail(client, email);
	}
	
	public void changeProfissao(Client client, String profissao) {
		clDao.changeProfissao(client, profissao);
	}
	
}
