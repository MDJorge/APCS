
/**
 * Write a description of class Ex17 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ex17
{
    public static int findBestFit(int size1, int size2, int space) {
        if (space < size1 && space < size2) {
            return 0;
        } else if (space > size1 && space < size2) {
            return 1;
        } else if(space < size1 && space > size2) {
            return 2;
        } else {
            return 3;
        }
    }
}
