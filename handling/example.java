import java.util.InputMismatchException;
import java.util.Scanner;

public class example {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Enter the first integer (n1): ");
                int n1 = scan.nextInt();

                System.out.print("Enter the second integer (n2): ");
                int n2 = scan.nextInt();

                double result = divide(n1, n2);
                System.out.println("Result of division: " + result);

                // If input is valid, break out of the loop
                break;
            } catch (InputMismatchException e) {
                // Catching InputMismatchException when non-integer input is entered
                System.err.println("Invalid input. Please enter integers.");
                // Clear the scanner buffer to prevent an infinite loop
                scan.nextLine();
            } catch (ArithmeticException e) {
                // Catching ArithmeticException when attempting to divide by zero
                System.err.println("Error: Division by zero is not allowed.");
            }
        }

        // Close the scanner when done
        scan.close();
    }

    // Method to perform division with exception handling
    private static double divide(int numerator, int denominator) {
        if (denominator == 0) {
            // Throw ArithmeticException if attempting to divide by zero
            throw new ArithmeticException("Division by zero");
        }
        return (double) numerator / denominator;
    }
}
