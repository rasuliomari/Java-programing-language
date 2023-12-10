import java.util.Scanner;

public class qn3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Initialize variables
        int age1, age2, age3, youngest, oldest;

        // Get user input
        System.out.println("Enter age of person 1:");
        age1 = sc.nextInt();

        System.out.println("Enter age of person 2:");
        age2 = sc.nextInt();

        System.out.println("Enter age of person 3:");
        age3 = sc.nextInt();

        // Find youngest
        youngest = Math.min(age1, Math.min(age2, age3));

        // Find oldest
        oldest = Math.max(age1, Math.max(age2, age3));

        // Print results
        System.out.println("Youngest age among those three is at age : " + youngest);
        System.out.println("Oldest age among those three is at age : " + oldest);
    }
}
