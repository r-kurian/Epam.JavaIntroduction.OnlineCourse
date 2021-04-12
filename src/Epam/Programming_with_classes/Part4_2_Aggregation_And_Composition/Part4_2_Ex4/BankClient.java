package Epam.Programming_with_classes.Part4_2_Aggregation_And_Composition.Part4_2_Ex4;

import java.util.List;

public class BankClient {

    private String clientName;
    private List<BankAccount> bankAccounts;

    public BankClient(String clientName, List<BankAccount> bankAccounts) {
        this.clientName = clientName;
        this.bankAccounts = bankAccounts;
    }


    public void sortAccount() {
        bankAccounts.stream().
                sorted((x, y) -> (int) x.getBalance() - (int) y.getBalance())
                .forEach(System.out::print);
    }

    public double amountOfPositiveAccounts() {
        double positiveBalance = 0;
        for (BankAccount x : bankAccounts) {
            if (x.getBalance() > 0) {
                positiveBalance += x.getBalance();
            }
        }
        return positiveBalance;
    }

    public double amountOfOverdraft() {
        double overdraft = 0;
        for (BankAccount x : bankAccounts) {
            if (x.getBalance() < 0) {
                overdraft += x.getBalance();
            }
        }
        return overdraft;
    }

    public void blockMyAccount(int idBlock) {
        for (BankAccount myAccount : bankAccounts) {
            if (myAccount.getAccountId() == idBlock) {
                myAccount.block();
                System.out.println("\nThe bank account is blocked!: " + myAccount);
            }
        }
    }

   public void unlockMyAccount(int idUnlock) {
        for (BankAccount myAccount : bankAccounts) {
            if (myAccount.getAccountId() == idUnlock) {
                myAccount.unlock();
                System.out.println("\nThe bank account is unlocked!:" + myAccount);
            }
        }
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public List<BankAccount> getBankAccounts() {
        return bankAccounts;
    }

    public void setBankAccounts(List<BankAccount> bankAccounts) {
        this.bankAccounts = bankAccounts;
    }

    public void print() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "\nClient's Name: " + clientName +
                ", Client's Accounts:" + bankAccounts;
    }
}
