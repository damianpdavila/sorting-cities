package org.launchcode.comparators;

import org.launchcode.City;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CompoundComparator implements Comparator<City> {

    private List<Comparator<City>> listComparators = new ArrayList<>();

    @Override
    public int compare(City c1, City c2){

        if (listComparators.isEmpty()){
            throw new NullPointerException();
        }

        int result = 0;
        for (Comparator<City> comparator : listComparators){
            result = comparator.compare(c1, c2);
            if (result != 0){
                break;
            }
        }
        return result;

    }

    public void add(Comparator<City> compCity ){

        listComparators.add(compCity);

    }
}
