/*
 * Introduction to Software Development (Java)
 * 
 * https://github.com/egalli64/dev-intro
 */

/**
 * Exercise on continue
 */
void main() {
    int first = 1;
    IO.println("First value is " + first);

    int last = 10;
    IO.println("Last value is " + last);

    IO.println("The even values between first and last: ");
    for (int i = first; i <= last; i++) {
        // TODO: use continue to skip the print of odd values
    }
}
