package com.java_patterns.behavioral.mediator.mediators;

import com.java_patterns.behavioral.mediator.components.Component;

public interface Mediator {
    void sendMessage(Component component, String message);
}

