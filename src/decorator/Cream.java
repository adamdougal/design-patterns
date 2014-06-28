package decorator;

public class Cream extends CondimentDecorator {

    private final Beverage beverage;

    public Cream(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Cream";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.25;
    }
}
