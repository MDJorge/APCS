
/**
 * Write a description of class PerfectSquares here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ex7
{
   public static boolean isPerfectSquare(int n) {
       int sum = 0;
       int increment = 1;
       while (sum < n) {
           sum += increment;
           increment += 2;
       }
       if (sum == n) {
           return true;
       } else {
            return false;
       }
   }
   public static boolean isPerfectSquare2(int n) {
       int sum = 0;
       for(int increment = 1; sum < n; increment += 2) {
           sum +=increment;
        }
       if (sum == n) {
           return true;
       } else {
            return false;
       }
   }
   public static boolean isPerfectSquare3(int n) {
       int increment = 0;
       int sum = 0;
       while (sum < n) {
           sum += increment;
           if (sum == n) {
               return true;
           }
           increment += 2;
        }
       return false;
   }
   public static boolean isPerfectSquare4(int n) {
       int sum = 0;
       for(int increment = 1; sum < n; increment += 2) {
           sum += increment;
           if (sum == n) {
               return true;
           }
       }
       return false;
   }
}
