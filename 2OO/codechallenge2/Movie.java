package codechallenge2;

public class Movie {
    private int releaseYear;
    private String name;
    private Actor[] actor;

    public Movie(int releaseYear, String name, Actor[] actor) {
        this.releaseYear = releaseYear;
        this.name = name;
        this.actor = actor;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Actor[] getActor() {
        return actor;
    }

    public void setActor(Actor[] actor) {
        this.actor = actor;
    }
}
