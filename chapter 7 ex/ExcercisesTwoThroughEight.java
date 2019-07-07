
/**
 * Chapter Seven Excercises
 * 
 * @author Jorge Monzon Diaz
 */

public class ExcercisesTwoThroughEight
{
    // Ex 2: Calculate wages, taking overtime into account
    public static double totalWages(double hours, double rate) {
        double wages;
        
        if (hours > 40) {
            wages = hours * rate + ((hours % 40) * .5 * rate);
        } else {
            wages = hours * rate;
        }
        
        return wages;
    }
    
    
    // Ex 3: Invent three ways to express a XOR operator (only return true if ONLY one is true)
    public static boolean XOR1(boolean x, boolean y) {
        return x != y;
    }
    public static boolean XOR2(boolean x, boolean y) {
        return x ^ y;
    }
    public static boolean XOR3(boolean x, boolean y) {
        return (x && !y) || (!x && y);
    }
    
    // Ex 4: Multiple choice question
    // Answer is choice C because !(a || !b) is the same as !a && b
    // Use "false" as a and "true" as b to see example
    public static boolean boolTest(boolean a, boolean b) {
        return !(a || !b);
    }
    public static boolean boolTest2(boolean a, boolean b) {
        return !a && b;
    }
    
    // Ex 5: Simplify expressions to remove parentheses
    // 5a expression:   !((!x || y) && (a || b))
    // 5a simplified:   !(!x || y) && !(a || b)
    // 5b expression:   (!(x == 7) && !(x > 7))
    // 5b simplified:   x != 7 && x <= 7
    
    // Ex 6: 
    // 6a expression:   if ((((x + 2) > a) || ((x – 2) < b)) && (y >= 0))
    // 6a simplified:   if ((x + 2 > a || x – 2 < b) && y >= 0)
    // 6b expression:   if (!(x == 7) && !(x > 7))
    // 6b simplified:   if (x != 7 && x <= 7)
    
    //Ex 7: Avoid a possible arithmetic metic exception
    // broken:  if (Math.sqrt(x) < 3 && x > 7)
    // fixed:   if ((int)(Math.sqrt(x)) < 3 && x > 7)
    
    /*Ex 8:  Write a Boolean expression that evaluates to true if and only if the values
             of three integer variables a, b, and c form a geometric sequence*/
    public static boolean geometricSequenceTest(int a, int b, int c) {
        if ((a > 0 && b > 0 && c > 0) && b * b == a * c) {
            return true;
        } else {
            return false;
        }
    }
}