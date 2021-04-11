package Epam.Programming_with_classes.Part4_2_Aggregation_And_Composition.Part4_2_Ex3;

/*Создать объект класса Государство, используя классы Область, Район, Город.
Методы: вывести на консоль столицу, количество областей, площадь, областные центры.*/

/*Create an object of the State (Country) class using the classes Region (State), District (no such in Germany), City.
Methods: display the capital, number of regions, area, regional centers on the console.*/

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // DISTRICTS OF BAVARIA
        ArrayList<District> districtsOfBayern = new ArrayList<District>();
        districtsOfBayern.add(new District("Oberpfalz"));
        districtsOfBayern.add(new District("Oberbayern"));
        districtsOfBayern.add(new District("Niederbayern"));
        districtsOfBayern.add(new District("Oberfranken"));
        districtsOfBayern.add(new District("Mittelfranken"));
        districtsOfBayern.add(new District("Unterfranken"));
        districtsOfBayern.add(new District("Schwaben"));
        // REGION BAVARIA
        Region bayern = new Region("Muenchen", "Bayern", 70550, districtsOfBayern);


        // DISTRICT BADEN-WUERTTEMBER
        ArrayList<District> districtsOfBadenWuerttemberg = new ArrayList<District>();
        districtsOfBadenWuerttemberg.add(new District("Freiburg"));
        districtsOfBadenWuerttemberg.add(new District("Stuttgart"));
        districtsOfBadenWuerttemberg.add(new District("Karlsruhe"));
        districtsOfBadenWuerttemberg.add(new District("Tuebingen"));
        // REGION BADEN-WUERTTEMBERG
        Region badenWuerttemberg = new Region("Stuttgart", "Baden-Wuerttemberg", 35751, districtsOfBadenWuerttemberg);


        // DISTRICT BERLIN
        ArrayList<District> districtsOfBerlin = new ArrayList<District>();
        districtsOfBerlin.add(new District("Berlin"));
        // REGION BERLIN
        Region berlin = new Region("Berlin", "Berlin", 891, districtsOfBerlin);


        // DISTRICTS OF BRANDENBURG
        ArrayList<District> districtsOfBrandenburg = new ArrayList<District>();
        districtsOfBrandenburg.add(new District("Barnim"));
        districtsOfBrandenburg.add(new District("Dahme-Spreewald"));
        districtsOfBrandenburg.add(new District("Elbe-Elster"));
        districtsOfBrandenburg.add(new District("Havelland"));
        districtsOfBrandenburg.add(new District("Märkisch-Oderland"));
        districtsOfBrandenburg.add(new District("Oberhavel"));
        districtsOfBrandenburg.add(new District("Oberspreewald-Lausitz"));
        districtsOfBrandenburg.add(new District("Oder-Spree"));
        districtsOfBrandenburg.add(new District("Ostprignitz-Ruppin"));
        districtsOfBrandenburg.add(new District("Potsdam-Mittelmark"));
        districtsOfBrandenburg.add(new District("Prignitz"));
        districtsOfBrandenburg.add(new District("Spree-Neiße"));
        districtsOfBrandenburg.add(new District("Teltow-Fläming"));
        districtsOfBrandenburg.add(new District("Uckermark"));
        districtsOfBrandenburg.add(new District("Stadt Brandenburg an der Havel"));
        districtsOfBrandenburg.add(new District("Stadt Cottbus"));
        districtsOfBrandenburg.add(new District("Stadt. Frankfurt (Oder)"));
        districtsOfBrandenburg.add(new District("Uckermark"));
        districtsOfBrandenburg.add(new District("Stadt Potsdam"));
        // REGION BRANDENBURG
        Region brandenburg = new Region("Potsdam", "Brandenburg", 29478, districtsOfBrandenburg);


        // DISTRICT BREMEN
        ArrayList<District> districtsOfBremen = new ArrayList<District>();
        districtsOfBremen.add(new District("Bremen"));
        // REGION BREMEN
        Region bremen = new Region("Bremen", "Bremen", 419, districtsOfBremen);


        // DISTRICT HAMBURG
        ArrayList<District> districtsOfHamburg = new ArrayList<District>();
        districtsOfHamburg.add(new District("Hamburg"));
        // REGION HAMBURG
        Region hamburg = new Region("Hamburg", "Hamburg", 755, districtsOfHamburg);


        // DISTRICT HESSEN
        ArrayList<District> districtsOfHessen = new ArrayList<District>();
        districtsOfHessen.add(new District("Kassel"));
        districtsOfHessen.add(new District("Gießen"));
        districtsOfHessen.add(new District("Darmstadt"));
        districtsOfHessen.add(new District("Frankfurt Rhine-Main"));
        // REGION HESSEN
        Region hessen = new Region("Wiesbaden", "Hessen", 21100, districtsOfHessen);


        // DISTRICT MECKLENBURG-VORPOMMERN
        ArrayList<District> districtsOfMecklenburgVorpommern = new ArrayList<District>();
        districtsOfMecklenburgVorpommern.add(new District("Rostock"));
        districtsOfMecklenburgVorpommern.add(new District("Ludwigslust-Parchim"));
        districtsOfMecklenburgVorpommern.add(new District("Mecklenburgische Seenplatte"));
        districtsOfMecklenburgVorpommern.add(new District("Nordwestmecklenburg"));
        districtsOfMecklenburgVorpommern.add(new District("Vorpommern-Greifswald"));
        districtsOfMecklenburgVorpommern.add(new District("Vorpommern-Rügen"));
        // REGION MECKLENBURG-VORPOMMERN
        Region mecklenburgVorpommern = new Region("Schwerin", "Mecklenburg-Vorpommern", 23174, districtsOfMecklenburgVorpommern);


        // DISTRICT LOWER SAXONY
        ArrayList<District> districtsOfLowSaxony = new ArrayList<District>();
        districtsOfLowSaxony.add(new District("Braunschweig"));
        districtsOfLowSaxony.add(new District("Delmenhorst"));
        districtsOfLowSaxony.add(new District("Emden"));
        districtsOfLowSaxony.add(new District("Göttingen"));
        districtsOfLowSaxony.add(new District("Hanover"));
        districtsOfLowSaxony.add(new District("Oldenburg"));
        districtsOfLowSaxony.add(new District("Osnabrück"));
        districtsOfLowSaxony.add(new District("Salzgitter"));
        districtsOfLowSaxony.add(new District("Wilhelmshaven"));
        districtsOfLowSaxony.add(new District("Wolfsburg"));
        // REGION LOWER SAXONY
        Region lowerSaxony = new Region("Hanover", "Niedersachsen", 47614, districtsOfLowSaxony);


        // DISTRICTS OF NORTH RHINE-WESTPHALIA
        ArrayList<District> districtsOfNordrheinWestfalen = new ArrayList<District>();
        districtsOfNordrheinWestfalen.add(new District("Düsseldorf"));
        districtsOfNordrheinWestfalen.add(new District("Köln"));
        districtsOfNordrheinWestfalen.add(new District("Arnsberg"));
        districtsOfNordrheinWestfalen.add(new District("Detmold"));
        districtsOfNordrheinWestfalen.add(new District("Münster"));
        // REGION NORTH RHINE-WESTPHALIA
        Region nordrheinWestfalen = new Region("Düsseldorf", "Nordrhein-Westfalen", 34084, districtsOfNordrheinWestfalen);


        // DISTRICTS OF RHINELAND-PALATINATE
        ArrayList<District> districtsOfRhinelandPalatinate = new ArrayList<District>();
        districtsOfRhinelandPalatinate.add(new District("Bitburg"));
        districtsOfRhinelandPalatinate.add(new District("Wittlich"));
        districtsOfRhinelandPalatinate.add(new District("Trier"));
        districtsOfRhinelandPalatinate.add(new District("Simmern/Hunsrück"));
        districtsOfRhinelandPalatinate.add(new District("Montabaur"));
        // REGION RHINELAND-PALATINATE
        Region rhinelandPalatinate = new Region("Mainz", "Rheinland-Pfalz", 19854, districtsOfRhinelandPalatinate);


        // DISTRICTS OF SAARLAND
        ArrayList<District> districtsOfSaarland = new ArrayList<District>();
        districtsOfSaarland.add(new District("Saarbrücken"));
        districtsOfSaarland.add(new District("Sankt Wendel"));
        districtsOfSaarland.add(new District("Merzig"));
        districtsOfSaarland.add(new District("Blieskastel"));
        districtsOfSaarland.add(new District("Homburg"));
        // REGION SAARLAND
        Region saarland = new Region("Saarbrücken", "Saarland", 2570, districtsOfSaarland);


        // DISTRICTS OF FREE STATE OF SAXONY
        ArrayList<District> districtsOfSaxony = new ArrayList<District>();
        districtsOfSaxony.add(new District("Görlitz"));
        districtsOfSaxony.add(new District("Nordsachsen"));
        districtsOfSaxony.add(new District("Leipzig"));
        districtsOfSaxony.add(new District("Bautzen"));
        districtsOfSaxony.add(new District("Zwickau"));
        // REGION FREE STATE OF SAXONY
        Region saxony = new Region("Dresden", "Freistaat Sachsen", 18415, districtsOfSaxony);


        // DISTRICTS OF SAXONY-ANHALT
        ArrayList<District> districtsOfSachsenAnhalt = new ArrayList<District>();
        districtsOfSachsenAnhalt.add(new District("Dessau"));
        districtsOfSachsenAnhalt.add(new District("Halle"));
        districtsOfSachsenAnhalt.add(new District("Magdeburg"));
        // REGION SAXONY-ANHALT
        Region sachsenAnhalt = new Region("Magdeburg", "Sachsen-Anhalt", 20451, districtsOfSachsenAnhalt);


        // DISTRICTS OF SCHLESWIG-HOLSTEIN
        ArrayList<District> districtsOfSchleswigHolstein = new ArrayList<District>();
        districtsOfSchleswigHolstein.add(new District("Dithmarschen"));
        districtsOfSchleswigHolstein.add(new District("Lauenburg"));
        districtsOfSchleswigHolstein.add(new District("Nordfriesland"));
        districtsOfSchleswigHolstein.add(new District("Ostholstein"));
        districtsOfSchleswigHolstein.add(new District("Pinneberg"));
        districtsOfSchleswigHolstein.add(new District("Plön"));
        districtsOfSchleswigHolstein.add(new District("Rendsburg-Eckernförde"));
        districtsOfSchleswigHolstein.add(new District("Schleswig-Flensburg"));
        districtsOfSchleswigHolstein.add(new District("Segeberg"));
        districtsOfSchleswigHolstein.add(new District("Steinburg"));
        districtsOfSchleswigHolstein.add(new District("Stormarn"));
        // REGION SCHLESWIG-HOLSTEIN
        Region schleswigHolstein = new Region("Kiel", "Schleswig-Holstein", 15763, districtsOfSchleswigHolstein);


        // DISTRICTS OF THURINGIA
        ArrayList<District> districtsOfThuringia = new ArrayList<District>();
        districtsOfThuringia.add(new District("Altenburger Land"));
        districtsOfThuringia.add(new District("Gotha"));
        districtsOfThuringia.add(new District("Nordhausen"));
        // REGION THURINGIA
        Region thuringia = new Region("Erfurt", "Thüringen", 16171, districtsOfThuringia);


        // ALL REGIONS
        ArrayList<Region> allRegionsOfGermany = new ArrayList<Region>();
        allRegionsOfGermany.add(bayern);
        allRegionsOfGermany.add(badenWuerttemberg);
        allRegionsOfGermany.add(berlin);
        allRegionsOfGermany.add(brandenburg);
        allRegionsOfGermany.add(bremen);
        allRegionsOfGermany.add(hessen);
        allRegionsOfGermany.add(hamburg);
        allRegionsOfGermany.add(mecklenburgVorpommern);
        allRegionsOfGermany.add(lowerSaxony);
        allRegionsOfGermany.add(nordrheinWestfalen);
        allRegionsOfGermany.add(rhinelandPalatinate);
        allRegionsOfGermany.add(saarland);
        allRegionsOfGermany.add(saxony);
        allRegionsOfGermany.add(sachsenAnhalt);
        allRegionsOfGermany.add(schleswigHolstein);
        allRegionsOfGermany.add(thuringia);

        // COUNTRY
        State germany = new State("Deutschland", "Berlin", allRegionsOfGermany);
        germany.print();

        System.out.println("\nAnzahl der Bundesländer: " + State.getRegionsList().size());
        System.out.println("\nFläche von Deutschland: " + Region.findAreaOfAllRegions(allRegionsOfGermany));

    }
}
