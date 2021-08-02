package academy.devdojo.maratonajava.javacore.Ycollections.test;

import academy.devdojo.maratonajava.javacore.Ycollections.domain.VideoGame;

public class VideoGameTest01 {
    public static void main(String[] args) {
        VideoGame xboxSeriesS = new VideoGame(
                "Microsoft",
                "Xbox Series S",
                "White",
                "4.23 pounds",
                " 5.94 x 2.56 x 10.83 inches"
        );
        VideoGame playStation5 = new VideoGame(
                "Sony",
                "Playstation 5",
                "White",
                "14.2 pounds",
                " 18 x 18 x 12 inches"
        );
        System.out.println("xboxSeriesS = playStation5 ?  " + xboxSeriesS.equals(playStation5));
    }
}
