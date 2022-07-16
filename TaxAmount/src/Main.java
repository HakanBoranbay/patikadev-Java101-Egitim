import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan KDV'siz değeri istemek.
        System.out.println("Please enter tex free amount: ");

        // Kullanıcıdan aldığımız değeri tanımlamak.
        double amount = scanner.nextDouble();

        // KDV yüzdesini tanımlamak.
        double taxPercentage = (amount<1000)? 0.18:0.08;

        // Bu değerin vergisiz ve vergili halini ve verginin tutarını yazdırmak.
        System.out.println("Tax free amount = " + amount);
        System.out.println("Amount with tax = " + (amount + amount*taxPercentage));
        System.out.println("Tax amount = " + amount*taxPercentage);

    }

}
