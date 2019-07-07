
/**
 * Write a description of class Book here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Book
{
    private int numPages, currentPage;

    /**
     * Constructor for objects of class Book
     */
    public Book(int n)
    {
        numPages = n;
        currentPage = 1;
    }

    public void nextPage()
    {
        if( currentPage < numPages ) 
        {
            currentPage++;
        }
    }
    
    public int currentPage() 
    {
        return currentPage;
    }
    
    public int numPages()
    {
        return numPages;
    }
}
