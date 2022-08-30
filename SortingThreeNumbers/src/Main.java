import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /**
         * Sorting three numbers from lowest to highest.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter three numbers: ");
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        int thirdNumber = scanner.nextInt();

        if (firstNumber < secondNumber && firstNumber < thirdNumber) {
            if (secondNumber < thirdNumber) {
                System.out.println("First number < second number < third number.");
            } else {
                System.out.println("First number < third number < second number.");
            }
        } else if (secondNumber < firstNumber && secondNumber < thirdNumber) {
            if (firstNumber < thirdNumber) {
                System.out.println("Second number < first number < third number.");
            } else {
                System.out.println("Second number < third number < first number.");
            }
        } else {
            if (firstNumber < secondNumber) {
                System.out.println("Third number < first number < second number.");
            } else {
                System.out.println("Third number < second number < first number.");
            }
        }
    }
}
