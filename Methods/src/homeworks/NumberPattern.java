package homeworks;

public class NumberPattern {

    public static void main(String[] args) {

        pattern(16);
    }

    public static void pattern(int number) {

        System.out.print(number + " ");

        if (0 < number) {
            pattern(number - 5);
            System.out.print(number + " ");
        }
    }
}
