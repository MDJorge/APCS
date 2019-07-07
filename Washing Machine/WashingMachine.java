//part a
public double salePrice() {
    return getTotalPrice() * (1.0 - discountrate);
}

//part b
public class WashingMachine extends DiscountItem {
    private double markedPrice;
    private double installCost;
    
    public WashingMachine(double rate, double price, double install) {
        super("washing machine", rate);
        markedPrice = price;
        installCost = install;
    }
    
    public void changeinstall(double newCost) {
        installCost = newCost;
    }
    
    public double totalPrice() {
        return markedPrice + installPrice;
    }
}