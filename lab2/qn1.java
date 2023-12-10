import java.util.Scanner;

public class qn1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user for length and breadth
        System.out.println("Enter the length of the rectangle:");
        float length = input.nextFloat();

        System.out.println("Enter the breadth of the rectangle:");
        float breadth = input.nextFloat();

        // Check if length and breadth are equal
        if (length == breadth) {
            System.out.println("The shape is a square.");
        } else {
            System.out.println("The shape is a rectangle.");
        }
    }
}
