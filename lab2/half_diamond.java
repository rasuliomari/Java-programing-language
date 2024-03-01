public class half_diamond {
    public static void main(String[] args) {
        int n = 5; // Number of rows

        for (int i = 1; i <= n; i++) {
            // Print spaces before the first asterisk
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Print asterisks
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }

            // Move to the next line
            System.out.println();
        }
    }
}
