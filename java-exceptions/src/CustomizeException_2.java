import javax.swing.JOptionPane;

public class CustomizeException_2 {
    public static void main(String[] args) {
        int[] numerator = {4, 5, 8, 10};
        int[] denominator = {2, 4, 0, 2, 8};

        for (int i = 0; i < denominator.length; i++) {
            try {
                if(numerator[i] % 2 != 0) 
                    throw new NoExactDivisionException("No exact division! ", numerator[i], denominator[i]);
    
                int result = numerator[i] / denominator[i];
                System.out.println(result);
                
            } catch (NoExactDivisionException |ArithmeticException | ArrayIndexOutOfBoundsException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null,e.getMessage());
            }

        }
        System.out.println("The program continue...");
    }
}

