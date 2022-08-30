import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your birth month (1-12): ");
        int month = scanner.nextInt();
        System.out.println("Please enter you birth day: ");
        int day = scanner.nextInt();

        if (month == 1) {
            if (day < 1 || day > 31) {
                System.out.println("You entered an invalid day.");
            } else if (day < 20) {
                System.out.println("Your zodiac sign is capricorn.");
            } else {
                System.out.println("Your zodiac sign is aquarius.");
            }
        } else if (month == 2) {
            if (day < 1 || day > 29) {
                System.out.println("You entered an invalid day.");
            } else if (day < 18) {
                System.out.println("Your zodiac sign is aquarius.");
            } else {
                System.out.println("Your zodiac sign is pisces.");
            }
        } else if (month == 3) {
            if (day < 1 || day > 31) {
                System.out.println("You entered an invalid day.");
            } else if (day < 21) {
                System.out.println("Your zodiac sign is pisces.");
            } else {
                System.out.println("Your zodiac sign is aries.");
            }
        } else if (month == 4) {
            if (day < 1 || day > 30) {
                System.out.println("You entered an invalid day.");
            } else if (day < 20) {
                System.out.println("Your zodiac sign is aries.");
            } else {
                System.out.println("Your zodiac sign is taurus.");
            }
        } else if (month == 5) {
            if (day < 1 || day > 31) {
                System.out.println("You entered an invalid day.");
            } else if (day < 21) {
                System.out.println("Your zodiac sign is taurus.");
            } else {
                System.out.println("Your zodiac sign is gemini.");
            }
        } else if (month == 6) {
            if (day < 1 || day > 30) {
                System.out.println("You entered an invalid day.");
            } else if (day < 21) {
                System.out.println("Your zodiac sign is gemini.");
            } else {
                System.out.println("Your zodiac sign is cancer.");
            }
        } else if (month == 7) {
            if (day < 1 || day > 31) {
                System.out.println("You entered an invalid day.");
            } else if (day < 23) {
                System.out.println("Your zodiac sign is gemini.");
            } else {
                System.out.println("Your zodiac sign is leo.");
            }
        } else if (month == 8) {
            if (day < 1 || day > 31) {
                System.out.println("You entered an invalid day.");
            } else if (day < 23) {
                System.out.println("Your zodiac sign is leo.");
            } else {
                System.out.println("Your zodiac sign is virgo.");
            }
        } else if (month == 9) {
            if (day < 1 || day > 30) {
                System.out.println("You entered an invalid day.");
            } else if (day < 23) {
                System.out.println("Your zodiac sign is virgo.");
            } else {
                System.out.println("Your zodiac sign is libra.");
            }
        } else if (month == 10) {
            if (day < 1 || day > 31) {
                System.out.println("You entered an invalid day.");
            } else if (day < 23) {
                System.out.println("Your zodiac sign is libra.");
            } else {
                System.out.println("Your zodiac sign is scorpio.");
            }
        } else if (month == 11) {
            if (day < 1 || day > 30) {
                System.out.println("You entered an invalid day.");
            } else if (day < 22) {
                System.out.println("Your zodiac sign is scorpio.");
            } else {
                System.out.println("Your zodiac sign is sagittarius.");
            }
        } else if (month == 12) {
            if (day < 1 || day > 31) {
                System.out.println("You entered an invalid day.");
            } else if (day < 22) {
                System.out.println("Your zodiac sign is sagittarius.");
            } else {
                System.out.println("Your zodiac sign is capricorn.");
            }
        } else {
            System.out.println("You entered an invalid month.");
        }
    }
}
