package Homeworks;

import java.util.Scanner;

public class PerfectNumbers {

    public static void main(String[] args) {

        // Defining the necessary valuer:
        int divisorSum = 0;

        // Requesting a number from the user:
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int number = scanner.nextInt();

        // Calculating the sum of the divisors of the number:
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                divisorSum += i;
            }
        }

        // Checking if the number is a perfect number:
        if (divisorSum == number) {
            System.out.println(number + " is a perfect number.");
        } else {
            System.out.println(number + " is not a perfect number.");
        }
    }
}
