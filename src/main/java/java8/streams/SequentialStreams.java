package main.java.java8.streams;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.ArrayList;
import java.util.List;

/**
 * SequentialStreams.java
 */
public class SequentialStreams {

    private List<String> stringList;

    public SequentialStreams(){

        stringList = new ArrayList<>();
        stringList.add("aa2");
        stringList.add("ddd");
        stringList.add("ccc");
        stringList.add("aa1");
        stringList.add("eee");
        stringList.add("bbb");

    }

    public void testSequentialStrean(){

        System.out.println("\nSequential stream filter example:");
        stringList
                .stream()
                .filter((s) -> s.startsWith("a"))
                .forEach(System.out::println);


        System.out.println("Sequential stream sorted example:");
        stringList
                .stream()
                .sorted()
                .filter((s) -> s.startsWith("a"))
                .forEach(System.out::println);
        System.out.println("The order is not changed");
        System.out.println(stringList);

        System.out.println("Sequential stream map example:");
        stringList
                .stream()
                .map(String::toUpperCase)
                .sorted((a, b) -> b.compareTo(a))
                .forEach(System.out::println);

        System.out.println("Sequential stream match example:");
        Boolean any = stringList
                .stream()
                .anyMatch((s) -> s.startsWith("a"));
        System.out.println("Any match: " + any);
        Boolean all = stringList
                .stream()
                .allMatch((s) -> s.startsWith("a"));
        System.out.println("All match: " + all);
        Boolean noOne = stringList
                .stream()
                .noneMatch((s) -> s.startsWith("z"));
        System.out.println("No one match: " + noOne);
    }
}
