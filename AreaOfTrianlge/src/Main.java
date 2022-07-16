import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int edge1, edge2;
        double edge3, area, u , perimeter, areaSqr;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter length of edge 1: ");
        edge1 = scanner.nextInt();
        System.out.print("Enter length of edge 2: ");
        edge2 = scanner.nextInt();

        edge3 = Math.sqrt((edge1*edge1) + (edge2*edge2));

        perimeter = (edge1 + edge2 + edge3);

        u = perimeter / 2;

        areaSqr = u * (u - edge1) * (u - edge2) * (u - edge3);

        area = Math.sqrt(areaSqr);

        System.out.println("Perimeter of the triangle = " + perimeter + "m");
        System.out.println(("Area of the triangle = " + area + "m^2"));

    }
}
