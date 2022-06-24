import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Define scanner class.
        Scanner scanner = new Scanner(System.in);

        // Create variables.
        int math, phys, chem, turk, hist, musc;

        // Request variables from user.
        System.out.print("Insert your Math note: ");
        math = scanner.nextInt();

        System.out.print("Insert your Physics note: ");
        phys = scanner.nextInt();

        System.out.print("Insert your Chemistry note: ");
        chem = scanner.nextInt();

        System.out.print("Insert your Turkish note: ");
        turk = scanner.nextInt();

        System.out.print("Insert your History note: ");
        hist = scanner.nextInt();

        System.out.print("Insert your Music note: ");
        musc = scanner.nextInt();

        // Calculate average grade.
        int sumNote = (math + phys + chem + turk + hist + musc);
        double result = (sumNote/6);

        // Print average grade.
        System.out.println("Your average grade is: " + result);

        // Print if the user is successful or not.
        String success = (result >= 60)?"You have passed!":"You have failed.";

        System.out.println(success);
    }
}
