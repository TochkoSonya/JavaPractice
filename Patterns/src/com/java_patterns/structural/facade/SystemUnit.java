package com.java_patterns.structural.facade;

public class SystemUnit implements Computer {
    @Override
    public void on() {
        System.out.println("System unit on");
    }
    @Override
    public void off() {
        System.out.println("System unit off");
    }
}
