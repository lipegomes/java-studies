package gomes.filipe.polymorphism.mybank.test;

import java.util.ArrayList;

import gomes.filipe.polymorphism.mybank.model.Conta;
import gomes.filipe.polymorphism.mybank.model.ContaCorrente;

public class TestArrayListEquals {
	
	public static void main(String[] args) {
		
		ArrayList<Conta> lista = new ArrayList<Conta>();
		
		Conta cc1 = new ContaCorrente("Banco A", 1, 123);
		lista.add(cc1);
		
		Conta cc2 = new ContaCorrente("Banco A", 1, 456);
		lista.add(cc2);
		
		Conta cc3 = new ContaCorrente("Banco A", 1, 987);
		boolean contaExistente = lista.contains(cc3);
		System.out.println("Conta existente: " + contaExistente);
		
		for(Conta conta : lista ) {
			System.out.println(conta);
		}
		
	}
	

}
