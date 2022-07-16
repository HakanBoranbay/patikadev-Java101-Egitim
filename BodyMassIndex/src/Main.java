import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Body Mass Index Calculator.

        //Identifying variables:
        double mass, height, bmi;

        // Requesting users mass and height:
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your mass (kg): ");
        mass = scanner.nextDouble();
        System.out.print("Please enter your height (m): ");
        height = scanner.nextDouble();

        // Calculating and printing users BMI:
        bmi = mass / (height * height);

        System.out.println("Your Body Mass Index is: " + bmi + "kg/m^2");

    }

}
