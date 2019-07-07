import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Morning extends JFrame implements ActionListener
{
  private EasySound rooster;
  private EasySound moo;
  private int time;

  public void actionPerformed(ActionEvent e)
  {
    time++;
    if (time % 2 == 0 )
    {
        rooster.play();
        getContentPane().setBackground(Color.WHITE);
    }
    else {
        moo.play();
        getContentPane().setBackground(Color.BLACK);
    }
  }
  
  /**
   *   Constructor
   */
  public Morning()
  {
    super("Morning");
    
    Container c = getContentPane();
    c.setBackground(Color.WHITE);
    
    this.setVisible(true);
    this.setSize(300, 150);
    
    rooster = new EasySound("roost.wav");
    
    moo = new EasySound("moo.wav");

    time = 1;
  }

  public static void main(String[] args)
  {
    Morning morning = new Morning();
    morning.setDefaultCloseOperation(EXIT_ON_CLOSE);
    
    Timer clock = new Timer(5000, morning); 
    clock.start();
  }
}  
