package academy.devdojo.maratonajava.introduction;

public class Lesson05ConditionalStructures04 {
    public static void main(String[] args) {
        double annualSalary = 72000;
        double taxPerBracket01 = 9.45 / 100;
        double taxPerBracket02 = 37.10 / 100;
        double taxPerBracket03 = 49.50 / 100;
        double taxAmount;
        if (annualSalary <= 35129) {
            taxAmount = annualSalary * taxPerBracket01;
        } else if (annualSalary >= 35129 && annualSalary <= 68507) {
            taxAmount = annualSalary * taxPerBracket02;
        } else {
            taxAmount = annualSalary * taxPerBracket03;
        }
        System.out.println("Tax Amount: " + taxAmount);
    }
}
