package sortanarray;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the length of the array: ");
		int length = scanner.nextInt();
		int[] array = new int[length];
		for(int i = 0; i < length; i++) {
			System.out.print("Enter index " + i + ": ");
			array[i] = scanner.nextInt();
		}

		int temp;

		for (int i = 0; i < array.length; i++) {
			for (int j = i+1; j < array.length; j++) {
				if (array[i] > array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}


		for (int element: array) {
			System.out.print(element + " ");
		}
	}
}
