package map;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import map.comparators.ComparatorName;
import map.comparators.ComparatorPage;

/*Given the following information about my favorite books and their authors,
create a dictionary and order this dictionary:
displaying (Author Name - Book Name);

Author = Hawking, Stephen - Book = name: A Brief History of Time. pages: 256
Author = Duhigg, Charles - Book = name: The Power of Habit, pages: 408
Author = Harari, Yuval Noah - Book = name: 21 Lessons for the 21st Century, pages: 432
*/

public class MapSortingExample {
    public static void main(String[] args) {
        
        System.out.println("--\tRandom Order\t--");

        Map<String, Book> myBooks = new HashMap<>(){{
            put(" Hawking, Stephen", new Book("A Brief History of Time", 256));
            put(" Duhigg, Charles", new Book("The Power of Habit", 408));
            put(" Harari, Yuval Noah", new Book("21 Lessons for the 21st Century", 432));
        }};
        for (Map.Entry<String, Book> book: myBooks.entrySet())
            System.out.println(book.getKey() + " - " + book.getValue().getName());

        System.out.println("--\tInsertion Order\t--");
        Map<String, Book> myBooks1 = new LinkedHashMap<>(){{
            put(" Hawking, Stephen", new Book("A Brief History of Time", 256));
            put(" Duhigg, Charles", new Book("The Power of Habit", 408));
            put(" Harari, Yuval Noah", new Book("21 Lessons for the 21st Century", 432));
        }};
        for (Map.Entry<String, Book> book: myBooks1.entrySet())
            System.out.println(book.getKey() + " - " + book.getValue().getName());

        System.out.println("--\tAuthor alphabetic order\t--");
        Map<String, Book> myBooks2 = new TreeMap<>(myBooks1);
        for (Map.Entry<String, Book> book : myBooks2.entrySet())
            System.out.println(book.getKey() + " - " + book.getValue().getName());

        System.out.println("--\tAlphabetical order of book names\t--");
        Set<Map.Entry<String, Book>> myBooks3 = new TreeSet<>(new ComparatorName());
        myBooks3.addAll(myBooks.entrySet());
        System.out.println(myBooks3);

        System.out.println("--\tOrder page number\t--");
        Set<Map.Entry<String, Book>> myBooks4 = new TreeSet<>(new ComparatorPage());
        myBooks4.addAll(myBooks.entrySet());
        System.out.println(myBooks4);
    }
}
