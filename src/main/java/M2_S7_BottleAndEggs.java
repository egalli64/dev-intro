/*
 * Introduction to Software Development (Java)
 * 
 * https://github.com/egalli64/dev-intro
 */

import java.util.Scanner;

/**
 * From flow chart to code
 * <p>
 * Buy n bottles of milk and 6 eggs
 */
void main() {
    int n = 1;

    System.out.print("Are there 6 fresh eggs? [y/n]: ");
    Scanner scanner = new Scanner(System.in);
    String input = scanner.next();

    // if eggs are there, buy them
    char c = input == null || input.isEmpty() ? 'y' : Character.toLowerCase(input.charAt(0));
    if (c == 'y') {
        System.out.println("Buy 6 fresh eggs");
    }

    System.out.println("Buy " + n + " milk bottle(s)");
    scanner.close();
}
