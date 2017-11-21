package Weekdag;
import Weekdag.Dagen.*;

public class DagenDemo {
    public static void main(String[] args) {
        for(Day day: Day.values ()){
            System.out.println (day);
        }
    }
}
