import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.*;

public class qn4 {

    public static void main(String[] args) {
        try {
            // Write "Hello World" to the file
            writeToFile("FirstProg.java", "Hello World");

            // Read the content of the file
            String content = readFromFile("FirstProg.java");

            // Print the content
            System.out.println("Content of FirstProg.java: " + content);

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

    private static void writeToFile(String fileName, String content) throws IOException {
        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName))) {
            writer.println(content);
            System.out.println("Successfully wrote \"" + content + "\" to " + fileName);
        }
    }

    private static String readFromFile(String fileName) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            StringBuilder sb = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                sb.append(line).append("\n");
            }
            return sb.toString().trim();
        }
    }
}
