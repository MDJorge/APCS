
/**
 * Write a description of class Huckleberry here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BookTest
{
    public static void main ( String[] args )
    {
        Book Huckleberry = new Book(3);
        
        Huckleberry.nextPage();
        System.out.println(Huckleberry.currentPage());
        Huckleberry.nextPage();
        System.out.println(Huckleberry.currentPage());
        Huckleberry.nextPage();
        System.out.println(Huckleberry.currentPage());
    }
}
