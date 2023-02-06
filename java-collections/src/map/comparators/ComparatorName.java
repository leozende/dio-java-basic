package map.comparators;

import java.util.Comparator;
import java.util.Map;

import map.Book;

public class ComparatorName implements Comparator<Map.Entry<String, Book>> {

    @Override
    public int compare(Map.Entry<String, Book> book1, Map.Entry<String, Book> book2) {
        return book1.getValue().getName().compareToIgnoreCase(book2.getValue().getName());
    }
    
}
