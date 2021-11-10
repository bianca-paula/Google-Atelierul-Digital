package designpatterns.decorator;

public class Whip extends Topping {
    public Whip(Beverage mainBeverage){
        super("Whip", 2,mainBeverage);
    }
}


