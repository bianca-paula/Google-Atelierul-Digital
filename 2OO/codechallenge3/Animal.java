package codechallenge3;

public abstract class Animal {
    protected int legs;

    protected Animal(int legs) {
        this.legs = legs;
    }


    public void eat(){
        System.out.print("Eat");
    }

    public void walk(){
        System.out.println("Animal walks with: " + this.legs + " legs");
    }






}
