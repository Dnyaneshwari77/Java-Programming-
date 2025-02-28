import java.util.Scanner;

public class DoWhileExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char choice;

        do {
            // Taking user input
            System.out.print("Enter a number to check if it's even or odd: ");
            int num = scanner.nextInt();

            // Checking even or odd
            if (num % 2 == 0) {
                System.out.println(num + " is Even.");
            } else {
                System.out.println(num + " is Odd.");
            }

            // Asking user if they want to continue
            System.out.print("Do you want to check another number? (y/n): ");
            choice = scanner.next().charAt(0);

        } while (choice == 'y' || choice == 'Y'); // Condition to repeat the loop

        System.out.println("Program Ended. Thank you!");
        scanner.close();
    }
}
