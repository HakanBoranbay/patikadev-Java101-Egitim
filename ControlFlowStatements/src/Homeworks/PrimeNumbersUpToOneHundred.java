package Homeworks;

public class PrimeNumbersUpToOneHundred {

    public static void main(String[] args) {

        boolean isPrime = true;

        for (int j = 2; j <= 100;  j++) {
            for (int i = j - 1; i > 1 ; i--) {
                if (j % i == 0) {
                    isPrime = false;
                    break;
                } else {
                    isPrime = true;
                }
            }

            if (isPrime) {
                System.out.print(j + " ");
            }
        }
    }
}
