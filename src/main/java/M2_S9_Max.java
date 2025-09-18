/*
 * Introduction to Software Development (Java)
 * 
 * https://github.com/egalli64/dev-intro
 */

/**
 * From flow chart / pseudo-code to code
 * <p>
 * Max value in an array
 */
void main() {
    // indices: 0, 1, 2, 3, 4, 5
    int[] a = { 12, 3, -10, 0, 50, 15 };

    int max = a[0];

    for (int i = 1; i < a.length; i++) {
        if (a[i] > max) {
            max = a[i];
        }
    }

    IO.println("The biggest value is: " + max);
}
