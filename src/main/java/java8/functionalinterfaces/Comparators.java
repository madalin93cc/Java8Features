package main.java.java8.functionalinterfaces;

import javafx.util.Pair;

import java.util.Comparator;

/**
 * Comparators.java
 */
public class Comparators {

    public void testComparators(){
        Comparator<Pair<Integer, String>> pairComparator = (p1, p2) -> p1.getValue().compareTo(p2.getValue());
        Pair<Integer, String> p1 = new Pair<Integer, String>(1, "primul"),
                p2 = new Pair<Integer, String>(2, "al doilea");
        System.out.println(p1 + " bigger then " + p2 + " compared by value: " + (pairComparator.compare(p1, p2) > 0));
        System.out.println(p1 + " compare with " + p2 + " by value (reversed): " + (pairComparator.reversed().compare(p1,p2) > 0));
    }

}
