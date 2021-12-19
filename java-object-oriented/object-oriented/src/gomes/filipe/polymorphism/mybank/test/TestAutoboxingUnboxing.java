package gomes.filipe.polymorphism.mybank.test;

import java.util.ArrayList;
import java.util.List;

public class TestAutoboxingUnboxing {

	public static void main(String[] args) {

		int[] idades = new int[5]; // primitivo
		String[] nomes = new String[5]; // Wrapper

		// O java transforma o valor primitivo em um Objeto e guarda esse objeto em uma referência em um Array.
		int idade = 100;
		Integer idadeRef1 = new Integer(100);
		Integer idadeRef2 = new Integer(50);
		Integer idadeRef3 = new Integer(90);
		Integer idadeRef4 = new Integer(40);
		Integer idadeRef5 = new Integer(10);
		
		List<Integer> numeros = new ArrayList<Integer>();
		numeros.add(idadeRef1);
		numeros.add(idadeRef2);
		numeros.add(idadeRef3);
		numeros.add(idadeRef4);
		numeros.add(idadeRef5);
		
		System.out.println(numeros.size());
		System.out.println(numeros);

	}
}
 