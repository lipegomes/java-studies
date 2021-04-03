package academy.devdojo.maratonajava.introducao;

public class Lesson07Arrays03 {
    public static void main(String[] args) {
        int[] numbers1 = new int[3];
        int[] numbers2 = {1, 2, 3, 4, 5};
        int[] numbers3 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

//        for (int i = 0; i < numbers1.length; i++) {
//            System.out.println(numbers1[i]);
//        }

        for (int num : numbers1) {
            System.out.println(num);
        }

        for (int num : numbers2) {
            System.out.println(num);
        }

        for (int num : numbers3) {
            System.out.println(num);
        }
    }
}
