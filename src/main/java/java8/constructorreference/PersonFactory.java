package main.java.java8.constructorreference;

/**
 * PersonFactory.java
 */
@FunctionalInterface
public interface PersonFactory<P extends Person> {

    P create(String firstName, String lastName);

}
