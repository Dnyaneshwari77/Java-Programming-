import java.util.Scanner;

public class JavaForLoops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Simple for loop
        System.out.print("Enter a number for simple for loop: ");
        int n = scanner.nextInt();
        System.out.println("Counting from 1 to " + n + ":");
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\n--------------------------------");

        // 2. Enhanced for loop (for-each loop)
        int[] numbers = {10, 20, 30, 40, 50};
        System.out.println("Enhanced For Loop Output:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println("\n--------------------------------");

        // 3. For loop with multiple variables
        System.out.println("For loop with multiple variables:");
        for (int i = 1, j = 5; i <= 5; i++, j--) {
            System.out.println("i: " + i + ", j: " + j);
        }
        System.out.println("--------------------------------");

        // 4. Nested for loop
        System.out.print("Enter size for a square pattern: ");
        int size = scanner.nextInt();
        System.out.println("Square Pattern:");
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("--------------------------------");

        // 5. Labeled for loop (Skipping iteration)
        System.out.println("Labeled for loop:");
        outerLoop:
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                if (i == 2 && j == 2) {
                    System.out.println("Skipping i=2, j=2");
                    continue outerLoop;
                }
                System.out.println("i = " + i + ", j = " + j);
            }
        }
        System.out.println("--------------------------------");

        // 6. Reverse for loop
        System.out.println("Reverse For Loop from 10 to 1:");
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println("\n--------------------------------");

        scanner.close();
    }
}
