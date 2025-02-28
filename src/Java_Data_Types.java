/*

 Java has two categories in which data types are segregated

Primitive Data Type: such as boolean, char, int, short, byte, long, float, and double. The Boolean with uppercase B is a wrapper class for the primitive data type boolean in Java.
Non-Primitive Data Type or Object Data type: such as String, Array, etc.

                           Data Types in Java
                               |
    ----------------------------------------------------
    |                                                  |
Primitive Data Types                              Non-Primitive Data Types
    |                                                  |
    |                                   ----------------------------
    |                                   |            |            |
  Numeric Type                        String       Array        etc
    |
    |-----------------------
    |                     |
  Integer               Floating Point
    |                     |
  ---------           --------------
  |   |   |   |        |          |
 byte short int long  float     double

Non Numeric Type
  |
  --------------
  |            |
Boolean       Char


 */

public class Java_Data_Types {
    public static void main(String[] args) {

                // Primitive Data Types

                // 1. Non-Numeric Type
                boolean isJavaFun = true; // Boolean: Can hold true or false values
                char grade = 'A'; // Character: Stores a single character

                // 2. Numeric Type
                // 2.1 Integer Types
                byte smallNumber = 127; // Byte: Stores small integers (-128 to 127)
                short shortNumber = 32767; // Short: Stores medium integers (-32,768 to 32,767)
                int intNumber = 2147483647; // Integer: Common integer type (-2^31 to 2^31-1)
                long longNumber = 9223372036854775807L; // Long: Stores large integers (-2^63 to 2^63-1)

                // 2.2 Floating Point Types
                float floatNumber = 3.14f; // Float: Stores fractional numbers with 6-7 decimal digits
                double doubleNumber = 3.141592653589793; // Double: Stores fractional numbers with 15-16 decimal digits

                // Non-Primitive Data Types

                // 1. String (A sequence of characters)
                String message = "Hello, Java!";

                // 2. Array (Collection of elements of the same type)
                int[] numbers = {1, 2, 3, 4, 5}; // Array of integers

                // Displaying values
                System.out.println("--- Primitive Data Types ---");
                System.out.println("Boolean Value: " + isJavaFun);
                System.out.println("Character Value: " + grade);
                System.out.println("Byte Value: " + smallNumber);
                System.out.println("Short Value: " + shortNumber);
                System.out.println("Integer Value: " + intNumber);
                System.out.println("Long Value: " + longNumber);
                System.out.println("Float Value: " + floatNumber);
                System.out.println("Double Value: " + doubleNumber);

                System.out.println("\n--- Non-Primitive Data Types ---");
                System.out.println("String Value: " + message);
                System.out.print("Array Values: ");
                for (int num : numbers) {
                    System.out.print(num + " ");
                }
            }
}
