package arraytranspose;

public class Driver {

	public static void main(String[] args) {
		
		int[][] array = {{2,3,4},{5,6,4}}; 
		
		int[][] newArray = transposeArray(array);
		
		for(int[] row: newArray) {
			for(int column: row) {
				System.out.print(column);
			}
			System.out.println();
		}
		
	}
	
	public static int[][] transposeArray(int[][] array) {
		
		int[][] newArray = new int[(array[0].length)][array.length];
		
		for (int i = 0; i < array.length; i++) {
			for(int j = 0; j < (array[0].length); j++) {
				
				newArray[j][i] = array[i][j];
				
			}
		}
		
		return newArray;
	}
}
