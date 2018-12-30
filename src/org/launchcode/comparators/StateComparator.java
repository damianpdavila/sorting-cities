package org.launchcode.comparators;

import org.launchcode.City;

import java.util.Comparator;

public class StateComparator implements Comparator<City> {

    @Override
    public int compare(City c1, City c2){
        return c1.getState().compareTo(c2.getState());
    }
}
