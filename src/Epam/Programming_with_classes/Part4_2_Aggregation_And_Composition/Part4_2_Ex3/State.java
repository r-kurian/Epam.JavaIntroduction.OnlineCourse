package Epam.Programming_with_classes.Part4_2_Aggregation_And_Composition.Part4_2_Ex3;

import java.util.ArrayList;
import java.util.List;

public class State {

    private String country = "Deutschland";
    private String capital = "Berlin";
    private static List<Region> regionsList;


    public State(String country, String capital, List<Region> regionsList) {
        this.country = country;
        this.capital = capital;
        this.regionsList = regionsList;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public static List<Region> getRegionsList() {
        return regionsList;
    }

    public void setRegionsList(List<Region> regionsList) {
        this.regionsList = regionsList;
    }

    public void print() {
        System.out.println(toString());
    }


    @Override
    public String toString() {
        return "Staat: " + country +
                ", Hauptstadt: " + capital +
                ", \n\nBundesländer: " + regionsList;
    }
}
