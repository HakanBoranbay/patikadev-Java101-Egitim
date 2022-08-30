import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Asking for grade inputs from user:
        System.out.println("Your mathematics grade: ");
        int math = scanner.nextInt();
        if (math < 0 || math > 100) {
            math = 0;
        }
        System.out.println("Your physics grade: ");
        int phys = scanner.nextInt();
        if (phys < 0 || phys > 100) {
            phys = 0;
        }
        System.out.println("Your chemistry grade: ");
        int chem = scanner.nextInt();
        if (chem < 0 || chem > 100) {
            chem = 0;
        }
        System.out.println("Your Turkish grade: ");
        int turk = scanner.nextInt();
        if (turk < 0 || turk > 100) {
            turk = 0;
        }
        System.out.println("Your music grade: ");
        int music = scanner.nextInt();
        if (music < 0 || music > 100) {
            music = 0;
        }

        double averageGrade = (math + phys + chem + turk + music) / 5;

        if (averageGrade < 55) {
            System.out.println("You failed the class. Your average grade is " + averageGrade + ".");
        } else {
            System.out.println("Congratulations! You have passed the class with average grade " + averageGrade + ".");
        }
    }
}
