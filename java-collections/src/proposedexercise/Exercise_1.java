package proposedexercise;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 * Make a program that receives the average temperature of the first 6 months of the year and stores them in a list.
 * 
 * After that, calculate the half-yearly average of the temperatures and show all the temperatures above this average, and in which month they occurred (show the month in full: 1 - January, 2 - February and etc).
 */

public class Exercise_1 {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Creating the list for the 6 first months");
        
        List<Double> temperature = new ArrayList<>();
        
        int monthsQuantity = 6;
        for(int i = 1; i <= monthsQuantity; i++)
        {
            System.out.println("The temperature for the month " + i + " : ");
            temperature.add( i - 1, scanner.nextDouble());
        }

        System.out.println(temperature);

        //Way to calculate average numbers:
        // Iterator<Double> iterator = temperature.iterator();
        // Double sum = 0d;
        // while(iterator.hasNext()){
        //     Double next = iterator.next();
        //     sum += next;
        // }

        // Double averageTemperature = sum/temperature.size();

        //Another Way:

        Double averageTemperature = temperature.stream().mapToDouble(Double::doubleValue).average().orElse(0d);

        System.out.printf("Display the average temperatures : %.1f\n", averageTemperature);

        System.out.println("Months above average : ");

        //Way to calculate numbers above a certain number:

        int count = 0;
        Iterator<Double> iterator1 = temperature.iterator();
        while(iterator1.hasNext()) {

            Double next = iterator1.next();
            
            count ++;

            if(next > averageTemperature) {

                switch (count) {
                    case 1:
                        System.out.print("1 - January: ");
                        break;
                    case 2:
                        System.out.print("2 - February: ");
                        break;
                    case 3:
                        System.out.print("3 - March: ");
                        break;
                    case 4:
                        System.out.print("4 - April: ");
                        break;
                    case 5:
                        System.out.print("5 - May: ");
                        break;
                    case 6:
                        System.out.print("6 - June: ");
                        break;
                
                    default:
                        System.out.print("Invalid month!");
                        break;
                }

                System.out.println(next);
                
            } 
        }
        //Another Way:
        // System.out.print("Temperatures above average: ");
        // temperature.stream()
        //         .filter(t -> t > averageTemperature)
        //         .forEach(t -> System.out.printf("%.1f ", t));
    }
}
