package Epam.Programming_with_classes.Part4_1_Classes_And_Objects.Part4_1_Ex10;

/*
Создать класс Airline, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы
и метод toString().

Создать второй класс, агрегирующий массив типа Airline, с подходящими конструкторами и методами.
Задать критерии выбора данных и вывести эти данные на консоль.

Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.

Найти и вывести:
a) список рейсов для заданного пункта назначения;
b) список рейсов для заданного дня недели;
c) список рейсов для заданного дня недели, время вылета для которых больше заданного.
*/

/*
Create а class an Airline class. Define Constructors, Set- and Get- Methods and the toString () method.

Create a second class that aggregates the Airline array with appropriate constructors and methods.
Set the criteria for selecting data and display this data on the console.

Airline: destination, flight number, aircraft type, departure time, days of the week.

Find and withdraw:
a) a list of flights for a given destination;
b) a list of flights for a given day of the week;
c) a list of flights for a given day of the week, the departure time for which is greater than the given one.
*/

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class AirlineMain {

    public static LocalTime convertUsersTimeInLocalTime(String myTime) {
        LocalTime timeGivenByUser = null;
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm");
        if (myTime.matches("\\d{2}:\\d{2}")) {
            timeGivenByUser = LocalTime.parse(myTime, timeFormatter);
        }
        return timeGivenByUser;
    }

    public static void main(String[] args) {
        try {

            System.out.println("Generate some number of flights. Enter an integer: ");
            Scanner sc = new Scanner(System.in);

            int scNumberOfFlights = sc.nextInt();
            if (scNumberOfFlights > 0) {
                AirlineArray.addAirlinesToArray(scNumberOfFlights); // just invisibly creates an array of flights.
            } else
                System.out.println("The numbers of flights couldn't be smaller zero. Try again ");

            System.out.println("""
                    Your Flight Schedule has been generated. Do you want to print it?
                    Enter y / n :\s""");
            String answerYesOrNo = sc.next(); // can prints all the flights, Yes / No
            if (answerYesOrNo.equals("y")) {
                System.out.println("Here is your Flight Schedule:");

                AirlineArray.headerOfTable();
                AirlineArray.printAirlineArray();
                AirlineArray.footerOfTable();
            }

            System.out.println("\n" +
                               "To sort the Flight Schedule use menu:\n" +
                               "Enter:  \n" +
                               " 1 to sort by Destination (A->Z);            2 to find by your Destination;\n" +
                               " 3 to sort by Day of the Week (MO->SU);      4 to find by given Day of the Week;\n" +
                               " 5 to sort given Day of the Week and Departure Time;\n" +
                               " 0 to EXIT the program;");

            int menuPoint = sc.nextInt();
            switch (menuPoint) {
                case 1 -> {
                    System.out.println("\nSorted by a Destination (A-Z)");
                    AirlineArray.headerOfTable();
                    AirlineArray.sortByDestination();
                    AirlineArray.footerOfTable();
                }
                case 2 -> {
                    System.out.println("\nEnter your Destination:");
                    String myDestination = sc.next();

                    System.out.println("\nFiltered by the Destination");
                    AirlineArray.headerOfTable();
                    AirlineArray.filterByMyDestination(myDestination);
                    AirlineArray.footerOfTable();
                }
                case 3 -> {
                    System.out.println("\n>>> Sorted by a Day of the Week (MO->SU)");
                    AirlineArray.headerOfTable();
                    AirlineArray.sortByDayOfTheWeek();
                    AirlineArray.footerOfTable();
                }
                case 4 -> {
                    System.out.println("\nEnter your Day of the Week:");
                    String myDay = sc.next();

                    System.out.println("\nFiltered by my Day of the Week");
                    AirlineArray.headerOfTable();
                    AirlineArray.filterByMyDay(myDay);
                    AirlineArray.footerOfTable();
                }
                case 5 -> {
                    System.out.println("\nEnter your Day of the Week and Departure Time:");
                    System.out.println("(Day-format: \"MONDAY\"; Time-format: \"HH:mm\")");
                    String myDayOfWeek = sc.next();
                    String myTime = sc.next();

                    System.out.println("\nFiltered by a given Day of the Week and Departure Time");
                    LocalTime timeGivenByUser = convertUsersTimeInLocalTime(myTime);

                    AirlineArray.headerOfTable();
                    AirlineArray.filterByMyDayAndTime(myDayOfWeek, timeGivenByUser);
                    AirlineArray.footerOfTable();
                }
                case 0 -> System.exit(0);
                default -> System.out.println("Enter the number only from menu options, namely 1, 2, 3, 4, 5 or 0.\n");
            }

        } catch (IllegalArgumentException | InputMismatchException e) {
            System.out.println("Input error! " + e.getMessage());
        }
    }
}