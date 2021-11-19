package codechallenge1;

public class BoxingMatch {
    private Fighter fighter1;
    private Fighter fighter2;

    public BoxingMatch(Fighter fighter1, Fighter fighter2) {
        this.fighter1 = fighter1;
        this.fighter2 = fighter2;
    }

    public String fight(){
        String winner = "";
        while(fighter1.getHealth() >0 && fighter2.getHealth() > 0){
            fighter1.attack(fighter2);
            if(fighter2.getHealth() <= 0){
                winner = fighter1.getName();
                return winner;
            }
            fighter2.attack(fighter1);
            if(fighter1.getHealth() <= 0 ){
                winner = fighter2.getName();
                return winner;
            }
        }

        return "No winner";
    }
}
