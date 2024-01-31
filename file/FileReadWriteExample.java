import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.Scanner;

public class FileReadWriteExample {
    public static void main(String[] args) {
        // Specify the file path
        String filePath = "example.txt";

        // Write content to the file
        writeToFile(filePath);

        // Read content from the file
        readFromFile(filePath);
    }

    private static void writeToFile(String filePath) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(filePath))) {
            // Write three lines of content to the file
            writer.println("Line 1: Hello, this is the first line.");
            writer.println("Line 2: This is the second line.");
            writer.println("Line 3: Finally, the third line.");

            System.out.println("Content written to the file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void readFromFile(String filePath) {
        try (Scanner scanner = new Scanner(Paths.get(filePath))) {
            System.out.println("Reading content from the file:");

            // Read and print each line from the file
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
