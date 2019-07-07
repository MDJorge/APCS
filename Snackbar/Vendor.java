
/*
   This class implements a vendor that sells one kind of items.
   A vendor carries out sales transactions.
*/

public class Vendor
{
  // Fields:
  private int price, stock, deposit, change;
  private static double totalSales = 0; //initialize total

  //  Constructor
  //  Parameters:
  //    int price of a single item in cents
  //    int number of items to place in stock
  public Vendor(int cents, int number) {
    price = cents;
    stock = number;
    deposit = 0;
    change = 0;
  }

  //  Sets the quantity of items in stock.
  //  Parameters:
  //    int number of items to place in stock
  //  Return:
  //    None
  public void setStock(int number) {
    stock = number;
  }

  //  Returns the number of items currently in stock.
  //  Parameters:
  //    None
  //  Return:
  //    int number of items currently in stock
  public int getStock() {
    return stock;
  }

  //  Adds a specified amount (in cents) to the deposited amount.
  //  Parameters:
  //    int number of cents to add to the deposit
  //  Return:
  //    None
  public void addMoney(int cents) {
    deposit += cents;
  }

  //  Returns the currently deposited amount (in cents).
  //  Parameters:
  //    None
  //  Return:
  //    int number of cents in the current deposit
  public int getDeposit() {
    return deposit;
  }

  //  Implements a sale.  If there are items in stock and
  //  the deposited amount is greater than or equal to
  //  the single item price, then adjusts the stock
  //  and calculates and sets change and returns true;
  //  otherwise refunds the whole deposit (moves it into change)
  //  and returns false.
  //  Parameters:
  //    None
  //  Return:
  //    boolean successful sale (true) or failure (false)
  public boolean makeSale() {
    if (stock > 0 && deposit >= price) {
        stock--;
        deposit -= price;
        change = deposit;
        deposit = 0; //change thing was broken in last version because I forgot to reset it
        totalSales += (double)price / 100;
        return true;
    } else {
        change = deposit;
        deposit = 0;
        return false;
    }
  }

  //  Returns and zeroes out the amount of change (from the last
  //  sale or refund).
  //  Parameters:
  //    None
  //  Return:
  //    int number of cents in the current change
  public int getChange() {
    int lastPurchase = change;
    change = 0;
    return lastPurchase;
  }
  
  public static double getTotalSales() {
      double temp = totalSales; // store in temporary variable because total needs to be reset
      totalSales = 0; // reset total
      return temp; //return total before reset
  }
}
