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

    public static final String COLOR = "red";

    public static int count = 0;

    public static int getCount() {
        return count;
    }
}
