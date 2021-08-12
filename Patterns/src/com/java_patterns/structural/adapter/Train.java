package com.java_patterns.structural.adapter;

import com.java_patterns.structural.adapter.BaseTrain;

public class Train implements BaseTrain {
   @Override
    public void startEngine() {
        System.out.println("Train start");
    }

    @Override
    public void drive() {
        System.out.println("Train drive");
    }

    @Override
    public void braking() {
        System.out.println("Train break");
    }
}
