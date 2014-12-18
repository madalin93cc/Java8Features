package main.java.java8.lambdaexpressions;

import java.util.Collections;
import java.util.List;

/**
 * SortList.java
 */
public interface SortList {

    void sortListOfStringClassic(List<String> list);

    default void sortListWithTypeString(List list){
        Collections.sort(list, (String a, String b) -> {
            return a.compareTo(b);
        });
    }

    default void sortListWithTypeIntOneLine(List list){
        Collections.sort(list, (Integer a, Integer b) -> a.compareTo(b));
    }

    default void sortAnyList(List<? extends Comparable> list){
        Collections.sort(list, (a, b) -> a.compareTo(b));
    }

}
