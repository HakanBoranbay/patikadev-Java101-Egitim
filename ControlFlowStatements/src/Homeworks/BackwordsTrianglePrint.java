package Homeworks;

import java.util.Scanner;

public class BackwordsTrianglePrint {

    public static void main(String[] args) {

        // Requesting digits from the user:
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter steps: ");
        int steps = scanner.nextInt();

        // Printing the triangle:
        for (int i = steps; i > 0; i--) {
            for (int k = 1; k <= (steps - i + 1); k++) {
                System.out.print(" ");
            }
            for (int j = ((2 * i) - 1); j >= 1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
