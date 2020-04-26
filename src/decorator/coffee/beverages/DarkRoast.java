package decorator.coffee.beverages;

import decorator.coffee.Beverage;

public class DarkRoast extends Beverage {

    @Override
    public String getDescription() {
        return "Dark Roast";
    }

    @Override
    public double cost() {
        return 2.99;
    }

}
