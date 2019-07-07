import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;

public class Ex9_GradeAvg
{
  public static void main(String[] args)
  {
    Scanner input = null;
    //arraylists are cool
    ArrayList<Integer> scores = new ArrayList<>();
    int sum = 0;

    try
    {
      input = new Scanner(new File("scores.dat"));
    }
    catch (FileNotFoundException e)
    {
      System.out.println("***  Can't open scores.dat ***");
      System.exit(1);
    }
    
    while(input.hasNextInt()) {
        scores.add(input.nextInt());
    }
    for(int i = 0; i < scores.size(); i++) {
        sum += scores.get(i);
    }
    System.out.println("The average score is: " + (double)(sum)/scores.size() + "%");
  }
}
