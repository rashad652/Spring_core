package com.application;

import com.application.config.AppConfig;
import com.application.model.Song;
import com.application.services.VehicleServices;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CoreApplication {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(AppConfig.class);
        VehicleServices vehicleServices = context.getBean(VehicleServices.class);
        System.out.println(vehicleServices.getClass());

        var song = new Song();
        song.setTitle("Don't start now");
        song.setSingerName("Dua Lipa");

        vehicleServices.moveVehicle();
        vehicleServices.playMusic(song);
        vehicleServices.applyBrake();
    }
}
