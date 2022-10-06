package homeworks;

import java.util.Scanner;

public class PrimeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number :  ");
        int number = scanner.nextInt();
        prime(number,2);
    }
    static void prime(int number,int i){
        if (i == number) {
            System.out.print(number + " is a prime number.");
            return;
        } else if (number%i == 0) {
            System.out.print(number + " is not a prime number.");
            return;
        }

        prime(number, i + 1);

    }
}
