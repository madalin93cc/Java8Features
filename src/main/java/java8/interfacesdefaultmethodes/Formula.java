package main.java.java8.interfacesdefaultmethodes;

/**
 * Formula.java
 */
public interface Formula {

    double calculate(int nr);

    double calculate();

    default double sqrt(int nr){
        return Math.sqrt(nr);
    }

}
