
/**
 * Write a description of class Ex5 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class Ex5
{
    public static void summation() {
        Scanner input = new Scanner(System.in);
        int entered;
        
        System.out.print("Enter a positive integer under 10: ");
        entered = input.nextInt();
        if (entered == 0 || entered == 1) {
            System.out.println(entered + " = " + entered);
        } else {
            int sum = 0;
            for(int i = 1; i <= entered; i++) {
                sum += i;
                if (i == entered) {
                    System.out.print(i + " = " + sum);
                } else
                    System.out.print(i + " + ");
            }
        }
    }
}
