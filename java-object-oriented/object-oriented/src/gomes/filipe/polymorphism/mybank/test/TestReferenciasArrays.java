package gomes.filipe.polymorphism.mybank.test;

import gomes.filipe.polymorphism.mybank.model.ContaCorrente;

public class TestReferenciasArrays {
	
	public static void main(String[] args) {
		
		ContaCorrente[] contas = new ContaCorrente[5];
		
		ContaCorrente cc1 = new ContaCorrente("Banco A", 8, 12);
		ContaCorrente cc2 = new ContaCorrente("Banco B", 5, 100);
		ContaCorrente cc3 = new ContaCorrente("Banco C", 46, 859);
		
		
		contas[0] = cc1;
		contas[1] = cc2;
		contas[2] = cc3;
		
		System.out.println(contas[0]);
		System.out.println(contas[1]);
		System.out.println(contas[2]);
		
		System.out.println();
		
		System.out.println(contas[0].getNomeBanco());
		System.out.println(contas[0].getIdBanco());
		System.out.println(contas[0].getAgencia());
	
	}
}
