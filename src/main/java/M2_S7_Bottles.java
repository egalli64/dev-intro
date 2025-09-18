/*
 * Introduction to Software Development (Java)
 * 
 * https://github.com/egalli64/dev-intro
 */

/**
 * From flow chart to code
 * <p>
 * Buy n (based on eggs!) bottles of milk
 */
void main() {
    int n = 1;
    String input = IO.readln("Are there 6 fresh eggs? [y/n]: ");

    // if eggs are there, the number of milk bottles changes (?!)
    char c = input == null || input.isEmpty() ? 'y' : Character.toLowerCase(input.charAt(0));
    if (c == 'y') {
        n = 6;
    }

    IO.println("Buy " + n + " milk bottle(s)");
}
