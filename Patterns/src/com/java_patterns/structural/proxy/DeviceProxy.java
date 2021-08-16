package com.java_patterns.structural.proxy;

public class DeviceProxy implements CommonInterface{
    private Device device= new Device();

    @Override
    public int deviceOn() {
        System.out.println("Device proxy on");
        return device.deviceOn();
    }

    @Override
    public int deviceOff() {
        System.out.println("Device proxy off");
        return device.deviceOff();
    }
}
