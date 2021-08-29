package academy.devdojo.maratonajava.introduction;

public class Lesson06RepetitionStructure04 {
    // Given the value of a car, find out how many times it can be paid in installments.
    // Condition installmentValue >= 1000
    public static void main(String[] args) {
        double totalValue = 38000;
        for (int installment = 1; installment <= totalValue; installment++) {
            double installmentValue = totalValue / installment;
            if (installmentValue < 1000) {
                break;
            }
            System.out.println("Installment " + installment + ": $" + installmentValue);
        }
    }
}
