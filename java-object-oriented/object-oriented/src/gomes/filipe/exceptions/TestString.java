package gomes.filipe.exceptions;

import java.util.Scanner;

public class TestString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nome = "Filipe";
        System.out.println("Nome: " + nome);

        System.out.println("Digite o indice de uma letra no nome acima:");
        String i = scanner.nextLine();

        char c = nome.charAt(Integer.parseInt(i));

        System.out.println("Indice: " + i + " Letra: " + c);
    }
}
