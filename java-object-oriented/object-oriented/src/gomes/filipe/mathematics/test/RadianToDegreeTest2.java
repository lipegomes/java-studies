package gomes.filipe.mathematics.test;

import java.util.Scanner;

public class RadianToDegreeTest2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a numeric value for the radian:");
        double radiance = scanner.nextDouble();
        double degrees = Math.toDegrees(radiance);

        System.out.println("Radiance " + radiance + " in degrees: " + degrees);
    }
}
