package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean correct = false;
        int i = 1;
        double balance = 2500.75;


        do {
            System.out.print("Enter 4-digit PIN: ");
            String pin = scanner.nextLine();

            if (pin.equals("1234")) {
                correct = true;

                int choice = 0;

                while (choice != 5) {

                    System.out.println("\n========= ATM =========");
                    System.out.println("1. Check Balance");
                    System.out.println("2. Deposit");
                    System.out.println("3. Withdraw");
                    System.out.println("4. Show Account Status");
                    System.out.println("5. Exit");
                    System.out.println("=======================");

                    System.out.print("Enter your choice: ");
                    choice = scanner.nextInt();

                    switch (choice) {

                        case 1:
                            System.out.println("Current Balance: " + balance);
                            break;

                        case 2:
                            System.out.print("Enter deposit amount: ");
                            double deposit = scanner.nextDouble();

                            if (deposit > 0) {
                                balance += deposit;
                                System.out.println("Updated Balance: " + balance);
                            } else {
                                System.out.println("Invalid amount.");
                            }
                            break;

                        case 3:
                            System.out.print("Enter withdrawal amount: ");
                            double withdraw = scanner.nextDouble();

                            if (withdraw > 0 && withdraw <= balance) {
                                balance -= withdraw;
                                System.out.println("Updated Balance: " + balance);
                            } else {
                                System.out.println("Insufficient balance.");
                            }
                            break;

                        case 4:
                            if (balance >= 5000) {
                                System.out.println("VIP Customer");
                            } else if (balance >= 1000) {
                                System.out.println("Regular Customer");
                            } else {
                                System.out.println("Low Balance");
                            }
                            break;

                        case 5:
                            System.out.println("Thank you for using our ATM.");
                            break;

                        default:
                            System.out.println("Invalid option.");
                    }

                    scanner.nextLine();
                }

                break;
            }

            i++;

        } while (i <= 3);

        if (!correct) {
            System.out.println("Your account has been locked.");
        }

        scanner.close();
    }
}