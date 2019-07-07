
/**
 * Write a description of class Ex14 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ex14
{
    public static void calcCents(int cents) {
        System.out.print(cents + " cents = ");
        System.out.print(cents/25 + " quarters + ");
        System.out.print(cents%25/10 + " dimes + ");
        System.out.print(cents%25%10/5 + " nickels + ");
        System.out.print(cents%25%10%5/1 + " pennies.");
    }
}
