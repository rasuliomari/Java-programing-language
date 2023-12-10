import java.util.Scanner;

public class qn4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get user input
        System.out.println("Enter your salary:");
        double salary = input.nextDouble();

        System.out.println("Enter your years of service:");
        int yearsOfService = input.nextInt();

        // Calculate bonus
        double bonus;
        if (yearsOfService > 5) {
            bonus = salary * 0.05;
        
        // Calculate net bonus
        double netBonus = salary + bonus;

        // Print net bonus
        System.out.println("congratulation, you are qualified to get a bonus.");
        System.out.printf("Your salary is : %.2f\n", salary);
        System.out.printf("Net bonus: %.2f\n", netBonus);

        } else {
             System.out.printf("Your salary is : %.2f\n", salary);
             System.out.println("Sorry, you are not qualified to get a bonus.");
        }


    }
}
