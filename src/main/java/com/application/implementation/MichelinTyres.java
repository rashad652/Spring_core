package com.application.implementation;

import com.application.interfaces.Tyres;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MichelinTyres implements Tyres {

    public void rotate(){
        System.out.println("Vehicle moving with Michelin tyres");
    }

    public void stop() {
        System.out.println("Vehicle stopped with the help of Michelin tyres");
    }

}
