package academy.devdojo.maratonajava.javacore.Qstring.test;

import java.util.StringTokenizer;

public class StringTokenizerTes01 {
    public static void main(String[] args) {
        StringTokenizer stk1 = new StringTokenizer("green blue red yellow pink brown");
        StringTokenizer stk2 = new StringTokenizer("fish,hot dog,avocado", ",");

        while (stk1.hasMoreTokens()) {
            System.out.println(stk1.nextToken());
        }

        System.out.println();

        while (stk2.hasMoreTokens()) {
            System.out.println(stk2.nextToken());
        }
    }
}
