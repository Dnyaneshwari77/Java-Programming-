import java.util.Scanner;

public class Java_User_Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking integer inputs
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        // Arithmetic Operators
        System.out.println("------ Arithmetic Operators ------");
        System.out.println("Addition: " + (num1 + num2));
        System.out.println("Subtraction: " + (num1 - num2));
        System.out.println("Multiplication: " + (num1 * num2));
        System.out.println("Division: " + (num1 / num2));
        System.out.println("Modulus: " + (num1 % num2));

        // Unary Operators
        System.out.println("------ Unary Operators ------");
        System.out.println("Post Increment (num1++): " + (num1++));
        System.out.println("Pre Increment (++num1): " + (++num1));
        System.out.println("Bitwise Complement (~num1): " + (~num1));
        System.out.println("Logical NOT (!true): " + (!true));

        // Assignment Operators
        System.out.println("------ Assignment Operators ------");
        num1 += 5;
        System.out.println("num1 after += 5: " + num1);
        num1 *= 2;
        System.out.println("num1 after *= 2: " + num1);

        // Relational Operators
        System.out.println("------ Relational Operators ------");
        System.out.println("num1 > num2: " + (num1 > num2));
        System.out.println("num1 == num2: " + (num1 == num2));

        // Logical Operators
        System.out.println("------ Logical Operators ------");
        boolean bool1 = true, bool2 = false;
        System.out.println("bool1 && bool2: " + (bool1 && bool2));
        System.out.println("bool1 || bool2: " + (bool1 || bool2));

        // Ternary Operator
        System.out.println("------ Ternary Operator ------");
        int min = (num1 < num2) ? num1 : num2;
        System.out.println("Smaller number is: " + min);

        // Bitwise Operators
        System.out.println("------ Bitwise Operators ------");
        System.out.println("num1 & num2: " + (num1 & num2));
        System.out.println("num1 | num2: " + (num1 | num2));

        // Shift Operators
        System.out.println("------ Shift Operators ------");
        System.out.println("Left Shift (num1 << 1): " + (num1 << 1));
        System.out.println("Right Shift (num1 >> 1): " + (num1 >> 1));

        // instanceof Operator
        System.out.println("------ instanceof Operator ------");
        System.out.print("Enter a string: ");
        scanner.nextLine(); // Consume the newline
        String str = scanner.nextLine();
        System.out.println("Is the input an instance of String? " + (str instanceof String));

        scanner.close();
    }
}
