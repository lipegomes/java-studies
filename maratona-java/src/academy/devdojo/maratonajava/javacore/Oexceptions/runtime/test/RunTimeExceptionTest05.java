package academy.devdojo.maratonajava.javacore.Oexceptions.runtime.test;

public class RunTimeExceptionTest05 {
    public static void main(String[] args) {
        openConnection();
    }

    public static String openConnection() {
        try {
            System.out.println("Loading file x...");
            System.out.println("Loading file y...");
            System.out.println("Updating x and y files.");
            return "Open connection.";
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Connection terminated by the system.");
        }
        return null;
    }
}
