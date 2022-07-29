package com.application.implementation;

import com.application.interfaces.Speakers;
import com.application.model.Song;
import org.springframework.stereotype.Component;

@Component
public class BoseSpeakers implements Speakers {

    public void makeSound(Song song){
        System.out.println("Playing music: " + song.getTitle() + " played by " + song.getSingerName() +
                " with Bose speakers");
    }
}
