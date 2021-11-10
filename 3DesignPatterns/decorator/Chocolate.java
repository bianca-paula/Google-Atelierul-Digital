package designpatterns.decorator;

public class Chocolate extends Topping {
    public Chocolate(Beverage mainBeverage) {
        super("Chocolate", 4, mainBeverage);
    }
}
