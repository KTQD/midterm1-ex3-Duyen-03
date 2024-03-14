import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    String inputFilePath = "input.txt";
    String outputFilePath = "output.txt";
    File inputFile = new File(inputFilePath);
    try {
        Scanner scanner = new Scanner(inputFile);
            PrintWriter writer = new PrintWriter(outputFilePath);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String replacedLine = line.replace("Nha Trang", "Vũng Tàu");
                   writer.println(replacedLine);
            }
        scanner.close();
            writer.close();
        } catch (FileNotFoundException e) {
        System.err.println("File không tìm thấy: " + e.getMessage());
        }

    }
}
