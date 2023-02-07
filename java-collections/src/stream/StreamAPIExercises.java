package stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;
public class StreamAPIExercises {
    
    public static void main(String[] args) {
        List<String> randomNumber = 
            Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");

        System.out.println("Print all elements of that String list: ");

        //Functional interface Consumer:
        /*randomNumber.stream().forEach(new Consumer<String>() {
            @Override
            public void accept(String t) {
                System.out.println(t);
            }
        });*/

        // Lambda: 
        //randomNumber.stream().forEach(t -> System.out.println(t));

        // Without Stream: 
        //randomNumber.forEach(t -> System.out.println(t));

        // Reference Method: 
        randomNumber.forEach(System.out::println);

        System.out.println("Take the first 5 numbers and put them inside a Set: ");
        //Set don't accept repeated numbers.

        randomNumber.stream()
            .limit(5)
            .collect(Collectors.toSet())
            .forEach(System.out::println);

        //Without printing and just collecting:
        Set<String> collectSet = randomNumber.stream()
            .limit(5)
            .collect(Collectors.toSet());

        System.out.println("Turn this list of String into a list of integers: ");

        /*randomNumber.stream()
            .map(new Function<String, Integer>() {
                @Override
                public Integer apply(String t) {
                    return Integer.parseInt(t);
                }
            });*/

        //Lambda:
        /*randomNumber.stream()
            .map(t -> Integer.parseInt(t));*/
        
        //Reference Method:
        randomNumber.stream()
            .map(Integer::parseInt)
            .collect(Collectors.toList())
            .forEach(System.out::println);

        //collecting:
        /*List<Integer> collectList = randomNumber.stream()
            .map(Integer::parseInt)
            .collect(Collectors.toList());*/

        System.out.println("Take even numbers greater than 2 and put them in a list: ");

        List<Integer> evenNumbersGreaterThan2 = randomNumber.stream()
            .map(Integer::parseInt)
            .filter(new Predicate<Integer>() {
                @Override
                public boolean test(Integer i) {
                    if (i % 2 ==0 && i > 2) return true;
                    return false;
                }
            })
            .collect(Collectors.toList());
            System.out.println(evenNumbersGreaterThan2);

        randomNumber.stream()
            .map(Integer::parseInt)
            .filter(i -> i % 2 == 0 && i > 2)
            .collect(Collectors.toList())
            .forEach(System.out::println);

        System.out.println("Show the average of the numbers: ");
        randomNumber.stream()
            .mapToInt(new ToIntFunction<String>() {
                @Override
                public int applyAsInt(String s) {
                    return Integer.parseInt(s);
                }
            })
            .average()
            .ifPresent(new DoubleConsumer() {
                @Override
                public void accept(double value) {
                    System.out.println(value);
                }
            });

        //Lambda
        /*randomNumber.stream()
            .mapToInt(s -> Integer.parseInt(s));
            .average()
            .ifPresent(value -> System.out.println(value));*/

        //Reference Method
        randomNumber.stream()
            .mapToInt(Integer::parseInt)
            .average()
            .ifPresent(System.out::println);

        System.out.println("Remove odd values: ");
        List<Integer> randomNumbersInteger = randomNumber.stream()
        .map(Integer::parseInt)
        .collect(Collectors.toList());

        /*randomNumbersInteger.removeIf(new Predicate<Integer>() {
            @Override
            public boolean test(Integer t) {
                if (t % 2 != 0) return true;
                return false;
            }
        });*/

        randomNumbersInteger.removeIf(t -> (t % 2 != 0));
        System.out.println(randomNumbersInteger);

        System.out.println("Ignore the first 3 elements of the list and print the rest: ");
        randomNumbersInteger.stream()
            .skip(3)
            .forEach(System.out::println);

        long uniqueNumbersCount = randomNumbersInteger.stream()
            .distinct()
            .count();
        System.out.println("Removing the repeated numbers from the list, how many numbers are left? " + uniqueNumbersCount);

        System.out.print("Show the smallest value from the list: ");
        randomNumbersInteger.stream()
            .mapToInt(Integer::intValue)
            .min()
            .ifPresent(System.out::println);

        System.out.print("Show the largest value from the list: ");
        randomNumbersInteger.stream()
            .mapToInt(Integer::intValue)
            .max()
            .ifPresent(System.out::println);;

        int sumOfEvenNumbers = randomNumbersInteger.stream()
            .filter(i -> (i % 2 == 0))
            .mapToInt(Integer::intValue)
            .sum();
        System.out.println("Take only the even numbers and add: " + sumOfEvenNumbers);

        System.out.println("Display the list in numerical order: ");
        List<Integer> numbersNaturalOrder = randomNumbersInteger.stream()
            .sorted(Comparator.naturalOrder())
            .collect(Collectors.toList());
        System.out.println(numbersNaturalOrder);

        System.out.println("Group odd values ​​that are multiples of 3 or 5:");
        // hint: collect(Collectors.groupingBy(new Function())
        Map<Boolean, List<Integer>> collectNumbersMultipleOf3And5 = randomNumbersInteger.stream()
            .collect(Collectors.groupingBy(i -> (i % 3 == 0 || i % 5 == 0)));
        System.out.println(collectNumbersMultipleOf3And5);
            }
}
