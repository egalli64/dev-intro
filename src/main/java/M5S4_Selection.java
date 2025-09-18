
/*
 * Introduction to Software Development (Java)
 * 
 * https://github.com/egalli64/dev-intro
 *
 * Selection sort - most basic implementation
 */
import java.util.Arrays;

void main() {
    int[] values = { 4, 5, 1, 8, 2 };
    IO.println("The original array: " + Arrays.toString(values));

    // for each position (but the last one)
    for (int i = 0; i < values.length - 1; i++) {
        // find the position of the smallest element to the right
        int posMin = i;
        for (int j = i + 1; j < values.length; j++) {
            if (values[j] < values[posMin]) {
                posMin = j;
            }
        }

        // swap current and minimal elements
        IO.println("Swap between position " + i + " (" + values[i] + ") and " + posMin + " (" + values[posMin] + ")");
        int temp = values[i];
        values[i] = values[posMin];
        values[posMin] = temp;
    }

    IO.println("The sorted array: " + Arrays.toString(values));
}
