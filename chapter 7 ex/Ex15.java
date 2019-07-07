
/**
 * Write a description of class Ex15 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class Ex15
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        
        System.out.println("How many copies of \"Be Prepared\" would you like?");
        int bp = input.nextInt();
        
        System.out.println("How many copies of \"Next Best\" would you like?");
        int nb = input.nextInt();
        
        System.out.println("Your order total is $" + getOrderTotal(bp, nb));
    }
    
    public static double getOrderTotal(int bp, int nb) {
        int amount = bp + nb;
        double total;
        if (amount >= 12) {
            total = amount * 14;
        } else if (amount >= 3) {
            total = amount * 15.95;
        } else if (bp == 1 && nb == 1) {
            total = 37.95;
        } else {
            total = (bp * 18.95) + (nb * 21.95);
        }
        return total;
    }
}
