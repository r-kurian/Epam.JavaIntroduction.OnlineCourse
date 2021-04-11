package Epam.Programming_with_classes.Part4_2_Aggregation_And_Composition.Part4_2_Ex3;

import java.util.ArrayList;
import java.util.List;

public class Region {

    private String center;
    private String region;
    private int area;
    private List<District> districtsList;

    public Region(String center, String region, int square, List<District> districtsList) {
        this.center = center;
        this.region = region;
        this.area = square;
        this.districtsList = districtsList;
    }

    public String getCenter() {
        return center;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public List<District> getDistrictsList() {
        return districtsList;
    }

    public void setDistrictsList(List<District> districtsList) {
        this.districtsList = districtsList;
    }

    public void print() {
        System.out.println(toString());
    }


    public static int findAreaOfAllRegions(ArrayList<Region> allRegionsOfGermany) {
        int sum = allRegionsOfGermany.stream().mapToInt(Region::getArea).sum();
        return sum;
    }

    @Override
    public String toString() {
        return "\n\nLand: " + region +
                ", Landeshauptstadt: " + center +
                ", Fläche: " + area + " q.m. " +
                ",\nLandkreisliste: " + districtsList;
    }
}
