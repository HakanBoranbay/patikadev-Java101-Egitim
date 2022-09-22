package Practices;

import java.util.Scanner;

public class ExponentialNumbersCalculation {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the base number: ");
        int baseNumber = scanner.nextInt();
        System.out.print("Enter the exponent: ");
        int exponent = scanner.nextInt();

        int exponential = 1;

        for (int i = 1; i <= exponent; i++) {
            exponential *= baseNumber;
        }

        System.out.println(baseNumber + "^" + exponent + " = " + exponential);
    }
}
