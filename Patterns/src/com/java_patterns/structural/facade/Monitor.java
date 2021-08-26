package com.java_patterns.structural.facade;

public class Monitor implements Computer {
   @Override
    public void on() {
        System.out.println("Monitor on");
    }
    @Override
    public void off() {
        System.out.println("Monitor off");
    }
}
