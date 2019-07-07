/**
 * Michael Hess
 * This is a class that tests the Card class.
 */
public class CardTester {

    /**
     * The main method in this class checks the Card operations for consistency.
     *  @param args is not used.
     */
    public static void main(String[] args) {
        /* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
        
        Card oneBlackHearts = new Card("Diamond", "Black", 1);
        Card twoRedSpades = new Card("Triangle", "Red", 2);
        Card threeBlackDiamonds = new Card("Diamonds", "Black", 3);
        
        System.out.println("toString: " + oneBlackHearts.toString() +
                           "\nsuit: " + oneBlackHearts.suit() +
                           "\nrank: " + oneBlackHearts.rank() +
                           "\npointValue: " + oneBlackHearts.pointValue() +
                           "\noneBlackHearts = twoRedSpades? " + oneBlackHearts.matches(twoRedSpades) +
                           "\noneBlackHearts = threeBlackDiamonds? " + oneBlackHearts.matches(threeBlackDiamonds));
                           
        System.out.println("\n");

        System.out.println("toString: " + twoRedSpades.toString() +
                           "\nsuit: " + twoRedSpades.suit() +
                           "\nrank: " + twoRedSpades.rank() +
                           "\npointValue: " + twoRedSpades.pointValue() +
                           "\ntwoRedSpades = oneBlackHearts? " + twoRedSpades.matches(oneBlackHearts) +
                           "\ntwoRedSpades = threeBlackDiamonds? " + twoRedSpades.matches(threeBlackDiamonds));
        
        System.out.println("\n");

        System.out.println("toString: " + threeBlackDiamonds.toString() + 
                           "\nsuit: " + threeBlackDiamonds.suit() +
                           "\nrank: " + threeBlackDiamonds.rank() +
                           "\npointValue: " + threeBlackDiamonds.pointValue() +
                           "\nthreeBlackDiamonds = oneBlackHearts? " + threeBlackDiamonds.matches(oneBlackHearts) +
                           "\nthreeBlackDiamonds = twoRedSpades? " + threeBlackDiamonds.matches(twoRedSpades));
        
    }
}
