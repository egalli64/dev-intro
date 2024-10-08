
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
    System.out.println("The array: " + Arrays.toString(data));

    // for each position from the second
    for (int i = 1; i < data.length; i++) {
        // compare the neighbors to the left, and swap until required
        for (int j = i; j > 0; j--) {
            if (data[j] < data[j - 1]) {
                System.out.printf("Swap between %d and %d%n", data[j - 1], data[j]);
                int temp = data[j];
                data[j] = data[j - 1];
                data[j - 1] = temp;
            } else {
                break;
            }
        }
        System.out.println("Now the array is " + Arrays.toString(data));
    }

    System.out.println("The sorted array: " + Arrays.toString(data));
}
