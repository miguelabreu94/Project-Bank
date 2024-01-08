package pt.RDB.management.domain;

public class CartaoDebito extends Cartao{

	private Client client;
	private ContaBancaria conta;
	private int valorLevantadoDia;
	

	public CartaoDebito(int cartaoID, int pin, Client client, ContaBancaria conta) {
		super(cartaoID, pin);
		this.client = client;
		this.conta = conta;
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
	
	public int getValorLevantadoDia() {
		return valorLevantadoDia;
	}


	public void setValorLevantadoDia(int valorLevantadoDia) {
		this.valorLevantadoDia = valorLevantadoDia;
	}


	
	
}
