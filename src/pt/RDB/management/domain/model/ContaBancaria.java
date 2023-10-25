package pt.RDB.management.domain.model;

public class ContaBancaria {
	private int accountNumber;
	private int saldo;
	private String transactionHistory;
	
	
	public ContaBancaria(int accountNumber, int saldo, String transactionHistory, Client client) {
		this.accountNumber = accountNumber;
		this.saldo = saldo;
		this.transactionHistory = transactionHistory;
	}

	public Client getClient() {
		return getClient();
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}


	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}


	public int getSaldo() {
		return saldo;
	}


	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}


	public String getTransactionHistory() {
		return transactionHistory;
	}


	public void setTransactionHistory(String transactionHistory) {
		this.transactionHistory = transactionHistory;
	}
	
	
	
}
