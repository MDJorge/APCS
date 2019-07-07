
/**
 * Chapter 2 - Exercise 11
 * Multiply user input by two
 * 
 * @author Jorge Monzon Diaz
 */
import java.util.Scanner;

public class Multiply
{
    public static void main ( String[] args )
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int input = keyboard.nextInt();
        System.out.println("2 * " + input + " = " + (2 * input));        
    }
}
