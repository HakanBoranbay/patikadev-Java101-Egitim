import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        System.out.println(isPalindromeNumber(1));
        System.out.println(isPalindromeNumber(4));
        System.out.println(isPalindromeNumber(8));
        System.out.println(isPalindromeNumber(99));
        System.out.println(isPalindromeNumber(101));
        System.out.println(isPalindromeNumber(363));
        System.out.println(isPalindromeNumber(4004));
        System.out.println(isPalindromeNumber(9889));
    }

    public static boolean isPalindromeNumber(int number) {

        int newNumber = 0;
        int temp = number;

        while(temp > 0) {
            newNumber = (newNumber * 10) + (temp % 10);
            temp /= 10;
        }
        return number == newNumber;
    }
}
