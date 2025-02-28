/*
Variables are the containers for storing the data values or you can also call it a memory location name for the data. Every variable has a:

Data Type – The kind of data that it can hold. For example, int, string, float, char, etc.
Variable Name – To identify the variable uniquely within the scope.
Value – The data assigned to the variable.


                      Type of Variable
                            |
          -----------------------------------
          |               |                 |
    Local Variables   Instance Variables   Static Variables

1. Local Variables:
    Declared inside a method, constructor, or block.
    Scope is limited to where it is declared.
    Must be initialized before use.

2. Instance Variables
    Declared inside a class but outside methods.
    Each object gets its own copy.
    Default values are assigned if not initialized.

3. Static Variables
    Declared with static keyword inside a class.
    Shared across all objects of the class.
    Memory allocated once during class loading.
 */

public class Java_Variables {
    // Instance variable: Each object of the class will have its own copy
    int instanceVar = 100;

    // Static variable: Shared among all objects of the class
    static int staticVar = 200;

    // Method to demonstrate local variable
    void show() {
        // Local variable: Scope is limited to this method only
        int localVar = 50;

        // Printing all variable types
        System.out.println("Local Variable: " + localVar);
        System.out.println("Instance Variable: " + instanceVar);
        System.out.println("Static Variable: " + staticVar);
    }

    public static void main(String[] args) {
        // Creating an object of the class
        Java_Variables obj1 = new Java_Variables();
        obj1.show();

        // Creating another object to show instance vs static behavior
        Java_Variables obj2 = new Java_Variables();
        obj2.instanceVar = 300; // Changing instance variable for obj2
        obj2.staticVar = 400; // Changing static variable (affects all objects)

        System.out.println("\nAfter modifying variables:");
        obj1.show(); // Instance variable of obj1 remains unchanged, but static variable changes
        obj2.show(); // Both instance and static variables are updated
    }
}
