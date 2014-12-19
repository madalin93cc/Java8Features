package main.java.java8;

import main.java.java8.constructorreference.Person;
import main.java.java8.constructorreference.PersonFactory;
import main.java.java8.functionalinterfaces.Converter;
import main.java.java8.functionalinterfaces.Functions;
import main.java.java8.functionalinterfaces.Predicates;
import main.java.java8.functionalinterfaces.SupplierTest;
import main.java.java8.interfacesdefaultmethodes.Formula;
import main.java.java8.interfacesdefaultmethodes.FormulaImpl;
import main.java.java8.lambdaexpressions.SortList;
import main.java.java8.lambdaexpressions.SortListImpl;
import main.java.java8.lambdascopes.LambdaScopes;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * Java8Main.java
 */

public class Java8Main {

    public static void main(String args[]){

        /*
        Interfaces default methods
         */
        Formula formula = new FormulaImpl(16);
        System.out.println("Sqrt(16) = " + formula.calculate());
        System.out.println("Sqrt(25) = " + formula.calculate(25));

        /*
        Sort list with lambda expressions
         */
        List<String> listOfStrings = Arrays.asList("a", "n", "b", "g", "o");
        List<Integer> listOfInts = Arrays.asList(1, 4, 3, 6, 7);
        SortList sortList = new SortListImpl();

        // clasic
        sortList.sortListOfStringClassic(listOfStrings);
        System.out.println("Classic sort: " + listOfStrings);
        Collections.shuffle(listOfStrings);
        // more lines
        sortList.sortListWithTypeString(listOfStrings);
        System.out.println("Lambda more lines: " + listOfStrings);
        Collections.shuffle(listOfStrings);
        // one line
        sortList.sortListWithTypeIntOneLine(listOfInts);
        System.out.println("Lambda one line: " + listOfInts);
        Collections.shuffle(listOfInts);
        // generic one line
        sortList.sortAnyList(listOfStrings);
        System.out.println("Lambda generic string list: " + listOfStrings);
        sortList.sortAnyList(listOfInts);
        System.out.println("Lambda generic int list: " + listOfInts);

        /*
        Functional interfaces
         */
        // Integer form string
        Converter<String, Integer> converter1 = (from) -> Integer.valueOf(from);
        Integer conv1 = converter1.convert("123");
        System.out.println("Integer converted from string: " + conv1);
        // String from integer using Method and Constructor References
        // :: transmite o referinta la o metoda statica (lazy)
        Converter<Integer, String> converter2 = String::valueOf;
        String conv2 = converter2.convert(conv1);
        System.out.println("String converted from integer: " + conv2);
        // String to String using Method and Constructor Reference
        ObjectReference objectReference = new ObjectReference();
        Converter<String, String> converter3 = objectReference::startsWith;
        String conv3 = converter3.convert("Java");
        System.out.println("String from string using object method reference: " + conv3);

        /*
        Constructor reference
         */
        PersonFactory<Person> personFactory = Person::new;
        Person person = personFactory.create("Madalin", "Colezea");
        System.out.println("Person created by person factory: " + person);

        /*
        Lambda scopes
         */
        // local variables
        final int nr = 2; // works without final
        Converter<Integer, String> converterwithlocal = (from) -> String.valueOf(from + nr);
        System.out.println("Lambda using local variable: " + converterwithlocal.convert(2));
        // lambda scopers
        LambdaScopes lambdaScopes = new LambdaScopes();
        lambdaScopes.testScopes();

        /*
        Built-in Functional Interfaces
         */
        Supplier<SupplierTest> supplierTestSupplier = SupplierTest::new;
        SupplierTest supplierTest = supplierTestSupplier.get();
        supplierTest.testSupplier();

    }

}
