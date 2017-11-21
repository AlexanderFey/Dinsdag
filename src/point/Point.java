package point;

/**
 * @author Alexander Feyaerts
 * @version 1.0 21/11/2017 13:41
 */
public class Point {
    private int x;
    private int y;

    public Point() {
        count++;

    }

    public Point(int x, int y) {

        this.x = x;
        this.y = y;
        count++;
    }

    private static final String COLOR = "red";

    private static int count = 0;

    public static int getCount() {
        return count;
    }

    public static String getCOLOR() {
        return COLOR;
    }

}
