/*
Types of Operators in Java
1. Arithmetic Operators
2. Unary Operators
3. Assignment Operator
4. Relational Operators
5. Logical Operators
6. Ternary Operator
7. Bitwise Operators
8. Shift Operators
9. instanceof operator
*/

public class Java_Operators {
    public static void main(String[] args) {
        // Declare and initialize variables
        int num1 = 500;
        int num2 = 100;

        // Arithmetic Operators
        System.out.println("------ Arithmetic Operators ------");
        int sum = num1 + num2;
        System.out.println("The Sum is: " + sum);

        int diff = num1 - num2;
        System.out.println("The Difference is: " + diff);

        int a = 10, b = 5;
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));

        System.out.println("------ Unary Operators ------");
        System.out.println("Post Increment: " + (a++)); // Prints 10, then a becomes 11
        System.out.println("Pre Increment: " + (++a)); // Increments first, then prints 12
        System.out.println("Bitwise Complement (~a): " + (~a)); // -(12+1) = -13
        System.out.println("Logical NOT (!true): " + (!true)); // Prints false

        System.out.println("------ Assignment Operators ------");
        a += 5; // a = 12 + 5
        System.out.println("a after +=: " + a);
        a *= 2; // a = 17 * 2
        System.out.println("a after *=: " + a);

        System.out.println("------ Relational Operators ------");
        System.out.println("a > b: " + (a > b)); // true
        System.out.println("a == b: " + (a == b)); // false

        System.out.println("------ Logical Operators ------");
        boolean aa = true, bb = false;
        System.out.println("aa && bb: " + (aa && bb)); // false
        System.out.println("aa || bb: " + (aa || bb)); // true

        System.out.println("------ Ternary Operator ------");
        int min = (a < b) ? a : b;
        System.out.println("Smaller number is: " + min);

        System.out.println("------ Bitwise Operators ------");
        System.out.println("a & b: " + (a & b)); // Bitwise AND
        System.out.println("a | b: " + (a | b)); // Bitwise OR

        System.out.println("------ Shift Operators ------");
        System.out.println("Left Shift (a << 1): " + (a << 1)); // a * 2
        System.out.println("Right Shift (a >> 1): " + (a >> 1)); // a / 2

        System.out.println("------ instanceof Operator ------");
        String str = "Hello";
        System.out.println("Is str an instance of String? " + (str instanceof String));
    }
}
