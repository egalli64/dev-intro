
/*
 * Introduction to Software Development (Java)
 * 
 * https://github.com/egalli64/dev-intro
 *
 * Insertion sort - most basic implementation
 */
import java.util.Arrays;

void main() {
    int[] data = { 4, 5, 1, 8, 2 };
    IO.println("The original array: " + Arrays.toString(data));

    // for each position from the second
    for (int i = 1; i < data.length; i++) {
        // compare the neighbors to the left, and swap until required
        for (int j = i; j > 0; j--) {
            if (data[j] < data[j - 1]) {
                IO.println("Swap " + data[j - 1] + " and " + data[j]);
                int temp = data[j];
                data[j] = data[j - 1];
                data[j - 1] = temp;
            } else {
                IO.println(data[j - 1] + " and " + data[j] + " don't need to be swapped");
                break;
            }
        }
        IO.println("Now the array is " + Arrays.toString(data));
    }

    IO.println("The sorted array: " + Arrays.toString(data));
}
