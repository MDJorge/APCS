
/**
 * Write a description of class Ex11 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ex11
{
    public static void printStarTriangle(int n) {
        for (int rows = 0; rows < n; rows += 2) {
            for (int spaces = 0; spaces < n - rows; spaces++) {
                System.out.print(" ");
            }
            for (int stars = 0; stars < rows * 2 + 1; stars++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
