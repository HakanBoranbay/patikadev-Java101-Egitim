import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /**
         * Conditions :
         *
         * If temperature is lower than 5 degrees suggest skiing.
         * If temperature is between 5 and 15 degrees propose cinema.
         * If temperature is between 10 and 25 degrees suggest picnic.
         * If temperature is greater than 25 degrees suggest swimming.
         */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter today's temperature: ");
        int temp = scanner.nextInt();

        if (temp < 5) {
            System.out.println("You can go to skiing.");
        } else if (temp >= 5 && temp <= 10) {
            System.out.println("You can go the a cinema.");
        } else if (temp >= 10 && temp <= 15) {
            System.out.println("You can go to a cinema or a picnic.");
        } else if (temp >= 15 && temp <= 25) {
            System.out.println("You can go to a picnic.");
        } else {
            System.out.println("You can go swimming.");
        }
    }
}
