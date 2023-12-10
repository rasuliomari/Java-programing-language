public class qn5 {

    public static void main(String[] args) {
        // Loop through rows
        for (int i = 1; i <= 5; i++) {
            // Loop through columns
            for (int j = 1; j <= i; j++) {
                System.out.print("*"); // Print asterisk
            }
            System.out.println(); // Add new line after each row
        }
    }
}
