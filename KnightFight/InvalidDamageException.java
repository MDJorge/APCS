/**
 * Shaun Fyffe
 * InvalidDamageException Exception class
 * Exception for negative damage value
 */
public class InvalidDamageException extends Exception {

    String negative;

    public InvalidDamageException() {
        super();
        negative = "Damage cannot be a negative number";
    }

    public InvalidDamageException(String neg) {
        super(neg);
        negative = neg;
    }

    public String toString() {
        return "Value for damage taken cannot be negative.";
    }
}
