package Epam.Programming_with_classes.Part4_2_Aggregation_And_Composition.Part4_2_Ex4;

/*
Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки счета.
Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам.
Вычисление суммы по всем счетам, имеющим положительный и отрицательный балансы отдельно.
*/

/*
Bank accounts. A customer has several bank accounts.
Implement the possibility of blocking / unblocking an account.
Implement search and sorting of accounts. Calculation of the total amount on accounts.
Calculation of the amount for all accounts with positive and negative balances separately.
*/

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class BankAccountMain {

    public static void main(String[] args) {
        try {

            ArrayList<BankAccount> accountsOfClient1 = new ArrayList<>();
            accountsOfClient1.add(new BankAccount(BankAccount.getId(), "JPMorgan-Chase", 5000, false));
            accountsOfClient1.add(new BankAccount(BankAccount.getId(), "Bank of America", 10000, true));
            accountsOfClient1.add(new BankAccount(BankAccount.getId(), "Wells Fargo", 1000, false));
            accountsOfClient1.add(new BankAccount(BankAccount.getId(), "Citibank", 2000, false));
            accountsOfClient1.add(new BankAccount(BankAccount.getId(), "U.S. Bank", -5000, false));

            BankClient client1 = new BankClient("Jack Daniels", accountsOfClient1);

            System.out.println("Your bank accounts list: ");
            client1.print();

            System.out.println("""

                    Use menu to get the Information:
                    Enter: \s
                     1 to sort the accounts list (min->max);              2 to find total amount of all accounts;
                     3 to find amount of positive balance accounts;       4 to find amount of overdraft;
                     5 to block some of your account;                     6 to unlock some of your account;
                     0 to EXIT the program;""");

            Scanner sc = new Scanner(System.in);
            int menuPoint = sc.nextInt();
            switch (menuPoint) {

                case 1 -> {
                    System.out.println("\nSorted accounts list (min->max):");
                    client1.sortAccount();
                }
                case 2 -> {
                    System.out.println("\nThe total amount of all your accounts:");
                    System.out.println((client1.amountOfOverdraft() + client1.amountOfPositiveAccounts()));
                }
                case 3 -> {
                    System.out.println("\nThe amount of the accounts with the positive balance:");
                    System.out.println(client1.amountOfPositiveAccounts());
                }
                case 4 -> {
                    System.out.println("\nThe amount of the overdrafts:");
                    System.out.println(client1.amountOfOverdraft());
                }
                case 5 -> {
                    System.out.println("\nTo block your account enter its ID-number:");
                    int idBlock = sc.nextInt();
                    if (idBlock != BankAccount.getId()) {
                        System.out.println("No such ID, try again");
                    } else {
                        client1.blockMyAccount(idBlock);
                    }
                }
                case 6 -> {
                    System.out.println("\nTo unlock your account enter its ID-number:");
                    int idUnlock = sc.nextInt();
                    if (idUnlock != BankAccount.getId()) {
                        System.out.println("No such ID, try again");
                    } else {
                        client1.unlockMyAccount(idUnlock);
                    }
                }
                case 0 -> System.exit(0);
                default -> System.out.println("Enter the number only from menu options, namely 1 - 6 or 0.\n");
            }

        } catch (IllegalArgumentException | InputMismatchException e) {
            System.out.println("Input error! " + e.getMessage());
        }
    }
}