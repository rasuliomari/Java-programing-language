import java.io.File;
import java.io.IOException;

public class creating {
    public static void main(String[] args) {
        // Specify the file path
        String filePath = "new.txt";

        // Create the file object
        File file = new File(filePath);

        try {
            // Create the file
            if (file.createNewFile()) {
                System.out.println("File created successfully.");
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred while creating the file.");
            e.printStackTrace();
        }
    }
}
