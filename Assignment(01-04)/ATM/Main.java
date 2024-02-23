package ATM;

import java.util.Scanner;

public class Main {
    static int pin = 1234;
    static int balance = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your PIN: ");
        int enteredPin = sc.nextInt();
        if (enteredPin != pin) {
            System.out.println("Incorrect PIN. Exiting...");
            sc.close();
            return;
        }
        System.out.println("PIN verified. Welcome to Simple ATM.");
        while (true) {
            System.out.println("\nWelcome to Simple ATM");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Balance enquiry");
            System.out.println("4. PIN change");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    deposit(sc);
                    break;
                case 2:
                    withdraw(sc);
                    break;
                case 3:
                    balanceEnquiry();
                    break;
                case 4:
                    pinChange(sc);
                    break;
                case 5:
                    System.out.println("Exiting ATM. Thank you!");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice! Please select again.");
            }
        }
    }

    public static void deposit(Scanner sc) {
        System.out.print("Enter amount to deposit: ");
        int amount = sc.nextInt();
        balance += amount;
        System.out.println("The Available Balance is : " + balance);
    }

    public static void withdraw(Scanner sc) {
        System.out.print("Enter amount to withdraw: ");
        int amount = sc.nextInt();
        if (amount <= balance) {
            balance -= amount;
            System.out.println("The Available Balance is : " + balance);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    public static void balanceEnquiry() {
        System.out.println("Your current balance is: " + balance);
    }

    public static void pinChange(Scanner sc) {
        System.out.print("Enter new PIN: ");
        pin = sc.nextInt();
        System.out.println("PIN changed successfully!");
    }
}

