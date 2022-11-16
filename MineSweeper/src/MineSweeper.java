import java.util.Random;
import java.util.Scanner;

public class MineSweeper {

	private int rowNumber;
	private int columnNumber;

	public MineSweeper(int rowNumber, int columnNumber) {
		this.rowNumber = rowNumber;
		this.columnNumber = columnNumber;
	}

	public void run() { 

		String[][] field = fillField(rowNumber, columnNumber);
		String[][] shownField = createEmptyField(rowNumber, columnNumber);

		printField(shownField);

		int chosenRow = 0;
		int chosenColumn = 0;
		int dimension = rowNumber * columnNumber;
		int mineNumber = dimension / 4;
		boolean win = false;
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		while (!win) {

			System.out.print("Which row? ");
			chosenRow = scanner.nextInt();
			System.out.print("Which column? ");
			chosenColumn = scanner.nextInt();

			if (chosenColumn < 0 || chosenRow < 0 || chosenColumn >= columnNumber || chosenRow > rowNumber) {
				System.out.println("Please stay in the field.");
				continue;
			}

			if (field[chosenRow][chosenColumn] == " * ") {
				System.out.println("***** BOOM *****");
				System.out.println("YOU LOST!");
				break;
			}

			if (field[chosenRow][chosenColumn] == "   ") {
				shownField[chosenRow][chosenColumn] = " " + checkNeighborBombs(field, chosenRow, chosenColumn) + " ";
				printField(shownField);
			}

			int whiteSpaceCount = 0;
			for (String[] row : shownField){
				for (String col : row){
					if((col == "   ")) whiteSpaceCount++;
				}
			}
			
			if (whiteSpaceCount <= mineNumber) {
				System.out.println("WOW! YOU WON!");
				break;
			}

		}
		
	}

private void printField(String[][] field) {
	int count;
	for (String[] row : field){
		count = 0;
		for (int i = 0; i < field.length; i++) System.out.print("----");
		System.out.print("-");
		System.out.println();
		for (String col : row){
			System.out.print("|");
			System.out.print(col);
			if (count == field[0].length -1) System.out.print("|");
			count++;
		}
		System.out.println();
	}
	for (int i = 0; i < field.length; i++) System.out.print("----");
	System.out.print("-");
	System.out.println();
}

private String[][] fillField(int rowNumber, int columnNumber) {

	Random random = new Random();

	int mineNumber = (rowNumber * columnNumber) / 4;

	String[][] field = new String[rowNumber][columnNumber];

	for(int i = 0; i < rowNumber; i++) {
		for (int j = 0; j < columnNumber; j++) {
			field[i][j] = "   ";
		}
	}

	int mineCount = 0;
	while(mineCount < mineNumber) {
		mineCount = 0; 
		int row = (int) random.nextInt(rowNumber);
		int column = (int) random.nextInt(columnNumber);

		field[row][column] = " * ";

		for(int i = 0; i < rowNumber; i++) {
			for (int j = 0; j < columnNumber; j++) {
				if( field[i][j] == " * ") {
					mineCount++;
				}
			}
		}
	}

	return field;
}

private int checkNeighborBombs(String[][] field, int chosenRow, int chosenColumn) {

	int rowNumber = field.length;
	int columnNumber = field[0].length;

	int count = 0;
	for (int i = chosenRow - 1; i <= chosenRow + 1; i++) {

		if (i < 0 || i >= rowNumber) continue;

		for (int j = chosenColumn -1; j <= chosenColumn + 1; j++) {

			if (j < 0 || j >= columnNumber) continue;

			if (field[i][j] == " * ") count++;
		}
	}

	return count;
}

private String[][] createEmptyField(int rowNumber, int columnNumber) {

	String[][] emptyField = new String[rowNumber][columnNumber];

	for(int i = 0; i < rowNumber; i++) {
		for (int j = 0; j < columnNumber; j++) {
			emptyField[i][j] = "   ";
		}
	}

	return emptyField;
}
}


