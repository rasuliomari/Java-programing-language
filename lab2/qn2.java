import java.util.Scanner;

public class qn2 {

    public static void main(String[] args) {
        // Declare variables
        int quantity;
        double totalCost, unitPrice = 100;

        // Get user input
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the quantity:");
        quantity = input.nextInt();

        // Calculate total cost
        totalCost = quantity * unitPrice;

        // Apply discount if cost is greater than 1000
        if (totalCost > 1000) {
            totalCost -= 100.00; // 10% discount
        }

        // Print the total cost
        System.out.printf("Total cost: %.2f\n", totalCost);
    }
}
