package com.application.services;

import com.application.interfaces.Speakers;
import com.application.interfaces.Tyres;
import com.application.model.Song;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class VehicleServices {

    @Autowired
    private Speakers speakers;
    private Tyres tyres;

    public void playMusic(Song song){
        speakers.makeSound(song);
    }

    public void moveVehicle(){
        tyres.rotate();
    }

    public void applyBrake () {
        tyres.stop();
    }

    public Speakers getSpeakers() {
        return speakers;
    }

    public void setSpeakers(Speakers speakers) {
        this.speakers = speakers;
    }

    public Tyres getTyres() {
        return tyres;
    }

    @Autowired
    public void setTyres(Tyres tyres) {
        this.tyres = tyres;
    }
}
