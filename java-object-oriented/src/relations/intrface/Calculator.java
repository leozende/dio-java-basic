package relations.intrface;

/**
 * Class about interface
 */

class Calculator implements MathOperations{
    
    @Override
    public void sum(double operator1, double operator2) {
        System.out.println("Sum : " + operator1 + operator2);
    }
    
    @Override
    public void subtraction(double operator1, double operator2) {
        System.out.println("Subtraction : " + (operator1 - operator2));
    }

    @Override
    public void multiplication(double operator1, double operator2) {
        System.out.println("Multiplication : " + operator1 * operator2);
    }

    @Override
    public void division(double operator1, double operator2) {
        System.out.println("Division : " + operator1 / operator2);
    }
}
