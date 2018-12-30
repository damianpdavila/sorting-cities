package org.launchcode;

import org.launchcode.comparators.CompoundComparator;
import org.launchcode.comparators.NameComparator;
import org.launchcode.comparators.PopulationComparator;
import org.launchcode.comparators.StateComparator;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<City> cities = CityData.loadData();

        // TODO - Use different comparators here
        NameComparator comparator = new NameComparator();
        cities.sort(comparator);

        printCities(cities);

        StateComparator stateComparator = new StateComparator();
        cities.sort(stateComparator);

        printCities(cities);

        PopulationComparator populationComparator = new PopulationComparator();
        cities.sort(populationComparator);

        printCities(cities);

        CompoundComparator compoundComparator = new CompoundComparator();
        compoundComparator.add(stateComparator);
        compoundComparator.add(populationComparator);
        cities.sort(compoundComparator);
        printCities(cities);


    }

    private static void printCities(ArrayList<City> cities) {

        System.out.println(City.getTableHeader());

        for(City c : cities) {
            System.out.println(c);
        }

    }
}
