import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class create {
    public static void main(String[] args) {
        // Specify the file path
        String filePath = "example.txt";

        // Content to write to the file
        String fileContent = "Hello, this is a text file.";

        try {
            // Convert the content to bytes
            byte[] contentBytes = fileContent.getBytes();

            // Create a Path object
            Path path = Paths.get(filePath);

            // Write the content to the file (create or overwrite)
            Files.write(path, contentBytes, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);

            System.out.println("Text file created successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
