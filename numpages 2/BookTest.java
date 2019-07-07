
/**
 * Set numpages and output current page
 * 
 * @author Joshua Deen, Jorge Monzon Diaz
 */

import java.util.Scanner;

public class BookTest
{
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("How many pages does your book have? ");
        
        Book HuckleBerry = new Book(input.nextInt());
        
        System.out.println("This book has " + HuckleBerry.getNumPages() + " pages.");
        
        
        for(int i = 0; i < HuckleBerry.getNumPages(); i++) 
        {
            System.out.println("The current page is " + HuckleBerry.getCurPage());
            HuckleBerry.nextPage();
        }
    }
}
