/*
 * Introduction to Software Development (Java)
 * 
 * https://github.com/egalli64/dev-intro
 */

import java.util.Scanner;

/**
 * From flow chart to code
 * <p>
 * Say hello to the user
 */
void main() {
    System.out.print("What's your name? ");

    Scanner scanner = new Scanner(System.in);
    String next = scanner.next();

    String message = "Hello, ";

    if (next.equals("Tom")) {
        message += next;
    } else {
        message += "stranger";
    }

    System.out.println(message);
    scanner.close();
}
