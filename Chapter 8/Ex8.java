
/**
 * Write a description of class Ex8 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ex8
{
    //part a
    //check out this cool thing I learned Mr Fyffe!
    // boolean statement ? true result : false result;
    //so this
    public static int sumDigits(int n) {
        if (n == 0) {
            return 0;
        } else {
            return n % 10 + sumDigits(n/10);
        }
    }
    //is equal to
    public static int sumDigitsCondensed(int n) {
        return n == 0 ? 0 : n % 10 + sumDigits(n/10);
    }
    
    //part b
    public static boolean isDivisibleByThree(int n) {
        if(n == 0) {
            return true;
        }
        else if (n < 0) {
            return false;
        } else {
            return isDivisibleByThree(n - 3);
        }
    }
}
