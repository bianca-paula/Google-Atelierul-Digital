package codechallenge3;

public class Cat extends Animal implements Pet{

   String name;
   public Cat(String name){
       super(4);
       this.name = name;
   }

   public Cat(){
       this("");
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
        System.out.println("Play like a Cat!");
    }

    @Override
    public void eat() {
       super.eat();
        System.out.print(" like a Cat! \n");
    }
}
