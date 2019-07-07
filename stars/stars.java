
/**
 * Write a description of class stars here.
 * Michael Hess
 *  
 * @version (a version number or a date)
 */
public class stars
{
    public static void main (String[] args)
    {
        printStars(5);
        System.out.print("\n\n");
        printTriangle(5);
        System.out.println();
        recurTriangle(5);
        System.out.println();
        recurTriangleDown(5);
        System.out.println();
    }
    
    public static void printStars(int n)
    {
        for(int i = 1; i <= n; i++)
        {
            System.out.print("*");
        }
    }
    
    public static void printTriangle(int n)
    {
        for(int i = 1; i <= n; i++)
        {
            for(int k = 1; k <= i; k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    public static String recurTriangle(int n)
    {
        if (n > 0)
        {
            String triangle = recurTriangle(n - 1);
            triangle = triangle + "*";
            System.out.println(triangle);
            return triangle;
        } else {
            return "";
        }
     }
     
    public static String recurTriangleDown(int n)
    {
        if (n > 0)
        {
          String triangle = "";
          
          printStars(n);
          System.out.println(triangle);
          return triangle + recurTriangleDown(n - 1);
        } else {
            return "";
        }
    }
}