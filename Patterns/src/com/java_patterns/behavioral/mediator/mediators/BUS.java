package com.java_patterns.behavioral.mediator.mediators;

import com.java_patterns.behavioral.mediator.components.*;

public class BUS implements Mediator {
    private CPU cpu;
    private IO io;
    private RAM ram;
    private ROM rom;

    @Override
    public void sendMessage(Component component, String message) {
        component.getName();
        component.recieveMessage(message);
    }

}
