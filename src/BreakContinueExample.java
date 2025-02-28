import java.util.Scanner;

public class BreakContinueExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter numbers (Enter -1 to stop):");

        while (true) { // Infinite loop
            System.out.print("Enter a number: ");
            int num = scanner.nextInt();

            // Break statement - Exit loop when user enters -1
            if (num == -1) {
                System.out.println("Stopping the loop...");
                break;
            }

            // Continue statement - Skip even numbers and move to the next iteration
            if (num % 2 == 0) {
                System.out.println("Skipping even number.");
                continue;
            }

            // Print only if number is odd
            System.out.println("You entered an odd number: " + num);
        }

        System.out.println("Loop Ended.");
        scanner.close();
    }
}
