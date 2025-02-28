import java.util.Scanner;

public class JavaIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        // Simple if condition
        if (num > 0) {
            System.out.println("The number is positive.");
        }

        // if-else condition
        if (num % 2 == 0) {
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd.");
        }

        // if-else-if ladder
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        if (age < 13) {
            System.out.println("You are a child.");
        } else if (age >= 13 && age <= 19) {
            System.out.println("You are a teenager.");
        } else if (age >= 20 && age <= 59) {
            System.out.println("You are an adult.");
        } else {
            System.out.println("You are a senior citizen.");
        }

        // Nested if example
        System.out.print("Enter your marks: ");
        int marks = scanner.nextInt();

        if (marks >= 50) {
            System.out.println("You passed the exam.");
            if (marks >= 90) {
                System.out.println("You got an A grade.");
            } else if (marks >= 75) {
                System.out.println("You got a B grade.");
            } else {
                System.out.println("You got a C grade.");
            }
        } else {
            System.out.println("You failed the exam.");
        }

        scanner.close();
    }
}
