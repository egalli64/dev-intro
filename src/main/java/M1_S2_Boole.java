/*
 * Introduction to Software Development (Java)
 * 
 * https://github.com/egalli64/dev-intro
 */

/**
 * Boolean variables and operators
 */
void main() {
    // a boolean variable
    boolean a = true;
    // print the passed string - do not terminate the line
    IO.print("a is ");
    // print the passed boolean (as string), then terminate the line
    IO.println(a);

    // another boolean variable
    boolean b = false;
    IO.print("b is ");
    IO.println(b);

    // AND
    boolean conjunction = a && b;
    IO.print("a and b is ");
    IO.println(conjunction);

    // OR
    boolean inclusiveDisjunction = a || b;
    IO.print("a or b is ");
    IO.println(inclusiveDisjunction);

    // NOT
    boolean negation = !a;
    IO.print("not a is ");
    IO.println("not a is " + negation);

    // XOR
    boolean exclusiveDisjunction = a ^ b;
    IO.print("a xor b is ");
    IO.println(exclusiveDisjunction);
}
