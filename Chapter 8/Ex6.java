
/**
 * Write a description of class Ex6 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ex6
{
    public static boolean isPrime(int n) {
        int m = 2;
        
        if (n <= 1 || n % 2 != 0 || n % 3 != 0) {
            while(m * m <= n) {
                if (n % m == 0) {
                    return false;
                }
                m++;
            }
            return true;
        }
        else {
            return false;
        }
    }
}
