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
    System.out.print("a is ");
    // print the passed boolean (as string), then terminate the line
    System.out.println(a);

    // another boolean variable
    boolean b = false;
    System.out.print("b is ");
    System.out.println(b);

    // AND
    boolean conjunction = a && b;
    System.out.print("a and b is ");
    System.out.println(conjunction);

    // OR
    boolean inclusiveDisjunction = a || b;
    System.out.print("a or b is ");
    System.out.println(inclusiveDisjunction);

    // NOT
    boolean negation = !a;
    System.out.print("not a is ");
    System.out.println("not a is " + negation);

    // XOR
    boolean exclusiveDisjunction = a ^ b;
    System.out.print("a xor b is ");
    System.out.println(exclusiveDisjunction);
}
