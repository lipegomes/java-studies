package gomes.filipe.polymorphism.mybank.test;

import gomes.filipe.polymorphism.mybank.model.Conta;
import gomes.filipe.polymorphism.mybank.model.ContaCorrente;
import gomes.filipe.polymorphism.mybank.model.GuardadorDeContas;

public class TestGuardadorDeContas {
	
	public static void main(String[] args) {
		
		GuardadorDeContas guardador = new GuardadorDeContas();
		
		Conta cc1 = new ContaCorrente("Banco A", 1, 8);
		
		guardador.adiciona(cc1);
		
		Conta cc2 = new ContaCorrente("Banco A", 1, 200);
		
		guardador.adiciona(cc2);
		
		int tamanhoDoArray = guardador.getQuantidadeDeElementos();
		
		System.out.println(tamanhoDoArray);
		
		Conta ref = guardador.getReferencia(0);
		
		System.out.println(ref);
	}
}
