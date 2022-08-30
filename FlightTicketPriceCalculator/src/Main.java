import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Asking the user to input the required information:
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter total distance (km): ");
        int distance = scanner.nextInt();
        System.out.print("Please enter your age: ");
        int age = scanner.nextInt();
        System.out.println("Please enter: " +
                "\n1 - for one-way flight," +
                "\n2 - for round-trip flight.");
        int flightType = scanner.nextInt();

        // Checking if the distance and age information is valid. Then
        if (age < 0 || distance < 0 ) {

            System.out.println("Distance or age information entered is invalid.");
        } else {

            // Calculating total price (without any discounts):
            double totalPrice = distance * (0.10);

            // Calculating price with switch-case
            switch (flightType) {
                case 1:
                    if (age <= 12) {
                        totalPrice *= 0.5;
                    } else if (age > 12 && age < 24) {
                        totalPrice *= 0.9;
                    } else if (age >= 65) {
                        totalPrice *= 0.7;
                    }
                    System.out.println("Total price of your ticket is: " + totalPrice + "TRY.");
                    break;
                case 2:
                    totalPrice *= 0.8 * 2;
                    if (age <= 12) {
                        totalPrice *= 0.5;
                    } else if (age > 12 && age < 24) {
                        totalPrice *= 0.9;
                    } else if (age >= 65) {
                        totalPrice *= 0.7;
                    }
                    System.out.println("Total price of your ticket is: " + totalPrice + "TRY.");
                    break;
                default:
                    System.out.println("Flight type should be either be 1 or 2.");
            }
        }
    }
}
