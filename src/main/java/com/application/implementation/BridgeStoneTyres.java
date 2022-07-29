package com.application.implementation;

import com.application.interfaces.Tyres;
import org.springframework.stereotype.Component;

@Component
public class BridgeStoneTyres implements Tyres {

    public void rotate(){
        System.out.println("Vehicle moving with BridgeStone tyres");
    }

    public void stop() {
        System.out.println("Vehicle stopped with the help of BridgeStone tyres");
    }
}
