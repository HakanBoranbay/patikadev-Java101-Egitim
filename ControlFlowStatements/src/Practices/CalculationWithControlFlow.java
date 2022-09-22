package Practices;

import java.util.Scanner;

public class CalculationWithControlFlow {

    public static void main(String[] args) {
        int number;
        int sum = 0;

        do {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a number: ");
            number = scanner.nextInt();
            if (number % 4 == 0) {
                sum += number;
            }
        } while (number % 2 == 0 && number > 0);

        System.out.println("Sum of all the even numbers that can be divided to four: " + sum);

    }
}
