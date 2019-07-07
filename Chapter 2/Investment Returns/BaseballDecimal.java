
/**
 * Calculate baseball player stats
 * 
 * @author Jorge Monzon Diaz
 */
import java.util.Scanner;

public class BaseballDecimal
{
    public static void main ( String[] args )
    {
        Scanner keyboard =  new Scanner ( System.in );
        
        String player;    //player name
        int H,            //hits
        AB,               //at bats
        TB,               //total bases
        B1,               //singles
        B2,               //doubles
        B3,               //triples
        HR,               //home runs
        BB,               //bases on balls (walks)
        HBP,              //hit by pitch
        SF;               //sacrifice flies
        double BA,        //batting average
        SLG,              //slugging percentage
        OBP,              //on-base percentage
        OPS;              //on-base plus slugging percentage
        
        System.out.print("Player name: ");
        player = keyboard.nextLine();  
        System.out.print("Hits: ");
        H = keyboard.nextInt();
        System.out.print("At Bats: ");
        AB = keyboard.nextInt();
        System.out.print("Total Bases: ");
        TB = keyboard.nextInt();
        System.out.print("Singles: ");
        B1 = keyboard.nextInt();
        System.out.print("Doubles: ");
        B2 = keyboard.nextInt();
        System.out.print("Triples: ");
        B3 = keyboard.nextInt();
        System.out.print("Home Runs: ");
        HR = keyboard.nextInt();
        System.out.print("Bases on Balls (Walks): ");
        BB = keyboard.nextInt();
        System.out.print("Hit by Pitch: ");
        HBP = keyboard.nextInt();
        System.out.print("Sacrifice Flies: ");
        SF = keyboard.nextInt();
        
        BA = (double) H / AB;                                   //calc batting average
        SLG = (double) TB / AB;                                 //calc slugging percentage
        OBP = (double) (H + BB + HBP) / (AB + BB + HBP + SF);   //calc on-base percentage
        OPS = (double) SLG + OBP;                               //calc on-base plus slugging percentage
        
        /*round batting average and convert it into a percentage*/
        rounder = BA;
        RoundNum();
        BA = rounder;
        
        /*round slugging percentage and convert it into a percentage*/
        rounder = SLG;
        RoundNum();
        SLG = rounder;
        
        /*round on-base percentage and convert it into a percentage*/
        rounder = OBP;
        RoundNum();
        OBP = rounder;
        
        /*round on-base plus slugging percentage and convert it into a percentage*/
        rounder = OPS;
        RoundNum();
        OPS = rounder;
        
        System.out.println(player + "'s Batting Average is: " + BA);
        System.out.println(player + "'s Slugging Percentage is: " + SLG);
        System.out.println(player + "'s On-base Percentage: " + OBP);
        System.out.println(player + "'s On-base Plus Slugging Percentage is: " + OPS);
    }
    
    public static double rounder;  //temp variable used to round/convert numbers to percent form
    
    public static double RoundNum() //use a temporary variable to round and convert numbers to % form
    {
        rounder = (int)((rounder * 1000) + 0.5);
        rounder /= 1000;
        return rounder;
    }
}
