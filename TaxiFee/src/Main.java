import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // identifying variables.
        int distance, openningPrice = 10, minimumFee = 20;
        double priceByKm = 2.2, fee, taxiFee;

        Scanner scanner = new Scanner(System.in);

        // Requiring distance by km
        System.out.print("Please enter how many kilometers you have travelled: ");
        distance = scanner.nextInt();

        // calculating fee
        fee = openningPrice + (priceByKm * distance);

        // checking if the fee is over or under the minimum fee
        taxiFee = (fee >= minimumFee)? fee:minimumFee;

        // printing final taxi fee
        System.out.println("Your taxi fee is: " + taxiFee);

    }

}
