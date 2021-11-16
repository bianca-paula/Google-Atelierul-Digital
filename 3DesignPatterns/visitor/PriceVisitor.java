package designpatterns.visitor;

public class PriceVisitor implements Visitor{
    private  int totalPrice;
    @Override
    public void visit(Book book) {
        totalPrice+= book.getPrice();
    }

    @Override
    public void visit(Video video) {
        totalPrice+= video.getPrice();
    }

    @Override
    public void visit(Audio audio) {
        totalPrice+= audio.getPrice();

    }

    @Override
    public String toString() {
        return "PriceVisitor{" +
                "totalPrice=" + totalPrice +
                '}';
    }
}
