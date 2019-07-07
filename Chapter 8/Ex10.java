
/**
 * Write a description of class Ex10 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ex10
{
    public static double sqrtEst(double a) {
        double r = a/2;
        double diff;
        
        do {
            r = .5 * (r + (a/r));
        } while (((r*r) - a) > .01);
        
        return r;
    }
}
