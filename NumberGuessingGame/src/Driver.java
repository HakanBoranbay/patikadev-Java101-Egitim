import java.util.Random;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		
		try (Scanner scanner = new Scanner(System.in)) {
			Random random = new Random();
			int targetNumber = random.nextInt(100);
			int right = 5;
			
			while (right > 0) {
				System.out.print("Please enter your guess (tries left = " + right + "): ");
				int guessedNumber = scanner.nextInt();
				
				if (guessedNumber < 0 || guessedNumber > 100) {
					System.out.println("Please enter a number between 0 and 100.");
					continue;
				}
				
				if (guessedNumber == targetNumber) {
					System.out.println("Congratulations! You Won!");
					break;
				} else {
					right--;
					if (guessedNumber < targetNumber) {
						System.out.println("Higher!");					
					} else {
						System.out.println("Lower!");
					}
				}
				
				if (right == 0) {
					System.out.println("Game Over!");
					System.out.println("The number was " + targetNumber);
				}
			}
		}
	}
}
