package stream;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/* Given the following id and contact information, create a dictionary and
sort this dictionary by displaying (Name id - Name contact);
id = 1 - Contact = name: Simba, number: 2222;
id = 4 - Contact = name: Cami, number: 5555;
id = 3 - Contact = name: Jon, number: 1111;
*/

public class Schedule {
    public static void main(String[] args) {
        
        System.out.println("--\tRandom order\t--");
        Map<Integer, Contact> schedule = new HashMap<>() {{
            put(1, new Contact("Simba", 2222));
            put(4, new Contact("Cami", 5555));
            put(3, new Contact("Jon", 1111));
        }};
        System.out.println(schedule);

        for (Map.Entry<Integer, Contact> entry : schedule.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getName());
        }

        System.out.println("--\tInsertion Order\t--");
        Map<Integer, Contact> schedule1 = new LinkedHashMap<>() {{
            put(1, new Contact("Simba", 2222));
            put(4, new Contact("Cami", 5555));
            put(3, new Contact("Jon", 1111));
        }};
        System.out.println(schedule1);
        for (Map.Entry<Integer, Contact> entry: schedule1.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getName());
        }

        System.out.println("--\tid Order\t--");
        Map<Integer, Contact> schedule2 = new TreeMap<>(schedule);
        System.out.println(schedule2);
        for (Map.Entry<Integer, Contact> entry: schedule2.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getName());
        }

        System.out.println("--\tOrder phone number\t--");

        //Anonymous class:

        /* Set<Map.Entry<Integer, Contact>> set = new TreeSet<>(new Comparator<Map.Entry<Integer, Contact>>() {
            @Override
            public int compare(Entry<Integer, Contact> contact1, Entry<Integer, Contact> contact2) {
                return Integer.compare(contact1.getValue().getNumber(), contact2.getValue().getNumber());
            } 
        });*/

        //With comparing method: 

        /*Set<Map.Entry<Integer, Contact>> set = new TreeSet<>(Comparator.comparing(
            new Function<Map.Entry<Integer, Contact>, Integer>() {
                @Override
                public Integer apply(Entry<Integer, Contact> contact) {
                    return contact.getValue().getNumber();
                }
            
        }));*/

        //Lambda method:

        Set<Map.Entry<Integer, Contact>> set = new TreeSet<>(Comparator.comparing(contact -> contact.getValue().getNumber()));

        //Cant use the reference method, because we can't simplify more.


        set.addAll(schedule.entrySet());
        for (Map.Entry<Integer, Contact> entry: set) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNumber() + " : " +entry.getValue().getName());
        }

        System.out.println("--\tOrder contact name\t--");
        //we need to organize the values. Soon:
        Set<Map.Entry<Integer, Contact>> set1 = new TreeSet<>(new ComparatorContactNameOrder());
        set1.addAll(schedule.entrySet());
        for (Map.Entry<Integer, Contact> entry : set1) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getName());
        }
        
    }
}

/* class ComparatorNumericOrder implements Comparator<Map.Entry<Integer, Contact>> {
    @Override
    public int compare(Map.Entry<Integer, Contact> cont1, Map.Entry<Integer, Contact> cont2) {
        return Integer.compare(cont1.getValue().getNumber(), cont2.getValue().getNumber());
    }
}
*/

class ComparatorContactNameOrder implements Comparator<Map.Entry<Integer, Contact>> {
    @Override
    public int compare(Map.Entry<Integer, Contact> cont1, Map.Entry<Integer, Contact> cont2) {
        return cont1.getValue().getName().compareToIgnoreCase(cont2.getValue().getName());
    }
}
