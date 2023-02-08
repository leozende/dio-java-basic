import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;

import javax.swing.JOptionPane;

public class CustomizeException_1 {
    public static void main(String[] args) {
        String fileName = JOptionPane.showInputDialog("File name to display: ");

        printFileOnConsole(fileName);
        System.out.print("\nDespite the exception or not, the program continues... ");

    }

    private static void printFileOnConsole(String fileName) {

        try {
            BufferedReader br = readFile(fileName);
            String line = br.readLine();
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            do{
                bw.write(line);
                bw.newLine();
                line = br.readLine();
            } while (line!=null);
            bw.flush();
            bw.close();
        } catch (UnableOpenFileException e) {
            JOptionPane.showMessageDialog(null,e.getMessage());
            e.printStackTrace();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null,"An unexpected error occurred, please contact support. " + e.getMessage());
            e.printStackTrace();
        }

    }
    public static BufferedReader readFile(String fileName) throws UnableOpenFileException {
        File file = new File(fileName);
        try {
            return new BufferedReader(new FileReader(fileName));
        } catch (FileNotFoundException e) {
            throw new UnableOpenFileException(file.getName(), file.getPath());
        }
    }
}

class UnableOpenFileException extends Exception {
    
    private String fileName;
    private String directory;

    public UnableOpenFileException(String fileName, String directory) {
        super("The file " + fileName + " is not found in directory " + directory);
        this.fileName = fileName;
        this.directory = directory;
    }

    @Override
    public String toString() {
        return "UnableOpenFileException [ fileName= " + fileName + ", directory= " + directory + " ]";
    }

}