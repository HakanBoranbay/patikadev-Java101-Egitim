package Homeworks;

import java.util.Scanner;

public class MaxAndMinValues {

    public static void main(String[] args) {

        // Defining necessary values:
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        // Requesting how many numbers to be requested and the numbers itself:
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter how many numbers you wish to compute: ");

        // Finding the max and the min values:
        int counter = scanner.nextInt();
        int number;
        for (int i = 1; i <= counter; i++) {
            System.out.print("Please enter the " + i + ". number: ");
            number = scanner.nextInt();

            if (number < min) {
                min = number;
            }

            if (number > max) {
                max = number;
            }
        }

        System.out.println("max value: " + max);
        System.out.println("min value: " + min);
    }
}
