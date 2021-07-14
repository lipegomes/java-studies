package academy.devdojo.maratonajava.introduction;

public class Arrays {
    public static void main(String[] args) {
        String[] cities = {"Rio de Janeiro", "São Paulo", "Curitiba", "Florianópolis", "Porto Alegre"};
        //Access the Elements of an Array
        System.out.println(cities[0]);
        System.out.println(cities[1]);
        System.out.println(cities[2]);
        System.out.println(cities[3]);
        System.out.println(cities[4]);
        System.out.println();

        // Change an Array Element
        cities[0] = "Brasília";
        System.out.println(cities[0]);

        // Array Length
        System.out.println(cities.length);
        System.out.println();

        // Loop Through an Array
        for (int i = 0; i < cities.length; i++) {
            System.out.println(cities[i]);
        }

        System.out.println();

        // Loop Through an Array with For-Each
        for (String j : cities) {
            System.out.println(j);
        }

        System.out.println();

        // Multidimensional Arrays
        int[][] numbers = {{1, 2, 3, 4, 5, 6,}, {7, 8, 9, 10}};
        int x = numbers[1][3];
        System.out.println(x);

        System.out.println();

        // Loop Through an Multidimensional Arrays
        for (int i = 0; i < numbers.length; i++) {
            for(int j = 0; j < numbers[i].length; j++) {
                System.out.println(numbers[i][j]);
            }
        }
    }
}
