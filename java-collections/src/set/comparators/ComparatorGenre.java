package set.comparators;

import java.util.Comparator;

import set.Serie;

public class ComparatorGenre implements Comparator<Serie>{

    @Override
    public int compare(Serie serie1, Serie serie2) {
        return  serie1.getGenre().compareTo(serie2.getGenre());
    }
    
}
