public class NoExactDivisionException extends Exception {
    
    private int numerator;
    private int denominator;
    
    public NoExactDivisionException(String message, int numerator, int denominator) {
        super(message);
        this.numerator = numerator;
        this.denominator = denominator;
    }
    
}
