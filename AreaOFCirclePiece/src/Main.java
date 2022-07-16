import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Identifying variables.
        double r, perimeter, area, areaOfPiece;
        int angle;

        Scanner scanner = new Scanner(System.in);

        // Requesting radius and central angle.
        System.out.print("Please enter radius of the circle: ");
        r = scanner.nextDouble();
        System.out.print("Please enter central angle: ");
        angle = scanner.nextInt();

        // Calculating Perimeter, Area and Area of the circle piece.
        perimeter = 2 * Math.PI * r;
        area = Math.PI * r * r;
        areaOfPiece = area * angle / 360;

        // Printing Perimeter, Area and Area of the circle piece.
        System.out.println("Perimeter = " + perimeter + "m");
        System.out.println("Area = " + area + "m^2");
        System.out.println("Area of the circle piece = " + areaOfPiece + "m^2");

    }
}
