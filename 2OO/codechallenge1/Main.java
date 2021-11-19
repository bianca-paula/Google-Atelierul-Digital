package codechallenge1;

public class Main {
    public static void main(String[] args) {
        Fighter fighter1 = new Fighter("Scott", 80, 20);
        Fighter fighter2 = new Fighter("John", 90, 30);
        BoxingMatch match = new BoxingMatch(fighter1,fighter2);
        System.out.println("The winner is: " + match.fight());

    }
}
