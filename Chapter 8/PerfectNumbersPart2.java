
/**
 * Write a description of class PerfectNumbers here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.lang.Math;

public class PerfectNumbersPart2
{
    public static void main(String[] args) {
        System.out.print("\nFirst six perfect numbers are: ");
        
        for (long i = 2; i < 18; i++) {
            if(isPrime(i)) {
                long x = (long)(Math.pow(2,i-1)*(Math.pow(2,i)-1));
                if (x != 2096128 && x != 0) {
                    System.out.print(x + ", ");
                }
            }
        }
    }

    public static boolean isPrime(long n) {
        for (long x = 2; x < n; x++) {
            if (n % x == 0) {
                return false;
            }
        }
        return true;
    }
}
