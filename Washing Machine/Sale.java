public class Sale extends Transaction {
    private boolean cash;
    private final double discount = .1;
    
    public Sale(String description, int amount, double cost, boolean cash) {
        super(description, amount, cost);
        this.cash = cash;
    }
    
    public double getTotal() {
        return cash ? (getNumItems() * getNumCost()) * (1 - discount)  //if true, get item cost
                + (getNumItems() * getNumCost()) * (Transaction.TAX_RATE) //then add tax
                : super.getTotal(); //if false, calculate without discount
    }
    
    public boolean isCash() {
        return cash;
    }
}