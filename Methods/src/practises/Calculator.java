package practises;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        calculator(scanner);
    }

    public static void calculator(Scanner scanner) {

        System.out.println("Welcome!");

        String operations = "1 - Addition" +
                "\n2 - Extraction" +
                "\n3 - Multiplication" +
                "\n4 - Division" +
                "\n5 - Power" +
                "\n6 - Mode" +
                "\n7 - Perimeter and area of a rectangle" +
                "\n0 - Exit";

        int operation, number1, number2;
        while (true) {

            System.out.println("Please select an operation: ");
            System.out.println(operations);
            operation = scanner.nextInt();
            if (operation == 0) break;
            if (operation < 0 || operation > 7) {
                System.out.println("Operation not valid.");
                continue;
            }
            System.out.print("Number 1: ");
            number1 = scanner.nextInt();
            System.out.print("Number 2: ");
            number2 = scanner.nextInt();

            switch (operation) {
                case 1:
                    System.out.println("Result = " + add(number1, number2));
                    break;
                case 2:
                    System.out.println("Result = " + extract(number1, number2));
                    break;
                case 3:
                    System.out.println("Result = " + multiply(number1, number2));
                    break;
                case 4:
                    System.out.println("Result = " + divide(number1, number2));
                    break;
                case 5:
                    System.out.println("Result = " + power(number1, number2));
                    break;
                case 6:
                    System.out.println("Result = " + mode(number1, number2));
                    break;
                case 7:
                    System.out.println("Perimeter of rectangle = " + calculatePerimeterOfARectangle(number1, number2));
                    System.out.println("Area of rectangle = " + calculateAreaOfARectangle(number1, number2));
                    break;
            }

        }
    }

    private static int add(int number1, int number2) {
        return number1 + number2;
    }

    private static int extract(int number1, int number2) {
        return number1 - number2;
    }

    private static int multiply(int number1, int number2) {
        return number1 * number2;
    }

    private static double divide(double number1, double number2) {
        return (number1 / number2);
    }

    private static int power(int number1, int number2) {
        int power = 1;
        for (int i = 0; i < number2; i++) {
            power *= number1;
        }
        return power;
    }

    private static int mode(int number1, int number2) {
        return number1 % number2;
    }

    private static int calculateAreaOfARectangle(int number1, int number2) {
        return multiply(number1,number2);
    }

    private static int calculatePerimeterOfARectangle(int number1, int number2) {
        return multiply(2,add(number1,number2));
    }
}
