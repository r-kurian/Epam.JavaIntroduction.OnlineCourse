package Epam.Programming_with_classes.Part4_2_Aggregation_And_Composition.Part4_2_Ex2;

public class Engine {

    private double powerHP; // if powerHP > 0
    private TypeOfEngine typeOfEngine;
    public boolean isWorking;

    public enum TypeOfEngine {
        PETROL,
        DIESEL,
        HYBRID
    }

    public Engine (double powerHP, TypeOfEngine typeOfEngine, boolean isWorking) {
        this.powerHP = powerHP;
        this.typeOfEngine = typeOfEngine;
        this.isWorking = isWorking;
    }

    public double getPowerHP() {
        return powerHP;
    }

    public void setPowerHP(double powerHP) {
        if (powerHP > 0) {
            this.powerHP = powerHP;
        }
    }

    public TypeOfEngine getTypeOfEngine() {
        return typeOfEngine;
    }

    public void setTypeOfEngine(TypeOfEngine typeOfEngine) {
        this.typeOfEngine = typeOfEngine;
    }

    public boolean isWorking() {
        return isWorking;
    }

    public void setWorking(boolean working) {
        isWorking = working;
    }

    void turnOn() {
        isWorking = true;
    }

    void turnOff() {
        isWorking = false;
    }

    @Override
    public String toString() {
        return "\nEngine: " +
                "power(-HP) = " + powerHP +
                ", type Of Engine = " + typeOfEngine +
                ", the Engine's readiness = " + isWorking;
    }
}
