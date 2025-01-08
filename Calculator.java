/* Calculator program ( take in two numbers and operator like /, *, +, - ...& calculate the value) */

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.println("Enter an operator (+, -, *, /, %, or x to exit):");
            char op = in.next().trim().charAt(0);

            // Exit condition for 'x' or 'X'
            if (op == 'x' || op == 'X') {
                System.out.println("Exiting the calculator. Goodbye!");
                break;
            }

            // Valid operators
            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                System.out.println("Enter two numbers:");
                int n1 = in.nextInt();
                int n2 = in.nextInt();

                int ans = 0; // Initialize answer
                if (op == '+') {
                    ans = n1 + n2;
                } else if (op == '-') {
                    ans = n1 - n2;
                } else if (op == '*') {
                    ans = n1 * n2;
                } else if (op == '/') {
                    if (n2 != 0) { // Check for division by zero
                        ans = n1 / n2;
                    } else {
                        System.out.println("Division by zero is not allowed.");
                        continue;
                    }
                } else if (op == '%') {
                    if (n2 != 0) { // Check for modulo by zero
                        ans = n1 % n2;
                    } else {
                        System.out.println("Modulo by zero is not allowed.");
                        continue;
                    }
                }

                System.out.println("The result is: " + ans);
            } else {
                System.out.println("Invalid operator. Please try again.");
            }
        }

        in.close(); // Close the scanner
    }
}
