
/**
 * Write a description of class Ex12 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ex12
{
    public static void fromBelow() {
        //from below
        double fraction = 17.0/76;
        double closest = 9999999;
        double num = 0;
        double denom = 0;
        
        for(double denominator = 1; denominator < 76; denominator++) {
            for(double numerator = 1; numerator < 100; numerator++) {
                double d = Math.abs(fraction - (numerator/denominator));
                if (d < closest) {
                  closest = d;
                  num = numerator;
                  denom = denominator;
                }
            }
        }
        System.out.println((int)num + "/" + (int)denom);
    }
    
    public static void fromAbove() {
        //from below
        double fraction = 17.0/76;
        double closest = 9999999;
        double num = 0;
        double denom = 0;
        
        for(double denominator = 100; denominator > 76; denominator--) {
            for(double numerator = 100; numerator > 0; numerator--) {
                double d = Math.abs(fraction - (numerator/denominator));
                if (d < closest) {
                  closest = d;
                  num = numerator;
                  denom = denominator;
                }
            }
        }
        System.out.println((int)num + "/" + (int)denom);
    }
}
