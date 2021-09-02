package com.java_patterns.behavioral.template_method;

public abstract class Messenger {
    String userName;
    String password;

    Messenger() {}

    public void sendMessage() {
        System.out.println("Message sent");
    }
    public void receiveMessage() {
        System.out.println("Message received");
    }

    abstract void logIn();
    abstract void logOut();
}
