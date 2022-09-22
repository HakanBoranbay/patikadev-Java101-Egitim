package Practices;

import java.util.Scanner;

public class HarmonicSeries {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        double harmonicSum = 0.0;

        for (double i = 1; i <= number; i++){
            harmonicSum += (1/i);
        }

        System.out.println(harmonicSum);
    }
}
