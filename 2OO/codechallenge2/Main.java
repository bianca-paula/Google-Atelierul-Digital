package codechallenge2;

public class Main {

    public static void printMoviesInWhichActorsAbove50Play(Studio[] studios){
        String[] toReturn = new String[10];
        int i=0;
        int j=0;

        for(Studio currentStudio : studios){
            for(Movie currentMovie: currentStudio.getMovies()){
                for(Actor currentActor: currentMovie.getActor()){
                    if(currentActor.getAge() > 50){
                        System.out.println(currentMovie.getName());
                        break;
                    }
                }
            }
        }
    }

    public static String[] printStudiosInWhichActorPlays(Studio[] studios, String numeActor){
        String[] toReturn = new String[10];
        int i=0;
        int j=0;
        for(Studio currentStudio: studios){
            for(Movie currentMovie: currentStudio.getMovies()){
                for(Actor currentActor: currentMovie.getActor()){
                    if(currentActor.getName().equals(numeActor)){
                        toReturn[i]=currentStudio.getName();
                        i++;
                        break;
                    }
                }
                if(i>j){
                    j=i;
                    break;
                }
            }
        }
        return toReturn;
    }

    public static void printStudiosWithMoreThanTwoMovies(Studio[] studios){
        for(Studio currentStudio : studios){
            if(currentStudio.getMovies().length > 2){
                System.out.println(currentStudio.getName());
            }
        }
    }

    public static void main(String[] args){
        Prize oscar1990 = new Prize("Oscar",1990);
        Prize oscar2000 = new Prize("Oscar",2000);
        Prize oscar2010 = new Prize("Oscar",2010);
        Prize oscar2018 = new Prize("Oscar",2018);

        Actor actorOscar1990 = new Actor("Actor cu 2 oscaruri", 35, new Prize[]{oscar1990, oscar2000});
        Actor actorOscar2010 = new Actor("Actor cu oscar 2010", 55, new Prize[]{oscar2010});
        Actor actorOscar2018 = new Actor("Actor cu oscar 2018", 23, new Prize[]{oscar2018});
        Actor actorFaraPremiu01 = new Actor("Actor fara oscar 01", 33, new Prize[]{});
        Actor actorFaraPremiu02 = new Actor("Actor fara oscar 02", 60, new Prize[]{});
        Actor actorFaraPremiu03 = new Actor("Actor fara oscar 03", 30, new Prize[]{});

        Movie film1 = new Movie(1990, "Film cu actori de oscar", new Actor[]{actorOscar1990,actorFaraPremiu01});
        Movie film2 = new Movie(2010, "Film cu actori fara premii", new Actor[]{actorFaraPremiu01,actorFaraPremiu02,actorFaraPremiu03});
        Movie film3 = new Movie(2010, "Film cu actori fara premii 3", new Actor[]{actorFaraPremiu01,actorFaraPremiu02,actorFaraPremiu03});
        Movie film4 = new Movie(2010, "Film cu actori fara premii 4", new Actor[]{actorFaraPremiu01,actorFaraPremiu02,actorFaraPremiu03});
        Movie film5 = new Movie(2018, "Film cu actori fara premii 5", new Actor[]{actorFaraPremiu01,actorFaraPremiu02,actorFaraPremiu03});

        Studio studio1 = new Studio("MGM", new Movie[]{film1,film2});
        Studio studio2 = new Studio("Disney", new Movie[]{film3, film4, film5});

        Studio[] studioDatabase = new Studio[]{studio1,studio2};
        System.out.println("Studios with more than two movies: ");
        printStudiosWithMoreThanTwoMovies(studioDatabase);

        System.out.println("Studios in which actor Actor cu 2 oscaruri plays: ");
        String result[] = printStudiosInWhichActorPlays(studioDatabase, "Actor cu 2 oscaruri");
        for (String currentStudioName: result){
            if(currentStudioName != null) {
                System.out.println(currentStudioName);
            }
        }

        System.out.println("Movies with at least one actor above 50: ");
        printMoviesInWhichActorsAbove50Play(studioDatabase);


    }

}
