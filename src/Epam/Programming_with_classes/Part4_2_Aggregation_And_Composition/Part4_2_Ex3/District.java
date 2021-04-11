package Epam.Programming_with_classes.Part4_2_Aggregation_And_Composition.Part4_2_Ex3;

import java.util.List;

public class District {

    private String district;
    private List<City> citiesList;

    public District(String district) {
        this.district = district;
    }

    public District(String district, List<City> citiesList) {
        this.district = district;
        this.citiesList = citiesList;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public List<City> getCitiesList() {
        return citiesList;
    }

    public void setCitiesList(List<City> citiesList) {
        this.citiesList = citiesList;
    }


    @Override
    public String toString() {
        return district;
    }
}
