package com.example.demo.capitulo3.model;

/**
 * @author filipe
 *
 * public - modificador de acesso
 * void - retorno
 * setName - método
 * this.name - armazena a váriavel name
 * 
 */

public class Account {

	private String name;
	private String lastname;
	private String cpf;


	public Account() {
		
	}

	public Account(String name, String lastname, String cpf) {
		this.name = name;
		this.lastname = lastname;
		this.cpf = cpf;
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastname;
	}

	public void setLastName(String lastName) {
		this.lastname = lastName;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
}
