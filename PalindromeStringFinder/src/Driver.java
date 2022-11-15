import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		
		System.out.println("Welcome to palindrome sentence finder!");
		
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Please enter a sentence: ");
			String sentence = scanner.nextLine();
			
			if (isPalindrome(sentence)) {
				System.out.println("'" + sentence + "' is a palindrome.");
			} else {
				System.out.println("'" + sentence + "' is not a palindrome.");
			}
		}
	}
	
	public static boolean isPalindrome(String phrase) {
		
		char[] phraseArray = phrase.toCharArray();
		String finalPhrase = "";
		
		for(char character : phraseArray) {
			if (Character.isLetter(character)) {
				finalPhrase += character;
				finalPhrase = finalPhrase.toLowerCase();
			}
		}
		
		char[] finalArray = finalPhrase.toCharArray();
		
		for (int i = 1; i <= (finalArray.length / 2); i++) {
			
			if (!(finalArray[i-1] == finalArray[finalArray.length - i])) return false;
		}
		
		return true;
	}
}
