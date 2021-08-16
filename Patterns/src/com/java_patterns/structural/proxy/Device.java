package com.java_patterns.structural.proxy;

public class Device implements CommonInterface {
    @Override
    public int deviceOn() {
        System.out.println("Device on");
        return 0;
    }

    @Override
    public int deviceOff() {
        System.out.println("Device off");
        return 0;
    }

}
