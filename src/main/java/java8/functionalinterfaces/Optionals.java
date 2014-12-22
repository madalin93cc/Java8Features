package main.java.java8.functionalinterfaces;

import java.util.Optional;

/**
 * Optionals.java
 */
public class Optionals {

    public void testOptionals(){
        Optional<String> stringOptional = Optional.of("value");
        System.out.println("Optional.isPresent: " + stringOptional.isPresent());
        System.out.println("Optional.get: " + stringOptional.get());
        System.out.println("Optional.orElse(other): " + stringOptional.orElse("other"));
        stringOptional.ifPresent((s) -> System.out.println("If present then print: " + s.charAt(0)));

        Optional<String> stringOptionalNull = Optional.empty();
        System.out.println("Optional2.isPresent: " + stringOptionalNull.isPresent());
        System.out.println("Optional2.orElse(other): " + stringOptionalNull.orElse("other"));
        stringOptionalNull.ifPresent((s) -> System.out.println("If present then print: " + s.charAt(0)));
    }

}
