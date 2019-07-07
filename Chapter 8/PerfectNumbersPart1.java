
/**
 * Write a description of class PerfectNumbers here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PerfectNumbersPart1
{
    public static void main(String[] args) {
        System.out.print("\nFirst four perfect numbers: ");
        for(long i = 1; i < 10000; i++) {
            if(isPerfect(i)) {
                System.out.print(i + ", ");
            }
        }
    }
    
    public static boolean isPerfect(long n) {
        if(n == 0) {
            return false;
        }
        long sum = 0; 

        for(long i = 1; i < n; i++)
        {
            if (n % i == 0)
            {
                sum += i;
            }
        }
        
        return sum == n? true : false;
    }
}
