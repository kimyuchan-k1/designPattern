package decorator_pattern;

public class Soy extends CondimentDecorator {

    public Soy(Beverage beverage)
    {
        this.beverage = beverage;
    }
    @Override
    public String getDescription() {
        return beverage.getDescription() + ", 간장";
    }

    @Override
    public double cost() {
        return beverage.cost() + .12;
    }
}
