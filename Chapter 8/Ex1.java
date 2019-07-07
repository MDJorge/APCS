
/**
 * Write a description of class Ex1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ex1
{
    public static int getYear(double population, int year) {
        while (population < 120000000) {
            population += (population * .017);
            year +=1;
        }
        return year;
    }
}
