package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.LinkedList;

public class ListExample {
    
    public static void main(String[] args) {
        
        // Given a list of 7 student grades [7, 8.5, 9.3, 5, 7, 0, 3.6], do:

        //Ways to create a list:

        // List notes = new ArrayList(); // before java 5  
        // After java 5 = List<Double> notes = new ArrayList<>(); // Generics(jdk 5) - Diamond Operator(jdk 7)
        // ArrayList<Double> notes = new ArrayList<>(); // It is not recommended like this, as it is better to program facing the interface and not the implementation
        // List<Double> notes = new ArrayList<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        /*List<Double> notes = Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6); // You cant add or remove elements in this case.
        notes.add(10d);
        System.out.println(notes);*/
        /*List<Double> notes = List.of(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6); //The same as before, cant add or remove elements.
        notes.add(1d);
        notes.remove(5d);
        System.out.println(notes);*/

        System.out.println("Create a list and add the seven notes: ");

        List<Double> notes = new ArrayList<>(); 
        notes.add(7.0);
        notes.add(8.5);
        notes.add(9.3);
        notes.add(5d);
        notes.add(7.0);
        notes.add(0.0);
        notes.add(3.6);

        System.out.println(notes.toString());

        System.out.println("Display the position of the 5.0 grade: " + notes.indexOf(5.0));

        System.out.println("Add note 8 to the list at position 4: ");
        notes.add(4, 8d);
        System.out.println(notes);

        System.out.println("Replace note 5.0 with note 6.0: ");
        notes.set(notes.indexOf(5d), 6.0);
        System.out.println(notes);

        System.out.println("Check if Note 5.0 is on the list: " + notes.contains(5.0));

        System.out.println("Display all grades in the order they were entered: ");
        for (Double note : notes) System.out.println(note);

        System.out.println("Display the third added note: " + notes.get(2));

        System.out.println("Display the lowest grade: " + Collections.min(notes));

        System.out.println("Display the highest grade: " + Collections.max(notes));

        System.out.print("Display the sum of values: ");

        Iterator<Double> iterator =  notes.iterator();
        Double sum = 0d;
        while(iterator.hasNext()){
            Double next = iterator.next();
            sum += next;
        }
        System.out.println(sum);

        System.out.println("Display the average grades: " + (sum/notes.size()));

        System.out.println("Remove note 0: ");
        notes.remove(0d);
        System.out.println(notes); //If you forget the d, it will remove the element from postion 0. Like Bellow:

        System.out.println("Remove note from position 0: ");
        notes.remove(0);
        System.out.println(notes);

        System.out.println("Remove notes smaller than 7 and display the list: ");

        Iterator<Double> iterator1 = notes.iterator();
        while(iterator1.hasNext()) {
            Double next = iterator1.next();
            if(next < 7) iterator1.remove();
        }
        System.out.println(notes);

        System.out.println("Delete the entire list");
        notes.clear();
        System.out.println(notes);

        System.out.println("Check if the list is empty: " + notes.isEmpty());

        
        // For you: Solve these exercises using the methods of the LinkedList implementation:

        System.out.println("Create a list called notes2 " + "and place all the elements of the list Arraylist in this new list: ");
        LinkedList<Double> notes2 = new LinkedList<>();
        notes2.add(7.0);
        notes2.add(8.5);
        notes2.add(9.3);
        notes2.add(5d);
        notes2.add(7.0);
        notes2.add(0.0);
        notes2.add(3.6);

        System.out.println(notes2);

        System.out.println("Display the first note of the new list without removing it: " + notes2.getFirst());


        System.out.println("Display the first grade of the new list by removing it: " + notes2.poll());
        System.out.println(notes2);
    }
}
