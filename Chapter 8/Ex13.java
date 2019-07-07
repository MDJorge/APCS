
/**
 * Write a description of class Ex13 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Ex13
{
    private static final double RIPPLE_PRICE = .26;
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String trueOrFalse = "y";
        int quantity = 0;
        
        while(trueOrFalse == "y" || trueOrFalse == "Y") {
            System.out.print("Enter quantity: ");
            quantity = input.nextInt();
            input.nextLine();
            if (quantity % 25 == 0) {
                System.out.printf("You have ordered %d ripples -- $%.2f\n\n", quantity, RIPPLE_PRICE * quantity);
            } else {
                System.out.println("Ripples can only be ordered in packs of 25.");
            }
            
            System.out.print("\nNext customer (y/n): ");
            trueOrFalse = input.nextLine();
        }
        
        System.out.println("Thank you for using Ripple Systems.");
    }
}
