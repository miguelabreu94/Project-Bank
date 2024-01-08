package pt.RDB.management.services;

import pt.RDB.management.dao.ContaBancariaDao;
import pt.RDB.management.domain.ContaBancaria;

public class ContaBancariaService {
	
	private ContaBancariaDao cbDao;
	
	public void deposit(ContaBancaria cb, double valor) {
		cbDao.deposit(cb, valor);
	}
	
	public void withdraw(ContaBancaria cb, double valor) {
		cbDao.withdraw(cb, valor);
	}

	public void transfer(ContaBancaria cbwithdraw, ContaBancaria cbdeposit, double valor) {
		cbDao.transfer(cbwithdraw, cbdeposit, valor);
	}
	
}
