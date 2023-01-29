package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import list.comparators.ComparatorAge;
import list.comparators.ComparatorColor;
import list.comparators.ComparatorNameColorAge;

/*Given the following information about my cats, create a list
and sort this list by displaying:
(name - age - color);
Cat 1 = name: Jon, age: 18, color: black
Cat 2 = name: Simba, age: 6, color: brindle
Cat 3 = name: Jon, age: 12, color: yellow
*/

public class ListSortingExample {
    public static void main(String[] args) {

        List<Cat> myCats = new ArrayList<>(){{
            add(new Cat("Jon", 18, "Black"));
            add(new Cat("Simba", 6, "Brindle"));
            add(new Cat("Jon", 12, "Yellow"));
        }};
        
        System.out.println("--\tInsertion Order\t---");
        System.out.println(myCats);

        System.out.println("--\tRandom Order\t---");
        Collections.shuffle(myCats);
        System.out.println(myCats);

        System.out.println("--\tNatural Order (Name)\t---"); //Utilizing comparable in the cat class.
        //myCats.sort(null); If utilized comparator, it's possible to use this code.
        Collections.sort(myCats);
        System.out.println(myCats);

        // The next three is necessary to utilize comparator!

        System.out.println("--\tAge Order\t---");
        Collections.sort(myCats, new ComparatorAge());
        System.out.println(myCats);
        
        myCats.sort(new ComparatorAge());
        System.out.println(myCats);

        System.out.println("--\tColor Order\t---");
        Collections.sort(myCats, new ComparatorColor());
        System.out.println(myCats);
        
        myCats.sort(new ComparatorColor());
        System.out.println(myCats);

        System.out.println("--\tName/Color/Age Order\t---");
        Collections.sort(myCats, new ComparatorNameColorAge());
        System.out.println(myCats);
        
        myCats.sort(new ComparatorNameColorAge());
        System.out.println(myCats);


    }
}
