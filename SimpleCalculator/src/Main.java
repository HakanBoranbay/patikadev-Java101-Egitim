import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Welcome to Simple Calculator Program.");

        // Printing operations.
        System.out.println("****************************************");
        String operations = "1. Addition" +
                "\n2. Subtraction" +
                "\n3. Multiplication" +
                "\n4. Division";
        System.out.println(operations);
        System.out.println("****************************************");

        // Requesting numbers and operation choice from the user.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please select the operation: ");
        String selection = scanner.nextLine();
        System.out.print("Please enter the first number: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Please enter the second number: ");
        int secondNumber = scanner.nextInt();

        // Swith case structure
        switch (selection) {
            case "1":
                System.out.println("Result = " + (firstNumber + secondNumber));
                break;
            case "2":
                System.out.println("Result = " + (firstNumber - secondNumber));
                break;
            case "3":
                System.out.println("Result = " + (firstNumber * secondNumber));
                break;
            case "4":
                if (secondNumber != 0) {
                    System.out.println("Result = " + (double)(firstNumber / secondNumber));
                } else {
                    System.out.println("A number can't be devided by zero.");
                }
                break;
            default:
                System.out.println("Invalid selection.");
        }

    }
}
