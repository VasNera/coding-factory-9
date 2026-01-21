package gr.aueb.cf.cf9.ch17.sets;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<String> bag = new HashSet<>();

        //add - no duplicates

        bag.add("apple");
        bag.add("banana");
        bag.add("orange");
        bag.add("apple");           // no duplicates allowed


        // Time - complexity 0(1)
        if (bag.contains("apple")) {                  //override equals && hashCode
            bag.remove("apple");
        } else {
            System.out.println("apple not found");
        }

        bag.removeIf(item->item.startsWith("b"));     //θα διαγράψει δλδ το banana.

        bag.forEach(System.out::println);
    }
}