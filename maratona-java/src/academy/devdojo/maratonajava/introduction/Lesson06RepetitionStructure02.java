package academy.devdojo.maratonajava.introduction;

public class Lesson06RepetitionStructure02 {
    public static void main(String[] args) {
        // Print all even numbers from 0 to 1000000
        for (int i = 1; i <= 1000000; i++) {
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}
