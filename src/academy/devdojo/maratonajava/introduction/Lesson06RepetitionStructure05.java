package academy.devdojo.maratonajava.introduction;

public class Lesson06RepetitionStructure05 {
    // Given the value of a car, find out how many times it can be paid in installments.
    // Condition installmentValue >= 1000
    public static void main(String[] args) {
        double totalValue = 32000;
        for (int installment = (int) totalValue; installment >= 1; installment--) {
            double installmentValue = totalValue / installment;
            if (installmentValue < 1000) {
                continue;
            }
            System.out.println("Installment " + installment + ": $" + installmentValue);
        }
    }
}
