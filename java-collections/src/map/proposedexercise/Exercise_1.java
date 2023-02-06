package map.proposedexercise;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/*
Given the estimated population of some states in northeastern Brazil, do:
 State = PE - population = 9,616,621
 State = AL - population = 3,351,543
 State = CE - population = 9,187,103
 State = RN - population = 3,534,265
 */

public class Exercise_1 {
    public static void main(String[] args) {
        
        System.out.println("Create a dictionary that lists the states and their respective populations: ");
        Map<String, Integer> statePopulationNE = new HashMap<>() {{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
        }};
        System.out.println(statePopulationNE);

        System.out.println("Replace the population of the RN state with : 3,534,165");
        statePopulationNE.put("RN", 3534165);
        System.out.println(statePopulationNE);

        System.out.println("Check if the state of Paraíba (PB) tucson is in the dictionary, if not, add " + "PB - 4,039,277: ");
        statePopulationNE.put("PB", 4039277);
        System.out.println(statePopulationNE);

        System.out.println("Display the PE state population: " + statePopulationNE.get("PE"));

        System.out.println("Display all states and their populations in the order they were entered: ");
        Map<String, Integer> statePopulationNE2 = new LinkedHashMap<>() {{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
            put("PB", 4039277);
        }};
        System.out.println(statePopulationNE2);

        System.out.println("Display all states and their populations in alphabetical order: ");
        Map<String, Integer> statePopulationNE3 = new TreeMap<>(statePopulationNE);
        System.out.println(statePopulationNE3);

        Collection<Integer> population = statePopulationNE.values();
        String smallestPopulationState = "";
        String largestPopulationState = "";
        for (Map.Entry<String, Integer> entry : statePopulationNE.entrySet()) {
            if (entry.getValue().equals(Collections.max(population))) largestPopulationState = entry.getKey();
            if (entry.getValue().equals(Collections.min(population))) smallestPopulationState = entry.getKey();
        }

        System.out.printf("Display the state with the smallest population (%s) and its value (%d)\n", smallestPopulationState, Collections.min(population));
        System.out.printf("Display the state with the largest population (%s) and its value (%d)\n", largestPopulationState, Collections.max(population));

        int sum = 0;
        Iterator<Integer> iterator = statePopulationNE.values().iterator();
        while(iterator.hasNext()) {
            sum += iterator.next();
        }
        System.out.println("Display the sum of the population of these states: " + sum);
/*      int sum2 = 0;
       for(Map.Entry<String, Integer> entry : statePopulationNE.entrySet()) {
           sum2 += entry.getValue();
       }
*/

        System.out.println("Display the population mean of this state dictionary: " + (sum / statePopulationNE.size()));
        System.out.println("Remove states with population less than 4,000,000: ");
        Iterator<Integer> iterator2 = statePopulationNE.values().iterator();
        while(iterator2.hasNext()){
            if (iterator2.next() <= 4000000) iterator2.remove();
        }
        System.out.println(statePopulationNE);

        System.out.println("Delete the dictionary of states with their respective estimated populations: ");
        statePopulationNE.clear();
        System.out.println(statePopulationNE);

        System.out.println("Check if the list is empty: " + statePopulationNE.isEmpty());
    }
}
