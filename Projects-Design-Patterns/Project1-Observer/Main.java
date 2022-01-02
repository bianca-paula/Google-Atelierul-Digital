import observer.User;
import subject.YoutubeChannel;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("A");
        User user2 = new User("B");
        User user3 = new User("C");
        User user4 = new User("D");
        User user5 = new User("E");
        User[] users = {user1, user2,user3,user4,user5};

        YoutubeChannel youtubeChannel = new YoutubeChannel("The Film Theorists");

        for(User user: users){
            user.subscribe(youtubeChannel);
        }

        youtubeChannel.newPost("Film Theory: The Christmas CRIMES of Santa Claus");

        user3.unsubscribe(youtubeChannel);
        user5.unsubscribe(youtubeChannel);
        youtubeChannel.newPost("Film Theory: A New Theory");
    }

}


