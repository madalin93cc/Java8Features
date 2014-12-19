package main.java.java8.functionalinterfaces;

import java.util.function.Consumer;
import java.util.function.Function;

/**
 * Functions.java
 */
public class Functions {

    public void testFunctions() {
        Function<String, Integer> toInteger = Integer::valueOf;
        System.out.println("Function toInteger: " + toInteger.apply("123"));
        Function<String, Integer> backToStringAndLength = toInteger.andThen(String::valueOf).andThen(String::length);

        Consumer<Function> functionsConsumer = (p) -> System.out.println("Function backToStringAndLength: " + p.apply("123"));
        functionsConsumer.accept(backToStringAndLength);
    }

}
