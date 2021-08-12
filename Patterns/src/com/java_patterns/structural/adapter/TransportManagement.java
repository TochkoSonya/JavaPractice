package com.java_patterns.structural.adapter;

import com.java_patterns.structural.adapter.BaseTrain;

public class TransportManagement {
    private BaseTrain train;

    public TransportManagement(BaseTrain train) {
        this.train=train;
    }

    public void transport() {
        train.startEngine();
        train.drive();
        train.braking();
    }
}
