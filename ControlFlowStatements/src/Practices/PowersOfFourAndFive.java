package Practices;

import java.util.Scanner;

public class PowersOfFourAndFive {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        System.out.println("Powers of four up to entered number: ");
        for (int i = 1; i < number; i *= 4) {
            System.out.println(i);
        }
        System.out.println("Powers of five up to entered number: ");
        for (int i = 1; i < number; i *= 5) {
            System.out.println(i);
        }
    }
}
