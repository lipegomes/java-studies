package academy.devdojo.maratonajava.introduction;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner day = new Scanner(System.in); // Create a Scanner object
        System.out.println("Enter a day of the week:");

        String weekday = day.nextLine(); // Read user input

        try {
            switch (weekday) {
                case "1":
                    System.out.println("Monday");
                    break;
                case "2":
                    System.out.println("Tuesday");
                    break;
                case "3":
                    System.out.println("Wednesday");
                case "4":
                    System.out.println("Thursday");
                case "5":
                    System.out.println("Friday");
                case "6":
                    System.out.println("Saturday");
                case "7":
                    System.out.println("Sunday");
                    break;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Enter values from 1 to 7");
        }
    }
}
