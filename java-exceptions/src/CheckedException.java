import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;

import javax.swing.JOptionPane;

// print on console
public class CheckedException {
    public static void main(String[] args) {
        String fileName = "test-file.txt";
        try {
            printFileOnConsole(fileName);
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null,"Review the name of the file you want to print! " + e.getCause());
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null,"An unexpected error occurred! Please contact support! " + e.getCause());
            e.printStackTrace();
        } finally {
            System.out.println("Arrived at finally");
        }

        System.out.println("Despite the exception or not, the program continues... ");
    }

    private static void printFileOnConsole(String fileName) throws IOException {
        File file = new File(fileName);

        BufferedReader br = new BufferedReader(new FileReader(file.getName()));
        String line = br.readLine();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        do{
            bw.write(line);
            bw.newLine();
            line = br.readLine();
        } while(line!=null);
        bw.flush();
        bw.close();
    }

}
