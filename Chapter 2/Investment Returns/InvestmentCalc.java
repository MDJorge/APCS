
/**
 * Calculate your return on investment
 * 
 * @author Jorge Monzon Diaz
 */
import java.util.Scanner;

public class InvestmentCalc
{
    public static void main ( String[] args )
    {
        Scanner keyboard =  new Scanner ( System.in );
        
        String comp;    //company name
        int shares;     //number of shares
        double bprice,  //bought price
        sprice,         //sold price
        tdiv,           //total dividend
        roi,            //return on interest
        coi,            //cost on investment
        totalr,         //total return
        gprofit,        //gross profit
        nprofit;        //net profit
        
        System.out.print("What company did you invested in? ");
        comp = keyboard.nextLine();  
        System.out.print("How many shares did you have have in " + comp + "? ");
        shares = keyboard.nextInt();
        System.out.print("What price did you buy them at? ");
        bprice = keyboard.nextDouble();
        System.out.print("What was their sell price? ");
        sprice = keyboard.nextDouble();
        System.out.print("What was your total dividend? ");
        tdiv = keyboard.nextDouble();
        
        coi =  bprice * shares;                 //cost of investement = bought price * shares
        totalr = (sprice * shares) + tdiv;      //total return = (sold price * shares) + total dividends
        gprofit = totalr - coi;                 //gross profit = total - cost of investment
        nprofit = gprofit - bprice - sprice;    //net profit = gross profit - bought price - sold price
        roi = nprofit / coi;                    //return on investment = net profit / cost of investment
        
        roi = (int)((roi * 10000) + 0.5); //round to nearest hundreth place
        roi /= 100;               //convert result back to percent format
        
        System.out.println("Your return on investment for " + comp + " is " + roi + "%");
    }
}
