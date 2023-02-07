import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] students = {"Camila", "Lucas", "Bruna", "Pedro"};

        double average = calculateAvarageClass(students, scan);

        System.out.printf("Class average %.1f", average);
    }
public static double calculateAvarageClass(String[] students, Scanner scanner) {

        double sum = 0;
        for(String student : students) {
            System.out.printf("Student grade %s: ", student);
            double note = scanner.nextDouble();
            sum += note;
        }

        return sum / students.length;
    }
}