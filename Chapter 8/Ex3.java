
/**
 * Write a description of class Ex3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ex3
{
    public static int addOdds(int n) {
        int total = 0;
        for (int counter = 1; counter < n; counter += 2) {
            total += counter;
        }
        return total;
    }
}
