/*
 * Introduction to Software Development (Java)
 * 
 * https://github.com/egalli64/dev-intro
 */

/**
 * Conditional statements
 */
void main() {
    int a = 7;
    IO.println("a is " + a);

    int b = 3;
    IO.println("b is " + b);

    // if
    if (a < b) {
        IO.println("a is less than b");
    }

    // if - else
    if (a == b) {
        IO.println("a is equal to b");
    } else {
        IO.println("a is not equal to b");
    }

    // if - else if
    if (a > b) {
        IO.println("a is bigger than b");
    } else if (b > a) {
        IO.println("b is bigger than a");
    }

    // if - else if - else
    if (a > b) {
        IO.println("a is bigger than b");
    } else if (b > a) {
        IO.println("b is bigger than a");
    } else {
        IO.println("a is equal to b");
    }

    // ...
    IO.println("Done!");
}
