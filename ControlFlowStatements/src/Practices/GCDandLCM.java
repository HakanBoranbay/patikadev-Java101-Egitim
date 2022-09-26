package Practices;

import java.util.Scanner;

public class GCDandLCM {

    public static void main(String[] args) {

        // Defining necessary values:
        int gcd = 1;
        int lcm = 0;
        int smaller;
        int greater;

        // Requesting two numbers from the user:
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the first number: ");
        int number1 = scanner.nextInt();
        System.out.print("Please enter the second number: ");
        int number2 = scanner.nextInt();

        // Finding the smaller and greater one:
        if (number1 <= number2) {
            smaller = number1;
            greater = number2;
        } else {
            smaller = number2;
            greater = number1;
        }

        // Finding the greatest common divisor using while loop:
        while (smaller > 0) {
            if (number1 % smaller == 0 && number2 % smaller == 0) {
                gcd = smaller;
                break;
            }
            smaller--;
        }
        System.out.println("The greatest common divisor of " + number1 + " and " + number2 + " is: " + gcd);

        // Finding the least common multiple using while loop:
        while (greater <= (number1 * number2)) {
            if (greater % number1 == 0 && greater % number2 == 0) {
                lcm = greater;
                break;
            }
            greater++;
        }
        System.out.println("The least common multiple of " + number1 + " and " + number2 + " is: " + lcm);
    }
}
