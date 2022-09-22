package Practices;

import java.util.Scanner;

public class AverageOfANumbersDivisibleToThreeAndFour {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int counter = 0;
        int sum = 0;

        for (int i = 1; i <= number; i++) {
            if (i % 4 == 0 && i % 3 == 0) {
                sum += i;
                counter++;
            }
        }

        System.out.println("Average of all the number that can be divided to both 3 and 4 up to the number you have entered: " + (sum / counter));
    }
}
