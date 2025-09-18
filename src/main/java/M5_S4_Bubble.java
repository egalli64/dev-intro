/*
 * Introduction to Software Development (Java)
 * 
 * https://github.com/egalli64/dev-intro
 */

/**
 * Bubble sort - most basic implementation
 */
import java.util.Arrays;

void main() {
    int[] data = { 4, 5, 1, 8, 2 };
    IO.println("The original array: " + Arrays.toString(data));

    // repeat n-1 times
    for (int i = 0; i < data.length - 1; i++) {
        // compare the neighbors, and swap if required
        for (int j = 0; j < data.length - 1; j++) {
            IO.print("Loop " + i + ", position " + j + ": ");
            if (data[j] > data[j + 1]) {
                int temp = data[j];
                data[j] = data[j + 1];
                data[j + 1] = temp;
                IO.println("Swap!");
            } else {
                IO.println("No swap");
            }
            IO.println("The array now is: " + Arrays.toString(data));
        }
    }

    IO.println("The sorted array: " + Arrays.toString(data));
}
