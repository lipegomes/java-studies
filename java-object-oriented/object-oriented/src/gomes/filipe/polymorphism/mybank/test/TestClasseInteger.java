package gomes.filipe.polymorphism.mybank.test;

import java.util.ArrayList;
import java.util.List;

public class TestClasseInteger {
	
	public static void main(String[] args) {
		
		int[] idades = new int[5];
		String[] names = new String[5];
		
		int idade = 90;

		Integer idadeRef = Integer.valueOf(idade);	//autoboxing
		
		System.out.println(idadeRef.doubleValue());
		
		int valor = idadeRef.intValue();	//unboxing
		
		String num = "100";
		
		Integer numero = Integer.valueOf(num);
		int numParse = Integer.parseInt(num);
		System.out.println(numParse);
		
		List<Integer> numeros = new ArrayList<Integer>();
		numeros.add(100);	//AutoBoxing
		
		System.out.println("Valor máximo que um Integer pode guardar: " + Integer.MAX_VALUE);
		System.out.println("Valor minímo que um Integer pode guardar: " + Integer.MIN_VALUE);
		System.out.println("Tamanho do Integer em bits: " + Integer.SIZE);
		System.out.println("Tamanho do Integer em bytes: " + Integer.BYTES);
		
		
		String diaEmFormtatoDeTexto = "1";
		
		// Parsing devolve um primitivo
		int dia1 = Integer.parseInt(diaEmFormtatoDeTexto);
		System.out.println(dia1);
		// ValueOf devolve uma referência e em seguida ocorre um unboxing
		int dia2 = Integer.valueOf(diaEmFormtatoDeTexto);
		System.out.println(dia2);
	}
	

}
