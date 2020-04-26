package decorator.coffee.beverages;

import decorator.coffee.Beverage;

public class Decaf extends Beverage {

    @Override
    public String getDescription() {
        return "Decaf";
    }

    @Override
    public double cost() {
        return 2.99;
    }

}
