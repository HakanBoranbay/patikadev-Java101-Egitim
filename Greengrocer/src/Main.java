import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Identifying variables:
        double  pearPricePerKg = 2.14,
                applePricePerKg = 3.67,
                tomatoPricePerKg = 1.11,
                bananaPricePerKg = 0.95,
                eggplantPricePerKg = 5.00;
        double pearsAmount, applesAmount, tomatoesAmount, bananasAmount, eggplantsAmount;
        double price;

        // Requesting amounts of users shopping:
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the amount of pears (kg): ");
        pearsAmount = scanner.nextDouble();
        System.out.print("Please enter the amount of apples (kg): ");
        applesAmount = scanner.nextDouble();
        System.out.print("Please enter the amount of tomatoes (kg): ");
        tomatoesAmount = scanner.nextDouble();
        System.out.print("Please enter the amount of banana (kg): ");
        bananasAmount = scanner.nextDouble();
        System.out.print("Please enter the amount of eggplant (kg): ");
        eggplantsAmount = scanner.nextDouble();

        // calculating the total price of shopping:
        price = (pearPricePerKg * pearsAmount)
                + (applePricePerKg * applesAmount)
                + (tomatoPricePerKg * tomatoesAmount)
                + (bananaPricePerKg * bananasAmount)
                + (eggplantPricePerKg * eggplantsAmount);

        System.out.println("Total price is: " + price + "₺");
    }
}
