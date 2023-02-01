package set.comparators;

import java.util.Comparator;

import set.Serie;

public class ComparatorEpisodeTime implements Comparator<Serie>{

    @Override
    public int compare(Serie serie1, Serie serie2) {
        int episodeTime = Integer.compare(serie1.getEpisodeTime(), serie2.getEpisodeTime());
        if(episodeTime != 0) return episodeTime;
        return serie1.getGenre().compareTo(serie2.getGenre());
    }
    
}
