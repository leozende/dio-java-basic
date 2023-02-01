package set;

/*Given the following information about my favorite series,
create a set and sort this set by displaying:
(name - genre - episode time);
Series 1 = Name: got, genre: fantasy, timeEpisode: 60
Series 2 = name: dark, genre: drama, timeEpisode: 60
Series 3 = name: that '70s show, genre: comedy, timeEpisode: 25
*/

import java.util.*;

import set.comparators.ComparatorEpisodeTime;
import set.comparators.ComparatorGenre;
import set.comparators.ComparatorNameGenreEpisodeTime;

public class SetSortingExample {
    public static void main(String[] args) {
        
        System.out.println("--\tRandom Order\t---");
        Set<Serie> mySeries = new HashSet<>(){{
            add(new Serie("got", "fantasy", 60));
            add(new Serie("dark", "drama", 60));
            add(new Serie("that '70s show", "comedy", 25));
        }};
        for (Serie serie : mySeries) System.out.println(serie.getName() + " - " + serie.getGenre() + " - " + serie.getEpisodeTime());

        System.out.println("--\tInsertion Order\t---");
        Set<Serie> mySeries1 = new LinkedHashSet<>(){{
            add(new Serie("got", "fantasy", 60));
            add(new Serie("dark", "drama", 60));
            add(new Serie("that '70s show", "comedy", 25));
        }};
        for (Serie serie : mySeries1) System.out.println(serie.getName() + " - " + serie.getGenre() + " - " + serie.getEpisodeTime());

        System.out.println("--\tNatural Order (EpisodeTime)\t---");
        Set<Serie> mySeries2 = new TreeSet<>(mySeries1);
        for (Serie serie : mySeries2) System.out.println(serie.getName() + " - " + serie.getGenre() + " - " + serie.getEpisodeTime()); //need a tiebreaker, because Set don't accept the same objects.
        //Thats why, if there isn't a tiebreaker, one of the series with the same time will not appear.

        System.out.println("--\tName/Genre/EpisodeTime Order\t---");
        Set<Serie> mySeries3 = new TreeSet<>(new ComparatorNameGenreEpisodeTime());
        mySeries3.addAll(mySeries);

        for (Serie serie : mySeries3) System.out.println(serie.getName() + " - " + serie.getGenre() + " - " + serie.getEpisodeTime());

        System.out.println("--\tGenre Order\t--");
        Set<Serie> mySeries4 = new TreeSet<>(new ComparatorGenre());
        mySeries4.addAll(mySeries);

        for (Serie serie : mySeries4) System.out.println(serie.getName() + " - " + serie.getGenre() + " - " + serie.getEpisodeTime());

        System.out.println("--\tEpisode Time Order\t--");
        Set<Serie> mySeries5 = new TreeSet<>(new ComparatorEpisodeTime());
        mySeries5.addAll(mySeries);

        for (Serie serie : mySeries5) System.out.println(serie.getName() + " - " + serie.getGenre() + " - " + serie.getEpisodeTime());
    }
}
