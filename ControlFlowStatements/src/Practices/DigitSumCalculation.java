package Practices;

import java.util.Scanner;

public class DigitSumCalculation {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int sum = 0;
        while (number != 0) {
            sum += (number % 10);
            number /= 10;
        }

        System.out.println(sum);

        //CALCULATION TO CHECK IF THE NUMBER IS AN ARMSTRONG NUMBER
        /*
        int digitTest = number;
        int armstrongTest = number;
        int exp = 1;
        int tempExp = 1;
        int sum = 0;
        int digit = 0;

        while (digitTest > 0) {
            digitTest /= 10;
            digit++;
        }
        while (armstrongTest != 0) {
            exp = 1;
            for (int i = 0; i < digit; i++) {
                exp *= armstrongTest % 10;
                tempExp = exp;
            }
            sum += tempExp;
            armstrongTest /= 10;
        }

        if (sum == number) {
            System.out.println(number + " is an armstrong number.");
        } else {
            System.out.println(number + " is not an armstrong number.");
        }
         */
    }
}
