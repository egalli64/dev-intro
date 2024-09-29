/*
 * Introduction to Software Development (Java)
 * 
 * https://github.com/egalli64/dev-intro
 */

/**
 * An example of Procedural Programming
 */
void main() {
    hello();

    caller();
    f();

    hello();
}

// a global variable - accessible by all the procedures!
int count = 0;

/**
 * A simple procedure, as side effect it increases the global counter
 * 
 * @param base an input value
 * @return three times the input value
 */
int triple(int base) {
    count += 1;
    return base * 3;
}

/**
 * A simple procedure, as side effect it increases the global counter
 */
void caller() {
    int value = 12;
    int result = triple(value);
    System.out.println(value + " ---> " + result);

    count += 1;
}

/**
 * A simple procedure, it changes in an unexpected way the global counter
 */
void f() {
    count = triple(27);
    System.out.println(count);
}

/**
 * A simple procedure, it checks the global counter
 */
void hello() {
    System.out.println("Hello! ... " + count);
}
