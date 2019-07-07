
/**
 * Set numpages and output current page
 * 
 * @author Joshua Deen, Jorge Monzon Diaz
 */
public class BookTest
{
    public static void main (String[] args) {
        Book HuckleBerry = new Book(3);
        System.out.println(HuckleBerry.getCurPage());
        HuckleBerry.nextPage();
        System.out.println(HuckleBerry.getCurPage());
        HuckleBerry.nextPage();
        System.out.println(HuckleBerry.getCurPage());
    }
}
