package observer;

import subject.YoutubeChannel;

public class User implements Observer{
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void subscribe(YoutubeChannel ytchannel){
        ytchannel.registerObserver(this);
        System.out.println("\n" + this.name + " subscribes to " + ytchannel.getName());
    }

    public void unsubscribe(YoutubeChannel ytchannel){
        ytchannel.removeObserver(this);
        System.out.println("\n" + this.name + " unsubscribes " + ytchannel.getName());

    }

    @Override
    public void update(String post) {
        System.out.println(this.name + " got new post " + post);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
