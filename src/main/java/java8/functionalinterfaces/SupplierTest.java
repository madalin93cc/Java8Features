package main.java.java8.functionalinterfaces;

import java.util.function.Supplier;

/**
 * Supplier.java
 */
public class SupplierTest {

    public void testSupplier(){
        Supplier<Functions> functionsSupplier = Functions::new;
        Supplier<Predicates> predicatesSupplier = Predicates::new;
        Supplier<Comparators> comparatorSupplier = Comparators::new;
        Supplier<Optionals> optionalsSupplier = Optionals::new;

        Functions functions = functionsSupplier.get();
        Predicates predicates = predicatesSupplier.get();

        predicates.testPredicates();
        functions.testFunctions();

        Comparators comparators = comparatorSupplier.get();
        comparators.testComparators();

        Optionals optionals = optionalsSupplier.get();
        optionals.testOptionals();
    }
}
