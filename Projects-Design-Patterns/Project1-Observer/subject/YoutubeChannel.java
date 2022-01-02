package subject;

import observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class YoutubeChannel implements Subject{
    private String name;
    private String post;
    private List<Observer> observers = new ArrayList<>();

    public YoutubeChannel(String name) {
        this.name = name;
    }

    public void newPost(String post){
        this.post = post;
        System.out.println("\n Channel " + this.name + " has made a new post: " + this.post + "\n");
        notifyObserver();
    }

    public String getName() {
        return name;
    }

    public String getPost() {
        return post;
    }

    @Override
    public void registerObserver(Observer o) {
        this.observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        this.observers.remove(o);
    }

    @Override
    public void notifyObserver() {
        for(Observer observer : this.observers)
            observer.update(this.getPost());
    }
}
