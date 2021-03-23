package Epam.Programming_with_classes.Part4_1_Classes_And_Objects.Part4_1_Ex4;

/*
Create a Train class containing the following fields:
- the name of the destination,
- train number,
- departure time.

Create an array of five elements of the Train type,
add the ability to sort the array elements by train numbers.

Add the ability to display information about the train by the entered number of the train.

Add the ability to sort the array by destination,
where trains with the same destination must be sorted by departure time.
*/

import java.time.LocalDateTime;

public class Train {

    private String destination;
    private int numberOfTrain;
    private LocalDateTime departureTime;

    public Train(String destination, int numberOfTrain, LocalDateTime departureTime) {
        this.destination = destination;
        this.numberOfTrain = numberOfTrain;
        this.departureTime = departureTime;
    }

    public String getDestination() {
        return destination;
    }

    public int getNumberOfTrain() {
        return numberOfTrain;
    }

    public LocalDateTime getDepartureTime() {
        return departureTime;
    }

    @Override
    public String toString() {
        return "Destination: " + destination+
                ", train-No: " + numberOfTrain +
                ", departure time: " + departureTime;
    }
}

