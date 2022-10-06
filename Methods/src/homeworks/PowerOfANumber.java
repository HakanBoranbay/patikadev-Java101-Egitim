package homeworks;

import java.util.Scanner;

public class PowerOfANumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter base number: ");
        int base = scanner.nextInt();
        System.out.println("Enter exponent: ");
        int exp = scanner.nextInt();

        System.out.println("Result: " + power(base,exp));

    }

    public static double power(int number, int exponent) {

        if (exponent == 0) return number;

        double power = 1;

        if (exponent == 0) {
            return 1;
        } else if (exponent > 0) {
            for (int i = 0; i < exponent; i++) {
                power *= number;
            }
        } else {
            for (int i = 0; i > exponent; i--) {
                power /= number;
            }
        }

        return power;
    }
}
