package elementfrequency;

public class Driver {

	public static void main(String[] args) {
		
		int[] array = {10, 20, 20, 10, 10, 20, 5, 20};
		
		printFrequency(array);
		
	}
	
	public static void frequency(int[] array, int number) {
		
		int counter = 0;
		for (int element: array) {
			if(element == number) counter++;
		}
		
		System.out.println(number + " is repeated " + counter + " times.");
	}
	
	public static int[] sortArray(int[] array) {
		
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
		
		return array;
	}
	
	public static void printFrequency(int[] array) {
		
		array = sortArray(array);
		
		frequency(array, array[0]);
		
		for (int i = 1; i < array.length; i++) {
			if (array[i - 1] != array[i]) frequency(array, array[i]);
		}
	}
}
