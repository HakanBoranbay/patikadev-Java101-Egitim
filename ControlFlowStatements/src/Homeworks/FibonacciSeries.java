package Homeworks;

import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {

        // Defining the necessary values;
        int number;
        int prev1 = 0;
        int prev2 = 1;

        // Requesting element number:
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the element number of the Fibonacci Series: ");
        int elementNumber = scanner.nextInt();

        // Finding and printing the numbers in the series:
        System.out.print(prev1 + " " + prev2 + " ");
        for (int i = (elementNumber - 2); i > 0; i--) {
            number = prev1 + prev2;
            System.out.print(number + " ");
            prev1 = prev2;
            prev2 = number;
        }
    }
}
