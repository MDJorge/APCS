
/**
 * Write a description of class PlayingCard here.
 * 
 * @author Jorge Monzon Diaz
 * @version (a version number or a date)
 */
public class PlayingCard
{
    private int suit, rank;
    
    PlayingCard(int rank, int suit) {
        this.rank = rank;
        this.suit = suit;
    }
    
    PlayingCard() {
        suit = 1;
        rank = 1;
    }
    
    PlayingCard(PlayingCard other) {
        suit = other.suit;
        rank = other.rank;
    }
    
    public int getRank() {
        return rank;
    }
    
    public void setRank(int rank) {
        this.rank = rank;
    }
    
    public int getSuit() {
        return suit;
    }
    
    public void setSuit(int suit) {
        this.suit = suit;
    }
    
    public boolean beats(PlayingCard other) {
        if (this.rank > other.rank) {
            return true;
        } else if (this.rank < other.rank) {
            return false;
        } else if (this.suit > other.suit) {
            return true;
        } else if (this.suit < other.suit) {
            return false;
        } else {
            return false;
        }
    }
}
