/*
 * Introduction to Software Development (Java)
 * 
 * https://github.com/egalli64/dev-intro
 *
 * Greatest Common Divisor - recursive and iterative algorithm
 */

void main() {
    int left = 42;
    int right = 35;

    IO.println("Calculating GCD of " + left + " and " + right);
    IO.println("Recursive: " + gcd(left, right));
    IO.println("Iterative: " + gcdIterative(left, right));
}

//recursive
int gcd(int a, int b) {
    IO.println(a + ", " + b);
    if (b == 0) {
        return a;
    }

    return gcd(b, a % b);
}

// iterative
int gcdIterative(int a, int b) {
    IO.println(a + ", " + b);
    while (b != 0) {
        int temp = a;
        a = b;
        b = temp % a;
        IO.println(a + ", " + b);
    }
    return a;
}
