package com.example.demo.capitulo3;

import java.util.Scanner;

import com.example.demo.capitulo3.model.Account;

/**
 * @author filipe
 *
 */

public class AccountTest {
	
	public static void main(String[] args) {
		
		// cria um objeto Scanner para obter entrada a partir da janela de comando
		Scanner input = new Scanner(System.in);
		
		// cria um objeto Account e o atribuiu a account
		Account account = new Account();
		
		// solicita e lê o nome
		System.out.println("Enter the name:");
		String name = input.nextLine();	// lê uma linha do texto
		System.out.println("Enter the lastname:");
		String lastname = input.nextLine();	// lê uma linha do texto
		System.out.println("Enter the cpf:");
		String cpf = input.nextLine();	// lê uma linha do texto
		
		account.setName(name);	// insere name(nome) em account
		account.setLastName(lastname);
		account.setCpf(cpf);
		System.out.println();	// gera uma saída de linha em branco
		
		// exibe o nome armazenado no objeto account
		System.out.println("Name in object account is:" + account.getName());
		System.out.println("Lastname in object account is: " + account.getLastName());
		System.out.println("Cpf in object account is: " + account.getCpf());
	}
}
