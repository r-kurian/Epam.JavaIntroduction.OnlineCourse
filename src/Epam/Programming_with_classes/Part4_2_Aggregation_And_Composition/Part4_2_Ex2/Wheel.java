package Epam.Programming_with_classes.Part4_2_Aggregation_And_Composition.Part4_2_Ex2;

public class Wheel {

    private int pressure; // if pressure > 0
    private int diameter;
    private String tiresBrand;

    public Wheel(int pressure, int diameter, String tiresBrand) {
        this.pressure = pressure;
        this.diameter = diameter;
        this.tiresBrand = tiresBrand;
    }

    public int getPressure() {
        return pressure;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public String getTiresBrand() {
        return tiresBrand;
    }

    public void setTiresBrand(String tiresBrand) {
        this.tiresBrand = tiresBrand;
    }

    // inflate a flat tire
    public void pumpUpTheFlatTire(int newPressure) {
        System.out.println(">>> Pumping the flat wheel to " + newPressure + " bar");
        if (newPressure > 0)
            this.pressure = newPressure;
    }

    @Override
    public String toString() {
        return "\nTire: " +
                "pressure(-bar) = " + pressure +
                ", diameter(-inch) = " + diameter +
                ", tires Brand = " + tiresBrand;
    }
}
