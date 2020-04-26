package decorator.coffee.addons;

import decorator.coffee.Beverage;
import decorator.coffee.BeverageDecorator;

public class Whip extends BeverageDecorator {

    public Whip(Beverage beverage) {
        // Call the constructor in the superclass (BeverageDecorator)
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    @Override
    public double cost() {
        return beverage.cost() + .50;
    }

}
