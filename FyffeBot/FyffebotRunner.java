import java.io.PrintStream;
import java.util.Scanner;

public class FyffebotRunner
{

    public FyffebotRunner()
    {
    }

    public static void main(String args[])
    {
        FyffeBot bot = new FyffeBot();
        System.out.println(bot.Greeting());
        Scanner in = new Scanner(System.in);
        for(String statement = in.nextLine(); !statement.equals("So long"); statement = in.nextLine())
            System.out.println(bot.getResponse(statement));

    }
}