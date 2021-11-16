package designpatterns.visitor;

public class TimeVisitor implements Visitor{

    private int time;
    @Override
    public void visit(Book book) {
        time+=book.getNumberOfPages()*4;
    }

    @Override
    public void visit(Video video) {
        time+=video.getTime();

    }

    @Override
    public void visit(Audio audio) {
        time+=audio.getTime();
    }

    @Override
    public String toString() {
        return "TimeVisitor{" +
                "time=" + time +
                '}';
    }
}
