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

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class CustomerCRM {

    public static Customer[] CustomerCRM = new Customer[15];

    public static void addCustomersToCRM() {

        for (int i = 0; i < 15; ++i) {
            CustomerCRM[i] = new Customer(getFirstName(), getPatronymic(), getLastName(),
                    getRandomAddress(), getID());
        }
    }

    // creates First Name
    private static final String[] NameArray = {"Emma", "Eunice", "Trevor", "Vanessa", "Sean",
            "Cristina", "Dana", "Edwin", "Aaron", "Orville", "Lucy", "Lukas", "Jonas", "Anna", "Mia"};

    public static String getFirstName() {
        Random randomizedFirstName = new Random();
        return NameArray[randomizedFirstName.nextInt(NameArray.length)];
    }

    // creates Patronymic (one Letter)
    public static String getPatronymic() {
        Random randomPatronymic = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1; i++) {
            char tmp = (char) ('A' + randomPatronymic.nextInt('Z' - 'A'));
            sb.append(tmp);
        }
        return sb.toString();
    }

    // creates Last Name
    private static final String[] LastNameArray = {"Patterson", "Lowe", "Patrick", "Graves", "Medina",
            "Banks", "Hawkins", "Grant", "Bell", "Cannon", "Buchanan", "Glass", "Holland", "Klein"};

    public static String getLastName() {
        Random randomizedLastName = new Random();
        return LastNameArray[randomizedLastName.nextInt(LastNameArray.length)];
    }

    // creates Address: randomized City + randomized Street + randomized NumberOfStreet
    private static final String[] City = {"New York", "Chicago", "Los Angeles", "London", "Berlin", "Paris", "Rom", "Madrid", "Amsterdam", "Oslo",};
    private static final String[] Street = {"Broadway", "La Rambla", "Abbey Road", "Champs-Élysées", "Orchard Road", "Fifth Avenue", "La Pigalle", "Harley Street", "Grafton Street", "Carnaby Street", "Bourbon Street", "Lombard Street"};
    private static final String[] NumberOfStreet = {"11", "22", "33", "44", "55", "66", "77", "88", "99"};

    // creates Address:
    public static String getRandomAddress() {
        Random randomizedAddress = new Random();
        return City[randomizedAddress.nextInt(City.length)] + ", " +
                Street[randomizedAddress.nextInt(Street.length)] + " " +
                NumberOfStreet[randomizedAddress.nextInt(NumberOfStreet.length)];
    }

    public static int getID() {
        return 0;
    }

    public static void printCustomerCRM() {
        for (Customer x : CustomerCRM)
            System.out.println(x.toString());
    }

    // sorts by LastName
    public static void sortByFirstName() {
        System.out.println("\n>>> All Customers sorted by the First Name (A - Z): ");
        System.out.println("--------------------------------------------------------------------");

        Comparator<Customer> byFirstName = Comparator.comparing(Customer::getSurname).thenComparing(Customer::getAddress);
        Arrays.stream(CustomerCRM)
                .sorted(byFirstName)
                .forEach(System.out::println);
    }

    // find Customers in CardNumber Range
    public static void filterCardNumber(int startIndex, int endIndex) {
        System.out.println("--------------------------------------------------------------------");
        List<Customer> customersInRange = Arrays.asList(CustomerCRM);
        customersInRange.stream().filter(x -> x.getCardNumber() >= startIndex && x.getCardNumber() <= endIndex)
                .forEach(System.out::println);
    }
}
