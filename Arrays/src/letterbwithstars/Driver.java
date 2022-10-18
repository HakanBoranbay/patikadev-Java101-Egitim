package letterbwithstars;

public class Driver {

	public static void main(String[] args) {
		
		String[][] array = new String[7][4];
		
		for(int i = 0; i < 7; i++) {
			for (int j = 0; j < 4; j++) {
				
				if (i==0 || i == 3 || i == 6 || j == 0 || j == 3) array[i][j] = " * ";
				else array[i][j] = "   ";
				
			}
		}
		
		for (String[] row : array){
            for (String col : row){
                System.out.print(col);
            }
            System.out.println();
        }
	}
}
