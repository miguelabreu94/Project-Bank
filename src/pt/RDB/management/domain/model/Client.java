package pt.RDB.management.domain.model;

import java.text.SimpleDateFormat;

public class Client {
		
	SimpleDateFormat dateofbirth = new SimpleDateFormat("DD/MM/YYYY");
	private int nif;
	private String password;
	private String name;
	private int telefone;
	private String email;
	private String profissao;
	
	
public Client (int nif, String password, String name, SimpleDateFormat dateofbirth, 
		int telefone, String email, String profissao) {
	
	this.nif = nif;
	this.password = password;
	this.name = name;
	this.dateofbirth = dateofbirth;
	this.telefone = telefone;
	this.email = email;
	this.profissao = profissao;
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
	return dateofbirth;
}


public void setDateofbirth(SimpleDateFormat dateofbirth) {
	this.dateofbirth = dateofbirth;
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
