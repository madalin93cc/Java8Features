package main.java.java8.lambdascopes;

import main.java.java8.functionalinterfaces.Converter;

/**
 * LambdaScopes.java
 */
public class LambdaScopes {

    static int outerStaticNum;
    int outerNum;

    public void testScopes(){
        String s;
        Converter<Integer, String> converter1 = (from) -> {
            outerNum = 1;
            return String.valueOf(from + outerNum);
        };
        s = converter1.convert(2);
        System.out.println("Outer variable scope tested: " + s);

        Converter<Integer, String> converter2 = (from) -> {
            outerStaticNum = 2;
            return String.valueOf(from + outerStaticNum);
        };
        s = converter2.convert(2);
        System.out.println("Outer static variable scope tested: " + s);

        // nu are acces la metodele default din interfete
        //Formula formula = (a) -> sqrt( a * 100);
    }

}
