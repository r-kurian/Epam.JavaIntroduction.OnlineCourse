package Epam.Programming_with_classes.Part4_2_Aggregation_And_Composition.Part4_2_Ex5;

public class TourPackage {

    private static int idCounter = 0; // Static

    private int tourID;
    private String country;
    private int daysInTour;
    private String typeOfFood;
    private String typeOfRoom;
    private double price;
    private String transport;

    public TourPackage(int tourID, String country, int daysInTour, String typeOfFood, String typeOfRoom, double price, String transport) {
        this.tourID += ++idCounter;
        this.country = country;
        this.daysInTour = daysInTour;
        this.typeOfFood = typeOfFood;
        this.typeOfRoom = typeOfRoom;
        this.price = price;
        this.transport = transport;
    }

    public static int getIdCounter() {
        return idCounter;
    }

    public static void setIdCounter(int idCounter) {
        TourPackage.idCounter = idCounter;
    }

    public int getTourID() {
        return tourID;
    }

    public void setTourID(int tourID) {
        this.tourID = tourID;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getDaysInTour() {
        return daysInTour;
    }

    public void setDaysInTour(int daysInTour) {
        this.daysInTour = daysInTour;
    }

    public String getTypeOfFood() {
        return typeOfFood;
    }

    public void setTypeOfFood(String typeOfFood) {
        this.typeOfFood = typeOfFood;
    }

    public String getTypeOfRoom() {
        return typeOfRoom;
    }

    public void setTypeOfRoom(String typeOfRoom) {
        this.typeOfRoom = typeOfRoom;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getTransport() {
        return transport;
    }

    public void setTransport(String transport) {
        this.transport = transport;
    }

    public void print() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "TourID: " + tourID +
                ",  Country: " + country +
                ",  days in Tour: " + daysInTour +
                ",  type of Food: " + typeOfFood +
                ",  type of Room: " + typeOfRoom +
                ",  Transport: " + transport +
                ",  Price: " + price;
    }
}
