package com.java_patterns.structural.facade;

public class Facade {
    private SystemUnit unit;
    private Monitor monitor;
    private Keyboard keyboard;

    public Facade() {
        unit=new SystemUnit();
        monitor=new Monitor();
        keyboard= new Keyboard();
    }

    public void computerOn() {
        unit.on();
        monitor.on();
        keyboard.on();
    }
    public void computerOff() {
        unit.off();
        monitor.off();
        keyboard.off();
    }
}
