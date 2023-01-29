package list.comparators;

import java.util.Comparator;

import list.Cat;

public class ComparatorNameColorAge implements Comparator<Cat> {

    @Override
    public int compare(Cat c1, Cat c2) {
        int name = c1.getName().compareToIgnoreCase(c2.getName());
        if (name != 0) return name;

        int color = c1.getColor().compareToIgnoreCase(c2.getColor());
        if (color != 0 ) return color;

        return Integer.compare(c1.getAge(), c2.getAge());
    }
    
}
