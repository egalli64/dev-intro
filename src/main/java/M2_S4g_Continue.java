/*
 * Introduction to Software Development (Java)
 * 
 * https://github.com/egalli64/dev-intro
 */

/**
 * Jump to the next iteration in a loop with continue
 */
void main() {
    for (int value = 0; value < 10; value++) {
        IO.print(' ');
        if (value < 3 || value > 6) {
            IO.print('?');
            continue;
        }
        IO.print(value);
    }

    IO.println();
}
