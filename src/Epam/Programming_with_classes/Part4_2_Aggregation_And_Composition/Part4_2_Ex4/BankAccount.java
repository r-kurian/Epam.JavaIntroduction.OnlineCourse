package Epam.Programming_with_classes.Part4_2_Aggregation_And_Composition.Part4_2_Ex4;

public class BankAccount {

    private static int id = 0; // Static
    private int accountId;
    private String nameOfAccount;
    private double balance = 0;
    private boolean isBlocked;

    public BankAccount(int accountId, String nameOfAccount, double balance, boolean isBlocked) {
        BankAccount.id++;
        this.accountId = BankAccount.id;
        this.nameOfAccount = nameOfAccount;
        this.balance = balance;
        this.isBlocked = isBlocked;
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        BankAccount.id = id;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public String getNameOfAccount() {
        return nameOfAccount;
    }

    public void setNameOfAccount(String nameOfAccount) {
        this.nameOfAccount = nameOfAccount;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public boolean isBlocked() {
        return isBlocked;
    }

    public void setBlocked(boolean blocked) {
        isBlocked = blocked;
    }

    public void print() {
        System.out.println(toString());
    }

    public void block() {
        isBlocked = true;
    }

    public void unlock() {
        isBlocked = false;
    }

    @Override
    public String toString() {
        return "\nAccount ID: " + accountId +
                ", bank of account: " + nameOfAccount +
                ", balance = " + balance +
                ", isBlocked: " + isBlocked;
    }
}
