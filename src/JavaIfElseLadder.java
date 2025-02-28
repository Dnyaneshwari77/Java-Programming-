import java.util.Scanner;

public class JavaIfElseLadder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for marks
        System.out.print("Enter your marks: ");
        int marks = scanner.nextInt();

        // If-Else Ladder to determine grade
        if (marks >= 90) {
            System.out.println("Grade: A+ (Excellent)");
        } else if (marks >= 80) {
            System.out.println("Grade: A (Very Good)");
        } else if (marks >= 70) {
            System.out.println("Grade: B (Good)");
        } else if (marks >= 60) {
            System.out.println("Grade: C (Satisfactory)");
        } else if (marks >= 50) {
            System.out.println("Grade: D (Needs Improvement)");
        } else {
            System.out.println("Grade: F (Fail)");
        }

        // Taking user input for temperature
        System.out.print("Enter temperature in °C: ");
        int temp = scanner.nextInt();

        // If-Else Ladder to classify weather
        if (temp >= 35) {
            System.out.println("Weather: Very Hot 🥵");
        } else if (temp >= 25) {
            System.out.println("Weather: Warm ☀️");
        } else if (temp >= 15) {
            System.out.println("Weather: Cool 🌤️");
        } else if (temp >= 5) {
            System.out.println("Weather: Cold ❄️");
        } else {
            System.out.println("Weather: Freezing 🥶");
        }

        scanner.close();
    }
}
