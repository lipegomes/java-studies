package academy.devdojo.maratonajava.introduction;

public class Lesson05ConditionalStructures02 {
    public static void main(String[] args) {
        // age < 15 infant category
        // age >= 15 && age < 18 youthful category
        // age >= 18 adult category
        int age = 30;
        String category;

        if (age < 15) {
            category = "Infant Category";
        } else if (age >= 15 && age < 18) {
            category = "Youthful Category";
        } else {
            category = "Adult Category";
        }
        System.out.println(category);
    }
}
