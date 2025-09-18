/*
 * Introduction to Software Development (Java)
 * 
 * https://github.com/egalli64/dev-intro
 */

/**
 * From pseudo-code to code
 * <p>
 * Print even values only from an array
 */
void main() {
    int[] data = { 1, 42, 13, 3, 45, 2 };

    for (int i = 0; i < data.length; i++) {
        if (data[i] % 2 == 0) {
            IO.println(data[i]);
        }
    }
}
