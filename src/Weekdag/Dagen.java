package Weekdag;

/**
 * @author Alexander Feyaerts
 * @version 1.0 21/11/2017 15:06
 */
public class Dagen {

    public enum Day {
        MAANDAG(true), DINSDAG(true), WOENSDAG(true), DONDERDAG(true), VRIJDAG(true), ZATERDAG(false), ZONDAG(false);
        private boolean weekDag;



        @Override
        public String toString() {
            return name ().toLowerCase () +" dag " + ordinal ()+
                    ", WeekDag = " + isweekDag();
        }

        public boolean isweekDag() {
            return weekDag;



        }
        private Day(boolean weekDag){
            this.weekDag = weekDag;
        }

    }
}
