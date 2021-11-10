package designpatterns.decorator;

public abstract class Beverage {
    private String description;
    private int price;

    public Beverage(String description, int price) {
        this.description = description;
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public int getPrice() {
        return price;
    }
}

