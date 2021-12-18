package gomes.filipe.polymorphism.mybank.test;

import gomes.filipe.polymorphism.mybank.model.ContaPoupanca;

public class TestArrayObject {
	
	public static void main(String[] args) {
		
		Object[] referencias = new Object[5];
 		
		ContaPoupanca cp1 = new ContaPoupanca("Banco A", 1, 68);
		ContaPoupanca cp2 = new ContaPoupanca("Banco A", 1, 12);
		
		referencias[0] = cp1;
		referencias[1] = cp2;
		
		System.out.println(cp1);
		System.out.println(cp2);
	}
}
