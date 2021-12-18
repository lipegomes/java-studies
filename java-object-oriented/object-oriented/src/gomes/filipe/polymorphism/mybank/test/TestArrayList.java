package gomes.filipe.polymorphism.mybank.test;

import java.util.ArrayList;

import gomes.filipe.polymorphism.mybank.model.Conta;
import gomes.filipe.polymorphism.mybank.model.ContaCorrente;

public class TestArrayList {

	public static void main(String[] args) {

		ArrayList lista = new ArrayList();

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


		System.out.println("--- Loop For ---");
		//	    for(inicialização; condição; incremento/decremento) {  
		//	         //declaração ou código que será executado  
		//	    }  

		for(int i = 0; i < lista.size(); i++) {
			Object object = lista.get(i);
			System.out.println(object);
		}

		System.out.println("--- Loop For encadeado ---");
		for(int i = 0; i <= lista.size(); i++) {
			for (int j = 1; j <= lista.size(); j++) {
				System.out.println(i + " " + j);
			}
		}



		System.out.println("--- Loop For-each ---");
		//	    for(Tipo da variável variável : array) {  
		//	        //código que será executado  
		//	    }  

		for(Object obj : lista) {
			System.out.println(ref);
		}

		System.out.println("--- Loop For marcado ---");

		a1:
			for(int i = 1; i < 3; i++) {
				a2:
					for(int j = 1; j <=3; j++) {
						if(i == 2 && j== 2) {
							break a1;
						}
						System.out.println(i + "" + j);
					}
			}	
	}
}
