package closertoinput;

import java.util.Scanner;

import javafx.scene.transform.Scale;

public class Driver {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int input = scanner.nextInt();
		
		int[] array = {15,12,788,1,-1,-778,2,0};
		
		System.out.println("Closest number in the array that is smaller than " + input + " : " + smallerClosest(array, input));
		System.out.println("Closest number in the array that is greater than " + input + " : " + greaterClosest(array, input));

	}

	public static int smallerClosest(int[] arr, int input) {

		int diff = Integer.MAX_VALUE;
		int result = 0;

		for (int element: arr) {
			if((input - element) <= 0) continue;
			if((input - element) < diff) {
				diff = (input - element);
				result = element;
			}
		}

		return result;
	}

	public static int greaterClosest(int[] arr, int input) {

		int diff = Integer.MAX_VALUE;
		int result = 0;

		for (int element: arr) {
			if((element - input) <= 0) continue;
			if((element - input) < diff) {
				diff = (element - input);
				result = element;
			}
		}

		return result;
	}
}
