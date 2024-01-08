package pt.RDB.management.domain;

import java.util.List;

public class ContaBancaria {
	private int accountNumber;
	private double saldo;
	private String transactionHistory;
	private Client mainClient;
	private List<Client> additionalClients;
	private List<Cartao> creditCards;
	private Cartao debitCard;
	
	public ContaBancaria() {
		
	}

	public ContaBancaria(int accountNumber, double saldo, Client mainClient) {
		super();
		this.accountNumber = accountNumber;
		this.saldo = saldo;
		this.mainClient = mainClient;
	}



	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Client getMainClient() {
		return mainClient;
	}

	public void setMainClient(Client mainClient) {
		this.mainClient = mainClient;
	}

	public List<Client> getAdditionalClients() {
		return additionalClients;
	}

	public void setAdditionalClients(List<Client> additionalClients) {
		this.additionalClients = additionalClients;
	}

	public List<Cartao> getCreditCards() {
		return creditCards;
	}

	public void setCreditCards(List<Cartao> creditCards) {
		this.creditCards = creditCards;
	}

	public Cartao getDebitCard() {
		return debitCard;
	}

	public void setDebitCard(Cartao debitCard) {
		this.debitCard = debitCard;
	}

	public String getTransactionHistory() {
		return transactionHistory;
	}

	public void setTransactionHistory(String transactionHistory) {
		this.transactionHistory = transactionHistory;
	}

	
}
