package Epam.Programming_with_classes.Part4_2_Aggregation_And_Composition.Part4_2_Ex2;

import java.util.Arrays;

public class Car {

    private String carBrand;
    private String color;
    private Wheel[] tire;
    private Engine engine;
    private int fullnessOfTank;

    // check the pressure in the wheels
    public boolean startWheels() {
        boolean checkWheels = true;
        for (Wheel wheel : tire) {
            if (wheel.getPressure() < 5) {
                //System.out.println("Some of the tire has too low pressure to start");
                checkWheels = false;
                break;
            }
        }
        return checkWheels;
    }

    // check if the engine is turn-on
    public boolean startEngine(boolean isWorking) {
        if (isWorking = false) {
            System.out.println("Ooops, engine problem");
        }
        return true;
    }

    // Replace the wheel with position number
    public void changeWheel(int pressure, int diameter, String tiresBrand, int position) {
        System.out.println(">>> Here we completely change the wheel");
        if (position >= 1 && position <= tire.length) {
            tire[position - 1].setPressure(pressure);
            tire[position - 1].setDiameter(diameter);
            tire[position - 1].setTiresBrand(tiresBrand);
        }
    }

    // turn on the engine
    public void turnOn() {
        engine.turnOn();
        System.out.println(">>> The engine is running");
    }

    // turn off the engine
    public void turnOff() {
        engine.turnOff();
        System.out.println("Engine off");
    }

    // заправка
    public void refuel(int fuel) {
        if (fuel > 0) {
            this.fullnessOfTank += fuel;
            System.out.println(">>> Now there is " + this.fullnessOfTank + " liter of fuel in the tank");
        }
    }

    public Car(String carBrand, String color, Wheel[] tire, Engine engine, int fullnessOfTank) {
        this.carBrand = carBrand;
        this.color = color;
        this.tire = tire;
        this.engine = engine;
        this.fullnessOfTank = fullnessOfTank;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public Wheel[] getTire() {
        return tire;
    }

    public void setTire(Wheel[] tire) {
        this.tire = tire;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void print() {
        System.out.println(toString());
    }

    public int getFullnessOfTank() {
        return fullnessOfTank;
    }

    public void setFullnessOfTank(int fullnessOfTank) {
        if (fullnessOfTank >= 0) {
            this.fullnessOfTank = fullnessOfTank;
        }
    }

    @Override
    public String toString() {
        return "\nYOUR CAR: " +
                "car Brand = " + color +
                ", color = " + carBrand  +
                "\nTIRE: " + Arrays.toString(tire) +
                "\nENGINE: " + engine +
                ", \nfullness of tank = " + fullnessOfTank;
    }
}
