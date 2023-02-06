package map.comparators;

import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;

import map.Book;

public class ComparatorPage implements Comparator<Map.Entry<String, Book>> {

    @Override
    public int compare(Entry<String, Book> book1, Entry<String, Book> book2) {
        return Integer.compare(book1.getValue().getPages(), book2.getValue().getPages());
    }
    
}
