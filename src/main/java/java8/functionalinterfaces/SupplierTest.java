package main.java.java8.functionalinterfaces;

import java.util.function.Supplier;

/**
 * Supplier.java
 */
public class SupplierTest {

    public void testSupplier(){
        Supplier<Functions> functionsSupplier = Functions::new;
        Supplier<Predicates> predicatesSupplier = Predicates::new;

        Functions functions = functionsSupplier.get();
        Predicates predicates = predicatesSupplier.get();

        predicates.testPredicates();
        functions.testFunctions();
    }
}
