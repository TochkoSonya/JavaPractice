package com.java_patterns.behavioral.mediator.components;

import com.java_patterns.behavioral.mediator.mediators.Mediator;

public class IO implements Component {
    private Mediator mediator;

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator=mediator;
    }

    @Override
    public void recieveMessage(String message) {
        System.out.println("Message recieved by IO: " + message);
    }

    @Override
    public String getName() {
        return "IO";
    }
}
