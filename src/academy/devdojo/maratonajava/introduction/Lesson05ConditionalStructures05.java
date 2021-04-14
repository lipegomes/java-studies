package academy.devdojo.maratonajava.introduction;

public class Lesson05ConditionalStructures05 {
    public static void main(String[] args) {
        // Print the day of the week, considering 1 as Sunday.
        byte day = 7;
        // char, int, short, enum, String
        switch (day) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid option! Day must be a value between 1 and 7.");
                break;
        }

        char gender = 'M';
        switch (gender) {
            case 'M':
                System.out.println("Man");
                break;
            case 'W':
                System.out.println("Woman");
                break;
            default:
                System.out.println("Invalid!!!");
                break;
        }
    }
}

