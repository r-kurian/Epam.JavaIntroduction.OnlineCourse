package Epam.Programming_with_classes.Part4_1_Classes_And_Objects.Part4_1_Ex8;

/*
Создать класс Customer, спецификация которого приведена ниже.
Определить конструкторы, set- и get- методы и метод toString().
Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами и методами.
Задать критерии выбора данных и вывести эти данные на консоль.

- Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.

- Найти и вывести:
a) список покупателей в алфавитном порядке;
b) список покупателей, у которых номер кредитной карточки находится в заданном интервале

****************************************************************************************

Create a class of a Customer. Define constructors, set and get methods, and the toString () method.
Create a second class that aggregates an array of Customers, with appropriate constructors and methods.
Set the criteria for selecting data and display this data on the console.

- Customer class: id, last name, first name, patronymic, address, credit card number, bank account number.

- Also find the followings:
a) a list of Customers in alphabetical order;
b) a list of Customers in a given card number range.
*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class CustomerMain {

    public static void main(String[] args) {
        try {

            System.out.println(">>> Here is the list of the 15ty randomized Customers: <<<");

            System.out.println("\nID: # - FirstName, Patronymic, LastName - Address - Account-Number");
            System.out.println("--------------------------------------------------------------------");
            CustomerCRM.addCustomersToCRM();
            CustomerCRM.printCustomerCRM();

            Scanner sc = new Scanner(System.in);
            System.out.println("\n" +
                    ">>> To sort your CRM-list use menu:  <<<" +
                    "\nEnter:   1 to sort by the Name (A-Z);   2 to  to sort by the Card Number;   0 to EXIT the program;");

            int menuPoint = sc.nextInt();
            switch (menuPoint) {
                case 1 -> CustomerCRM.sortByFirstName();
                case 2 -> {
                    System.out.println("Enter two indexes for the beginning and the end of Card Number range:");
                    int startIndex = sc.nextInt();
                    int endIndex = sc.nextInt();
                    CustomerCRM.filterCardNumber(startIndex, endIndex);
                }
                case 0 -> System.exit(0);
                default -> System.out.println("Enter the number only from menu options, namely 1, 2 or 0.\n");

            }
        } catch (IllegalArgumentException |
                InputMismatchException e) {
            System.out.println("Input error! " + e.getMessage());
        }
    }
}
