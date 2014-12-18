package main.java.java8.interfacesdefaultmethodes;

/**
 * FormulaImpl.java
 */
public class FormulaImpl implements Formula {

    private int number;

    public FormulaImpl(int number){
        this.number = number;
    }

    public FormulaImpl(){
        this(0);
    }

    @Override
    public double calculate(int nr) {
        return sqrt(nr);
    }

    @Override
    public double calculate() {
        return sqrt(number);
    }
}
