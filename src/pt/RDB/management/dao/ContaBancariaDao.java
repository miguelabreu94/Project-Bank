package pt.RDB.management.dao;

import pt.RDB.management.domain.ContaBancaria;

public class ContaBancariaDao {

	public void deposit(ContaBancaria cb, double valor) {
		
		if(valor > 0) {
		
		double novoSaldo = cb.getSaldo() + valor;
		
		cb.setSaldo(novoSaldo);
	}
		else {
			throw new RuntimeException("O montante de depósito tem de ser maior que 0");
		}
		
	}
	
	public void withdraw(ContaBancaria cb, double valor) {
	
		if (valor > 0) {
			double novoSaldo = cb.getSaldo() - valor;
			
			cb.setSaldo(novoSaldo);
		}
		
		else {
			throw new RuntimeException("O montante para levantamento tem de ser maior que 0");
		}
	}
	
	
	public void transfer(ContaBancaria cbwithdraw, ContaBancaria cbdeposit, double valor) {
		
		if(valor > 0) {
			double novoSaldoContaWithdraw = cbwithdraw.getSaldo() - valor;
			cbwithdraw.setSaldo(novoSaldoContaWithdraw);
			
			double novoSaldoContaDeposit = cbdeposit.getSaldo() + valor;
			cbdeposit.setSaldo(novoSaldoContaDeposit);
		}
		
		else {
			throw new RuntimeException("O montante para tranferência tem de ser maior que 0");
		}
		
	}
	
	
}
