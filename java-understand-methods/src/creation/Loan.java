package creation;

/**
 * Exercise class 1 about methods.
 */

public class Loan {
    
    public static int getTwoInstallments() {
        return 2;
    }

    public static int getThreeInstallments() {
        return 3;
    }

    private static double getRateTwoInstallments() {
        return 0.3;
    }

    private static double getRateThreeInstallments() {
        return 0.45;
    }

    public static void calculator(double valor, int installments) {

        if (installments == 2) {

            double finalValor = valor + (valor * getRateTwoInstallments());

            System.out.println("The loan final valor for 2 installments: R$ " + finalValor);
        } else if (installments == 3) {

            double finalValor = valor + (valor * getRateThreeInstallments());

            System.out.println("The loan final valor for 3 installments: R$ " + finalValor);
        } else {
            System.out.println("Number of installments not accepted");
        }

    }

}
