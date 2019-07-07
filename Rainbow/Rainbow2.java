/**
 * @author Jorge Monzon Diaz
 * Version 2
 */

import java.awt.*;
import javax.swing.*;

public class Rainbow2 extends JPanel
{
  // Declare skyColor:
  private Color skyColor = Color.CYAN;

  public Rainbow2()
  {
    setBackground(skyColor);
  }

  // Draws the rainbow.
  public void paintComponent(Graphics g)
  {
    super.paintComponent(g);
    int width = getWidth();    
    int height = getHeight();

    // Declare and initialize local int variables xCenter, yCenter
    // that represent the center of the rainbow rings:
    int xCenter = width / 2;
    int yCenter = (height * 3) / 4;

    // Declare and initialize the radius of the large semicircle:
    int largeRadius = width / 4;

    
    //g.fillArc(x position= xcenter - (currentRadius/2),
    //          y position= ycenter - (currentRadius / 2) + (largestRadius / 4) - (height / 4), 
    //          width = currentRadius,
    //          height = currentRadius,
    //          starting angle = 0, 
    //          ending angle = 180);
    
    //x-axis get centered by subtracting (radius/2) from xCenter
    
    //y-axis get centered by subtracting (radius/2) from yCenter, then adding (largeRadius/4), and subtracting (height/4)
    //you add (largeRadius/4) because it needs to shift down all semi circles
    //NOTE: You can't do (largeRadius/2) because that only works if you have an entire circle
    //subtract by (height/4) because of the (3/4) height requirement
    
    // Draw the large semicircle:
    g.setColor(Color.RED);
    g.fillArc(centerX(largeRadius), centerY(largeRadius), largeRadius, largeRadius, 0, 180);
    
    // Declare and initialize the radii of the small and medium
    // semicircles and draw them:
    int smallRadius = height / 4;
    int mediumRadius = (int)(Math.sqrt(smallRadius * largeRadius));
    
    //medium semi-circle
    g.setColor(Color.GREEN);
    g.fillArc(centerX(mediumRadius), centerY(mediumRadius), mediumRadius, mediumRadius, 0, 180);

    //small semi-circle
    g.setColor(Color.MAGENTA);
    g.fillArc(centerX(smallRadius), centerY(smallRadius), smallRadius, smallRadius, 0, 180);

    // Calculate the radius of the innermost (sky-color) semicircle
    // so that the width of the middle (green) ring is the
    // arithmetic mean of the widths of the red and magenta rings:
    int innermostRadius = (int)((2 * Math.sqrt(smallRadius * largeRadius)) / 4);
    
    // Draw the sky-color semicircle:
    g.setColor(skyColor);
    g.fillArc(centerX(innermostRadius), centerY(innermostRadius), innermostRadius, innermostRadius, 0, 180);
  }
  
  //method to calculate center positioning in the x-axis for a semi-cricle
  public int centerX(int radius) {
    int width = getWidth();    
    int height = getHeight();
    
    int xCenter = width / 2;
    
    return xCenter - (radius / 2);
  }
  
  //method to calculate center positioning in the y-axis for a semi-cricle
  public int centerY(int radius) {
    int width = getWidth();    
    int height = getHeight();
    
    int yCenter = (height * 3) / 4;
    int largeRadius = width / 4;
    
    return yCenter - (radius / 2) + (largeRadius / 4) - (height / 4);
  }

  public static void main(String[] args)
  {
    JFrame w = new JFrame("Rainbow");
    w.setBounds(300, 300, 300, 200);
    w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Container c = w.getContentPane();
    c.add(new Rainbow2());
    w.setVisible(true);
  }
}
