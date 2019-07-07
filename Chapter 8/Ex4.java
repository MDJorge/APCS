
/**
 * Write a description of class Ex4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ex4
{
    //question 1
    public static double ch4Ex1(int n) {
        double sum = 0;
        for(int i = 1; i <= n; i++) {
            sum += 1.0/(i*i);
        }
        return sum;
    }
    
    //question 2
    public static double ch4Ex2(int n) {
        double sum = 0;
        for(int i = 1; i <= n; i++) {
            if(i%2 == 0) {
                sum -= 1.0/i;
            } else {
                sum += 1.0/i;
            }
        }
        return sum;
    }
}
