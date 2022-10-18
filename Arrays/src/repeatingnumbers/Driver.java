package repeatingnumbers;

public class Driver {

	public static void main(String[] args) {
		
		int[] array = {1, 2, 3, 4, 3, 4, 5, 6, 5, 6, 7, 8};
		int[] repeatingNumbers = new int[array.length];
		int counter = 0;

		
		for(int i = 0; i < array.length; i++) {
			if(array[i] % 2 != 0) continue;
			for(int j = 0; j < array.length; j ++) {
				if (i == j) continue;
				if(array[i] == array[j]) {
					repeatingNumbers[counter] = array[i];
					counter++;
				}
			}
		}
		
		for(int element: repeatingNumbers) {
			System.out.print(element + " ");
		}
	}
}
