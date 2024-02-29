import java.util.Scanner;

public class er {
    public static void main(String[]args) {
    int num1;
    String Day;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter number form 1 to 7");
    num1 = scanner.nextInt();

    switch (num1) {
        case 1:
            Day = "Monday";            
            break;
        case 2:
            Day = "Tuesday";
            break;
        case 3:
            Day = "Wednesday";
            break;
        case 4:
            Day = "Thursday";
            break;
        case 5:
            Day = "Friday";
            break;
        case 6:
            Day = "Saturday";
            break;
        case 7:
            Day = "Sunday";
            break;
        default:
            Day = "Invalid day";
    }
        System.out.println("The day is " + Day);
        scanner.close();
        }
}