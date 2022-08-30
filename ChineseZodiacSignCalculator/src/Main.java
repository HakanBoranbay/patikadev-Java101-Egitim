import java.util.Scanner;

/**
 *
 * Doğum Tarihi %12 = 0 ➜ Maymun
 *
 * Doğum Tarihi %12 = 1 ➜ Horoz
 *
 * Doğum Tarihi %12 = 2 ➜ Köpek
 *
 * Doğum Tarihi %12 = 3 ➜ Domuz
 *
 * Doğum Tarihi %12 = 4 ➜ Fare
 *
 * Doğum Tarihi %12 = 5 ➜ Öküz
 *
 * Doğum Tarihi %12 = 6 ➜ Kaplan
 *
 * Doğum Tarihi %12 = 7 ➜ Tavşan
 *
 * Doğum Tarihi %12 = 8 ➜ Ejderha
 *
 * Doğum Tarihi %12 = 9 ➜ Yılan
 *
 * Doğum Tarihi %12 = 10 ➜ At
 *
 * Doğum Tarihi %12 = 11 ➜ Koyun
 *
 */

public class Main {

    public static void main(String[] args) {

        // Acquiring necessary information from user:
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your birth year: ");
        int birthYear = scanner.nextInt();

        // Calculating chinese zodiac sign:
        int chineseZodiac = birthYear % 12;

        // building switch-case:
        switch (chineseZodiac) {
            case 1:
                System.out.println("Your Chinese zodiac sign is rooster.");
                break;
            case 2:
                System.out.println("Your Chinese zodiac sign is dog.");
                break;
            case 3:
                System.out.println("Your Chinese zodiac sign is pig.");
                break;
            case 4:
                System.out.println("Your Chinese zodiac sign is rat.");
                break;
            case 5 :
                System.out.println("Your Chinese zodiac sign is ox.");
                break;
            case 6:
                System.out.println("Your Chinese zodiac sign is tiger.");
                break;
            case 7:
                System.out.println("Your Chinese zodiac sign is rabbit.");
                break;
            case 8:
                System.out.println("Your Chinese zodiac sign is dragon.");
                break;
            case 9:
                System.out.println("Your Chinese zodiac sign is snake.");
                break;
            case 10:
                System.out.println("Your Chinese zodiac sign is horse.");
                break;
            case 11:
                System.out.println("Your Chinese zodiac sign is goat.");
                break;
            default:
                System.out.println("Your Chinese zodiac sign is monkey.");
        }
    }
}
