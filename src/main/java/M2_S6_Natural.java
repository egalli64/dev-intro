/*
 * Introduction to Software Development (Java)
 * 
 * https://github.com/egalli64/dev-intro
 */

/**
 * From flow chart to code
 * <p>
 * Print the natural numbers in 1 .. n (user provided)
 */
void main() {
    // For the moment we assume the user actually pass a good input
    String input = IO.readln("Pass me a (small) natural number: ");
    int n = Integer.parseInt(input);

    int i = 1;
    while (i <= n) {
        IO.println(i);
        i += 1;
    }
}
