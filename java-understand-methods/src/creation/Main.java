package creation;

/**
 * Main class for the exercises of class 1
 */

public class Main {
    public static void main(String[] args) {
        
        // Calculator
        System.out.println("Calculator exercise");
        Calculator.sum(3, 6);
        Calculator.subtraction(9, 1.8);
        Calculator.multiplication(7, 8);
        Calculator.division(5, 2.5);

        // Message
        System.out.println("Message exercise");
        Message.getMessage(9);
        Message.getMessage(14);
        Message.getMessage(1);

        // Loan
        System.out.println("Loan exercise");
        Loan.calculator(1000, Loan.getTwoInstallments());
        Loan.calculator(1000, Loan.getThreeInstallments());
        Loan.calculator(1000, 5);
        
    }
}
