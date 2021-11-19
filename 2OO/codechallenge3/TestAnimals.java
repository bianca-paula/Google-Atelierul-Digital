package codechallenge3;

public class TestAnimals {
    public static void main(String[] args) {
        Fish d = new Fish();
        Cat c = new Cat("Fluffy");
        Spider s = new Spider();
        Animal a = new Fish();
        Animal e = new Spider();
        Pet p = new Cat();

        System.out.println("Fish Info: ");
        d.play();
        d.walk();
        d.eat();

        System.out.println("Cat Info: ");
        c.play();
        c.walk();
        c.eat();

        System.out.println("Spider Info: ");
        s.walk();
        s.eat();

        System.out.println("Animal Fish Info: ");
        a.walk();
        a.eat();

        System.out.println("Animal Spider Info: ");
        e.walk();
        e.eat();

        System.out.println("Pet Cat Info: ");
        p.play();

    }
}
