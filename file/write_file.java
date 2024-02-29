import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class write_file {
    public static void main(String[] args) {
        String fileName = "new.txt";

        // Writing to a file using PrintWriter
        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName))) {
            writer.println("Hello, this is a test file.");
            writer.println("Writing to files in Java is fun!");
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }
}