import javax.swing.JOptionPane;

//Divide two integer values
public class UncheckedException {
    public static void main(String[] args) {

        boolean continueLooping = true;
        do {
            String a = JOptionPane.showInputDialog("Numerator: ");
            String b = JOptionPane.showInputDialog("Denominator: ");
    
            try {
                int result = divide(Integer.parseInt(a), Integer.parseInt(b));
                System.out.println("Result: " + result);
                continueLooping = false;
                
            } catch (NumberFormatException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null,"Invalid input, please enter an integer! " + e.getMessage());
            } catch (ArithmeticException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null,"Impossible to divide a number by 0. " + e.getMessage());
            } finally {
                System.out.println("You are in the finally");
            }

        } while(continueLooping);

        System.out.println("Here is you, at the final...");
    }

    public static int divide(int a, int b) { return a / b; }
}