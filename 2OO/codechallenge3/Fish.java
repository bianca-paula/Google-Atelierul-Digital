package codechallenge3;


public class Fish extends Animal implements Pet{
    String name;

    public Fish(){
        super(0);
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name=name;
    }

    @Override
    public void play() {
        System.out.println("Play like a Fish!");
    }

    @Override
    public void walk(){
        System.out.println("Fish cannot walk!");
    }

    @Override
    public void eat() {
        super.eat();
        System.out.print(" like a Fish! \n");
    }
}
