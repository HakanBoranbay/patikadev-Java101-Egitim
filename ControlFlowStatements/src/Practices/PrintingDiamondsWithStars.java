package Practices;

import java.util.Scanner;

public class PrintingDiamondsWithStars {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        for (int i = 1; i <= number; i ++) {
            for (int k = 1; k <= (number - i); k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= ((2 * i) - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = (number - 1); i >= 1; i--) {
            for (int k = 1; k <= (number - i); k++) {
                System.out.print(" ");
            }
            for (int j = ((2 * i) - 1); j >= 1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
