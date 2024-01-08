package pt.RDB.management.domain;

public class CartaoCredito extends Cartao{

	private Client client;
	private ContaBancaria conta;
	private int dailyWithdrawnumber;
	
	
	public CartaoCredito(int cartaoID, int pin, Client client, ContaBancaria conta, int dailyWithdrawnumber) {
		super(cartaoID, pin);
		this.client = client;
		this.conta = conta;
		this.dailyWithdrawnumber = dailyWithdrawnumber;
	}


	public Client getClient() {
		return client;
	}


	public void setClient(Client client) {
		this.client = client;
	}


	public ContaBancaria getConta() {
		return conta;
	}


	public void setConta(ContaBancaria conta) {
		this.conta = conta;
	}


	public int getDailyWithdrawnumber() {
		return dailyWithdrawnumber;
	}


	public void setDailyWithdrawnumber(int dailyWithdrawnumber) {
		this.dailyWithdrawnumber = dailyWithdrawnumber;
	}
	
	
	
	
	
}
