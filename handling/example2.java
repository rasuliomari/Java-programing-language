import java.util.InputMismatchException;
import java.util.Scanner;

// Custom exception class for divide by zero
class DivideByZeroException extends RuntimeException {
    public DivideByZeroException(String message) {
        super(message);
    }
}

public class example2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            try {
                double result = returnRatio(scan);
                System.out.println("Result of division: " + result);

                // If input is valid, break out of the loop
                break;
            } catch (InputMismatchException e) {
                // Catching InputMismatchException when non-integer input is entered
                System.err.println("Invalid input. Please enter integers.");
                // Clear the scanner buffer to prevent an infinite loop
                scan.nextLine();
            } catch (DivideByZeroException e) {
                // Catching DivideByZeroException when attempting to divide by zero
                System.err.println("Error: " + e.getMessage());
            }
        }

        // Close the scanner when done
        scan.close();
    }

    // Method to perform division with exception handling
    private static double returnRatio(Scanner scanner) {
        try {
            System.out.print("Enter the first integer (n1): ");
            int n1 = scanner.nextInt();

            System.out.print("Enter the second integer (n2): ");
            int n2 = scanner.nextInt();

            if (n2 == 0) {
                // Throw DivideByZeroException if attempting to divide by zero
                throw new DivideByZeroException("Division by zero is not allowed.");
            }

            return (double) n1 / n2;
        } catch (InputMismatchException e) {
            // Rethrow InputMismatchException with a more specific message
            throw new InputMismatchException("Invalid input. Please enter integers.");
        }
    }
}
