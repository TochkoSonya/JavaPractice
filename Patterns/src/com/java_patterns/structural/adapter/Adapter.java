package com.java_patterns.structural.adapter;

public class Adapter implements BaseTrain {
    private BaseAirplane airplane;

    public Adapter(BaseAirplane airplane) {
        this.airplane=airplane;
    }

    @Override
    public void startEngine() {
        airplane.startEngine();
        airplane.takeoff();
    }

    @Override
    public void drive() {
        airplane.flight();
    }

    @Override
    public void braking() {
        airplane.landing();
    }

}
