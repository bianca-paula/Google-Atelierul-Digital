package designpatterns.visitor;

public class Audio implements Element{
    private String name;
    private int price;
    private int time;

    public Audio(String name, int price, int time) {
        this.name = name;
        this.price = price;
        this.time = time;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

    @Override
    public String toString() {
        return "Audio{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", time=" + time +
                '}';
    }
}
