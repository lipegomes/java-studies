package academy.devdojo.maratonajava.javacore.Tresourcebundle.test;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTest01 {
    public static void main(String[] args) {
        System.out.println("Idioma local: " + Locale.getDefault());
        System.out.println();
        // messages_en_US.properties
        System.out.println("--- messages_en_US.properties ---");
        ResourceBundle bundle = ResourceBundle.getBundle("messages", new Locale("en", "US"));
        System.out.println("Hello: " + bundle.getString("hello"));
        System.out.println("Good morning: "+ bundle.getString("good.morning"));
        System.out.println("Welcome: " + bundle.getString("welcome"));
        System.out.println();
        // messages_pt_BR.properties
        System.out.println("--- messages_pt_BR.properties --- ");
        bundle = ResourceBundle.getBundle("messages", new Locale("pt", "BR"));
        System.out.println("Hello: " + bundle.getString("hello"));
        System.out.println("Good morning: "+ bundle.getString("good.morning"));
        System.out.println("Welcome: " + bundle.getString("welcome"));
        System.out.println();
        // messages_pl_PL.properties
        System.out.println("--- messages_pl_PL.properties --- ");
        bundle = ResourceBundle.getBundle("messages", new Locale("pl", "PL"));
        System.out.println("Hello: " + bundle.getString("hello"));
        System.out.println("Good morning: "+ bundle.getString("good.morning"));
        System.out.println("Welcome: " + bundle.getString("welcome"));
        System.out.println();
        // messages.properties
        bundle = ResourceBundle.getBundle("messages");
        System.out.println("--- messages.properties ---");
        System.out.println(bundle.getString("hi"));
    }
}
