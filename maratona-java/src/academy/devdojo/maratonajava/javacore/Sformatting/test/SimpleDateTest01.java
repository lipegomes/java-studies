package academy.devdojo.maratonajava.javacore.Sformatting.test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateTest01 {
    public static void main(String[] args) {
        String pattern1 = "yyyy.MM.dd G 'at' HH:mm:ss z";
        String pattern2 = "hh 'o''clock' a, zzzz";
        String pattern3 = "EEE, MMM d, ''yy";
        String pattern4 = "'Rio de Janeiro' MMMM dd ,yyyy";
        String pattern5 = "h:mm a";
        SimpleDateFormat sdf1 = new SimpleDateFormat(pattern1);
        SimpleDateFormat sdf2 = new SimpleDateFormat(pattern2);
        SimpleDateFormat sdf3 = new SimpleDateFormat(pattern3);
        SimpleDateFormat sdf4 = new SimpleDateFormat(pattern4);
        SimpleDateFormat sdf5 = new SimpleDateFormat(pattern5);
        System.out.println(sdf1.format(new Date()));
        System.out.println(sdf2.format(new Date()));
        System.out.println(sdf3.format(new Date()));
        System.out.println(sdf4.format(new Date()));
        System.out.println(sdf5.format(new Date()));
    }
}
