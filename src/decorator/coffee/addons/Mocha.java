package decorator.coffee.addons;

import decorator.coffee.Beverage;
import decorator.coffee.BeverageDecorator;

public class Mocha extends BeverageDecorator {

    public Mocha(Beverage beverage) {
        // Call the constructor in the superclass (BeverageDecorator)
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        return beverage.cost() + .25;
    }

}
