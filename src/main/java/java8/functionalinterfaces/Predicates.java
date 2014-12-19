package main.java.java8.functionalinterfaces;

import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * Predicates.java
 */
public class Predicates {

    public void testPredicates(){
        Predicate<String> predicate = (s) -> s.length() > 0;
        System.out.println("Predicate1: " + predicate.test("test"));
        System.out.println("Predicate1: " + predicate.negate().test("test"));

        Predicate<Boolean> notNull = Objects::nonNull;
        Predicate<Boolean> isNull = Objects::isNull;
        System.out.println("Predicate3: " + notNull.test(true));
        System.out.println("Predicate4: " + isNull.test(true));

        Predicate<String> isEmpty = String::isEmpty;
        Predicate<String> notEmpty = isEmpty.negate();
        System.out.println("Predicate5: " + isEmpty.test(""));
        Consumer<Predicate> predicateConsumer = (p) -> System.out.println("Predicate6: " + p.test(""));
        predicateConsumer.accept(notEmpty);
    }

}
