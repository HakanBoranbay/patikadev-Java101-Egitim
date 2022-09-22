package Practices;

import java.util.Scanner;

public class CombinationCalculation {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements of the set: ");
        int setElements = scanner.nextInt();
        System.out.print("Enter the number of elements of the groups: ");
        int groupElements = scanner.nextInt();

        int setElementsFactorial = 1;
        int groupElementsFactorial = 1;
        int differenceFactorial = 1;

        if (setElements >= groupElements && setElements > 0 && groupElements > 0) {
            for (int i = 1; i <= setElements; i++) {
                setElementsFactorial *= i;
            }
            for (int i = 1; i <= groupElements; i++) {
                groupElementsFactorial *= i;
            }
            for (int i = 1; i <= (setElements - groupElements); i++) {
                differenceFactorial *= i;
            }
            int combination = setElementsFactorial / (groupElementsFactorial * differenceFactorial);
            System.out.println(setElements + " combination " + groupElements + " = " + combination);
        } else {
            System.out.println("Number of set element should be greater of equal to number of group elements.");
            System.out.println("Both numbers of set and group elements should be positive.");
        }


    }
}
