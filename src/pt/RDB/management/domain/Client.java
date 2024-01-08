package pt.RDB.management.domain;

import java.sql.Date;
import java.text.SimpleDateFormat;

public class Client {
		
	private SimpleDateFormat dateofbirthFormat = new SimpleDateFormat("DD/MM/YYYY");
	private int nif;
	private String password;
	private String name;
	private int telefone;
	private int telemovel;
	private String email;
	private String profissao;
	
	public Client () {
		
	}
	
	public Client (int nif, String password, String name, Date dateofbirth,
		int telefone, int telemovel, String email, String profissao) {
	
	this.nif = nif;
	this.password = password;
	this.name = name;
	this.dateofbirthFormat = new SimpleDateFormat ("dd/MM/yyyy");
	this.dateofbirthFormat.format(dateofbirth);
	this.telefone = telefone;
	this.telemovel = telemovel;
	this.email = email;
	this.profissao = profissao;
}


public int getTelemovel() {
		return telemovel;
	}

	public void setTelemovel(int telemovel) {
		this.telemovel = telemovel;
	}

public int getNif() {
	return nif;
}


public void setNif(int nif) {
	this.nif = nif;
}


public String getPassword() {
	return password;
}


public void setPassword(String password) {
	this.password = password;
}


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public SimpleDateFormat getDateofbirth() {
	return dateofbirthFormat;
}


public void setDateofbirth(SimpleDateFormat dateofbirth) {
	this.dateofbirthFormat = dateofbirth;
}


public int getTelefone() {
	return telefone;
}


public void setTelefone(int telefone) {
	this.telefone = telefone;
}


public String getEmail() {
	return email;
}


public void setEmail(String email) {
	this.email = email;
}


public String getProfissao() {
	return profissao;
}


public void setProfissao(String profissao) {
	this.profissao = profissao;
}
	
	
}
