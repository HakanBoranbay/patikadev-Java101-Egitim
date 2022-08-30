import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Requesting username and password input from user:
        System.out.print("Username: ");
        String username = scanner.nextLine();
        System.out.print("Password: ");
        String password = scanner.nextLine();

        // Checking username and password:
        if (username.equals("admin") && password.equals("0000")) {
            System.out.println("Successfully signed in.");
        } else {
            System.out.println("Wrong username or password.");

            // Asking if the user wants to change information:
            System.out.println("Do you wish to reset password? (yes or no)");
            String reset = scanner.nextLine();

            // Reseting password:
            if (reset.equals("yes")) {
                System.out.print("New Password: ");
                String newPassword = scanner.nextLine();

                if (!newPassword.equals(password) && !newPassword.equals("0000")) {
                    System.out.println("Password reset successful.");
                }
                else {
                    System.out.println("Password reset unsuccessful.");
                }
            }
        }
    }
}
