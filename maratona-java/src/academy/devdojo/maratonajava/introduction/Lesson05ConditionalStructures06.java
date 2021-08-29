package academy.devdojo.maratonajava.introduction;

public class Lesson05ConditionalStructures06 {
    public static void main(String[] args) {
        // Utilizando switch e dados os valores 1 a 1, imprima se é dia útil ou final de semana
        // Considerando 1 como domingo
        byte day = 1;
        switch (day) {
            case 1:
            case 7:
                System.out.println("Weekend");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Business Day");
                break;
            default:
                System.out.println("Invalid option!!!");
                break;
        }
    }
}
