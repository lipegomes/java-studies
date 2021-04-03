package academy.devdojo.maratonajava.introducao;

public class Lesson04Operators {
    public static void main(String[] args) {
        // + - / *
        int number01 = 6;
        int number02 = 4;
        int sumNumbers = number01 + number02;
        int subNumbers = number01 - number02;
        int multiNumbers = number01 * number02;
        double divNumbers = number01 / (double) number02;
        System.out.println(sumNumbers);
        System.out.println(subNumbers);
        System.out.println(multiNumbers);
        System.out.println(divNumbers);

        // %
        int rest = 21 % 7;
        System.out.println(rest);

        // < > <= >= == !=
        boolean isTwentyGreaterThanFifteen = 20 > 15;
        boolean isTwentyLessThanFifteen = 20 < 15;
        boolean isTwentyLessThanOrEqualToFifteen = 20 <= 15;
        boolean isTwentyGreaterThanOrEqualToFifteen = 20 >= 15;
        boolean isTwentyEqualTwenty = 20 == 20;
        boolean isTwentyEqualFifteen = 20 == 15;
        boolean isTwentyDifferentFifteen = 20 != 15;
        System.out.println("20 > 15: " + isTwentyGreaterThanFifteen);
        System.out.println("20 < 15: " + isTwentyLessThanFifteen);
        System.out.println("20 <= 15: " + isTwentyLessThanOrEqualToFifteen);
        System.out.println("20 >= 15: " + isTwentyGreaterThanOrEqualToFifteen);
        System.out.println("20 == 15: " + isTwentyEqualFifteen);
        System.out.println("20 == 20: " + isTwentyEqualTwenty);
        System.out.println("20 != 15: " + isTwentyDifferentFifteen);

        // && (AND) || (or) !
        int age = 47;
        float salary = 5862F;
        boolean isWithinTheLawGreaterThanThirty = age > 30 && salary >= 4612;
        boolean isWithinTheLawLessThanThirty = age < 30 && salary >= 3381;
        System.out.println("isWithinTheLawGreaterThanThirty: " + isWithinTheLawGreaterThanThirty);
        System.out.println("isWithinTheLawLessThanThirty: " + isWithinTheLawLessThanThirty);

        double currentAccountBalance = 375;
        double savingsAccountBalance = 7000;
        float playstationValue = 5000;
        boolean iCanBuy = currentAccountBalance > playstationValue || savingsAccountBalance > playstationValue;
        System.out.println("I can buy: " + iCanBuy);

        // = += -= *= /= %=
        double bonus = 2775;
        bonus += 225;
        bonus -= 1000;
        bonus *= 2;
        bonus /= 4;
        bonus %= 2;
        System.out.println(bonus);

        // ++ --
        int counter = 0;
        counter += 1;
        counter++; // 2
        counter--; // 1
        ++counter; // 2
        --counter; // 1
        System.out.println(counter);
    }
}
