/*
 * Introduction to Software Development (Java)
 * 
 * https://github.com/egalli64/dev-intro
 */

/**
 * From flow chart to code
 * <p>
 * Buy n bottles of milk and 6 eggs
 */
void main() {
    int n = 1;

    String input = IO.readln("Are there 6 fresh eggs? [y/n]: ");

    // if eggs are there, buy them (warning! kind of complicated statement ahead!)
    char c = input == null || input.isEmpty() ? 'y' : Character.toLowerCase(input.charAt(0));
    if (c == 'y') {
        IO.println("Buy 6 fresh eggs");
    }

    IO.println("Buy " + n + " milk bottle(s)");
}
