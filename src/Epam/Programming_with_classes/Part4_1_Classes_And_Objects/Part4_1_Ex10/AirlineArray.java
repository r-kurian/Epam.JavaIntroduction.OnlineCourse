package Epam.Programming_with_classes.Part4_1_Classes_And_Objects.Part4_1_Ex10;

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

import java.time.DayOfWeek;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class AirlineArray {

    public static Airline[] airlineArray;

    public static void addAirlinesToArray(int scNumberOfFlights) {

        airlineArray = new Airline[scNumberOfFlights];

        for (int i = 0; i < scNumberOfFlights; ++i)
            airlineArray[i] = new Airline(
                    getFlightNumberID(),
                    getRandomDestination(),
                    getRandomDays(),
                    getRandomAircraftType(),
                    getRandomLocalTime());
    }

    public static void printAirlineArray() {
        if (airlineArray == null) {
            throw new IllegalArgumentException("The numbers of flights couldn't be smaller zero. Try again ");
        }
        for (Airline x : airlineArray)
            System.out.println(x.toString());
    }

    // ID of the flight
    public static int getFlightNumberID() {
        return 0;
    }

    // create randomized Destination
    private static final String[] randomDestinationArray = {"Moscow", "Tirane", "Algiers", "Luanda",
            "Minsk", "Canberra", "Vienna", "Baku", "Dhaka", "Brussels", "Brasilia", "Sofia", "Ottawa",
            "Beijing", "Zagreb", "Havana", "Prague", "Cairo", "London", "Rom", "Madrid", "Amsterdam", "Athens",
            "Reykjavik", "New Delhi", "Jakarta", "Tokyo", "Riga", "Kathmandu", "Oslo", "Edinburgh", "Kiev"};

    public static String getRandomDestination() {
        Random randomizedDestination = new Random();
        return randomDestinationArray[randomizedDestination.nextInt(randomDestinationArray.length)];
    }

    // create randomized Day of the Week
    public static DayOfWeek getRandomDays() {
        return DayOfWeek.values()[new Random().nextInt(DayOfWeek.values().length)];
    }

    // create randomized Aircraft Type
    private static final String[] randomAircraftTypeArray = {"Antonov", "Airbus", "Boeing",
            "Bombardier", "Embraer", "Ilyushin", "Tupolev"};

    public static String getRandomAircraftType() {
        Random randomizedAircraftType = new Random();
        return randomAircraftTypeArray[randomizedAircraftType.nextInt(randomAircraftTypeArray.length)];
    }

    // create randomized Local Date
    public static LocalTime getRandomLocalTime() {
        final Random random = new Random();
        return LocalTime.of(random.nextInt(24), random.nextInt(60));
    }

    // sort by Destination
    public static void sortByDestination() {
        if (airlineArray == null) {
            throw new IllegalArgumentException("No information available.");
        }

        Comparator<Airline> byDestination = Comparator.comparing(Airline::getDestination).thenComparing(Airline::getDepartureTime);
        Arrays.stream(airlineArray)
                .sorted(byDestination)
                .forEach(System.out::println);
    }

    // filter by entered Destination
    public static void filterByMyDestination(String myDestination) {
        if (airlineArray == null) {
            throw new IllegalArgumentException("No information available. Try another Destination.");
        }
        List<Airline> airlineList = Arrays.asList(airlineArray);
        airlineList.stream().filter(x -> myDestination.equals(x.getDestination()))
                .forEach(System.out::println);
    }

    // sort by Day Of The Week
    public static void sortByDayOfTheWeek() {
        if (airlineArray == null) {
            throw new IllegalArgumentException("No information available.");
        }
        Comparator<Airline> byDayOfTheWeek = Comparator.comparing(Airline::getDaysOfWeek).thenComparing(Airline::getDepartureTime);
        Arrays.stream(airlineArray)
                .sorted(byDayOfTheWeek)
                .forEach(System.out::println);
    }

    // filter by entered Day Of The Week
    public static void filterByMyDay(String myDay) {
        if (airlineArray == null) {
            throw new IllegalArgumentException("No information available. Try another Day Of The Week.");
        }
        List<Airline> airlineList = Arrays.asList(airlineArray);
        airlineList.stream().filter(x -> myDay.equals(x.getDaysOfWeek()))
                .forEach(System.out::println);
    }

    // filter by entered Day Of The Week anf Time
    public static void filterByMyDayAndTime(String myDayOfWeek, LocalTime timeGivenByUser) {
        if (airlineArray == null) {
            throw new IllegalArgumentException("No information available. Try another Day Of The Week and Time.");
        }
        List<Airline> airlineList = Arrays.asList(airlineArray);
        airlineList.stream().filter(x -> myDayOfWeek.equals(x.getDaysOfWeek()) && timeGivenByUser.isBefore(x.getDepartureTime()))
                .forEach(System.out::println);
    }

    // just Header decoration
    public static void headerOfTable() {
        System.out.println("Flight ID# - Destination - Aircraft Type - Departure: Day of the Week + Time");
        System.out.println("----------------------------------------------------------------------------");
    }
    // just Footer decoration
    public static void footerOfTable() {
        System.out.println("----------------------------------------------------------------------------");
    }
}