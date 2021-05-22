package chapter12;

import java.util.*;

public class Fruit {

    public static void main(String[] args) {

        // Sets
        
        Set<String> fruit1 = new HashSet<>();  // HashSet() is an unordered Set()
        fruit1.add("apple");
        fruit1.add("lemon");
        fruit1.add("banana");
        fruit1.add("orange");

        // Duplicate. Doesn't cause an error, but adds a 2nd instance of "lemon" to the list
        fruit1.add("lemon");

        System.out.println(fruit1.size()); // 4
        System.out.println(fruit1);  // [banana, orange, apple, lemon]

        // Lists        
        
        List<String> fruit2 = new ArrayList<>();
        fruit2.add("apple");
        fruit2.add("lemon");
        fruit2.add("banana");
        fruit2.add("orange");
        fruit2.add("lemon");  // Duplicate. Doesn't cause an error, but adds a 2nd instance of "lemon" to the list

        System.out.println(fruit2.size()); // 4
        System.out.println(fruit2);  // [apple, lemon, banana, orange, lemon]

        // Queues
        
        Queue<String> fruit3 = new LinkedList<>();
        fruit3.add("apple");
        fruit3.add("lemon");
        fruit3.add("banana");
        fruit3.add("orange");
        fruit3.add("lemon");

        System.out.println(fruit3.size()); // 5
        System.out.println(fruit3);  // [apple, lemon, banana, orange, lemon]

        fruit3.remove();
        System.out.println(fruit3);  // [ lemon, banana, orange, lemon]

        System.out.println(fruit3.peek()); // lemon
        
        // Maps

        Map<String, Integer> fruitCalories = new HashMap<>();
        fruitCalories.put("apple", 95);
        fruitCalories.put("lemon", 20);
        fruitCalories.put("banana", 105);
        fruitCalories.put("orange", 45);
        fruitCalories.put("lemon", 17);

        System.out.println(fruitCalories.size()); // 4
        System.out.println(fruitCalories);  // {banana=105, orange, apple=95, lemon=17}

        System.out.println(fruitCalories.get("lemon"));  // 17

        System.out.println(fruitCalories.entrySet());  // {banana=105, orange, apple=95, lemon=17}

        fruitCalories.remove("orange");
        System.out.println(fruitCalories); // {banana=105, apple=95, lemon=17}

        // Immutable Lists
        List<String> unchangeableList = List.of("apple", "lemon", "banana");
        /* unchangeableList.add("orange");  // UnsupportedOperationException */
        /* unchangeableList.remove(1);  // UnsupportedOperationException */
        System.out.println(unchangeableList);
    }
}