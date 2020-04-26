package decorator.coffee.beverages;

import decorator.coffee.Beverage;

public class HouseBlend extends Beverage {

    @Override
    public String getDescription() {
        return "House Blend";
    }

    @Override
    public double cost() {
        return 2.99;
    }

}
