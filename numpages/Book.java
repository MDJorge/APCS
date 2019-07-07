
/**
 * Make a constructor called book and two methods to return the number of pages and current page
 * 
 * @author Joshua Deen, Jorge Monzon Diaz
 */
public class Book
{
    private int numPages, currentPage;
    
    public Book(int n) {
        numPages = n;
        currentPage = 1;
    }
    
    public int nextPage()
    {
       if(currentPage < numPages ) 
       {
           currentPage++;
       }
       return currentPage;
    }
    
    public int getCurPage()
    {
        return currentPage;
    }
    
    public int getNumPages()
    {
        return numPages;
    }
}
