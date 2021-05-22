package chapter12;

import java.util.*;
import java.util.Map.Entry;

public class CollectionsDemo {

    public static void main(String[] args) {
        setDemo();  // You can loop through unordered set with an iterator()
        listDemo();
        queueDemo();
        mapDemo();
    }

    public static void setDemo() {
        Set<String> fruit = new HashSet<>();  // HashSet() is an unordered Set()
        fruit.add("apple");
        fruit.add("lemon");
        fruit.add("banana");
        fruit.add("orange");

        // Duplicate. Doesn't cause an error, but adds a 2nd instance of "lemon" to the list
        fruit.add("lemon");

        System.out.println("\n*** setDemo()");

        var i = fruit.iterator();
        // Replaceable with enhanced 'for', as below in listDemo()
        while(i.hasNext()) {
            System.out.println(i.next());
        }
    }
    
    public static void listDemo() {
        List<String> fruit = new ArrayList<>();
        fruit.add("apple");
        fruit.add("lemon");
        fruit.add("banana");
        fruit.add("orange");
        fruit.add("lemon");

        System.out.println("\n*** ListDemo()");

        // enhanced for loop
        for(String item: fruit) {
            System.out.println(item);
        }
    }

    public static void queueDemo() {
        Queue<String> fruit = new LinkedList<>();
        fruit.add("apple");
        fruit.add("lemon");
        fruit.add("banana");
        fruit.add("orange");
        fruit.add("lemon");

        System.out.println("\n*** queueDemo()");

        // Lambda can be replaced with method reference
        /* fruit.forEach(x -> System.out.println(x)); */
        fruit.forEach(System.out::println);
    }

    public static void mapDemo() {
        Map<String, Integer> fruitCalories = new HashMap<>();
        fruitCalories.put("apple", 95);
        fruitCalories.put("lemon", 20);
        fruitCalories.put("banana", 105);
        fruitCalories.put("orange", 45);
        fruitCalories.put("lemon", 17);

        System.out.println("\n*** mapDemo()");

        // Instructor recommended
        for(var entry: fruitCalories.entrySet()) {
            System.out.println(entry.getValue());
        }
        System.out.println();

        // Alternative from https://www.programiz.com/java-programming/library/hashmap/entryset
        for(Entry<String, Integer> entry: fruitCalories.entrySet()) {
            System.out.print(entry);
            System.out.print(", ");
        }
        System.out.println();

        // My alternative which doesn't require importing java.util.Map.Entry
        for(var entry: fruitCalories.entrySet()) {
            System.out.print(entry);
            System.out.print(", ");
        }
        System.out.println();

        // My simpler alternative (from class Fruit)
        System.out.println(fruitCalories);

        System.out.println();
        fruitCalories.forEach(
            (k,v) -> System.out.println("Fruit: " + k + ", Calories: " + v));
    }
}