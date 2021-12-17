package gomes.filipe.polymorphism.mybank.test;

public class TestArray {
	
	public static void main(String[] args) {
		
		String[] letras = new String[5];
		
		letras[0] = "a";
		letras[1] = "b";
		letras[2] = "c";
		letras[3] = "d";
		letras[4] = "e";
		
		System.out.println("Quantidade de posições: " + letras.length);
		
		int[] tabuada = new int[11];
		
		for(int i = 0; i < tabuada.length; i++) {
			tabuada[i] = i * i;
		}
		
		for(int i = 0; i < tabuada.length; i++) {
			System.out.println(i + " * " + i + " = " + tabuada[i]);
		}
	}
}
