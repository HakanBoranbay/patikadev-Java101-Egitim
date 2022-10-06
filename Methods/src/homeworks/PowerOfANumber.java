package homeworks;

import java.util.Scanner;

public class PowerOfANumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter base number: ");
        int base = scanner.nextInt();
        System.out.println("Enter a positive exponent: ");
        int exp = scanner.nextInt();

        System.out.println("Result: " + power(base,exp));

    }

    public static int power(int number, int exponent) {

        if (exponent == 0) return 1;
        if (exponent == 1) return number;

        return power(number, --exponent) * number;
    }
}
