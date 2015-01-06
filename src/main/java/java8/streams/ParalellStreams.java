package main.java.java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/**
 * ParalellStreams.java
 */
public class ParalellStreams {

    private List<String> stringList;

    public ParalellStreams(){
        int max = 1000000;
        stringList = new ArrayList<>(max);
        for (int i = 0; i < 1000000; i++){
            UUID uuid = UUID.randomUUID();
            stringList.add(uuid.toString());
        }
    }

    public void testParalellStreams(){

        long t0, t1, milis;
        t0 = System.nanoTime();
        long count = stringList.stream().sorted().count();
        t1 = System.nanoTime();
        milis = TimeUnit.NANOSECONDS.toMillis(t1 - t0);
        System.out.println("Sequential streams time: " + milis);

        t0 = System.nanoTime();
        count = stringList.parallelStream().sorted().count();
        t1 = System.nanoTime();
        milis = TimeUnit.NANOSECONDS.toMillis(t1 - t0);
        System.out.println("Parallel streams time: " + milis);

    }

}
