/*
 * Introduction to Software Development (Java)
 * 
 * https://github.com/egalli64/dev-intro
 */

/**
 * Variables
 */
void main() {
    // declaration
    int x;

    // initialization
    x = 12;

    // usage
    System.out.println(x);

    // definition
    int y = 12;

    // assignment
    y = x * 5;

    System.out.println(y);

    String s = "ciao";

    y = s.length();
    System.out.println(y);

    // define a constant
    final int a = 42;
    // won't compile - final variable cannot be assigned
//    a = 23;
    System.out.println(a);

    // the unnamed temporary variable containing x + y is passed to println()
    System.out.println(x + y);
}
