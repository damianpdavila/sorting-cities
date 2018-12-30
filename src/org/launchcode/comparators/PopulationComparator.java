package org.launchcode.comparators;

import org.launchcode.City;

import java.util.Comparator;

public class PopulationComparator implements Comparator<City> {

    @Override
    public int compare(City c1, City c2){

        if (c1.getPopulation() > c2.getPopulation())
            return -1;
        if (c1.getPopulation() < c2.getPopulation())
            return 1;
        else
            return 0;
    }
}
