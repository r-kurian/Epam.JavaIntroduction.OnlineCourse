package Epam.Programming_with_classes.Part4_2_Aggregation_And_Composition.Part4_2_Ex5;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class TourPackageGenerator {

    public static TourPackage[] toursArray;

    public static void addToursToArray(int scNumberOfTours) {

        toursArray = new TourPackage[scNumberOfTours];

        for (int i = 0; i < scNumberOfTours; ++i)
            toursArray[i] = new TourPackage(
                    getTourID(),
                    getRandomCountry(),
                    getRandomDaysInTour(),
                    getRandomTypeOfFood(),
                    getRandomTypeOfRoom(),
                    getRandomPrice(),
                    getRandomTransport());
    }

    public static void printToursArray() {
        if (toursArray == null) {
            throw new IllegalArgumentException("The numbers of tours couldn't be smaller zero. Try again ");
        }
        for (TourPackage x : toursArray)
            System.out.println(x.toString());
    }

    public static int getTourID() {
        return 0;
    }

    // create randomized Destination
    private static final String[] randomCountryArray = {"Egypt", "Morocco", "South Africa", "Tunisia",
            "Algeria", "United States", "Mexico", "Canada", "Argentina", "Brazil", "China", "Thailand", "Japan",
            "Malaysia", "Hong Kong", "France", "Spain", "Turkey", "Germany", "United Kingdom", "Austria", "Greece", "Portugal",
            "Russia", "Saudi Arabia", "United Arab Emirates", "Egypt", "Iran", "Israel"};

    public static String getRandomCountry() {
        Random randomizedCountry = new Random();
        return randomCountryArray[randomizedCountry.nextInt(randomCountryArray.length)];
    }

    // random number of days in tour
    public static int getRandomDaysInTour() {
        Random randomDaysInTour = new Random();
        return randomDaysInTour.nextInt(25) + 7; // 1-4 weeks
    }

    // create random type of food
    private static final String[] randomTypeOfFoodArray = {"RO", "BB", "HB", "FB", "AI", "UAI"};

    public static String getRandomTypeOfFood() {
        Random randomizedTypeOfFood = new Random();
        return randomTypeOfFoodArray[randomizedTypeOfFood.nextInt(randomTypeOfFoodArray.length)];
    }

    // create random type of room
    private static final String[] randomTypeOfRoomArray = {"SGL", "DBL", "TRPL", "ExB", "Suite"};

    public static String getRandomTypeOfRoom() {
        Random randomizedTypeOfRoom = new Random();
        return randomTypeOfRoomArray[randomizedTypeOfRoom.nextInt(randomTypeOfRoomArray.length)];
    }

    // random number of days in tour
    public static int getRandomPrice() {
        return ThreadLocalRandom.current().nextInt(1000, 5000);
        // origin - the least value returned, bound - the upper bound (exclusive)
    }

    // create random type of transport
    private static final String[] randomTypeOfTransportArray = {"Bus", "Plane", "Train", "Ship"};

    public static String getRandomTransport() {
        Random randomizedTransport = new Random();
        return randomTypeOfTransportArray[randomizedTransport.nextInt(randomTypeOfTransportArray.length)];
    }
}

