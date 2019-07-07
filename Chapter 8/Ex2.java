
/**
 * Write a description of class Ex2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ex2
{
    public static void main(String[] args) {
        double progress = 0;
        int months = 10;
        while(progress < .95) {
            progress += .1;
            months -= 1;
            System.out.println("more months needed to pass: " + months);
        }
    }
}
