import java.util.Scanner;

public class qn2b {
    public static void main(String[] args) {
        // Cost per unit
        final double COST_PER_UNIT = 100.0;

        // Discount percentage
        final double DISCOUNT_PERCENTAGE = 10.0;

        Scanner scanner = new Scanner(System.in);

        // Taking input for quantity
        System.out.print("Enter the quantity: ");
        int quantity = scanner.nextInt();

        // Calculating total cost
        double totalCost = quantity * COST_PER_UNIT;

        // Applying discount if the quantity is more than 1000
        if (quantity > 1000) {
            double discount = (DISCOUNT_PERCENTAGE / 100) * totalCost;
            totalCost -= discount;
            System.out.println("You get a 10% discount!");
        }

        // Printing the total cost
        System.out.println("Total cost: $" + totalCost);

        scanner.close();
    }
}
