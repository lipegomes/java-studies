package gomes.filipe.polymorphism.mybank.test;

public class TestStringArgs {
	
	public static void main(String[] args) {
		
		System.out.println("String[] é um array de String e args são os argumentos (parâmetros) recebidos");
		
		for(int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
	}

}
