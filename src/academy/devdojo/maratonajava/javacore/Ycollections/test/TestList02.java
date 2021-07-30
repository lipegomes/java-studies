package academy.devdojo.maratonajava.javacore.Ycollections.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class TestList02 {
    public static void main(String[] args) {
        // cria um objeto scanner chamado game
        Scanner game = new Scanner(System.in);

        // ceclara e instancia nome de games
        ArrayList<String> gameCatalog = new ArrayList<String>();

        // adiciona games no ArrayList de gameCatalog
        gameCatalog.add("Forza Horizon 4");
        gameCatalog.add("GTA V");
        gameCatalog.add("Red Dead Redemption 2");
        gameCatalog.add("Train Sim World 2020");
        gameCatalog.add("Call of Duty: Modern Warfare");
        gameCatalog.add("War Thunder");

        int i;
        //
        int n = gameCatalog.size();

        System.out.println("Quantidade de games instalados : " + n);
        System.out.println("Games:");

        // for loop
        System.out.println("--- for loop");
        for (i = 0; i < n; i++) {
            System.out.println(gameCatalog.get(i));
        }

        // For-each
        System.out.println("--- for-each");
        for (String j : gameCatalog) {
            System.out.println(j);
        }

        // sort - ordena a lista em ordem alfabética ou numérica
        System.out.println("--- sort ---");
        Collections.sort(gameCatalog);
        for (String k : gameCatalog) {
            System.out.println(k);
        }
    }
}
