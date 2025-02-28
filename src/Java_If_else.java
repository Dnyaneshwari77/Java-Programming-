
import java.util.Scanner;

public class Java_If_else {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for a number
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        // if-else condition to check positive or negative
        if (num >= 0) {
            System.out.println(num + " is a Positive number.");
        } else {
            System.out.println(num + " is a Negative number.");
        }

        // Taking user input for age
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // if-else condition to check voting eligibility
        if (age >= 18) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote.");
        }

        // Checking even or odd using if-else
        System.out.print("Enter another number: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println(number + " is an Even number.");
        } else {
            System.out.println(number + " is an Odd number.");
        }

        scanner.close();
    }
}
