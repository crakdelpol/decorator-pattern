package it.pipitone.matteo.pattern.decorator;

public class Deca extends Beverage {


    public Deca() {
        description = "coffee Deca";
    }

    @Override
    public double cost() {
        return 1.10;
    }
}
