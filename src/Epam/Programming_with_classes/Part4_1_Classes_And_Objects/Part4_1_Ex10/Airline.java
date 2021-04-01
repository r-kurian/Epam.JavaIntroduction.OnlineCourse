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

public class Airline {

    private static int idCounter;

    private int flightNumberID;
    private String destination;
    private String aircraftType;
    private LocalTime departureTime;
    private DayOfWeek dayOfWeek;

    public Airline(int flightNumberID, String randomDestination, DayOfWeek randomDays, String randomAircraftType, LocalTime randomLocalTime) {
        this.flightNumberID += ++idCounter;
        this.destination = randomDestination;
        this.aircraftType = randomAircraftType;
        this.departureTime = randomLocalTime;
        this.dayOfWeek = randomDays;
    }

    public int getFlightNumberID() {
        return flightNumberID;
    }

    public void setFlightNumberID(int flightNumberID) {
        this.flightNumberID = flightNumberID;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getAircraftType() {
        return aircraftType;
    }

    public void setAircraftType(String aircraftType) {
        this.aircraftType = aircraftType;
    }

    public LocalTime getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(LocalTime departureTime) {
        this.departureTime = departureTime;
    }

    public DayOfWeek getDaysOfWeek() {
        return dayOfWeek;
    }

    public void setDaysOfWeek(DayOfWeek daysOfWeek) {
        this.dayOfWeek = daysOfWeek;
    }

    @Override
    public String toString() {
        return "Flight ID#" + flightNumberID +
                " -> to " + destination +
                ". " + aircraftType +
                ". -> Departure Time: " + dayOfWeek +
                ", " + departureTime;
    }
}
