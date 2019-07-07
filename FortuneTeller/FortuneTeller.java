// This is the Fortune Teller applet

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.applet.AudioClip;
import java.util.Random;

public class FortuneTeller extends JApplet
    implements ActionListener
{
  // Declare an array of "fortunes" (strings):
  String [] fortunes = {"Good things will come to you.", "Bad things will come to you", "The power of christ compels you", "Mr Fyffe will pay you a personal visit"};

  private JTextField display;
  private AudioClip ding;

  public void init()
  {
    ding = getAudioClip(getDocumentBase(), "ding.wav");

    display = new JTextField("  Press \"Next\" to see your fortune...", 30);
    display.setBackground(Color.WHITE);
    display.setEditable(false);

    JButton go = new JButton("Next");
    go.addActionListener(this);

    Container c = getContentPane();
    c.setLayout(new FlowLayout());
    c.add(display);
    c.add(go);
  }

  public void actionPerformed(ActionEvent e)
  {
    ding.play();

    // Pick a random fortune:
    Random r = new Random();
    //fortunes[r.nextInt(fortunes.length)]
    //choose a random fortune
    display.setText("  " + fortunes[r.nextInt(fortunes.length)] );
  }
}

