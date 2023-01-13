import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) throws Exception {
            
        //Arguments inicialize with 0 indice.
        String name = args [0];
        String lastName = args [1];
        int age = Integer.valueOf(args[2]); //What is wrappers?
        double myHeight = Double.valueOf(args[3]);

        System.out.println("Hello, My name is " + name + " " + lastName);
        System.out.println("I'm " + age);
        System.out.println("My height is " + myHeight + "cm ");

        testScanner();

    }

    public static void testScanner(){
        //Creating a scanner object
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);// Locale.US for config in United States Style
        
        System.out.println("Write your name");
        String name2 = scanner.next();
        
        System.out.println("Write your last name");
        String lastName2 = scanner.next();

        System.out.println("Write your age");
        int age2 = scanner.nextInt();
        
        System.out.println("Write your height");
        double height2 = scanner.nextDouble();

        
        //printing the user information.
        System.out.println("Hello, My name is " + name2 + " " + lastName2);
        System.out.println("I'm " + age2);
        System.out.println("My height is " + height2 + "cm ");
    }
}
