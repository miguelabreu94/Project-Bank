package pt.RDB.management.domain;

public class Cartao {

	private Client client;
	private ContaBancaria conta;
	private int cartaoID;
	private int pin;
	
	public Cartao(int cartaoID, int pin) {
		super();
		this.cartaoID = cartaoID;
		this.pin = pin;
	}

	public int getCartaoID() {
		return cartaoID;
	}

	public void setCartaoID(int cartaoID) {
		this.cartaoID = cartaoID;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
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
	
	
	
}
