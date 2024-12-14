public class Race {
String winner;
public Race(int speed1, int speed2, int speed3, String name1, String name2, String name3){
    if (speed1 * 24 > speed2 *24) {
        winner = name1;
    } else {
        winner = name2;
    }
    if ((speed3 * 24 > speed1 * 24) && (speed3 * 24 > speed2 *24)) {
        winner = name3;
    }
    }
}







