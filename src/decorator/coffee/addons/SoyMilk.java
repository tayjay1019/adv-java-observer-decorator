package decorator.coffee.addons;

import decorator.coffee.Beverage;
import decorator.coffee.BeverageDecorator;

public class SoyMilk extends BeverageDecorator {

    public SoyMilk(Beverage beverage) {
        // Call the constructor in the superclass (BeverageDecorator)
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public double cost() {
        return beverage.cost() + 1.15;
    }
}
