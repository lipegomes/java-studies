package academy.devdojo.maratonajava.introduction;

public class AccessModifiers {
    public static void main(String[] args) {
        Pilot pilot = new Pilot();

        System.out.println("---> This is a public class <---");
        System.out.println("First name: " + pilot.first_name);
        System.out.println("Last name: " + pilot.last_name);
        System.out.println("Age: " + pilot.age);
        System.out.println("Favorite sport: " + pilot.favorite_sport);
        System.out.println("Best adversary: " + pilot.best_adversary);
    }

    public static class Pilot {
        private String first_name = "Ayrton";
        private String last_name = "Senna";
        private int age = 61;
        private String favorite_sport = "Motoring";
        private String best_adversary = "Alain Prost";
    }

    class Person extends Pilot {
        protected String id = "000.000.000-00";
        protected String cell_phone = "01 0000-0000";

    }
}
