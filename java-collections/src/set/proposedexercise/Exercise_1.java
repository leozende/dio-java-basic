package set.proposedexercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * Create a set containing the rainbow colors and:
 * A. Display all colors one below the other.
 * B. The number of colors the rainbow has.
 * C. Display colors alphabetically.
 * D. Display the colors in the reverse order they were entered.
 * E. Display all colors that start with the letter "v".
 * F. Remove all colors that do not start with the letter "v".
 * G. Clean the assembly.
 * H. Check if the pool is empty.
 */

public class Exercise_1 {
    public static void main(String[] args) {

        //Create a set containing the rainbow colors and:        
        Set<String> rainbowColors = new HashSet<>(Arrays.asList("violet", "indigo", "blue", "green", "yellow", "orange", "red"));

        System.out.println("Display all colors one below the other: ");
        for (String colors : rainbowColors) {
            System.out.println(colors);
        }

        System.out.println("The number of colors the rainbow has: " + rainbowColors.size());

        System.out.println("Display colors alphabetically: ");
        Set<String> rainbowColors2 = new TreeSet<>(rainbowColors);
        System.out.println(rainbowColors2);

        System.out.println("Display the colors in the reverse order they were entered: ");
        Set<String> rainbowColors3 = new LinkedHashSet<>(Arrays.asList("violet", "indigo", "blue", "green", "yellow", "orange", "red"));
        System.out.println(rainbowColors3);
        List<String> rainbowColorsList = new ArrayList<>(rainbowColors3);
        Collections.reverse(rainbowColorsList);
        System.out.println(rainbowColorsList);

        System.out.println("Display all colors that start with the letter 'v': ");
        for (String colors : rainbowColors) {
            if (colors.startsWith("v")) System.out.println(colors);
        }

        System.out.println("Remove all colors that do not start with the letter 'v': ");
        Iterator<String> iterator = rainbowColors.iterator();
        while(iterator.hasNext()) {
            if(!iterator.next().startsWith("v")) iterator.remove();
        }
        System.out.println(rainbowColors);

        System.out.println("Clean the set: ");
        rainbowColors.clear();
        System.out.println(rainbowColors);

        System.out.println("Check if the pool is empty: " + rainbowColors.isEmpty());

    }
}
