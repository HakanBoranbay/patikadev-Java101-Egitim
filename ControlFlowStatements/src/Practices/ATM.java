package Practices;

import java.util.Scanner;

public class ATM {

    public static void main(String[] args) {
        String userName, password;
        Scanner input = new Scanner(System.in);
        int right = 3;
        int balance = 1500;
        int select;
        while (right > 0) {
            System.out.print("Username :");
            userName = input.nextLine();
            System.out.print("Password : ");
            password = input.nextLine();

            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("Hello! Welcome to Patika Bank!");
                do {
                    System.out.println("1-Deposit\n" +
                            "2-Withdraw\n" +
                            "3-Balance inquiry\n" +
                            "4-Exit");
                    System.out.print("Please select a process : ");
                    select = input.nextInt();
                    switch (select) {
                        case 1:
                            System.out.print("Amount : ");
                            int depositAmount = input.nextInt();
                            balance += depositAmount;
                            break;
                        case 2:
                            System.out.print("Amount : ");
                            int withdrawalAmount = input.nextInt();
                            if (withdrawalAmount > balance) {
                                System.out.println("Insufficient balance.");
                            } else {
                                balance -= withdrawalAmount;
                            }
                            break;
                        case 3:
                            System.out.println("Your balance : " + balance);
                            break;
                        case 4:
                        default:
                            System.out.println("Goodbye.");
                            break;
                    }

                } while (select != 4);
            } else {
                right--;
                System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");
                if (right == 0) {
                    System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz.");
                } else {
                    System.out.println("Kalan Hakkınız : " + right);
                }
            }
        }
    }
}