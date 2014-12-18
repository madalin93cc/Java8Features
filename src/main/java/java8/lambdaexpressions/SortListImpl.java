package main.java.java8.lambdaexpressions;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * SortListImpl.java
 */
public class SortListImpl implements SortList {

    @Override
    public void sortListOfStringClassic(List<String> list) {

        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });

    }

}
