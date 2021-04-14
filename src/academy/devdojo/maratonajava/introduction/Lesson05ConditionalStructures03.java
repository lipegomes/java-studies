package academy.devdojo.maratonajava.introduction;

public class Lesson05ConditionalStructures03 {
    public static void main(String[] args) {
        double salary = 6000;
        String messageDonate = "I'm going to donate $1000 to charities";
        String messageNotDonate = "I still can't donate $1000 to charities.";
        // (conditional) ? true : false;
        String result = (salary > 5000) ? messageDonate : messageNotDonate;
        System.out.println(result);
    }
}
