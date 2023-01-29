package list.comparators;

import java.util.Comparator;
import list.Cat;

public class ComparatorAge implements Comparator<Cat> {

    @Override
    public int compare(Cat c1, Cat c2) {
        return Integer.compare(c1.getAge(), c2.getAge());
    }
    
}
