import java.util.Scanner;

public class JavaWhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Simple While Loop
        System.out.print("Enter a number for while loop: ");
        int n = scanner.nextInt();
        int i = 1;
        System.out.println("Counting from 1 to " + n + ":");
        while (i <= n) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println("\n--------------------------------");

        // 2. Reverse While Loop
        System.out.println("Reverse counting from " + n + " to 1:");
        while (n >= 1) {
            System.out.print(n + " ");
            n--;
        }
        System.out.println("\n--------------------------------");

        // 3. Do-While Loop (Executes at least once)
        char choice;
        do {
            System.out.print("Enter a number to check even or odd (0 to exit): ");
            int num = scanner.nextInt();
            if (num == 0) {
                break;
            }
            if (num % 2 == 0) {
                System.out.println(num + " is Even");
            } else {
                System.out.println(num + " is Odd");
            }
            System.out.print("Do you want to continue? (y/n): ");
            choice = scanner.next().charAt(0);
        } while (choice == 'y' || choice == 'Y');

        System.out.println("--------------------------------");

        // 4. Infinite While Loop (Breaks on condition)
        System.out.println("Infinite while loop with break:");
        int counter = 1;
        while (true) {
            System.out.println("Counter: " + counter);
            if (counter == 5) {
                System.out.println("Breaking the loop...");
                break;
            }
            counter++;
        }

        scanner.close();
    }
}
