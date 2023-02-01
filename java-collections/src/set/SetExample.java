package set;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.DoubleBinaryOperator;

public class SetExample {
    public static void main(String[] args) {
        
        // Given a list of 7 student grades [7, 8.5, 9.3, 5, 7, 0, 3.6], do:

        // Set notes = new HashSet(); // before java 5
        // HashSet<Double> notes = new HashSet<>();
        // Set<Double> notes = new HashSet<>(); //Generics(jdk 5) - Diamond Operator(jdk 7)
        /* Set<Double> notes = Set.of(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);
                grades.
        add(1d);
                notes.remove(5d);
                System.out.println(notes);
        */

        System.out.println("Create a set and add the notes: ");
        Set<Double> notes = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        System.out.println(notes.toString());

        // System.out.println("Display the position of the 5.0 grade: "); //Don't have the method indexOf(),
        //so is not possible to get the position

        // System.out.println("Add the grade 8.0 in position 4 to the list: "); //Can't work with position in Set.

        // System.out.println("Replace the 5.0 grade with the 6.0 grade: "); //It's not possible too.

        System.out.println("Check if the 5.0 note is in the set: " + notes.contains(5d));

        // System.out.println("Display the third added note: "); // Not possible. (dont have get)

        System.out.println("Display the lowest grade: " + Collections.min(notes));

        System.out.println("Display the highest grade: " + Collections.max(notes));

        // Sum of valors
        Iterator<Double> iterator = notes.iterator();
        Double sum = 0.0;
        while(iterator.hasNext()) {
            Double next = iterator.next();
            sum += next;
        }
        System.out.printf("Display the sum of valors: %.1f\n", sum);

        System.out.printf("Display the average grades: %.1f\n", (sum/notes.size()));

        System.out.println("Remove note 0: ");
        notes.remove(0d);
        System.out.println(notes);

        // System.out.println("Remove note from position 0: "); //Dont have position

        System.out.println("Remove notes smaller than 7 and display the list: ");
        Iterator<Double> iterator1 = notes.iterator();
        while(iterator1.hasNext()) {
            Double next = iterator1.next();
            if (next < 7) iterator1.remove();
        }
        System.out.println(notes);

        System.out.println("Display all grades in the order they were entered: ");

        Set<Double> notes2 = new LinkedHashSet<>();
        notes2.add(7d);
        notes2.add(8.5);
        notes2.add(9.3);
        notes2.add(5d);
        notes2.add(7d);
        notes2.add(0d);
        notes2.add(3.6);
        System.out.println(notes2);

        System.out.println("Display all grades in ascending order: ");
        Set<Double> notes3 = new TreeSet<>(notes2);
        System.out.println(notes3);

        System.out.println("Delete the entire set");
        notes.clear();

        System.out.println("Check if the set is empty: " + notes.isEmpty());
        System.out.println("Check if set 2 is empty: " + notes2.isEmpty());
        System.out.println("Check if set 3 is empty: " + notes3.isEmpty());

    }
}
