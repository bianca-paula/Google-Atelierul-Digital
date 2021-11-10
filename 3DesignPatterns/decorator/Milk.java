package designpatterns.decorator;

public class Milk extends Topping {
    public Milk(Beverage mainBeverage) {
        super("Milk", 3, mainBeverage);
    }
}
