package map;

import java.io.ObjectOutputStream.PutField;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class MapExample {
    public static void main(String[] args) {
        
/*
 Given the car models and their consumption on the road, do:
 model = gol - consumption = 14.4km/l
 model = uno - consumption = 15.6 km/l
 model = mobi - consumption = 16.1 km/l
 model = hb20 - consumption = 14.5 km/l
 model = kwid - consumption = 15.6 km/l
 */

// Map popularCars2020 = new HashMap(); // before java 5
// Map<String, Double> popularCars = new HashMap<>(); //Generics(jdk 5) - Diamond Operator(jdk 7)
// HashMap<String, Double> popularCars = new HashMap<>();
// Map<String, Double> popularCars2020 = Map.of("gol", 14.4, "uno", 15.6, "mobi", 16.1, "hb20", 14.5, "kwid", 15.6)

        System.out.println("Create a dictionary that lists the models and their respective consumption: "); 
        Map<String, Double> popularCars = new HashMap<>(){{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};
        System.out.println(popularCars.toString());

        System.out.println("Replace the gol consumption by 15.2 km/l: ");
        popularCars.put("gol", 15.2);
        System.out.println(popularCars);

        System.out.println("Check if the tucson model is in the dictionary: " + popularCars.containsKey("tucson"));

        System.out.println("Display the uno valor: " + popularCars.get("uno")); 

        // System.out.println("Display the third model added: "); // Like set, you don't have a method for this.

        System.out.println("Display the model: ");
        // Set<String> models = popularCars.keySet();
        System.out.println(popularCars.keySet());

        System.out.println("Display the cars consumption: ");
        // Collection<Double> consumption = popularCars.values();
        System.out.println(popularCars.values());

        System.out.println("Display the most economical model and its consumption: ");   

        Double mostEconomicalConsumption = Collections.max(popularCars.values());
        Set<Entry<String, Double>> entrySet = popularCars.entrySet();
        String mostEconomicalModel = "";

        for (Entry<String,Double> entry : entrySet) {
            if (entry.getValue().equals(mostEconomicalConsumption)) {
                mostEconomicalModel = entry.getKey();  
                System.out.println("Most economical model: " + mostEconomicalModel + " - " + mostEconomicalConsumption);
            } 
        }

        System.out.println("Display the least economical model and its consumption: " );

        Double leastEconomicalConsumption = Collections.min(popularCars.values());
        String leastEconomicalModel = "";

        for (Entry<String,Double> entry : popularCars.entrySet()) {
            if(entry.getValue().equals(leastEconomicalConsumption)) {
                leastEconomicalModel = entry.getKey();
                System.out.println("Least economical model: " + leastEconomicalModel + " - " + leastEconomicalConsumption);
            } 
        }

        Iterator<Double> iterator = popularCars.values().iterator();
        Double sum = 0d;
        while(iterator.hasNext()) {
            sum += iterator.next();      
        }

        System.out.println("Display the sum of consumptions: " + sum);

        System.out.println("Display the average consumption of this car dictionary: " + (sum/popularCars.size()));

        System.out.println("Remove models with consumption equal to 15.6 km/l: ");
        Iterator<Double> iterator1 = popularCars.values().iterator();
        while(iterator1.hasNext()) {
            if(iterator1.next().equals(15.6)) iterator1.remove();     
        }
        System.out.println(popularCars);

        System.out.println("Display all cars in the order they were entered: ");
        Map<String, Double> popularCars1 = new LinkedHashMap<>(){{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};
        System.out.println(popularCars1.toString());

        System.out.println("Display the dictionary sorted by model: ");
        Map<String, Double> popularCars2 = new TreeMap<>(popularCars1);
        System.out.println(popularCars2.toString());

        System.out.println("Delete the car dictionary: ");
        popularCars.clear();

        System.out.
println("Check if the dictionary is empty: " + popularCars.isEmpty());

    }
}
