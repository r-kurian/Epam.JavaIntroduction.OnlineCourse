package Epam.Programming_with_classes.Part4_1_Classes_And_Objects.Part4_1_Ex8;

/*
Create a class of a Customer. Define constructors, set and get methods, and the toString () method.
Create a second class that aggregates an array of Customers, with appropriate constructors and methods.
Set the criteria for selecting data and display this data on the console.

- Customer class: id, last name, first name, patronymic, address, credit card number, bank account number.

- Also find the followings:
a) a list of Customers in alphabetical order;
b) a list of Customers in a given card number range.
*/

public class Customer {

    private static int id = 0; // Static
    private String surname;
    private String name;
    private String patronymic;
    private String address;
    private long cardNumber;
    private long accountNumber;

    public Customer(String surname, String name, String patronymic, String address, int id) {
        Customer.id++;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.address = address;
        cardNumber = Customer.id * 1000;
        accountNumber = Customer.id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(long cardNumber) {
        this.cardNumber = cardNumber;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    @Override
    public String toString() {

        return
                "ID: " + accountNumber + " - "
                        + surname
                        + " " + name + ". "
                        + patronymic + " - "
                        + address + " - " +
                        +cardNumber;
    }
}
