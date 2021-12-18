package gomes.filipe.polymorphism.mybank.test;

import java.util.ArrayList;

import gomes.filipe.polymorphism.mybank.model.Conta;
import gomes.filipe.polymorphism.mybank.model.ContaCorrente;

public class TestGenerics {

	public static void main(String[] args) {

		// Generics <E>
		ArrayList<Conta> lista = new ArrayList<Conta>();

		Conta cc1 = new ContaCorrente("Banco B", 100, 1234);
		lista.add(cc1);

		Conta cc2 = new ContaCorrente("Banco C", 234, 567);
		lista.add(cc2);

		System.out.println("Tamanho: " + lista.size());

		Conta ref = (Conta) lista.get(0);	// type casting explicito
		System.out.println("Agência: " + ref.getAgencia());

		lista.remove(0);

		System.out.println("Tamanho: " + lista.size());

		Conta cc3 = new ContaCorrente("Banco D", 890, 567);
		lista.add(cc3);

		Conta cc4 = new ContaCorrente("Banco E", 567, 345);
		lista.add(cc4);

		System.out.println("--- Loop For-each ---");
		for(Object obj : lista) {
			System.out.println(ref);
		}
	}
}
