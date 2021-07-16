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
        System.out.println("Time concatStringBuffer: " + (end3 - start3) + "ms" );
    }

    private static void concatString(int size) {
        String text = "Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium" +
                "totam rem aperiam, eaque ipsa quae ab illo inventore veritatis" +
                " et quasi architecto beatae vitae dicta sunt explicabo. Nemo enim ipsam voluptatem quia voluptas sit " +
                "aspernatur aut odit aut fugit, sed quia consequuntur magni dolores eos qui ratione voluptatem sequi nesciunt. Neque porro quis.\n" +
                "\n" +
                "Ur aut odit aut fugit, sed quia consequuntur magni dolores eos qui ratione voluptatem sequi nesciunt." +
                "Neque porro quisquam est, qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit, sed quia non" +
                "numquam eius modi tempora incidunt ut labore et dolore magnam aliquam quaerat voluptatem. Ut enim ad minima" +
                "veniam, quis nostrum exercitationem ullam corporis suscipit laboriosam, nisi ut aliquid ex ea commodi consequatur?" +
                "Quis autem vel eum iure reprehenderit qui in ea voluptate velit esse quam nihil molestiae consequatur, vel illum qui" +
                "dolorem eum fugiat quo voluptas nulla pariatur?\n" +
                "\n" +
                "Omnis iste natus et fugit, sed quia consequuntur magni dolores eos qui ratione voluptatem sequi nesciunt." +
                "Neque porro quisquam est, qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit, sed quia non" +
                "numquam eius modi tempora incidunt ut labore et dolore magnam aliquam quaerat voluptatem. Ut enim ad minima veniam," +
                "quis nostrum exercitationem ullam corporis suscipit laboriosam, nisi ut aliquid ex ea commodi consequatur? Quis autem" +
                "" +
                "vel eum iure reprehenderit qui in ea voluptate velit esse quam nihil molestiae consequatur, vel illum qui dolorem eu" +
                "fugiat quo voluptas nulla pariatur?\n" +
                "\n" +
                "Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam" +
                "rem aperiam, eaque ipsa quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt explicabo." +
                "Nemo enim ipsam voluptatem quia voluptas sit aspernatur aut odit aut fugit, sed quia consequuntur magni dolores" +
                "eos qui ratione voluptatem sequi nesciunt. Neque porro quisquam est, qui dolorem ipsum quia dolor sit" +
                "amet, consectetur, adipisci velit, sed quia non numquam eius modi tempora incidunt ut labore et dolor" +
                "magnam aliquam quaerat voluptatem. Ut enim ad minima veniam, quis nostrum exercitationem ullam corporis" +
                "suscipit laboriosam, nisi ut aliquid ex ea commodi consequatur? Quis autem vel eum iure reprehenderit" +
                "qui in ea voluptate velit esse quam nihil molestiae consequatur, vel illum qui dolorem eum fugiat quo voluptas nulla pariatur? ";

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
