package academy.devdojo.maratonajava.introduction;

public class Lesson05ConditionalStructures01 {
    public static void main(String[] args) {
        int age = 19;
        boolean allowedToBuyDrinks = age >= 18;
        if (allowedToBuyDrinks) {
            System.out.println("You are ALLOWED to buy alcoholic drinks.");
        } else if (!allowedToBuyDrinks) {
            System.out.println("You are NOT allowed to buy alcoholic drinks !!!");
        }
    }
}
