package com.java_patterns.structural.adapter;

public class Airplane implements BaseAirplane {
    @Override
    public void startEngine() {
        System.out.println("Airplane start");
    }

    @Override
    public void takeoff() {
        System.out.println("Airplane take off");
    }

    @Override
    public void flight() {
        System.out.println("Airplane fly");
    }

    @Override
    public void landing() {
        System.out.println("Airplane land");
    }
}
