package map.proposedexercise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

/*
Write a program that simulates a rolling dice. Roll the dice 100 times and store.
Then show how many times each value was achieved.
 */

public class Exercise_2 {
    public static void main(String[] args) {
        int launchNumber = 100;

        List<Integer> values = new ArrayList<>();
        Random launchGenerator = new Random();
        for(int i = 0; i < launchNumber; i++) {
            int number = launchGenerator.nextInt(6) + 1;
            values.add(number);
        }

        Map<Integer, Integer> launch = new HashMap<>();
        for (Integer result : values) {
            if (launch.containsKey(result))
                launch.put(result, (launch.get(result) + 1));
            else launch.put(result, 1);
        }

        System.out.println("Playing");
        // content of for + try/cath - totally optional
        for (int i = 0; i < 3; i++) {
            try {
                Thread.sleep(3000);
                System.out.print(".");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("\nValue " + " Number of times");
        for (Map.Entry<Integer, Integer> entry : launch.entrySet())
            System.out.printf("%3d %10d\n", entry.getKey(), entry.getValue());
        
    }
}
