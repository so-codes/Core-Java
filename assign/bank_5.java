package assign;

import java.util.*;

public class bank_5 {

    static Scanner pog = new Scanner(System.in);
    String name;
    long mobNo;
    int accNo;
    int balance;

    public void getData() {
        System.out.print("\nEnter name: ");
        name = pog.next();
        System.out.print("\nEnter mobile number: ");
        mobNo = pog.nextLong();
        System.out.print("\nEnter account ID: ");
        accNo = pog.nextInt();
        System.out.print("\nEnter balance: ");
        balance = pog.nextInt();
    }

    public void deposit() {
        System.out.print("\nEnter amount to deposit: ");
        int amount = pog.nextInt();
        balance = balance + amount;
        System.out.println("\nNew balance is: " + balance);
    }

    public void withdraw() {
        System.out.print("\nEnter amount to withdraw: ");
        int amount = pog.nextInt();
        if (amount > balance) {
            System.out.println("\nInsufficient balance");
        } else {
            balance = balance - amount;
            System.out.println("\nNew balance is: " + balance);
        }
    }

    public void showData() {
        System.out.println("\nAccount Name: " + name);
        System.out.println("\nMobile number: " + mobNo);
        System.out.println("\nAccount ID: " + accNo);
        System.out.println("\nBank Balance: " + balance);
    }

    public static void main(String[] args) {
        try {
            bank_5 b = new bank_5();
            char ch = 'y';
            while (ch == 'y' || ch == 'Y') {
                b.getData();
                System.out.print(
                        "\nChoose an operation\n1 = Deposit\n2 = Withdraw\n3 = Show data\n------------------------------\n");
                System.out.print("\nEnter an operation: ");
                int op = pog.nextInt();
                switch (op) {
                    case 1:
                        b.deposit();
                        break;
                    case 2:
                        b.withdraw();
                        break;
                    case 3:
                        b.showData();
                        break;
                    default:
                        System.out.println("\nIncorrect operation");
                }
                System.out.println("Do you want to continue: ");
                ch = pog.next().charAt(0);
            }
        } catch (Exception e) {
            System.out.println("Exception handled " + "\n" + e);
        }
    }

}
