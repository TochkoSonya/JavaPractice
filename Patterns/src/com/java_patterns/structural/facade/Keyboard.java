package com.java_patterns.structural.facade;

public class Keyboard implements Computer {
    @Override
    public void on() {
        System.out.println("Keyboard on");
    }
    @Override
    public void off() {
        System.out.println("Keyboard off");
    }
}
