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
    IO.println(x);

    // definition
    int y = 12;

    // assignment
    y = x * 5;

    IO.println(y);

    String s = "ciao";

    y = s.length();
    IO.println(y);

    // define a constant
    final int a = 42;
    // won't compile - final variable cannot be assigned
//    a = 23;
    IO.println(a);

    // the unnamed temporary variable containing x + y is passed to println()
    IO.println(x + y);
}
