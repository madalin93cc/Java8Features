package main.java.java8.functionalinterfaces;

/**
 * Converter.java
 * @FunctionalInterface opreste declararea a mai mult de o metoda abstracta
 */
@FunctionalInterface
public interface Converter<F, T> {

    T convert(F from);

}
