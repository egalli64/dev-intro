/*
 * Introduction to Software Development (Java)
 * 
 * https://github.com/egalli64/dev-intro
 */

/**
 * From flow chart to code
 * <p>
 * Say hello to the user
 */
void main() {
    String name = IO.readln("What's your name? ");
    String message = "Hello, ";

    if (name.equals("Tom")) {
        message += name;
    } else {
        message += "stranger";
    }

    IO.println(message);
}
