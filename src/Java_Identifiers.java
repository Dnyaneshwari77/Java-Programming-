
/*

Definition :- An identifier in Java is the name given to Variables, Classes, Methods, Packages, Interfaces, etc. These are the unique names and every Java Variables must be identified with unique names.

Rules For Naming Java Identifiers
There are certain rules for defining a valid Java identifier. These rules must be followed, otherwise, we get a compile-time error. These rules are also valid for other languages like C, and C++.

The only allowed characters for identifiers are all alphanumeric characters([A-Z],[a-z],[0-9]), ‘$‘(dollar sign) and ‘_‘ (underscore). For example “geek@” is not a valid Java identifier as it contains a ‘@’ a special character.
Identifiers should not start with digits([0-9]). For example “123geeks” is not a valid Java identifier.
Java identifiers are case-sensitive.
There is no limit on the length of the identifier but it is advisable to use an optimum length of 4 – 15 letters only.
Reserved Words can’t be used as an identifier. For example “int while = 20;” is an invalid statement as a while is a reserved word. There are 53 reserved words in Java.

 */


public class Java_Identifiers {
    public static void main(String[] args) {

        /*
        MyVariable	    ✅ Valid	Follows naming rules.
        MYVARIABLE	    ✅ Valid	Follows naming rules.
        myvariable	    ✅ Valid	Follows naming rules.
        x	            ✅ Valid	Single-character variable names are allowed.
        i	            ✅ Valid	Single-character variable names are allowed.
        x1	            ✅ Valid	Letters and numbers are allowed, doesn't start with a number.
        i1	            ✅ Valid	Letters and numbers are allowed, doesn't start with a number.
        _myvariable	    ✅ Valid	Underscore at the beginning is allowed but not recommended.
        $myvariable	    ✅ Valid	Dollar sign is allowed but rarely used in practice.
        sum_of_array    ✅ Valid	Underscores are allowed in identifiers.
        geeks123	    ✅ Valid	Letters and numbers are allowed, doesn't start with a number.
        123abc	        ❌ Invalid	Cannot start with a number.
         */


    }
}
