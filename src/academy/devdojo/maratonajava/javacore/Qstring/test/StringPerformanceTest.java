package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringPerformanceTest {
    public static void main(String[] args) {
        long start1 = System.currentTimeMillis();
        concatString(50_000);
        long end1 = System.currentTimeMillis();
        System.out.println("Time concatString: " + (end1 - start1) + "ms" );

        long start2 = System.currentTimeMillis();
        concatStringBuilder(50_000);
        long end2 = System.currentTimeMillis();
        System.out.println("Time concatStringBuilder: " + (end2 - start2) + "ms" );

        long start3 = System.currentTimeMillis();
        concatStringBuffer(50_000);
        long end3 = System.currentTimeMillis();
        System.out.println("Time concatStringBuilder: " + (end3 - start3) + "ms" );
    }

    private static void concatString(int size) {
        String text = "**** Sabaton - Defence of Moscow ****" +
                "\n" +
                "\n" +
                "As the Wehrmacht overrun, Russia 1941\n" +
                "They don't belong, we stand our ground, a million strong\n" +
                "\n" +
                "We are ready for their strike, face the army of the reich\n" +
                "A million strong, this is our land, they don't belong\n" +
                "\n" +
                "Hear Marshal Zhukov's, and Stalin's orders\n" +
                "Defend the motherland\n" +
                "Moscow shall not fall\n" +
                "\n" +
                "Stand and follow command, our blood for the homeland\n" +
                "Heed the motherland's call, and brace for the storm\n" +
                "Moscow will never give in, there is no surrender\n" +
                "Force them into retreat, and into defeat\n" +
                "\n" +
                "Face the volleys of their guns\n" +
                "For Russia's daughters and her sons\n" +
                "All the brave, who stand against the typhoon wave\n" +
                "\n" +
                "From the mountains and the plains\n" +
                "Come in thousands on the trains\n" +
                "Day and night, they're rolling in, to join the fight\n" +
                "\n" +
                "From Kazakhstan to Magadan\n" +
                "Call of the motherland\n" +
                "Russia shall prevail\n" +
                "\n" +
                "Stand and follow command, our blood for the homeland\n" +
                "Heed the motherland's call, and brace for the storm\n" +
                "Moscow will never give in, there is no surrender\n" +
                "Force them into retreat, and into defeat\n" +
                "\n" +
                "Stand and follow command, our blood for the homeland\n" +
                "Heed the motherland's call, and brace for the storm\n" +
                "Moscow will never give in, there is no surrender\n" +
                "Force them into retreat, and into defeat\n" +
                "\n" +
                "Stand and follow command, our blood for the homeland\n" +
                "Heed the motherland's call, and brace for the storm\n" +
                "Moscow will never give in, there is no surrender\n" +
                "Force them into retreat, and into defeat\n" +
                "\n" +
                "Stand and follow command, our blood for the homeland\n" +
                "\n"+
                "Source: LyricFind" +
                "\n"
                ;

        for (int i = 0; i < size; i++) {
            text +=i;
        }
//        System.out.println(text);
    }

    private static void concatStringBuilder(int size) {
        StringBuilder sb = new StringBuilder(size);
        for (int i = 0; i < size; i++) {
            sb.append(i);
        }
    }

        private static void concatStringBuffer(int size) {
            StringBuffer sbf = new StringBuffer(size);
            for (int i = 0; i < size; i++) {
                sbf.append(i);
            }
    }
}
