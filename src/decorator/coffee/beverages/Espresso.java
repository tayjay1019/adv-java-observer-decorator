package decorator.coffee.beverages;

import decorator.coffee.Beverage;

public class Espresso extends Beverage {

    @Override
    public String getDescription() {
        return "Espresso";
    }

    @Override
    public double cost() {
        return 3.99;
    }

}
