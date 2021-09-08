package com.java_patterns.behavioral.mediator.components;

import com.java_patterns.behavioral.mediator.mediators.Mediator;

public interface Component {
    void setMediator(Mediator mediator);
    void recieveMessage(String message);
    String getName();
}
