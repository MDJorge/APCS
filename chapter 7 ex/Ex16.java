
/**
 * Write a description of class Ex16 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.awt.Color;
import java.lang.Math;

public class Ex16
{
    public static Color bestMatch(int r, int g, int b) {
        Color bestColor = Color.GRAY;
        if (b > g + r) {
            bestColor = Color.BLUE;
        } else if (g > b + r) {
            bestColor = Color.GREEN;
        } else if (r > b + r) {
            bestColor = Color.RED;
        } else if (g + r >= b) {
            bestColor = Color.YELLOW;
        } else if (r + b >= g) {
            bestColor = Color.MAGENTA;
        } else if (g + b >= r) {
            bestColor = Color.CYAN;
        }
       return bestColor;
    }
}
